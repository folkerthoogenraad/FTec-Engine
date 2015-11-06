import java.io.File;

import net.apryx.ftec.engine.FTec;
import net.apryx.ftec.engine.Game;
import net.apryx.ftec.graphics.Renderer;
import net.apryx.ftec.graphics.TextureLoader;
import net.apryx.graphics.Camera;
import net.apryx.graphics.GL;
import net.apryx.graphics.Texture;


public class TestGame extends Game{

	private Texture texture;
	private Renderer renderer;
	private Camera camera;
	
	@Override
	public void init() {
		GL.clearColor(0,0,0,1);
		
		texture = TextureLoader.loadTexture(new File("res/logo.png"));
		renderer = new Renderer();
		camera = new Camera();
		
		camera.size.x = 80;
		camera.size.y = 60;
	}

	@Override
	public void update() {

	}

	@Override
	public void render() {
		FTec.clear();
		
		renderer.setup(camera);
		
		renderer.drawTexture(texture, 0, 0, 32, 32);
	}

	@Override
	public void destroy() {
		renderer.dispose();
		texture.dispose();
	}
	
}
