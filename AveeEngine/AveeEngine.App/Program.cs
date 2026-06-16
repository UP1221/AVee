using System.Text.Json;

if (args.Length == 0)
{
    Console.WriteLine("No preset specified");
    return;
}

var doc = JsonDocument.Parse(File.ReadAllText(args[0]));

PrintElement(doc.RootElement, "");

static void PrintElement(JsonElement element, string indent)
{
    switch (element.ValueKind)
    {
        case JsonValueKind.Object:
            foreach (var p in element.EnumerateObject())
            {
                Console.WriteLine($"{indent}{p.Name} : {p.Value.ValueKind}");
                PrintElement(p.Value, indent + "  ");
            }
            break;

        case JsonValueKind.Array:
            Console.WriteLine($"{indent}[{element.GetArrayLength()} items]");
            if (element.GetArrayLength() > 0)
                PrintElement(element[0], indent + "  ");
            break;
    }
}
