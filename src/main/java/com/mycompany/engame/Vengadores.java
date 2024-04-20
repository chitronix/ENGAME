/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.engame;

/**
 *
 * @author repty
 */
public class Vengadores extends Heroe {
    private String equipo;
public Vengadores (String nombre,String poder,String arma,String equipo){
    super(nombre, poder, arma);
    this.equipo=equipo;
    }
    public void reunirse(){
        System.out.println(nombre+" Se une al equipo"+ equipo + "de los Vengadores");
}
}