package com.uicdb.game.coreui.stages;
import com.badlogic.gdx.scenes.scene2d.*;
import com.badlogic.gdx.utils.viewport.*;
import com.badlogic.gdx.*;
import com.badlogic.gdx.graphics.*;
import com.badlogic.gdx.graphics.g2d.*;

public class BaseStage extends Stage
{
	public static int defaultWidth=16*10;
	public BaseStage(){
		super(new StretchViewport(defaultWidth,height(defaultWidth)));
	}
	public BaseStage(int w){
		super(new StretchViewport(w,height(w)));
	}
	public BaseStage(int w,int h){
		super(new StretchViewport(w,h));
	}
	public BaseStage(int w,SpriteBatch batch){
		super(new StretchViewport(w,height(w)),batch);
	}
	public void moveCameraBy(float x,float y){
		OrthographicCamera camera=(OrthographicCamera) getCamera();
		//camera.position.set(camera.position.x+x,camera.position.y+y,0);
		camera.translate(x,y);
		//camera.update(true);
	}
	public void moveCameraTo(float x,float y){
		OrthographicCamera camera=(OrthographicCamera) getCamera();
		camera.position.set(x+camera.viewportWidth/2,y+camera.viewportHeight/2,0);
		camera.update(true);
	}

	@Override
	public void draw()
	{
		super.draw();
		//getCamera().update();
	}
	
	public static int height(int width){
		float scale=((float)Gdx.graphics.getHeight())/(float)Gdx.graphics.getWidth();
		return Math.round(scale*width);
	}
	public static int width(int height){
		float scale=((float)Gdx.graphics.getWidth())/(float)Gdx.graphics.getHeight();
		return Math.round(scale*height);
	}
}
