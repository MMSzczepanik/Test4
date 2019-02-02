package SDA;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        FIrm firm = new FIrm();
        firm.addEmploye(new Employe("Michał", "Szczepanik"));
        firm.addEmploye(new Employe("Maciek", "Szczepanik"));
        firm.addEmploye(new Employe("Mariusz", "Szczepanik"));
        firm.addEmploye(new Employe("Mike", "Szczepanik"));
        firm.addEmploye(new Employe("Muuuu", "Szczepanik"));

        System.out.println(firm.getEmployeById(464));

    }
}
