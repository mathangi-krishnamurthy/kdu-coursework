package org.handson.question4;

import org.handson.question1and2.Constants;

public class GoldPlan extends HealthInsurancePlan {
    private static final double COVERAGE = Constants.GOLDPLAN;
    private static final double PREMIUM = Constants.GOLDPLAN_PREMIUM;
    public GoldPlan() {
        super(COVERAGE,PREMIUM);
    }

    /**
     * Computes the monthly PREMIUM for an insurance policy based on the salary, age, and smoking status of the policyholder.
     *
     * @param  salary   the salary of the policyholder
     * @param  age      the age of the policyholder
     * @param  smoking  true if the policyholder is a smoker, false otherwise
     * @return          the computed monthly PREMIUM for the insurance policy
     */
    @Override
    double computeMonthlyPREMIUM(double salary,int age, boolean smoking) {
        InsuranceBrand insuranceBrand = getOfferedBy();
        return salary*PREMIUM+insuranceBrand.computeMonthlyPREMIUM(this,age,smoking);
    }
}