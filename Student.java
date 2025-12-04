public class Student {
    private String name;
    private int roll;
    private int[] marks = new int[5];

    public Student(String name, int roll, int[] marks) {
        this.name = name;
        this.roll = roll;
        this.marks = marks;
    }

    public String getName() {
        return name;
    }

    public int getRoll() {
        return roll;
    }

    public int[] getMarks() {
        return marks;
    }

    public int getTotal() {
        int sum = 0;
        for (int m : marks) {
            sum += m;
        }
        return sum;
    }

    public double getPercentage() {
        return getTotal() / 5.0;
    }

    public String getGrade() {
        double p = getPercentage();

        if (p >= 90) return "A+";
        else if (p >= 80) return "A";
        else if (p >= 70) return "B+";
        else if (p >= 60) return "B";
        else if (p >= 50) return "C";
        else if (p >= 40) return "D";
        else return "F";
    }
}
