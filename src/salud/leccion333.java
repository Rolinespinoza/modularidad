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
public class leccion333 
{
    public static void menu()
    {
        System.out.println("=====================");
        System.out.println("MENU");
        System.out.println("=====================");
        System.out.println("1.suma");
        System.out.println("2.resta");
        System.out.println("3.salir");
        System.out.println("Ingrese una opción!!!!");
    }
    public static void main(String[] args) 
    {
        Scanner br= new Scanner(System.in);
        int opcion=0;
        menu();
        opcion=br.nextInt();
        while(opcion!=3)
        {
            switch(opcion)
            {  
                case 1:
                {
                System.out.println("*****************************************");
                System.out.println("ingrese un numero");
                int a=br.nextInt();
                System.out.println("ingrese otro numero");
                int b=br.nextInt();
                int suma=sumar(a,b);
                System.out.println("la suma es: "+suma);
                System.out.println("=========================================");
                break;
            
                }
                case 2:
                {
                System.out.println("**************************************");
                System.out.println("ingrese un numero");
                int a=br.nextInt();
                System.out.println("ingrese otro numero");
                int b=br.nextInt();
                int resta=restar(a,b);
                System.out.println("la resta es: "+resta);
                        System.out.println("=========================================");
                        break;
                        
                 }
            }
            menu();
            opcion=br.nextInt();
        }
    }
    public static int sumar(int r, int s)
    {
        int R=r+s;
        return R;
    }
     public static int restar(int r, int s)
    {
        int R=r-s;
        return R;
    }
    
}
