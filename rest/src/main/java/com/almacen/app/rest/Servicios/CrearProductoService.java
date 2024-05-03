@Service
public class ProductoService {

    @Autowired
    private ProductoRepository productoRepository;

    public Producto crearProducto(Producto producto) {

        Producto productoGuardado = productoRepository.save(producto);


        return productoGuardado;
    }
    public List<Producto> buscarProductosPorNombre(String nombre) {
        return productoRepository.findAllByNombreContainingIgnoreCase(nombre);
    }
    public void darBajaLogicaProducto(Long idProducto) {
        Producto producto = productoRepository.findById(idProducto)
                .orElseThrow(() -> new ProductoNoEncontradoException(idProducto));

        producto.setEstado(Producto.Estado.INACTIVO);
        productoRepository.save(producto);
    }
    public Producto modificarProducto(Producto productoModificado) {
        Producto productoActual = productoRepository.findById(productoModificado.getId())
                .orElseThrow(() -> new ProductoNoEncontradoException(productoModificado.getId()));


        productoActual.setNombre(productoModificado.getNombre());
        productoActual.setPrecio(productoModificado.getPrecio());
        productoActual.setDescripcion(productoModificado.getDescripcion());
        productoActual.setTipoProducto(productoModificado.getTipoProducto());


        return productoRepository.save(productoActual);
    }
}
