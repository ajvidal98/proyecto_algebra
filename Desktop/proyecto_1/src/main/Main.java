
package main;

import java.util.Scanner;


public class Main {

    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        double crdA=0.0;
        double crdB=0.0;
        double crdC =0.0;
        double crdD =0.0;
        double area=0.0;
        double perimetro_equilatero=0.0;
        double perimetro_isoceles=0.0;
        double perimetro_escaleno=0.0;
        double perimetro_cuadrado=0.0;
        double perimetro_rectangulo=0.0;
        double baserectangulo=0.0;
        double alturarectangulo=0.0;
        double arearectangulo=0.0;
        double radio=0.0;
        double pi=3.1416;
        double areacirculo=0.0;
        double basecuadrado=0.0;
        double alturacuadrado=0.0;
        double areacuadrado=0.0;
        int opc;
        while(true){
            System.out.println("----------------------------------------");
            System.out.println("Sofwere de Algebra");
            System.out.println("----------------------------------------");
            System.out.println("cuantos puntos desea ingresar?");
            System.out.println("1.- 3 Puntos.");
            System.out.println("2.- 4 Puntos.");
            System.out.println("3.-Salir.");
            System.out.println("----------------------------------------");
            System.out.println("ingrese su opcion: ");
            opc = leer.nextInt();
            System.out.println("----------------------------------------");
            
            if(opc == 1){
                
                System.out.print("Ingrese las coordenadas de la base: ");
                
                crdA = leer.nextDouble();
                
                
                
                System.out.println("Ingrese las cordenadas de la altura: ");
                
                crdB = leer.nextDouble();
                
              
                System.out.println("Ingrese las cordenadas de un lado x1:");
                
                crdC = leer.nextDouble();
                area =(crdA * crdB)/2;
                perimetro_equilatero = crdA *3;
                if(crdA == crdC && crdA == crdB){
                    System.out.println("-------------------------------------------------");
                    System.out.println("la figura ingresada es un Triangulo equilatero");
                    System.out.println("-------------------------------------------------");
                    System.out.println("");
                    System.out.println("                        *");
                    System.out.println("                       ***");
                    System.out.println("                      *****");
                    System.out.println("                     *******");
                    System.out.println("                    *********");
                    System.out.println("                   ***********");
                    System.out.println("");
                    System.out.println("------------------------------------------------");
                    System.out.println("el area del triangulo equilatero es: "+area);
                    System.out.println("------------------------------------------------");
                    System.out.println("el perimetro del triangulo equilatero es: "+perimetro_equilatero);
                }else{
                    perimetro_isoceles = 2 * crdA + crdB;
                    if(crdA == crdB){
                        System.out.println("-------------------------------------------------");
                        System.out.println("la figura ingresada es un Triangulo isoceles");
                        System.out.println("-------------------------------------------------");
                        System.out.println("");
                        System.out.println("                       *");
                        System.out.println("                      ******");
                        System.out.println("                     ***********");
                        System.out.println("                    **************");
                        System.out.println("                   **************");
                        System.out.println("                  *************");
                        System.out.println("                 ************");
                        System.out.println("                ***********");
                        System.out.println("               **********");
                        System.out.println("              *********");
                        System.out.println("             ********");
                        System.out.println("            *******");
                        System.out.println("           ******");
                        System.out.println("          *****");
                        System.out.println("         ****");
                        System.out.println("        ***");
                        System.out.println("       **");
                        System.out.println("      *");
                        System.out.println("");
                        System.out.println("-------------------------------------------------");
                        System.out.println("el area del triangulo isoceles es: "+area);
                        System.out.println("-------------------------------------------------");
                        System.out.println("el perimetro del triangulo isoceles es: "+perimetro_isoceles);
                    }else{
                        if(crdA == crdC){
                            System.out.println("-------------------------------------------------");
                            System.out.println("la figura ingresada es un Triangulo isoceles");
                            System.out.println("-------------------------------------------------");
                            System.out.println("");
                            System.out.println("                       *");
                            System.out.println("                      ******");
                            System.out.println("                     ***********");
                            System.out.println("                    **************");
                            System.out.println("                   **************");
                            System.out.println("                  *************");
                            System.out.println("                 ************");
                            System.out.println("                ***********");
                            System.out.println("               **********");
                            System.out.println("              *********");
                            System.out.println("             ********");
                            System.out.println("            *******");
                            System.out.println("           ******");
                            System.out.println("          *****");
                            System.out.println("         ****");
                            System.out.println("        ***");
                            System.out.println("       **");
                            System.out.println("      *");
                            System.out.println("                                                 ");
                            System.out.println("-------------------------------------------------");
                            System.out.println("el area del triangulo isoceles es: "+area);
                            System.out.println("-------------------------------------------------");
                            System.out.println("el perimetro del triangulo isoceles es: "+perimetro_isoceles);
                        }else{
                            perimetro_escaleno =crdA + crdB + crdC;
                            if(crdA != crdB && crdA != crdC){
                                System.out.println("-------------------------------------------------");
                                System.out.println("la figura ingresada es un Triangulo Escaleno");
                                System.out.println("-------------------------------------------------");
                                System.out.println("");
                                System.out.println("                                                 ");
                                System.out.println("            *");
                                System.out.println("              **");
                                System.out.println("               *****");
                                System.out.println("                ********");
                                System.out.println("                 ***********");
                                System.out.println("                  **************");
                                System.out.println("                   ******************");
                                System.out.println("                    *********************");
                                System.out.println("                     ************************");
                                System.out.println("                                                 ");
                                System.out.println("                                                 ");
                                System.out.println("                                                 ");
                                System.out.println("-------------------------------------------------");
                                System.out.println("el area del triangulo isoceles es: "+area);
                                System.out.println("-------------------------------------------------");
                                System.out.println("el perimetro del triangulo isoceles es: "+perimetro_escaleno);
                            }
                        }
                    }
                }
                
            }else {
                if(opc == 2){
                    System.out.println("Ingrese las cordenadas de la base: ");
                    
                    crdA = leer.nextDouble();
                    
                    
                    
                    System.out.println("Ingrese las cordenadas de B: ");
                    
                    crdB = leer.nextDouble();
                    
                    
                    
                    System.out.println("Ingrese las cordenadas de C: ");
                    
                    crdC = leer.nextDouble();
                    
                    
                    
                    System.out.println("Ingrese las cordenadas de D: ");
                    
                    crdD = leer.nextDouble();
                    
                    perimetro_cuadrado = crdA + crdB + crdC + crdD;
                    if(crdA == crdB && crdA == crdC && crdA == crdD){
                        areacuadrado =(crdA * crdB);
                        System.out.println("---------------------------------------");
                        System.out.println("la figura ingresada es un cuadrado.");
                        System.out.println("---------------------------------------");
                        System.out.println("                                       ");
                        System.out.println("          * * * * * * * * * *");
                        System.out.println("          * * * * * * * * * *");
                        System.out.println("          * * * * * * * * * *");
                        System.out.println("          * * * * * * * * * *");
                        System.out.println("          * * * * * * * * * *");
                        System.out.println("          * * * * * * * * * *");
                        System.out.println("          * * * * * * * * * *");
                        System.out.println("          * * * * * * * * * *");
                        System.out.println("          * * * * * * * * * *");
                        System.out.println("          * * * * * * * * * *");
                        System.out.println("                                                 ");
                        System.out.println("-------------------------------------------------");
                        System.out.println("el area del cuadrado es: "+areacuadrado);
                        System.out.println("-------------------------------------------------");
                        System.out.println("el perimetro del cuadrado es: "+perimetro_cuadrado);
                    }else{
                        perimetro_rectangulo = crdA + crdA + crdB + crdB;
                        if(crdA == crdC){
                            arearectangulo = crdA * crdB;
                            System.out.println("---------------------------------------");
                            System.out.println("la figura ingresada es un rectangulo.");
                            System.out.println("---------------------------------------");
                            System.out.println("                                       ");
                            System.out.println("                                       ");
                            System.out.println("                                       ");
                            System.out.println("                                       ");
                            System.out.println("     * * * * * * * * * * * * * *");
                            System.out.println("     * * * * * * * * * * * * * *");
                            System.out.println("     * * * * * * * * * * * * * *");
                            System.out.println("     * * * * * * * * * * * * * *");
                            System.out.println("     * * * * * * * * * * * * * *");
                            System.out.println("     * * * * * * * * * * * * * *");
                            System.out.println("     * * * * * * * * * * * * * *");
                            System.out.println("                                        ");
                            System.out.println("-------------------------------------------------");
                            System.out.println("el area del cuadrado es: "+areacuadrado);
                            System.out.println("-------------------------------------------------");
                            System.out.println("el perimetro del cuadrado es: "+perimetro_rectangulo);
                        }
                    }
                    
                    /***Rombo obj= new Rombo();
                    obj.rom();**/
                }else {
                    if(opc == 3){
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
