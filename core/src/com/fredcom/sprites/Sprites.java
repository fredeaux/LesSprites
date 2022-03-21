package com.fredcom.sprites;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;

public class Sprites extends Sprite {

    Texture texture;
    int X;
    int Y;
    int width;
    int height;

    String name;

    public String getName() {
        return name;
    }


    public Sprites(String name, Texture texture, int X, int Y, int width, int height)
    {
        super(texture);

        this.texture = texture;
        this.X = X;
        this.Y = Y;
        this.width = width;
        this.height = height;
        this.setPosition(this.X, this.Y);
        this.setSize(this.width, this.height);
        this.setCenter(X ,Y );
        this.name = name;

    }


}
