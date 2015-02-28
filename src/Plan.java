/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Felipe
 */
public class Plan {
    private String codigo;
    private Fecha[] fechas;
    private Sucursal sucursal;
    private String tipo;
    private String descripcion;
    private Involucrado[] involucrados;
    private int cantActividades;
    private Actividad[] actividades;
    private String resolucion;
    
    public Plan(String pcodigoPlan, Fecha pfechaRegistro, String pnombreSucursal, String pcodigoSucursal,String pdireccionSucursal,String ptipoPlan,String pdescripcionPlan, Involucrado[] pinvolucrados, Fecha pasignacionLider, int pcantActividades,Actividad[] pactividades,Fecha panalisis,Fecha pauditoria,String presolucion){
        setCodigo(pcodigoPlan);
        
        setFechas(pfechaRegistro,pasignacionLider,panalisis,pauditoria);
        
        setSucursal(pnombreSucursal,pcodigoSucursal,pdireccionSucursal);
        
        setTipo(tipo);
        
        setInvolucrados(pinvolucrados);
        
        setCantActividades(pcantActividades);
        
        setActividades(pactividades);
        
        setResolucion(presolucion);
        
        
    }
    
    private void setCodigo(String pcodigo){
        this.codigo = pcodigo;
        
    }
    private String getCodigo(){
        return this.codigo;
    }
    private void setFechas(Fecha pRegistro,Fecha pAsignacionLider,Fecha panalisis, Fecha pauditoria){
        fechas[0] = pRegistro;
        fechas[1] = pAsignacionLider;
        fechas[2] = panalisis;
        fechas[3] = pauditoria;
    }
    private void setSucursal(String pnombreSucursal,String pcodigoSucursal,String pdireccionSucursal){
        this.sucursal = new Sucursal(pnombreSucursal, pcodigoSucursal, pdireccionSucursal);
    }
    private Sucursal getSucursal(){
        return this.sucursal;
    }
    private void setInvolucrados(Involucrado[] pinvolucrados){
        for(int i = 0; i < 4; i++){
            this.involucrados[i] = pinvolucrados[i];
        }
    }
    private void setTipo(String ptipo){
        this.tipo = ptipo;
    }
    private String getTipo(){   
        return this.tipo;
    }
    private void setResolucion(String presolucion){
        this.resolucion = presolucion;
    }
    private String getResolucion(){
        return this.resolucion;
    }
    private void setCantActividades(int pcantActividades){
        this.cantActividades = pcantActividades;
    }
    private int getCantActividades(){
        return this.cantActividades;
    }
    private void setDescripcion(String pdescripcion){
        this.descripcion = pdescripcion;
    }
    private void setActividades(Actividad[] pactividades){
        this.actividades = new Actividad[getCantActividades()];
        for(int i = 0; i < this.actividades.length;i++){
            actividades[i] = pactividades[i];
        }
    }
    private Actividad[] actividades(){
        return this.actividades;
    }
        
}
