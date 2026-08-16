//Nama : Ari Asmit
//NIM: 250401010373
//Kelas : IF207
//Mata Kuliah: Struktur Data dan Algoritma


public class hash {
    public static void main(String[] args) {
        int size = 10;
        String[] table = new String[size];
        String[] keys = {"Adi", "Budi", "Celline", "Caca", "Desi", "Fajar"};

        for (String key : keys) {
            // Hitung indeks hash berdasarkan panjang karakter string
            int idx = key.length() % size;
            
            // Linear Probing jika indeks sudah terisi
            while (table[idx] != null) {
                idx = (idx + 1) % size;
            }
            
            table[idx] = key;
        }

        // Tampilkan hasil tabel
        for (int i = 0; i < size; i++) {
            if (table[i] != null) {
                System.out.println("Indeks " + i + " : " + table[i]);
            }
        }
    }
}