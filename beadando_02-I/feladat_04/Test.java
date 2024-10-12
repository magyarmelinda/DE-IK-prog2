/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package feladat_04;

/**
 *
 * @author Magyar Melinda Barbara
 */

public class Test {

    public static void rendezMaxSzállíthatóTeherCsökkenőleg(Teherautó[] teher) {
        for (int i = 0; i < teher.length; i++)
            for (int j = i + 1; j < teher.length; j++)
                if (teher[i].getMaxSzállíthatóTeher() < teher[j].getMaxSzállíthatóTeher()) {
                    Teherautó tmp = teher[j];
                    teher[j] = teher[i];
                    teher[i] = tmp;
                }
    }

    public static Autó keresMaxMotorTeljesítmény(Autó[] auto) {
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < auto.length; i++)
            if (auto[i].getMotorTeljesítmény() > max)
                max = auto[i].getMotorTeljesítmény();

        for (int i = 0; i < auto.length; i++)
            if (auto[i].getMotorTeljesítmény() == max)
                return auto[i];

        return null;
    }

    public static void main(String[] args) {
        Autó[] tomb = new Autó[10];
        Teherautó[] teher = new Teherautó[10];

        tomb[0] = new Autó("AGI022", 510);
        tomb[1] = new Autó("AXY-187", 650);
        tomb[2] = new Autó("BYE-299", 280);
        tomb[3] = new Autó("CAR-557", 280);
        tomb[4] = new Autó("CAU-592", 200);
        tomb[5] = new Teherautó("HLW-681", 400, 1);
        tomb[6] = new Teherautó("KAT204", 650, 3);
        tomb[7] = new Teherautó("KIH-271", 600, 4);
        tomb[8] = new Teherautó("KXM-592", 730, 7);
        tomb[9] = new Teherautó("LAE-423", 680, 5);

        teher[0] = new Teherautó("HLW-682", 400, 1);
        teher[1] = new Teherautó("KAT224", 650, 3);
        teher[2] = new Teherautó("KIH-471", 600, 4);
        teher[3] = new Teherautó("KXM-792", 730, 7);
        teher[4] = new Teherautó("LAE-823", 680, 5);
        teher[5] = new Teherautó("HLW-981", 400, 1);
        teher[6] = new Teherautó("KAT234", 650, 3);
        teher[7] = new Teherautó("KIH-671", 600, 4);
        teher[8] = new Teherautó("KXM-192", 730, 7);
        teher[9] = new Teherautó("LAE-923", 680, 5);

        rendezMaxSzállíthatóTeherCsökkenőleg(teher);

        System.out.println("Max szállítható teher:");
        for (Teherautó i : teher)
            System.out.println(i.getRendszám() + " " + i.getMotorTeljesítmény() + " " + i.getMaxSzállíthatóTeher());

        System.out.println("");

        System.out.println("Legnagyobb motorteljesítmény:");
        System.out.println(keresMaxMotorTeljesítmény(tomb).getRendszám() +
                " " +
                keresMaxMotorTeljesítmény(tomb).getMotorTeljesítmény());
    }

}
