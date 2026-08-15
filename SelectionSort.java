// Uratan menggunakan Selection Sort
// Analisis: Data Nama diurutkan berdasarkan abjad dan alamat mengikuti posisi nama 

public class SelectionSort {
    public static void main(String[] args) {
        String[] nama = {"Fahmi", "Romi", "Andri", "Fadillah", "Ruli", "Rudi", "Dendi", "Zaki"};
        String[] alamat = {"Jakarta", "Solo", "Jakarta", "Banyuwangi", "Bandung", "Bali", "Purwokerto", "Madiun"};

        System.out.println("Urutan data sebelum diurutkan:");
        for(int i = 0; i < nama.length; i++) {
            System.out.println(nama[i] + " - " + alamat[i]);
        }

        // Proses Sorting Selection
        for (int i = 0; i < nama.length - 1; i++) {
            int minIdx = i;
            
            for (int j = i + 1; j < nama.length; j++) {
                
                // Bandingkan huruf ke 1 (charAt(0)) antara nama[j] dan nama[minIdx]
                if (nama[j].charAt(0) < nama[minIdx].charAt(0)) {
                    minIdx = j;
                } 
                // jika huruf pertama sama, bandingkan huruf ke 2 (charAt(1))
                else if (nama[j].charAt(0) == nama[minIdx].charAt(0)) {
                    if (nama[j].charAt(1) < nama[minIdx].charAt(1)) {
                        minIdx = j;
                    }
                    // jika huruf ke 1 dan ke 2 sama, dilanjutkan huruf ke 3 (charAt(2))
                    else if (nama[j].charAt(1) == nama[minIdx].charAt(1)) {
                        if (nama[j].charAt(2) < nama[minIdx].charAt(2)) {
                            minIdx = j;
                        }
                    }
                }
            }

            // Tukar posisi Nama
            String tempnama = nama[minIdx];
            nama[minIdx] = nama[i];
            nama[i] = tempnama;

            // Tukar posisi Alamat
            String tempalamat = alamat[minIdx];
            
            alamat[minIdx] = alamat[i];
            alamat[i] = tempalamat;
        }

        System.out.println("\nData sesudah diurutkan (Selection Sort):");
        for(int i = 0; i < nama.length; i++) {
            System.out.println(nama[i] + " - " + alamat[i]);
        }
    }
}