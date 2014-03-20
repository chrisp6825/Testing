package com.chrisp6825.testing;

import com.badlogic.gdx.Game;
import com.chrisp6825.testing.examples.RunnerScreen;

public class MainClass extends Game {

	@Override
	public void create() {
		this.setScreen(new RunnerScreen());
	}

	@Override
	public void resize(int width, int height) {
		super.resize(width, height);
	}

	@Override
	public void render() {
		super.render();
	}

	@Override
	public void pause() {
		super.pause();
	}

	@Override
	public void resume() {
		super.resume();
	}

	@Override
	public void dispose() {
		super.dispose();
	}
	
}