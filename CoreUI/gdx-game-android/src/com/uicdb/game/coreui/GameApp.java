package com.uicdb.game.coreui;
import android.app.*;
import cn.qqtheme.framework.*;


public class GameApp extends Application
{

	@Override
	public void onCreate()
	{
		super.onCreate();
		
		AppContext.initialize(this,cn.qqtheme.framework.activity.CrashActivity.class);
	}
	
}
