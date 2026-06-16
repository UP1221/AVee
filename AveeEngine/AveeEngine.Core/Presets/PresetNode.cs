namespace AveeEngine.Core.Presets;

public class PresetNode
{
    public string ObjType { get; set; } = "";
    public List<PresetNode> Children { get; set; } = new();
}
