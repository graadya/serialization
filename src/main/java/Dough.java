import java.io.Serializable;

public class Dough implements Serializable {

   public String size = "30";
   public String type = "classic";



  @Override
    public String toString() {
      return "Dough{" +
              "size='" + size + '\'' +
              ", type='" + type + '\'' +
              '}';
    }
  }

