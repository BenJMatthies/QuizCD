
/**
 * Write a description of Grader here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Grader {

    private Student[] _students;
    
    public Grader(Student[] students)
    {
        _students = students;
    }
    
    public void addStudent(Student studentToAdd)
    {
        Student[] newStudentArray = new Student[_students.length + 1];
        for(int i=0; i<_students.length; i++)
        {
            newStudentArray[i] = _students[i];
        }
        
        newStudentArray[_students.length] = studentToAdd;
        
        _students = newStudentArray;
    }
    
    public LetterGrade getLetterGrade(String studentId)
    {
        Student currentStudent = getStudentById(studentId);
        Grade[] studentGrades = currentStudent.getGrades();
        double gradesTotal = 0.0;
        for(int i=0; i<studentGrades.length; i++)
        {
            gradesTotal += studentGrades[i].getPercentScore();
        }
        double averageGrade = gradesTotal / studentGrades.length;
        
        for(LetterGrade lg : LetterGrade.values())
        {
            
        }
    }
    
    private Student getStudentById(String studentId)
    {
        Student requestedStudent;
        for(Student s : _students)
        {
            if(s.getId() == studentId)
                requestedStudent = s;
        }
        return new Student("", new Grade[]{new Grade(0,0)});
    }
}
