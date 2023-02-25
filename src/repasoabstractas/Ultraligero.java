/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repasoabstractas;

import java.util.Scanner;

/**
 *
 * @author Jacobo Bemposta Castro
 */
public class Ultraligero extends Mediotrans implements Iadmon_medios {
    int altura_planeo;

    public void alta(String marca,String modelo,String color){
        Scanner teclado=new Scanner(System.in);
        super.alta_basicos(marca, modelo, color);
        System.out.println("Indica altura de planeo");
        this.altura_planeo=teclado.nextInt();
    }    
    
    public Ultraligero(String marca,String modelo,String color,int altura_planeo){
        Scanner teclado=new Scanner(System.in);
        super.alta_basicos(marca, modelo, color);
        this.altura_planeo=altura_planeo;
    }        
    @Override
    public boolean modificar_marca(String marca, String nueva_marca) {
        boolean retorno=true;
        this.marca=nueva_marca;
        return retorno;
    }
    
    @Override
    public void ver_medio() {
        System.out.println("Ultraligero con numero de serie "+num_elemento);
        System.out.println("Marca "+marca);
        System.out.println("Modelo "+modelo);
        System.out.println("Color "+color);
        System.out.println("Puede planear a "+altura_planeo+" metros de altura");
    }

    @Override
    public void cambia_color() {
        Scanner teclado=new Scanner(System.in);
        System.out.println("Indica el nuevo color");
        this.color=teclado.next();
    }



}
