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
public class Animal extends Mediotrans implements Iadmon_medios {
    String especie;
    int carga_max;

    public void alta(String marca,String modelo,String color){
        Scanner teclado=new Scanner(System.in);
        super.alta_basicos(marca, modelo, color);
        System.out.println("Indica especie");
        this.especie=teclado.next();
        System.out.println("Indica carga maxima");
        this.carga_max=teclado.nextInt();
    }    
    public Animal(String marca,String modelo,String color,String especie,int carga_maxima){
        Scanner teclado=new Scanner(System.in);
        super.alta_basicos(marca, modelo, color);
        this.especie=especie;
        this.carga_max=carga_max;
    }        
    
    @Override
    public boolean modificar_marca(String marca, String nueva_marca) {
        boolean retorno=false;
        return retorno;
    }
    
    @Override
    public void ver_medio() {
        System.out.println("Ultraligero con numero de serie "+num_elemento);
        System.out.println("Marca "+marca);
        System.out.println("Modelo "+modelo);
        System.out.println("Color "+color);
        System.out.println("El transporte es un "+especie+" y puede transportar "+carga_max+" Kg.");
    }

    @Override
    public void cambia_color() {
        Scanner teclado=new Scanner(System.in);
        this.color=teclado.next();
    }



}
