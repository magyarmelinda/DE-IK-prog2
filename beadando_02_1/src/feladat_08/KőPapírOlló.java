/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package feladat_08;

import java.util.Scanner;

/**
 *
 * @author Magyar Melinda Barbara
 */

public class KőPapírOlló {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = "";

        while (!line.equals("vege")) {
            line = sc.nextLine();

            if (!line.equals("ko") && !line.equals("papir") && !line.equals("ollo") && !line.equals("vege")) 
                line = sc.nextLine();
            else if (line.equals("vege"))
                break;
            else {
                int computer = (int) (Math.random() * 3);

                System.out.println("Számítógép:" + ((computer == 0) ? "kő" : (computer == 1) ? "papír" : "olló"));

                int player = 0;
                switch (line) {
                    case "ko":
                        player = 0;
                        break;
                    case "papir":
                        player = 1;
                        break;
                    case "ollo":
                        player = 2;
                }

                if (player == computer) 
                    System.out.println("Döntetlen!");
                else if (player == 0 && computer == 2 || player == 1 && computer == 0 || player == 2 && computer == 1) 
                    System.out.println("Játékos nyert!");
                else 
                    System.out.println("Számítógép nyert!");
            }

        }
    }
    
}
