public class Teacher extends Person {
    private int numCourses = 0;
    private String[] courses;
    private static final int MAX_COURSES = 10; // Batas maksimum mengajar

    // Constructor
    public Teacher(String name, String address) {
        super(name, address);
        courses = new String[MAX_COURSES];
    }

    // Menambah mata kuliah (Return false jika sudah ada)
    public boolean addCourse(String course) {
        // Cek apakah mata kuliah sudah pernah ditambahkan
        for (int i = 0; i < numCourses; i++) {
            if (courses[i].equalsIgnoreCase(course)) {
                return false; 
            }
        }
        
        if (numCourses < MAX_COURSES) {
            courses[numCourses] = course;
            numCourses++;
            return true;
        }
        return false;
    }

    // Menghapus mata kuliah (Return false jika tidak ditemukan)
    public boolean removeCourse(String course) {
        int indexFound = -1;
        for (int i = 0; i < numCourses; i++) {
            if (courses[i].equalsIgnoreCase(course)) {
                indexFound = i;
                break;
            }
        }

        // Jika ditemukan, geser elemen array untuk menghapus
        if (indexFound != -1) {
            for (int i = indexFound; i < numCourses - 1; i++) {
                courses[i] = courses[i + 1];
            }
            courses[numCourses - 1] = null; // Hapus referensi terakhir
            numCourses--;
            return true;
        }
        return false;
    }

    // Override toString
    @Override
    public String toString() {
        return "Teacher: " + super.toString();
    }
}