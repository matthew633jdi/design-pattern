package construct.builder.before;

import java.util.StringJoiner;

public class DetailPlan {
    private int day;
    private String plan;

    public DetailPlan(int day, String plan) {
        this.day = day;
        this.plan = plan;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public String getPlan() {
        return plan;
    }

    public void setPlan(String plan) {
        this.plan = plan;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", DetailPlan.class.getSimpleName() + "[", "]")
                .add("day=" + day)
                .add("plan='" + plan + "'")
                .toString();
    }
}
