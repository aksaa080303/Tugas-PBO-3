import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<NilaiMahasiswa> daftarMahasiswa = new ArrayList<>();

        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumlah = input.nextInt();
        input.nextLine();

        for (int i = 0; i < jumlah; i++) {
            System.out.println("\nData Mahasiswa ke-" + (i + 1));
            System.out.print("Masukkan NIM   : ");
            String nim = input.nextLine();
            System.out.print("Masukkan Nama  : ");
            String nama = input.nextLine();
            System.out.print("Masukkan Nilai : ");
            double nilai = input.nextDouble();
            input.nextLine();

            NilaiMahasiswa mhs = new NilaiMahasiswa(nim, nama, nilai);
            daftarMahasiswa.add(mhs);
        }

        System.out.println("\n==========================================");
        for (NilaiMahasiswa mhs : daftarMahasiswa) {
            mhs.tampilkanData();
            mhs.tampilkanGrade();
            System.out.println("========================================");
        }

        int lulus = 0, tidakLulus = 0;
        int gradeA = 0, gradeB = 0, gradeC = 0, gradeD = 0;
        double totalNilai = 0;

        for (NilaiMahasiswa mhs : daftarMahasiswa) {
            String grade = mhs.getGrade();
            totalNilai += mhs.nilai;

            if (mhs.isLulus()) lulus++;
            else tidakLulus++;

            switch (grade) {
                case "A": gradeA++; break;
                case "B": gradeB++; break;
                case "C": gradeC++; break;
                case "D": gradeD++; break;
            }
        }

        double rataRata = totalNilai / daftarMahasiswa.size();
        System.out.println("Jumlah mahasiswa             : " + daftarMahasiswa.size());
        System.out.println("Jumlah mahasiswa yang lulus  : " + lulus);
        System.out.println("Jumlah mahasiswa yang tidak lulus: " + tidakLulus);
        System.out.println("Jumlah mahasiswa dengan nilai A: " + gradeA);
        System.out.println("Jumlah mahasiswa dengan nilai B: " + gradeB);
        System.out.println("Jumlah mahasiswa dengan nilai C: " + gradeC);
        System.out.println("Jumlah mahasiswa dengan nilai D: " + gradeD);
        System.out.printf("Rata-rata nilai mahasiswa adalah: %.2f\n", rataRata);

        input.close();
    }
}
