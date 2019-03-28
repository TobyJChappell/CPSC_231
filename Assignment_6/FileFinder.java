/**
@name Toby Chappell
@student_id 2312642
@email tchappell@chapman.edu
@course CPSC-231-03
@assignment 6

Creates a class called FileFinder that actually carries out the function of each option
*/
import java.io.File;
import java.util.Scanner;
import java.util.ArrayList;
import java.io.PrintWriter;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.FileReader;

public class FileFinder{

	//String ArrayList of the output of an option
	private ArrayList<String> output;

	/**
	Default Constructor sets the output to a new ArrayList
	*/
	public FileFinder(){
		output = new ArrayList<String>();
	}

	/**
	Returns the output
	@return ArrayList<String>
	*/
	public ArrayList<String> getOutput(){
		return output;
	}

	/**
	Sets the output to an ArrayList<String>
	@param o ArrayList<String>
	*/
	public void setOutput(ArrayList<String> o){
		output = o;
	}

	/**
	Outputs all of the contents of a directory
	@param f A valid directory inputted by the user
	*/
	public void method1(File f){
		String[] contents = f.list();
		for(int x = 0; x < contents.length; x++){
			output.add(contents[x]);
		}
	}

	/**
	Outputs all of the contents of a directory and it's subdirectories
	@param f A valid directory inputted by the user
	*/
	public void method2(File f){
		File[] contents = f.listFiles();
		for(int x = 0; x < contents.length; x++){
			output.add(contents[x].getName());
			if(contents[x].isDirectory()){
				method2(contents[x]);
			}
		}
	}

	/**
	Returns the path of a file provided its name
	@param f A valid directory inputted by the user
	@param name The name of the file the user is searching for
	*/
	public void method3(File f, String name){
		File[] contents = f.listFiles();
		for(int x = 0; x < contents.length; x++){
			if(contents[x].getName().equals(name)){
				output.add(contents[x].getAbsolutePath());
			}
			if(contents[x].isDirectory()){
				method3(contents[x], name);
			}
		}
	}

	/**
	Returns all files ending in an extension provided by the user
	@param f A valid directory inputted by the user
	@param ext The name of the extension the user is searching for
	*/
	public void method4(File f, String ext){
		File[] contents = f.listFiles();
		for(int x = 0; x < contents.length; x++){
			if(contents[x].isDirectory()){
				method4(contents[x], ext);
			}
			else if(ext.length() < contents[x].getName().length() && contents[x].getName().substring(contents[x].getName().length() - ext.length()).equals(ext)){
				output.add(contents[x].getAbsolutePath());
			}
		}
	}

	/**
	Concatenates the contents of 2 files whose names are provided by the user and outputs the result to a third file (name also provided by the user)
	@param in1 First input File
	@param in2 Second input File
	@param out Result File
	*/
	public void method5(File in1, File in2, File out){
		PrintWriter pw = null;
		BufferedReader br1 = null;
		BufferedReader br2 = null;
		String currentLine;
		try{
			pw = new PrintWriter(new FileWriter(out, true));
			br1 = new BufferedReader(new FileReader(in1));
			while((currentLine = br1.readLine()) != null){
				pw.println(currentLine);
			}
			br2 = new BufferedReader(new FileReader(in2));
			while((currentLine = br2.readLine()) != null){
				pw.println(currentLine);
			}
		}
		catch(Exception e){
			System.out.println("ERROR: Parameters must be valid!");
			System.out.println(e.getMessage());
		}
		finally{
			pw.close();
			try{
				br1.close();
				br2.close();
			}
			catch(Exception e){}
		}
		output.add("File has been created.");

	}
}
