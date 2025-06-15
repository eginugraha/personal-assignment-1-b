// Class utama untuk menjalankan program
public class InventarisApp {
    public static void main(String[] args) {
        // Membuat object inventaris dengan kapasitas 10
        Inventaris inventaris = new Inventaris(10);

        // Menambahkan barang ke inventaris`
        inventaris.tambahBarang("Pensil", 50, 200);
        inventaris.tambahBarang("Buku", 30, 15000);
        inventaris.tambahBarang("Penghapus", 20, 500);

        // Menampilkan daftar barang dari inventaris
        inventaris.tampilkanInventaris();
    }
}
