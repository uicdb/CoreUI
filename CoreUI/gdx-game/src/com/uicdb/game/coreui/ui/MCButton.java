package com.uicdb.game.coreui.ui;
import com.badlogic.gdx.scenes.scene2d.ui.*;
import com.uicdb.game.coreui.objects.*;
import com.badlogic.gdx.graphics.*;

public class MCButton extends TextButton
{
	public MCButton(String text,int x,int y,int w,int h){
		super(text,new MCButtonStyle(Color.BLACK,25,w,h));
		setBounds(x,y,w,h);
	}
	public static class MCButtonStyle extends TextButton.TextButtonStyle{
		public MCButtonStyle(Color fontColor,int fontSize){
			super(AssetLoader.loadUINinePatchDrawable("pocket_button_default.png",1),AssetLoader.loadUINinePatchDrawable("pocket_button_pressed.png",1),AssetLoader.loadUINinePatchDrawable("pocket_button_hover.png",1),SimpleFont.getFont(fontColor,fontSize));
		}
		public MCButtonStyle(Color fontColor,int fontSize,int w,int h){
			super(AssetLoader.loadUINinePatchDrawable("pocket_button_default.png",w,h,1),AssetLoader.loadUINinePatchDrawable("pocket_button_pressed.png",w,h,1),AssetLoader.loadUINinePatchDrawable("pocket_button_hover.png",w,h,1),SimpleFont.getFont(fontColor,fontSize));
		}
	}
}
