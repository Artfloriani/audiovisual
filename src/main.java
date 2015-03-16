/**
 * Created by Llama on 10/03/2015.
 */

import processing.core.PApplet;

public class main  extends PApplet{
    private Game _game;
    private int color = 0;
    public void setup()
    {
        size(800,500);
        _game = new Game(this);
        _game.Start();
    }


    public void loop()
    {
        if(_game.IsRunning())
        {
            _game.GameLoop();
            //teste
        }
    }


    public void draw()
    {
        loop();
    }
}
