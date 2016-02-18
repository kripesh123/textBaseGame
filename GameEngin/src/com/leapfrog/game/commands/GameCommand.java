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
public abstract class GameCommand {
    protected Scanner input;
    
    public GameCommand(Scanner input){
        this.input=input;
    }
   public abstract void execute(Player player,String[] param);
}
