import java.io.*;

public class Main {
  public static void main(String[] args) throws IOException, ClassNotFoundException {
    Person person = new Person();
    ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("person.ser"));
    outputStream.writeObject(person);
    outputStream.close();

    person.name = "Nafnsjfn";
    person.age = 44;
    ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("person.ser"));
    Person person1 = (Person) inputStream.readObject();
    System.out.println(person1.toString());

    Pizza pizza1 = new Pizza();

    ObjectOutputStream outputStream1 = new ObjectOutputStream(new FileOutputStream("pizza1.ser"));
    outputStream1.writeObject(pizza1);
    outputStream1.close();
    ObjectInputStream inputStream1 = new ObjectInputStream(new FileInputStream("pizza1.ser"));
    Pizza pizza = (Pizza) inputStream1.readObject();
    System.out.println(pizza.toString());
  }
}
