/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.uts_no3_c_3097;

/**
 *
 * @author DELL
 */
public class AsistenPraktikum_3097 extends Mahasiswa_3097 {
    String mkAsistensi;
    int jmlPertemuan;
    
    public double totalPendapatan(){
        return(jmlPertemuan * 50000);
    }
    public void tampilDataAsistenPraktikum() {
    super.tampilDataMahasiswa_3097();
    System.out.println("Mata Kuliah :" + mkAsistensi);
    System.out.println("Jumlah Pertemuan :" + jmlPertemuan);
    System.out.println(" Total Pendapatan : " + totalPendapatan());
    }   
}
