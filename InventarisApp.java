import java.util.Scanner; // import library scanner untuk menerima input

// Class utama untuk menjalankan program
public class InventarisApp {

    // Method untuk menampilkan menu
    private static void tampilkanMenu(){
        System.out.println("\n=== Menu Inventaris Barang ===");
        System.out.println("1. Tambah Barang");
        System.out.println("2. Tampilkan Semua Barang");
        System.out.println("3. Update Jumlah Stok Barang");
        System.out.println("4. Cari Barang");
        System.out.println("5. Keluar Program");
        System.out.print("Pilih menu: ");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Membuat object inventaris dengan kapasitas 10
        Inventaris inventaris = new Inventaris(10);
        boolean exit = false;

        // Menambahkan default barang ke inventaris`
        inventaris.tambahBarang("Pensil", 50, 200);
        inventaris.tambahBarang("Buku", 30, 15000);
        inventaris.tambahBarang("Penghapus", 20, 500);

        while (!exit) {
            // Menampilkan menu utama
            tampilkanMenu();

            // Handle jika pengguna tidak pilih 1-5
            while (!scanner.hasNextInt()) {
                System.out.println("Input tidak valid. Pilih 1 - 5");
                tampilkanMenu();
                scanner.next();
            }

            int pilihan = scanner.nextInt();
            scanner.nextLine();

            switch (pilihan) {
                case 1:
                    // Menambah barang
                    System.out.println("\n=== Tambah Barang ===");
                    System.out.print("Masukkan nama barang: ");
                    String namaBarang = scanner.nextLine();
                    System.out.print("Masukkan jumlah stok: ");
                    int stok = scanner.nextInt();
                    System.out.print("Masukkan harga: ");
                    double harga = scanner.nextDouble();
                    if (inventaris.tambahBarang(namaBarang, stok, harga)) {
                        System.out.println("\nBarang berhasil ditambahkan.");
                    } else {
                        System.out.println("\nInventaris penuh!");
                    }
                    break;

                case 2:
                    // Menampilkan inventaris
                    inventaris.tampilkanInventaris();
                    break;

                case 3:
                    // Mengupdate jumlah stok
                    System.out.println("\n=== Update Jumlah Stok ===");
                    System.out.print("Masukkan nama barang: ");
                    String namaBarangUpdate = scanner.nextLine();
                    System.out.print("Masukkan jumlah stok: ");
                    int jumlahBaru = scanner.nextInt();
                    inventaris.updateJumlahStok(namaBarangUpdate, jumlahBaru);
                    break;

                case 4:
                    // Mencari barang
                    System.out.println("\n=== Cari Barang ===");
                    System.out.print("Masukkan nama barang: ");
                    String namaBarangCari = scanner.nextLine();
                    inventaris.cariBarang(namaBarangCari);
                    break;

                case 5:
                    // Keluar program
                    System.out.println("\nsTerima kasih.");
                    exit = true;
                    break;

                default:
                    System.out.println("\nPilih 1-5, silakan coba lagi.");
            }
        }

        scanner.close();
    }
}
