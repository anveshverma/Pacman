package pacman.entities;

import java.awt.Graphics;

import pacman.Handler;
import pacman.gfx.Assets;

public class Ghost4 extends Ghosts {

	public Ghost4(Handler handler, float x, float y) {
		super(handler, x, y);
		
	}
	
	@Override
	public void update() {
		
	}
	
	
	@Override
	public void render(Graphics g) {
		g.drawImage(Assets.ghost4, (int)x,(int) y,width,height,null);
		move();
	}

}
