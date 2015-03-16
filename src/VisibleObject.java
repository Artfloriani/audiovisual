import processing.core.PApplet;
import processing.core.PVector;

/**
 * Created by Llama on 10/03/2015.
 */
public class VisibleObject {

    protected PApplet parent;
    protected PVector position;
    protected PVector size;


    public VisibleObject(PApplet par)
    {
        parent = par;
    }

    public void draw()
    {
        parent.rect(position.x, position.y, size.x, size.y);
    }

    public void update()
    {

    }



}
