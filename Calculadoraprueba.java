/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadoraprueba;

import java.util.*;

/**
 *
 * @author Administrador
 */
public class Calculadoraprueba {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num1;
        int num2;
        int opc=0;
        Scanner in = new Scanner(System.in);
        System.out.println("this is the first calculator");
        System.out.println("ingresa el primer numero:");
        num1 = in.nextInt();
        System.out.println("ingresa el segundo numero:");
        num2 = in.nextInt();
        System.out.println("que deseas hacer: \n1.-Sumar \n2.-Restar \n3.-multiplicar\n4.dividir \ningresa tu opcion:");
        opc = in.nextInt();
        switch(opc)
        {
            case 1: System.out.println("La Suma de "+num1+" + "+num2+" es: "+(num1+num2)+"");
                break;
            case 2: System.out.println("La Resta de "+num1+" - "+num2+" es: "+(num1-num2)+"");
                break;
            case 3: System.out.println("La Multiplicación de "+num1+" * "+num2+" es: "+(num1*num2)+"");
                break;
            case 4: System.out.println("La División de "+num1+" / "+num2+" es: "+(num1/num2)+"");
                break;
            default : System.out.println("La seleccion escogida es erronea");
                break;
        }
        
    }
    
}
