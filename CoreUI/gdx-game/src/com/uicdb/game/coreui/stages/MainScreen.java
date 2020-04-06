package com.uicdb.game.coreui.stages;
import com.badlogic.gdx.graphics.g2d.*;
import com.uicdb.game.coreui.objects.*;
import com.badlogic.gdx.graphics.*;
import com.badlogic.gdx.scenes.scene2d.ui.*;
import com.badlogic.gdx.utils.*;
import com.uicdb.game.coreui.ui.*;

public class MainScreen extends BaseScreen
{
    BitmapFont font;
	Texture background;
	public MainScreen(){
		super();
		font=SimpleFont.getFont(Color.BLACK);
		background=new Texture(PixmapUtil.color(Color.RED));
	   MCButton mcb=new MCButton("这是按钮",100,100,380,150);
		MCImg mcimg=new MCImg(AssetLoader.loadUINinePatchDrawable("pocket_button_default.png",200,200,1),200,200,200,200);
		
	   getRenderStage().addActor(mcb);
	   getRenderStage().addActor(mcimg);
	}
	@Override
	public void show()
	{
		super.show();
	}

	@Override
	public void render(float delta)
	{
		getRenderStage().getBatch().begin();
		getRenderStage().getBatch().draw(background,0,0,1000,1000);
		getRenderStage().getBatch().end();
		super.render(delta);
	}
	
}
