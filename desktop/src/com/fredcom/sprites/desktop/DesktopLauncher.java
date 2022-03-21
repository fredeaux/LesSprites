package com.fredcom.sprites.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.fredcom.sprites.MainGame;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		new LwjglApplication(new MainGame(), config);

		config.width = 800;
		config.height = 600;
		config.resizable = false;
		config.title = "LES SPRITES !!";
		config.vSyncEnabled = true;

	}
}
