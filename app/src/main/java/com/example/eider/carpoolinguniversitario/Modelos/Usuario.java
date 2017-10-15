package com.example.eider.carpoolinguniversitario.Modelos;

/**
 * Created by Eider on 14/10/2017.
 */

public class Usuario {
    private  int id;
    private int automovilID;
    private String name;
    private String status;
    private String activation_date;
    private String used_hours;

    public Usuario(int id, int automovilID, String name, String status, String activation_date, String used_hours) {
        this.id = id;
        this.automovilID = automovilID;
        this.name = name;
        this.status = status;
        this.activation_date = activation_date;
        this.used_hours = used_hours;
    }
    public Usuario(){

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAutomovilID() {
        return automovilID;
    }

    public void setAutomovilID(int automovilID) {
        this.automovilID = automovilID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getActivation_date() {
        return activation_date;
    }

    public void setActivation_date(String activation_date) {
        this.activation_date = activation_date;
    }

    public String getUsed_hours() {
        return used_hours;
    }

    public void setUsed_hours(String used_hours) {
        this.used_hours = used_hours;
    }
}
