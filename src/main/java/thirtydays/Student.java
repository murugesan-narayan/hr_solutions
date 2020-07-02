package thirtydays;

public class Student  extends Person {
    private final int[] testScores;

    Student(int id, int[] testScores) {
        super(id);

        this.testScores = testScores;
    }

    public char calculate() {
        int sum = 0;
        for (int testScore : testScores) {
            sum += testScore;
        }
        int avg = (sum) / testScores.length;

        if (90 <= avg && avg <= 100) {
            return 'O';
        } else if (80 <= avg && avg < 90) {
            return 'E';
        } else if (70 <= avg && avg < 80) {
            return 'A';
        } else if (55 <= avg && avg < 70) {
            return 'P';
        } else if (40 <= avg && avg < 55) {
            return 'D';
        } else {
            return 'T';
        }

    }

    public static void main(String[] args) {
        Student student = new Student(1, new int[]{1,2});
        char c = student.calculate();
        System.out.println("c = " + c);
    }
}
