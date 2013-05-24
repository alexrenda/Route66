package com.english.route66;

import com.badlogic.gdx.scenes.scene2d.Event;
import com.badlogic.gdx.scenes.scene2d.EventListener;

/**
 * An utility {@link ActorListener} class.
 * <p>
 * Defines the {@link #touchDown(ActorEvent, float, float, int, int)} method
 * returning <code>true</code> by default, so the
 * {@link #touchDown(ActorEvent, float, float, int, int)} method gets invoked.
 */
public abstract class DefaultActorListener implements EventListener {

	@Override
	public boolean handle(Event event) {
		System.out.println("pressed");
		return true;
	}

}