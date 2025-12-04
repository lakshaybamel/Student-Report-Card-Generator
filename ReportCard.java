public class ReportCard {

    public static void printReport(Student s) {
        System.out.println("==========================================");
        System.out.println("               REPORT CARD                ");
        System.out.println("==========================================");
        System.out.println("Name        : " + s.getName());
        System.out.println("Roll Number : " + s.getRoll());
        System.out.println("------------------------------------------");
        System.out.println("Marks:");

        int[] m = s.getMarks();
        String[] subjects = {"Maths", "Science", "English", "Computer", "GK"};

        for (int i = 0; i < m.length; i++) {
            System.out.println(subjects[i] + " : " + m[i]);
        }

        System.out.println("------------------------------------------");
        System.out.println("Total Marks : " + s.getTotal());
        System.out.println("Percentage  : " + String.format("%.2f", s.getPercentage()) + "%");
        System.out.println("Grade       : " + s.getGrade());
        System.out.println("==========================================");
    }
}
