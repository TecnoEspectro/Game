
package com.mycompany.game;


public class StelarDestroyer extends Nuclear {
    private boolean hyperSpeed;
    private boolean shield;

    public StelarDestroyer(boolean hyperSpeed, boolean shield, String name, boolean armed, int crew, int damage, int health, int speed) {
        super(name, armed, crew, damage, health, speed);
        this.hyperSpeed = hyperSpeed;
        this.shield = shield;
    }
    
    
    
    
    
    @Override
    public void shoot(){
    super.shoot(); //Ejecuta las dos acciones, es decir, los dos disparos
        System.out.println("Disparo con rayo laser!!!");
    }
    
    
    
}
