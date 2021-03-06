
/**
 * Write a description of Grader here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Grader {

    private Student[] _students = new Student[0];
    
    /*public Grader(Student[] students)
    {
        _students = students;
    }*/
    
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
            if(lg.getMinPercent() <= averageGrade)
                return lg;
        }
        return null;
    }
    
    public void administer(String studentId, Quiz quiz)
    {
        //getStudentById(studentId).addGrade(new Grade(quiz.getNumberOfQuestions(), quiz.administer()));
        Student currentStudent = getStudentById(studentId);
        int quizLength = quiz.getNumberOfQuestions();
        int quizScore = quiz.administer();
        currentStudent.addGrade(new Grade(quizLength, quizScore));//*/
    }
    
    private Student getStudentById(String studentId)
    {
        for(Student s : _students)
        {
            if(s.getId() == studentId)
                return s;
        }
        return null;
    }
}
