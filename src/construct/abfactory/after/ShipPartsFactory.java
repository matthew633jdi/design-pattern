package construct.abfactory.after;

/**
 * Abstract Factory pattern
 */
public interface ShipPartsFactory {

    Anchor createAnchor();

    Wheel createWheel();
}
