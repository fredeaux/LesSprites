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
	Sprites avocat;
	Sprites banane;
	Sprites orange;
	Sprites pasteque;
	Sprites rhubarbe;

	ShapeRenderer sr;
	
	@Override
	public void create () {
		batch = new SpriteBatch();
		GAME_WIDTH = Gdx.graphics.getWidth();
		GAME_HEIGHT = Gdx.graphics.getHeight();
		assets = new Assets();
		avocat = new Sprites(Assets.avocat, (int)GAME_WIDTH / 2, (int)GAME_HEIGHT / 2, 128, 128);
		banane = new Sprites(Assets.banane, (int)GAME_WIDTH / 2, (int)GAME_HEIGHT / 2 + 128, 128, 128);
		orange = new Sprites(Assets.orange, (int)GAME_WIDTH / 2 - 128, (int)GAME_HEIGHT / 2, 128, 128);
		pasteque = new Sprites(Assets.pasteque, (int)GAME_WIDTH / 2 + 128, (int)GAME_HEIGHT / 2, 128, 128);
		rhubarbe = new Sprites(Assets.rhubarbe, (int)GAME_WIDTH / 2, (int)GAME_HEIGHT / 2 - 128, 128, 128);

		sr = new ShapeRenderer();
		sr.setColor(Color.WHITE);
	}

	@Override
	public void render () {
		ScreenUtils.clear(0.5f, 0.5f, 0.5f, 1);
		//Dessin de lignes
		sr.begin(ShapeRenderer.ShapeType.Line);
		sr.line(0, 300, 800, 300);
		sr.line(400,0,400,600);
		sr.end();
		batch.begin();
		batch.setColor(1,1,1,0.4f);
		batch.draw(Assets.background, 0, 0);
		batch.setColor(1,1,1,1);
		avocat.draw(batch);
		banane.draw(batch);
		orange.draw(batch);
		pasteque.draw(batch);
		rhubarbe.draw(batch);
		batch.end();
	}
	
	@Override
	public void dispose () {
		batch.dispose();
		Assets.am.dispose();

	}
}
