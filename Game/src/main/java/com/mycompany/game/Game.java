

package com.mycompany.game;


public class Game {

    public static void main(String[] args) {
        
        StelarDestroyer nave = new StelarDestroyer(true,true, "Destructor Estelar" ,true,100,2000,1340,200);
        
        nave.shoot();
        
        
        MillenniumFalcon nave2 = new MillenniumFalcon (true, 3, true, "Halcon Milenario", true, 6, 1000, 1000, 500);
        nave2.shoot();
    }
}
