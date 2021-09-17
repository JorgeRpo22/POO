package poo.parcial.app;

import poo.parcial.dominio.CarritoDeMercado;
import poo.parcial.dominio.Producto;
import poo.parcial.dominio.TipoProducto;

public class AppCarritoDeMercado {
    public static void main(String[] args) {
        CarritoDeMercado carritoJorge = new CarritoDeMercado("Exito");

        Producto pro1 = Producto.crear("Manzana", 1800, TipoProducto.FRUTA);
        Producto pro2 = Producto.crear("Solomito", 18000, TipoProducto.CARNE);
        Producto pro3 = Producto.crear("Quesito", 6500, TipoProducto.LACTEO);
        Producto pro4 = Producto.crear("Lechuga", 3000, TipoProducto.VERDURA);
        Producto pro5 = Producto.crear("Naranja", 1000, TipoProducto.FRUTA);
        Producto pro6 = Producto.crear("Mandarina", 1000, TipoProducto.FRUTA);
        Producto pro7 = Producto.crear("Pan", 2500, TipoProducto.PAN);
        Producto pro8 = Producto.crear("Costillas", 25000, TipoProducto.CARNE);
        Producto pro9 = Producto.crear("Leche", 2200, TipoProducto.LACTEO);
        Producto pro10 = Producto.crear("Zucchini", 30500, TipoProducto.VERDURA);

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


        //carritoJorge.buscar("Leche");
        //System.out.println(carritoJorge.calcularValorTotal());

        //System.out.println(carritoJorge.buscarPorTipo("VERDURA"));

        System.out.println(carritoJorge.calcularValorTotal());
        carritoJorge.sacar("Manzana");
        System.out.println(carritoJorge.calcularValorTotal());






    }
}
