package construct.builder.after;

import construct.builder.before.TourPlan;

import java.time.LocalDate;

public interface TourPlanBuilder {
    TourPlanBuilder nightsAndDays(int nights, int days);

    TourPlanBuilder title(String title);

    TourPlanBuilder startDate(LocalDate localDate);

    TourPlanBuilder whereToStay(String location);

    TourPlanBuilder addPlan(int day, String plan);

    TourPlan getPlan();
}
