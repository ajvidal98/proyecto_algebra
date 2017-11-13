
package main;

import java.util.Scanner;


public class Main {

    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        while(true){
            System.out.println("----------------------------------------");
            System.out.println("Sofwere de Algebra");
            System.out.println("----------------------------------------");
            System.out.println("cuantos puntos desea ingresar?");
            System.out.println("A.- 3 Puntos.");
            System.out.println("B.- 4 Puntos.");
            System.out.println("c.-Salir.");
            System.out.println("----------------------------------------");
            System.out.println("ingrese su opcion: ");
            String opc = leer.nextLine();
            System.out.println("----------------------------------------");
            
            if(opc.equalsIgnoreCase("A")){
                System.out.println("------------------------------------");
                System.out.println("ingrese la cordenada de A: ");
                
                String crdA = leer.nextLine();
                String[] lugarA = crdA.split(",");
                
                int crdAx = Integer.parseInt(lugarA[0]);
                int crdAy = Integer.parseInt(lugarA[1]);
                
                System.out.println("-----------------------------------");
                System.out.println("Ingrese las cordenadas de B: ");
                
                String crdB = leer.nextLine();
                String[] lugarB = crdB.split(",");
                
                int crdBx = Integer.parseInt(lugarB[0]);
                int crdBy = Integer.parseInt(lugarB[1]);
                
                System.out.println("----------------------------------");
                System.out.println("Ingrese las cordenadas de C:");
                
                String crdC = leer.nextLine();
                String[] lugarC = crdC.split(",");
                
                int crdCx = Integer.parseInt(lugarC[0]);
                int crdCy = Integer.parseInt(lugarC[1]);
                
            }else {
                if(opc.equalsIgnoreCase("B")){
                    System.out.println("Ingrese las cordenadas de A: ");
                    
                    String crdA = leer.nextLine();
                    String[] lugarA = crdA.split(",");
                    
                    int crdAx = Integer.parseInt(lugarA[0]);
                    int crdAy = Integer.parseInt(lugarA[1]);
                    
                    System.out.println("-------------------------------");
                    System.out.println("Ingrese las cordenadas de B: ");
                    
                    String crdB = leer.nextLine();
                    String[] lugarB = crdB.split(",");
                    
                    int crdBx = Integer.parseInt(lugarB[0]);
                    int crdBy = Integer.parseInt(lugarB[1]);
                    
                    System.out.println("-------------------------------");
                    System.out.println("Ingrese las cordenadas de C: ");
                    
                    String crdC = leer.nextLine();
                    String[] lugarC = crdC.split(",");
                    
                    int crdCx = Integer.parseInt(lugarC[0]);
                    int crdCy = Integer.parseInt(lugarC[1]);
                    
                    System.out.println("-------------------------------");
                    System.out.println("Ingrese las cordenadas de D: ");
                    
                    String crdD = leer.nextLine();
                    String[] lugarD = crdD.split(",");
                    
                    int crdDx = Integer.parseInt(lugarD[0]);
                    int crdDy = Integer.parseInt(lugarD[1]);
                    
                    Rombo obj= new Rombo();
                    obj.rom();
                }else {
                    if(opc.equalsIgnoreCase("C")){
                        System.out.println("Gracias por probar el desafio (PERO ESQUE PROFEE.");
                        System.out.println("-------------------------------------------------");
                        System.out.println("Cantidad de figuras ingresadas:");
                        System.out.println("-------------------------------------------------");
                        break;
                    }
                }
            }
        }
    
    }
    
}
