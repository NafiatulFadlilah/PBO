/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum1;
import java.io.FileNotFoundException;
import java.util.Formatter;
/**
 *
 * @author Nafiaaeluv
 */
public class segitigaDoWhile {
    public static void main(String[] args){
        try(Formatter file = new Formatter("D:\\KULIAH\\SEMESTER 3\\PRAK PBO\\TUGAS\\ReviewMateri\\src\\main\\java\\praktikum1\\output.txt")){
        int[] nim = {2, 1, 4, 1, 7, 6, 2, 0, 3, 0};
        int index = 0;
        
        System.out.println("Program Java Piramida NIM Do While Loop");
        file.format("%s %n", "Program Java Piramida NIM Do While Loop");
        System.out.println("Nama: NAFIATUL FADLILAH");
        file.format("%s %n", "Nama: NAFIATUL FADLILAH");
        System.out.println("NIM: 2141762030");
        file.format("%s %n", "NIM: 2141762030");
        System.out.println("Absen: 13 (GANJIL)");
        file.format("%s %n", "Absen: 13 (GANJIL)");
         
        int i = 0;
        do{
            int j = 4;
            do{
                System.out.print(" ");
                file.format("%s", " ");
                j--;
            }while(j >= i);
            int k = 0;
            do{
                System.out.print(nim[index] + " ");
                file.format("%s", nim[index] + " ");
                index++;
                k++;
            }while(k <= i);
            i++;
            System.out.println();
            file.format("%s %n", "");
        }while(i < 4);
        
        }catch(FileNotFoundException ex){
            System.out.println("File Tidak Ditemukan");
        }
    }
}