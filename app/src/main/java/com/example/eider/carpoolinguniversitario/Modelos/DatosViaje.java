package com.example.eider.carpoolinguniversitario.Modelos;

/**
 * Created by Eider on 14/10/2017.
 */

public class DatosViaje {
    private  int pilotoID,PooleadoID,vaijeID;
    private String  origen,destino,fecha,HoraInicio,HoraFin,observaciones;

    public DatosViaje(int vaijeID, int pilotoID, int pooleadoID, String origen, String destino, String fecha, String horaInicio, String horaFin, String observaciones) {
        this.vaijeID = vaijeID;
        this.pilotoID = pilotoID;
        PooleadoID = pooleadoID;
        this.origen = origen;
        this.destino = destino;
        this.fecha = fecha;
        HoraInicio = horaInicio;
        HoraFin = horaFin;
        this.observaciones = observaciones;
    }
    public DatosViaje() {

    }

    public int getPilotoID() {
        return pilotoID;
    }

    public void setPilotoID(int pilotoID) {
        this.pilotoID = pilotoID;
    }

    public int getPooleadoID() {
        return PooleadoID;
    }

    public void setPooleadoID(int pooleadoID) {
        PooleadoID = pooleadoID;
    }

    public int getVaijeID() {
        return vaijeID;
    }

    public void setVaijeID(int vaijeID) {
        this.vaijeID = vaijeID;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getHoraInicio() {
        return HoraInicio;
    }

    public void setHoraInicio(String horaInicio) {
        HoraInicio = horaInicio;
    }

    public String getHoraFin() {
        return HoraFin;
    }

    public void setHoraFin(String horaFin) {
        HoraFin = horaFin;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }
}
