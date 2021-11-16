public class Main {
  public static void main(String[] args) {
    Employee Ivanov = new Employee("Иванов", "Сергей", "Senior Manager", 39,
            30);
    Employee Molchanova = new Employee("Молчанова", "Светлана", "Junior Manager",
            22, 90);

    Ivanov.showEmployeeInfo();
    Ivanov.setPosition("Director");
    Ivanov.upLevelOfMotivation(50);
    Ivanov.showEmployeeInfo();
    Molchanova.showEmployeeInfo();

  }
}
