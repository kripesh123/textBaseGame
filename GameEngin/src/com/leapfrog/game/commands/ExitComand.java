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
public class ExitComand extends GameCommand{

    public ExitComand(Scanner input) {
        super(input);
    }

    @Override
    public void execute(Player player, String[] param) {
        System.out.println("Do you really want to exit? [Y-N]");
        if(!input.next().equalsIgnoreCase("n")){
            System.out.println("Closing Game Please Wait..................");
            System.exit(0);
        }
    }
    
}
