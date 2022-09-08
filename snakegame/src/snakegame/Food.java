package snakegame;

import java.util.*;

public class Food {
	
	private final int posX;
	private final int posY;
	
	
	public Food() {
		posX = generatePos(Graphics.WIDTH);
		posY = generatePos(Graphics.HEIGHT);
		
		
	}
	
	private int generatePos(int size) {
		Random random = new Random();
		return random.nextInt(size / Graphics.TICK_SIZE ) * Graphics.TICK_SIZE;
	} 
	
	public int getPosX() {
		return posX;
	
	}
	
	public int getPosY() {
		return posY;
	
	}

}
