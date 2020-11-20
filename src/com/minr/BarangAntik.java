package com.minr;

public class BarangAntik {
    private final int umur;

    public BarangAntik(int umur) {
        this.umur = umur;
    }

    public void tampilUmur() {
        System.out.println("Umur barang antik ini adalah : " + this.umur + " tahun.");
    }
}
