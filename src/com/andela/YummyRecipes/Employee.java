package com.andela.YummyRecipes;

import java.math.BigDecimal;

public class Employee extends  JavaCollections{

//    public Employee() {
//        super();
//
//    }

    public Employee(String firstName, String secondName, int age, int height, int weight) {
        super(firstName, secondName, age, height, weight);
    }


    private String taxPayerIdentificationNumber;
    private String employeeNumber;
    private BigDecimal salary;


    @Override
    public void printAudit(StringBuilder buffer) {
        super.printAudit(buffer);
        // Now format this instance's values
        buffer.append("TaxpayerIdentificationNumber=");
        buffer.append(getTaxPayerIdentificationNumber());
        buffer.append(","); buffer.append("EmployeeNumber=");
        buffer.append(getEmployeeNumber());
        buffer.append(","); buffer.append("Salary=");
        buffer.append(getSalary().setScale(2).toPlainString());

    }

    public String getTaxPayerIdentificationNumber() {
        return taxPayerIdentificationNumber;
    }

    public void setTaxPayerIdentificationNumber(String taxPayerIdentificationNumber) {
        this.taxPayerIdentificationNumber = taxPayerIdentificationNumber;
    }

    public String getEmployeeNumber() {
        return employeeNumber;
    }

    public void setEmployeeNumber(String employeeNumber) {
        this.employeeNumber = employeeNumber;
    }

    public BigDecimal getSalary() {
        return salary;
    }

    public void setSalary(BigDecimal salary) {
        this.salary = salary;
    }

//    public  static  void  main () {
//        Employee e = new Employee("");
//
//    }

}


