/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.abstractfactorydesginpattern;

/**
 *
 * @author sarah
 */
public abstract class WatchFactory {
    public static Watch createWatch(AbstractFactory factory, int diameter){
        return  factory.createWatch(diameter);
    }
}
