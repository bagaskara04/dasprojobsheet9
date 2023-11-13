import java.util.Scanner;

public class LinearSearch10 {
    public static void main(String[] args) {
        Scanner input10 = new Scanner(System.in);
        System.out.print("Masukkan jumlah elemen array : ");
        int elemen = input10.nextInt();

        int[] arrayInt = new int[elemen];
        int key;
        int hasil = 1;

        for (int i = 0; i < arrayInt.length; i++) {
            // if (arrayInt[i] == key) {
            // hasil = i;
            // break;
            // }
            System.out.print("Masukkan elemen array ke- " + i + " : ");
            arrayInt[i] = input10.nextInt();
            hasil = i;
        }
        System.out.print("Masukkan key yang ingin dicari : ");
        key = input10.nextInt();
        for (int i = 0; i < arrayInt.length; i++) {
            if (arrayInt[i] == key) {
                hasil = i;
                System.out.println("Key ada diposisi indeks ke- " + hasil);
                break;
            } else 
                System.out.println("Key tidak ditemukan ");
                break;
        }
    }
}
