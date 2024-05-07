import junit.framework.TestCase;
        import org.junit.Test;

        import java.util.List;

public class ProductoRepositoryTest extends TestCase {
    private ProductoRepository repository = new ProductoRepository();

    @Test
    public void testFindAll() throws Exception {
        List<Producto> result = repository.getAll();
        System.out.println("result = " + result);
        assertTrue(result.size() > 0);
    }
}
