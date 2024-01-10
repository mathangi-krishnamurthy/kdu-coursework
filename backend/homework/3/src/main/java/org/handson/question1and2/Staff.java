package org.handson.question1and2;

public class Staff extends User {
    private long staffId;
    private int yearsOfExperience;
    private String description;
    private double salary;
    /**
     * Retrieves the staff ID.
     *
     * @return the staff ID.
     */
    public long getStaffId() {
        return staffId;
    }
    /**
     * Sets the staff ID for the object.
     *
     * @param  staffId  the new staff ID to set
     */
    public void setStaffId(long staffId) {
        this.staffId = staffId;
    }
    /**
     * Retrieves the number of years of experience.
     *
     * @return the number of years of experience
     */
    public int getYearsOfExperience() {
        return yearsOfExperience;
    }
    /**
     * Sets the number of years of experience.
     *
     * @param  yearsOfExperience  the number of years of experience to set
     */
    public void setYearsOfExperience(int yearsOfExperience) {
        this.yearsOfExperience = yearsOfExperience;
    }
    /**
     * Sets the description of the object
     *
     * @return    description
     */
    public String getDescription() {
        return description;
    }
    /**
     * Sets the description of the object.
     *
     * @param  description  the new description for the object
     */
    public void setDescription(String description) {
        this.description = description;
    }
    /**
     * Retrieves the salary of the employee.
     *
     * @return the salary of the employee
     */
    public double getSalary() {
        return salary;
    }
    /**
     * Sets the salary of the object.
     *
     * @param  salary  the new salary to be set
     */
    public void setSalary(double salary) {
        this.salary = salary;
    }
}
