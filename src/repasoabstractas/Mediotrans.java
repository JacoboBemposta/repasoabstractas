/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repasoabstractas;

/**
 *
 * @author Jacobo Bemposta Castro
 */
public abstract class Mediotrans {
    String marca;
    String modelo;
    String color;
    int num_elemento=0;
    
    public static int contador=1;
    public void alta_basicos(String marca,String modelo,String color){
        this.marca=marca;
        this.modelo=modelo;
        this.color=color;
        this.num_elemento=num_elemento+contador;
        contador++;
    }
    
    public abstract void ver_medio();
    public abstract void cambia_color();
}
