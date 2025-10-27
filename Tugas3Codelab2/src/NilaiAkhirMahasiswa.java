import java.util.Scanner;

public class NilaiAkhirMahasiswa implements Nilai.HitungNilai {
    public static final double nilaiHitungTugas = 0.3;
    public static final double nilaiHitungUts = 0.3;
    public static final double nilaiHitungUas = 0.4;
    private String nama;
    private double tugas;
    private double uts;
    private double uas;
    private double nilaiAkhir;
    private String grade;

    public NilaiAkhirMahasiswa(String nama, double tugas, double uts, double uas) {
        setNama(nama);
        setTugas(tugas);
        setUts(uts);
        setUas(uas);
    }

    @Override
    public void hitungNilai() {
        setNilaiAkhir(getAkhir());

        if (getNilaiAkhir() >= 80) {
            setGrade("A");
        } else if (getNilaiAkhir() >= 70) {
            setGrade("B");
        } else if (getNilaiAkhir() >= 60) {
            setGrade("C");
        } else if (getNilaiAkhir() >= 50) {
            setGrade("D");
        } else {
            setGrade("E");
        }
    }

    private double getAkhir() {
        return (getTugas() * nilaiHitungTugas) + (getUts() * nilaiHitungUts) + (getUas() * nilaiHitungUas);
    }

    public void tampilkanData() {
        System.out.println("Nama Mahasiswa : " + getNama());
        System.out.println("Nilai Tugas    : " + getTugas());
        System.out.println("Nilai UTS      : " + getUts());
        System.out.println("Nilai UAS      : " + getUas());
        System.out.println("Nilai Akhir    : " + getNilaiAkhir());
        System.out.println("Grade          : " + getGrade());
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public double getTugas() {
        return tugas;
    }

    public void setTugas(double tugas) {
        this.tugas = tugas;
    }

    public double getUts() {
        return uts;
    }

    public void setUts(double uts) {
        this.uts = uts;
    }

    public double getUas() {
        return uas;
    }

    public void setUas(double uas) {
        this.uas = uas;
    }

    public double getNilaiAkhir() {
        return nilaiAkhir;
    }

    public void setNilaiAkhir(double nilaiAkhir) {
        this.nilaiAkhir = nilaiAkhir;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }
}

class MainApp{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String nama;
        double tugas, UTS, uas;

        System.out.print("Masukkan nama mahasiswa: ");
        nama = input.nextLine();
        System.out.print("Masukkan nilai tugas: ");
        tugas = input.nextDouble();
        System.out.print("Masukkan nilai UTS: ");
        UTS = input.nextDouble();
        System.out.print("Masukkan nilai UAS: ");
        uas = input.nextDouble();

        NilaiAkhirMahasiswa m = new NilaiAkhirMahasiswa(nama, tugas, UTS, uas);
        m.hitungNilai();
        m.tampilkanData();

        input.close();
    }
}
