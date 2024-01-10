package org.handson.question3;

import org.handson.question1and2.Constants;

public class GoldPlan extends HealthInsurancePlan {
    private static final double COVERAGE_GOLD_PLAN = 0.9; // Replace with the actual value
    private static final double PREMIUM_GOLD_PLAN = 100.0; // Replace with the actual value

    @Override
    public double getCoverage() {
        return COVERAGE_GOLD_PLAN;
    }
    /**
     * Computes the monthly PREMIUM_GOLD_PLAN based on the given salary.
     *
     * @param  salary  the salary used to calculate the monthly PREMIUM_GOLD_PLAN
     * @return         the computed monthly PREMIUM_GOLD_PLAN
     */
    @Override
    double computeMonthlyPremium(double salary) {
        return salary*PREMIUM_GOLD_PLAN;
    }
}
