package com.uicdb.game.coreui;

import com.badlogic.gdx.*;
import com.badlogic.gdx.scenes.scene2d.*;
import com.badlogic.gdx.utils.*;
import com.uicdb.game.coreui.objects.*;
import com.uicdb.game.coreui.stages.*;
import javax.microedition.khronos.opengles.*;

public class SimpleGame extends Game
{
	
	public static AssetLoader assetLoader;
	private  static SimpleGame  instance;
	static MainScreen mainScreen;
	public static SimpleGame getInstance(){
		return instance;
	}
	
	public SimpleGame(){
		this.instance=this;
	}
	@Override
	public void create()
	{
		assetLoader=new AssetLoader();
		this.mainScreen=new MainScreen();
		setScreen(mainScreen);
	}

	
	@Override
	public void render()
	{
		super.render();
	}

	@Override
	public void dispose()
	{
		super.dispose();
		assetLoader.getAssetManager().dispose();
	}
	
}
