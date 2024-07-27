/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.observerdesginpattern;

/**
 *
 * @author sarah
 */
public class ObserverDesginPattern {

    public static void main(String[] args) {
        Subject blog = new Blog();
        Observer user = new User();
        
        blog.register(user);
        blog.setPost("Post 1");
    }
}
