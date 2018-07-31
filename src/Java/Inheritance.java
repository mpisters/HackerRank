import java.util.Scanner;

class Person2 {
    protected String firstName;
    protected String lastName;
    protected int idNumber;

    // Constructor
    Person2(String firstName, String lastName, int identification) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.idNumber = identification;
    }

    // Print person data
    public void printPerson() {
        System.out.println(
                "Name: " + lastName + ", " + firstName
                        + "\nID: " + idNumber);
    }

}

class Student extends Person2 {
    private int[] testScores;

    Student(String firstName, String lastName, int identification, int[] testScores) {
        super(firstName, lastName, identification);
        this.testScores = testScores;
    }

    public char calculate() {
        int sum = 0;
        float result = 0;
        for (int i = 0; i < this.testScores.length; i++) {
            sum += this.testScores[i];
        }
        result = (float) sum / this.testScores.length;
        if (result >= 90 && result <= 100) {
            return 'O';
        }
        if (result >= 80 && result < 90) {
            return 'E';
        }
        if (result >= 70 && result < 80) {
            return 'A';
        }
        if (result >= 55 && result < 70) {
            return 'P';
        }
        if (result >= 40 && result < 55) {
            return 'D';
        } else {
            return 'T';
        }
    }
}

public class Inheritance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String firstName = sc.next();
        String lastName = sc.next();
        int id = sc.nextInt();
        int numScores = sc.nextInt();
        int[] testScores = new int[numScores];
        for (int i = 0; i < numScores; i++) {
            testScores[i] = sc.nextInt();
        }
        sc.close();
        Student s = new Student(firstName, lastName, id, testScores);
        s.printPerson();
        System.out.println("Grade: " + s.calculate());
    }
}
