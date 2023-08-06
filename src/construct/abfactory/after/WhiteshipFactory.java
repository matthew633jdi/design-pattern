package construct.abfactory.after;

import construct.factory.after.DefaultShipFactory;
import construct.factory.after.Ship;
import construct.factory.after.Whiteship;

/**
 * 팩토리에서 인스턴스를 만들어서 쓰는 Client code에 해당
 * Client에서 추상 팩토리를 사용
 */
public class WhiteshipFactory extends DefaultShipFactory {

    // Abstract Factory class(interface)
    private final ShipPartsFactory shipPartsFactory;

    public WhiteshipFactory(ShipPartsFactory shipPartsFactory) {
        this.shipPartsFactory = shipPartsFactory;
    }

    @Override
    public Ship createShip() {
        Ship ship = new Whiteship();
        ship.setAnchor(shipPartsFactory.createAnchor());
        ship.setWheel(shipPartsFactory.createWheel());
        return ship;
    }
}
