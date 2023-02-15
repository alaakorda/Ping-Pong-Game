/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.project_ponggame;

/**
 *
 * @author Al Badr
 */
import java.awt.*;

public class Score {
	static int GAME_WIDTH; // to be common in all objects
	static int GAME_HEIGHT;
	int player1;
	int player2;
	     
	Score(int GAME_WIDTH, int GAME_HEIGHT){ // constractor t put width & hight
		Score.GAME_WIDTH = GAME_WIDTH;//because is public
		Score.GAME_HEIGHT = GAME_HEIGHT;
	}
	public void draw(Graphics g) {//to pant line and score
		g.setColor(Color.white);
                                        //name        //style     //size
		g.setFont(new Font("Consolas",Font.PLAIN,60));
		          
		g.drawLine(GAME_WIDTH/2, 0, GAME_WIDTH/2, GAME_HEIGHT);
		g.drawString(String.valueOf(player1/10)+String.valueOf(player1%10), (GAME_WIDTH/2)-85, 50);
		g.drawString(String.valueOf(player2/10)+String.valueOf(player2%10), (GAME_WIDTH/2)+20, 50);
	}
}
