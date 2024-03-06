/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Metódusok;

import java.util.Arrays;

/**
 *
 * @author Magyar Melinda Barbara
 */

public class Metódusok {

    public static void main(String[] args) {
        first(5, 2, 1);
        
        second(5, -6, 1);
        
        third(0, 1, 2, 3);
        third(3, 2, 1, 0);

        System.out.println("Triangle? " + fourth(1, 2, 3));
        System.out.println("Triangle? " + fourth(5, 5, 6));
        
        System.out.println("");
        System.out.println("Leap year's:" + fifth(1996, 2016));
        
        System.out.println("");
        sixth(5);
        
        System.out.println("");
        System.out.println("Egesz hanyados: " + seventh(15, 5));
        
        System.out.println("");
        System.out.println("Prime? "+ eighth(5));
        System.out.println("Prime? "+ eighth(36));
        
        System.out.println("");
        ninth(10);
        
        System.out.println("");
        System.out.println("Backwards: " + tenth(523));
        
        System.out.println("");
        System.out.println("Factorial: " + eleventh(12));
        
        System.out.println("");
        twelfth(5, 35, 5);
        
        System.out.println("");
        System.out.println("The next Fibonacchi after n: " + thirteenth(10));
        
        fourteenth();
    }

    public static void first(int a, int b, int c) {
        int[] array = new int[3];
        array[0] = a;
        array[1] = b;
        array[2] = c;

        Arrays.sort(array);

        System.out.println("Sorted numbers:");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);

            if (i != array.length - 1) 
                System.out.print(" ");
            else 
                System.out.println("");
        }
        
        System.out.println("");
    }
    
    public static void second(double a, double b, double c) {
        double[] array = new double[3];
        array[0] = a;
        array[1] = b;
        array[2] = c;
        
        Arrays.sort(array);
        
        System.out.println(array[0] + "  " + array[1] + "  " + array[2]);
        System.out.println("Minimum: " + array[0]);
        
        for (int i = 0; i < array.length; i++) 
            array[i] = Math.abs(array[i]);
        
        Arrays.sort(array);
        
        System.out.println("Absolute maximum value: " + array[2]);
        System.out.println("");
    }
    
    public static void third(double a, double b, double c, double d) {
        System.out.println(a + " " + b + " " + c + " " + d);
        
        if (d >= 0) 
            System.out.println(a + " " + c  + " " + b + " " + d);
        else 
            System.out.println(a + " " + b + " " + d + " " + c);
       
        System.out.println("");
    }
    
    public static boolean fourth(double a, double b, double c) {
        return (a + b) > c && (a + c) > b && (b + c) > a;
    }
    
    public static int fifth(int a, int b) {
        int number = 0;
        
        for (int i = ++a; i < b; i++) 
            if ((i % 4 == 0) && (i % 100 != 0) || (i % 400 == 0))
                number++;
        
        return number;
    }
    
    public static void sixth(int a) {
        switch (a) {
            case 1: 
                System.out.println("Elégtelen");
                break;
            case 2: 
                System.out.println("Kettes.");
                break;
            case 3:
                System.out.println("Hármas.");
                break;
            case 4:
                System.out.println("Négyes");
                break;
            case 5:
                System.out.println("Ötös");
                break;
       } 
    }
    
    public static int seventh(int a, int b) {
        int hanyados = 0;
        
        while (a >= b) {
            hanyados += 1;
            a -= b;
        }
        
        return hanyados;
    }
    
    public static boolean eighth(int n) {            
        for (int i = 2; i < Math.sqrt(n); i++)
            if (n % i == 0) return false;
        
        return true;
    }
    
    public static void ninth(int n) {
        int a  = 1;
        int b = 0;
        
        System.out.print("Fibonacci numbers: ");        
        for (int i = 1; i < n; i++) {
            System.out.print(b + " ");
            b += a;
            a = b - a;
        }
        
        System.out.println("");
    }
    
    public static int tenth(int n) {
        int number = 0;
        
        while (n != 0) {
            int remains = n % 10;
            number = number * 10 + remains;
            n /= 10;
        }
        
        return number;
    }
    
    public static long eleventh(int n) {
        long factorial= 1L; 
        
        for (int i = 1; i < n; i++) 
            factorial *= i;
        
        return factorial;
    }
    
    public static void twelfth(int n1, int n2, int k) {
        for (int i = ++n1; i < n2; i++) 
            if (i % k == 0)
                System.out.print(i + " ");
        
        System.out.println("");
    }
    
    public static int thirteenth(int n) {
        int a  = 1;
        int b = 0;
        
        do {
            b += a;
            a = b - a;
            
        } while (n >= a); 
        
        return a;
    }
    
    public static void fourteenth() {       
        System.out.println("");
        System.out.print("These number are equivalent with their ^3: ");
        
        for (int i = 1; i < 1000; i++) {
            int number = i;
            int sum = 0; 
            int n = 0; 
            
            do {
                n = number % 10; 
                sum += Math.pow(n, 3); 
                number /= 10; 
            } while(number != 0);
            
            if (sum == i) System.out.print(i + " ");
        }
        
        System.out.println("");
    }
    
}