package com.fredcom.sprites;

import com.badlogic.gdx.assets.AssetManager;
import com.badlogic.gdx.graphics.Texture;

public class Assets {

    public static AssetManager am;
    public static Texture avocat;



    public Assets()
    {
        am = new AssetManager();
        load();
        get();
    }

    private void load()
    {
        am.load("avocat.png", Texture.class);
        am.finishLoading();
    }

    private void get()
    {
        avocat = am.get("avocat.png");
    }

    public void dispose()
    {

    }




}
