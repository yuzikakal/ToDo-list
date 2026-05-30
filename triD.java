
import java.util.Random;
import java.util.Scanner;

public class triD {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();

        String[][][] Ikan = new String[3][100][2];
        int[] noLokasi = new int[3];
        String[] namaLokasi = {"Danau", "Sungai", "Waduk"};
        int pendapatan = 0;
        String response;

        do {
            System.out.println("\nPilih lokasi mancing:");
            System.out.println("1. Danau\n2. Sungai\n3. Waduk");
            System.out.print("Masukkan pilihan (1-3): ");
            int lokasi = input.nextInt();

            if (lokasi < 1 || lokasi > 3) {
                System.out.println("Lokasi tidak valid! Default ke Danau (1).");
                lokasi = 1;
            }

            System.out.print("Berapa kali kamu ingin mancing di " + namaLokasi[lokasi - 1] + "?:");
            int mancing = input.nextInt();

            while (mancing > 0) {
                System.out.print("\nKetik Y untuk menarik pancingan!\n> ");
                response = input.next();
                if (response.equalsIgnoreCase("Y")) {
                    System.out.println("Menarik pancingan...");
                    int randomNum = rand.nextInt(6);
                    int index = noLokasi[lokasi - 1];

                    switch (randomNum) {
                        case 0:
                            System.out.println("Kamu jatuh ke air!");
                            break;
                        case 1:
                            Ikan[lokasi - 1][index][0] = "Ikan Lele";
                            Ikan[lokasi - 1][index][1] = "6000";
                            index++;
                            break;
                        case 2:
                            Ikan[lokasi - 1][index][0] = "Ikan Mas";
                            Ikan[lokasi - 1][index][1] = "15000";
                            index++;
                            break;
                        case 3:
                            System.out.print("Gacorrr!!! ");
                            Ikan[lokasi - 1][index][0] = "Ikan Megalodon";
                            Ikan[lokasi - 1][index][1] = "1000000";
                            index++;
                            break;
                        case 4:
                            Ikan[lokasi - 1][index][0] = "Ikan Arwana";
                            Ikan[lokasi - 1][index][1] = "500000";
                            index++;
                            break;
                        case 5:
                            Ikan[lokasi - 1][index][0] = "Ikan Cupang";
                            Ikan[lokasi - 1][index][1] = "10000";
                            index++;
                            break;
                    }

                    noLokasi[lokasi - 1] = index;

                    if (randomNum != 0) {
                        System.out.println("Kamu mendapatkan: " + Ikan[lokasi - 1][index - 1][0]);
                    }
                } else {
                    System.out.println("Ikan lepas!");
                }
                mancing--;
            }
            System.out.println("\nApakah kamu ingin mencoba lokasi lain? (Y)");
            response = input.next();
        } while (response.equalsIgnoreCase("Y"));

        for (int l = 0; l < 3; l++) {
            if (noLokasi[l] == 0) {
                continue;
            }
            System.out.println("\nHasil pancinganmu di " + namaLokasi[l] + ":");
            for (int i = 0; i < noLokasi[l]; i++) {
                System.out.println((i + 1) + ". Nama Ikan: " + Ikan[l][i][0] + ", Harga: Rp " + Ikan[l][i][1]);
                pendapatan += Integer.parseInt(Ikan[l][i][1]);
            }
        }

        System.out.println("\nTotal pendapatanmu: Rp " + pendapatan);
    }
}
