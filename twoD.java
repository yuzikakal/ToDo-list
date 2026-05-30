
import java.util.Random;
import java.util.Scanner;

public class twoD {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();

        System.out.print("Berapa kali kamu ingin mancing?: ");
        int mancing = input.nextInt();
        String[][] Ikan = new String[mancing][2];
        int index = 0;
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
                        Ikan[index][0] = "Ikan Lele";
                        Ikan[index][1] = "6000";
                        index++;
                        break;
                    case 2:
                        Ikan[index][0] = "Ikan Mas";
                        Ikan[index][1] = "15000";
                        index++;
                        break;
                    case 3:
                        System.out.print("Gacorrr!!! ");
                        Ikan[index][0] = "Ikan Megalodon";
                        Ikan[index][1] = "1000000";
                        index++;
                        break;
                    case 4:
                        Ikan[index][0] = "Ikan Arwana";
                        Ikan[index][1] = "500000";
                        index++;
                        break;
                    case 5:
                        Ikan[index][0] = "Ikan Cupang";
                        Ikan[index][1] = "10000";
                        index++;
                        break;
                }
                if (randomNum != 0) {
                    System.out.println("Kamu mendapatkan: " + Ikan[index - 1][0]);
                }
            } else {
                System.out.println("Ikan lepas!");
            }
            mancing--;
        }

        System.out.println("\nHasil pancinganmu:");
        for (int i = 0; i < index; i++) {
            System.out.println((i + 1) + ". Nama Ikan: " + Ikan[i][0] + ", Harga: Rp " + Ikan[i][1]);
            pendapatan += Integer.parseInt(Ikan[i][1]);
        }

        System.out.println("\nTotal pendapatanmu: Rp " + pendapatan);
    }
}
