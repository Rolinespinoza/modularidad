/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package salud;

import java.util.Scanner;

/**
 *
 * @author alum.fial7
 */
public class programanndnqdhnaKÑDH {
    public static void mensaje ()
    {
        System.out.println("bienvenido a todos ");
    }
    public static double sumar(double a , double b)
    {
        double suma=a+b;
        return suma;
    }
    public static void main(String[] args) {
        Scanner br= new Scanner(System.in);
        String nombreee="";
        String apellidooo="";
        double r=12.2;
        double s=12.3;
        System.out.println("ingrese su nombre: ");
        nombreee=br.next();
        System.out.println("ingrese su apellido: ");
        apellidooo=br.next();
        mensaje ();
        saludo(nombreee, apellidooo);
        double producto=sumar(r,s);
        double sumarr;
            System.out.println("la suma es: "+ producto);
    }

public  static void saludo(String nombre, String apellido)
{
System.out.println("hola:"+nombre+" "+apellido);

}


}