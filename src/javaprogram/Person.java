package javaprogram;

/*Write a class with the name Person. The class needs three fields (instance variables) with the names
firstName, lastName of type String and age of type int.*/
public class Person {
    String firstname;
    String lastname;
    int age;

    public static void main(String[] args) {
        Person person = new Person();
        person.setFirstName(""); // firstName is set to empty string
        person.setLarstName(""); // lastName is set to empty string
        person.setAge(10);
        System.out.println("fullName= " + person.getFullName());
        System.out.println("teen= " + person.isTeen());
        person.setFirstName("John"); // firstName is set to John
        person.setAge(18);
        System.out.println("fullName= " + person.getFullName());
        System.out.println("teen= " + person.isTeen());
        person.setLarstName("Smith"); // lastName is set to Smith
        System.out.println("fullName= " + person.getFullName());
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public int getAge() {
        return age;
    }

    public void setFirstName(String firstName) {
        this.firstname = firstName.isEmpty() ? "" : firstName;

    }

    public void setLarstName(String lastName) {
        this.lastname = lastName.isEmpty() ? "" : lastName;
    }

    public void setAge(int age) {
        this.age = (age >= 0 && age <= 100) ? age : 0;
    }

    public boolean isTeen() {
        return (age > 12 && age < 20);
    }

    public String getFullName() {
        if (firstname.isEmpty() && lastname.isEmpty()) {
            return "";
        } else if (firstname.isEmpty()) {
            return lastname;
        } else if (lastname.isEmpty()) {
            return firstname;
        } else {
            return firstname + " " + lastname;
        }
    }
}

