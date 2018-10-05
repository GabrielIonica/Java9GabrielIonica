/*
 * Buton din care vom crea butoanele
 */
package oopcomputer;

/**
 *
 * @author Spunnky
 */
public class Buton {
    private Character simbol;
    
    public Buton(Character noulSimbol){
        simbol = noulSimbol;
    }
    public Character apasa (){
        return simbol;
        
    }
}
