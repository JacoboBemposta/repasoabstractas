/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package repasoabstractas;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Jacobo Bemposta Castro
 */
public class RepasoAbstractas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado=new Scanner(System.in);
        ArrayList<Mediotrans>listamedios=new ArrayList<Mediotrans>();
        Ultraligero ultra;
        Vela vela;
        Motor motor;
        Animal animal;
        Ruedassinmotor rueda;        
        int opcion;
        int posicion=0;
        int seleccion=0;
        
        
        ultra=new Ultraligero("ultra1","ultra1","rojo",2500);
        listamedios.add(ultra);
        vela=new Vela("vela1","vela1","rojo",1,75);
        listamedios.add(vela);
        motor=new Motor("motor1","motor1","rojo",250,250);
        listamedios.add(motor);
        animal=new Animal("animal1","animal1","rojo","burro",200);
        listamedios.add(animal);
        rueda=new Ruedassinmotor("rueda1","rueda1","rojo","bicicleta",2);
        listamedios.add(rueda);
        
        do{
        opcion=Menu(); 
        switch(opcion){
            case 1:
                   do{
                       System.out.println("Menú ultraligeros");
                       System.out.println("1- Alta");
                       System.out.println("2- Cambiar marca");
                       System.out.println("3- Ver transporte");
                       System.out.println("4- Cambiar color");
                       System.out.println("0- Volver a menu");
                       System.out.println("Elige una opcion");
                       seleccion=teclado.nextInt();
                       switch(seleccion){               
                           case 1:
                               System.out.println("Indica la marca");
                               String marca=teclado.next();
                               System.out.println("Indica modelo");
                               String modelo=teclado.next();
                               System.out.println("Indica color");
                               String color=teclado.next();                               
                               ultra.alta(marca, modelo, color);
                               listamedios.add(ultra);
                               break;
                           case 2:
                               posicion=-1;
                               System.out.println("Indica el numero del elemento");
                               int elemento=teclado.nextInt();
                               posicion=buscar_ultraligero(listamedios, elemento);
                               if(posicion!=-1){
                                   ultra=(Ultraligero) listamedios.get(posicion);
                                   System.out.println("Indica nueva marca");
                                   marca=teclado.next();
                                   ultra.modificar_marca(ultra.marca, marca);
                               }
                               else System.out.println("Ultraligero no encontrado");                      
                               break;
                           case 3:
                               posicion=-1;
                               System.out.println("Indica el numero del elemento");
                               elemento=teclado.nextInt();
                               posicion=buscar_ultraligero(listamedios, elemento);
                               if(posicion!=-1){
                                   ultra=(Ultraligero) listamedios.get(posicion);
                                   ultra.ver_medio();
                               }
                               else System.out.println("Ultraligero no encontrado");                      
                               break;
                           case 4:
                               posicion=-1;
                               System.out.println("Indica el numero del elemento");
                               elemento=teclado.nextInt();
                               posicion=buscar_ultraligero(listamedios, elemento);
                               if(posicion!=-1){
                                   ultra=(Ultraligero) listamedios.get(posicion);
                                   ultra.cambia_color();
                               }                  
                               else System.out.println("Ultraligero no encontrado");                      
                               break;                         
                       }
                       System.out.println("Menu de inicio");
                   }while(seleccion!=0);
                   break;
               case 2:
                   seleccion=0;
                   do{
                       System.out.println("Menú vela");
                       System.out.println("1- Alta");
                       System.out.println("2- Cambiar marca");
                       System.out.println("3- Ver transporte");
                       System.out.println("4- Cambiar color");
                       System.out.println("0- Volver a menu");
                       seleccion=teclado.nextInt();
                       switch(seleccion){
                           case 1:
                               System.out.println("Indica la marca");
                               String marca=teclado.next();
                               System.out.println("Indica modelo");
                               String modelo=teclado.next();
                               System.out.println("Indica color");
                               String color=teclado.next();                               
                               vela.alta(marca, modelo, color);
                               listamedios.add(vela);
                               break;
                           case 2:
                               posicion=-1;
                               System.out.println("Indica el numero del elemento");
                               int elemento=teclado.nextInt();
                               posicion=buscar_vela(listamedios, elemento);
                               if(posicion!=-1){
                                   vela=(Vela) listamedios.get(posicion);
                                   System.out.println("Indica nueva marca");
                                   marca=teclado.next();
                                   vela.modificar_marca(ultra.marca, marca);
                               }
                               else System.out.println("Transporte de vela no encontrado");                      
                               break;
                           case 3:
                               posicion=-1;
                               System.out.println("Indica el numero del elemento");
                               elemento=teclado.nextInt();
                               posicion=buscar_vela(listamedios, elemento);
                               if(posicion!=-1){
                                   vela=(Vela) listamedios.get(posicion);
                                   vela.ver_medio();
                               }
                               else System.out.println("Transporte de vela no encontrado");                      
                               break;
                           case 4:
                               posicion=-1;
                               System.out.println("Indica el numero del elemento");
                               elemento=teclado.nextInt();
                               posicion=buscar_vela(listamedios, elemento);
                               if(posicion!=-1){
                                   vela=(Vela) listamedios.get(posicion);
                                   vela.cambia_color();
                               }                  
                               else System.out.println("Transporte de vela no encontrado");                      
                               break;                         
                       }
                       System.out.println("Menu de inicio");                       
                       
                   }while(seleccion!=0);
                   break;                   
               case 3:
                   seleccion=0;
                   do{
                       System.out.println("Menú motor");
                       System.out.println("1- Alta");
                       System.out.println("2- Cambiar marca");
                       System.out.println("3- Ver transporte");
                       System.out.println("4- Cambiar color");
                       System.out.println("0- Volver a menu");
                       seleccion=teclado.nextInt();
                       switch(seleccion){
                           case 1:
                               System.out.println("Indica la marca");
                               String marca=teclado.next();
                               System.out.println("Indica modelo");
                               String modelo=teclado.next();
                               System.out.println("Indica color");
                               String color=teclado.next();                               
                               motor.alta(marca, modelo, color);
                               listamedios.add(motor);
                               break;
                           case 2:
                               posicion=-1;
                               System.out.println("Indica el numero del elemento");
                               int elemento=teclado.nextInt();
                               posicion=buscar_motor(listamedios, elemento);
                               if(posicion!=-1){
                                   motor=(Motor) listamedios.get(posicion);
                                   System.out.println("Indica nueva marca");
                                   marca=teclado.next();
                                   motor.modificar_marca(ultra.marca, marca);
                               }
                               else System.out.println("Transporte a motor no encontrado");                      
                               break;
                           case 3:
                               posicion=-1;
                               System.out.println("Indica el numero del elemento");
                               elemento=teclado.nextInt();
                               posicion=buscar_motor(listamedios, elemento);
                               if(posicion!=-1){
                                   motor=(Motor) listamedios.get(posicion);
                                   motor.ver_medio();
                               }
                               else System.out.println("Transporte a motor no encontrado");                      
                               break;
                           case 4:
                               posicion=-1;
                               System.out.println("Indica el numero del elemento");
                               elemento=teclado.nextInt();
                               posicion=buscar_motor(listamedios, elemento);
                               if(posicion!=-1){
                                   motor=(Motor) listamedios.get(posicion);
                                   motor.cambia_color();
                               }                  
                               else System.out.println("Transporte a motor no encontrado");                      
                               break;                         
                       }
                       System.out.println("Menu de inicio");                       
                       
                   }while(seleccion!=0);
                   break;
               case 4:
                   seleccion=0;
                   do{
                       System.out.println("Menú animal");
                       System.out.println("1- Alta");
                       System.out.println("2- Cambiar marca");
                       System.out.println("3- Ver transporte");
                       System.out.println("4- Cambiar color");
                       System.out.println("0- Volver a menu");
                       seleccion=teclado.nextInt();
                       switch(seleccion){
                           case 1:
                               System.out.println("Indica la marca");
                               String marca=teclado.next();
                               System.out.println("Indica modelo");
                               String modelo=teclado.next();
                               System.out.println("Indica color");
                               String color=teclado.next();                               
                               animal.alta(marca, modelo, color);
                               listamedios.add(animal);
                               break;
                           case 2:
                               posicion=-1;
                               System.out.println("Indica el numero del elemento");
                               int elemento=teclado.nextInt();
                               posicion=buscar_Animal(listamedios, elemento);
                               if(posicion!=-1){
                                   animal=(Animal) listamedios.get(posicion);
                                   System.out.println("Indica nueva marca");
                                   marca=teclado.next();
                                   animal.modificar_marca(ultra.marca, marca);
                               }
                               else System.out.println("animal no encontrado");                      
                               break;
                           case 3:
                               posicion=-1;
                               System.out.println("Indica el numero del elemento");
                               elemento=teclado.nextInt();
                               posicion=buscar_Animal(listamedios, elemento);
                               if(posicion!=-1){
                                   animal=(Animal) listamedios.get(posicion);
                                   animal.ver_medio();
                               }
                               else System.out.println("animal no encontrado");                      
                               break;
                           case 4:
                               posicion=-1;
                               System.out.println("Indica el numero del elemento");
                               elemento=teclado.nextInt();
                               posicion=buscar_Animal(listamedios, elemento);
                               if(posicion!=-1){
                                   animal=(Animal) listamedios.get(posicion);
                                   animal.cambia_color();
                               }                  
                               else System.out.println("animal no encontrado");                      
                               break;                         
                       }
                       System.out.println("Menu de inicio");                       
                       
                   }while(seleccion!=0);
                   break;
               case 5:
                   seleccion=0;
                   do{
                       System.out.println("Menú ruedas sin motor");
                       System.out.println("1- Alta");
                       System.out.println("2- Cambiar marca");
                       System.out.println("3- Ver transporte");
                       System.out.println("4- Cambiar color");
                       System.out.println("0- Volver a menu");
                       seleccion=teclado.nextInt();
                       switch(seleccion){
                           case 1:
                               System.out.println("Indica la marca");
                               String marca=teclado.next();
                               System.out.println("Indica modelo");
                               String modelo=teclado.next();
                               System.out.println("Indica color");
                               String color=teclado.next();                               
                               rueda.alta(marca, modelo, color);
                               listamedios.add(rueda);
                               break;
                           case 2:
                               posicion=-1;
                               System.out.println("Indica el numero del elemento");
                               int elemento=teclado.nextInt();
                               posicion=buscar_Ruedassinmotor(listamedios, elemento);
                               if(posicion!=-1){
                                   rueda=(Ruedassinmotor) listamedios.get(posicion);
                                   System.out.println("Indica nueva marca");
                                   marca=teclado.next();
                                   rueda.modificar_marca(ultra.marca, marca);
                               }
                               else System.out.println("Transporte de Ruedas sin motor no encontrado");                      
                               break;
                           case 3:
                               posicion=-1;
                               System.out.println("Indica el numero del elemento");
                               elemento=teclado.nextInt();
                               posicion=buscar_Ruedassinmotor(listamedios, elemento);
                               if(posicion!=-1){
                                   rueda=(Ruedassinmotor) listamedios.get(posicion);
                                   rueda.ver_medio();
                               }
                               else System.out.println("Transporte de Ruedas sin motor no encontrado");                      
                               break;
                           case 4:
                               posicion=-1;
                               System.out.println("Indica el numero del elemento");
                               elemento=teclado.nextInt();
                               posicion=buscar_Ruedassinmotor(listamedios, elemento);
                               if(posicion!=-1){
                                   rueda=(Ruedassinmotor) listamedios.get(posicion);
                                   rueda.cambia_color();
                               }                  
                               else System.out.println("Transporte de Ruedas sin motor no encontrado");                      
                               break; 
                       }
                       System.out.println("Menu de inicio");                                           
                   }while(seleccion!=0);
                   break;   
               case 6:
                   ver_todos(listamedios);
                   break;
           }
        }while(opcion!=0);
        System.out.println("Has salido del programa");
    }
    

    
    public static int Menu(){
        Scanner teclado=new Scanner(System.in);
        int opcion=0;
        System.out.println("Menu medios de transporte Chan do Monte");
        System.out.println("1-Transportes ultraligeros");
        System.out.println("2-Transportes de vela");
        System.out.println("3-Transportes de motor");
        System.out.println("4-Transportes animales");
        System.out.println("5-Transportes ruedas sin motor");
        System.out.println("6- Ver todos los transportes");
        System.out.println("0- Salir del programa");
        System.out.println("Elige una opcion");
        opcion=teclado.nextInt();
        return opcion;
    }
    public static int buscar_ultraligero(ArrayList<Mediotrans>listamedios,int elemento){
        int posicion=-1;
        for (int i = 0; i < listamedios.size(); i++) {
            if(listamedios.get(i) instanceof Ultraligero) {
                if(listamedios.get(i).num_elemento==elemento) posicion=i;
            }
        }
        return posicion;
    }
    public static int buscar_vela(ArrayList<Mediotrans>listamedios,int elemento){
        int posicion=-1;
        for (int i = 0; i < listamedios.size(); i++) {
            if(listamedios.get(i) instanceof Vela) {
                if(listamedios.get(i).num_elemento==elemento) posicion=i;
            }
        }
        return posicion;
    }
    public static int buscar_motor(ArrayList<Mediotrans>listamedios,int elemento){
        int posicion=-1;
        for (int i = 0; i < listamedios.size(); i++) {
            if(listamedios.get(i) instanceof Motor) {
                if(listamedios.get(i).num_elemento==elemento) posicion=i;
            }
        }
        return posicion;
    }
    public static int buscar_Animal(ArrayList<Mediotrans>listamedios,int elemento){
        int posicion=-1;
        for (int i = 0; i < listamedios.size(); i++) {
            if(listamedios.get(i) instanceof Animal) {
                if(listamedios.get(i).num_elemento==elemento) posicion=i;
            }
        }
        return posicion;
    }
    public static int buscar_Ruedassinmotor(ArrayList<Mediotrans>listamedios,int elemento){
        int posicion=-1;
        for (int i = 0; i < listamedios.size(); i++) {
            if(listamedios.get(i) instanceof Ruedassinmotor) {
                if(listamedios.get(i).num_elemento==elemento) posicion=i;
            }
        }
        return posicion;
    }    
    public static void ver_todos(ArrayList<Mediotrans>listamedios){
        for (int i = 0; i < listamedios.size(); i++) {
            if(listamedios.get(i) instanceof Ultraligero){
                Ultraligero ultra=(Ultraligero) listamedios.get(i);
                ultra.ver_medio();
            }
            if(listamedios.get(i) instanceof Vela){
                Vela vela=(Vela) listamedios.get(i);
                vela.ver_medio();
            }
            if(listamedios.get(i) instanceof Motor){
                Motor motor=(Motor)listamedios.get(i);
                motor.ver_medio();
            }
            if(listamedios.get(i) instanceof Animal){
                Animal animal=(Animal) listamedios.get(i);
                animal.ver_medio();
            }
            if(listamedios.get(i) instanceof Ruedassinmotor){
                Ruedassinmotor rueda=(Ruedassinmotor) listamedios.get(i);
                rueda.ver_medio();
            }            
        }
    }
}
