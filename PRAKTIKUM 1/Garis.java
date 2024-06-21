/* Program   : Garis.java */
/* Deskripsi : Kelas yang berisi program utama yang memanfaatkan kelas titik*/
/* NIM/Nama  : 24060122140176/Mangelek Gabriel Nicholas Tambun*/
/* Tanggal   : 26 Februari 2024*/

// Kelas Garis
public class Garis {
    private Titik titikAwal;
    private Titik titikAkhir;

    // Konstruktor
    public Garis(Titik titikAwal, Titik titikAkhir) {
        this.titikAwal = titikAwal;
        this.titikAkhir = titikAkhir;
    }

    // Getter dan Setter
    public void setTitikAwal(Titik titikAwal) {
        this.titikAwal = titikAwal;
    }
    public Titik getTitikAwal() {
        return titikAwal;
    }
    public Titik getTitikAkhir() {
        return titikAkhir;
    }

    public void setTitikAkhir(Titik titikAkhir) {
        this.titikAkhir = titikAkhir;
    }

    // Method untuk menghitung panjang garis
    public double getPanjang() {
        double dx = titikAkhir.getAbsis() - titikAwal.getAbsis();
        double dy = titikAkhir.getOrdinat() - titikAwal.getOrdinat();
        return Math.sqrt(dx * dx + dy * dy);
    }

    // Method untuk menghitung gradien garis
    public double getGradien() {
        double dx = titikAkhir.getAbsis() - titikAwal.getAbsis();
        double dy = titikAkhir.getOrdinat() - titikAwal.getOrdinat();
        return dy / dx;
    }

    // Method untuk menghasilkan garis baru yang merupakan hasil pencerminan dengan sumbu Y
    public Garis getRefleksiY() {
        Titik titikAwalRefleksi = titikAwal.getRefleksiY();
        Titik titikAkhirRefleksi = titikAkhir.getRefleksiY();
        return new Garis(titikAwalRefleksi, titikAkhirRefleksi);
    }

    // Method untuk mengecek apakah objek garis tegak lurus dengan garis G
    public boolean isTegakLurus(Garis G) {
        double gradienG1 = this.getGradien();
        double gradienG2 = G.getGradien();
        return gradienG1 * gradienG2 == -1; // Jika perkalian gradien = -1, maka tegak lurus
    }
}