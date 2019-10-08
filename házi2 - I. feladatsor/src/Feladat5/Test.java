/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Feladat5;

import java.util.Random;

/**
 *
 * @author Magyar Melinda Barbara
 */
public class Test {

    public static void main(String[] args) {
        Random rnd = new Random();
        int[] t = new int[30];

        for (int i = 0; i < t.length; i++) {
            t[i] = rnd.nextInt(10);
        }

        printArray(t);

        long timeStart = System.currentTimeMillis();
        insertionSort(t);
        long timeEnd = System.currentTimeMillis();

        printArray(t);

        System.out.println(timeEnd - timeStart);
    }

    static void printArray(int[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }

    
    static void insertionSort(int[] a) {
       // Write your code here
       
        int i = 1;
        while(i < a.length) {
            int j = i;
            
            while(0 < j && a[j] < a[j - 1]) {
                int tmp = a[j];
                a[j] = a[j - 1];
                a[j - 1] = tmp;
                
                j -= 1;
            }
            i += 1;
        }
    }
}
