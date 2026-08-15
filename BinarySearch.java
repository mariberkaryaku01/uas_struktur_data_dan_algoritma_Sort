public class BinarySearch {
    public static void main(String[] args) {
        int[] UrutanAngka = {19, 40, 10, 90, 2, 50, 60, 50, 1 };

        // Mengurutkan data terlebih dahulu sebelum mencari data
        for (int i = 0; i < UrutanAngka.length - 1; i++) {
            for (int j = 0; j < UrutanAngka.length - i - 1; j++) {
                if (UrutanAngka[j] > UrutanAngka[j + 1]) {
                    int temp = UrutanAngka[j];
                    UrutanAngka[j] = UrutanAngka[j + 1];
                    UrutanAngka[j + 1] = temp;
                }
            }
        }
        
        System.out.print("Array setelah diurutkan: ");
        for (int i = 0; i < UrutanAngka.length; i++) {
            System.out.print(UrutanAngka[i] + " ");
        }
        System.out.println(); // Menambah jarak baris
        
        // Cek test case
        TestCase(UrutanAngka, 1);
        TestCase(UrutanAngka, 50);
        TestCase(UrutanAngka, 100); 
    } 

    public static void TestCase(int[] UrutanAngka, int X) {
        int Bawah = 0;
        int Atas = UrutanAngka.length - 1;
        int Posisi = -1; // Berarti data belum ketemu
    
        while (Atas >= Bawah) {
            int Tengah = (Atas + Bawah) / 2;
        
            if (X > UrutanAngka[Tengah]) {
                Bawah = Tengah + 1;
            } else if (X < UrutanAngka[Tengah]) {
                Atas = Tengah - 1;
            } else {
                Posisi = Tengah;
                Bawah = Atas + 1; // Untuk mengakhiri while
            }
        }
    
        if (Posisi != -1) {
            System.out.print("Output : Angka " + X + " ada di indeks ke ");
            for (int i = 0; i < UrutanAngka.length; i++) {
                if (UrutanAngka[i] == X) {
                    System.out.print(i + " ");
                }
            }
            System.out.println();
        } else {
            System.out.println("Output : Angka " + X + " tidak ada dalam array");
        }
    }        
}