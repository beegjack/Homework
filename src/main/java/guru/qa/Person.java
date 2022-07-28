package guru.qa;

public class Person {
    int semester;
    double gpa;
    String name;

    public Person(int semester, double gpa, String name) {
        this.semester = semester;
        this.gpa = gpa;
        this.name = name;
    }

    void sayName() {
        System.out.print("Моё имя " + name +". ");
    }
    void giveScholarship() {
        if (semester < 2) {
            System.out.println("Я еще не сдавал сессию, поэтому получаю стипендию новичка.");
        } else if (gpa >= 4 && gpa < 5) {
            System.out.println("Я получаю обычную стипендию.");
        } else if (gpa == 5){
            System.out.println("Я получаю стипендию отличника)");
        } else {
            System.out.println("Я не получаю стипендию(");
        }
    }
}


