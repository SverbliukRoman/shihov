import java.io.Serializable;

/**
 * Created by Roma on 27.06.2017.
 */
public class Developer implements Serializable {
    String name;
    int age;
    String position;
    int expir;

    public Developer(String name, int age, String position, int expir) {
        this.name = name;
        this.age = age;
        this.position = position;
        this.expir = expir;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getExpir() {
        return expir;
    }

    public void setExpir(int expir) {
        this.expir = expir;
    }

    @Override
    public String toString() {
        return "Developer{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", position='" + position + '\'' +
                ", expir=" + expir +
                '}';
    }
}
