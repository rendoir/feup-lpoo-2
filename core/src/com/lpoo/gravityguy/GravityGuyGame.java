package com.lpoo.gravityguy;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;

public class GravityGuyGame extends ApplicationAdapter {

	@Override
	public void create () {

	}

	@Override
	public void render () {
		Gdx.gl.glClearColor(1, 0, 0, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

	}
	
	@Override
	public void dispose () {
		
	}
}