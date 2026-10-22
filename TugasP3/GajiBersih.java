/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author OS
 */

import java.util.Scanner;

public class GajiBersih {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.println("Nomor Induk Karyawan : ");
        String npm = in.nextLine();
        System.out.println("Nama Karyawan : ");
        String nama = in.nextLine();
        System.out.println("Alamat : ");
        String alamat = in.nextLine();
        
        
        String jabatan = "Manajer";
        double p1 = 2000000;
        double p2 = 300000;
        double p3 = 200000;
        double p4 = 150000;
        
        double totalGaji = p1 + p2 + p3 + p4;
        double pajak = 0.10 * (p1 + p2 +p3);
        double gajiBersih = totalGaji - pajak;
        
        System.out.println("\n===== SLIP GAJI =====");
        System.out.println("NIK                : "+ npm);
        System.out.println("Nama               : "+ nama);
        System.out.println("Alamat             : "+ alamat);
        System.out.println("Jabatan            : "+ jabatan);
        System.out.println("Gaji Pokok         : " + (long) p1);
        System.out.println("Tunjangan Jabatan  : " + (long) p2);
        System.out.println("Tunjangan Istri    : " + (long) p3);
        System.out.println("Tunjangan Anak     : " + (long) p4);
        System.out.println("Total Gaji         : " + (long) totalGaji);
        System.out.println("Pajak Penghasilan  : " + (long) pajak);
        System.out.println("Gaji Bersih        : " + (long) gajiBersih);
    }
        
        
    }

