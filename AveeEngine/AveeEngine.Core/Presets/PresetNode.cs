namespace AveeEngine.Core.Presets;

public class PresetNode
{
    public string ObjType { get; set; } = "";

    public Dictionary<string,string> Properties
        { get; } = new();

    public List<PresetNode> Children
        { get; } = new();
}
