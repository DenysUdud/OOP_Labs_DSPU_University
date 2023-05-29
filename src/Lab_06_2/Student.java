package Lab_06_2;

public class Student {
    private Man person;
    private int yearOfStudy;

    public Student(String name, int age, String gender, double weight, int yearOfStudy) {
        this.person = new Man(name, age, gender, weight);
        this.yearOfStudy = yearOfStudy;
    }

    public void setName(String name) {
        person.setName(name);
    }

    public void setAge(int age) {
        person.setAge(age);
    }

    public void setWeight(double weight) {
        person.setWeight(weight);
    }

    public void setYearOfStudy(int yearOfStudy) {
        this.yearOfStudy = yearOfStudy;
    }

    public void increaseYearOfStudy() {
        yearOfStudy++;
    }

    @Override
    public String toString() {
        return "Student{" +
                "person=" + person +
                ", yearOfStudy=" + yearOfStudy +
                '}';
    }

    private class Man {
        private String name;
        private int age;
        private String gender;
        private double weight;

        public Man(String name, int age, String gender, double weight) {
            this.name = name;
            this.age = age;
            this.gender = gender;
            this.weight = weight;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public void setWeight(double weight) {
            this.weight = weight;
        }

        @Override
        public String toString() {
            return "Man{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    ", gender='" + gender + '\'' +
                    ", weight=" + weight +
                    '}';
        }
    }

    public static void main(String[] args) {
        Student student = new Student("John", 20, "Male", 70.5, 2023);

        // Зміна імені
        student.setName("David");

        // Зміна віку
        student.setAge(21);

        // Зміна ваги
        student.setWeight(75.2);

        // Збільшення року навчання
        student.increaseYearOfStudy();

        System.out.println(student);
    }
}

//    У цьому прикладі клас Man є вкладеним класом в класі Student.
//        Вкладений клас Man представляє поле "людина" в класі Student
//        і має методи доступу до полів name, age, gender та weight.
//        Клас Student використовує цей вкладений клас для збереження інформації
//        про людину і також має власні поля та методи, такі як yearOfStudy,
//        методи зміни значень та методи збільшення року навчання.
//
//        У головній функції main створюється об'єкт Student, а потім демонструється