/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author OS
 */
import java.util.Scanner;

public class GayaSentripetal {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Massa benda (kg)       : ");
        double m = in.nextDouble();
        System.out.print("Kecepatan (m/s)        : ");
        double v = in.nextDouble();
        System.out.print("Jari-jari lintasan (m) : ");
        double r = in.nextDouble();

        double fc = (m * v * v) / r;

        System.out.println("Gaya sentripetal (Fc)  : " + fc + " N");
    }
}
