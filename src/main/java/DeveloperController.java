import java.util.ArrayList;

/**
 * Created by Roma on 27.06.2017.
 */
public class DeveloperController {
    ArrayList<Developer> developers=new ArrayList<Developer>();

    public DeveloperController(int count) {
        request(count);
    }

    public void request(int count){
        switch (count) {
            case 1: if((developers = DeveloperDAO.reader(developers))==null)
            {
                System.out.println("Файл пустой");
            } else {
                developers.add(createNewDeveloper());
                DeveloperDAO.write(developers);
        }
                break;
            case 2:
                break;
            case 3:
                if((developers = DeveloperDAO.reader(developers))==null)
                {
                    System.out.println("Файл пустой");
                }
                break;
            case 4:
                break;
            case 5:
                System.exit(0);
                break;
        }
    }
    public Developer createNewDeveloper(){
        System.out.println("Введите имя разработчика: ");
        String name = DeveloperView.scanner.next();
        System.out.println("Введите возрост разработчика: ");
        int age = DeveloperView.scanner.nextInt();
        System.out.println("Введите должность разработчика: ");
        String position = DeveloperView.scanner.next();
        System.out.println("Введите стаж разработчика(в годах): ");
        int expir = DeveloperView.scanner.nextInt();
        Developer dev = new Developer(name, age, position, expir);
        return dev;
    }

}
