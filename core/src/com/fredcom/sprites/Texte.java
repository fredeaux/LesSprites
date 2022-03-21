package com.fredcom.sprites;

import com.badlogic.gdx.graphics.g2d.BitmapFont;

public class Texte extends BitmapFont {

    String texte;
    int X;
    int Y;


    public Texte(String texte, int x, int y)
    {
        this.texte = texte;
        this.X = x;
        this.Y = y;
    }

    public int X()
    {
        return  this.X;
    }

    public int Y()
    {
        return  this.Y;
    }

    public String texte()
    {
        return this.texte;
    }

    public void taille(float scaleX, float scaleY)
    {
        this.getData().setScale(scaleX, scaleY);
    }





}
