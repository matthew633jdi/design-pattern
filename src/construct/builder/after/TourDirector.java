package construct.builder.after;

import construct.builder.before.TourPlan;

import java.time.LocalDate;

public class TourDirector {
    private final TourPlanBuilder builder;

    public TourDirector(TourPlanBuilder builder) {
        this.builder = builder;
    }

    public TourPlan jejuTour() {
        return builder
                .title("jeju")
                .startDate(LocalDate.of(2023, 8, 2))
                .whereToStay("동춘")
                .getPlan();
    }

    public TourPlan bangkokTour() {
        return builder
                .title("bangkok")
                .nightsAndDays(2,3)
                .startDate(LocalDate.of(2023, 10,1))
                .whereToStay("Hotel")
                .addPlan(0 , "Immigration")
                .addPlan(0, "check-in")
                .addPlan(0, "dinner")
                .addPlan(1, "breakfast")
                .addPlan(1, "play")
                .getPlan();
    }
}
