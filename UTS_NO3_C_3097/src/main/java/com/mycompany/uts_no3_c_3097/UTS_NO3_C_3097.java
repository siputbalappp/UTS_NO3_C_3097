/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.uts_no3_c_3097;

/**
 *
 * @author DELL
 */
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class UTS_NO3_C_3097 {

    public static void main(String[] args) {
        AsistenPraktikum_3097[] ap = new AsistenPraktikum_3097[1];
        StudentStaff_3097[] ss = new StudentStaff_3097[1];
        
        ap[0] = new AsistenPraktikum_3097();
        ss[0] = new StudentStaff_3097();

         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                  
         try {
                for(int i = 0; i < 1; i++){
                System.out.print("NIM              : ");
                ap[i].nim_3097 = br.readLine();
                System.out.print("Nama             : ");
                ap[i].nama_3097 = br.readLine();
                System.out.print("Jurusan          : ");
                ap[i].jurusan_3097 =br.readLine();
                System.out.print("IPK              : ");
                ap[i].ipk_3097 =Integer.parseInt(br.readLine());
                System.out.print("Mata Kuliah      : ");
                ap[i].mkAsistensi = br.readLine();
                System.out.print("Jumlah Pertemuan : ");
                ap[i].jmlPertemuan = Integer.parseInt(br.readLine());
                System.out.println();
            }
                System.out.println("Menampilkan Data Asisten Praktikum");
            for(AsistenPraktikum_3097 AP : ap){
                AP.tampilDataAsistenPraktikum();
                System.out.println("");
            }
            for(int i = 0; i < 1; i++){
                System.out.print("NIM         : ");
                ss[i].nim_3097 = br.readLine();
                System.out.print("Nama        : ");
                ss[i].nama_3097 = br.readLine();
                System.out.print("Jurusan     : ");
                ss[i].jurusan_3097 =br.readLine();
                System.out.print("IPK         : ");
                ss[i].ipk_3097 =Integer.parseInt(br.readLine());
                System.out.print(" Unit Kerja : ");
                ss[i].unitKerja_3097 = Integer.parseInt(br.readLine());
                System.out.print("Jam Kerja   : ");
                ss[i].jamKerja_3097 = Integer.parseInt(br.readLine());
                System.out.println();
            }
            
            System.out.println("DATA STUDENT STAFF");
            for(StudentStaff_3097 SS : ss){
                SS.tampilDataStudentStaff();
                System.out.println("");
            }
    }
         catch (Exception ex){ // menangkap kesalahan
            System.out.println(ex);
         }
    }
}
