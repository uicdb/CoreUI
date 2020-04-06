package com.uicdb.game.coreui.objects;
import com.badlogic.gdx.graphics.*;

public class PixmapUtil
{
	public static Pixmap missing(){
		Pixmap pm=new Pixmap(2,2,Pixmap.Format.RGBA8888);
		pm.setColor(Color.RED);
		pm.drawPixel(0,0);
		pm.drawPixel(1,1);
		pm.setColor(Color.YELLOW);
		pm.drawPixel(0,1);
		pm.drawPixel(1,0);
		return pm;
	}
	public static Pixmap color(Color color){
		Pixmap pm=new Pixmap(1,1,Pixmap.Format.RGBA8888);
		pm.setColor(color);
		pm.fill();
		return pm;
	}
	public static Pixmap color(float a,float r,float g,float b){
		return color(new Color(r,g,b,a));
	}
}
