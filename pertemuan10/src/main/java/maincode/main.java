/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maincode;

import com.asset.Mobil;
import com.asset.MobilMewah;

/**
 *
 * @author A-10
 */
public class main {
    public static void main(String[] args) {
        Mobil mobill = new Mobil();
        System.out.print("Merk mobill = " + mobill.getMerk());
        Mobil mobil2 = new Mobil("Hitam",200000,230,"Avansa");
        System.out.println("Merek mobil2 = "+ mobil2.getMerk());
        Mobil mobil3 = new Mobil("Putih", "sigra");
        System.out.println("Merek mobil3 = "+ mobil3.getMerk());
        Mobil mobil4 = new MobilMewah("Italia");
        System.out.println("Merek mobil4 = "+ mobil4.getMerk());
        mobil4.getInfo();
        mobil4.setHarga(700000);
        mobil4.getInfo();
        
        Mobil mobilMewah2 = new MobilMewah(800000.0, "Lamborgini");
        mobilMewah2.getInfo();
        mobil4.gasPol();
    }
}
