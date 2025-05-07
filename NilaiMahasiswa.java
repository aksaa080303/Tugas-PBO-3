public class NilaiMahasiswa extends Mahasiswa {

    public NilaiMahasiswa(String nim, String nama, double nilai) {
        super(nim, nama, nilai);
    }

    public String getGrade() {
        if (nilai >= 80 && nilai <= 100) return "A";
        else if (nilai >= 70) return "B";
        else if (nilai >= 60) return "C";
        else if (nilai >= 50) return "D";
        else if (nilai >= 0) return "E";
        else return "Invalid";
    }

    public boolean isLulus() {
        String grade = getGrade();
        return grade.equals("A") || grade.equals("B") || grade.equals("C");
    }

    public void tampilkanGrade() {
        System.out.println("Grade : " + getGrade());
    }
}

