package com.uicdb.game.coreui.stages;
import com.badlogic.gdx.*;
import com.badlogic.gdx.scenes.scene2d.*;
import com.badlogic.gdx.utils.*;
import com.badlogic.gdx.graphics.g2d.*;
import com.uicdb.game.coreui.objects.*;
import com.badlogic.gdx.graphics.*;

public class BaseScreen extends ScreenAdapter
{

	private BitmapFont debugFont;
	private Stage renderStage;
	public BaseScreen(){
		this(1000,1000);
	}
    public BaseScreen(int w,int h){
		this(new BaseStage(w,h));
	}
	public BaseScreen(Stage stage){
		this.renderStage=stage;
		this.debugFont=SimpleFont.getFont(Color.YELLOW,(int)stage.getWidth()/30);
	}

	public void setRenderStage(Stage renderStages)
	{
		this.renderStage = renderStages;
	}

	public Stage getRenderStage()
	{
		return renderStage;
	}
	@Override
	public void show()
	{
		Gdx.input.setInputProcessor(renderStage);
		super.show();
	}
	
	@Override
	public void render(float delta)
	{
		
		renderStage.draw();
		renderStage.act();
		super.render(delta);
		debug();
	}
	public static boolean debug=true;
	public void debug(){
		if(debug){
			getRenderStage().getBatch().begin();
			debugFont.draw(renderStage.getBatch(),String.format("Stage has %d childs",renderStage.getActors().size),50,debugFont.getLineHeight()*2);
			debugFont.draw(renderStage.getBatch(),"FPS:"+Gdx.graphics.getFramesPerSecond(),50,debugFont.getLineHeight());
			getRenderStage().getBatch().end();
		}
	}
}
