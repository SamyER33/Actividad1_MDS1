/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package org.escobar.pedidos;

/**
 *
 * @author Baapym
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        while (true) {
            System.out.println("1. Crear cuenta");
            System.out.println("2. Iniciar sesión");
            System.out.println("3. Agregar pedido");
            System.out.println("4. Editar pedido");
            System.out.println("5. Listar pedidos");
            System.out.println("6. Eliminar pedido");
            System.out.println("7. Cerrar sesión");
            System.out.println("8. Salir");
            Integer opcion = scanner.nextInteger();
            scanner.nextLine();
            
            switch (opcion) {
                case 1:
                    crearCuenta();
                    break;
                case 2:
                    iniciarSesion();
                    break;
                case 3:
                    agregarPedido();
                    break;
                case 4:
                    editarPedido();
                    break;
                case 5:
                    listarPedidos();
                    break;
                case 6:
                    eliminarPedido();
                    break;
                case 7:
                    cerrarSesion();
                    break;
                case 8:
                    System.exit(0);
                default:
                    System.out.println("Opción no válida.");
            }
        }
    }
    
    private static void crearCuenta() {
        System.out.print("ID del usuario: ");
        Integer idUsuario = scanner.nextInteger();
        scanner.nextLine();
        System.out.print("Nombre: ");
        String nombre = scanner.nextLine();
        System.out.print("UserName: ");
        String userName = scanner.nextLine();
        System.out.print("Password: ");
        String password = scanner.nextLine();
        System.out.print("Email: ");
        String email = scanner.nextLine();
        
        Usuario usuario = new Usuario(idUsuario, nombre, userName, password, email);
        listaUsuarios.add(Usuario);
        System.out.println("Cuenta creada.");
    }
    
    private static void iniciarSesion() {
        System.out.print("UserName: ");
        String userName = scanner.nextLine();
        System.out.print("Password: ");
        String password = scanner.nextLine();
        
        
    }
}
