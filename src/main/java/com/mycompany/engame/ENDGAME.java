/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.engame;

/**
 *
 * @author repty
 */
public class ENDGAME{
    public static void main(String[]args){
    Heroe SpiderMan=new Heroe("Superior Spiderman", "Sentido Aracnido", "Lanza telarañas");
    Heroe Thor=new Heroe ("Doc.Jean Foster","Ser un dios del rayo","Mihonir");
    Villano Simbionte=new Villano("Vemon","Mimetizacion","Simbionte");
    Vengadores ViudaNegra=new Vengadores("Natasha", "Super espia", "Pistolas", "BlackAvengrs");
    Thanos Thanos=new Thanos("Thanos", "Titan", "Chitaury", "Gemas del infinito");
    //aplicando polimorfismo
    Personaje[] personajes={SpiderMan,Thor,Simbionte,ViudaNegra,Thanos} ;
    for(Personaje personaje:personajes){
        personaje.atacar();
    }
   //Metodo especifico de vengador
   ((Vengadores)SpiderMan).reunirse();

   //ejemplo de metodoo especifico de thanos
   Thanos.chasqueardedos();
}
}

