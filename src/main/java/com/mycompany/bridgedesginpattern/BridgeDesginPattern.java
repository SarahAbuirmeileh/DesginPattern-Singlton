/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bridgedesginpattern;

/**
 *
 * @author sarah
 */
public class BridgeDesginPattern {

    public static void main(String[] args) {
        Aircraft plane = new Plane();
        plane.fly();
        
        Aircraft helicopter = new Helicopter();
        helicopter.fly();
        
    }
}
