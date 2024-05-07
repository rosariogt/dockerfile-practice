import java.time.LocalDate;
import java.util.List;

import static spark.Spark.port;
import static spark.Spark.*;

public class App {

    public static void main(String[] args) {

        ProductoRepository repository = new ProductoRepository();
        port(  8081 );

        get("/hello/:name", (req, res) -> {
            return "Hello, ";
        });

        get("/productos", (req, res)-> {
            List<Producto> productos = repository.getAll();
            return productos;
        });

        System.out.println("Iniciando server " + port() + " " + LocalDate.now());
    }
}
