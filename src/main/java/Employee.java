public class Employee{
  private String lastName;
  private String firstName;
  private String position;
  private int age;
  private int levelOfMotivation;

  String getLastName(){
    return  lastName;
  }

  String getFirstName(){
    return  firstName;
  }

  String getPosition(){
    return  position;
  }


  public void setLastname(String lastName) {
    this.lastName = lastName;
  }

  public void setFirstname(String firstName) {
    this.firstName = firstName;
  }

  public void setPosition(String position) {
    this.position = position;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public int getLevelOfMotivation() {
    return levelOfMotivation;
  }

  public void setLevelOfMotivation(int levelOfMotivation) {
    this.levelOfMotivation = levelOfMotivation;
  }

  public Employee(String lastName, String firstName, String position, int age, int levelOfMotivation){
    this.lastName = lastName;
    this.firstName = firstName;
    this.position = position;
    this.age = age;
    this.levelOfMotivation = levelOfMotivation;
  }

  public void upLevelOfMotivation(int numberOfUnits){
    this.levelOfMotivation = this.getLevelOfMotivation() + numberOfUnits;
  }

  public void showEmployeeInfo(){
    System.out.println("Фамилия: " + this.getFirstName() + ", Имя: " + this.getLastName() +
            ", Должность: " + this.getPosition() + ", Возраст: " + this.getAge() +
            ", Уровень мотивации: " + this.getLevelOfMotivation());

  }
}
