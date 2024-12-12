import java.util.ArrayList;
import java.util.Scanner;

public class TokoBukuTogaPerak {
    public static void main(String[] args) {
        
        // Daftar buku dan harganya
        String[] buku = {"Sherlock Holmes", "Arsene Lupin", "Game of Throne", "Psychology of Money"};
        int[] harga = {350000, 450000, 500000, 95000};

        // Menampilkan daftar buku
        System.out.println("Daftar Buku:");
        for (int i = 0; i < buku.length; i++) {
            System.out.println((i + 1) + ". " + buku[i] + " " + harga[i]);
        }

        // Input pilihan buku dan hitung total belanja
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> belanja = new ArrayList<>();
        char lagi;
        do {
            System.out.print("Masukan pilihan buku [1/2/3/4]: ");
            int pilihan = scanner.nextInt() - 1;
            belanja.add(harga[pilihan]);
            System.out.print("Input lagi (Y/N)?: ");
            lagi = scanner.next().charAt(0);
        } while (lagi == 'Y' || lagi == 'y');

        // Hitung total belanja dan voucher
        int totalBelanja = hitungTotalBelanja(belanja);
        int voucher = hitungVoucher(totalBelanja);

        // Tampilkan output
        System.out.println("Total voucher belanja = " + voucher);
        System.out.println("Total yang harus dibayar = " + (totalBelanja - voucher));
    }

    // Fungsi untuk menghitung total belanja
    public static int hitungTotalBelanja(ArrayList<Integer> belanja) {
        int total = 0;
        for (int harga : belanja) {
            total += harga;
        }
        return total;
    }

    // Fungsi untuk menghitung voucher
    public static int hitungVoucher(int totalBelanja) {
        if (totalBelanja < 200000) {
            return 0;
        } else if (totalBelanja < 500000) {
            return 50000;
        } else if (totalBelanja < 750000) {
            return 100000;
        } else if (totalBelanja < 1000000) {
            return 150000;
        } else {
            return 200000;
        }

    }
}

