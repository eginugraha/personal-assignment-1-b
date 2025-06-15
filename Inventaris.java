// Class inventaris untuk mengelola barang
public class Inventaris {
    private Barang[] daftarBarang;
    private int jumlahSaatIni;

    // Constructor untuk barang dan kapasitas
    public Inventaris(int kapasitas) {
        this.daftarBarang = new Barang[kapasitas];
        this.jumlahSaatIni = 0;
    }

    // Method tambah barang
    public boolean tambahBarang(String nama, int stok, double harga) {
        if (jumlahSaatIni < daftarBarang.length) {
            daftarBarang[jumlahSaatIni++] = new Barang(nama, stok, harga);
            return true;
        }
        return false;
    }

    // Method menampilkan barang
    public void tampilkanInventaris() {
        System.out.println("\nInventaris Toko:");
        if (jumlahSaatIni == 0) {
            System.out.println("\nMaaf, barang tidak ditemukan!");
            return;
        }

        for (int i = 0; i < jumlahSaatIni; i++) {
            Barang b = daftarBarang[i];
            System.out.printf("\n%d. Nama: %s, Jumlah Stok: %d, Harga: Rp %.2f\n", i + 1, b.getNama(), b.getJumlahStok(), b.getHarga());
        }
    }

    // Method cari barang
    public void cariBarang(String nama) {
        System.out.println("\nHasil Pencarian:");
        for (int i = 0; i < jumlahSaatIni; i++) {
            if (daftarBarang[i].getNama().equals(nama)) {
                daftarBarang[i].tampilkanDetail();
                return;
            }
        }
        System.out.println("Maaf, " + nama + " tidak ditemukan di inventaris.");
    }

    // Method update jumlah stock
    public void updateJumlahStok(String nama, int jumlahBaru) {
        for (int i = 0; i < jumlahSaatIni; i++) {
            if (daftarBarang[i].getNama().equals(nama)) {
                daftarBarang[i].setJumlahStok(jumlahBaru);
                System.out.println("\nStok " + nama + " berhasil diupdate menjadi " + jumlahBaru);
                return;
            }
        }
        System.out.println("\nMaaf, " + nama + " tidak ditemukan di inventori.");
    }
}
