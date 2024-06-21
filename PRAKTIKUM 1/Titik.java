/* Program   : Titik.java */
/* Deskripsi : Kelas yang berisi program utama yang memanfaatkan kelas titik*/
/* NIM/Nama  : 24060122140148/Muhammad Anshar Al Faruq*/
/* Tanggal   : 19 Februari 2024*/

public class Titik{
    double absis;
    double ordinat;
    static int counterTitik;

    public Titik(){
        absis = 0;
        ordinat = 0;
        counterTitik++;
    }

    public Titik(double x, double y){
        this.absis = x;
        this.ordinat = y;
        counterTitik++;
    }

    void setAbsis(double x){
        this.absis = x;
    }

    void setOrdinat(double y){
        this.ordinat = y;
    }

    double getAbsis(){
        return this.absis;
    }

    double getOrdinat(){
        return this.ordinat;
    }

    static double getCounterTitik(){
        return counterTitik;
    }
}