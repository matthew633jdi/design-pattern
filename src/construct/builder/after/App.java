package construct.builder.after;

import construct.builder.before.TourPlan;

public class App {
    public static void main(String[] args) {
        TourDirector director = new TourDirector(new DefaultTourBuilder());
        TourPlan jejuTour = director.jejuTour();
        TourPlan bangkokTour = director.bangkokTour();

        System.out.println(jejuTour);
        System.out.println(bangkokTour);
    }
}
