package com.uicdb.game.coreui.ui;
import com.badlogic.gdx.scenes.scene2d.ui.*;

public class MCScale extends Widget
{
	public static enum Direction{
		
		right(0),up(1),left(2),down(3);
		int code;
		public int getCode()
		{
			return code;
		}
		public Direction(int code)
		{
			this.code = code;
		}
		
	}
}
