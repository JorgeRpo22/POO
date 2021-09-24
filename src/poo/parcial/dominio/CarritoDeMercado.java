package poo.parcial.dominio;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class CarritoDeMercado {
    public static final byte CAPACIDAD = 20;

    private String supermercado;
    private List<Producto> productos;

    public CarritoDeMercado(String supermercado) {
        this.supermercado = supermercado;
        this.productos = new ArrayList<>();
    }

    public Producto buscar(String nombre) {
        Producto productoBuscado = null;

        //Funcional
        productoBuscado = this.productos.stream()
                .filter(producto -> producto.getNombre().equalsIgnoreCase(nombre))
                .findFirst().get();

        //Tradicional
//        for (Producto produc: this.productos) {
//            if (produc.getNombre().equalsIgnoreCase(nombre)) {
//                productoBuscado = produc;
//                break;
//            }
//        }

        return productoBuscado;
    }

    public List<Producto> buscarPorTipo(String tipo) {
        List<Producto> buscarProduct = new ArrayList<>();

        //Verifico sí el tipo existe
        if (TipoProducto.TIPOS.stream().filter(p -> p.equalsIgnoreCase(tipo)).findFirst().isPresent()) {
            //Funcional
            buscarProduct = this.productos.stream()
                    .filter(producto -> producto.getTipo().equalsIgnoreCase(tipo))
                    .collect(Collectors.toList());

            System.out.println(buscarProduct);
            return buscarProduct;
        } else {
            System.out.println("El tipo de producto no existe");
            return null;
        }
    }

    public boolean agregar(Producto producto) {
        if (this.productos.size() < CAPACIDAD) {
            this.productos.add(producto);
            return true;
        }

        return false;
    }

    public boolean sacar(String nombre) {
        Producto productoASacar = buscar(nombre);

        if (productoASacar != null) {
            this.productos.remove(productoASacar);
            return true;
        }
        return false;

//        for (Producto produc: this.getProductos()) {
//            if (produc.getNombre().equals(nombre) ){
//                List<String> nombresProductos = this.productos.stream().map(producto -> producto.getNombre()).collect(Collectors.toList());
//                int indiceProducto = nombresProductos.indexOf(nombre);
//                getProductos().remove((indiceProducto));
//                System.out.println("Se eliminó exitosamente el producto: " + produc.getNombre() + " del carrito");
//                return true;
//            }
//        }
//        return false;
    }

    public int calcularValorTotal() {
        int totalPrecio = 0;

        //Tradicional
//        for (int i = 0; i < this.productos.size(); i++) {
//            Producto prod = this.productos.get(i);
//
//            totalPrecio += prod.getPrecio();
//        }
//
//        for (Producto prod : this.productos) {
//            totalPrecio += prod.getPrecio();
//        }

        //Funcional
        totalPrecio = this.productos.stream()
                .mapToInt(Producto::getPrecio)
                .sum();

        return totalPrecio;
    }

    public Producto obtenerProductoMasCaro() {
        Producto productoMasCaro = null;

        //Tradicional
//        for (Producto prod : this.productos) {
//            if (prod.getPrecio() > productoMasCaro.getPrecio()) {
//                productoMasCaro = prod;
//            }
//        }

        //Funcional
        Collections.sort(this.productos, Comparator.comparingInt(Producto::getPrecio).reversed());
        return this.productos.get(0);
    }

    public String getSupermercado() {
        return supermercado;
    }

    public List<Producto> getProductos() {
        return productos;
    }

    public void setSupermercado(String supermercado) {
        this.supermercado = supermercado;
    }

    public void setProductos(List<Producto> productos) {
        this.productos = productos;
    }
}
