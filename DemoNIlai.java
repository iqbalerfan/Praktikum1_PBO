package com.Tipedata;

public class DemoNIlai {
    public static void main(String[] args) {

        String nim = "2310631170102";
        String nama = "iqbal gans";
        int nilaiAbsen = 80;
        int nilaiTugas = 85;
        int nilaiUTS = 90;
        int nilaiUAS = 95;


        Nilai nilai = new Nilai(nim, nama, nilaiAbsen, nilaiTugas, nilaiUTS, nilaiUAS);


        nilai.cetakNilai();
    }
}

