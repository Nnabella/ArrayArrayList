package bagian3.perpustakaan;

public class Latihan1Buku {
    private String judul;
    private String penulis;
    private int tahunTerbit;
    private boolean dipinjam;

    public Latihan1Buku(String judul, String penulis, int tahunTerbit) {
        this.judul = judul;
        this.penulis = penulis;
        this.tahunTerbit = tahunTerbit;
        this.dipinjam = false;
    }

    public String getJudul() {
        return judul;
    }

    public String getPenulis() {
        return penulis;
    }

    public int getTahunTerbit() {
        return tahunTerbit;
    }

    public boolean isDipinjam() {
        return dipinjam;
    }

    public void setDipinjam(boolean dipinjam) {
        this.dipinjam = dipinjam;
    }

    public void info() {
        System.out.println("Judul: " + judul);
        System.out.println("Penulis: " + penulis);
        System.out.println("Tahun Terbit: " + tahunTerbit);
        System.out.println("Status: " + (dipinjam ? "Dipinjam" : "Tersedia"));
        System.out.println("----------------------");
    }
}