/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bridgedesginpattern;

/**
 *
 * @author sarah
 */
public class Plane extends Aircraft {
    
    public Plane () {
        this.type = new Commiercial();
    }
    
    @Override
    public void fly() {
        System.out.println("Flying at speed " + this.type.maxSpeed() );
    }
}
