package projectW5.b2;

public class Employee {
    private int id;
    private String firstName;
    private String lastName;
    private float salary;
    private int yearExp;

    public Employee()
    {

    }

    public Employee(int id, String firstName, String lastName, float salary)
    {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
    }

    public int getID()
    {
        return id;
    }

    public String getFirstName()
    {
        return firstName;
    }

    public String getLastName()
    {
        return lastName;
    }

    public String getName()
    {
        return firstName + " " + lastName;
    }

    public void setSalary(float salary)
    {
        this.salary = salary;
    }

    public float getSalary()
    {
        return salary;
    }

    public void getSalary(float salary)
    {
        this.salary = salary;
    }

    public float getAnnualSalary()
    {
        return salary * 12;
    }

    public void setYearExp(int yearExp)
    {
        this.yearExp = yearExp;
    }

    public int getYearExp()
    {
        return yearExp;
    }

    public float raiseSalary(int percent)
    {    
        return getSalary() * percent / 100 + getSalary();
    }

    public float raiseSalary()
    {
        if (yearExp >= 2 && yearExp < 5)
        {
            return raiseSalary(5);
        }
        else if (yearExp >= 5 && yearExp < 7)
        {
            return raiseSalary(10);
  
        }
        else if (yearExp >= 7 && yearExp < 10)
        {
            return raiseSalary(15);

        }
        else
        {
            return raiseSalary(20);
        }
    }

    public String toString()
    {
        return "Employee[id= " + getID() + 
        ", name= " + getName() +
        ", salary= " + getSalary() + 
        ", annual salary= " + getAnnualSalary() + "]";
    }

    public void over30YearExp(Employee[] employees)
    {   
        for (Employee employee : employees)
        {
            if (employee.getYearExp() >= 30)
            {
                System.out.println(employee.toString());
                found = true;
            }
        }

        if (!found)
            System.out.println("None employee over 30 years of experience");
    }

    public boolean found = false;

    public void searchById(Employee[] employees, int id)
    {
        
        for (Employee employee : employees)
        {
            if (employee.getID() == id)
            {
                System.out.println(employee.toString());
                found = true;
            }
        }
        if (!found)
            System.out.println("Cannot find employee with Id: " + id);
    }

    public void searchByName(Employee[] employees, String name)
    {
        for (Employee employee : employees)
        {
            if (employee.getName().equals(name))
            {
                System.out.println(employee.toString());
                found = true;

            } 
        }
        if (!found)
            System.out.println("Cannot find employee with Name: " + name);
    }

    public void searchBySalary(Employee[] employees, double salary)
    {
        for (Employee employee : employees)
        {
            if (employee.getSalary() == salary)
            {
                System.out.println(employee.toString());
                found = true;
            }
        }
        if (!found)
            System.out.println("Cannot find employee with Salary: " + salary);
    }
}
