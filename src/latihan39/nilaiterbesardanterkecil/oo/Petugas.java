/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan39.nilaiterbesardanterkecil.oo;

/**
 *
 * @author Alfi Nurizkya
 * NAMA     : ALFI NURIZKYA
 * KELAS    : IF-1
 * NIM      : 10119036
 * DESKRIPSI PROGRAM : Membuat Data Program Nilai Terbesar Dan Terkecil Berbasis Object Oriented
 */


import java.util.Scanner;
public class Petugas {

    Scanner scan = new Scanner(System.in);
    private String namaPetugas;
    private int[] arrNilai;

    public void masukkanNama(){
        System.out.print("Masukkan Nama Petugas : ");
        namaPetugas = scan.next();
    }

    public void masukkanNilai(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Masukkan Banyaknya Nilai Mahasiswa : ");
        int jumlah = scan.nextInt();
        arrNilai = new int[jumlah];
        for(int i = 0; i < jumlah; i++){
            System.out.print("Masukkan Nilai Mahasiswa ke-"+(i+1)+" = ");
            arrNilai[i] = scan.nextInt();
        }
        menentukanNilai(arrNilai);
    }

    private void menentukanNilai(int[] nilaiMhs){
        Latihan39NilaiTerbesarDanTerkecilOO nilai = new Latihan39NilaiTerbesarDanTerkecilOO();
        nilai.penentuanNilai(nilaiMhs, namaPetugas);
    }
}
