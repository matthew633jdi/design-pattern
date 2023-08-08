package construct.builder.before;

import java.time.LocalDate;

public class App {
    public static void main(String[] args) {
        TourPlan shortTrip = new TourPlan();
        shortTrip.setTitle("Jeju");
        shortTrip.setStartDate(LocalDate.of(2023, 8, 2));

        TourPlan tourPlan = new TourPlan();
        tourPlan.setTitle("Bangkok");
        tourPlan.setNights(2);
        tourPlan.setDays(3);
        tourPlan.setStartDate(LocalDate.of(2023, 10, 10));
        tourPlan.setWhereToStay("Hotel");
        tourPlan.addPlan(0, "check-in");
        tourPlan.addPlan(0, "dinner");
        tourPlan.addPlan(1, "breakfast");
        tourPlan.addPlan(1, "lunch");
        tourPlan.addPlan(1, "sleep");
        tourPlan.addPlan(2, "brunch");
        tourPlan.addPlan(2, "check-out");

        System.out.println(shortTrip);
        System.out.println(tourPlan);
    }
}
