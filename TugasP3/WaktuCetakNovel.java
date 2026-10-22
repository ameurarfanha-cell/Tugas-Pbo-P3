/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author OS
 */
import java.util.Scanner;

public class WaktuCetakNovel {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("-------------------------");
        System.out.println("       Keterangan        ");
        System.out.println("-------------------------");
        System.out.println("1 menit : 60 detik");
        System.out.println("1 jam   : 3600 detik");
        System.out.println("1 hari  : 86400 detik");
        System.out.println("-------------------------");
        System.out.println();

        System.out.print("Banyak novel yang dicetak : ");
        int novel = in.nextInt();
        System.out.print("Tebal lembar per novel    : ");
        int lembar = in.nextInt();

        int totalDetik = novel * lembar;   // 1 lembar/detik

        int hari = totalDetik / 86400;
        int sisa = totalDetik % 86400;
        int jam = sisa / 3600;
        sisa = sisa % 3600;
        int menit = sisa / 60;
        int detik = sisa % 60;

        System.out.println();
        System.out.println("Waktu yang diperlukan:");
        System.out.println("Hari  : " + hari);
        System.out.println("Jam   : " + jam);
        System.out.println("Menit : " + menit);
        System.out.println("Detik : " + detik);
    }
}
