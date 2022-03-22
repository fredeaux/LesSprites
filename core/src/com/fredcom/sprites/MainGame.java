package com.fredcom.sprites;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.badlogic.gdx.utils.ScreenUtils;

import java.util.ArrayList;

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
	ArrayList<Sprites> listeSprites;
	BitmapFont font;
	String texteAAfficher = "";
	Texte affichageTexte;
	CentreRotate spriteRotate;
	int distance = 180;
	int deplaceSprite = 5;
	double angle;







	int i = 0;
	int memoSpriteClique = 0;

	int mouseX;
	int mouseY;

	
	@Override
	public void create () {
		batch = new SpriteBatch();
		GAME_WIDTH = Gdx.graphics.getWidth();
		GAME_HEIGHT = Gdx.graphics.getHeight();
		assets = new Assets();
		avocat = new Sprites("Avocat", Assets.avocat, (int)GAME_WIDTH / 2, (int)GAME_HEIGHT / 2, 128, 128);
		banane = new Sprites("Banane", Assets.banane, (int)GAME_WIDTH / 2, (int)GAME_HEIGHT / 2 + distance, 128, 128);
		orange = new Sprites("Orange", Assets.orange, (int)GAME_WIDTH / 2 - distance, (int)GAME_HEIGHT / 2, 128, 128);
		pasteque = new Sprites("Pasteque", Assets.pasteque, (int)GAME_WIDTH / 2 + distance, (int)GAME_HEIGHT / 2, 128, 128);
		rhubarbe = new Sprites("Rhubarbe", Assets.rhubarbe, (int)GAME_WIDTH / 2, (int)GAME_HEIGHT / 2 - distance, 128, 128);
		listeSprites = new ArrayList<>();
		font = new BitmapFont();
		affichageTexte = new Texte(texteAAfficher, 50, 550);
		affichageTexte.taille(2f, 2f);
		spriteRotate = new CentreRotate(Assets.rhubarbe, 400, 300);

		listeSprites.add(avocat);
		listeSprites.add(banane);
		listeSprites.add(orange);
		listeSprites.add(pasteque);
		listeSprites.add(rhubarbe);

		sr = new ShapeRenderer();
		sr.setColor(Color.WHITE);
		int key = 0;









	}



	@Override
	public void render () {

		//Update
		mouseX = Gdx.input.getX();
		mouseY = 600 - Gdx.input.getY();



		if(Gdx.input.isButtonJustPressed(Input.Buttons.LEFT))
		{
			texteAAfficher = "";
			memoSpriteClique = i =0;

			for(Sprites s: listeSprites)
			{

				if(mouseX > s.X  && mouseX < s.X + 128 && mouseY > s.Y  && mouseY < s.Y + 128)
				{
					memoSpriteClique = i;
					texteAAfficher = s.name;
				}
				i++;
			}

		}

		if(Gdx.input.isKeyPressed(Input.Keys.SPACE))
		{
			angle = 2;

			if(Gdx.input.isKeyPressed(Input.Keys.CONTROL_LEFT))
			{
				angle = 0.5;
			}

			listeSprites.get(memoSpriteClique).rotation(angle);

		}

		if(Gdx.input.isKeyPressed(Input.Keys.NUMPAD_ADD))
		{

			i = 0;

			for(Sprites sp: listeSprites)
			{

				switch (i)
				{
					case 1: sp.setPosition(banane.X, banane.Y += deplaceSprite);
					break;
					case 2: sp.setPosition(orange.X -= deplaceSprite, orange.Y);
					break;
					case 3 : sp.setPosition(pasteque.X += deplaceSprite, pasteque.Y);
					break;
					case 4: sp.setPosition(rhubarbe.X, rhubarbe.Y -= deplaceSprite);

				}

				i++;

			}
		}

		if(Gdx.input.isKeyPressed(Input.Keys.NUMPAD_SUBTRACT))
		{

			if(Gdx.input.isKeyPressed(Input.Keys.CONTROL_LEFT))
			{
				deplaceSprite = 1;
			}
			else
			{
				deplaceSprite = 5;
			}


			i = 0;
			for(Sprites sp: listeSprites)
			{

				switch (i)
				{
					case 1: sp.setPosition(banane.X, banane.Y -= deplaceSprite);
						break;
					case 2: sp.setPosition(orange.X += deplaceSprite, orange.Y);
						break;
					case 3 : sp.setPosition(pasteque.X -= deplaceSprite, pasteque.Y);
						break;
					case 4: sp.setPosition(rhubarbe.X, rhubarbe.Y += deplaceSprite);

				}

				i++;

			}
		}







		//Draw
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
		affichageTexte.draw(batch, texteAAfficher, affichageTexte.X(), affichageTexte.Y());
		batch.end();
	}




	
	@Override
	public void dispose () {
		batch.dispose();
		Assets.am.dispose();
		font.dispose();
	}
}
