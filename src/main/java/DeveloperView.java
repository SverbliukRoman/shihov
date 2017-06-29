import java.util.Scanner;

/**
 * Created by Roma on 27.06.2017.
 */
public class DeveloperView {

    public static DeveloperController developerController;
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int count =0;
        while (true) {
            System.out.println("Виберете действие: ");
            System.out.println("1. Создание разработчика");
            System.out.println("2. Редактирование");
            System.out.println("3. Получение данных (чтение)");
            System.out.println("4. Удаление");
            System.out.println("5. Завершыть роботу");

            count = scanner.nextInt();
            developerController = new DeveloperController(count);
        }
    }
}
