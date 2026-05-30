
import java.util.Random;
import java.util.Scanner;

public class triD {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();

        System.out.print("Berapa kali kamu ingin mancing?: ");
        int mancing = input.nextInt();
        String[][][] Ikan = new String[3][mancing][2];
        int basic = 0;
        int secret = 0;
        int mitos = 0;
        int pendapatan = 0;

        while (mancing > 0) {
            System.out.print("\nKetik Y untuk menarik pancingan!\n> ");
            String response = input.next();
            if (response.equalsIgnoreCase("Y")) {
                System.out.println("Menarik pancingan...");
                int randomNum = rand.nextInt(6);

                switch (randomNum) {
                    case 0:
                        System.out.println("Kamu jatuh ke danau!");
                        break;
                    case 1:
                        Ikan[0][basic][0] = "Ikan Lele";
                        Ikan[0][basic][1] = "6000";
                        System.out.println("Kamu mendapatkan: " + Ikan[0][basic][0]);
                        basic++;
                        break;
                    case 2:
                        Ikan[1][secret][0] = "Ikan Mas";
                        Ikan[1][secret][1] = "15000";
                        System.out.println("Kamu mendapatkan: " + Ikan[1][secret][0]);
                        secret++;
                        break;
                    case 3:
                        System.out.print("Gacorrr!!! ");
                        Ikan[2][mitos][0] = "Ikan Megalodon";
                        Ikan[2][mitos][1] = "1000000";
                        System.out.println("Kamu mendapatkan: " + Ikan[2][mitos][0]);
                        mitos++;
                        break;
                    case 4:
                        Ikan[1][secret][0] = "Ikan Arwana";
                        Ikan[1][secret][1] = "500000";
                        System.out.println("Kamu mendapatkan: " + Ikan[1][secret][0]);
                        secret++;
                        break;
                    case 5:
                        Ikan[0][basic][0] = "Ikan Cupang";
                        Ikan[0][basic][1] = "10000";
                        System.out.println("Kamu mendapatkan: " + Ikan[0][basic][0]);
                        basic++;
                        break;
                }
            } else {
                System.out.println("Ikan lepas!");
            }
            mancing--;
        }

        System.out.println("\nHasil pancinganmu:");
        for (int i = 0; i < basic; i++) {
            System.out.println((i + 1) + ". Nama Ikan: " + Ikan[0][i][0] + ", Tipe: Basic, Harga: Rp " + Ikan[0][i][1]);
            pendapatan += Integer.parseInt(Ikan[0][i][1]);
        }
        for (int i = 0; i < secret; i++) {
            System.out.println((i + 1) + ". Nama Ikan: " + Ikan[1][i][0] + ", Tipe: Secret, Harga: Rp " + Ikan[1][i][1]);
            pendapatan += Integer.parseInt(Ikan[1][i][1]);
        }
        for (int i = 0; i < mitos; i++) {
            System.out.println((i + 1) + ". Nama Ikan: " + Ikan[2][i][0] + ", Tipe: Mitos, Harga: Rp " + Ikan[2][i][1]);
            pendapatan += Integer.parseInt(Ikan[2][i][1]);
        }

        System.out.println("\nTotal pendapatanmu: Rp " + pendapatan);
    }
}
