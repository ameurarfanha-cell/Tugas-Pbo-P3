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

public class Pembelanjaan {

    static void garis() {
        System.out.println("+" + "-".repeat(43) + "+");
    }

    static void baris(String label, String isi) {
        System.out.printf("| %-14s : %-22s |%n", label, isi);
    }

    static String fmt(double d) {
        return d == (long) d ? String.valueOf((long) d) : String.valueOf(d);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String file = "belanja.dat";

        // INPUT
        System.out.print("Nama          : ");
        String nama = in.nextLine();
        System.out.print("Total Belanja : ");
        double totalBelanja = in.nextDouble();
        System.out.print("Diskon (%)    : ");
        double diskon = in.nextDouble();
        System.out.print("Bayar         : ");
        double bayar = in.nextDouble();

        // PROSES
        double total = totalBelanja - (totalBelanja * diskon / 100);
        double kembalian = bayar - total;

        // DataOutputStream : TULIS
        try {
            DataOutputStream dos = new DataOutputStream(new FileOutputStream(file));
            dos.writeUTF(nama);
            dos.writeDouble(totalBelanja);
            dos.writeDouble(diskon);
            dos.writeDouble(total);
            dos.writeDouble(bayar);
            dos.writeDouble(kembalian);
            dos.close();
        } catch (IOException e) {
            System.out.println("Terjadi kesalahan menulis: " + e.getMessage());
        }

        // DataInputStream : BACA
        try {
            DataInputStream dis = new DataInputStream(new FileInputStream(file));
            String n  = dis.readUTF();
            double tb = dis.readDouble();
            double d  = dis.readDouble();
            double t  = dis.readDouble();
            double b  = dis.readDouble();
            double k  = dis.readDouble();
            dis.close();

            System.out.println();
            garis();
            baris("Nama", n);
            baris("Total Belanja", fmt(tb));
            baris("Diskon (%)", fmt(d));
            baris("Total", fmt(t));
            baris("Bayar", fmt(b));
            baris("Kembalian", fmt(k));
            garis();
        } catch (IOException e) {
            System.out.println("Terjadi kesalahan membaca: " + e.getMessage());
        }
    }
}