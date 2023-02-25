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
public class Vela extends Mediotrans implements Iadmon_medios {
    int num_mastiles;
    int viento_max;

    public void alta(String marca,String modelo,String color){
        Scanner teclado=new Scanner(System.in);
        super.alta_basicos(marca, modelo, color);
        System.out.println("Indica numero de mastiles");
        this.num_mastiles=teclado.nextInt();
        System.out.println("Indica viento maximo");
        this.viento_max=teclado.nextInt();
    }    
    public Vela (String marca,String modelo,String color,int num_mastiles,int viento_max){
        super.alta_basicos(marca, modelo, color);
        this.num_mastiles=num_mastiles;
        this.viento_max=viento_max;
    }        
    
    @Override
    public boolean modificar_marca(String marca, String nueva_marca) {
        boolean retorno=false;
        return retorno;
    }
    
    @Override
    public void ver_medio() {
        System.out.println("Transporte a vela con numero de serie "+num_elemento);
        System.out.println("Marca "+marca);
        System.out.println("Modelo "+modelo);
        System.out.println("Color "+color);
        System.out.println("Tiene "+num_mastiles+" mastiles");
        System.out.println("Puede navegar con vientos de hasta "+viento_max);
        System.out.println("=========================================================");            
    }

    @Override
    public void cambia_color() {
        Scanner teclado=new Scanner(System.in);
        this.color=teclado.next();
    }



}
