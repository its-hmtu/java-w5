package projectW5.b2;
import java.util.Scanner;

public class testEmployee 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of employees: ");
        int n = sc.nextInt();
        Employee[] person = new Employee[n];
        Employee search = new Employee();

        for (int i = 0; i < n; i++)
        {
            System.out.println("Enter employee #" + (i+1) + " id, first name, last name, salary: (eg. 1 Tu Hoang 3)");
            person[i] = new Employee(sc.nextInt(), sc.next(), sc.next(), sc.nextFloat());
            System.out.print(person[i].getName() + "'s year experience: ");
            person[i].setYearExp(sc.nextInt());
            float newSalary = person[i].raiseSalary();
            person[i].setSalary(newSalary);
            System.out.println(person[i].toString() + "\n");
        }

        System.out.println("Enter manager id, first name, last name, salary: (eg. 1 Tu Hoang 3)");
        Manager manager = new Manager(sc.nextInt(), sc.next(), sc.next(), sc.nextInt());
        for (int i = 0; i < n; i++)
        {
            manager.setTeam(person[i]);
        }
        manager.getTeam();
        

        System.out.println("\nPress 1 to search by ID\nPress 2 to search by name\nPress 3 to search by salary");
        System.out.print("You choose: ");
        int c = sc.nextInt();
        switch(c)
        {
            case 1:
                System.out.print("Search by ID - Enter ID: ");
                int id = sc.nextInt();
                search.searchById(person, id);
                break;

            case 2:
                System.out.print("Search by name - Enter name: ");
                String name = sc.nextLine();
                search.searchByName(person, name);
                break;

            case 3:
                System.out.print("Search by salary - Enter salary: ");
                double salary = sc.nextDouble();
                search.searchBySalary(person, salary);
                break;
        }

        System.out.println("\nEmployees over 30: ");
        search.over30YearExp(person);

        sc.close();
    }   
}
