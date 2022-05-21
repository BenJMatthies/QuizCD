
/**
 * Write a description of LetterGrade here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public enum LetterGrade {

    A(90.0),
    B(80.0),
    C(70.0),
    D(60.0),
    F(0.0);
    
    private double _minPercent;
    
    private LetterGrade(double minPercent)
    {
        _minPercent = minPercent;
    }
    
    public double getMinimumPercent()
    {
        return this._minPercent;
    }
}
