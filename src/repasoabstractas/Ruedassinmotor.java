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
public class Ruedassinmotor extends Mediotrans implements Iadmon_medios {
    int num_ruedas;
    String tipo;

    public void alta(String marca,String modelo,String color){
        Scanner teclado=new Scanner(System.in);
        super.alta_basicos(marca, modelo, color);
        System.out.println("Indica tipo ");
        this.tipo=teclado.next();
        System.out.println("Indica numero de ruedas");
        this.num_ruedas=teclado.nextInt();
    }    
    public Ruedassinmotor(String marca,String modelo,String color,String tipo,int num_ruedas){
        super.alta_basicos(marca, modelo, color);
        this.tipo=tipo;
        this.num_ruedas=num_ruedas;
    }        
    
    @Override
    public boolean modificar_marca(String marca, String nueva_marca) {
        boolean retorno=false;
        return retorno;
    }
    
    @Override
    public void ver_medio() {
        System.out.println("Transporte sin motor con numero de serie "+num_elemento);
        System.out.println("Marca "+marca);
        System.out.println("Modelo "+modelo);
        System.out.println("Color "+color);
        System.out.println("El transporte tiene "+num_ruedas+" ruedas y es  tipo "+tipo);
        System.out.println("=========================================================");            
    }

    @Override
    public void cambia_color() {
        Scanner teclado=new Scanner(System.in);
        this.color=teclado.next();
    }



}
