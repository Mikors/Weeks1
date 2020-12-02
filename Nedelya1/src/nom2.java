import java.util.Scanner;
public class nom2 {

    public static void main(String[] args) {
        Scanner sr = new Scanner(System.in); // создаём объект класса Scanner
        System.out.print("Введите начальную скорость v0: ");
        int v0 = sr.nextInt();
        System.out.print("Введите угол а к поверхности Земли: ");
        int a = sr.nextInt();
        // угол, градусов
        double s;           // расстояние, метры
        double d;           // дюймы
        double f;           // футы

        s = v0 * v0 * Math.sin(Math.toRadians(2 * a)) / 9.8;    // метры


        d = s / .0254;      // дюйм = 2.54 см
        f = d / 12;         // фут = 12 дюймов

        System.out.printf("Дальность: %f метров\n", s);
        System.out.printf("Дальность: %f дюймов\n", d);
        System.out.printf("Дальность: %f футов\n", f);

    }

    public void nom2() {
    }
}