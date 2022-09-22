package inheritancetest;

class Employee {
    private String name; 
    private double salary;
    private double bonus;
    
    public String getName() {
        return this.name;
    }
    
    public Double getSalary (){
        return this.salary;
    }
    
    public Employee(String name, double salary) {
        if(name == null || name.isBlank()) {
            System.out.println("Name or salary should not be empty");
        }
        
        if(salary <= 0) {
            System.out.println("Salary must be greater than zero");
        }
        
        this.name = name;
        this.salary = salary;
    }
    
    public void setBonus(double bonus) {
        if (bonus < 0) {
            throw new IllegalArgumentException(); 
//            System.out.println("bonus must be greater than or equal to zero.");
        }
        this.bonus = bonus;
    }
    
    public double toPay() {
        return this.getSalary() + this.bonus;
    }
}

class SalesPerson extends Employee {
    
    private int percent;
    
    public SalesPerson(String name, double salary, int percent) {
        super(name, salary);
        
        if(percent >= 0) {
          this.percent = percent;  
        } else {
            throw new IllegalArgumentException(); 
//            System.out.println("Percent must be greater than or equal to zero.");
        }
    }
    
    public void setBonus(double bonus) {
        if(this.percent > 200) {
            bonus = bonus*3;
        }

        if(this.percent >= 100) {
            bonus = bonus*2; //200
        }

        super.setBonus(bonus);
    }
}

class Manager extends Employee {
    private int clientAmount;
    
    public Manager(String name, double salary, int clientAmount) {
        super(name, salary);
        
        if (this.clientAmount < 0) {
            throw new IllegalArgumentException(); 
//            System.out.println("ClientAmount must be greater than or equal to zero.");
        }
        
        this.clientAmount = clientAmount;
    }
    
    public void setBonus(double bonus) {
        if(clientAmount >= 150) {
            super.setBonus(bonus+1000);
        } else if (clientAmount >= 100) {
            super.setBonus(bonus+500);
        } else {
            super.setBonus(bonus);
        }
    }
}

class Company {
    private Employee[] employees;

    public Employee[] getEmployees() {
        return employees;
    }

    public void setEmployees(Employee[] employees) {
        if (employees == null) {
            throw new IllegalArgumentException();
        }
        for (Employee i :
                employees) {
            if (i == null) {
                throw new IllegalArgumentException();
            }
        }
        this.employees = employees;
    }

    public Company(Employee[] employees) {
       if (employees == null) {throw new IllegalArgumentException();}
       this.employees = employees;
    }
    public void giveEverybodyBonus(double companyBonus) {
        if (companyBonus <= 0) {throw new IllegalArgumentException();}
        for (Employee i :
                employees) {
            i.setBonus(companyBonus);
        }
    }

    public double totalToPay() {
        double totalPay = 0;
        for (Employee i: employees) {
            totalPay = totalPay + i.toPay();
        }
        return totalPay;
    }

    public String nameMaxSalary() {
        double maxSalary = 0;
        String maxEmp = "Nobody";
        for (Employee i :
                employees) {
            if (maxSalary == -1) {
                maxSalary = i.toPay();
                maxEmp = i.getName();
            }
        }
        return maxEmp;
    }
}

public class InheritanceTest2 {

    public static void main(String[] args) {
        SalesPerson salePerson = new SalesPerson("Chayan", 20500, 110);
        salePerson.setBonus(100);
        System.out.println("Employee salary with bonus: "+salePerson.toPay());
        
        Manager manager = new Manager("Manager kopil", 40000, 200);
        manager.setBonus(0);
        System.out.println("Manager salary with bonus: "+manager.toPay());
    }
    
}
