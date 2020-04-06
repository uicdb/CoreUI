package com.uicdb.game.coreui.ui;
import com.badlogic.gdx.scenes.scene2d.ui.*;
import com.badlogic.gdx.graphics.g2d.*;
import com.badlogic.gdx.scenes.scene2d.utils.*;

public class MCImg extends Widget
{
	Drawable drawable;
	public MCImg(Drawable drawable){
		this.drawable=drawable;
	}

	public MCImg(Drawable drawable,int x,int y,int w,int h){
		this.drawable=drawable;
		setBounds(x,y,w,h);
	}
	@Override
	public void draw(Batch batch, float parentAlpha)
	{
		super.draw(batch, parentAlpha);
		drawable.draw(batch,getX(),getY(),getWidth(),getHeight());
	}
	
}
