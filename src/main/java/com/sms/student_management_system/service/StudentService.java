@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

    public Student saveStudent(Student student) {
        return studentRepository.save(student);
    }

    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    public Student getStudentById(int id) {
        return studentRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Student not found with id: " + id));
    }

    public Student updateStudent(int id, Student student) {
        Student existing = getStudentById(id);

        existing.setName(student.getName());
        existing.setCourse(student.getCourse());
        existing.setFee(student.getFee());

        return studentRepository.save(existing);
    }

    public void deleteStudent(int id) {
        Student existing = getStudentById(id);
        studentRepository.delete(existing);
    }
}
