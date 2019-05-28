/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package obstacledash;

import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author shann
 */
public class Player extends MovingThing implements Collidable{
        private int xSpeed;
	private int ySpeed;

	public Player()
	{
		super(200,200);
		setSpeed(3, 1);
	}

	public Player(int x, int y)
	{
		super(x, y);
		setSpeed(3, 1);
	}
	
	public Player(int x, int y, int width, int height)
	{
		this(x, y);
		super.setWidth(width);
		super.setHeight(height);
	}
	
	public Player(int x, int y, int width, int height, Color col)
	{
		this(x, y, width, height);
		super.setColor(col);
	}
	
	public Player(int x, int y, int width, int height, int xS, int xY)
	{
		this(x, y, width, height);
		setSpeed(xS, xY);
	}
	
	public Player(int x, int y, int width, int height, Color col, int xS, int xY)
	{
		super(x, y, width, height, col);
		setSpeed(xS, xY);
	}
	
	
	public void setXSpeed(int xS)
	{
		xSpeed=xS;
	}
	
	public void setYSpeed(int yS)
	{
		ySpeed=yS;
	}
	
	public void setSpeed(int xS, int yS)
	{
		xSpeed=xS;
		ySpeed=yS;
	}
	

   public void moveAndDraw(Graphics window)
   {
	   draw(window, Color.WHITE);
	   setX(getX()+xSpeed);
	   setY(getY()+ySpeed);
	   draw(window);
   }
   
	public boolean equals(Object obj)
	{
		Player other = (Player) obj;
		return super.equals(other) && xSpeed==other.getXSpeed() 
				&& ySpeed==other.getYSpeed();
	}

	public int getXSpeed()
	{
		return xSpeed;
	}
	
	public int getYSpeed()
	{
		return ySpeed;
	}
	
	
	public boolean didCollideRight(Object obj)
	{
		return true;
	}
	
	public boolean didCollideTop(Object obj)
	{
		return true;
	}

	public String toString()
	{
		return super.toString()+" "+xSpeed+" "+ySpeed;
	}
}
