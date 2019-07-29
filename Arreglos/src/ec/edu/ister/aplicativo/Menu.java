
package ec.edu.ister.aplicativo;

import java.util.Scanner;

public class Menu {
    public void menu(){
        int op, i = 1, p = 0;
        
        Scanner lee=new Scanner (System.in);
        do{
            System.out.println("1.- Ingresar ");
            System.out.println("2.- Imprimir ");
            System.out.println("3.- Buscar Elemento Menor ");
            System.out.println("4.- Buscar Elemento Mayor ");
            System.out.println("5.- Multiplicar por escalar ");
            System.out.println("6.- Salir ");
            System.out.println("\n\nDigite la opcion : ");
            op=lee.nextInt();
         
            switch(op){
                case 1:
                    int vector[]=new int[10];
                        System.out.println("Ingrese el elemento "+ (i+1)+" : ");
                            for(i=0;i<10;i++)
                            vector[i]=lee.nextInt();
                                
                    break;
                    
                case 2:
                    
                    //int vector[]=new int[10];
                        System.out.print(vector[i]+" -> ");
                            for(i=0;i<10;i++)
                            vector[i]=lee.nextInt();
                    
                    break;
                    
                case 3:
                    
                    int menor=arreglo.buscarMenor(vector);
                    int aux=vector[0];
                       do{
                           if(aux>vector[i]){
                           aux=vector[i];
                           p=i;
                        }
                          i++;
                        }while(i<vector.length);
                         System.out.println("El elemento menor es : "+menor);
                         System.out.println("el elemento menor se encuentra en la pocision : " +(p+1));
             
                    break;
                    
                case 4:
                   
                    //int mayor=arreglo.buscarMayor(vector);
                    //int aux=vector[0];
                        do{
                           if(aux<vector[i]){
                           aux=vector[i];
                           p=i;
                        }
                         i++;
                        }while(i<vector.length);
                        System.out.println("El elemento mayor es : "+mayor);
                        System.out.println("\nel elemento mayor se encuentra en la pocision : " +(p+1));
                    
                    break;
                    
                case 5:
                    //int vector[]=new vector[];
                    System.out.print("Ingrese el Escalar : ");
                        int valor=lee.nextInt();
                        for(i=0;i<10;i++)
                        vector[i]=vector[i]*valor;
        
                    break;
                    
                case 6:
                    System.out.println("Gracias por usar el sistema!!!");
                    break;
            }
        }while(op!=6);
    }
    
}
