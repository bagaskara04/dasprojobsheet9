import java.util.Scanner;

public class Tugas110 {
    public static void main(String[] args) {
        Scanner input10 = new Scanner(System.in);
        System.out.print("Masukkan jumlah elemen array : ");
        int elemen = input10.nextInt();

        int[] arrayInt = new int[elemen];
         for (int i = 0; i < elemen; i++) {
            System.out.print("Masukkan elemen array ke- " + (i+1) + " : ");
            arrayInt[i] = input10.nextInt();
        }
        int tertinggi = arrayInt[0], terendah = arrayInt[0], total = arrayInt[0];
        
        double rata;
        for (int i = 1; i < elemen; i++) {
            if (arrayInt[i] > tertinggi) {
                tertinggi = arrayInt[i];
            }
            else if (arrayInt[i] > terendah) {
                terendah = arrayInt[i];
            }
            total += arrayInt[i];
        }
        
        rata = (double) total / elemen;
        System.out.println("Nilai tertinggi adalah "+tertinggi);
        System.out.println("Nilai terendah adalah "+ terendah);
        System.out.println("Rata rata adalah "+ rata);
    }
}
