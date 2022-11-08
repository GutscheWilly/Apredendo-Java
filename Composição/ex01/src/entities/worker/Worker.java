package entities.worker;

import java.util.ArrayList;

import entities.worker.compositions.*;

public class Worker {

    private String name;
    private WorkerLevel level;
    private Double baseSalary;
    private Department department;
    private ArrayList<HourContract> contracts;

    public Worker(String name, String level, Double baseSalary, String departmentName) {
        this.name = name;
        this.level = WorkerLevel.valueOf(level);
        this.baseSalary = baseSalary;
        department = new Department(departmentName);
        contracts = new ArrayList<HourContract>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public WorkerLevel getLevel() {
        return level;
    }

    public void setLevel(WorkerLevel level) {
        this.level = level;
    }

    public Double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(Double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public String toString() {
        return String.format("Name: %s\nDepartment: %s\nLevel: %s\nBase salary: %.2f", name, department.getName(), level, baseSalary);
    }

    public void addContract(HourContract contract) {
        contracts.add(contract);
    }

    public void removeContract(HourContract contract) {
        contracts.remove(contract);
    }

    public Double income(Integer year, Integer month) {
        Double income = baseSalary;
        for (HourContract contract : contracts) {
            if (contract.getDate().getYear() == year && contract.getDate().getMonthValue() == month) {
                income += contract.totalValue();
            }
        }
        return income;
    }

    public void showAllContracts() {
        for (HourContract contract : contracts) {
            System.out.println(contract);
        }
    }
}
