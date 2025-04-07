/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package act1_ejercicio7_1;

import java.util.Scanner;

/**
 *
 * @author GLORIA PAULINA MORENO SALDIVAR
 */
public class Act1_Ejercicio7_1 {

    public static void main(String[] args) {
        Scanner asignar = new Scanner(System.in);
        
        double Pesos, MndInter;
        int Moneda;
        
        System.out.println();
        Pesos = asignar.nextDouble();
        
        System.out.println("Selecciona la moneda a convertit:");
        System.out.println("1.Dolar (USD)");
        System.out.println("2.Euro (EUR)");
        System.out.println("3.Bath(THB)");
        System.out.println("4.Yen (JPY)");
        System.out.println("5.Won (KRW)");
        System.out.println("6.Dolar Australiano (AUD)");
        System.out.println("7.Sol (PEN)");
        System.out.println("8.Dolar Canadiense (CAD)");
        System.out.println("9.Bolivar (VES)");
        System.out.println("10.Peso Argentino(ARS)");
        
        Moneda = asignar.nextInt();
        switch (Moneda)
                {
                    case 1:
                        MndInter = Pesos / 24.44;
                        System.out.println("La conversion de Pesos Mexicanos a dolares es de: " + MndInter);
                    break;
                    case 2:
                        MndInter = Pesos / 22.62;
                        System.out.println("La conversion de Pesos Mexicanos a euros es de: " + MndInter);
                    break;
                    case 3:
                        MndInter = Pesos / 0.59;
                        System.out.println("La conversion de Pesos Mexicanos a bathes es de: " + MndInter);
                    break;
                    case 4:
                        MndInter = Pesos / 0.14 ;
                        System.out.println("La conversion de Pesos Mexicanos a yenes es de: " + MndInter);
                    break;
                    case 5:
                        MndInter = Pesos / 0.014;
                        System.out.println("La conversion de Pesos Mexicanos a wones es de: " + MndInter);
                    break;
                    case 6:
                        MndInter = Pesos / 12.45 ;
                        System.out.println("La conversion de Pesos Mexicanos a dolares australianos es de: " + MndInter);
                    break;
                    case 7:
                        MndInter = Pesos / 5.59 ;
                        System.out.println("La conversion de Pesos Mexicanos a soles es de: " + MndInter);
                    break;
                    case 8:
                        MndInter = Pesos / 14.52 ;
                        System.out.println("La conversion de Pesos Mexicanos a dolares canadienses es de: " + MndInter);
                    break;
                    case 9:
                        MndInter = Pesos / 3.49 ;
                        System.out.println("La conversion de Pesos Mexicanos a bolivares es de: " + MndInter);
                    break;
                    case 10:
                        MndInter = Pesos * 0.019;
                        System.out.println("La conversion de Pesos Mexicanos a pesos argentinos es de: " + MndInter);
                    break;
                    
                }
    }
}

