/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author OS
 */

import java.io.*;
import java.util.Scanner;

public class ScannerVsBufferedReader {
    public static void main(String[] args) {

        // ===== Scanner : bisa langsung baca int, double, dll =====
        Scanner sc = new Scanner(System.in);
        System.out.print("[Scanner] Masukkan nama : ");
        String nama1 = sc.nextLine();
        System.out.print("[Scanner] Masukkan umur : ");
        int umur1 = sc.nextInt();   // langsung int
        System.out.println("Hasil Scanner        : " + nama1 + ", " + umur1 + " tahun");

        // ===== BufferedReader : hanya String, angka diubah manual =====
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("\n[BufferedReader] Masukkan nama : ");
            String nama2 = br.readLine();
            System.out.print("[BufferedReader] Masukkan umur : ");
            int umur2 = Integer.parseInt(br.readLine());   // diubah manual
            System.out.println("Hasil BufferedReader : " + nama2 + ", " + umur2 + " tahun");
        } catch (IOException e) {
            System.out.println("Terjadi kesalahan: " + e.getMessage());
        }
    }
}

//Scanner                               BufferedReader
//java.util                             java.io
//lebih lambat karna ada proses         Lebih Cepat, Cocok Untuk
//parsing                               Data Besar
//mudah di pakai kodenya pendek         Kodenya Lebih Rumit Dan Panjang