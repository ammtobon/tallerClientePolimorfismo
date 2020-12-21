package com.clientes;

import com.clases.Clientes;
import com.clases.Producto;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Integer opMenu = -1;
        ArrayList<Clientes> lstClientes = new ArrayList<>();
        ArrayList<Producto> lstProducto = new ArrayList<>();

        String menu =
                        "         * 1 Agregar cliente\n" +
                        "         * 2 Editar cliente\n" +
                        "         * 3 Eliminar cliente\n" +
                        "         * 4 Agregar productos\n" +
                        "         * 5 Consultar clientes con documento y tipo de documento \n" +
                        "         * 0 salir de la aplicacion";
        //Scanner in = new Scanner(System.in);
        //@Deprecated(since = "1.2", forRemoval = true)

        boolean existeCliente = false;

        do {
            //System.out.println(menu);
            opMenu = Integer.parseInt(JOptionPane.showInputDialog(null, menu, "Menu",JOptionPane.INFORMATION_MESSAGE));
            switch (opMenu.toString()) {
                case "1":
                    Clientes cliente = new Clientes();
                    ArrayList<Producto> lstProdClte = new ArrayList<>();

                    cliente.setTipoDoc(Integer.parseInt(JOptionPane.showInputDialog(null, "Digite tipo Id: ", "Agregar Cliente", JOptionPane.INFORMATION_MESSAGE)));
                    cliente.setDocumento(Integer.parseInt(JOptionPane.showInputDialog(null, "Digite No. Documento: ", "Agregar Cliente", JOptionPane.INFORMATION_MESSAGE)));
                    cliente.setNombre(JOptionPane.showInputDialog(null, "Digite el nombre: ", "Agregar Cliente", JOptionPane.INFORMATION_MESSAGE));
                    cliente.setTelefono(JOptionPane.showInputDialog(null, "Digite el teléfono: ", "Agregar Cliente", JOptionPane.INFORMATION_MESSAGE));
                    cliente.setDireccion(JOptionPane.showInputDialog(null, "Digite la dirección: ", "Agregar Cliente", JOptionPane.INFORMATION_MESSAGE));

                    String resp = "SI";
                    while (resp.equals("SI")){
                        Producto clieProducto = new Producto();
                        clieProducto.setIdProducto(JOptionPane.showInputDialog(null, "Digite Id. Producto: ", "Agregar Productos", JOptionPane.INFORMATION_MESSAGE).toUpperCase());
                        clieProducto.setNombre(JOptionPane.showInputDialog(null, "Nombre Producto: ", "Agregar Productos", JOptionPane.INFORMATION_MESSAGE));
                        clieProducto.setCarateristicas(JOptionPane.showInputDialog(null, "Caracteristicas: ", "Agregar Productos", JOptionPane.INFORMATION_MESSAGE));

                        lstProdClte.add(clieProducto);
                        System.out.println(lstProdClte);

                        JOptionPane.showMessageDialog(null, "Producto creado");

                        resp = JOptionPane.showInputDialog(null, "Desea ingresar otro producto? SI/NO", "SI").toUpperCase();
                    }

                    cliente.setProductos(lstProdClte);
                    lstClientes.add(cliente);
                    System.out.println(lstClientes);

                    JOptionPane.showMessageDialog(null, "Cliente creado");
                    break;
                case "2":
                    existeCliente = false;
                    int tipoId = (Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese tipo Id: ", "Editar Cliente", JOptionPane.INFORMATION_MESSAGE)));
                    int identificacion = (Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese identificación: ", "Editar Cliente", JOptionPane.INFORMATION_MESSAGE)));

                    for (int i=0; i<lstClientes.size(); i++){

                        if (tipoId == lstClientes.get(i).getTipoDoc() && identificacion == lstClientes.get(i).getDocumento()){
                            lstClientes.get(i).setNombre(JOptionPane.showInputDialog(null, "Nombre cliente: ", lstClientes.get(i).getNombre()));
                            lstClientes.get(i).setTelefono(JOptionPane.showInputDialog(null, "Teléfono cliente: ", lstClientes.get(i).getTelefono()));
                            lstClientes.get(i).setDireccion(JOptionPane.showInputDialog(null, "Dirección cliente: ", lstClientes.get(i).getDireccion()));

                            System.out.println(lstClientes);

                            JOptionPane.showMessageDialog(null, "Cliente Modificado", "Editar Cliente", JOptionPane.INFORMATION_MESSAGE);
                            existeCliente = true;
                        }
                    }
                    if (!existeCliente){
                        JOptionPane.showMessageDialog(null, "Cliente no existe", "Editar Cliente", JOptionPane.WARNING_MESSAGE);
                    }
                    break;
                case "3":
                    existeCliente = false;
                    int tipId = (Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese tipo Id: ", "Eliminar Cliente", JOptionPane.INFORMATION_MESSAGE)));
                    int idCliente = (Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese identificación: ", "Eliminar Cliente", JOptionPane.INFORMATION_MESSAGE)));

                    for (int i=0; i<lstClientes.size(); i++){
                        if (tipId == lstClientes.get(i).getTipoDoc() && idCliente == lstClientes.get(i).getDocumento()){
                            lstClientes.remove(i);
                            System.out.println(lstClientes);

                            JOptionPane.showMessageDialog(null, "Cliente Eliminado", "Eliminar Cliente", JOptionPane.INFORMATION_MESSAGE);
                            existeCliente = true;
                        }
                    }
                    if (!existeCliente) {
                        JOptionPane.showMessageDialog(null, "Cliente no existe", "Eliminar Cliente", JOptionPane.WARNING_MESSAGE);
                    }
                    break;
                case "4":
                    Producto nuevoProducto = new Producto();
                    nuevoProducto.setIdProducto(JOptionPane.showInputDialog(null, "Digite Id. Producto: ", "Agregar Productos", JOptionPane.INFORMATION_MESSAGE).toUpperCase());
                    nuevoProducto.setNombre(JOptionPane.showInputDialog(null, "Nombre Producto: ", "Agregar Productos", JOptionPane.INFORMATION_MESSAGE));
                    nuevoProducto.setCarateristicas(JOptionPane.showInputDialog(null, "Caracteristicas: ", "Agregar Productos", JOptionPane.INFORMATION_MESSAGE));

                    lstProducto.add(nuevoProducto);
                    System.out.println(lstProducto);

                    JOptionPane.showMessageDialog(null, "Producto creado");
                    break;
                case "5":
                    existeCliente = false;
                    int idTipo = (Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese tipo Id: ", "Consulta Cliente", JOptionPane.INFORMATION_MESSAGE)));
                    int clienteId = (Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese identificación: ", "Consulta Cliente", JOptionPane.INFORMATION_MESSAGE)));

                    for (int i=0; i<lstClientes.size(); i++){

                        if (idTipo == lstClientes.get(i).getTipoDoc() && clienteId == lstClientes.get(i).getDocumento()) {
                            JOptionPane.showMessageDialog(null,
                                    "Nombre Cliente: " + lstClientes.get(i).getNombre() + "\n" +
                                            "Teléfono: " + lstClientes.get(i).getTelefono() + "\n" +
                                            "Dirección: " + lstClientes.get(i).getDireccion() + "\n" +
                                            " Productos del Cliente " + "\n" +
                                            lstClientes.get(i).getProductos(), "Consulta de Clientes",
                                    JOptionPane.INFORMATION_MESSAGE);
                            existeCliente = true;
                        }
                    }
                    if (!existeCliente){
                        JOptionPane.showMessageDialog(null, "Cliente no existe", "Consulta Cliente", JOptionPane.WARNING_MESSAGE);
                    }
                    break;
                case "0":
                    JOptionPane.showMessageDialog(null, "Muchas gracias por usar nuestra app, hasta luego", "Menu", JOptionPane.INFORMATION_MESSAGE);
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "El valor ingresado no es una opcion de menu", "Menu", JOptionPane.WARNING_MESSAGE);
                    break;
            }
        } while (!opMenu.toString().equals("0"));

    }
}
