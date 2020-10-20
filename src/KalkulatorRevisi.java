/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
/**
 *
 * @author MOKLET-2
 */
public class KalkulatorRevisi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //deklarasi variabel
        int pilih;
        float angka;
        int angka1;
        float hasil=0;
        int i = 1;
        Scanner input=new Scanner (System.in);
        System.out.println ("KALKULATOR SEDERHANA");
        
        
        System.out.println ("1. Penjumlahan");
        System.out.println ("2. Pengurangan");
        System.out.println ("3. Perkalian");
        System.out.println ("4. Pembagian");
        System.out.println ("5. Modulus");
        System.out.print("Masukkan Pilihan Anda : ");
        pilih=input.nextInt ();
        System.out.print("Berapakah angka yang akan anda masukkan ? = ");
        angka1=input.nextInt();
        
        //perulangan dan percabangan
        switch (pilih) {
            case 1:
                while (i<=angka1) {
                    System.out.print("Masukkan angka : "+i+": ");
                    angka=input.nextFloat();
                    hasil +=angka;
                    i++;
                }   System.out.println ("Hasil = "+hasil);
                break;
            case 2:
                while (i<=angka1) {
                    System.out.print("Masukkan angka : "+i+": ");
                    angka=input.nextFloat();
                    hasil -=angka;
                    i++;
                }   System.out.println ("Hasil = "+hasil);
                break;
            case 3:
                int a,b;
                while (i<=angka1) {
                    System.out.print("Masukkan angka 1 : ");
                    a=input.nextInt();
                    System.out.print("Masukkan angka 2 : ");
                    b=input.nextInt();
                    hasil=a*b;
                    i++;
                }   System.out.println ("Hasil = "+hasil);
                break;
            case 4:
                while (i<=angka1) {
                    System.out.print("Masukkan angka 1 : ");
                    a=input.nextInt();
                    System.out.print("Masukkan angka 2 : ");
                    b=input.nextInt();
                    hasil=a/b;
                    i++;
                }   System.out.println ("Hasil = "+hasil);
                break;
            case 5:
                while (i<=angka1){
                System.out.print("Masukkan angka 1 : ");
                    a=input.nextInt();
                    System.out.print("Masukkan angka 2 : ");
                    b=input.nextInt();
                    hasil=a%b;
                i++;}
                System.out.println ("Hasil = "+hasil);
                break;
            default:
                System.out.print("Anda salah memasukkan operator");
                break;
                
                
        }
        
            }
        
        }
       
        
        
        
        
       

