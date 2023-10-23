import java.lang.reflect.Field;

/**
 * App
 */
public class App {

  public static void main(String[] args) {
    Objeto objeto = new Objeto();

    for (Field field : objeto.getClass().getDeclaredFields()) {
      if (field.isAnnotationPresent(Tabela.class)) {
        System.out.println(field.getName());
      }
    }
  }
}
