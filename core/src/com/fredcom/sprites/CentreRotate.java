package com.fredcom.sprites;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;

public class CentreRotate extends Sprite {


    public CentreRotate(Texture texture, int X, int Y)
    {
       super(texture);

        this.setPosition(X, Y);
    }

    public void rotate()
    {
        this.setOrigin(50,50);
        this.setBounds(400,300,64,64);
        this.rotate(-10);
    }



}
