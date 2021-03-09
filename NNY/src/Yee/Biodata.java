package Yee;

import java.util.Scanner;

public class Biodata {

    String nama, kelas;
    int umur;
    Biodata biodata;
    Scanner s = new Scanner(System.in);

    public Biodata(String nama, String kelas, int umur){
        this.nama = nama;
        this.kelas = kelas;
        this.umur = umur;
    }

    public Biodata all(){
        String nama = s.nextLine();
        String kelas = s.nextLine();
        int umur = s.nextInt();
        Biodata b = new Biodata(nama, kelas, umur);
        biodata = b;
        return b;
    }
    public void display(){
        System.out.println("Nama : " + nama + "\nKelas : " + kelas + "\nUmur : " + umur);
    }
}
