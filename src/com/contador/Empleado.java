package com.contador;

public abstract class Empleado {
    public String getNombre() {
        return nombre;
    }

    private String nombre;
    public Empleado(String nombre){
        this.nombre=nombre;
    }
    protected abstract long calcularSalario();

}
