package com.english.route66;

import java.util.Iterator;
import java.util.LinkedList;

import javax.imageio.ImageIO;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.scenes.scene2d.ui.Table;
import com.badlogic.gdx.scenes.scene2d.ui.TextButton;
import com.badlogic.gdx.scenes.scene2d.utils.Align;

public class Dialog extends AbstractScreen {
	private String prompt;
	private LinkedList<Choice> choices;

	public Dialog(Route66 game, String prompt, Texture background) {
		super(game, background);
		this.prompt = prompt;
		choices = new LinkedList<Choice>();

	}

	public void addChoice(Choice choice) {
		choices.add(choice);
	}

	@Override
	public void show() {
		super.show();

		// retrieve the default table actor
		Table table = super.getTable();

		table.add(prompt).spaceBottom(50).align(Align.right);
		table.row();
		table.row();
		table.row();
		Iterator<Choice> it = choices.iterator();
		int x = 0;
		while (it.hasNext()) {
			Choice choice = it.next();
			if (choices.size() % 2 == 0) {
				if (x % 2 == 0) {
					addButton(table, choice);
				} else {

					addButton(table, choice);
					table.row();
				}
			} else {
				addButton(table, choice);
				table.row();
			}
			x++;
		}
	}

	private void addButton(Table table, Choice choice) {
		TextButton button = new TextButton(choice.getText(), getSkin());
		// button.set
		// BuffI
		table.add(button).size(300, 90).uniform().spaceBottom(10);

	}
}
