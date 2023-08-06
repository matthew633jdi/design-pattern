package construct.factory.after;

public abstract class DefaultShipFactory implements ShipFactory {
    @Override
    public void sendEmailTo(String email, Ship ship) {
        System.out.println(ship.getName() + " was done.");
    }
}
