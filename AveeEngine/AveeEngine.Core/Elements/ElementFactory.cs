namespace AveeEngine.Core.Elements;

public static class ElementFactory
{
    public static VisualizerElement Create(string objType)
    {
        return objType switch
        {
            "Bars" => new Bars(),
            "Image" => new Image(),
            "Particles" => new Particles(),
            _ => throw new Exception($"Unknown element: {objType}")
        };
    }
}
