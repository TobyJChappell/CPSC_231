/**
@name Toby Chappell
@student_id 2312642
@email tchappell@chapman.edu
@course CPSC-231-03
@assignment 6

Creates a class called Menu that provides the user 6 options of their choosing. The class handles user interaction including both input and output.
*/
import java.util.Scanner;
import java.io.File;
import java.util.ArrayList;
import java.io.PrintWriter;
import java.io.FileWriter;

public class Menu{
	//File that logs the output
	public File log;
	//True if user opts to log their outputs
	private boolean logging;

	/**
	Default Constructor sets the log to null and logging to false
	*/
	public Menu(){
		log = null;
		logging = false;
	}

	/**
	Returns the log file
	@return File
	*/
	public File getLogFile(){
		return log;
	}

	/**
	Sets the log file to a file
	@param l File
	*/
	public void setLogFile(File l){
		log = l;
	}

	/**
	Sets logging to a boolean
	@return boolean
	*/
	public boolean getLogging(){
		return logging;
	}

	/**
	Sets logging to a boolean
	@param l Boolean
	*/
	public void setLogging(boolean l){
		logging = l;
	}

	/**
	String with all six options the user can perform
	@return String Options
	*/
	public String printOptions(){
		return (
		"\n1) List the contents of a directory provided by the user\n" +
		"2) List the contents of a directory provided by the user as well as all of its sub directories.\n" +
		"3) Locate a file with a given name.\n" +
		"4) Locate files with a given file extension\n" +
		"5) Concatenate the contents of 2 files and output the result to a third file\n" +
		"6) Exit\n");
	}

	/**
	Prompts the user to choose if they would like to create a log file as well as the name of that file if they opt yes
	*/
	public void logFile(){
		Scanner s = new Scanner(System.in);
		System.out.println("\nWould like to dump results to a log file IN ADDITION to standard out?");
		if(s.next().charAt(0) == 'y'){
			System.out.println("\nPlease enter a name for the log file:");
			s.nextLine();
			String name = s.nextLine();

			log = new File(name);
			PrintWriter pw = null;
			try{
				pw = new PrintWriter(new FileWriter(log, false));
			} catch(Exception e){
				System.out.println("ERROR: Could not create log!");
				System.out.println(e.getMessage());
			}
			  finally{
				pw.close();
			}
			logging = true;
		}
	}

	/**
	Checks to see if the option is a valid number 1-6
	@return boolean True if number is valid
	@param str Option number taken as a string
	*/
	public boolean isValid(String str){
		try{
			int n = Integer.parseInt(str);
			if(n < 1 || n > 6){
				return false;
			}
			return true;
		}
		catch(NumberFormatException e){
			return false;
		}
	}

	/**
	Prompts the user to input a valid option number
	@return int A valid integer
	*/
	public int chooseNum(){
		Scanner s = new Scanner(System.in);
		String str = s.next();
		while(!isValid(str)){
			System.out.println("\nPlease input a valid number (1-6):");
			str = s.next();
		}
		return Integer.parseInt(str);
	}

	/**
	Prompts the user to input a valid directory
	@return File A valid directory
	*/
	public File getDirectory(){
		Scanner s = new Scanner(System.in);
		System.out.println("\nPlease enter the path of the directory:");
		String str = s.nextLine();
		File f = new File(str);
		while(!f.isDirectory()){
			System.out.println("\nPlease enter a valid directory:");
			str = s.nextLine();
		  f = new File(str);
		}
		System.out.println();
		return f;
	}

	/**
	Prompts the user to enter a valid extension (must include a dot and be greater than 2 characters in length)
	@return String A valid extension
	*/
	public String getExtension(){
		Scanner s = new Scanner(System.in);
		System.out.println("Please enter file extension:");
		String ext = s.nextLine();
		while(ext.length()<2 || ext.charAt(0) != '.'){
			System.out.println("\nPlease enter a valid file extension (ie. .txt, .java, etc.):");
			ext = s.nextLine();
		}
		return ext;
	}

	/**
	Prompts the user to enter a valid file
	@return File A valid file
	@param dir Directory user is searching through
	*/
	public File getFile(File dir){
		Scanner s = new Scanner(System.in);
		System.out.println("Please enter the name of the file:");
		String name = s.nextLine();
		FileFinder ff = new FileFinder();
		File f = new File("");
		ff.method3(dir, name);
		if(ff.getOutput().size() != 0){
			f = new File(ff.getOutput().get(0));
		}
		while(ff.getOutput().size() == 0 || !f.isFile()){
			ff = new FileFinder();
			System.out.println("\nPlease enter a valid file:");
			name = s.nextLine();
		  ff.method3(dir, name);
			if(ff.getOutput().size() != 0){
				f = new File(ff.getOutput().get(0));
			}
		}
		System.out.println();
		return f;
	}

	/**
	Outputs the results of a method to the terminal as well as logs it if the user chooses to do so (method must be implemented after choosing one of the 6 options)
	@param f A FileFinder
	*/
	public void printOutput(FileFinder f){
		ArrayList<String> out = f.getOutput();
		System.out.println();
		if(out.size()==0){
			System.out.println("NO RESULTS FOUND");
		}
		else{
			for(int x = 0; x < out.size(); x++){
				System.out.println(out.get(x));
			}
			if(logging){
				PrintWriter pw = null;
				try{
					pw = new PrintWriter(new FileWriter(log, true));
					for(int x = 0; x < out.size(); x++){
						pw.println(out.get(x));
					}
				}
				catch(Exception e){
					System.out.println("ERROR: Write error!");
					System.out.println(e.getMessage());
				}
				finally{
					pw.close();
				}
			}
		}
	}

	/**
	Performs and outputs one of the methods
	@param n
	*/
	public void doOption(int n){
		FileFinder f = new FileFinder();
		Scanner s = new Scanner(System.in);
		File dir = new File("");
		if(n!=6){
			dir = getDirectory();
		}
		switch(n){
			case 1:
				f.method1(dir);
				break;
			case 2:
				f.method2(dir);
				break;
			case 3:
				System.out.println("Please enter a file name:");
				String name = s.nextLine();
				f.method3(dir, name);
				break;
			case 4:
				f.method4(dir, getExtension());
				break;
			case 5:
				File in1 = getFile(dir);
				File in2 = getFile(dir);
				System.out.println("What would you like to name the file?");
				File out = new File(s.nextLine());
				f.method5(in1, in2, out);
				break;
		}
		if(n!=6){
			printOutput(f);
		}
	}

	/**
	Executes the main features of the program (prints options and allows user to choose until exit)
	*/
	public void run(){
		logFile();
		int num;
		do{
			System.out.println("\nPlease choose what you would like to do from one of the six options:");
			System.out.println(printOptions());
			num = chooseNum();
			doOption(num);
		} while(num!=6);
		System.out.println("\nThanks for stopping by, have a nice day!\n");
	}

	/**
	Creates a menu object and runs the code
	*/
	public static void main(String[] args) {
		Menu m = new Menu();
		m.run();
	}
}
