package com.Tipedata;

public class matematikaBeraksi {
    public static void main(String[] args) {
        Matematika mtk = new Matematika();
        System.out.println("Pertambahan 20+30 : " + mtk.pertambahan(20, 10));
        System.out.println("Pengurangan 10-5: " + mtk.pengurangan(10, 5));
        System.out.println("Perkalian 10x3: " + mtk.perkalian(10, 3));
        System.out.println("Pembagian 21/2: " + mtk.pembagian(21, 2));
    }
}
