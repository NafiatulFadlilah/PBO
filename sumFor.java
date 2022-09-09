/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum1;

/**
 *
 * @author Nafiaaeluv
 */
public class sumFor {
    public static void main(String[] args){
        int[] nim = {2, 1, 4, 1, 7, 6, 2, 0, 3, 0};
        int sum = 0;
        
        System.out.println("Program Java Penjumlahan NIM For Loop");
        System.out.println("Nama: NAFIATUL FADLILAH");
        System.out.println("NIM: 2141762030");
        System.out.println("Absen: 13 (GANJIL)");
        
        for(int i = 0; i < nim.length; i++){
           sum += nim[i]; 
        }
        
        System.out.println("Hasil Penjumlahan NIM = " + sum);
    }
}