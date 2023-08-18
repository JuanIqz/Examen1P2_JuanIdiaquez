/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author juanf
 */
public class Estadio {
    
    String Nombre;
    String Ciudad;
    int Capacidad;
    Equipo Equipo; 

    public String getNombre() {
        return Nombre;
    }

    public String getCiudad() {
        return Ciudad;
    }

    public int getCapacidad() {
        return Capacidad;
    }

    public Equipo getEquipo() {
        return Equipo;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public void setCiudad(String Ciudad) {
        this.Ciudad = Ciudad;
    }

    public void setCapacidad(int Capacidad) {
        this.Capacidad = Capacidad;
    }

    public void setEquipo(Equipo Equipo) {
        this.Equipo = Equipo;
    }

    public Estadio() {
    }

    public Estadio(String Nombre, String Ciudad, int Capacidad, Equipo Equipo) {
        this.Nombre = Nombre;
        this.Ciudad = Ciudad;
        this.Capacidad = Capacidad;
        this.Equipo = Equipo;
    }

    @Override
    public String toString() {
        return "Estadio{" + "Nombre=" + Nombre + ", Ciudad=" + Ciudad + ", Capacidad=" + Capacidad + ", Equipo=" + Equipo + '}';
    }
    
    
}
