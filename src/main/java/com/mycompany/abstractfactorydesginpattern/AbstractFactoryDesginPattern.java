/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.abstractfactorydesginpattern;

/**
 *
 * @author sarah
 */
public class AbstractFactoryDesginPattern {

    public static void main(String[] args) {
        
        HandWatchFactory factory1 = new HandWatchFactory();
        int diameter1 = 5;
        Watch watch1 = WatchFactory.createWatch(factory1, diameter1);
        
        if(watch1 instanceof HandWatch){
            System.out.println("Hand Watch Created Successfully !");
        }
        
        WallWatchFactory factory2 = new WallWatchFactory();
        int diameter2 = 5;
        
        Watch watch2 = WatchFactory.createWatch(factory2, diameter2);
        
        if(watch2 instanceof WallWatch){
            System.out.println("Wall Watch Created Successfully !");
        }
                
    }
}
