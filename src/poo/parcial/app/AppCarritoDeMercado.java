package poo.parcial.app;

import poo.parcial.dominio.CarritoDeMercado;
import poo.parcial.dominio.Producto;
import poo.parcial.dominio.TipoProducto;

import java.util.ArrayList;
import java.util.List;

public class AppCarritoDeMercado {
    public static void main(String[] args) {
        CarritoDeMercado carritoJorge = new CarritoDeMercado("Exito");

        Producto pro1 = new Producto("Manzana", 1800, TipoProducto.FRUTA);
        Producto pro2 = new Producto("Solomito", 18000, TipoProducto.CARNE);
        Producto pro3 = new Producto("Quesito", 6500, TipoProducto.LACTEO);
        Producto pro4 = new Producto("Lechuga", 3000, TipoProducto.VERDURA);
        Producto pro5 = new Producto("Naranja", 1000, TipoProducto.FRUTA);
        Producto pro6 = new Producto("Mandarina", 1000, TipoProducto.FRUTA);
        Producto pro7 = new Producto("Pan", 2500, TipoProducto.PAN);
        Producto pro8 = new Producto("Costillas", 25000, TipoProducto.CARNE);
        Producto pro9 = new Producto("Leche", 2200, TipoProducto.LACTEO);
        Producto pro10 = new Producto("Zucchini", 30500, TipoProducto.VERDURA);
        Producto pro11 = new Producto("Leche", 2200, TipoProducto.LACTEO);


        carritoJorge.getProductos().add(pro1);
        carritoJorge.getProductos().add(pro2);
        carritoJorge.getProductos().add(pro3);
        carritoJorge.getProductos().add(pro4);
        carritoJorge.getProductos().add(pro5);
        carritoJorge.getProductos().add(pro6);
        carritoJorge.getProductos().add(pro7);
        carritoJorge.getProductos().add(pro8);
        carritoJorge.getProductos().add(pro9);
        carritoJorge.getProductos().add(pro10);
        carritoJorge.getProductos().add(pro11);


        //Producto p = carritoJorge.buscar("Leche");
        //System.out.println("Se encuentra el producto " + p.getNombre() + " en el carrito");

        //List<Producto> pr = new ArrayList<>();
        carritoJorge.buscarPorTipo("LACTEO");





        //System.out.println(carritoJorge.calcularValorTotal());

        //System.out.println(carritoJorge.buscarPorTipo("VERDURA"));

        //System.out.println(carritoJorge.calcularValorTotal());
        //carritoJorge.sacar("Manzana");
        //System.out.println(carritoJorge.calcularValorTotal());






    }
}
