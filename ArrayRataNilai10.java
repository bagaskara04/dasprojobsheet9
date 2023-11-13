import java.util.Scanner;

public class ArrayRataNilai10 {
    public static void main(String[] args) {
        Scanner input10 = new Scanner(System.in);
        System.out.print("Masukkan jumlah mahasiswa : ");
        int mahasiswa = input10.nextInt();

        int[] nilaiMhs = new int[mahasiswa];
        double total = 0, total2 = 0, rata, rata2;
        double lulus = 0, tidaklulus = 0;

        for (int i = 0; i < nilaiMhs.length; i++) {
            System.out.print("Masukkan nilai Mahasiswa ke- " + (i + 1) + " : ");
            nilaiMhs[i] = input10.nextInt();
        }
        for (int i = 0; i < nilaiMhs.length; i++) {
            if (nilaiMhs[i] > 70) {
                //System.out.println("Mahasiswa ke- " + i + " lulus!");
                total += nilaiMhs[i];
                lulus++;
            } else {
                //System.out.println("Mahasiswa ke- " + i + " tidak lulus!");
                total2 += nilaiMhs[i];
                tidaklulus++;
            }
        }

        rata = total / lulus;
        System.out.print("Rata - rata nilai lulus = " + rata);
        rata2 = total2 / tidaklulus;
        System.out.println();
        System.out.print("Rata - rata nilai tidak lulus = "+ rata2);

    }
}
