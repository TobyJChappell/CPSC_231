/**
@name Toby Chappell
@student_id 2312642
@email tchappell@chapman.edu
@course CPSC-231-03
@assignment 4

Creates a class called StudentRecord that allows the user to input a variety of grades and
determine their grade in the class.

*/
public class StudentRecord{
	//Points from quizzes (3 quizzese total; max 10 points per quiz; worth 25% of grade)
	private int m_quizzes;
	//Points from midterm (max 100 points; worth 35% of grade)
	private int m_midterm;
	//Points from final (max 100 points; worth 40% of grade)
	private int m_final;
	//Total grade expressed as a percentage
	private int m_overall;
	//Letter grade
	private char m_letter;

	//Default constructor is 0% in the class with an F
	public StudentRecord(){
		m_quizzes = 0;
		m_midterm = 0;
		m_final = 0;
		m_overall = 0;
		m_letter = 'F';
	}

	/**
	Overloaded constructor assigns parameters and calculated overall/letter grade
	@param q Points toward quizzes
	@param m Points toward midterm
	@param f Points toward final
	*/
	public StudentRecord(int q, int m, int f){
		m_quizzes = q;
		m_midterm = m;
		m_final = f;
		calcOverall();
		calcLetter();
	}

	/**
	Returns points toward quizzes
	@return int
	*/
	public int getQuizzes(){
		return m_quizzes;
	}

	/**
	Sets points toward quizzes as well as update overall/letter grade
	@param q
	*/
	public void setQuizzes(int q){
		m_quizzes = q;
		calcOverall();
		calcLetter();
	}

	/**
	Returns points toward the midterm
	@return int
	*/
	public int getMidterm(){
		return m_midterm;
	}

	/**
	Sets points toward the midterm as well as update overall/letter grade
	@param m
	*/
	public void setMidterm(int m){
		m_midterm = m;
		calcOverall();
		calcLetter();
	}

	/**
	Returns points toward the final
	@return int
	*/
	public int getFinal(){
		return m_final;
	}

	/**
	Sets points toward the final as well as update overall/letter grade
	@param f
	*/
	public void setFinal(int f){
		m_final = f;
		calcOverall();
		calcLetter();
	}

	/**
	Returns overall grade in the class as a percentage
	@return int
	*/
	public int getOverall(){
		return m_overall;
	}

	/**
	Returns letter grade in the class
	@return char
	*/
	public char getLetter(){
		return m_letter;
	}

	/**
	Calculates and sets the overall grade based on points recieved
	from the three categories as well as their weight
	*/
	public void calcOverall(){
		double qPercent = (double)m_quizzes/30*100*.25;
		double mPercent = (double)m_midterm*.35;
		double fPercent = (double)m_final*.40;
		m_overall = (int)(qPercent + mPercent + fPercent);

	}

	/**
	Calculates and sets the letter grade based on the overall grade in the class
	*/
	public void calcLetter(){
		if(m_overall >= 90){
			m_letter = 'A';
		}
		else if(m_overall >= 80){
			m_letter = 'B';
		}
		else if(m_overall >= 70){
			m_letter = 'C';
		}
		else if(m_overall >= 60){
			m_letter = 'D';
		}
		else{
			m_letter = 'F';
		}
	}

	/**
	Determines if two StudentRecords are equal to each other
	@return boolean
	*/
	public boolean equals(StudentRecord s){
		if((m_quizzes==s.getQuizzes()) && (m_midterm==s.getMidterm()) && (m_final==s.getFinal()) && (m_overall == s.getOverall()) && (m_letter == s.getLetter())){
			return true;
		}
		return false;
	}

	/**
	Displays points recieved in the 3 categories as well as the overall and letter grade in an easy to read format
	@return String
	*/
	public String toString(){
		return ("Quizzes: " + m_quizzes + " Midterm: " + m_midterm + " Final: " + m_final + " Overall: " + m_overall + "% Letter: " + m_letter);
	}
}
