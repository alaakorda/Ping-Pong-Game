/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.project_ponggame;

/**
 *
 * @author Al Badr
 */
import java.awt.*;//GUI color 
import javax.swing.*;//GUI


public class GameFrame extends JFrame{//to inhert from class jframe 

	
	GameFrame(){
		GamePanel panel = new GamePanel();// take object from  GamePanel class(new > defualt constractor)
               
            
		this.add(panel);//add object in GameFrame
		this.setTitle("Pong Game");//name frame
		this.setResizable(false);//to prevent volume control 
		this.setBackground((Color.black));//to set background
                this.setVisible(true);//to appear frame
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// to close run when close the frame
		this.pack();//method leaves frame layout manager in charge of the frame size
		this.setLocationRelativeTo(null);//to appear frame in center
                
                
   
                 
   
}
}

