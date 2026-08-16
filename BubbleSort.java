//Nama : Ari Asmit
//NIM: 250401010373
//Kelas : IF207
//Mata Kuliah: Struktur Data dan Algoritma

// Uratan menggunakan Bubble Sort
// Analisis: Data Nama diurutkan berdasarkan abjad dan alamat mengikuti posisi nama 

public class BubbleSort {
    public static void main(String[] args) {
        String[] nama = {"Fahmi", "Romi", "Andri", "Fadillah", "Ruli", "Rudi", "Dendi", "Zaki"};
        String[] alamat = {"Jakarta", "Solo", "Jakarta", "Banyuwangi", "Bandung", "Bali", "Purwokerto", "Madiun"};


        //Cetak urutan sebelum dilakukan sorting
        System.out.println("Data awal sebelum diurutkan:");
        for(int i = 0; i < nama.length; i++) {
            System.out.println(nama[i] + " : " + alamat[i]);
        }

        // proses sorting menggunakan bubble sort 
        // karena urut abjad sehingga mengurutkan membandingkan kode ASCII pada huruf depan setiap nama
        for (int i = 0; i < nama.length - 1; i++) {
            for (int j = 0; j < nama.length - 1 - i; j++) {
                if (nama[j].charAt(0) > nama[j + 1].charAt(0)) {
                    
                    // menukar posisi nama pada array nama
                    String tempnama = nama[j];
                    nama[j] = nama[j + 1];
                    nama[j + 1] = tempnama;

                    // menukar alamat secara bersamaan untuk menyesuaikan alamat dan nama
                    String tempalamat = alamat[j];
                    alamat[j] = alamat[j + 1];
                    alamat[j + 1] = tempalamat;
                }
                
                // Proses apabila huruf pertama sama, bandingkan huruf kedua charAt(1)
                else if (nama[j].charAt(0) == nama[j + 1].charAt(0)) {
                    if (nama[j].charAt(1) > nama[j + 1].charAt(1)) {
                        
                        // menukar posisi nama pada array nama
                        String tempnama = nama[j];
                        nama[j] = nama[j + 1];
                        nama[j + 1] = tempnama;

                        // menukar alamat secara bersamaan
                        String tempalamat = alamat[j];
                        alamat[j] = alamat[j + 1];
                        alamat[j + 1] = tempalamat;
                    }
                // apabila ada huruf ke 1 dan ke 2 sama, dilanjutkan huruf ke 3 charAt(2)
                    else if (nama[j].charAt(1) == nama[j + 1].charAt(1)) {
                        if (nama[j].charAt(2) > nama[j + 1].charAt(2)) {
                            
                            // menukar posisi nama
                            String tempnama = nama[j];
                            nama[j] = nama[j + 1];
                            nama[j + 1] = tempnama;

                            // menukar alamat
                            String tempalamat = alamat[j];
                            alamat[j] = alamat[j + 1];
                            alamat[j + 1] = tempalamat;
                        }
                    }
                }
                
            }
        }

        System.out.println("\nUrutan Data setelah diurutkan:");
        for(int i=0; i<nama.length;i++) {
            System.out.println(nama[i] + " - " + alamat[i]);
        }
    }
}