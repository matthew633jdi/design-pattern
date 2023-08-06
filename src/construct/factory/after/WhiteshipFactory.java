package construct.factory.after;

public class WhiteshipFactory extends DefaultShipFactory {
    @Override
    public Ship createShip() {
        return new Whiteship();
    }
}
