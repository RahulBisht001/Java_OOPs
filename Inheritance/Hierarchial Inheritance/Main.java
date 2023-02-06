public class Main {
    public static void main(String[] args) {

        // Result R = new Result(100);
        // System.out.println(R.marks);
        Sport S = new Sport(45, 99);
        System.out.println(S.score);
        Study st = new Study(34, 199);
        System.out.println(st.marksObtained);

        System.out.println(st.marks);
        System.out.println(S.marks);

        Result R = new Result();
        System.out.println(R.marks);

    }
}

class Result {
    int marks;

    Result() {
        this.marks = 0;
    }

    Result(int marks) {
        this.marks = marks;
    }

    void display() {
        System.out.println("Marks: " + marks);
    }
}

class Sport extends Result {
    int score;

    Sport() {
        this.score = 0;
    }

    Sport(int score, int marks) {
        super(marks);
        this.score = score;
    }

    Sport(int score) {
        this.score = score;
    }

    void displayScore() {
        System.out.println("Score: " + score);
    }
}

class Study extends Result {
    int marksObtained;

    Study() {
        this.marksObtained = 0;
    }

    Study(int marksObtained, int marks) {
        super(marks);
        this.marksObtained = marksObtained;
    }

    Study(int marksObtained) {
        this.marksObtained = marksObtained;
    }

    void displayMarksObtained() {
        System.out.println("Marks Obtained: " + marksObtained);
    }
}
