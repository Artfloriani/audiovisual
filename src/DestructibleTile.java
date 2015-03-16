import processing.core.PApplet;
import processing.core.PVector;

/**
 * Created by Llama on 10/03/2015.
 */
public class DestructibleTile extends VisibleObject{

    public DestructibleTile(PApplet par, PVector siz, PVector pos) {
        super(par);
        position = pos;
        size = siz;
    }
}
