package game;
import org.lwjgl.opengl.Display;
import org.lwjgl.opengl.DisplayMode;

import de.lessvoid.nifty.Nifty;
import de.lessvoid.nifty.nulldevice.NullSoundDevice;
import de.lessvoid.nifty.renderer.lwjgl.input.LwjglInputSystem;
import de.lessvoid.nifty.renderer.lwjgl.render.LwjglRenderDevice;
import de.lessvoid.nifty.tools.TimeProvider;

public class Main {
	private static int SCREENWIDTH = 1000;
	private static int SCREENHEIGHT= 700;
	
	public Main() {}
	
	private void createDisplay() {
		try {
			Display.setDisplayMode(new DisplayMode(SCREENWIDTH, SCREENHEIGHT));
			Display.create();
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Something went wrong 1");
			System.exit(-1);
		}
	}
	
	private LwjglInputSystem createAndStartInputSystem() {
		LwjglInputSystem inputSystem = new LwjglInputSystem();
		try {
			inputSystem.startup();
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Something went wrong 2");
			System.exit(-1);
		}
		return inputSystem;
	}
	
	private Nifty createNifty(LwjglInputSystem inputSystem) {
		Nifty nifty = new Nifty(
				new LwjglRenderDevice(),
				new NullSoundDevice(),
				inputSystem,
				new TimeProvider());
		return nifty;
	}
	
	private void runGameLoop(Nifty nifty) {
		Game game = new Game();
		game.startGame();
		
		boolean done = false;
		while (!done) {
			if (nifty.update() || Display.isCloseRequested())
				done = true;
			
			nifty.render(true);
			
			Display.update();
		}
	}
	
	public static void main(String[] args) {
		Main main = new Main();
		main.createDisplay();
		
		LwjglInputSystem inputSystem = main.createAndStartInputSystem();
		Nifty nifty = main.createNifty(inputSystem);
		main.runGameLoop(nifty);
	}
}
