import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите цену товара (в руб.): ");
        int price = scanner.nextInt();

        System.out.println("Введите вес товара (в кг.): ");
        int weight = scanner.nextInt();

        int customs = calculateCustoms(price, weight);

        System.out.println("Размер пошлины (в руб.) составит: " + customs);
        }

        public static int calculateCustoms(int price, int weight) {
            int customs = price / 100 + weight * 100;
            return customs;

        }

        }