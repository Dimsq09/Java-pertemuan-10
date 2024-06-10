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
public class Mobil implements KendaraanBermotor{
    private String warna;
    private int kecepatan;
    private double harga;
    private String merk;
    
    public Mobil(){
        System.out.println("ini ada constructor");
        this.harga = 300000.00;
        this.merk = "TOyota Innova";
        this.kecepatan = 250;
        this.warna = "Merah";
        System.out.println("konstruktor 1, tanpa parameter");
    }

    public Mobil(String warna, int kecepatan, double harga, String merk) {
        this.warna = warna;
        this.kecepatan = kecepatan;
        this.harga = harga;
        this.merk = merk;
        System.out.println("konstruktor 2, tanpa parameter");
    }

    public Mobil(String warna, String merk) {
        this.warna = warna;
        this.merk = merk;
    }
    
    
    
    public String getMerk () {
        return merk;
    }
    
     public double getHarga() {
        return harga;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }
    
    public void getInfo(){
        System.out.println("Merek :" + this.merk);
        System.out.println("Harga :" + getHarga());
        System.out.println("KEcepatan maksimal (km/jam) :" + this.kecepatan);
        System.out.println("Warma :" + this.warna);
    }

    @Override
    public void gasPol() {
        System.out.println("gas sampai batas maksimal");
    }

    @Override
    public void ngerem() {
        System.out.println("Kendaraan berhenti");
    }
    
}

