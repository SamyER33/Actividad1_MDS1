/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.escobar.manejador;

import java.util.ArrayList;

/**
 *
 * @author Baapym
 */
public class ManejadorPedido {
    private static ManejadorPedido singleton;
    private ArrayList<Pedido> listaPedidos;
    
    private ManejadorPedido() {
        listaPedidos = new ArrayList<>();
    }
    
    public static ManejadorPedido getSingleton() {
        if (singleton == null) {
            singleton = new ManejadorPedido();
        }
        return singleton;
    }
    
    public void agregar(Pedido pedido) {
        listaPedidos.add(pedido);
    }
    
    public void editar(Pedido pedido) {
        for (Integer i = 0; i < listaPedidos.size(); i++) {
            if (listaPedidos.get(i).getIdPedido() == pedido.getIdPedido()) {
                listaPedidos.set(i, pedido);
                break;
            }
        }
    }
    
    public void eliminar(Integer idPedido) {
        listaPedidos.removeIf(p -> p.getIdPedido() == idPedido);
    }
    
    public ArrayList<Pedido> listar() {
        return listaPedidos;
    }
    
    public Pedido buscar(Integer idPedido) {
        for (Pedido pedido : listaPedidos) {
            if (pedido.getIdPedido() == idPedido) {
                return pedido;
            }
        }
        return null;
    }
    
}
