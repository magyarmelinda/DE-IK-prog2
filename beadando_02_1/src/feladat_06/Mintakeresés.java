/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package feladat_06;

/**
 *
 * @author Magyar Melinda Barbara
 */

public class Mintakeresés {

    public static boolean isConsecutiveFour(int[] values) {
        int count = 1;

        if (values.length < 4) 
            return false;

        for (int i = 0; i < values.length - 1; i++) {
            if (values[i] == values[i + 1]) 
                count++;
            else count = 1;

            if (count == 4) 
                return true;
        }
        
        return false;
    }
    
    public static void main(String[] args) {
        int[] tomb = {1, 1, 2, 2, 2, 2};
        int[] tomb2 = {1, 1, 2, 2, 2, 3};
        
        System.out.println(isConsecutiveFour(tomb));
        System.out.println(isConsecutiveFour(tomb2));
    }
    
}
