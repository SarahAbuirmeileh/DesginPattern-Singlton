package com.mycompany.singltondesginpattern;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author sarah
 */
public class SystemClock {

    private static SystemClock instance;

    private SystemClock() {
    }

    public static SystemClock getInstance(){
        if(instance == null){
            instance = new SystemClock();
        }
        return instance;
    }
    
    public long currentTimeMillis() {
        return System.currentTimeMillis();
    }
}
