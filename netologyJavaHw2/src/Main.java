import ru.netology.service.CustomsService;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите цену товара (в руб.): ");
        int price1 = scanner.nextInt();

        System.out.print("Введите вес товара (в кг.): ");
        int weight1 = scanner.nextInt();

        System.out.print("Размер пошлины (в руб.) составит: ");
        int customDuty = CustomsService.calculateCustoms(price1, weight1);

        System.out.println(customDuty);
    }


}