namespace AveeEngine.Core.Elements;

public class Image : VisualizerElement
{
    public string Texture { get; set; } = "";

    public Image()
    {
        ObjType = "Image";
    }
}
