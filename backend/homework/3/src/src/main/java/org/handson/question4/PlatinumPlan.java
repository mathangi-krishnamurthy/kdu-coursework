package org.handson.question4;

import org.handson.question1and2.Constants;

public class PlatinumPlan extends HealthInsurancePlan {
private static final double COVERAGE = Constants.PLATINUMPLAN;
    private static final double PREMIUM = Constants.PLATINUMPLAN_PREMIUM;
    public PlatinumPlan() {
        super(COVERAGE,PREMIUM);
    }

    /**
     * Computes the monthly PREMIUM for the insurance based on the salary, age, and smoking status.
     *
     * @param  salary   the salary of the policyholder
     * @param  age      the age of the policyholder
     * @param  smoking  true if the policyholder is a smoker, false otherwise
     * @return          the computed monthly PREMIUM
     */
    @Override
    double computeMonthlyPREMIUM(double salary,int age, boolean smoking) {
        InsuranceBrand insuranceBrand = getOfferedBy();
        return salary*PREMIUM+insuranceBrand.computeMonthlyPREMIUM(this,age,smoking);
    }
    }
