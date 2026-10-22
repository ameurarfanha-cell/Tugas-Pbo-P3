/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author OS
 */
import java.io.*;

public class TotalBuah {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            System.out.print("Jumlah mangga dibeli (pcs)        : ");
            int mangga = Integer.parseInt(br.readLine());
            System.out.print("Jumlah tetangga                   : ");
            int tetangga = Integer.parseInt(br.readLine());
            System.out.print("Jambu per tetangga (pcs)          : ");
            int jambuPerOrang = Integer.parseInt(br.readLine());
            System.out.print("Mangga busuk / dikembalikan (pcs) : ");
            int busuk = Integer.parseInt(br.readLine());

            int jambu = tetangga * jambuPerOrang;
            int manggaBagus = mangga - busuk;
            int total = manggaBagus + jambu;

            System.out.println();
            System.out.println("Mangga setelah retur : " + manggaBagus + " pcs");
            System.out.println("Total jambu          : " + jambu + " pcs");
            System.out.println("Total buah dibeli    : " + total + " pcs");
        } catch (IOException e) {
            System.out.println("Terjadi kesalahan: " + e.getMessage());
        }
    }
}