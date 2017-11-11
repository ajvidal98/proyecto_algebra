
package main;

import java.util.Scanner;


public class Main {

    
    public static void main(String[] args) {
        /**Distancia entre dos puntos (Módulo del vector)
        Dado dos vectores:
        • A( x1, y1)
        • B( x2, y2)
        La distancia entre esos puntos o el módulo del vector se calcula de la siguiente manera:
        |A, B|=√( x2−x1)2+( y2− y1)2**/
        
        Scanner lector = new Scanner(System.in);
        
        int cordenadas =0;
        int contador = 0;
        System.out.println("----------------------------");
        System.out.println("Desafío #esqueperoprofe");
        System.out.println("----------------------------");
        System.out.println("----------------------------");
        System.out.print("ingrese una matriz superior a (8,8) :");
        String opcion = lector.nextLine();
        
        String[] vector = opcion.split(",");
        int x = Integer.parseInt(vector[0]);
        int y = Integer.parseInt(vector[1]);

        String[][] matriz = new String[x][y];
        
        
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = null;
            }
        }
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(" - ");
            }
            System.out.println();
        }
        System.out.println("=============================================================");
        int fila_cordenada;
        int columna_cordenada;
        System.out.print("numero de cordenadas(ingrese de 3 a 4:)");
        
        while(true){
            String cordenada = lector.nextLine();
            String[] vector1 = cordenada.split(",");
            contador = contador +1;
            System.out.println("cordenada" +contador );
            String opcion3 = lector.nextLine();
            String[] vector3 = opcion3.split(",");
            
            System.out.println("-------------------------------");
            
            for (int i = 0; i < matriz.length; i++) {
                for (int j = 0; j < matriz[i].length; j++) {
                    matriz[i][j] = null;
                }
            }
            for (int i = 0; i < matriz.length; i++) {
                for (int j = 0; j < matriz[i].length; j++) {
                    System.out.print(" - ");
                    
                }
                System.out.println();
                
            }
            
            
        }
        
        
        
        
        
        
        /***while(true){
            System.out.println("---------------------------------------------------------------");
            
            contador = contador +1;
            System.out.println("cordenada" +contador );
            String opcion3 = lector.nextLine();
            String[] vector3 = opcion3.split(",");
            while(true){
                
                
            }
            
            
            
               
            
        }**/
        
        
        
        
        
        
        
        
        /**System.out.print("vector A (separe con una coma):");
        
        String opcion = lector.nextLine();
        String[] vector = opcion.split(",");
        int x1 = Integer.parseInt(vector[0]);
        int y1 = Integer.parseInt(vector[1]);
        
        System.out.println("-------------------------------");
        
        System.out.print("vector B (separe con una coma)");
        String opcion2 = lector.nextLine();
        String[] vector2 = opcion2.split(",");
        int x2 = Integer.parseInt(vector[0]);
        int y2 = Integer.parseInt(vector[1]);
        System.out.println("-------------------------------");**/
        
            
        
    }
    
    
}
