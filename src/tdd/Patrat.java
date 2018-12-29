/*
 * Clasa Dreptunghi
 */
package tdd;

/**
 *
 * @author Spunnky
 */
public class Patrat extends PatrulaterDreptunghic {

    public static final String PATRAT = "equal ";
    public static final String DOT = ".";
    public static final String PATRAT_BEGIN = "SQUARE:";

    @Override
    public String getDefinition() {

        String definitie = PATRAT_BEGIN + super.getDefinition().substring(0, 26) + PATRAT + super.getDefinition().substring(26) + DOT;
        return definitie;
    }
}
