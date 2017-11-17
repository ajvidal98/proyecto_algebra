
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
        double perimetro_rombo=0.0;
        double baserectangulo=0.0;
        double alturarectangulo=0.0;
        double arearectangulo=0.0;
        double area_rombo=0.0;
        double radio=0.0;
        double pi=3.1416;
        double areacirculo=0.0;
        double basecuadrado=0.0;
        double alturacuadrado=0.0;
        double areacuadrado=0.0;
        double area_trapecio =0.0;
        double perimetro_trapecio=0.0;
        double alturatr =4.0;
        double n =0.0;
        int opc;
        int opcion;
        while(true){
            System.out.println("                                        ");
            System.out.println("----------------------------------------");
            System.out.println("Sofwere de Algebra");
            System.out.println("----------------------------------------");
            System.out.println("cuantos puntos desea ingresar?");
            System.out.println("1.- 3 Puntos.");
            System.out.println("2.- 4 Puntos.");
            System.out.println("3.-Salir.");
            System.out.println("----------------------------------------");
            System.out.print("ingrese su opcion: ");
            opc = leer.nextInt();
            System.out.println("----------------------------------------");
            
            if(opc != 1 && opc != 2){
                System.out.println("profe, no se ponga tierno. es solo numeros.  XD");
                continue;
            }
            
            if(opc == 1){
                System.out.println("                                             ");
                System.out.println("---------------------------------------------");
                System.out.println("Ingrese las coordenadas de la base: ");
                System.out.println("---------------------------------------------");
                
                crdA = leer.nextDouble();
                
                
                System.out.println("                                             ");
                System.out.println("---------------------------------------------");
                System.out.println("Ingrese las cordenadas de la altura: ");
                System.out.println("---------------------------------------------");
                
                crdB = leer.nextDouble();
                
              
                System.out.println("                                             ");
                System.out.println("---------------------------------------------");
                System.out.println("Ingrese las cordenadas de un lado x1:");
                System.out.println("---------------------------------------------");
                
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
                    System.out.println("                                         ");
                    System.out.println("-----------------------------------------");
                    System.out.println("Ingrese las cordenadas de la base(A) : ");
                    System.out.println("-----------------------------------------");
                    
                    crdA = leer.nextDouble();
                    
                    
                    System.out.println("                                         ");
                    System.out.println("-----------------------------------------");
                    System.out.println("Ingrese las cordenadas de la parte superior(B) : ");
                    System.out.println("-----------------------------------------");
                    crdB = leer.nextDouble();
                    
                    
                    System.out.println("                                         ");
                    System.out.println("-----------------------------------------");
                    System.out.println("Ingrese las cordenadas de parte isquierda(C) : ");
                    System.out.println("-----------------------------------------");
                    
                    crdC = leer.nextDouble();
                    
                    
                    System.out.println("                                         ");
                    System.out.println("-----------------------------------------");
                    System.out.println("Ingrese las cordenadas de lado derecho(D) : ");
                    System.out.println("-----------------------------------------");
                    
                    crdD = leer.nextDouble();
                    
                    perimetro_cuadrado = crdA + crdB + crdC + crdD;
                    if(crdA == crdB && crdA == crdC && crdA == crdD){
                        System.out.println("                                                    ");
                        System.out.println("------------------------------------------------------");
                        System.out.println("las cordenadas ingresadas pueden ser de dos figuras.");
                        System.out.println("------------------------------------------------------");
                        System.out.println("1.-Cuadrado");
                        System.out.println("2.-Rombo");
                        System.out.println("--------------------");
                        System.out.print("que opcion desea:");
                        opcion = leer.nextInt();
                        
                        if(opcion == 1){
                          areacuadrado =(crdA * crdC);
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
                            area_rombo = crdA * crdC /2;
                            perimetro_rombo = crdA *4;
                            if(opcion == 2){
                                System.out.println("---------------------------------------");
                                System.out.println("la figura ingresada es un Rombo.");
                                System.out.println("---------------------------------------");
                                System.out.println("                                       ");
                                System.out.println("                    *");
                                System.out.println("                  * * *");
                                System.out.println("                * * * * *");
                                System.out.println("              * * * * * * *");
                                System.out.println("            * * * * * * * * *");
                                System.out.println("              * * * * * * *");
                                System.out.println("                * * * * *");
                                System.out.println("                  * * *");
                                System.out.println("                    *");
                                System.out.println("                                                 ");
                                System.out.println("                                                 ");
                                System.out.println("-------------------------------------------------");
                                System.out.println("el area del rombo es: "+area_rombo);
                                System.out.println("-------------------------------------------------");
                                System.out.println("el perimetro del rombo es: "+perimetro_rombo);
                            }
                        }
                        
                    }else{
                        perimetro_rectangulo = crdA + crdA + crdC + crdC;
                        arearectangulo = crdA * crdB;
                        if(crdA == crdB && crdC ==crdD){
                            
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
                            
                        }else{
                            n= crdA - crdB/2;
                            alturatr = crdC *crdC -n * n;
                            System.out.println((double)Math.round(alturatr * 3));
                            area_trapecio = crdA + crdB * alturatr/2;
                            perimetro_trapecio= crdA + crdB + crdC*2;
                            if(crdC == crdD && crdA != crdB){
                                System.out.println("-------------------------------------------------");
                                System.out.println("la figura ingresada es un trapecio");
                                System.out.println("-------------------------------------------------");
                                System.out.println("");
                                System.out.println("                                                 ");
                                System.out.println("                                                 ");
                                System.out.println("                                                 ");
                                System.out.println("                                                 ");
                                System.out.println("                                                 ");
                                System.out.println("              *******************");
                                System.out.println("            * |                    *  ");
                                System.out.println("          *h: |"+alturatr+          "*   " );
                                System.out.println("        *     |                        *  ");
                                System.out.println("      ************************************  ");
                                System.out.println("                                                  ");
                                System.out.println("                                                 ");
                                System.out.println("                                                 ");
                                System.out.println("-------------------------------------------------");
                                System.out.println("el area del trapecio es: "+area_trapecio);
                                System.out.println("-------------------------------------------------");
                                System.out.println("el perimetro del trapecio es: "+perimetro_trapecio);
                            }
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
