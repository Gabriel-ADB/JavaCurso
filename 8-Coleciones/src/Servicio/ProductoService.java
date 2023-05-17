/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicio;

import Entidades.Producto;
import java.util.HashMap;
import java.util.Scanner;
import java.util.TreeMap;

/**
 * Se necesita una aplicación para una tienda en la cual queremos almacenar los
 * distintos productos que venderemos y el precio que tendrán. Además, se
 * necesita que la aplicación cuente con las funciones básicas.
 *
 * Estas las realizaremos en el servicio. Como, introducir un elemento,
 * modificar su precio, eliminar un producto y mostrar los productos que tenemos
 * con su precio (Utilizar Hashmap). El HashMap tendrá de llave el nombre del
 * producto y de valor el precio. Realizar un menú para lograr todas las
 * acciones previamente mencionadas.
 *
 * @author Gabriel
 */
public class ProductoService {

    private Scanner sc = new Scanner(System.in);
    HashMap<String, Integer> misProductos = new HashMap<>();

    public void crearProducto() {
        System.out.println("Ingrese nombre del producto: ");
        String name = sc.nextLine();

        System.out.println("Ingrese valor del producto");
        Integer valor = sc.nextInt();

        misProductos.put(name, valor);

    }

    public void cambiarPrecio() {
        System.out.println("Ingrese producto a modificar el precio: ");
        String prod = sc.nextLine();

        if (misProductos.containsKey(prod))
        {
            System.out.println("Se encontro el producto: " + prod);
            System.out.println("Ingrese nuevo precio: ");
            Integer nuevoPrecio = sc.nextInt();

            System.out.println("Esta seguro de cambiar el valor? s/n");
            String op = sc.nextLine();
            if (op.equalsIgnoreCase("s"))
            {
                misProductos.put(prod, nuevoPrecio);
                System.out.println("Se modifico el precio del producto con exito!");
            } else
            {
                System.out.println("El precio no se modifico");

            }

        }

    }

    public void eliminarProducto() {
        System.out.println("Ingrese producto a eliminar");
        String pElim = sc.nextLine();
        String op;

        Integer clave = misProductos.get(pElim);

        System.out.println("Desea eliminar el producto : " + pElim + " de la lista de productos? s/n");
        op = sc.nextLine();

        if (op.equalsIgnoreCase("s"))
        {
            if (pElim != null)
            {
                System.out.println("Se elimino el producto: " + pElim + " correctamente!");
                misProductos.get(pElim);

            } else
            {
                System.out.println("No se encontro el producto a eliminar, no se elimino ningun producto.");
            }

        } else
        {
            System.out.println("El usuario no selecciono ningun producto para eliminar.");
        }
    }

    public void ordenarProductos() {
        TreeMap<String, Integer> miListaOrdenada = new TreeMap<>(misProductos);
        for (Object aux : miListaOrdenada.keySet())
        {
            Integer value = miListaOrdenada.get(aux);
            System.out.println("Producto: " + aux + " Precio: " + value);

        }
    }

    public void menu() {
        int op;
        
        do
        {
        System.out.println("=========================================================");
        System.out.println("Bienvenido a su programa de carga de productos By Gabeto");
        System.out.println("=========================================================");

        System.out.println("=======================MENU========================");
        System.out.println("1- Cargar nuevo producto");
        System.out.println("2- Cambiar precio al producto");
        System.out.println("3- Eliminar un producto de la lista");
        System.out.println("4- Ver lista de productos");
        System.out.println("5- Salir");
        System.out.println("Elija opcion: ");

        op = sc.nextInt();

        switch (op)
        {
            case 1:
                crearProducto();

                break;

            case 2:
                cambiarPrecio();
                break;

            case 3:
                eliminarProducto();
                break;

            case 4:
                ordenarProductos();
                break;

            case 5:
                System.out.println("Hasta luego!");
                System.out.println("========================");
                System.out.println("====Fin del programa====");
                System.out.println("========================");
                break;
            default:
                System.out.println("La opcion ingresa es incorrecta, vuelva a intentarlo!");

        }
            
        } while (op!=5);
        

    }

}
