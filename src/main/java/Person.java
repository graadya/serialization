import java.io.Serializable;

public class Person implements Serializable {
  int age = 16;
  String name = "name";

  @Override
  public String toString() {
    return "Person{" +
            "age=" + age +
            ", name='" + name + '\'' +
            '}';
  }
}
