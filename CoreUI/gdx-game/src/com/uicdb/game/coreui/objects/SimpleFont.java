package com.uicdb.game.coreui.objects;
import com.badlogic.gdx.graphics.g2d.freetype.*;
import com.badlogic.gdx.*;
import com.uicdb.game.coreui.*;
import com.badlogic.gdx.graphics.*;
import java.util.*;

public class SimpleFont 
{
	static HashMap<Color,HashMap<Integer,LazyBitmapFont>> fonts=new HashMap<>();
	public static LazyBitmapFont getFont(Color color,int size){
		LazyBitmapFont font;
		HashMap<Integer,LazyBitmapFont> lazyMap;
		if(fonts.containsKey(color)){
			lazyMap=fonts.get(color);
		}else{
			lazyMap=new HashMap<>();
			fonts.put(color,lazyMap);
		}
		if(lazyMap.containsKey(size)){
			font=lazyMap.get(size);
		}else{
			font= new LazyBitmapFont(new FreeTypeFontGenerator(Gdx.files.internal("fonts/cn.ttf")),size,color);
			lazyMap.put(size,font);
		}
		
		return font;
	}
	public static LazyBitmapFont getFont(int size){
		return getFont(Color.BLACK,size);
	}
	public static LazyBitmapFont getFont(Color color){
		return getFont(color,25);
	}
	public static LazyBitmapFont getFont(){
		return getFont(Color.WHITE,25);
	}
}
