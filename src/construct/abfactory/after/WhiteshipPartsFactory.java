package construct.abfactory.after;

import construct.abfactory.before.WhiteAnchor;
import construct.abfactory.before.WhiteWheel;

public class WhiteshipPartsFactory implements ShipPartsFactory{
    @Override
    public Anchor createAnchor() {
        return new WhiteAnchor();
    }

    @Override
    public Wheel createWheel() {
        return new WhiteWheel();
    }
}
