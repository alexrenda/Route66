package com.english.route66;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.scenes.scene2d.Event;
import com.badlogic.gdx.scenes.scene2d.EventListener;


public class Choice implements EventListener {
	private String text;
	private Dialog result;

	public Choice(String text, Dialog result) {
		super();
		this.text = text;
		this.result = result;
	}

	public String getText() {
		return text;
	}

	@Override
	public boolean handle(Event event) {
		
		return false;
	}

	
}
