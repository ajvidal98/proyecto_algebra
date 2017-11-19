
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
        double area_romboide = 0.0;
        double perimetro_romboide = 0.0;
        double altura_romboide = 0.0;
        double area_trapezoide_1= 0.0;
        double area_trapezoide_2= 0.0;
        double D1= 0.0;
        double perimetro_trapezoide= 0.0;
        double angulo = 0.0;
        double s = 0.0;
        int opc;
        int opcion;
        int contador = -1;
        int contador_equilatero = 0;
        int contador_isoceles = 0;
        int contador_escaleno = 0;
        int contador_cuadrado = 0;
        int contador_rectangulo = 0;
        int contador_rombo = 0;
        int contador_romboide = 0;
        int contador_trapecio = 0;
        int contador_trapezoide = 0;
        
        
        System.out.println("----------------------------------------");
        System.out.println("Sofwere de Algebra");
        System.out.println("----------------------------------------");
        while(true){
            System.out.println("                                        ");
            System.out.println("cuantos puntos desea ingresar?");
            System.out.println("1.- 3 Puntos.");
            System.out.println("2.- 4 Puntos.");
            System.out.println("3.-Salir.");
            System.out.println("----------------------------------------");
            System.out.print("ingrese su opcion: ");
            opc = leer.nextInt();
            System.out.println("----------------------------------------");
            contador = contador +1;
            if(opc != 1 && opc != 2 && opc != 3){
                System.out.println("profe, no se ponga tierno. es solo numeros.  XD");
                continue;
            }
            
            if(opc == 1){
                System.out.println("                                             ");
                System.out.println("---------------------------------------------");
                System.out.print("Ingrese las coordenadas de la base:      ");
                
                
                crdA = leer.nextDouble();
                
                
                System.out.println("                                             ");
                System.out.println("---------------------------------------------");
                System.out.print("Ingrese las cordenadas de la altura:     ");
                
                
                crdB = leer.nextDouble();
                
              
                System.out.println("                                             ");
                System.out.println("---------------------------------------------");
                System.out.print("Ingrese las cordenadas de un lado x1:    ");
                
                
                crdC = leer.nextDouble();
                
                
                area =(crdA * crdB)/2;
                perimetro_equilatero = crdA *3;
                if(crdA == crdC && crdA == crdB){
                    contador_equilatero = contador_equilatero +1;
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
                        contador_isoceles = contador_isoceles +1;
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
                            contador_isoceles = contador_isoceles +1;
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
                                contador_escaleno = contador_escaleno +1;
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
                    System.out.print("Ingrese las cordenadas de la base(A) :           ");
                    
                    
                    crdA = leer.nextDouble();
                    
                    
                    System.out.println("                                         ");
                    System.out.println("-----------------------------------------");
                    System.out.print("Ingrese las cordenadas de la parte superior(B) : ");
                    
                    crdB = leer.nextDouble();
                    
                    
                    System.out.println("                                         ");
                    System.out.println("-----------------------------------------");
                    System.out.print("Ingrese las cordenadas de parte isquierda(C) :   ");
                    
                    
                    crdC = leer.nextDouble();
                    
                    
                    System.out.println("                                         ");
                    System.out.println("-----------------------------------------");
                    System.out.print("Ingrese las cordenadas de lado derecho(D) :      ");
                    
                    
                    crdD = leer.nextDouble();
                    if(crdA == crdB && crdA != crdC && crdA != crdD && crdC != crdD)
                    if(crdA == crdC && crdB != crdD){
                        System.out.println("                                       ");
                        System.out.println("---------------------------------------");
                        System.out.println("profe, no existe esa figura.");
                        System.out.println("---------------------------------------");
                        continue;
                    }
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
                        if(opcion != 1 && opcion != 2){
                            System.out.println("profe. es 1 y 2");
                            continue;
                            
                        }
                        if(crdA == crdB && crdA != crdC && crdA == crdD){
                            
                            System.out.println("figura no existe");
                            continue;
                        }
                        if(opcion == 1){
                          areacuadrado =(crdA * crdC);
                            contador_cuadrado = contador_cuadrado +1;
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
                                contador_rombo = contador_rombo +1;
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
                            System.out.println("                                                    ");
                            System.out.println("------------------------------------------------------");
                            System.out.println("las cordenadas ingresadas pueden ser de dos figuras.");
                            System.out.println("------------------------------------------------------");
                            System.out.println("1.-Rectangulo");
                            System.out.println("2.-Romboide");
                            System.out.println("--------------------");
                            System.out.print("que opcion desea:");
                            opcion = leer.nextInt();
                            
                            if(opcion == 1){
                                arearectangulo = crdA * crdB;
                                contador_rectangulo = contador_rectangulo +1;
                                System.out.println("---------------------------------------");
                                System.out.println("la figura ingresada es un Rectangulo.");
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
                                System.out.println("el area del rectangulo es: "+arearectangulo);
                                System.out.println("-------------------------------------------------");
                                System.out.println("el perimetro del rectangulo es: "+perimetro_rectangulo);
                                
                                
                            }else{
                                if(opcion == 2){
                                    area_romboide = crdA * crdB;
                                    perimetro_romboide = crdA * 2 + crdC * 2;
                                    altura_romboide = area_romboide / crdA;
                                    contador_romboide = contador_romboide +1;
                                    System.out.println("---------------------------------------");
                                    System.out.println("la figura ingresada es un Romboide.");
                                    System.out.println("---------------------------------------");
                                    System.out.println("                                               ");
                                    System.out.println("                                               ");
                                    System.out.println("                                               ");
                                    System.out.println("                                               ");
                                    System.out.println("                 * * * * * * * * * * * * * *");
                                    System.out.println("               * |                       *");
                                    System.out.println("             *   |                     *");
                                    System.out.println("           *     |                   *");
                                    System.out.println("         *       |                 *");
                                    System.out.println("       *      h: | "+altura_romboide+"           *");
                                    System.out.println("     * * * * * * * * * * * * * *");
                                    System.out.println("                                        ");
                                    System.out.println("-------------------------------------------------");
                                    System.out.println("el area del romboide es: "+area_romboide);
                                    System.out.println("-------------------------------------------------");
                                    System.out.println("el perimetro del romboide es: "+perimetro_romboide);
                                    
                                    
                                }
                            }
                            
                            
                            
                        }else{
                            n= crdA - crdB/2;
                            alturatr = crdC *crdC -n * n;
                            System.out.println((double)Math.round(alturatr * 3));
                            area_trapecio = crdA + crdB * alturatr/2;
                            perimetro_trapecio= crdA + crdB + crdC*2;
                            if(crdC == crdD && crdA != crdB){
                                contador_trapecio = contador_trapecio +1;
                                System.out.println("-------------------------------------------------");
                                System.out.println("la figura ingresada es un Trapecio");
                                System.out.println("-------------------------------------------------");
                                System.out.println("");
                                System.out.println("                                                 ");
                                System.out.println("                                                 ");
                                System.out.println("                                                 ");
                                System.out.println("                                                 ");
                                System.out.println("                                                 ");
                                System.out.println("              *******************");
                                System.out.println("            * |                    *  ");
                                System.out.println("          *h: |"+alturatr+"             *" );
                                System.out.println("        *     |                        *  ");
                                System.out.println("      ************************************  ");
                                System.out.println("                                                  ");
                                System.out.println("                                                 ");
                                System.out.println("                                                 ");
                                System.out.println("-------------------------------------------------");
                                System.out.println("el area del trapecio es: "+area_trapecio );
                                System.out.println("-------------------------------------------------");
                                System.out.println("el perimetro del trapecio es: "+perimetro_trapecio);
                                
                            }else{
                                
                                if(crdA != crdB && crdA != crdC && crdA != crdD){
                                    contador_trapezoide = contador_trapezoide +1;
                                    System.out.println("                                                        ");
                                    System.out.println("-----------------------------------------------------------");
                                    System.out.println("esta figua es un trapezoide pero para calcular su area");
                                    System.out.println("debe ingresar un ángulo de 1 hasta 9");
                                    System.out.println("-----------------------------------------------------------");
                                    System.out.print("que opcion desea:");
                                    angulo = leer.nextInt();
                                    
                                    s = crdD + crdB + D1;
                                    area_trapezoide_1 = 1/2 * crdA * crdC * angulo;
                                    area_trapezoide_2 = s * s + crdD * crdD * s * s - crdB * crdB * s * s *D1 * D1;
                                    D1 = crdA * crdA + crdC + crdC -2 * crdA * crdC * angulo ;
                                    perimetro_trapezoide = crdA + crdB + crdC + crdD ;
                                    
                                    System.out.println("-------------------------------------------------");
                                    System.out.println("la figura ingresada es un Trapezoide");
                                    System.out.println("-------------------------------------------------");
                                    System.out.println("");
                                    System.out.println("                           C                      ");
                                    System.out.println("                         *                        ");
                                    System.out.println("                   *      *                           ");
                                    System.out.println("         D     *           *                           ");
                                    System.out.println("           *      D1        *           D1:"+D1+"     ");
                                    System.out.println("          *     *            *");
                                    System.out.println("         *           *        *");
                                    System.out.println("        *                 *    *" );
                                    System.out.println("       * "+angulo+"                     *");
                                    System.out.println("      ****************************  ");
                                    System.out.println("       A                          B                 ");
                                    System.out.println("                                                 ");
                                    System.out.println("                                                 ");
                                    System.out.println("-------------------------------------------------");
                                    System.out.println("el area 1 del trapezoide ABD es: "+area_trapezoide_1);
                                    System.out.println("-------------------------------------------------");
                                    System.out.println("el area 2 del trapezoide BCD es: "+area_trapezoide_2);
                                    System.out.println("-------------------------------------------------");
                                    System.out.println("el perimetro del trapezoide es: "+perimetro_trapezoide);
                                }
                            }
                        }
                        
                            
                        
                    }
                    
                    /***Rombo obj= new Rombo();
                    obj.rom();**/
                }else {
                    if(opc == 3){
                        System.out.println("Gracias por probar el desafio (PERO ESQUE PROFEE.");
                        System.out.println("                                                 ");
                        System.out.println("-------------------------------------------------");
                        System.out.println(" cantidad de triangulos equilateros :     "+contador_equilatero);
                        System.out.println("-------------------------------------------------");
                        System.out.println(" cantidad de triangulos izoceles :        "+contador_isoceles);
                        System.out.println("-------------------------------------------------");
                        System.out.println(" cantidad de triangulos escalenos :       "+contador_escaleno);
                        System.out.println("-------------------------------------------------");
                        System.out.println(" cantidad de cuadrados :                  "+contador_cuadrado);
                        System.out.println("-------------------------------------------------");
                        System.out.println("cantidad de rectangulos :                 "+contador_rectangulo);
                        System.out.println("-------------------------------------------------");
                        System.out.println("cantidad de rombos :                      "+contador_rombo);
                        System.out.println("-------------------------------------------------");
                        System.out.println("cantidad de romboides                     "+contador_romboide);
                        System.out.println("-------------------------------------------------");
                        System.out.println("cantidad de trapecios                     "+contador_trapecio);
                        System.out.println("-------------------------------------------------");
                        System.out.println("cantidad de trapezoides                   "+contador_trapezoide);
                        System.out.println("-------------------------------------------------");
                        System.out.println("                                                 ");
                        System.out.println("                                                 ");
                        System.out.println("Cantidad de figuras ingresadas :          "+ contador);
                        System.out.println("-------------------------------------------------");
                        break;
                    }
                }
            }
        }
    
    }
    
}
