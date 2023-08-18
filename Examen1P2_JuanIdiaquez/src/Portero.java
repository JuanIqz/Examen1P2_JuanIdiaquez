
import java.util.Random;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author juanf
 */
public class Portero extends Jugador{
    
    public Portero(String Nombre, int Edad, String Nacionalidad, String PHabil, Equipo Equipo) {
        super(Nombre, Edad, Nacionalidad, PHabil, Equipo);
    }
    
    
    
    
    @Override
    public void fisico() {
       Random rand= new Random();
       int limit= 6;
       int num_rand= rand.nextInt(limit); 
       int res= num_rand*13;
       this.Fisico=res;
    }

    @Override
    public void ritmo() {
       Random rand= new Random();
       int limit= 6;
       int num_rand= rand.nextInt(limit); 
       int res= num_rand*13;
       this.Fisico=res;
    }

    @Override
    public void entrada() {
       Random rand= new Random();
       int limit= 6;
       int num_rand= rand.nextInt(limit); 
       int res= num_rand*13;
       this.Entrada=res;
    }

    @Override
    public void vision() {
       Random rand= new Random();
       int limit= 6;
       int num_rand= rand.nextInt(limit); 
       int res= num_rand*13;
       this.Vision=res;
    }

    @Override
    public void passing() {
       Random rand= new Random();
       int limit= 13; 
       boolean bandi= true;
        while (bandi) {
            int num_rand= rand.nextInt(limit);
            int res= num_rand*12;
            if (res>=70 && res<100) {
                this.Passing=res;
                bandi=false;
            }else{
                bandi=true;
            }
        }
        
    }

    @Override
    public void regate() {
        Random rand= new Random();
       int limit= 6;
       int num_rand= rand.nextInt(limit); 
       int res= num_rand*13;
       this.Regate=res;
    }

    @Override
    public void disparo() {
       Random rand= new Random();
       int limit= 6;
       int num_rand= rand.nextInt(limit); 
       int res= num_rand*13;
       this.Disparo=res;
    }

    @Override
    public void agarre() {
         Random rand= new Random();
       int limit= 13; 
       boolean bandi= true;
        while (bandi) {
            int num_rand= rand.nextInt(limit);
            int res= num_rand*12;
            if (res>=70 && res<100) {
                this.Passing=res;
                bandi=false;
            }else{
                bandi=true;
            }
        }
    }

    @Override
    public void lanzamiento() {
         Random rand= new Random();
       int limit= 13; 
       boolean bandi= true;
        while (bandi) {
            int num_rand= rand.nextInt(limit);
            int res= num_rand*12;
            if (res>=70 && res<100) {
                this.Passing=res;
                bandi=false;
            }else{
                bandi=true;
            }
        }
    }

    @Override
    public void rating() {
        int res= (this.Fisico+this.Agarre+this.Disparo+this.Entrada+this.Lanzamiento+this.Passing+this.Ritmo+this.Regate+this.Vision)/9;
        this.Rating=res;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    
    
    
 

   
    
    
    
}
