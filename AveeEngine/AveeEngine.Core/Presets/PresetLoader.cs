using System.Text.Json;

namespace AveeEngine.Core.Presets;

public static class PresetLoader
{
    public static JsonDocument Load(string file)
    {
        return JsonDocument.Parse(File.ReadAllText(file));
    }
}
