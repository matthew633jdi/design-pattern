package construct.abfactory.after;

import construct.factory.after.Ship;
import construct.factory.after.ShipFactory;

public class ShipInventory {
    public static void main(String[] args) {
        ShipFactory shipFactory = new WhiteshipFactory(new WhiteshipPartsFactory());
        Ship ship = shipFactory.createShip();
        System.out.println(ship.getAnchor().getClass());
        System.out.println(ship.getWheel().getClass());
    }
}
