package construct.factory.after;

public interface ShipFactory {

    default Ship orderShip(String name, String email) {
        validate(name, email);
        prepareFor(name);
        Ship ship = createShip();
        sendEmailTo(email, ship);
        return ship;
    }

    Ship createShip();

    void sendEmailTo(String email, Ship ship);

    // jdk 9
    // 이전버전이면 추상 클래스 사용해야 함
    private void validate(String name, String email) {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("배 이름을 지어주세요.");
        }
        if (email == null || email.isBlank()) {
            throw new IllegalArgumentException("연락처를 남겨주세요.");
        }
    }

    private void prepareFor(String name) {
        System.out.println(name + " prepare!");
    }

//    private void sendEmailTo(String email, Ship ship) {
//        System.out.println(ship.getName() + " was done.");
//    }
}
