package com.uicdb.game.coreui;

import android.os.Bundle;

import com.badlogic.gdx.backends.android.AndroidApplication;
import com.badlogic.gdx.backends.android.AndroidApplicationConfiguration;
import android.app.*;
import com.badlogic.gdx.graphics.g2d.freetype.*;
import java.lang.reflect.*;
import com.badlogic.gdx.utils.*;

public class MainActivity extends AndroidApplication {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
        AndroidApplicationConfiguration cfg = new AndroidApplicationConfiguration();
        initialize(new SimpleGame(), cfg);
	    }

	@Override
	public void finish()
	{
		super.finish();
		System.exit(0);
	}
	
}
