import java.lang.reflect.Field;

/**
 * App
 */
public class App {

  public static void main(String[] args) {
    Objeto objeto = new Objeto();

    for (Field field : objeto.getClass().getDeclaredFields()) {
      if (field.isAnnotationPresent(Tabela.class)) {
        String msg = field.getAnnotation(Tabela.class).value();
        System.out.println(msg);
      }
    }
  }
}
