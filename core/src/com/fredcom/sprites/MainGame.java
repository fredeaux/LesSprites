package com.fredcom.sprites;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.badlogic.gdx.utils.ScreenUtils;

public class MainGame extends ApplicationAdapter {
	SpriteBatch batch;
	public static float GAME_WIDTH;
	public static float GAME_HEIGHT;
	Assets assets;
	Avocat avocat;
	ShapeRenderer sr;
	
	@Override
	public void create () {
		batch = new SpriteBatch();
		GAME_WIDTH = Gdx.graphics.getWidth();
		GAME_HEIGHT = Gdx.graphics.getHeight();
		assets = new Assets();
		System.out.println("Largeur: " + (int)GAME_WIDTH/2 + " Hauteur: " + (int)GAME_HEIGHT/2);
		avocat = new Avocat(new Texture("avocat.png"), (int)GAME_WIDTH / 2, (int)GAME_HEIGHT / 2, 128, 128);
		sr = new ShapeRenderer();
		sr.setColor(Color.WHITE);
	}

	@Override
	public void render () {
		ScreenUtils.clear(0, 0, 0, 1);
		//Dessin de lignes
		sr.begin(ShapeRenderer.ShapeType.Line);
		sr.line(0, 300, 800, 300);
		sr.line(400,0,400,600);
		sr.end();
		batch.begin();
		avocat.draw(batch);
		batch.end();
	}
	
	@Override
	public void dispose () {
		batch.dispose();
		Assets.am.dispose();

	}
}
