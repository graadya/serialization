import java.io.Serializable;

public class Pizza implements Serializable {

  String filling = "hawwaii";

 Dough dough = new Dough();


  @Override
    public String toString() {
      return "Pizza{" +
              "dough=" + dough +
              ", filling='" + filling + '\'' +
              '}';
    }




}
