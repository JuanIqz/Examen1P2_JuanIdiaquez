/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author juanf
 */
public abstract class Jugador {
    
    String Nombre;
    int Edad;
    String Nacionalidad;
    String PHabil;
    int Rating; 
    Equipo Equipo;
    int Agarre;
    int Lanzamiento;
    int Fisico;
    int Ritmo;
    int Entrada; 
    int Vision;
    int Passing; 
    int Regate;
    int Disparo; 

    public String getNombre() {
        return Nombre;
    }

    public int getEdad() {
        return Edad;
    }

    public String getNacionalidad() {
        return Nacionalidad;
    }

    public String getPHabil() {
        return PHabil;
    }

    public int getRating() {
        return Rating;
    }

    public Equipo getEquipo() {
        return Equipo;
    }

    public int getAgarre() {
        return Agarre;
    }

    public int getLanzamiento() {
        return Lanzamiento;
    }

    public int getFisico() {
        return Fisico;
    }

    public int getRitmo() {
        return Ritmo;
    }

    public int getEntrada() {
        return Entrada;
    }

    public int getVision() {
        return Vision;
    }

    public int getPassing() {
        return Passing;
    }

    public int getRegate() {
        return Regate;
    }

    public int getDisparo() {
        return Disparo;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }

    public void setNacionalidad(String Nacionalidad) {
        this.Nacionalidad = Nacionalidad;
    }

    public void setPHabil(String PHabil) {
        this.PHabil = PHabil;
    }

    public void setEquipo(Equipo Equipo) {
        this.Equipo = Equipo;
    }


    public Jugador() {
    }

    public Jugador(String Nombre, int Edad, String Nacionalidad, String PHabil, Equipo Equipo) {
        this.Nombre = Nombre;
        this.Edad = Edad;
        this.Nacionalidad = Nacionalidad;
        this.PHabil = PHabil;
        this.Equipo = Equipo;
    }
    
    
    @Override
    public String toString() {
        return "Jugador{" + "Nombre=" + Nombre + ", Edad=" + Edad + ", Nacionalidad=" + Nacionalidad + ", PHabil=" + PHabil + ", Rating=" + Rating + ", Equipo=" + Equipo + ", Agarre=" + Agarre + ", Lanzamiento=" + Lanzamiento + ", Fisico=" + Fisico + ", Ritmo=" + Ritmo + ", Entrada=" + Entrada + ", Vision=" + Vision + ", Passing=" + Passing + ", Regate=" + Regate + ", Disparo=" + Disparo + '}';
    }
    
    public abstract void agarre();
    
    public abstract void fisico();
    
    public abstract void ritmo();
   
    public abstract void entrada();
    
    public abstract void vision();
    
    public abstract void passing();
    
    public abstract void regate();
    
    public abstract void disparo();
    
    public abstract void lanzamiento();
    
    public abstract void rating();
}
