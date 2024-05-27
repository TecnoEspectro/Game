
package com.mycompany.game;

public class MillenniumFalcon extends Nuclear {
    private boolean hyperSpeed;
    private int cannons;
    private boolean shields;

    public MillenniumFalcon(boolean hyperSpeed, int cannons, boolean shields, String name, boolean armed, int crew, int damage, int health, int speed) {
        super(name, armed, crew, damage, health, speed);
        this.hyperSpeed = hyperSpeed;
        this.cannons = cannons;
        this.shields = shields; //Si colocamos el constructor de la clase despues del padre el super sale automaticamente
    }


    @Override
    public void shoot(){
        System.out.println("Disparo a cañonasos!!!");
    }
    
    /*
    @Override
    public void fly(){}
    */

    
public void toggleShield() {
this.shields = !this.shields;
}



}
