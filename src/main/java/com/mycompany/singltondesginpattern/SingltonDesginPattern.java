/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.singltondesginpattern;

/**
 *
 * @author sarah
 */
public class SingltonDesginPattern {

    public static void main(String[] args) {
        SystemClock clock1=SystemClock.getInstance();
        SystemClock clock2=SystemClock.getInstance();
        
        System.out.println(clock1.currentTimeMillis());
        System.out.println(clock1 == clock2); 
    }
}
