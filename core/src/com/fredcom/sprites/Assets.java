package com.fredcom.sprites;

import com.badlogic.gdx.assets.AssetManager;
import com.badlogic.gdx.graphics.Texture;

public class Assets {

    public static AssetManager am;
    public static Texture background;
    public static Texture avocat;
    public static Texture banane;
    public static Texture orange;
    public static Texture pasteque;
    public static Texture rhubarbe;



    public Assets()
    {
        am = new AssetManager();
        load();
        get();
    }

    private void load()
    {
        am.load("BackGround_Fruit.png", Texture.class);
        am.load("avocat.png", Texture.class);
        am.load("banane.png", Texture.class);
        am.load("orange.png", Texture.class);
        am.load("pasteque.png", Texture.class);
        am.load("rhubarbe.png", Texture.class);
        am.finishLoading();
    }

    private void get()
    {
        background = am.get("BackGround_Fruit.png");
        avocat = am.get("avocat.png");
        banane = am.get("banane.png");
        orange = am.get("orange.png");
        pasteque = am.get("pasteque.png");
        rhubarbe = am.get("rhubarbe.png");
    }

    public void dispose()
    {

    }




}
