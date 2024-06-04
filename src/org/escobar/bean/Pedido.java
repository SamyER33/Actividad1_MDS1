/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.escobar.bean;

import java.util.Date;

/**
 *
 * @author Baapym
 */
public class Pedido {
    private Integer idPedido;
    private String remitente;
    private String tipo;
    private String descripcion;
    private Date fechaEntrega;
    private Date fechaRecoleccion;
    private Integer cantidad;
    private double costo;

    public Integer getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(Integer idPedido) {
        this.idPedido = idPedido;
    }

    public String getRemitente() {
        return remitente;
    }

    public void setRemitente(String remitente) {
        this.remitente = remitente;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Date getFechaEntrega() {
        return fechaEntrega;
    }

    public void setFechaEntrega(Date fechaEntrega) {
        this.fechaEntrega = fechaEntrega;
    }

    public Date getFechaRecoleccion() {
        return fechaRecoleccion;
    }

    public void setFechaRecoleccion(Date fechaRecoleccion) {
        this.fechaRecoleccion = fechaRecoleccion;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    public Pedido() {
    }

    public Pedido(Integer idPedido, String remitente, String tipo, String descripcion, Date fechaEntrega, Date fechaRecoleccion, Integer cantidad, double costo) {
        this.idPedido = idPedido;
        this.remitente = remitente;
        this.tipo = tipo;
        this.descripcion = descripcion;
        this.fechaEntrega = fechaEntrega;
        this.fechaRecoleccion = fechaRecoleccion;
        this.cantidad = cantidad;
        this.costo = costo;
    }
    
}
