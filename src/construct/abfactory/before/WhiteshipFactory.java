package construct.abfactory.before;

import construct.factory.after.DefaultShipFactory;
import construct.factory.after.Ship;
import construct.factory.after.Whiteship;

/**
 * Client code에 해당
 */
public class WhiteshipFactory extends DefaultShipFactory {

    @Override
    public Ship createShip() {
        Ship ship = new Whiteship();
        ship.setAnchor(new WhiteAnchor());
        ship.setWheel(new WhiteWheel());
        return ship;
    }
}
