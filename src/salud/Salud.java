
package salud;

import java.util.Scanner;

public class Salud 
{
    public static void main(String[] args)
    {
        Scanner lector=new Scanner (System.in);
        int edad=0;
        double peso=0,talla=0;
        double acPesosGestMen18=0,acPesosGestMay18=0;
        double acTallaGestMen18=0,acTallaGestMay18=0;
        double contGestMen18=0,contGestMay18=0;
        double promTallaGestMen18=0,promTallaGestMay18=0;
        double promPesoGestMen18=0,promPesoGestMay18=0;
        for (int i=1;i<=2;i=i+1) 
        {
            System.out.println("ingrese edad de gestante:");
            edad=lector.nextInt();
            System.out.println("ingrese talla de gestante:");
            talla=lector.nextDouble();
            System.out.println("ingrese peso de gestante:");
            peso=lector.nextDouble();
            if (edad>=18)
            {//gestantes mayorez de edad 
               contGestMay18=contGestMay18+1; 
               acTallaGestMay18=acTallaGestMay18+talla;
               acPesosGestMay18=acPesosGestMay18+peso;
            }
            else
            {//gestantes menores de edad
               contGestMen18=contGestMen18+1;
               acTallaGestMen18=acTallaGestMen18+talla;
               acPesosGestMen18=acPesosGestMen18+peso;
            }    
            
        }
        promTallaGestMay18=acTallaGestMay18/contGestMay18;
        promTallaGestMen18=acTallaGestMen18/contGestMen18; 
        promPesoGestMay18=acPesosGestMay18/contGestMay18;
        promPesoGestMen18=acPesosGestMen18/contGestMen18;
        System.out.println("Gestantes>18 años:"+contGestMay18);
        System.out.println("Gestantes<18 años:"+contGestMen18);
        System.out.println("prom.peso Gest >18años:"+ promPesoGestMay18);
        System.out.println("prom.peso Gest <18años:"+ promPesoGestMen18);
        System.out.println("prom.talla Gest >18años:"+ promTallaGestMay18);
        System.out.println("prom.talla Gest <18años:"+ promTallaGestMen18);
    }
    
}
