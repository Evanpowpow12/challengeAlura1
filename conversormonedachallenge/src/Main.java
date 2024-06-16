import com.aluracursos.conversormonedas.CurrencyConverter;
import com.aluracursos.conversormonedas.Menu;

public class Main {
    public static void main(String[] args) {

        CurrencyConverter converter = new CurrencyConverter();
        converter.setApiKey("4d006113bd5263d8b1a1b97d");

        Menu menu = new Menu(converter);
        menu.displayMenu();
    }
}