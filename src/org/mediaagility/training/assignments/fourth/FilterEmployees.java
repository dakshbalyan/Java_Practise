package org.mediaagility.training.assignments.fourth;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FilterEmployees {
    private static final String filePath = "src/org/mediaagility/training/assignments/fourth/employeeDataset/employees.csv";

    public static void main(String[] args) throws Exception{
        FilterEmployees filterEmployees = new FilterEmployees();
        List<EmployeeModel> resList = filterEmployees.populateEmployee();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Choose department by entering the number\n"+"========================================\n"
        +"1. Admin Offices\n2. Executive Office\n3. IT/IS\n4. Production\n5. Sales"+
                "\n6. Software Engineering\n"+"\n========================================\n");

        int deptChoice = Integer.parseInt(br.readLine());

        switch(deptChoice){
            case 1:
                filterEmployees.display("Admin Offices",resList); break;
            case 2:
                filterEmployees.display("Executive Office",resList); break;
            case 3:
                filterEmployees.display("IT/IS",resList); break;
            case 4:
                filterEmployees.display("Production",resList); break;
            case 5:
                filterEmployees.display("Sales",resList); break;
            case 6:
                filterEmployees.display("Software Engineering",resList); break;
            default:
                System.out.println("Invalid input !!");
        }
    }

    private Function<String, EmployeeModel> mapToItem = (line) -> {

        String[] p = line.split(",");// a CSV has comma separated lines

        EmployeeModel employee = new EmployeeModel();
//        System.out.println(p.length);

        employee.setLname(p[0]);//<-- this is the first column in the csv file
        employee.setFname(p[1]);
        employee.setEmpID(Long.parseLong(p[2]));
        employee.setPosition(p[13]);
        employee.setDepartment(p[26]);

        return employee;
    };

    private List<EmployeeModel> populateEmployee(){
        List<EmployeeModel> res = new ArrayList<>();
        try{
            FileReader fileReader = new FileReader(filePath);
            BufferedReader br = new BufferedReader(fileReader);

            res = br.lines()
                    .skip(1)
                    .map(mapToItem)
                    .collect(Collectors.toList());

        }catch(Exception e){
            e.printStackTrace();
        }
        return res;
    }

    private void display(String dept, List<EmployeeModel> empList){

        empList.stream()
               .filter(emp -> emp.getDepartment().equals(dept))
               .forEach(emp ->
                       System.out.println(emp.getFname()+" "+emp.getLname()+
                               " "+emp.getEmpID()+" "+emp.getPosition()+" "+
                               emp.getDepartment()));
    }

}

class EmployeeModel{
    private String fname;
    private String lname;
    private long empID;
    private String position;
    private String department;

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public long getEmpID() {
        return empID;
    }

    public void setEmpID(long empID) {
        this.empID = empID;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}