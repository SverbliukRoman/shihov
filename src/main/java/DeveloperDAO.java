import java.io.*;
import java.util.ArrayList;

/**
 * Created by Roma on 27.06.2017.
 */
public class DeveloperDAO {
    static ArrayList<Developer> developers;
    static FileOutputStream fos;
    static ObjectOutputStream oos;


    public static ArrayList<Developer> reader(ArrayList<Developer> developers) {
        File file = new File("write.txt");
        if (!file.exists()) {
            create(file);
            return null;
        }
        try {
            FileInputStream fis = new FileInputStream(file);
            ObjectInputStream oin = new ObjectInputStream(fis);
            int size = oin.readInt();
            for (int i = 0; i < size; i++) {
                Developer ts = (Developer) oin.readObject();
                System.out.println(ts);
                developers.add(ts);
            }
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Возникла непредвиденная ошибка виберете другое действие!");
            DeveloperView.main(null);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            //После чего мы должны закрыть файл
            //Иначе файл не запишется
        }
        return developers;
    }


    public static void write(ArrayList<Developer> developers) {
        File file = new File("write.txt");
        if (!file.exists()) {
            create(file);
        }
                try {
                    fos = new FileOutputStream(file, false);
                    oos = new ObjectOutputStream(fos);
                    oos.writeInt(developers.size());
                    for (Developer d: developers) {
                        oos.writeObject(d);
                    }
                    /*Developer ts = new Developer("pasha", 19, "Developer", 1);*/
                    oos.flush();
                    oos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                    System.out.println("Возникла непредвиденная ошибка виберете другое действие!");
                    DeveloperView.main(null);
                } finally {
                    //После чего мы должны закрыть файл
                    //Иначе файл не запишется

                }

    }

    private static void create(File file) {
        System.out.println("Файла нету: ");
        System.out.println("1. Создать");
        System.out.println("2. Не создавать() завершение");
        if (DeveloperView.scanner.nextInt() == 1) {
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                //После чего мы должны закрыть файл
                //Иначе файл не запишется
                System.out.println("Возникла непредвиденная ошибка виберете другое действие!");
                DeveloperView.main(null);
            }
        } else {
            DeveloperView.main(null);
        }
    }

}
