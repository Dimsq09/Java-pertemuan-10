/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.asset;

/**
 *
 * @author A-10
 */
public class  Motor implements KendaraanBermotor {

    @Override
    public void gasPol() {
        System.out.println("Gas sampai 100km/jam");
    }

    @Override
    public void ngerem() {
       System.out.println("Sampai kendaraan berhenti");
    }
    
}
