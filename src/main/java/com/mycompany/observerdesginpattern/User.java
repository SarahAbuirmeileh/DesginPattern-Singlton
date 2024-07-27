/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.observerdesginpattern;

/**
 *
 * @author sarah
 */
public class User implements Observer {

    Subject blog;

    @Override
    public void subscribe(Subject sub) {
        this.blog = sub;
        sub.register(this);
    }

    @Override
    public void reciveMassege(String s) {
        System.out.println("I have notifiyed for this massege : " + s);
    }

}
