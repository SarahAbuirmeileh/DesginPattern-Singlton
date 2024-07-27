/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package factorydesginpattern;

/**
 *
 * @author sarah
 */
public class FactoryDesginPattern {

    public static void main(String[] args) {
        String type1 = "HandWatch";
        int diameter1 = 5;
        
        Watch watch1 = WatchFactory.createWatch(type1, diameter1);
        
        if(watch1 instanceof HandWatch){
            System.out.println("Hand Watch Created Successfully !");
        }
        
        String type2 = "WallWatch";
        int diameter2 = 5;
        
        Watch watch2 = WatchFactory.createWatch(type2, diameter2);
        
        if(watch2 instanceof WallWatch){
            System.out.println("Wall Watch Created Successfully !");
        }
        
    }
}
