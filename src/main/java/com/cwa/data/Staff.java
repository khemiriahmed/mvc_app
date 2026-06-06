package com.cwa.data;

import java.util.UUID;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;

public class Staff {

    private String id;

    @NotBlank(message = "Staff name can not be blank")
    private String staffName;

    @NotBlank(message = "Staff title can not be blank")
    private String staffTitle;

    @Positive(message = "Staff salary must be greater than 0")
    private double staffSalary;

    public Staff(String staffName, String staffTitle, double staffSalary) {
        this.id = UUID.randomUUID().toString();
        this.staffName = staffName;
        this.staffTitle = staffTitle;
        this.staffSalary = staffSalary;
    }

    public Staff() {
        this.id = UUID.randomUUID().toString();
    }

    public String getId() { return this.id; }
    public void setId(String id) { this.id = id; }

    public String getStaffName() { return this.staffName; }
    public void setStaffName(String staffName) { this.staffName = staffName; }

    public String getStaffTitle() { return this.staffTitle; }
    public void setStaffTitle(String staffTitle) { this.staffTitle = staffTitle; }

    public double getStaffSalary() { return this.staffSalary; }
    public void setStaffSalary(double staffSalary) { this.staffSalary = staffSalary; }
}