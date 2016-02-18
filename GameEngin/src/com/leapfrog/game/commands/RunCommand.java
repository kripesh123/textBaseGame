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
public class RunCommand extends GameCommand{

    public RunCommand(Scanner input) {
        super(input);
    }

    @Override
    public void execute(Player player, String[] param) {
       if(param.length==1){
           System.out.println(player.getName() + " is running");
       }else if(param.length>1){
           System.out.println(player.getName() + " is running " +param[1]);
       }
    }
    
}
