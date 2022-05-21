
/**
 * Write a description of Student here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Student {

    private String _id;
    private Grade[] _grades;
    
    private Student(String id, Grade[] grades)
    {
        _id = id;
        _grades = grades;
    }
    
    public String getId()
    {
        return _id;
    }
    
    public Grade[] getGrades()
    {
        return _grades;
    }
    
    public void addGrade(Grade gradeToAdd)
    {
        Grade[] newGradeArray = new Grade[_grades.length +1];
        for(int x=0; x<_grades.length; x++)
        {
            newGradeArray[x] = _grades[x];
        }
        
        newGradeArray[_grades.length] = gradeToAdd;
        
        _grades = newGradeArray;
    }
        
}
