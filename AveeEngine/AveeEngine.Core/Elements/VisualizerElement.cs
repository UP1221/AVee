namespace AveeEngine.Core.Elements;

public abstract class VisualizerElement
{
    public string ObjType { get; set; } = "";
    public List<VisualizerElement> Children { get; } = new();

    public virtual void Update(float dt) { }

    public virtual void Render()
    {
        foreach (var child in Children)
            child.Render();
    }
}
