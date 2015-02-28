/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Felipe
 */
public abstract class Involucrado {

    private String tipo;
    private String nombre;
    
    public Involucrado(){
        this("","");
    }
    
    public Involucrado(String ptipo, String pnombre){
        setNombre(pnombre);
        setTipo(ptipo);
    }
    public String getNombre() {
        return this.nombre;
    }

    public void  setNombre(String pnombre) {
        this.nombre = pnombre;
    }

    public String getTipo() {
        return this.tipo;
    }

    public void setTipo(String ptipo) {
        this.tipo = ptipo;
    }
    
    
}
