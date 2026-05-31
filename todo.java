import java.util.Scanner;

public class todo {
    static class list {
        String status;
        String description;
        String date;

        public list(String status, String description, String date) {
            this.status = status;
            this.description = description;
            this.date = date;
        }
    }

    static class program {
        private list[] todoList = new list[100];
        private int index = 0;

        public void view() {
            for (int i = 0; i < index; i++) {
                System.out.println((i + 1) + ". [" + todoList[i].status + "] " + todoList[i].description + " | Tanggal: " + todoList[i].date);
            }
        }

        public void add(String description, String date) {
            if (index < todoList.length) {
                todoList[index] = new list(" ", description, date);
                index++;
            } else {
                System.out.println("Todo list is full!");
            }
        }

        public String Date(String date, String month) {
            String todoDate = date + "/" + month;
            return todoDate;
        }

        public void checklist(int taskIndex) {
            if (taskIndex >= 0 && taskIndex < index) {
                todoList[taskIndex].status = "✓";
            } else {
                System.out.println("Nomor " + (taskIndex + 1) + " tidak ada!");
            }
        }

        public void unchecklist(int taskIndex) {
            if (taskIndex >= 0 && taskIndex < index) {
                todoList[taskIndex].status = " ";
            } else {
                System.out.println("Nomor " + (taskIndex + 1) + " tidak ada!");
            }
        }

        public void delete(int taskIndex) {
            if (taskIndex >= 0 && taskIndex < index) {
                for (int i = taskIndex; i < index - 1; i++) {
                    todoList[i] = todoList[i + 1];
                }
                todoList[index - 1] = null;
                index--;
            } else {
                System.out.println("Nomor " + (taskIndex + 1) + " tidak ada!");
            }
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        program todoProgram = new program();
        todoProgram.add("Tugas PBO linkedlist", "01/06");
        todoProgram.add("Tugas Akhir Design Web", "06/06");
        while (true) {
            System.out.println("\nTO-DO LIST");
            todoProgram.view();
            System.out.println("\nMenu:");
            System.out.println("1. Tambah tugas");
            System.out.println("2. Centang tugas");
            System.out.println("3. Hapus centang tugas");
            System.out.println("4. Hapus tugas");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu: ");
            int menu = input.nextInt();
            input.nextLine();
            switch (menu) {
                case 1:
                    System.out.print("Masukan deskripsi tugas: ");
                    String description = input.nextLine();
                    System.out.print("Masukan tanggal tugas: ");
                    String date = input.nextLine();
                    System.out.print("Masukan bulan tugas: ");
                    String month = input.nextLine();
                    date = todoProgram.Date(date, month);
                    todoProgram.add(description, date);
                    break;
                case 2:
                    System.out.print("Masukan nomor tugas yang ingin dicentang: ");
                    int number = input.nextInt();
                    todoProgram.checklist(number - 1);
                    break;
                case 3:
                    System.out.print("Masukan nomor tugas yang ingin dihapus centangnya: ");
                    int uncheckNumber = input.nextInt();
                    todoProgram.unchecklist(uncheckNumber - 1);
                    break;
                case 4:
                    System.out.print("Masukan nomor tugas yang ingin dihapus: ");
                    int deleteNumber = input.nextInt();
                    todoProgram.delete(deleteNumber - 1);
                    break;
                case 5:
                    System.out.println("Keluar dari program.");
                    return;
                default:
                    System.out.println("Menu tidak valid. Silakan pilih menu yang tersedia.");
            }
        }
    }
}