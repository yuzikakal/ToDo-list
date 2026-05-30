
import java.util.Random;
import java.util.Scanner;

public class oneD {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();

        System.out.print("Berapa kali kamu ingin mancing?: ");
        int mancing = input.nextInt();
        String[] Ikan = new String[mancing];
        int index = 0;

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
                        Ikan[index] = "Ikan Lele";
                        index++;
                        break;
                    case 2:
                        Ikan[index] = "Ikan Mas";
                        index++;
                        break;
                    case 3:
                        System.out.print("Gacorrr!!! ");
                        Ikan[index] = "Ikan Megalodon";
                        index++;
                        break;
                    case 4:
                        Ikan[index] = "Ikan Arwana";
                        index++;
                        break;
                    case 5:
                        Ikan[index] = "Ikan Cupang";
                        index++;
                        break;
                }
                if (randomNum != 0) {
                System.out.println("Kamu mendapatkan: " + Ikan[index - 1]);
                }
            } else {
                System.out.println("Ikan lepas!");
            }
            mancing--;
        }

        System.out.println("\nHasil pancinganmu:");
        for (int i = 0; i < index; i++) {
            System.out.println((i + 1) + ". " + Ikan[i]);
        }
    }
}
