/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author OS
 */
import java.util.Scanner;

public class SelisihWaktu {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Waktu pertama");
        System.out.print("Jam   : ");
        int j1 = in.nextInt();
        System.out.print("Menit : ");
        int m1 = in.nextInt();
        System.out.print("Detik : ");
        int d1 = in.nextInt();

        System.out.println("Waktu kedua");
        System.out.print("Jam   : ");
        int j2 = in.nextInt();
        System.out.print("Menit : ");
        int m2 = in.nextInt();
        System.out.print("Detik : ");
        int d2 = in.nextInt();

        int detik1 = j1 * 3600 + m1 * 60 + d1;
        int detik2 = j2 * 3600 + m2 * 60 + d2;
        int selisih = detik2 - detik1;
        if (selisih < 0) {
            selisih = selisih * -1;
        }

        int jam = selisih / 3600;
        int menit = (selisih % 3600) / 60;
        int detik = selisih % 60;

        System.out.println();
        System.out.println("Selisih waktu : " + jam + " jam " + menit + " menit " + detik + " detik");
    }
}
