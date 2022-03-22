package com.fredcom.sprites;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;

import java.awt.*;

public class Sprites extends Sprite {

    Texture texture;
    int X;
    int Y;
    int width;
    int height;
    double angle;

    String name;

    public String getName() {
        return name;
    }


    public Sprites(String name, Texture texture, int X, int Y, int width, int height)
    {
        super(texture);

        this.texture = texture;
        this.X = X - 64;
        this.Y = Y - 64;
        this.width = width;
        this.height = height;
        this.setPosition(this.X, this.Y);
        this.setSize(this.width, this.height);
        this.setOriginCenter();
        this.name = name;

    }


    public void rotation(double inputAngle)
    {

        Point pSprite = new Point(X, Y);
        Point center = new Point(400-64, 300-64);
        double xM, yM, x, y;
        angle = inputAngle;


        angle *= Math.PI / 180;
        xM = pSprite.x - center.x;
        yM = pSprite.y - center.y;
        x = xM * Math.cos (angle) + yM * Math.sin (angle) + center.x;
        y = - xM * Math.sin (angle) + yM * Math.cos (angle) + center.y;




        X = (int)Math.round (x);
        Y = (int)Math.round (y);
        this.setPosition(X, Y);



    }


}
