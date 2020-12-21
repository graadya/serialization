import java.io.Serializable;

public class Pizza implements Serializable {

  String filling;

  Dough dough;

  public Pizza(String filling, Dough dough) {
    this.filling = filling;
    this.dough = dough;
  }


  @Override
  public String toString() {
    return "Pizza{" +
            "dough=" + dough +
            ", filling='" + filling + '\'' +
            '}';
  }

}
