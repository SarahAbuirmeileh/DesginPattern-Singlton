/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.observerdesginpattern;

/**
 *
 * @author sarah
 */
public interface Subject {
    public void register(Observer ob);
    public void notifyObservers();
    public void setPost(String post);
}
