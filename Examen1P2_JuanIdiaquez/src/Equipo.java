/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.ArrayList;

/**
 *
 * @author juanf
 */
public class Equipo {

    String Nombre;
    String Pais;
    int Rating;
    ArrayList <Jugador>Plantilla = new ArrayList();

    public Equipo(String Nombre, String Pais) {
        this.Nombre = Nombre;
        this.Pais = Pais;
    }

    public String getNombre() {
        return Nombre;
    }

    public String getPais() {
        return Pais;
    }

    public int getRating() {
        return Rating;
    }

    public ArrayList getPlantilla() {
        return Plantilla;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public void setPais(String Pais) {
        this.Pais = Pais;
    }

    public void setPlantilla(ArrayList Plantilla) {
        this.Plantilla = Plantilla;
    }

    @Override
    public String toString() {
        return "Equipo{" + "Nombre=" + Nombre + ", Pais=" + Pais + ", Rating=" + Rating + ", Plantilla=" + Plantilla + '}';
    }

    public void Rating() {
        int rating = 0;
        if (Plantilla.isEmpty()) {
            this.Rating = 0;
        } else {
            for (int i = 0; i < Plantilla.size(); i++) {
                rating+= Plantilla.get(i).getRating();
            }
            this.Rating=rating/Plantilla.size();
        }

    }

}
