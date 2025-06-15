// Class untuk attribut barang
public class Barang {
    private String nama;
    private int jumlahStok;
    private double harga;

    // Constructor untuk inisialisasi object barang
    public Barang(String nama, int jumlahStok, double harga) {
        this.nama = nama;
        this.jumlahStok = Math.max(jumlahStok, 0);
        this.harga = Math.max(harga, 0);
    }

    // Getter nama barang
    public String getNama() {
        return nama;
    }

    // Getter jumlah stok barang
    public int getJumlahStok() {
        return jumlahStok;
    }

    // Setter jumlah stok barang
    public void setJumlahStok(int jumlahStok) {
        this.jumlahStok = Math.max(jumlahStok, 0);
    }

    // Getter harga barang
    public double getHarga() {
        return harga;
    }

    // Method tampilkan barang
    public void tampilkanDetail() {
        System.out.println("Nama: " + nama + ", Jumlah Stok: " + jumlahStok + ", Harga: Rp " + harga);
    }
}
