package snake_game;

import org.newdawn.slick.Color;

/**
 * Created by john on 14/03/2017.
 */
public class TasteGood implements TasteBehavior {


    public Color taste_color = Color.green;
    @Override
    public int eat() {
        return 1;
    }
    @Override
    public Color getTasteColor(){
        return taste_color;
    }
}