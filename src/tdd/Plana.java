/*
 * Clasa Plana
 */
package tdd;

/**
 *
 * @author Spunnky
 */
public class Plana extends FiguraGeometrica {

    public static final String PLANA = " plane";

    
    
    @Override
    public String getDefinition() {

        String definitie = super.O + PLANA + super.FIGURA;
        return definitie;
    }

}
