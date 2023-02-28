package projectW5.b2;
import java.util.ArrayList;

public class Manager extends Employee
{
    private ArrayList<Employee> team;   
    
    public Manager(int id, String firstName, String lastName, float salary)
    {
        super(id, firstName, lastName, salary);
        this.team = new ArrayList<Employee>();
    }

    public void setTeam(Employee employee)
    {
        if (team.size() < 10)
        {
            team.add(employee);
        }
        else 
        {
            System.out.println("1 Manager can only manage up to 10 employees");
        }
    }

    public void getTeam()
    {
        System.out.println("This team managed by " + getName() + ". Employees in team: ");
        for (Employee employee : team)
        {
            System.out.println("ID: " + employee.getID() + " - " + employee.getName());
        }
    }
}
