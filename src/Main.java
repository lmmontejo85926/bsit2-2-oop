public class Main {
    public static void main(String[] args) {
        Student s1 = new Student("Diana Ann Caseres", 20, "BSTM", 92.0, 85.0, 88.0);
        Student s2 = new Student("Trisha Ann Caseres", 22, "BSHM", 91.0, 93.0, 89.0);
        Student s3 = new Student("Jancare Omelda", 21, "BSIT", 65.0, 70.0, 75.0);

        Student[] students = {s1, s2, s3};
        int passingCount = 0;

        for (Student s : students) {
            System.out.println("\nStudent Information:");
            s.displayInfo();
            double average = s.calculateAverage();
            System.out.printf("Average: %.2f\n", average);
            String letterGrade = s.getLetterGrade();
            System.out.println("Letter Grade: " + letterGrade);

            if (s.isPassing()) {
                System.out.println("Status: PASSING");
                passingCount++;
            } else {
                System.out.println("Status: FAILING");
            }
        }

        System.out.println("\nSummary: " + passingCount + " out of " + students.length + " students are passing.");
    }
}
