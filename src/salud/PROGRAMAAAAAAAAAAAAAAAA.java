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
public class PROGRAMAAAAAAAAAAAAAAAA 
{
    public static void tablademultiplicar(int nro)
    {
        int R=0;// R es una variable local a este subprograma
        for (int i = 1; i <= 12; i++) // no lo reconocen en otra subrutina
        {
        R=nro*i;    
            System.out.println(nro+"*"+i+"="+R);
        }
    }
    public static void main(String[] args) 
    {
        Scanner br= new Scanner(System.in);
        int numerotabla=0;// esta es una variable local a este sub programa
        System.out.println("ingrese un numero: ");
        numerotabla=br.nextInt();
        tablademultiplicar(numerotabla);// llamada a la funcion 
        //"tablademultiplicar"
        // desde la subrutina main 
    }
    
}
