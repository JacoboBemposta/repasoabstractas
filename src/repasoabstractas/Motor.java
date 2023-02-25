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
public class Motor extends Mediotrans implements Iadmon_medios {
    int cv;
    int cilindrada;

    public void alta(String marca,String modelo,String color){
        Scanner teclado=new Scanner(System.in);
        super.alta_basicos(marca, modelo, color);
        System.out.println("Indica potencia (cv)");
        this.cv=teclado.nextInt();
        System.out.println("Indica cilindrada");
        this.cilindrada=teclado.nextInt();
    }    
    public Motor(String marca,String modelo,String color,int cv,int cilindrada){
        Scanner teclado=new Scanner(System.in);
        super.alta_basicos(marca, modelo, color);
        this.cv=cv;
        this.cilindrada=cilindrada;
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
        System.out.println("Tiene una potencia de "+cv+" cv y una cilindrada de "+cilindrada);;
    }

    @Override
    public void cambia_color() {
        Scanner teclado=new Scanner(System.in);
        this.color=teclado.next();
    }



}
