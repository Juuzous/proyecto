/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Felipe
 */
public class Sucursal {
    
    private String nombre;
    private String codigo;
    private String direccion;
    
    public Sucursal(String pnombre, String pcodigo, String pdireccion){
        setNombre(pnombre);
        setCodigo(pcodigo);
        setDireccion(pdireccion);
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String pnombre) {
        this.nombre = pnombre;
    }

    public String getCodigo() {
        return this.codigo;
    }

    public void setCodigo(String pcodigo) {
        this.codigo = pcodigo;
    }

    public String getDireccion() {
        return this.direccion;
    }

    public void setDireccion(String pdireccion) {
        this.direccion = pdireccion;
    }
    
        
}
