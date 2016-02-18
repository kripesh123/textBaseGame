/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.game;

import com.leapfrog.game.commands.GameCommand;
import com.leapfrog.game.commands.GameCommandFactory;
import com.leapfrog.game.entity.Player;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Engine {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("=======================================");
        System.out.println("======Welcome To Text Base Game========");
        System.out.println("=======================================");

        Scanner input= new Scanner(System.in);
        Player player=new Player();
        System.out.print("Enter the Name of the Player:");
        player.setName(input.next());
        System.out.println("Your Player " + player.getName() + " is Ready>>>>>>>>>");
        
        while(true){
            System.out.println("Enter Command..........->");
            String cmd=input.nextLine();
            String[] params=cmd.split(" ");
            GameCommand gameCmd=GameCommandFactory.get(params[0],input);
             if(gameCmd==null){
                System.out.println("Invalid Command");
            }
            else{
                
                gameCmd.execute(player,params);
            }
        }
    }

}
