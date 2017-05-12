package entities;

import java.util.Random;

public class Animal {
	
	private int x, y, newX, newY;
	private String species;
	private boolean picked = false;
	private Random rand = new Random();

	public Animal(String species, int x, int y) {
		this.x = x;
		this.y = y;
		this.species = species;
	}
	
	public void pickRandLocation() {
		if (!picked)
			newX = rand.nextInt(760) + 1;
		if (!picked)
			newY = rand.nextInt(560) + 1;
		picked = true;
	}
	
	public void update() {
		
		if (this.x != newX) {
			if (this.x > newX) {
				this.x -= 1;
			} else {
				this.x += 1;
			}
		} else if (this.y != newY) {
			if (this.y > newY) {
				this.y -= 1;
			} else {
				this.y += 1;
			}
		}else if (this.x == newX && this.y == newY) {
			picked = false;
		}
	}

	//Getters and Setters
	public boolean isPicked() {
		return picked;
	}
	
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public String getSpecies() {
		return species;
	}

	public void setSpecies(String species) {
		this.species = species;
	}
	
}
