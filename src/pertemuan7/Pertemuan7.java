/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pertemuan7;

import java.util.Random;
import java.util.Scanner;

public class Pertemuan7 {

   public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukan jumlah angka: ");
        int n = scanner.nextInt();

        int[] array = new int[n];
        Random integer = new Random();
        
        for (int i = 0; i < n; i++) {
            array[i] = integer.nextInt();
        }

        System.out.println("Angka sebelum diurutkan: ");
            print(array);
        
        StopWatch waktu = new StopWatch();
            selectionSort(array);
        waktu.stop();
        
        System.out.println("\nAngka setelah diurutkan: ");
            print(array);
            scanner.close();
        
        System.out.println("Waktu yang dibutuhkan = " + waktu.getElapsedTime() + " milidetik");
    }

    public static void selectionSort(int[] array) {
        int n = array.length;

        for (int i = 0; i < n - 1; i++) {
            int IndexTerkecil = i;

            for (int j = i + 1; j < n; j++) {
                if (array[j] < array[IndexTerkecil]) {
                    IndexTerkecil = j;
                }
            }

            int temp = array[IndexTerkecil];
            array[IndexTerkecil] = array[i];
            array[i] = temp;
        }
    }

    public static void print(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        System.out.println();
    } 
}
