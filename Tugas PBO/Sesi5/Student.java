public class Student extends Person {
    private int numCourses = 0;
    private String[] courses;
    private int[] grades;
    private static final int MAX_COURSES = 30; // Batas maksimum array

    // Constructor
    public Student(String name, String address) {
        super(name, address);
        courses = new String[MAX_COURSES];
        grades = new int[MAX_COURSES];
    }

    // Menambah mata kuliah dan nilai
    public void addCourseGrade(String course, int grade) {
        if (numCourses < MAX_COURSES) {
            courses[numCourses] = course;
            grades[numCourses] = grade;
            numCourses++;
            System.out.println("Berhasil menambahkan mata kuliah: " + course + " dengan nilai: " + grade);
        } else {
            System.out.println("Gagal menambahkan! Kapasitas kelas penuh.");
        }
    }

    // Menampilkan semua nilai
    public void printGrades() {
        if (numCourses == 0) {
            System.out.println("Belum ada data mata kuliah.");
            return;
        }
        System.out.print("Daftar Nilai: ");
        for (int i = 0; i < numCourses; i++) {
            System.out.print(courses[i] + ":" + grades[i] + " ");
        }
        System.out.println();
    }

    // Menghitung rata-rata nilai
    public double getAverageGrade() {
        if (numCourses == 0) return 0.0;
        int sum = 0;
        for (int i = 0; i < numCourses; i++) {
            sum += grades[i];
        }
        return (double) sum / numCourses;
    }

    // Override toString
    @Override
    public String toString() {
        return "Student: " + super.toString();
    }
}