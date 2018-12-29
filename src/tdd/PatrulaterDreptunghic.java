/*
 * Clasa Patrulater Dreptunghic
 */
package tdd;

/**
 *
 * @author Spunnky
 */
public class PatrulaterDreptunghic extends Patrulater {

    public static final String DREPTUNGHIC = " and four right angles";

    @Override
    public String getDefinition() {

        String definitie = super.getDefinition() + DREPTUNGHIC;
        return definitie;
    }
}
