package belajar.oop.application;

import belajar.oop.data.Company;

public class CompanyApp {
    public static void main(String[] args) {

        Company company = new Company();
        company.setName("Komanggg");

        Company.Employee employee = company.new Employee();
        employee.setName("Catur");

        System.out.println(employee.getName());
        System.out.println(employee.getCompany());

        Company company2 = new Company();
        company2.setName("Belum ada");

        Company.Employee employee2 = company2.new Employee();
        employee2.setName("Ada Wong");

        System.out.println(employee2.getName());
        System.out.println(employee2.getCompany());

    }
}
