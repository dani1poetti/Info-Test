/*
 * Project: Aufgabenstellung1_Vererbung_in_Java
 * Klasse: 2bAPC / 2025
 * Author:  Daniel Poettler
 * Last Change: 03.02.2025
 *    by:   ptr
 *    date: 03.02.2025
 * Copyright (c): LBS Eibiswald, 2025
 */
public class Main {
    public static void main (String[] arg) {
        Employee employee = new Employee("Pöttler", "Daniel","1234", 200,"5678") ; //Konstruktor
        System.out.println("Name: "+employee.fullname()); // Vollen-Namen ausgeben
        System.out.println("EmployeeId: "+employee.getEmployeeId()); // Employee-ID ausgeben
        System.out.println(employee.printAll()); // Alles ausgeben

        // Gehaltserhöhung um 100
        System.out.print("Vor Gehaltserhöhung: ");
        System.out.println(employee.getSalary()); // Gehalt ausgeben
        employee.salaryIncrease(100); // Gehalt um 100 erhöhen
        System.out.print("Nach Gehaltserhöhung: ");
        System.out.println(employee.getSalary()); // Gehalt erneut ausgeben
    }
}
class Person {
    private String name, firstname;
    public Integer age;
    // Konstruktor
    public Person (String ln, String fn) {
        this.name = ln;
        this.firstname = fn;
    }
    // Konstruktor
    public Person () {
        this.name = "Welt";
        this.firstname = "Hallo";
    }
    //Setter
    public void setName (String ln,String fn) {
        this.name = ln;
        this.firstname = fn;
    }
    // Name ausgeben
    public String fullname () {
        return this.firstname+" "+this.name;
    }
}
// Vererbung der Klasse "Person"
class Employee extends Person {
    private String employeeId;
    private Integer salary;
    private String supervisorId;
    // Konstruktor
    public Employee (String ln, String fn, String empId, Integer a, String supervisorId) {
        super(ln, fn);
        this.employeeId = empId;
        this.salary = a;
        this.supervisorId = supervisorId;
    }
    // getter
    public String getEmployeeId () {
        return employeeId;
    }
    // getter
    public String getSupervisorID() {
        return supervisorId;
    }
    // setter
    public void setSupervisorID(String supervisorID) {
        this.supervisorId = supervisorID;
    }
    // getter
    public Integer getSalary() {
        return salary;
    }
    // setter
    public void setSalary(Integer salary) {
        this.salary = salary;
    }
    // alles ausgeben
    public String printAll () {
        return fullname()+" | Mitarbeiter-ID: " + employeeId + " | Gehalt: " + salary + " | Supervisor-ID: " + supervisorId;
    }
    // Gehalt erhöhen
    public void salaryIncrease (Integer a) {
        salary += a;
    }
}