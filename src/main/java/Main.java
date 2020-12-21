import com.google.gson.Gson;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Properties;

public class Main {
  public static void main(String[] args) throws IOException, ClassNotFoundException {
    Person person = new Person();
    Gson gson = new Gson();
    String jsonString = gson.toJson(person);
    File file = new File("person.json");
    Files.write(Paths.get("person.json"),jsonString.getBytes());



    FileInputStream fis;
    Properties property = new Properties();
    try {
      Dough dough;
      String filling;
      fis = new FileInputStream("src/pizza.properties");
      property.load(fis);
      String size = property.getProperty("dough.size");
      String type= property.getProperty("dough.type");
      filling = property.getProperty("pizza.filling");
      dough = new Dough(size,type);


    Pizza pizza1 = new Pizza(filling,dough);

    ObjectOutputStream outputStream1 = new ObjectOutputStream(new FileOutputStream("pizza1.ser"));
    outputStream1.writeObject(pizza1);
    outputStream1.flush();
    outputStream1.close();
    } catch (IOException e) {
      System.err.println("ОШИБКА!");
    }
    ObjectInputStream inputStream1 = new ObjectInputStream(new FileInputStream("pizza1.ser"));
    Pizza pizza = (Pizza) inputStream1.readObject();
    System.out.println(pizza.toString());
  }
}
