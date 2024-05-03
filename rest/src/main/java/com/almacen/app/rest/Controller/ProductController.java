@RestController
@RequestMapping("/productos")
public class ProductoController {

    @Autowired
    private ProductoService productoService;

    @PostMapping // POST /productos to create a new product
    public ResponseEntity<Producto> crearProducto(@RequestBody Producto producto) {
        Producto productoCreado = productoService.crearProducto(producto);
        return ResponseEntity.created(URI.create("/productos/" + productoCreado.getId())).body(productoCreado);
    }

    @GetMapping("/{id}") // GET /productos/{id} to get a product by ID
    public ResponseEntity<Producto> getProductoById(@PathVariable Long id) {
        Producto producto = productoService.buscarProductoPorId(id);
        if (producto != null) {
            return ResponseEntity.ok(producto);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PutMapping("/{id}") // PUT /productos/{id} to update a product
    public ResponseEntity<Producto> actualizarProducto(@PathVariable Long id, @RequestBody Producto productoModificado) {
        productoModificado.setId(id); // Set the ID before updating
        Producto productoActualizado = productoService.modificarProducto(productoModificado);
        if (productoActualizado != null) {
            return ResponseEntity.ok(productoActualizado);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/{id}") // DELETE /productos/{id} to delete a product
    public ResponseEntity<Void> eliminarProducto(@PathVariable Long id) {
        productoService.eliminarProducto(id);
        return ResponseEntity.noContent().build();
    }

    @GetMapping // GET /productos to get all products
    public ResponseEntity<List<Producto>> getAllProductos() {
        List<Producto> productos = productoService.buscarTodosLosProductos();
        return ResponseEntity.ok(productos);
    }


}
