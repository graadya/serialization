import java.io.Serializable;

public class Dough implements Serializable {

   public String size;
   public String type;

  public Dough(String size, String type) {
    this.size = size;
    this.type = type;
  }

  @Override
    public String toString() {
      return "Dough{" +
              "size='" + size + '\'' +
              ", type='" + type + '\'' +
              '}';
    }
  }

