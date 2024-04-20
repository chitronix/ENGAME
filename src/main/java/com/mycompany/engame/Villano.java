/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.engame;

/**
 *
 * @author repty
 */
public class Villano extends Personaje {
    private String ejercito;
public Villano (String nombre, String poder, String ejercito){
    super(nombre, poder);
    this.ejercito=ejercito;
    }
@Override
    public void atacar(){
    System.out.println(nombre + "comanda un ejercito para atacar!");
    }
}
