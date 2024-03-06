/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package feladat_11;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author Magyar Melinda Barbara
 */

public class Egyetem {
    protected ArrayList<Személy> személyek = new ArrayList();
    
    public ArrayList<Személy> getSzemélyek() {
        return személyek;
    }
    
    public void újHallgató(Hallgató hallgató) {
        this.személyek.add(hallgató);
    }
    
    public void újOktató(Oktató oktató) {
        this.személyek.add(oktató);
    }
    
    public void hallgatóTörlése(Hallgató hallgató) {
        this.személyek.remove(hallgató);
    }

    public void oktatóTörlése(Oktató oktató) {
        this.személyek.remove(oktató);
    }
    
    public void legfiatalabbHallgatók() {
        int darab = 0;
        Collections.sort(this.személyek);
        
        if (this.személyek.size() < 3)
            for (Személy i : this.személyek)
                System.out.println(i);
        else {
            for (Személy i : this.személyek) {
                if (i instanceof Hallgató){
                    System.out.println(i.név + " " + i.életkor);
                    darab++;
                }
            
                if (darab == 3) 
                    break;
            }    
        }
    }
    
    public void itTanszék() {
        for (Személy i : this.személyek) {
            if (i instanceof Oktató) {
                Oktató o = (Oktató) i;
                
                if ((!o.isFérfi()) && o.tanszék.equals("IT"))
                    o.setNév(o.getNév() + "!");
            }
        }
    }
    
}
