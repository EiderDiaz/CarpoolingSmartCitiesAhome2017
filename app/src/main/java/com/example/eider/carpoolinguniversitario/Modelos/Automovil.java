package com.example.eider.carpoolinguniversitario.Modelos;

/**
 * Created by Eider on 14/10/2017.
 */

public class Automovil {
    private  int id;
    private String name;
    private String matricula;
    private String status;
    private String activation_date;
    private double used_hours;

    public Automovil(int id, String name, String matricula, String status, String activation_date, double used_hours) {
        this.id = id;
        this.name = name;
        this.matricula = matricula;
        this.status = status;
        this.activation_date = activation_date;
        this.used_hours = used_hours;
    }

    public Automovil() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
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

    public double getUsed_hours() {
        return used_hours;
    }

    public void setUsed_hours(double used_hours) {
        this.used_hours = used_hours;
    }
}
