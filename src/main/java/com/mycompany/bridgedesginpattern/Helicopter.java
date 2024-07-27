/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bridgedesginpattern;

/**
 *
 * @author sarah
 */
public class Helicopter extends Aircraft {
    
    
    public Helicopter () {
        this.type = new Military();
    }
    
    @Override
    public void fly() {
        System.out.println("Flying as speed " + this.type.maxSpeed() );
    }
    
}
