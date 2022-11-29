/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.uts_no3_c_3097;

/**
 *
 * @author DELL
 */
public class StudentStaff_3097 extends Mahasiswa_3097 {
    int unitKerja_3097, jamKerja_3097;
    
    public double totalPendapatan(){
        return (jamKerja_3097 * 30000);
       
    }
    
    public void tampilDataStudentStaff(){
        super.tampilDataMahasiswa_3097();
        System.out.println(" Unit Kerja : " + unitKerja_3097);
        System.out.println(" Jam Kerja : " +jamKerja_3097);
        System.out.println(" Total Pendapatan Student Staff : " +totalPendapatan());
    }
}
