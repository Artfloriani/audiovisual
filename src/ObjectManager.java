import processing.core.PApplet;
import processing.core.PVector;

import java.util.ArrayList;

/**
 * Created by Llama on 10/03/2015.
 */
public class ObjectManager {
    private ArrayList<VisibleObject> _gameObjects = new ArrayList<VisibleObject>();

    private PApplet parent;
    ObjectManager(PApplet par)
    {
        parent = par;
    }

    public void start() {

    }

    public void draw()
    {
        for(int i = 0; i < _gameObjects.size(); i++) {
            _gameObjects.get(i).draw();
        }

    }

    public void update(){
        for(int i = 0; i < _gameObjects.size(); i++) {
            _gameObjects.get(i).update();
        }
    }

    public void add(VisibleObject obj){
        _gameObjects.add(obj);
    }

    public void remove(VisibleObject obj){
        _gameObjects.remove(obj);
    }



}
