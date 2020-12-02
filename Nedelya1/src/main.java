import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите номер задачи: ");
        int number = in.nextInt();
        if (number > 5 || number < 1) {
            System.out.println("Нет такой задачи.");
        } else {
            switch (number) {
                case 1:
                    nomer1 n1 = new nomer1();
                    n1.nomer1();
                    break;
                case 2:
                    nom2 n2 = new nom2();
                    n2.nom2();
                    break;
                case 3:
                    nom3 n3 = new nom3();
                    n3.nom3();
                    break;
                case 4:
                    nom4 n4 = new nom4();
                    n4.nom4();
                    break;
                case 5:
                    nom5 n5 = new nom5();
                    n5.nom5();
                    break;
            }
        }
    }
}
