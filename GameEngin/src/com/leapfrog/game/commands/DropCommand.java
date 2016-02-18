/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.game.commands;

import com.leapfrog.game.entity.Player;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class DropCommand extends GameCommand{

    public DropCommand(Scanner input) {
        super(input);
    }

    @Override
    public void execute(Player player, String[] param) {
       if(param.length==1){
           System.out.println("Sorry dnt know what to drop");
       }else{
           System.out.println(player.getName() + " has dropped " +param[1]);
       }
    }
    
}
