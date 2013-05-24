package com.english.route66;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;

public class Main {
	public static void main(String[] Wargs) {
		LwjglApplicationConfiguration cfg = new LwjglApplicationConfiguration();
		cfg.title = "Route66";
		cfg.useGL20 = false;
		cfg.width = 480;
		cfg.height = 320;

		new LwjglApplication(new Route66(), cfg);

	}

}
