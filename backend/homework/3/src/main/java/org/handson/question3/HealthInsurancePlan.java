package org.handson.question3;

abstract class HealthInsurancePlan {
    private double coverage;
    private InsuranceBrand offeredBy;


    /**
     * Retrieves the insurance brand that offers this particular insurance.
     *
     * @return  the insurance brand that offers this particular insurance
     */
    public InsuranceBrand getOfferedBy() {
        return offeredBy;
    }
    abstract double computeMonthlyPremium(double salary);
        /**
     * Sets the insurance brand that offers this product.
     *
     * @param  offeredBy  the insurance brand to set
     */
    public void setOfferedBy(InsuranceBrand offeredBy) {
        this.offeredBy = offeredBy;
    }
    /**
     * Retrieves the coverage value.
     *
     * @return the coverage value
     */
    public double getCoverage() {
        return coverage;
    }
    /**
     * Sets the coverage value for the object.
     *
     * @param  coverage  the coverage value to set
     */
    public void setCoverage(double coverage) {
        this.coverage = coverage;
    }
}
