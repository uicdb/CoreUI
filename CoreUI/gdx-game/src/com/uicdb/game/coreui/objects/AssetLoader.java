package com.uicdb.game.coreui.objects;
import com.badlogic.gdx.*;
import com.badlogic.gdx.assets.*;
import com.badlogic.gdx.graphics.*;
import com.badlogic.gdx.utils.*;
import com.badlogic.gdx.scenes.scene2d.utils.*;
import com.badlogic.gdx.graphics.g2d.*;

public class AssetLoader
{
	static AssetManager assetManager;
	
	public static AssetManager getAssetManager()
	{
		return assetManager==null?assetManager=new AssetManager():assetManager;
	}
	
	public static void loadTextures(String... paths){
		synchronized(paths){
		for(String s:paths){
			if(!getAssetManager().isLoaded(s,Texture.class)){
				try{
				getAssetManager().load(s,Texture.class);
				}catch(Exception e){
					e.printStackTrace();
				}
			}
		}
		
		}
	}
	
	public static synchronized Texture loadTexture(String path){
		try{
		if(!getAssetManager().isLoaded(path,Texture.class)){
			getAssetManager().load(path,Texture.class);
			getAssetManager().finishLoading();
		}
			return getAssetManager().get(path,Texture.class);
		}catch(Exception e){
			Gdx.app.error("加载材质失败",e.toString());
		}
		Pixmap pix=PixmapUtil.missing();
		Texture texture= new Texture(pix);
		pix.dispose();
		return texture;
	}
	public static synchronized TextureRegionDrawable loadUIDrawable(String name){
		return new TextureRegionDrawable(loadTexture("ui/"+name));
	}
	public static synchronized TextureRegionDrawable loadUIDrawable(String name,int w,int h){
	    TextureRegionDrawable draw= new TextureRegionDrawable(loadTexture("ui/"+name));
		draw.setMinSize(w,h);
		return draw;
	}
	public static synchronized NinePatchDrawable loadUINinePatchDrawable(String name,int w,int h,int a){
	    NinePatchDrawable draw= new NinePatchDrawable(new NinePatch(loadTexture("ui/"+name),a,a,a,a));
		draw.setMinSize(w,h);
		return draw;
	}
	public static synchronized NinePatchDrawable loadUINinePatchDrawable(String name,int a){
	    NinePatchDrawable draw= new NinePatchDrawable(new NinePatch(loadTexture("ui/"+name),a,a,a,a));
		return draw;
	}
}
