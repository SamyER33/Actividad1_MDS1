/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.escobar.manejador;

/**
 *
 * @author Baapym
 */
public class SesionUsuario {
    private Usuario usuario;
    private boolean estaAutenticado;
    
    public SesioUsuario() {
        this.estaAutenticado = false;
    }
    
    public boolean iniciarSesion(String userName, String password, ArrayList<Usuario> listaUsuarios) {
        for (Usuario u : listaUsuarios) {
            if (u.getUserName().equals(userName) && u.getPassword().equals(password)) {
                this.usuario = u;
                this.estaAutenticado = true;
                return true;
            }
        }
        return false;
    }
    
    public void cerrarSesion() {
        this.usuario = null;
        this.estaAutenticado = false;
    }
    
    public Usuario getUsuario() {
        return usuario;
    }
    
    public boolean isEstaAutenticado() {
        return estaAutenticado;
    }
    
}
