import org.sql2o.Connection;

import java.util.ArrayList;
import java.util.List;

public class ProductoRepository extends PostgresConnection{

    public ProductoRepository() {
        super("jdbc:postgresql://localhost:5432/postgres", "postgres", "rosariogt");
    }

    public List<Producto> getAll() throws Exception {
        List<Producto> productos = new ArrayList<>();
        String vSelectSql = "select * from public.productos ";
        try (Connection connection = sql2o.open()) {
            productos = connection.createQuery(vSelectSql)
                    .executeAndFetch(Producto.class);
        } catch (Exception ex) {
            ex.printStackTrace();
            throw new Exception("Excepcion al obtener productos", ex);
        }
        return productos;
    }

}
