import processing.core.PApplet;
import processing.core.PVector;

import java.util.ArrayList;

/**
 * Created by Llama on 10/03/2015.
 */
public class Game {
    private PApplet parent;

    Game(PApplet par){
        parent = par;
    }

    private enum gameState {
        MENU, PAUSED, PLAYING, EXIT
    }
    private gameState _state;

    private ObjectManager manager;
    private Player player;


    private void ShowMenu(){

    }

    public void Start(){
       _state = gameState.PLAYING;
        manager = new ObjectManager(parent);
        manager.start();

        player = new Player(parent, new PVector(30,30), new PVector(300,100));
        manager.add(player);
        for(int i = 0; i < 100; i ++)
        {
            DestructibleTile temp = new DestructibleTile(parent, new PVector(10,10), new PVector((i%10)*14, ((int)i/10)*14 ));
            manager.add(temp);
        }


    }
    public void GameLoop() {

        switch(_state)
        {
            case PLAYING:
            {
                parent.background(18,41,72);
                manager.update();
                manager.draw();

            }
        }
    }

    public boolean IsRunning()
    {
        if(_state != gameState.EXIT)
        {
            return true;
        }
        else
        {
            return false;
        }
    }




}
