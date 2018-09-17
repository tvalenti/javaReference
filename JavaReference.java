/*	filename: JavaReference.java
	Author: Tom Date: 7/23/18*/

import java.util.Scanner;

public class JavaReference
{
	public static void main(String[] args) 
	{
		// Declare variable
		String keyword;
		byte i = 0;

		// New Scanner object
		Scanner kybd = new Scanner(System.in);

		// Intro output/how to/example
		System.out.println("=====================================================================================");
		System.out.println("");
		System.out.println("Welcome to Java Definition Glossary Reference. v0.3");
		System.out.println("Covers ALL Key Terms from chapter 1-8.");
		System.out.println("Input the word you want a definition to.");
		System.out.println("(This is usually the bold words throughout the chapters.\nThey must be typed exactly how you see them. Hyphens and all.)");
		System.out.println("");
		System.out.println("Example:");
		System.out.println("");
		System.out.println("cross-platform development");
		System.out.println("");
		System.out.println("CROSS-PLATFORM DEVELOPMENT - The development of mobile\napplications that can be used on a variety of platforms.");
		System.out.println("");
		System.out.println("=====================================================================================");
		

		// Loop to start over after typing in keywords
		while (i == 0)
		{
			// User input
			System.out.println("");
			System.out.println("=====================================================================================");
			System.out.println("");
			System.out.println("Enter \"end\" to end application.\nEnter \"intro\" to repeat intro statement with directions.");
			System.out.println("");
			System.out.print("Enter the Java word >>");
			keyword = kybd.nextLine().toUpperCase();

			switch (keyword) 
			{	
				// Closing case 
				case "END":
					System.out.println("Closing application...");
					i++;
					break;

				// Repeats intro for directions.
				case "INTRO":
					System.out.println("=====================================================================================");
					System.out.println("");
					System.out.println("Welcome to Java Definition Glossary Reference. v0.2");
					System.out.println("Covers ALL Key Terms from chapter 1-5.");
					System.out.println("Input the word you want a definition to.");
					System.out.println("(This is usually the bold words throughout the chapters.\nThey must be typed exactly how you see them. Hyphens and all.)");
					System.out.println("Example:");
					System.out.println("");
					System.out.println("cross-platform development");
					System.out.println("");
					System.out.println("CROSS-PLATFORM DEVELOPMENT - The development of mobile\napplications that can be used on a variety of platforms.");
					System.out.println("");
					System.out.println("=====================================================================================");
					break;
				/*----------------------- LETTER A -----------------------------*/
				// Keyword
				case "ABSOLUTE PATH":
					// New line for spacing
					System.out.println("");
					// Definition of keyword
					System.out.println("ABSOLUTE PATH - A complete file path that does not require any other information\nto locate a file on a system.");
					// New line for spacing
					System.out.println("");
					// Example of use
					System.out.println("ABSOLUTE PATH");
					System.out.println("C:\\user\\username\\documents\\file.pdf");
					break;

				// Keyword
				case "ABSTRACT CLASS":
					// New line for spacing
					System.out.println("");
					// Definition of keyword
					System.out.println("ABSTRACT CLASS - A class from which no concrete objects can be instantiated,\nbut which can serve as a basis for inheritance. Abstract classes \nusually have one or more empty abstract methods. Contrast with CONCRETE CLASS.");
					// New line for spacing
					System.out.println("");
					// Example of use(if needed)
					System.out.println("ABSTRACT CLASS");
					System.out.println("abstract class ClassName\n{\n\tint color;\n\n\tabstract void draw();\n}");
					break;

				// Keyword
				case "ABSTRACT DATA TYPE":
					// New line for spacing
					System.out.println("");
					// Definition of keyword
					System.out.println("ABSTRACT DATA TYPE - A type whose implementation is hidde and accessed\nthrough its public methods.");
					// New line for spacing
					System.out.println("");
					// Example of use(if needed)
					System.out.println("Array, List, Map, Queue, Set, Stack, Table, Tree, and Vector are ABSTRACT DATA TYPES.");
					break;

				// Keyword
				case "ABSTRACT METHOD":
					// New line for spacing
					System.out.println("");
					// Definition of keyword
					System.out.println("ABSTRACT METHOD - A method declares with the keyword abstract and that has no body;\nA subclass must override each base class abstract method.");
					// New line for spacing
					System.out.println("");
					// Example of use(if needed)
					System.out.println("public abstract ClassName\n{\n\tabstract void eat();\n}\n");
					break;

				// Keyword
				case "ABSTRACT WINDOWS TOOLKIT (AWT)":
					// New line for spacing
					System.out.println("");
					// Definition of keyword
					System.out.println("ABSTRACT WINDOWS TOOLKIT (AWT) - A set of GUI components that predates \"Swing\" and\nis less portable than the set of \"Swing\" components.");
					// New line for spacing
					System.out.println("");
					// Example of use(if needed)
					System.out.println("");
					break;

				// Keyword
				case "AWT":
					// New line for spacing
					System.out.println("");
					// Definition of keyword
					System.out.println("AWT - A set of GUI components that predates \"Swing\" and is less portable than the set of \"Swing\" components.");
					// New line for spacing
					System.out.println("");
					// Example of use(if needed)
					System.out.println("");
					break;
				
				// Keyword
				case "ABSTRACTION":
					// New line for spacing
					System.out.println("");
					// Definition of keyword
					System.out.println("ABSTRACTION - The programming feature that allows a method name to encapsulate multiple statements.");
					// New line for spacing
					System.out.println("");
					// Example of use(if needed)
					System.out.println("");
					break;

				// Keyword
				case "ACCESS MODIFIER":
					// New line for spacing
					System.out.println("");
					// Definition of keyword
					System.out.println("ACCESS MODIFIER - Defines the circumstances under which a class can be accessed;\nOften used interchangeably with ACCESS SPECIFIER");
					// New line for spacing
					System.out.println("");
					// Example of use(if needed)
					System.out.println("public class ClassName");
					System.out.println("^^^^^^ is the ACCESS MODIFIER");
					break;

				// Keyword
				case "ACCESS SPECIFIER":
					// New line for spacing
					System.out.println("");
					// Definition of keyword
					System.out.println("ACCESS SPECIFIER - Defines the circumstances under which a class can be accessed;\nOften used interchangeably with ACCESS MODIFIER.");
					// New line for spacing
					System.out.println("");
					// Example of use(if needed)
					System.out.println("public class ClassName");
					System.out.println("^^^^^^ is the ACCESS SPECIFIER");
					break;

				// Keyword
				case "ACCESSOR METHODS":
					// New line for spacing
					System.out.println("");
					// Definition of keyword
					System.out.println("ACCESSOR METHODS - Methods that return information from an object.");
					// New line for spacing
					System.out.println("");
					// Example of use(if needed)
					System.out.println("");
					break;

				// Keyword
				case "ACCUMULATING":
					// New line for spacing
					System.out.println("");
					// Definition of keyword
					System.out.println("ACCUMULATING - The process of repeatedly increasing a value by some amount to produce a total.");
					// Neew line for spacing
					System.out.println("");
					// Example of use(if needed)
					System.out.println("");
					break;

				// Keyword
				case "ACTUAL PARAMETERS":
					// New line for spacing
					System.out.println("");
					// Definition of keyword
					System.out.println("ACTUAL PARAMETERS - The arguements in a method call. Contrast with FORMAL PARAMETERS.");
					// New line for spacing
					System.out.println("");
					// Example of use(if needed)
					System.out.println("");
					break;

				// Keyword
				case "ADD AND ASSIGN OPERATOR":
					// New line for spacing
					System.out.println("");
					// Definition of keyword
					System.out.println("ADD AND ASSIGN OPERATOR - An operator that alters the value of the operand on the left by adding the operant on the right to it; composed of a plus sign and and equal sign(+=).");
					// New line for spacing
					System.out.println("");
					// Example of use(if needed)
					System.out.println("");
					break;

				// Keyword
				case "AD-HOC POLYMORPHISM":
					// New line for spacing
					System.out.println("");
					// Definition of keyword
					System.out.println("AD-HOC POLYMORPHISM - Polymorphism that occurs when a single method name can be use with a variety of data types because various implementations exist; another name for METHOD OVERLOADING.");
					// New line for spacing
					System.out.println("");
					// Example of use(if needed)
					System.out.println("");
					break;

				// Keyword
				case "AGGREGATION":
					// New line for spacing
					System.out.println("");
					// Definition of keyword
					System.out.println("AGGREGATION - A type of containment in which a class contains one or more members of another class that would continue to exist without the object that contains them.");
					// New line for spacing
					System.out.println("");
					// Example of use(if needed)
					System.out.println("");
					break;

				// Keyword
				case "ALGORITHM":
					// New line for spacing
					System.out.println("");
					// Definition of keyword
					System.out.println("ALGORITHM - A process or set of steps that solves a problem.");
					// New line for spacing
					System.out.println("");
					// Example of use(if needed)
					System.out.println("");
					break;

				// Keyword
				case "ALLMAN STYLE":
					// New line for spacing
					System.out.println("");
					// Definition of keyword
					System.out.println("ALLMAN STYLE - The indent style in which curly braces are aligned and each occupies its own line; name for Eric Allman, a programmer who popularized the style. Constrast with K AND R STYLE.");
					// New line for spacing
					System.out.println("");
					// Example of use(if needed)
					System.out.println("ALLMAN STYLE");
					System.out.println("public class ClassName\n{\n\n\n}");
					break;

				// Keyword
				case "AMBIGUOUS":
					// New line for spacing
					System.out.println("");
					// Definition of keyword
					System.out.println("AMBIGUOUS - Describes a situation in which the compiler cannot determine which method to use.");
					// New line for spacing
					System.out.println("");
					// Example of use(if needed)
					System.out.println("");
					break;

				// Keyword
				case "ANONYMOUS CLASSES":
					// New line for spacing
					System.out.println("");
					// Definition of keyword
					System.out.println("ANONYMOUS CLASSES - Nested, local classes that have no identifiers.");
					// New line for spacing
					System.out.println("");
					// Example of use(if needed)
					System.out.println("");
					break;

				// Keyword
				case "ANONYMOUS INNER CLASS":
					// New line for spacing
					System.out.println("");
					// Definition of keyword
					System.out.println("ANONYMOUS INNER CLASS - A class that has no name and is defined inside another class/");
					// New line for spacing
					System.out.println("");
					// Example of use(if needed)
					System.out.println("");
					break;

				// Keyword
				case "ANONYMOUS OBJECT":
					// New line for spacing
					System.out.println("");
					// Definition of keyword
					System.out.println("ANONYMOUS OBJECT - An unnamed object");
					// New line for spacing
					System.out.println("");
					// Example of use(if needed)
					System.out.println("");
					break;

				// Keyword
				case "APPLICATION FILES":
					// New line for spacing
					System.out.println("");
					// Definition of keyword
					System.out.println("APPLICATION FILES - Files that store software instructions");
					// New line for spacing
					System.out.println("");
					// Example of use(if needed)
					System.out.println("");
					break;
				// Keyword
				case "ARCHITECTURALLY NEUTRAL":
					// New line for spacing
					System.out.println("");
					// Definition of keyword
					System.out.println("ARCHITECTURALLY NEUTRAL - Describes the feature of Java that allows a program to run on any platform");
					// New line for spacing
					System.out.println("");
					// Example of use(if needed)
					System.out.println("");
					break;
					
				// Keyword
				case "ARGUMENT INDEX":
					// New line for spacing
					System.out.println("");
					// Definition of keyword
					System.out.println("ARGUMENT INDEX - In a printf() statement, an integer that indicates the position of an argument in the argument list.");
					// New line for spacing
					System.out.println("");
					// Example of use(if needed)
					System.out.println("");
					break;

				// Keyword
				case "ARGUMENTS":
					// New line for spacing
					System.out.println("");
					// Definition of keyword
					System.out.println("ARGUMENTS - Data items sent to methods in a method call.");
					// New line for spacing
					System.out.println("");
					// Example of use(if needed)
					System.out.println("ARGUMENTS");
					System.out.println("JOptionPane.showMessageDialog(ARGUMENT,\"ARGUMENT\")");
					break;
					
				// Keyword
				case "ARRAY":
					// New line for spacing
					System.out.println("");
					// Definition of keyword
					System.out.println("ARRAY - A named list of data items that have the same data type.");
					// New line for spacing
					System.out.println("");
					// Example of use(if needed)
					System.out.println("ARRAY");
					System.out.println("int a[] = new int[3]\na[0] = 10\na[1] = 20\na[2] = 30");
					break;
				
				// Keyword
				case "ASCENDING ORDER":
					// New line for spacing
					System.out.println("");
					// Definition of keyword
					System.out.println("ASCENDING ORDER - The order of objects arranged from lowest to highest value.");
					// New line for spacing
					System.out.println("");
					// Example of use(if needed)
					System.out.println("");
					break;

				// Keyword
				case "ASCII":
					// New line for spacing
					System.out.println("");
					// Definition of keyword
					System.out.println("ASCII - Acronym for American Standard Code for InformationInterchange, a character set widely used to represent a computer data.");
					// New line for spacing
					System.out.println("");
					// Example of use(if needed)
					System.out.println("");
					break;

				// Keyword
				case "ASSERTION":
					// New line for spacing
					System.out.println("");
					// Definition of keyword
					System.out.println("ASSERTION - A Java language feature that can help detect logic errors and debug a program");
					// New line for spacing
					System.out.println("");
					// Example of use(if needed)
					System.out.println("");
					break;

				// Keyword
				case "ASSIGNMENT OPERATOR":
					// New line for spacing
					System.out.println("");
					// Definition of keyword
					System.out.println("ASSIGNMENT OPERATOR - The equal sign(=); any value to the right of the equal sign is assigned to the variable or constant on the left of the equal sign");
					// New line for spacing
					System.out.println("");
					// Example of use(if needed)
					System.out.println("");
					break;

				// Keyword
				case "ASSOCIATIVITY":
					// New line for spacing
					System.out.println("");
					// Definition of keyword
					System.out.println("ASSOCIATIVITY - Describes the order in which operands are used with operators.");
					// New line for spacing
					System.out.println("");
					// Example of use(if needed)
					System.out.println("");
					break;

				// Keyword
				case "AT RUN TIME":
					// New line for spacing
					System.out.println("");
					// Definition of keyword
					System.out.println("AT RUN TIME - Describes the period of time during which a program executes.");
					// New line for spacing
					System.out.println("");
					// Example of use(if needed)
					System.out.println("");
					break;
				
				// Keyword
				case "ATTRIBUTES":
					// New line for spacing
					System.out.println("");
					// Definition of keyword
					System.out.println("ATTRIBUTES - The characteristics that define an object as part of a class.");
					// New line for spacing
					System.out.println("");
					// Example of use(if needed)
					System.out.println("");
					break;
				/*----------------------- LETTER B -----------------------------*/
				// Keyword
				case "BASE CLASS":
					// New line for spacing
					System.out.println("");
					// Definition of keyword
					System.out.println("BASE CLASS - A class that is used as a basis for inheritance.");
					// New line for spacing
					System.out.println("");
					// Example of use(if needed)
					System.out.println("");
					break;
				
				// Keyword
				case "BATCH PROCESSING":
					// New line for spacing
					System.out.println("");
					// Definition of keyword
					System.out.println("BATH PROCESSING - Processing that involces performing the tasks with many records, one after the other.");
					// New line for spacing
					System.out.println("");
					// Example of use(if needed)
					System.out.println("");
					break;
				
				// Keyword
				case "BINARY FILES":
					// New line for spacing
					System.out.println("");
					// Definition of keyword
					System.out.println("BINARY FILES - Files that contain data that have not been encoded as text; their contents are in binary format.");
					// New line for spacing
					System.out.println("");
					// Example of use(if needed)
					System.out.println("");
					break;
				
				// Keyword
				case "BINARY NUMBERING SYSTEM":
					// New line for spacing
					System.out.println("");
					// Definition of keyword
					System.out.println("BINARY NUMBERING SYSTEM - A numbering system based on two digits, 0 and 1, in which each column represents a value two times higher than the column to its right");
					// New line for spacing
					System.out.println("");
					// Example of use(if needed)
					System.out.println("");
					break;
				
				// Keyword
				case "BINARY OPERATORS":
					// New line for spacing
					System.out.println("");
					// Definition of keyword
					System.out.println("BINARY OPERATORS - Operators that require two operands.");
					// New line for spacing
					System.out.println("");
					// Example of use(if needed)
					System.out.println("");
					break;
				
				// Keyword
				case "BIT":
					// New line for spacing
					System.out.println("");
					// Definition of keyword
					System.out.println("BIT - A binary digit, 0 or 1, used to represent computerized values.");
					// New line for spacing
					System.out.println("");
					// Example of use(if needed)
					System.out.println("");
					break;

				// Keyword
				case "BLACK BOX":
					// New line for spacing
					System.out.println("");
					// Definition of keyword
					System.out.println("BLACK BOX - A device that can be used solely in terms of input and output without regard to how it works internally.");
					// New line for spacing
					System.out.println("");
					// Example of use(if needed)
					System.out.println("");
					break;
				
				// Keyword
				case "BLANK FINAL":
					// New line for spacing
					System.out.println("");
					// Definition of keyword
					System.out.println("FINAL BLANK - A final variable that has not yet bee assigned a value.");
					// New line for spacing
					System.out.println("");
					// Example of use(if needed)
					System.out.println("");
					break;
				
				// Keyword
				case "BLOCK":
					// New line for spacing
					System.out.println("");
					// Definition of keyword
					System.out.println("BLOCK - The code between a pair of curly braces.");
					// New line for spacing
					System.out.println("");
					// Example of use(if needed)
					System.out.println("");
					break;
				
				// Keyword
				case "BLOCK COMMENTS":
					// New line for spacing
					System.out.println("");
					// Definition of keyword
					System.out.println("BLOCK COMMENTS - Comments that start with a forward slash and an asterisk(/*) and end with an asterisk and a forward slash(*/). Block comments can appear on a lie by themselves, on a line before the executable code, or on a line after the executable code. Block comments also can extend across as many lines as needed. Contrast with LINE COMMENTS");
					// New line for spacing
					System.out.println("");
					// Example of use(if needed)
					System.out.println("");
					break;
				
				// Keyword
				case "BLOCK OF CODE":
					// New line for spacing
					System.out.println("");
					// Definition of keyword
					System.out.println("BLOCK OF CODE - The code between a pair of curly braces.");
					// New line for spacing
					System.out.println("");
					// Example of use(if needed)
					System.out.println("");
					break;
				
				// Keyword
				case "BOOLEAN":
					// New line for spacing
					System.out.println("");
					// Definition of keyword
					System.out.println("BOOLEAN - Data type that can hold only one of two values - true or false");
					// New line for spacing
					System.out.println("");
					// Example of use(if needed)
					System.out.println("");
					break;
				
				// Keyword
				case "BOOLEAN VALUES":
					// New line for spacing
					System.out.println("");
					// Definition of keyword
					System.out.println("BOOLEAN VALUES - true or false values; every computer decision results in a BOOLEAN VALUE.");
					// New line for spacing
					System.out.println("");
					// Example of use(if needed)
					System.out.println("");
					break;
				
				// Keyword
				case "BORDER LAYOUT MANAGER":
					// New line for spacing
					System.out.println("");
					// Definition of keyword
					System.out.println("BORDER LAYOUT MANAGER - A layout manager that divides a container into regions.");
					// New line for spacing
					System.out.println("");
					// Example of use(if needed)
					System.out.println("");
					break;
				
				// Keyword
				case "BUBBLE SORT":
					// New line for spacing
					System.out.println("");
					// Definition of keyword
					System.out.println("BUBBLE SORT - A type of sort that operated by compairing pairs of items and swapping them if they are out of order so that the smallest items \"bubble\" to the top of the list, eventually creating a sorted list.");
					// New line for spacing
					System.out.println("");
					// Example of use(if needed)
					System.out.println("");
					break;
				
				// Keyword
				case "BUFFER":
					// New line for spacing
					System.out.println("");
					// Definition of keyword
					System.out.println("BUFFER - A memory location that holds data temporarily - for example when creating a StringBuilder object or during input and output operations.");
					// New line for spacing
					System.out.println("");
					// Example of use(if needed)
					System.out.println("");
					break;
				
				// Keyword
				case "BUGS":
					// New line for spacing
					System.out.println("");
					// Definition of keyword
					System.out.println("BUGS - Flaws or mistakes in a computer program.");
					// New line for spacing
					System.out.println("");
					// Example of use(if needed)
					System.out.println("");
					break;
				
				// Keyword
				case "BUTTON":
					// New line for spacing
					System.out.println("");
					// Definition of keyword
					System.out.println("BUTTON - A GUI component typically used to trigger an action or make a selection when the user clicks it.");
					// New line for spacing
					System.out.println("");
					// Example of use(if needed)
					System.out.println("");
					break;
				
				// Keyword
				case "BUTTON GROUP":
					// New line for spacing
					System.out.println("");
					// Definition of keyword
					System.out.println("BUTTON GROUP - A GUI component that groups other compnents, such as check boxes, so a user can select only one.");
					// New line for spacing
					System.out.println("");
					// Example of use(if needed)
					System.out.println("");
					break;
				
				// Keyword
				case "BYTE":
					// New line for spacing
					System.out.println("");
					// Definition of keyword
					System.out.println("BYTE - The data type that holds very small integers, from -128 to 127.");
					// New line for spacing
					System.out.println("");
					// Example of use(if needed)
					System.out.println("");
					break;
				
				// Keyword
				case "BYTECODE":
					// New line for spacing
					System.out.println("");
					// Definition of keyword
					System.out.println("BYTECODE - Programming statements that have been compiled into binary format.");
					// New line for spacing
					System.out.println("");
					// Example of use(if needed)
					System.out.println("");
					break;
				/*----------------------- LETTER C -----------------------------*/
				// Keyword
				case "CALL":
					// New line for spacing
					System.out.println("");
					// Definition of keyword
					System.out.println("CALL - To invoke a method; to cause a method to execute.");
					// New line for spacing
					System.out.println("");
					// Example of use(if needed)
					System.out.println("");
					break;
				
				// Keyword
				case "CALL A PROCEDURE":
					// New line for spacing
					System.out.println("");
					// Definition of keyword
					System.out.println("CALL A PROCEDURE - To invoke a method.");
					// New line for spacing
					System.out.println("");
					// Example of use(if needed)
					System.out.println("");
					break;
				
				// Keyword
				case "CALL STACK":
					// New line for spacing
					System.out.println("");
					// Definition of keyword
					System.out.println("CALL STACK - The memory location where the computer stores the list of memory location to which the system must return when methods end.");
					// New line for spacing
					System.out.println("");
					// Example of use(if needed)
					System.out.println("");
					break;
				
				// Keyword
				case "CALLED METHOD":
					// New line for spacing
					System.out.println("");
					// Definition of keyword
					System.out.println("CALLED METHOD - A term used to decribe the relationship between two methods; a method that is invoked by another.");
					// New line for spacing
					System.out.println("");
					// Example of use(if needed)
					System.out.println("");
					break;
				
				// Keyword
				case "CALLING METHOD":
					// New line for spacing
					System.out.println("");
					// Definition of keyword
					System.out.println("CALLING METHOD - A term used to describe the relationship between two methods; a method that invokes another.");
					// New line for spacing
					System.out.println("");
					// Example of use(if needed)
					System.out.println("");
					break;
				
				// Keyword
				case "CAMEL CASE":
					// New line for spacing
					System.out.println("");
					// Definition of keyword
					System.out.println("CAMEL CASE - A naming style in which an identifier begins with a lowercase letter and subsequent words within the identifier are capitalized. Contrast with PASCAL CASING");
					// New line for spacing
					System.out.println("");
					// Example of use(if needed)
					System.out.println("CAMEL CASE");
					System.out.println("methodName");
					break;
				
				// Keyword
				case "CAPACITY":
					// New line for spacing
					System.out.println("");
					// Definition of keyword
					System.out.println("CAPACITY - An attribute of an ArrayList whose value is the number of items it can hold without having to increase its size. Also, with a StringBuild object, the actual length of the buffer, as opposed to that of the string contained in the buffer.");
					// New line for spacing
					System.out.println("");
					// Example of use(if needed)
					System.out.println("");
					break;
				
				// Keyword
				case "CASCADING STYLE SHEETS (CSS)":
					// New line for spacing
					System.out.println("");
					// Definition of keyword
					System.out.println("CASCADING STYLE SHEETS (CSS) - A language used for describing the presentation of a document written in a markup language.");
					// New line for spacing
					System.out.println("");
					// Example of use(if needed)
					System.out.println("");
					break;
				
				// Keyword
				case "CSS":
					// New line for spacing
					System.out.println("");
					// Definition of keyword
					System.out.println("CASCADING STYLE SHEETS - A language used for describing the presentation of a document written in a markup language.");
					// New line for spacing
					System.out.println("");
					// Example of use(if needed)
					System.out.println("");
					break;
				
				// Keyword
				case "CAST OPERATOR":
					// New line for spacing
					System.out.println("");
					// Definition of keyword
					System.out.println("CAST OPERATOR - An operator that performs an explicit type of converion; created by placing the desired result type in parentheses before the expression to be converted");
					// New line for spacing
					System.out.println("");
					// Example of use(if needed)
					System.out.println("");
					break;
				
				// Keyword
				case "CATCH BLOCK":
					// New line for spacing
					System.out.println("");
					// Definition of keyword
					System.out.println("CATCH BLOCK - A segment of code that can handle an exception that might be thrown by the \"try\" block that precedes it.");
					// New line for spacing
					System.out.println("");
					// Example of use(if needed)
					System.out.println("");
					break;
				
				// Keyword
				case "CATCH OR SPECIFY REQUIREMENT":
					// New line for spacing
					System.out.println("");
					// Definition of keyword
					System.out.println("CATCH OR SPECIFY REQUIREMENT - The Java rule that checkekd exceptions require catching or declaration.");
					// New line for spacing
					System.out.println("");
					// Example of use(if needed)
					System.out.println("");
					break;
				
				// Keyword
				case "CHAR":
					// New line for spacing
					System.out.println("");
					// Definition of keyword
					System.out.println("CHAR - Data Type that holds any single character.");
					// New line for spacing
					System.out.println("");
					// Example of use(if needed)
					System.out.println("");
					break;
				
				// Keyword
				case "CHARACTER":
					// New line for spacing
					System.out.println("");
					// Definition of keyword
					System.out.println("CHARACTER - Any letter, number or special symbol,such as (!@#$) that compromises data.");
					// New line for spacing
					System.out.println("");
					// Example of use(if needed)
					System.out.println("");
					break;
				
				// Keyword
				case "CHECK BOX":
					// New line for spacing
					System.out.println("");
					// Definition of keyword
					System.out.println("CHECK BOX - A GUI element with a label and a clickable square that frequently is used to turn an option on or off.");
					// New line for spacing
					System.out.println("");
					// Example of use(if needed)
					System.out.println("");
					break;
				
				// Keyword
				case "CHECKED EXCEPTIONS":
					// New line for spacing
					System.out.println("");
					// Definition of keyword
					System.out.println("CHECKED EXCEPTIONS - Exceptions that a programmer should plan for and from which a program should be able to recover. Contrast with UNCHECKED EXCEPTIONS");
					// New line for spacing
					System.out.println("");
					// Example of use(if needed)
					System.out.println("");
					break;
				
				// Keyword
				case "CHILD CLASS":
					// New line for spacing
					System.out.println("");
					// Definition of keyword
					System.out.println("CHILD CLASS - A derived class.");
					// New line for spacing
					System.out.println("");
					// Example of use(if needed)
					System.out.println("");
					break;
				
				// Keyword
				case "CLASS":
					// New line for spacing
					System.out.println("");
					// Definition of keyword
					System.out.println("CLASS - A group or collection of objects with common properties.");
					// New line for spacing
					System.out.println("");
					// Example of use(if needed)
					System.out.println("");
					break;
				
				// Keyword
				case "CLASS BODY":
					// New line for spacing
					System.out.println("");
					// Definition of keyword
					System.out.println("CLASS BODY - The set of data items and methods between the curly braces that follow the class header.");
					// New line for spacing
					System.out.println("");
					// Example of use(if needed)
					System.out.println("");
					break;
				
				// Keyword
				case "CLASS CLIENT":
					// New line for spacing
					System.out.println("");
					// Definition of keyword
					System.out.println("CLASS CLIENT - An application or class that instantiates objects of another class. See also CLASS USER.");
					// New line for spacing
					System.out.println("");
					// Example of use(if needed)
					System.out.println("");
					break;
				
				// Keyword
				case "CLASS DEFINITION":
					// New line for spacing
					System.out.println("");
					// Definition of keyword
					System.out.println("CLASS DEFINITION - A description of attributes and methods of objects instatiated from a class.");
					// New line for spacing
					System.out.println("");
					// Example of use(if needed)
					System.out.println("");
					break;
				
				// Keyword
				case "CLASS DIAGRAM":
					// New line for spacing
					System.out.println("");
					// Definition of keyword
					System.out.println("CLASS DIAGRAM - A visual tool that provides an overview of a class. It consists of a rectangle divided into three sections - the top section contains the name of the class, the middle section contains the names and data types of the attributes, and the bottom section contains the methods.");
					// New line for spacing
					System.out.println("");
					// Example of use(if needed)
					System.out.println("");
					break;
				
				// Keyword
				case "CLASS METHODS":
					// New line for spacing
					System.out.println("");
					// Definition of keyword
					System.out.println("CLASS METHODS - Static methods that do not have a \"this\" reference (because they have no objects associated with them).");
					// New line for spacing
					System.out.println("");
					// Example of use(if needed)
					System.out.println("");
					break;
				
				// Keyword
				case "CLASS USER":
					// New line for spacing
					System.out.println("");
					// Definition of keyword
					System.out.println("CLASS USER - An application or class that instantiates object of another prewritten class. See also CLASS CLIENT");
					// New line for spacing
					System.out.println("");
					// Example of use(if needed)
					System.out.println("");
					break;
				
				// Keyword
				case "CLASS VARIABLES":
					// New line for spacing
					System.out.println("");
					// Definition of keyword
					System.out.println("CLASS VARIABLE - Static variables that are shared by ever instantiations of a class.");
					// New line for spacing
					System.out.println("");
					// Example of use(if needed)
					System.out.println("");
					break;
				
				// Keyword
				case "CLASS-LEVEL JAVADOC COMMENTS":
					// New line for spacing
					System.out.println("");
					// Definition of keyword
					System.out.println("CLASS-LEVEL JAVADOC COMMENTS - Javadoc comments that proide a description of a class.");
					// New line for spacing
					System.out.println("");
					// Example of use(if needed)
					System.out.println("");
					break;
				
				// Keyword
				case "CLEAN BUILD":
					// New line for spacing
					System.out.println("");
					// Definition of keyword
					System.out.println("CLEAN BUILD - A compilation that is created after deleting a previously compiled version of a class.");
					// New line for spacing
					System.out.println("");
					// Example of use(if needed)
					System.out.println("");
					break;
				
				// Keyword
				case "CLOSE THE FILE":
					// New line for spacing
					System.out.println("");
					// Definition of keyword
					System.out.println("CLOSE THE FILE - To make a file no longer available to an application.");
					// New line for spacing
					System.out.println("");
					// Example of use(if needed)
					System.out.println("");
					break;
				
				// Keyword
				case "CLOSER IN SCOPE":
					// New line for spacing
					System.out.println("");
					// Definition of keyword
					System.out.println("CLOSER IN SCOPE - A term that describes the status of local variable over others that it shadows.");
					// New line for spacing
					System.out.println("");
					// Example of use(if needed)
					System.out.println("");
					break;
				
				// Keyword
				case "COLLISION":
					// New line for spacing
					System.out.println("");
					// Definition of keyword
					System.out.println("COLLISION - Describes a class naming conflict.");
					// New line for spacing
					System.out.println("");
					// Example of use(if needed)
					System.out.println("");
					break;
				
				// Keyword
				case "COMBO BOX":
					// New line for spacing
					System.out.println("");
					// Definition of keyword
					System.out.println("COMBO BOX - A GUI compponent that combines a display area showing a default option and a list of box containing additional options.");
					// New line for spacing
					System.out.println("");
					// Example of use(if needed)
					System.out.println("");
					break;
				
				// Keyword
				case "COMES INTO SCOPE":
					// New line for spacing
					System.out.println("");
					// Definition of keyword
					System.out.println("COMES INTO SCOPE - Describes what happens to a variable when it is declared. Contrast with GOES OUT OF SCOPE.");
					// New line for spacing
					System.out.println("");
					// Example of use(if needed)
					System.out.println("");
					break;
				
				// Keyword
				case "COMMA-SEPARATED VALUES (CSV)":
					// New line for spacing
					System.out.println("");
					// Definition of keyword
					System.out.println("COMMA-SEPARATED VALUES (CSV) - Fields that are separated with a comma.");
					// New line for spacing
					System.out.println("");
					// Example of use(if needed)
					System.out.println("");
					break;
				
				// Keyword
				case "CSV":
					// New line for spacing
					System.out.println("");
					// Definition of keyword
					System.out.println("COMMA-SEPARATED VALUES - Fields that are separated with a comma.");
					// New line for spacing
					System.out.println("");
					// Example of use(if needed)
					System.out.println("");
					break;
				
				// Keyword
				case "COMMANDS":
					// New line for spacing
					System.out.println("");
					// Definition of keyword
					System.out.println("COMMANDS - Program statements");
					// New line for spacing
					System.out.println("");
					// Example of use(if needed)
					System.out.println("");
					break;
				
				// Keyword
				case "COMMENT OUT":
					// New line for spacing
					System.out.println("");
					// Definition of keyword
					System.out.println("COMMENT OUT - The technique of turning a program statement into a comment so the compiler will not execute its command.");
					// New line for spacing
					System.out.println("");
					// Example of use(if needed)
					System.out.println("");
					break;
				
				// Keyword
				case "COMPARISON OPERATOR":
					// New line for spacing
					System.out.println("");
					// Definition of keyword
					System.out.println("COMPARISON OPERATOR - A relational operator.");
					// New line for spacing
					System.out.println("");
					// Example of use(if needed)
					System.out.println("");
					break;
				
				// Keyword
				case "COMPILE-TIME ERROR":
					// New line for spacing
					System.out.println("");
					// Definition of keyword
					System.out.println("COMPILE-TIME ERROR - An error for which the compiler detects a violation of language syntax rules and is unable to translate the source code to machine code.");
					// New line for spacing
					System.out.println("");
					// Example of use(if needed)
					System.out.println("");
					break;
				
				// Keyword
				case "COMPILER":
					// New line for spacing
					System.out.println("");
					// Definition of keyword
					System.out.println("COMPILER - A program that translates language statements into machine code, translating an entire program before executing it. Contrast with INTERPRETER.");
					// New line for spacing
					System.out.println("");
					// Example of use(if needed)
					System.out.println("");
					break;
				
				// Keyword
				case "COMPOSITION":
					// New line for spacing
					System.out.println("");
					// Definition of keyword
					System.out.println("COMPOSITION - Describes the relationship between classes when one class object is a data field in another class. Also sometimes more specifically a containment relationship between classes when an object of the contained class would cease to exist without a containing class. See also HAS-A RELATIONSHIP.");
					// New line for spacing
					System.out.println("");
					// Example of use(if needed)
					System.out.println("");
					break;
				
				// Keyword
				case "COMPOUND BOOLEAN EXPRESSION":
					// New line for spacing
					System.out.println("");
					// Definition of keyword
					System.out.println("COMPOUND BOOLEAN EXPRESSION - An expression that contains an AND or OR operator.(&& ||)");
					// New line for spacing
					System.out.println("");
					// Example of use(if needed)
					System.out.println("");
					break;
				
				// Keyword
				case "COMPOUND CONDITION":
					// New line for spacing
					System.out.println("");
					// Definition of keyword
					System.out.println("COMPOUND CONDITION - The condition that is tested in a compound boolean expression.");
					// New line for spacing
					System.out.println("");
					// Example of use(if needed)
					System.out.println("");
					break;
				
				// Keyword
				case "COMPUTER FILE":
					// New line for spacing
					System.out.println("");
					// Definition of keyword
					System.out.println("COMPUTER FILE - A collection of stored information in a computer system.");
					// New line for spacing
					System.out.println("");
					// Example of use(if needed)
					System.out.println("");
					break;
				
				// Keyword
				case "COMPUTER PROGRAM":
					// New line for spacing
					System.out.println("");
					// Definition of keyword
					System.out.println("COMPUTER PROGRAM - A set of instructions that tells a computer what to do; software.");
					// New line for spacing
					System.out.println("");
					// Example of use(if needed)
					System.out.println("");
					break;
				
				// Keyword
				case "COMPUTER SIMULATIONS":
					// New line for spacing
					System.out.println("");
					// Definition of keyword
					System.out.println("COMPUTER SIMULATIONS - Programs that attempt to mimic real-world activities so that their processes can be improved or so that users can better understand how the real-world processes operate.");
					// New line for spacing
					System.out.println("");
					// Example of use(if needed)
					System.out.println("");
					break;
				
				// Keyword
				case "CONCATENATED":
					// New line for spacing
					System.out.println("");
					// Definition of keyword
					System.out.println("CONCATENATED - Describes values that are added onto the end of another value.");
					// New line for spacing
					System.out.println("");
					// Example of use(if needed)
					System.out.println("");
					break;
				
				// Keyword
				case "CONCATENATION":
					// New line for spacing
					System.out.println("");
					// Definition of keyword
					System.out.println("CONCATENATION - The process of joining a variable to a string to create a longer string.");
					// New line for spacing
					System.out.println("");
					// Example of use(if needed)
					System.out.println("");
					break;
				
				// Keyword
				case "CONCRETE CLASS":
					// New line for spacing
					System.out.println("");
					// Definition of keyword
					System.out.println("CONCRETE CLASS - A nonabstract class from which objects can be instantiated. Contrast with ABSTRACT CLASS");
					// New line for spacing
					System.out.println("");
					// Example of use(if needed)
					System.out.println("");
					break;
				
				// Keyword
				case "CONDITIONAL OPERATOR":
					// New line for spacing
					System.out.println("");
					// Definition of keyword
					System.out.println("CONDITIONAL OPERATOR - An operator that requires three expressions separated with a question mark and a colon; the operator is used as an abbreviated version of the \"if...else\" structure.");
					// New line for spacing
					System.out.println("");
					// Example of use(if needed)
					System.out.println("");
					break;
				
				// Keyword
				case "CONFIRM DIALOG BOX":
					// New line for spacing
					System.out.println("");
					// Definition of keyword
					System.out.println("CONFIRM DIALOG BOX - A window that can be created using the showConfirmDialog() method in the JOptionPane class and that displays the options \"Yes, No, and Cancel\".");
					// New line for spacing
					System.out.println("");
					// Example of use(if needed)
					System.out.println("");
					break;
				
				// Keyword
				case "CONSOLE APPLICATIONS":
					// New line for spacing
					System.out.println("");
					// Definition of keyword
					System.out.println("CONSOLE APPLICATIONS - Programs that support character or text output to a computer screen.");
					// New line for spacing
					System.out.println("");
					// Example of use(if needed)
					System.out.println("");
					break;
				
				// Keyword
				case "CONSTANT":
					// New line for spacing
					System.out.println("");
					// Definition of keyword
					System.out.println("CONSTANT - Describes values that cannot be changed during the execution of an application.");
					// New line for spacing
					System.out.println("");
					// Example of use(if needed)
					System.out.println("");
					break;
				
				// Keyword
				case "CONSTRUCTOR":
					// New line for spacing
					System.out.println("");
					// Definition of keyword
					System.out.println("CONSTRUCTOR - A method that establishes an object.");
					// New line for spacing
					System.out.println("");
					// Example of use(if needed)
					System.out.println("");
					break;
				
				// Keyword
				case "CONTAINER":
					// New line for spacing
					System.out.println("");
					// Definition of keyword
					System.out.println("CONTAINER - A type of component that holds other components so they can be treated as a single entity.");
					// New line for spacing
					System.out.println("");
					// Example of use(if needed)
					System.out.println("");
					break;
				
				// Keyword
				case "CONTAINMENT":
					// New line for spacing
					System.out.println("");
					// Definition of keyword
					System.out.println("CONTAINMENT - The relationship between classes when one class contains fields that are members of another class. See HAS-A RELATIONSHIP, COMPOSITION, AGGREGATION.");
					// New line for spacing
					System.out.println("");
					// Example of use(if needed)
					System.out.println("");
					break;
				
				// Keyword
				case "COUNTED LOOP":
					// New line for spacing
					System.out.println("");
					// Definition of keyword
					System.out.println("COUNTED LOOP  - A definite loop.");
					// New line for spacing
					System.out.println("");
					// Example of use(if needed)
					System.out.println("");
					break;
				
				// Keyword
				case "COUNTER-CONTROLLED LOOP":
					// New line for spacing
					System.out.println("");
					// Definition of keyword
					System.out.println("COUNTER-CONTROLLED LOOP - A definite loop. Contrast with EVENT-CONTROLLED LOOP.");
					// New line for spacing
					System.out.println("");
					// Example of use(if needed)
					System.out.println("");
					break;
				
				// Keyword
				case "COUNTING":
					// New line for spacing
					System.out.println("");
					// Definition of keyword
					System.out.println("COUNTING - The process of continually incrementing a variable to keep track of the number of occurrences of the some event.");
					// New line for spacing
					System.out.println("");
					// Example of use(if needed)
					System.out.println("");
					break;
				
				// Keyword
				case "CRASH":
					// New line for spacing
					System.out.println("");
					// Definition of keyword
					System.out.println("CRASH - A premature, unexpected, and inelegant end to a program.");
					// New line for spacing
					System.out.println("");
					// Example of use(if needed)
					System.out.println("");
					break;
				
				// Keyword
				case "CROSS-PLATFORM DEVELOPMENT":
					// New line for spacing
					System.out.println("");
					// Definition of keyword
					System.out.println("CROSS-PLATFORM DEVELOPMENT - The development of mobile applications that can be used on a variety of platforms.");
					// New line for spacing
					System.out.println("");
					// Example of use(if needed)
					System.out.println("");
					break;

				/*----------------------- LETTER D -----------------------------*/
				// Keyword
				case "DATA FIELDS":
					// New line for spacing
					System.out.println("");
					// Definition of keyword
					System.out.println("DATA FIELDS - Data variables declased in a class outside of any method.");
					// New line for spacing
					System.out.println("");
					// Example of use(if needed)
					System.out.println("");
					break;
				
				// Keyword
				case "DATA FILES":
					// New line for spacing
					System.out.println("");
					// Definition of keyword
					System.out.println("DATA FILES - Files that consist of related records that contain facts and figures, such as employee numbers, names, and salaries");
					// New line for spacing
					System.out.println("");
					// Example of use(if needed)
					System.out.println("");
					break;
				
				// Keyword
				case "DATA TYPE":
					// New line for spacing
					System.out.println("");
					// Definition of keyword
					System.out.println("DATA TYPE - Describes the type of data that can be stored in a variable, how much memory the item occupies, and what types of operations can be performed on the data.");
					// New line for spacing
					System.out.println("");
					// Example of use(if needed)
					System.out.println("");
					break;
				
				// Keyword
				case "DEAD CODE":
					// New line for spacing
					System.out.println("");
					// Definition of keyword
					System.out.println("DEAD CODE - Statements that cannot be executed because the logical path can neveer encounter them; in some languages, including Java an unreachable statement causes a compilers error. Also called UNREACHABLE STATEMENTS.");
					// New line for spacing
					System.out.println("");
					// Example of use(if needed)
					System.out.println("");
					break;
				
				// Keyword
				case "DEBUGGING":
					// New line for spacing
					System.out.println("");
					// Definition of keyword
					System.out.println("DEBUGGING - The process of locating and repairing a programs errors.");
					// New line for spacing
					System.out.println("");
					// Example of use(if needed)
					System.out.println("");
					break;
				
				// Keyword
				case "DECIMAL NUMBERING SYSTEM":
					// New line for spacing
					System.out.println("");
					// Definition of keyword
					System.out.println("DECIMAL NUMBERING SYSTEM - The numbering system based on 10 digits, 0-9, in which each column value is 10 rimes the value of the column to its right.");
					// New line for spacing
					System.out.println("");
					// Example of use(if needed)
					System.out.println("");
					break;
				
				// Keyword
				case "DECISION STRUCTURE":
					// New line for spacing
					System.out.println("");
					// Definition of keyword
					System.out.println("DECISION STRUCTURE - A logical structure that involves choosing between alternative courses of action based on some value within a program.");
					// New line for spacing
					System.out.println("");
					// Example of use(if needed)
					System.out.println("");
					break;
				
				// Keyword
				case "DECLARATION":
					// New line for spacing
					System.out.println("");
					// Definition of keyword
					System.out.println("DECLARATION - Another name for a method header; also, the statement that assigns a data type and indentifier to a variable.");
					// New line for spacing
					System.out.println("");
					// Example of use(if needed)
					System.out.println("");
					break;
				
				// Keyword
				case "DECLARATIVE LANGUAGE":
					// New line for spacing
					System.out.println("");
					// Definition of keyword
					System.out.println("DECLARATIVE LANGUAGE - A high-level language that defines the desired result without explicitly listing the commands or steps needed to achieve it.");
					// New line for spacing
					System.out.println("");
					// Example of use(if needed)
					System.out.println("");
					break;
				
				// Keyword
				case "DECREMENTING":
					// New line for spacing
					System.out.println("");
					// Definition of keyword
					System.out.println("DECREMENTING - The act of subtracting 1 from a variable.");
					// New line for spacing
					System.out.println("");
					// Example of use(if needed)
					System.out.println("");
					break;
				
				// Keyword
				case "DEFAULT CONSTRUCTOR":
					// New line for spacing
					System.out.println("");
					// Definition of keyword
					System.out.println("DEFAULT CONSTRUCTOR - A constructor that requires no arguments.");
					// New line for spacing
					System.out.println("");
					// Example of use(if needed)
					System.out.println("");
					break;
				
				// Keyword
				case "DEFAULT PACKAGE":
					// New line for spacing
					System.out.println("");
					// Definition of keyword
					System.out.println("DEFAULT PACKAGE - The unnamed package in which a class is placed if no package is specified.");
					// New line for spacing
					System.out.println("");
					// Example of use(if needed)
					System.out.println("");
					break;
				
				// Keyword
				case "DEFINITE LOOP":
					// New line for spacing
					System.out.println("");
					// Definition of keyword
					System.out.println("DEFINITE LOOP - A loop that excutesa predetermined number of times; a counted loop. Contrast with INDEFINITE LOOP.");
					// New line for spacing
					System.out.println("");
					// Example of use(if needed)
					System.out.println("");
					break;
				
				// Keyword
				case "DERIVED CLASS":
					// New line for spacing
					System.out.println("");
					// Definition of keyword
					System.out.println("DERIVED CLASS - A class that inherits from a base class.");
					// New line for spacing
					System.out.println("");
					// Example of use(if needed)
					System.out.println("");
					break;
				
				// Keyword
				case "DESCENDING ORDER":
					// New line for spacing
					System.out.println("");
					// Definition of keyword
					System.out.println("DESCENDING ORDER - The order of objects arranged from highest to lowest values. See also ASCENDING ORDER.");
					// New line for spacing
					System.out.println("");
					// Example of use(if needed)
					System.out.println("");
					break;
				
				// Keyword
				case "DEVELOPMENT ENVIRONMENT":
					// New line for spacing
					System.out.println("");
					// Definition of keyword
					System.out.println("DEVELOPMENT ENVIRONMENT - A set of tools that helps programmers by providing such features as displaying a language's keywords in color.");
					// New line for spacing
					System.out.println("");
					// Example of use(if needed)
					System.out.println("DEVELOPMENT ENVIRONMENT");
					System.out.println("Sublime,Notepad++, VS Code, Brackets, Atom, Etc.");
					break;
				
				// Keyword
				case "DIALOG BOX":
					// New line for spacing
					System.out.println("");
					// Definition of keyword
					System.out.println("DIALOG BOX - A GUI object resembling a window that displays messages.");
					// New line for spacing
					System.out.println("");
					// Example of use(if needed)
					System.out.println("");
					break;
				
				// Keyword
				case "DIRECT ACCESS FILES":
					// New line for spacing
					System.out.println("");
					// Definition of keyword
					System.out.println("DIRECT ACCESS FILES - Random access files.");
					// New line for spacing
					System.out.println("");
					// Example of use(if needed)
					System.out.println("");
					break;
				
				// Keyword
				case "DIRECTORIES":
					// New line for spacing
					System.out.println("");
					// Definition of keyword
					System.out.println("DIRECTORIES - Elements in a storage organization hierarchy. See also FOLDERS.");
					// New line for spacing
					System.out.println("");
					// Example of use(if needed)
					System.out.println("");
					break;
				
				// Keyword
				case "DIVIDE AND ASSIGN OPERATOR":
					// New line for spacing
					System.out.println("");
					// Definition of keyword
					System.out.println("DIVIDE AND ASSIGN OPERATOR - An operator that alters the value of the operand on the left by dividing the operand on the right into it. composed of a forward slash and an equal sign(/=).");
					// New line for spacing
					System.out.println("");
					// Example of use(if needed)
					System.out.println("");
					break;
				
				// Keyword
				case "DOCUMENTATION COMMENTS":
					// New line for spacing
					System.out.println("");
					// Definition of keyword
					System.out.println("DOCUMENTATION COMMENTS - Comments that atomatically generate well formatted program documentation.");
					// New line for spacing
					System.out.println("");
					// Example of use(if needed)
					System.out.println("");
					break;
				
				// Keyword
				case "DO-NOTHING LOOP":
					// New line for spacing
					System.out.println("");
					// Definition of keyword
					System.out.println("DO-NOTHING LOOP - A loop that performs no actions other than looping.");
					// New line for spacing
					System.out.println("");
					// Example of use(if needed)
					System.out.println("");
					break;
				
				// Keyword
				case "DO...WHILE LOOP":
					// New line for spacing
					System.out.println("");
					// Definition of keyword
					System.out.println("DO...WHILE LOOP - A loop that executes a loop body at least one time; it checks the loop control variable at the bottom of the loop after one repetition has occurred.");
					// New line for spacing
					System.out.println("");
					// Example of use(if needed)
					System.out.println("");
					break;
				
				// Keyword
				case "DOUBLE":
					// New line for spacing
					System.out.println("");
					// Definition of keyword
					System.out.println("DOUBLE - Data type that can hold a floating-point value up to 14 or 15 significant digits of accuracy. Contrast with FLOAT.");
					// New line for spacing
					System.out.println("");
					// Example of use(if needed)
					System.out.println("");
					break;
				
				// Keyword
				case "DOUBLE-PRCISION FLOATING-POINT NUMBER":
					// New line for spacing
					System.out.println("");
					// Definition of keyword
					System.out.println("DOUBLE-PRCISION FLOATING-POINT NUMBER - A type of value that is stored in a DOUBLE.");
					// New line for spacing
					System.out.println("");
					// Example of use(if needed)
					System.out.println("");
					break;
				
				// Keyword
				case "DRAG AND DROP":
					// New line for spacing
					System.out.println("");
					// Definition of keyword
					System.out.println("DRAG AND DROP - A development technique in which the programmer can use a mouse or touch screen to move a component from one part of screen to another.");
					// New line for spacing
					System.out.println("");
					// Example of use(if needed)
					System.out.println("");
					break;
				
				// Keyword
				case "DUAL-ALTERNATIVE SELECTION":
					// New line for spacing
					System.out.println("");
					// Definition of keyword
					System.out.println("DUAL-ALTERNATIVE SELECTION - A selection that results in one of two possible courses of action.");
					// New line for spacing
					System.out.println("");
					// Example of use(if needed)
					System.out.println("");
					break;
				
				// Keyword
				case "DUMMY VALUE":
					// New line for spacing
					System.out.println("");
					// Definition of keyword
					System.out.println("DUMMY VALUE - A value the user enters that is not real data, but just signals to stop data entry.");
					// New line for spacing
					System.out.println("");
					// Example of use(if needed)
					System.out.println("");
					break;
				
				// Keyword
				case "DYNAMIC METHOD BINDING":
					// New line for spacing
					System.out.println("");
					// Definition of keyword
					System.out.println("DYNAMIC METHOD BINDING - The ability of an application to slect the correct subclass method when the program executes. See also LATE METHOD BINDING.");
					// New line for spacing
					System.out.println("");
					// Example of use(if needed)
					System.out.println("");
					break;
				
				// Keyword
				case "DYNAMICALLY RESIZABLE":
					// New line for spacing
					System.out.println("");
					// Definition of keyword
					System.out.println("DYNAMICALLY RESIZABLE - Describes an object whose size can change during the program execution.");
					// New line for spacing
					System.out.println("");
					// Example of use(if needed)
					System.out.println("");
					break;
				
				/*----------------------- LETTER E -----------------------------*/
				// Keyword
				case "EDITABLE":
					// New line for spacing
					System.out.println("");
					// Definition of keyword
					System.out.println("EDITABLE - Desrcibes a component that can accept keystrokes.");
					// New line for spacing
					System.out.println("");
					// Example of use(if needed)
					System.out.println("");
					break;

				// Keyword
				case "EFFECTIVELY FINAL VARIABLE":
					// New line for spacing
					System.out.println("");
					// Definition of keyword
					System.out.println("EFFECTIVELY FINAL VARIABLE - A variable whose value is assigned only once.");
					// New line for spacing
					System.out.println("");
					// Example of use(if needed)
					System.out.println("");
					break;
					
				// Keyword
				case "ELEMENT":
					// New line for spacing
					System.out.println("");
					// Definition of keyword
					System.out.println("ELEMENT - One variable or object in an array.");
					// New line for spacing
					System.out.println("");
					// Example of use(if needed)
					System.out.println("");
					break;
					
				// Keyword
				case "ELSE CLAUSE":
					// New line for spacing
					System.out.println("");
					// Definition of keyword
					System.out.println("ELSE CLAUSE - The part of an \"if...else\" statement that executes when the evaluated boolean expression is false.");
					// New line for spacing
					System.out.println("");
					// Example of use(if needed)
					System.out.println("");
					break;
					
				// Keyword
				case "ELSE...IF CLAUSE":
					// New line for spacing
					System.out.println("");
					// Definition of keyword
					System.out.println("ELSE...IF CLAUSE - A format used in nested if statements in which each instance of \"else\" and its subsequent \"if\" are placed on the same line.");
					// New line for spacing
					System.out.println("");
					// Example of use(if needed)
					System.out.println("");
					break;
					
				// Keyword
				case "EMPTY BODY":
					// New line for spacing
					System.out.println("");
					// Definition of keyword
					System.out.println("EMPTY BODY - A block with no statements in it.");
					// New line for spacing
					System.out.println("");
					// Example of use(if needed)
					System.out.println("");
					break;
					
				// Keyword
				case "EMPTY STATEMENT":
					// New line for spacing
					System.out.println("");
					// Definition of keyword
					System.out.println("EMTPY STATEMENT - A statement that contains only a semicolon.");
					// New line for spacing
					System.out.println("");
					// Example of use(if needed)
					System.out.println("");
					break;
					
				// Keyword
				case "ENCAPSULATION":
					// New line for spacing
					System.out.println("");
					// Definition of keyword
					System.out.println("ENCAPSULATION - The act of hding data and methods within an object.");
					// New line for spacing
					System.out.println("");
					// Example of use(if needed)
					System.out.println("");
					break;
					
				// Keyword
				case "ENHANCED FOR LOOP":
					// New line for spacing
					System.out.println("");
					// Definition of keyword
					System.out.println("ENHANCED FOR LOOP - A language construct that cycles through an array without specifying the starting  and ending points for the loop control variable.");
					// New line for spacing
					System.out.println("");
					// Example of use(if needed)
					System.out.println("");
					break;
					
				// Keyword
				case "ENUM CONSTANTS":
					// New line for spacing
					System.out.println("");
					// Definition of keyword
					System.out.println("ENUM CONSTANTS - The allowed values for an enumerated data type.");
					// New line for spacing
					System.out.println("");
					// Example of use(if needed)
					System.out.println("");
					break;
					
				// Keyword
				case "ENUMERATED DATA TYPE":
					// New line for spacing
					System.out.println("");
					// Definition of keyword
					System.out.println("ENUMERATED DATA TYPE - A programmer-created data type with a fixed set of values.");
					// New line for spacing
					System.out.println("");
					// Example of use(if needed)
					System.out.println("");
					break;
					
				// Keyword
				case "EQUIVALENCY OPERATOR":
					// New line for spacing
					System.out.println("");
					// Definition of keyword
					System.out.println("EQUIVALENCY OPERATOR - The operator composed of two equal signs that compares values and returns \"true\" if they are equal.");
					// New line for spacing
					System.out.println("");
					// Example of use(if needed)
					System.out.println("");
					break;
					
				// Keyword
				case "ESCAPE SEQUENCE":
					// New line for spacing
					System.out.println("");
					// Definition of keyword
					System.out.println("ESCAPE SEQUENCE - A sequence that begins with a backslash followed by a character; the pair frequently represent a nonprinting character.");
					// New line for spacing
					System.out.println("");
					// Example of use(if needed)
					System.out.println("ESCAPE SEQUENCE");
					System.out.println("new line: \"\\n\"");
					break;
					
				// Keyword
				case "EVENT":
					// New line for spacing
					System.out.println("");
					// Definition of keyword
					System.out.println("EVENT - A result when a user takes action on a component.");
					// New line for spacing
					System.out.println("");
					// Example of use(if needed)
					System.out.println("");
					break;
					
				// Keyword
				case "EVENT-CONTROLLED LOOP":
					// New line for spacing
					System.out.println("");
					// Definition of keyword
					System.out.println("EVENT-CONTROLLED LOOP - An indefinite loop which the number of executions is determined by the user actions. Contrast with COUNTER-CONTROLLED LOOP.");
					// New line for spacing
					System.out.println("");
					// Example of use(if needed)
					System.out.println("");
					break;
					
				// Keyword
				case "EVENT-DRIVEN PROGRAM":
					// New line for spacing
					System.out.println("");
					// Definition of keyword
					System.out.println("EVENT-DRIVEN PROGRAM - A program in which the user might initiate any number of event in any order.");
					// New line for spacing
					System.out.println("");
					// Example of use(if needed)
					System.out.println("");
					break;
					
				// Keyword
				case "EVENT HANDLER":
					// New line for spacing
					System.out.println("");
					// Definition of keyword
					System.out.println("EVENT HANDLER - A method that executes because it is called automatically when appropriate event occurs.");
					// New line for spacing
					System.out.println("");
					// Example of use(if needed)
					System.out.println("");
					break;
					
				// Keyword
				case "EXCEPTION":
					// New line for spacing
					System.out.println("");
					// Definition of keyword
					System.out.println("EXCEPTION - In object-oriented terminology, an unexpected or error condition.");
					// New line for spacing
					System.out.println("");
					// Example of use(if needed)
					System.out.println("");
					break;
					
				// Keyword
				case "EXCEPTION HANDLING":
					// New line for spacing
					System.out.println("");
					// Definition of keyword
					System.out.println("EXCEPTION HANDLING - An object-oriented technique for managing or resolving errors.");
					// New line for spacing
					System.out.println("");
					// Example of use(if needed)
					System.out.println("");
					break;
					
				// Keyword
				case "EXCEPTION SPECIFICATION":
					// New line for spacing
					System.out.println("");
					// Definition of keyword
					System.out.println("EXCEPTION SPECIFICATION - The practice of using the keyword \"throws\" followed by an \"Exception\" type in the method header; required when a method throws a checked \"Exception\" that it will not catch but will be caught by a different method.");
					// New line for spacing
					System.out.println("");
					// Example of use(if needed)
					System.out.println("");
					break;
					
				// Keyword
				case "EXECUTING":
					// New line for spacing
					System.out.println("");
					// Definition of keyword
					System.out.println("EXECUTING - The ace of carrying out a program statement or program.");
					// New line for spacing
					System.out.println("");
					// Example of use(if needed)
					System.out.println("");
					break;
					
				// Keyword
				case "EXPLICIT CONVERSION":
					// New line for spacing
					System.out.println("");
					// Definition of keyword
					System.out.println("EXPLICIT CONVERSION - The data type transformation caused by using a cast operator.");
					// New line for spacing
					System.out.println("");
					// Example of use(if needed)
					System.out.println("");
					break;
					
				// Keyword
				case "EXTENDED":
					// New line for spacing
					System.out.println("");
					// Definition of keyword
					System.out.println("EXTENDED - Describes classes that have descended from another class.");
					// New line for spacing
					System.out.println("");
					// Example of use(if needed)
					System.out.println("");
					break;
					
				// Keyword
				case "EXTENDS":
					// New line for spacing
					System.out.println("");
					// Definition of keyword
					System.out.println("EXTENDS - A keyword used to achieve inheritance in Java.");
					// New line for spacing
					System.out.println("");
					// Example of use(if needed)
					System.out.println("");
					break;
				
				/*----------------------- LETTER F -----------------------------*/
				// Keyword
				case "FACTORY METHODS":
					// New line for spacing
					System.out.println("");
					// Definition of keyword
					System.out.println("FACTORY METHODS - Methods that assist in object creation.");
					// New line for spacing
					System.out.println("");
					// Example of use(if needed)
					System.out.println("");
					break;
					
				// Keyword
				case "FAQs":
					// New line for spacing
					System.out.println("");
					// Definition of keyword
					System.out.println("FAQs - acronym for frequently Asked Questions.");
					// New line for spacing
					System.out.println("");
					// Example of use(if needed)
					System.out.println("");
					break;
					
				// Keyword
				case "FAULT-TOLERANT":
					// New line for spacing
					System.out.println("");
					// Definition of keyword
					System.out.println("FAULT-TOLERANT - Describes applications that are designed so that they continue to operate, possible at a reduced leve, when some part of the systems fails.");
					// New line for spacing
					System.out.println("");
					// Example of use(if needed)
					System.out.println("");
					break;
					
				// Keyword
				case "FIELD":
					// New line for spacing
					System.out.println("");
					// Definition of keyword
					System.out.println("FIELD - A data variable declared in a class outside of any method; in reference to storage, a group of characters that has some meaning.");
					// New line for spacing
					System.out.println("");
					// Example of use(if needed)
					System.out.println("");
					break;
					
				// Keyword
				case "FILE CHANNEL":
					// New line for spacing
					System.out.println("");
					// Definition of keyword
					System.out.println("FILE CHANNEL - An object that is an avenue for reading and writing a file.");
					// New line for spacing
					System.out.println("");
					// Example of use(if needed)
					System.out.println("");
					break;
					
				// Keyword
				case "FINAL":
					// New line for spacing
					System.out.println("");
					// Definition of keyword
					System.out.println("FINAL - The keyword that precedes named constants, that describes superclass methods that cannot be overridden in a subclass, and that describes classes in which all methods are final.");
					// New line for spacing
					System.out.println("");
					// Example of use(if needed)
					System.out.println("FINAL");
					System.out.println("final String NAMED_CONSTANT = \"Named Constant\";");
					break;
					
				// Keyword
				case "FINALLY BLOCK":
					// New line for spacing
					System.out.println("");
					// Definition of keyword
					System.out.println("FINALLY BLOCK - A block of code that executes at the end of a \"try...catch\" sequence.");
					// New line for spacing
					System.out.println("");
					// Example of use(if needed)
					System.out.println("");
					break;
						
				// Keyword
				case "FIXED METHOD BINDING":
					// New line for spacing
					System.out.println("");
					// Definition of keyword
					System.out.println("FIXED METHOD BINDING - The opposite of dynamic method binding; occurs when a subclass method is selected while the program compiles rather than while its running, See also STATIC METHOD BINDING.");
					// New line for spacing
					System.out.println("");
					// Example of use(if needed)
					System.out.println("");
					break;
						
				// Keyword
				case "FLAG":
					// New line for spacing
					System.out.println("");
					// Definition of keyword
					System.out.println("FLAG - A variable that holds a value (often \"true\" or \"false\") to indicate whether some condition has been met.");
					// New line for spacing
					System.out.println("");
					// Example of use(if needed)
					System.out.println("");
					break;
						
				// Keyword
				case "FLOAT":
					// New line for spacing
					System.out.println("");
					// Definition of keyword
					System.out.println("FLOAT - Data type that holds a floating-point value of up to sic or seven significant digits of accuracy. Contrast with DOUBLE.");
					// New line for spacing
					System.out.println("");
					// Example of use(if needed)
					System.out.println("");
					break;
						
				// Keyword
				case "FLOATING-POINT":
					// New line for spacing
					System.out.println("");
					// Definition of keyword
					System.out.println(" FLOATING-POINT - Describes a number that contains decimal positions.");
					// New line for spacing
					System.out.println("");
					// Example of use(if needed)
					System.out.println("");
					break;
					
				// Keyword
				case "FLOATING-POINT DIVISION":
					// New line for spacing
					System.out.println("");
					// Definition of keyword
					System.out.println("FLOATING-POINT DIVISION - The operation in which two values are divided and either or bother are floating-point values.");
					// New line for spacing
					System.out.println("");
					// Example of use(if needed)
					System.out.println("");
					break;
						
				// Keyword
				case "FLOW LAYOUT MANAGER":
					// New line for spacing
					System.out.println("");
					// Definition of keyword
					System.out.println("FLOW LAYOUT MANAGER - A layout manager that places components in rows; when any row is filled, additional components automatically pill into the next row.");
					// New line for spacing
					System.out.println("");
					// Example of use(if needed)
					System.out.println("");
					break;
						
				// Keyword
				case "FLOWCHART":
					// New line for spacing
					System.out.println("");
					// Definition of keyword
					System.out.println("FLOWCHART - A tool that helps programmers plan a program's logic by writing the steps in diagram form, as a series of shapes connected by arrows.");
					// New line for spacing
					System.out.println("");
					// Example of use(if needed)
					System.out.println("");
					break;
						
				// Keyword
				case "FLUSHING":
					// New line for spacing
					System.out.println("");
					// Definition of keyword
					System.out.println("FLUSHING - An operation to clear bytes that have been sent to a buffer for output but that have not yet been output to a hardware device.");
					// New line for spacing
					System.out.println("");
					// Example of use(if needed)
					System.out.println("");
					break;
					
				// Keyword
				case "FOLDERS":
					// New line for spacing
					System.out.println("");
					// Definition of keyword
					System.out.println("FOLDERS - Elements in a storage organization hierarchy. See also DIRECTORIES");
					// New line for spacing
					System.out.println("");
					// Example of use(if needed)
					System.out.println("");
					break;
					
				// Keyword
				case "FONT":
					// New line for spacing
					System.out.println("");
					// Definition of keyword
					System.out.println("FONT - The size, weight, and style of a typeface.");
					// New line for spacing
					System.out.println("");
					// Example of use(if needed)
					System.out.println("");
					break;
					
				// Keyword
				case "FOR LOOP":
					// New line for spacing
					System.out.println("");
					// Definition of keyword
					System.out.println("FOR LOOP - A loop that can be used when a definite number of loop iterations is required.");
					// New line for spacing
					System.out.println("");
					// Example of use(if needed)
					System.out.println("");
					break;
					
				// Keyword
				case "FOREACH LOOP":
					// New line for spacing
					System.out.println("");
					// Definition of keyword
					System.out.println("FOREACH LOOP - The enhanced FOR LOOP");
					// New line for spacing
					System.out.println("");
					// Example of use(if needed)
					System.out.println("");
					break;
					
				// Keyword
				case "FORMAL PARAMETERS":
					// New line for spacing
					System.out.println("");
					// Definition of keyword
					System.out.println("FORMAL PARAMETERS - The variables in a method declaration that accepts the values from actual parameters. Contrast with ACTUAL PARAMETERS.");
					// New line for spacing
					System.out.println("");
					// Example of use(if needed)
					System.out.println("");
					break;
					
				// Keyword
				case "FORMAT SPECIFIER":
					// New line for spacing
					System.out.println("");
					// Definition of keyword
					System.out.println("FORMAT SPECIFIER - In a \"printf()\" statement, a placeholder for a numeric value.");
					// New line for spacing
					System.out.println("");
					// Example of use(if needed)
					System.out.println("");
					break;
					
				// Keyword
				case "FORMAT STRING":
					// New line for spacing
					System.out.println("");
					// Definition of keyword
					System.out.println("FORMAT STRING - In a \"printf()\" statement, a string of characters that includes optional text (that is displayed literally) and one or more format specifiers.");
					// New line for spacing
					System.out.println("");
					// Example of use(if needed)
					System.out.println("");
					break;
					
				// Keyword
				case "FRAGILE":
					// New line for spacing
					System.out.println("");
					// Definition of keyword
					System.out.println("FRAGILE - describes classes that are prone to errors.");
					// New line for spacing
					System.out.println("");
					// Example of use(if needed)
					System.out.println("");
					break;
					
				// Keyword
				case "FRAME":
					// New line for spacing
					System.out.println("");
					// Definition of keyword
					System.out.println("FRAME - A GUI component that is simliar to a window, but that has a title bar and border.");
					// New line for spacing
					System.out.println("");
					// Example of use(if needed)
					System.out.println("");
					break;
					
				// Keyword
				case "FULLY QUALIFIED IDENTIFIER":
					// New line for spacing
					System.out.println("");
					// Definition of keyword
					System.out.println("FULLY QUALIFIED IDENTIFIER - Describes a filename that includes the hierarchy in which a class is stored.");
					// New line for spacing
					System.out.println("");
					// Example of use(if needed)
					System.out.println("");
					break;
					
				// Keyword
				case "FUNCTION":
					// New line for spacing
					System.out.println("");
					// Definition of keyword
					System.out.println("FUNCTION - A method with no side effects, in some programming languages.");
					// New line for spacing
					System.out.println("");
					// Example of use(if needed)
					System.out.println("");
					break;
					
				// Keyword
				case "FUNCTIONAL INTERFACE":
					// New line for spacing
					System.out.println("");
					// Definition of keyword
					System.out.println("FUNCTIONAL INTERFACE - An interface that contains just one abstract method.");
					// New line for spacing
					System.out.println("");
					// Example of use(if needed)
					System.out.println("");
					break;
					
				// Keyword
				case "FUNDAMENTAL CLASSES":
					// New line for spacing
					System.out.println("");
					// Definition of keyword
					System.out.println("FUNDAMENTAL CLASSES - Basic classes contained in java.lang package that are imported automatically into every program. Contrast with OPTIONAL CLASSES.");
					// New line for spacing
					System.out.println("");
					// Example of use(if needed)
					System.out.println("");
					break;
					
				// Keyword
				case "FXML":
					// New line for spacing
					System.out.println("");
					// Definition of keyword
					System.out.println("FXML -  An XML-based, declarative markup language used by JavaFX to define user interfaces.");
					// New line for spacing
					System.out.println("");
					// Example of use(if needed)
					System.out.println("");
					break;
				/*----------------------- LETTER G -----------------------------*/
				// Keyword
				case "GARBAGE VALUE":
					// New line for spacing
					System.out.println("");
					// Definition of keyword
					System.out.println("GARBAGE VALUE - The unknown value stored in an uninitialized variable.");
					// New line for spacing
					System.out.println("");
					// Example of use(if needed)
					System.out.println("");
					break;
				
				// Keyword
				case "GENERIC PROGRAMMING":
					// New line for spacing
					System.out.println("");
					// Definition of keyword
					System.out.println("GENERIC PROGRAMMING - A feature of languages that allows method to be used safely with multiple data types.");
					// New line for spacing
					System.out.println("");
					// Example of use(if needed)
					System.out.println("");
					break;
				
				// Keyword
				case "GOES OUT OF SCOPE":
					// New line for spacing
					System.out.println("");
					// Definition of keyword
					System.out.println("GOES OUT OF SCOPE - describes what happens to a variable at the end of the block in which it is declared. Contrast with COMES INTO SCOPE.");
					// New line for spacing
					System.out.println("");
					// Example of use(if needed)
					System.out.println("");
					break;
				
				// Keyword
				case "GRAPHICAL USER INTERFACES (GUI)":
					// New line for spacing
					System.out.println("");
					// Definition of keyword
					System.out.println("GRAPHICAL USER INTERFACES (GUI) - Environments that allows user to interact with a program in a graphical environment.");
					// New line for spacing
					System.out.println("");
					// Example of use(if needed)
					System.out.println("");
					break;
				
				// Keyword
				case "GUI":
					// New line for spacingS
					System.out.println("");
					// Definition of keyword
					System.out.println("GUI - Environments that allows user to interact with a program in a graphical environment.");
					// New line for spacing
					System.out.println("");
					// Example of use(if needed)
					System.out.println("");
					break;
				
				// Keyword
				case "GUI COMPONENTS":
					// New line for spacing
					System.out.println("");
					// Definition of keyword
					System.out.println("GUI COMPONENTS - Graphical user interface components, such as buttons and text fields with which the user can interact.");
					// New line for spacing
					System.out.println("");
					// Example of use(if needed)
					System.out.println("");
					break;
				
				/*----------------------- LETTER H -----------------------------*/
				// Keyword
				case "HARDWARE":
					// New line for spacing
					System.out.println("");
					// Definition of keyword
					System.out.println("HARDWARE - The general term for computer equipment.");
					// New line for spacing
					System.out.println("");
					// Example of use(if needed)
					System.out.println("");
					break;
				
				// Keyword
				case "HARDWARE ACCELERATED":
					// New line for spacing
					System.out.println("");
					// Definition of keyword
					System.out.println("HARDWARE ACCELERATED - Describes software that takes advantage of the computer hardware to perform some functions, such as media and graphics, more efficiently.");
					// New line for spacing
					System.out.println("");
					// Example of use(if needed)
					System.out.println("");
					break;
				
				// Keyword
				case "HAS-A RELATIONSHIP":
					// New line for spacing
					System.out.println("");
					// Definition of keyword
					System.out.println("HAS-A RELATIONSHIP - A relationship based on containment.");
					// New line for spacing
					System.out.println("");
					// Example of use(if needed)
					System.out.println("");
					break;
				
				// Keyword
				case "HASH CODE":
					// New line for spacing
					System.out.println("");
					// Definition of keyword
					System.out.println("HASH CODE - A calculated number used to identify an object.");
					// New line for spacing
					System.out.println("");
					// Example of use(if needed)
					System.out.println("");
					break;
				
				// Keyword
				case "HEAVYWEIGHT COMPONENTS":
					// New line for spacing
					System.out.println("");
					// Definition of keyword
					System.out.println("HEAVYWEIGHT COMPONENTS - Components that require interaction with the local operating system. Contrast with LIGHTWEIGHT COMPONENTS.");
					// New line for spacing
					System.out.println("");
					// Example of use(if needed)
					System.out.println("");
					break;
				
				// Keyword
				case "HEXADECIMAL NUMBERING SYSTEM":
					// New line for spacing
					System.out.println("");
					// Definition of keyword
					System.out.println("HEXADECIMAL NUMBERING SYSTEM - A numbering system based on 16 digits, 0-9 and A-F, in which each column represents a value 16 times higher than the column to its right.");
					// New line for spacing
					System.out.println("");
					// Example of use(if needed)
					System.out.println("");
					break;
				
				// Keyword
				case "HIGH-LEVEL PROGRAMMING LANGUAGE":
					// New line for spacing
					System.out.println("");
					// Definition of keyword
					System.out.println("HIGH-LEVEL PROGRAMMING LANGUAGE - A language that uses a vocabulary of reasonable terms, such as read, write, or add, instead of referencing the sequences of on and off switches that perform these tasks. Contrast with LOW-LEVEL PROGRAMMING LANGUAGE.");
					// New line for spacing
					System.out.println("");
					// Example of use(if needed)
					System.out.println("");
					break;
				
				// Keyword
				case "HTML":
					// New line for spacing
					System.out.println("");
					// Definition of keyword
					System.out.println("HTML - A simple language used to create Web pages.");
					// New line for spacing
					System.out.println("");
					// Example of use(if needed)
					System.out.println("");
					break;
				
				/*----------------------- LETTER I -----------------------------*/
				// Keyword
				case "IDENTIFIER":
					// New line for spacing
					System.out.println("");
					// Definition of keyword
					System.out.println("IDENTIFIER - The name of a program component such as a class, object, or variable.");
					// New line for spacing
					System.out.println("");
					// Example of use(if needed)
					System.out.println("");
					break;

				// Keyword
				case "IF CLAUSE":
					// New line for spacing
					System.out.println("");
					// Definition of keyword
					System.out.println("IF CLAUSE - The part of an \"if...else\" statement that executes when the evaluted boolean expression is \"true\".");
					// New line for spacing
					System.out.println("");
					// Example of use(if needed)
					System.out.println("");
					break;
				
				// Keyword
				case "IF...ELSE STATEMENT":
					// New line for spacing
					System.out.println("");
					// Definition of keyword
					System.out.println("IF...ELSE STATEMENT - A statement that provides the mechanism to perform one action when a boolean expression evaluates as \"true\", and to perform a different action when a boolean expression evalutates \"false\".");
					// New line for spacing
					System.out.println("");
					// Example of use(if needed)
					System.out.println("");
					break;
				
				// Keyword
				case "IF STATEMENT":
					// New line for spacing
					System.out.println("");
					// Definition of keyword
					System.out.println("IF STATEMENT - A single-alternative selection statement.");
					// New line for spacing
					System.out.println("");
					// Example of use(if needed)
					System.out.println("");
					break;
				
				// Keyword
				case "IMMUTABLE":
					// New line for spacing
					System.out.println("");
					// Definition of keyword
					System.out.println("IMMUTABLE - describes objects that cannot be changed.");
					// New line for spacing
					System.out.println("");
					// Example of use(if needed)
					System.out.println("");
					break;
				
				// Keyword
				case "IMPLEMENTATION":
					// New line for spacing
					System.out.println("");
					// Definition of keyword
					System.out.println("IMPLEMENTATION - The actions that execute a method; the method body.");
					// New line for spacing
					System.out.println("");
					// Example of use(if needed)
					System.out.println("");
					break;
				
				// Keyword
				case "IMPLEMENTATION HIDING":
					// New line for spacing
					System.out.println("");
					// Definition of keyword
					System.out.println("IMPLEMENTATION HIDING - A principle of object-oriented programming that describes the encapsulation of method details within a class.");
					// New line for spacing
					System.out.println("");
					// Example of use(if needed)
					System.out.println("");
					break;
				
				// Keyword
				case "IMPLICIT CONVERSION":
					// New line for spacing
					System.out.println("");
					// Definition of keyword
					System.out.println("IMPLICIT CONVERSION - The automatic transformation of one data type to another. Also called PROMOTION.");
					// New line for spacing
					System.out.println("");
					// Example of use(if needed)
					System.out.println("");
					break;
				
				// Keyword
				case "IMPORT STATEMENT":
					// New line for spacing
					System.out.println("");
					// Definition of keyword
					System.out.println("IMPORT STATEMENT - A Java statement that allows access to a built0in Java class that is contained in a package.");
					// New line for spacing
					System.out.println("");
					// Example of use(if needed)
					System.out.println("");
					break;
				
				// Keyword
				case "INCLUSION POLYMORPHISM":
					// New line for spacing
					System.out.println("");
					// Definition of keyword
					System.out.println("INCLUSION POLYMORPHISM - The aituation in which a single method implementation can be used with a variety of related object because they are object of subclasses of the paramter type. See also PURE POLYMORPHISM.");
					// New line for spacing
					System.out.println("");
					// Example of use(if needed)
					System.out.println("");
					break;
				
				// Keyword
				case "INCREMENTING":
					// New line for spacing
					System.out.println("");
					// Definition of keyword
					System.out.println("INCREMENTING - The act of adding 1 to a variable.");
					// New line for spacing
					System.out.println("");
					// Example of use(if needed)
					System.out.println("");
					break;
				
				// Keyword
				case "INDEFINITE LOOP":
					// New line for spacing
					System.out.println("");
					// Definition of keyword
					System.out.println("INDEFINITE LOOP - A loop in which the final number of iterations is unknown. Contrast with DEFINITE LOOP.");
					// New line for spacing
					System.out.println("");
					// Example of use(if needed)
					System.out.println("");
					break;
				
				// Keyword
				case "INDEX":
					// New line for spacing
					System.out.println("");
					// Definition of keyword
					System.out.println("INDEX - A subscript.");
					// New line for spacing
					System.out.println("");
					// Example of use(if needed)
					System.out.println("");
					break;
				
				// Keyword
				case "INFINITE LOOP":
					// New line for spacing
					System.out.println("");
					// Definition of keyword
					System.out.println("INFINITE LOOP - A loop that never ends.");
					// New line for spacing
					System.out.println("");
					// Example of use(if needed)
					System.out.println("");
					break;
				
				// Keyword
				case "INFORMATION HIDING":
					// New line for spacing
					System.out.println("");
					// Definition of keyword
					System.out.println("INFORMATION HIDING - The object-oriented programming principle used when creating private access for data fields that describes that a class's private data can be changed or manipulated only by a class's own methods.");
					// New line for spacing
					System.out.println("");
					// Example of use(if needed)
					System.out.println("");
					break;
				
				// Keyword
				case "INHERITANCE":
					// New line for spacing
					System.out.println("");
					// Definition of keyword
					System.out.println("INHERITANCE - A mechanism that enables one class to inherit, or assume, both the behavior and attributes of another class.");
					// New line for spacing
					System.out.println("");
					// Example of use(if needed)
					System.out.println("");
					break;
				
				// Keyword
				case "INIT()":
					// New line for spacing
					System.out.println("");
					// Definition of keyword
					System.out.println("INIT() - The method that executes the first in a JavaFX application.");
					// New line for spacing
					System.out.println("");
					// Example of use(if needed)
					System.out.println("");
					break;
				
				// Keyword
				case "INITIALIZATION":
					// New line for spacing
					System.out.println("");
					// Definition of keyword
					System.out.println("INITIALIZATION - The act of making an assignment at the time of variable declaration.");
					// New line for spacing
					System.out.println("");
					// Example of use(if needed)
					System.out.println("");
					break;
				
				// Keyword
				case "INITIALIZATION LIST":
					// New line for spacing
					System.out.println("");
					// Definition of keyword
					System.out.println("INITIALIZATION LIST - A series of values provided for an array when it is declared.");
					// New line for spacing
					System.out.println("");
					// Example of use(if needed)
					System.out.println("");
					break;
				
				// Keyword
				case "INLINING":
					// New line for spacing
					System.out.println("");
					// Definition of keyword
					System.out.println("INLINING - An automatic process that optimizes performance by replacing calls to methods with implementations.");
					// New line for spacing
					System.out.println("");
					// Example of use(if needed)
					System.out.println("");
					break;
				
				// Keyword
				case "INNER BLOCK":
					// New line for spacing
					System.out.println("");
					// Definition of keyword
					System.out.println("INNER BLOCK - A block contained in an outer block.");
					// New line for spacing
					System.out.println("");
					// Example of use(if needed)
					System.out.println("");
					break;
				
				// Keyword
				case "INNER CLASSES":
					// New line for spacing
					System.out.println("");
					// Definition of keyword
					System.out.println("INNER CLASSES - Nested classes that require an instance. See also NONSTATIC MEMBER CLASSES.");
					// New line for spacing
					System.out.println("");
					// Example of use(if needed)
					System.out.println("");
					break;
				
				// Keyword
				case "INNER LOOP":
					// New line for spacing
					System.out.println("");
					// Definition of keyword
					System.out.println("INNER LOOP - A loop that is contained entirely within another loop.");
					// New line for spacing
					System.out.println("");
					// Example of use(if needed)
					System.out.println("");
					break;
				
				// Keyword
				case "INPUT DIALOG BOX":
					// New line for spacing
					System.out.println("");
					// Definition of keyword
					System.out.println("INPUT DIALOG BOX - A GUI object thgat asks a question and provides a text field in which the user can enter a response.");
					// New line for spacing
					System.out.println("");
					// Example of use(if needed)
					System.out.println("");
					break;
				
				// Keyword
				case "INSERTION SORT":
					// New line for spacing
					System.out.println("");
					// Definition of keyword
					System.out.println("INSERTION SORT - A sorting algorithm that operates by comparing each list element with earlier ones and, if the element is out of order, opening a spot for it by moving all subsquent elements down the list.");
					// New line for spacing
					System.out.println("");
					// Example of use(if needed)
					System.out.println("");
					break;
				
				// Keyword
				case "INSTANCE":
					// New line for spacing
					System.out.println("");
					// Definition of keyword
					System.out.println("INSTANCE - an existing object of a class.");
					// New line for spacing
					System.out.println("");
					// Example of use(if needed)
					System.out.println("");
					break;
				
				// Keyword
				case "INSTANCE METHODS":
					// New line for spacing
					System.out.println("");
					// Definition of keyword
					System.out.println("INSTANCE METHODS - Methods used with object instantiations. See also NONSTATIC METHODS.");
					// New line for spacing
					System.out.println("");
					// Example of use(if needed)
					System.out.println("");
					break;
				
				// Keyword
				case "INSTANCE VARIABLES":
					// New line for spacing
					System.out.println("");
					// Definition of keyword
					System.out.println("INSTANCE VARIABLES - The data components of a class.");
					// New line for spacing
					System.out.println("");
					// Example of use(if needed)
					System.out.println("");
					break;
				
				// Keyword
				case "INSTANT ACCESS FILES":
					// New line for spacing
					System.out.println("");
					// Definition of keyword
					System.out.println("INSTANT ACCESS FILES - Random access files.");
					// New line for spacing
					System.out.println("");
					// Example of use(if needed)
					System.out.println("");
					break;
				
				// Keyword
				case "INSTANTIATION":
					// New line for spacing
					System.out.println("");
					// Definition of keyword
					System.out.println("INSTANTIATION - Refers to the process of creating an object, and also describes one tangible object created from a class.");
					// New line for spacing
					System.out.println("");
					// Example of use(if needed)
					System.out.println("");
					break;
				
				// Keyword
				case "INT":
					// New line for spacing
					System.out.println("");
					// Definition of keyword
					System.out.println("INT - Data type used to declare variables and constants that store integers in the range of -2,147,483,648 to +2,147,483,647.");
					// New line for spacing
					System.out.println("");
					// Example of use(if needed)
					System.out.println("");
					break;
				
				// Keyword
				case "INTEGER":
					// New line for spacing
					System.out.println("");
					// Definition of keyword
					System.out.println("INTEGER - A whole number without decimal places.");
					// New line for spacing
					System.out.println("");
					// Example of use(if needed)
					System.out.println("");
					break;
				
				// Keyword
				case "INTEGER DIVISION":
					// New line for spacing
					System.out.println("");
					// Definition of keyword
					System.out.println("INTEGER DIVISION - The operation in which one integer value is divided by another; the result contains no fractional part.");
					// New line for spacing
					System.out.println("");
					// Example of use(if needed)
					System.out.println("");
					break;
				
				// Keyword
				case "INTERACTIVE PROGRAM":
					// New line for spacing
					System.out.println("");
					// Definition of keyword
					System.out.println("INTERACTIVE PROGRAM - A program in which the user makes direct requests.");
					// New line for spacing
					System.out.println("");
					// Example of use(if needed)
					System.out.println("");
					break;
				
				// Keyword
				case "INTERFACE":
					// New line for spacing
					System.out.println("");
					// Definition of keyword
					System.out.println("INTERFACE - A construct similar to a class, except that all of its methods must be abstract and all of its data (if any) must be \"static final\"; it declares method headers, but no instructions within those methods. Also used to describe the part of a method that a client sees and uses; includes the method's return type, name, arguments.");
					// New line for spacing
					System.out.println("");
					// Example of use(if needed)
					System.out.println("");
					break;
				
				// Keyword
				case "INTERPOLATION":
					// New line for spacing
					System.out.println("");
					// Definition of keyword
					System.out.println("INTERPOLATION - A technique that determines how an animation transitions between values over its timeline.");
					// New line for spacing
					System.out.println("");
					// Example of use(if needed)
					System.out.println("");
					break;
				
				// Keyword
				case "INTERPRETER":
					// New line for spacing
					System.out.println("");
					// Definition of keyword
					System.out.println("INTERPRETER - A program that translates language statements into machine code. An INTERPRETER translates and executes one statement at a time. Contrast with COMPILER");
					// New line for spacing
					System.out.println("");
					// Example of use(if needed)
					System.out.println("");
					break;
				
				// Keyword
				case "INVOKE":
					// New line for spacing
					System.out.println("");
					// Definition of keyword
					System.out.println("INVOKE - To call or execute a method.");
					// New line for spacing
					System.out.println("");
					// Example of use(if needed)
					System.out.println("");
					break;
				
				// Keyword
				case "IS-A RELATIONSHIP":
					// New line for spacing
					System.out.println("");
					// Definition of keyword
					System.out.println("IS-A RELATIONSHIP - The relationship between an object and the class of which it is a member.");
					// New line for spacing
					System.out.println("");
					// Example of use(if needed)
					System.out.println("");
					break;
				
				// Keyword
				case "ITERATION":
					// New line for spacing
					System.out.println("");
					// Definition of keyword
					System.out.println("ITERATION - one loop execution.");
					// New line for spacing
					System.out.println("");
					// Example of use(if needed)
					System.out.println("");
					break;
				
				/*----------------------- LETTER J -----------------------------*/
				// Keyword
				case "JAGGED ARRAY":
					// New line for spacing
					System.out.println("");
					// Definition of keyword
					System.out.println("JAGGED ARRAY - A two-dimensional array that has rows of different length. See also RAGGED ARRAY.");
					// New line for spacing
					System.out.println("");
					// Example of use(if needed)
					System.out.println("");
					break;
				
				// Keyword
				case "JAVA":
					// New line for spacing
					System.out.println("");
					// Definition of keyword
					System.out.println("JAVA - An object-oriented programming language both for general-purpose business applications and for interactive Web-based internet applications.");
					// New line for spacing
					System.out.println("");
					// Example of use(if needed)
					System.out.println("");
					break;
				
				// Keyword
				case "JAVA API":
					// New line for spacing
					System.out.println("");
					// Definition of keyword
					System.out.println("JAVA API - The application programming interface, a collection of information about how to use every prewritten Java class.");
					// New line for spacing
					System.out.println("");
					// Example of use(if needed)
					System.out.println("");
					break;
				
				// Keyword
				case "JAVA ARCHIVE (JAR) FILE":
					// New line for spacing
					System.out.println("");
					// Definition of keyword
					System.out.println("JAVA ARCHIVE FILE - A package file format used to distribute Java programs and resources.");
					// New line for spacing
					System.out.println("");
					// Example of use(if needed)
					System.out.println("");
					break;
				
				// Keyword
				case "JAR":
					// New line for spacing
					System.out.println("");
					// Definition of keyword
					System.out.println("JAR - A package file format used to distribute Java programs and resources.");
					// New line for spacing
					System.out.println("");
					// Example of use(if needed)
					System.out.println("");
					break;
				
				// Keyword
				case "JAVA ENTERPRISE EDITION (EE)":
					// New line for spacing
					System.out.println("");
					// Definition of keyword
					System.out.println("JAVA ENTERPRISE EDITION (EE) - A Java edition that inclused all of the classes in the Java SE, plus a number of classes that are more useful to running on servers.");
					// New line for spacing
					System.out.println("");
					// Example of use(if needed)
					System.out.println("");
					break;
				
				// Keyword
				case "JAVA FOUNDATION CLASSES (JFC)":
					// New line for spacing
					System.out.println("");
					// Definition of keyword
					System.out.println("JAVA FOUNDATION CLASSES (JFC) - Selected classes from the java.awt package, including \"swing\" component classes.");
					// New line for spacing
					System.out.println("");
					// Example of use(if needed)
					System.out.println("");
					break;
				
				// Keyword
				case "JAVA INTERPRETER":
					// New line for spacing
					System.out.println("");
					// Definition of keyword
					System.out.println("JAVA INTERPRETER - The program that checks bytecode and communicates with the operating system, executing the bytecode instructions line by line with the Java Virtual Machine.");
					// New line for spacing
					System.out.println("");
					// Example of use(if needed)
					System.out.println("");
					break;
				
				// Keyword
				case "JAVA MICRO EDITION (ME)":
					// New line for spacing
					System.out.println("");
					// Definition of keyword
					System.out.println("JAVA MICRO EDITION (ME) - A java platform that is used for small devices just as cellphones.");
					// New line for spacing
					System.out.println("");
					// Example of use(if needed)
					System.out.println("");
					break;
				
				// Keyword
				case "JAVA SE":
					// New line for spacing
					System.out.println("");
					// Definition of keyword
					System.out.println("JAVA SE - Standard edition of Java.");
					// New line for spacing
					System.out.println("");
					// Example of use(if needed)
					System.out.println("");
					break;
				
				// Keyword
				case "JAVA VIRTUAL MACHINE (JVM)":
					// New line for spacing
					System.out.println("");
					// Definition of keyword
					System.out.println("JAVA VIRTUAL MACHINE - A hypothetical (software-based) computer on which java runs.");
					// New line for spacing
					System.out.println("");
					// Example of use(if needed)
					System.out.println("");
					break;
				
				// Keyword
				case "JAVA.LANG":
					// New line for spacing
					System.out.println("");
					// Definition of keyword
					System.out.println("JAVA.LANG - The package that is implicitly imported into every Java program and that contains the fundamental classes.");
					// New line for spacing
					System.out.println("");
					// Example of use(if needed)
					System.out.println("");
					break;
				
				// Keyword
				case "JAVADOC":
					// New line for spacing
					System.out.println("");
					// Definition of keyword
					System.out.println("JAVADOC - A documentatiuon generator that creates Application Programming Interface (API) documentation in Hypertext Markup language (HTML) format from Java source code.");
					// New line for spacing
					System.out.println("");
					// Example of use(if needed)
					System.out.println("");
					break;
				
				// Keyword
				case "JAVADOC COMMENT":
					// New line for spacing
					System.out.println("");
					// Definition of keyword
					System.out.println("JAVADOC COMMENT - A special form of block comment that provides a standard way to document Java code.");
					// New line for spacing
					System.out.println("");
					// Example of use(if needed)
					System.out.println("");
					break;
				
				// Keyword
				case "JAVADOC TAG":
					// New line for spacing
					System.out.println("");
					// Definition of keyword
					System.out.println("JAVADOC TAG - A keyword within a comment that the Javadoc tool can process.");
					// New line for spacing
					System.out.println("");
					// Example of use(if needed)
					System.out.println("");
					break;
				
				// Keyword
				case "JAVAFX":
					// New line for spacing
					System.out.println("");
					// Definition of keyword
					System.out.println("JAVAFX - A software platform for creating deskktop applications intended to replace \"Swing\" eventually.");
					// New line for spacing
					System.out.println("");
					// Example of use(if needed)
					System.out.println("");
					break;
				
				// Keyword
				case "JDK":
					// New line for spacing
					System.out.println("");
					// Definition of keyword
					System.out.println("JDK - The Java Standard Edition Development Kit.");
					// New line for spacing
					System.out.println("");
					// Example of use(if needed)
					System.out.println("");
					break;
				
				/*----------------------- LETTER K -----------------------------*/
				// Keyword
				case "K & R STYLE":
					// New line for spacing
					System.out.println("");
					// Definition of keyword
					System.out.println("K & R STYLE - The indent style in which the opening brace follows the header line; it us named for Kernighan and Ritchie, who wrote the first book on the C programming language. Contrast with ALLMAN STYLE");
					// New line for spacing
					System.out.println("");
					// Example of use(if needed)
					System.out.println("");
					break;
				
				// Keyword
				case "KEY FIELD":
					// New line for spacing
					System.out.println("");
					// Definition of keyword
					System.out.println("KEY FIELDS - The field in a record that makeks the record unique from all others.");
					// New line for spacing
					System.out.println("");
					// Example of use(if needed)
					System.out.println("");
					break;
				
				// Keyword
				case "KEY FRAME ANIMATION":
					// New line for spacing
					System.out.println("");
					// Definition of keyword
					System.out.println("KEY FRAME ANIMATION - In JavaFX animations, a technique that uses specific locations for changes to occur.");
					// New line for spacing
					System.out.println("");
					// Example of use(if needed)
					System.out.println("");
					break;
				
				// Keyword
				case "KEYBOARD BUFFER":
					// New line for spacing
					System.out.println("");
					// Definition of keyword
					System.out.println("KEYBOARD BUFFER - A small area of memory where keystrokes are stored before they are retrieved into a program. Also called the TYPE-AHEAD BUFFER.");
					// New line for spacing
					System.out.println("");
					// Example of use(if needed)
					System.out.println("");
					break;
				
				// Keyword
				case "KEYWORDS":
					// New line for spacing
					System.out.println("");
					// Definition of keyword
					System.out.println("KEYWORDS - The words that are part of a programming language.");
					// New line for spacing
					System.out.println("");
					// Example of use(if needed)
					System.out.println("");
					break;
				
				/*----------------------- LETTER L -----------------------------*/
				// Keyword
				case "LABEL":
					// New line for spacing
					System.out.println("");
					// Definition of keyword
					System.out.println("LABEL - An uneditable GUI component that most often is used to provide information for a user.");
					// New line for spacing
					System.out.println("");
					// Example of use(if needed)
					System.out.println("");
					break;
				
				// Keyword
				case "LAMBDA EXPRESSION":
					// New line for spacing
					System.out.println("");
					// Definition of keyword
					System.out.println("LAMBDA EXPRESSION - An expression that creates an object that implements a functional interface.");
					// New line for spacing
					System.out.println("");
					// Example of use(if needed)
					System.out.println("");
					break;
				
				// Keyword
				case "LAMBDA OPERATOR":
					// New line for spacing
					System.out.println("");
					// Definition of keyword
					System.out.println("LAMBDA OPERATOR - Operator used in a LAMBDA EXPRESSION that is composed of a minus sign and greater-than sign (->)");
					// New line for spacing
					System.out.println("");
					// Example of use(if needed)
					System.out.println("");
					break;
				
				// Keyword
				case "LATE METHOD BINDING":
					// New line for spacing
					System.out.println("");
					// Definition of keyword
					System.out.println("LATE METHOD BINDING - The ability of an application to select the correct subclass method when the program executes. See also DYNAMIC METHOD BINDING.");
					// New line for spacing
					System.out.println("");
					// Example of use(if needed)
					System.out.println("");
					break;
				
				// Keyword
				case "LAUNCH()":
					// New line for spacing
					System.out.println("");
					// Definition of keyword
					System.out.println("LAUNCH() - The method that sets up a JAVAFX application.");
					// New line for spacing
					System.out.println("");
					// Example of use(if needed)
					System.out.println("");
					break;
				
				// Keyword
				case "LAYOUT MANAGER":
					// New line for spacing
					System.out.println("");
					// Definition of keyword
					System.out.println("LAYOUT MANAGER - A class that controls components poistioning in a UI environment.");
					// New line for spacing
					System.out.println("");
					// Example of use(if needed)
					System.out.println("");
					break;
				
				// Keyword
				case "LEXIGRAPHICAL COMPARISON":
					// New line for spacing
					System.out.println("");
					// Definition of keyword
					System.out.println("LEXIGRAPHICAL COMPARISON - A comparison based on the integer Unicode values of characters.");
					// New line for spacing
					System.out.println("");
					// Example of use(if needed)
					System.out.println("");
					break;
				
				// Keyword
				case "LIBRARY OF CLASSES":
					// New line for spacing
					System.out.println("");
					// Definition of keyword
					System.out.println("LIBRARY OF CLASSES - A folder that provides a confenient grouping for classes. See also PACKAGES.");
					// New line for spacing
					System.out.println("");
					// Example of use(if needed)
					System.out.println("");
					break;
				
				// Keyword
				case "LIGHTWEIGHT COMPONENTS":
					// New line for spacing
					System.out.println("");
					// Definition of keyword
					System.out.println("LIGHTWEIGHT COMPONENTS - Components written completely in Java that do not have to rely on the code written to run in the local operating system. Contrast with HEAVYWEIGHT COMPONENTS.");
					// New line for spacing
					System.out.println("");
					// Example of use(if needed)
					System.out.println("");
					break;
				
				// Keyword
				case "LINE COMMENTS":
					// New line for spacing
					System.out.println("");
					// Definition of keyword
					System.out.println("LINE COMMENTS - Comments that start with the two forward slashes (//) and continue to the end of the current line. Line comments can appear on a line by themselves or at the end of a line following executable code. Contrast with BLOCK COMMENTS.");
					// New line for spacing
					System.out.println("");
					// Example of use(if needed)
					System.out.println("");
					break;
				
				// Keyword
				case "LISTENER":
					// New line for spacing
					System.out.println("");
					// Definition of keyword
					System.out.println("LISTENER - An object that is interested in and reacts to an event.");
					// New line for spacing
					System.out.println("");
					// Example of use(if needed)
					System.out.println("");
					break;
				
				// Keyword
				case "LITERAL CONSTANT":
					// New line for spacing
					System.out.println("");
					// Definition of keyword
					System.out.println("LITERAL CONSTANT - A value that is taken literally at each use. See also UNNAMED CONSTANT");
					// New line for spacing
					System.out.println("");
					// Example of use(if needed)
					System.out.println("");
					break;
				
				// Keyword
				case "LITERAL STRING":
					// New line for spacing
					System.out.println("");
					// Definition of keyword
					System.out.println("LITERAL STRING - A series of charactors that appear exactly as entered; in Java, a literal string appears between double quotation marks.");
					// New line for spacing
					System.out.println("");
					// Example of use(if needed)
					System.out.println("");
					break;
				
				// Keyword
				case "LIVE EDITING":
					// New line for spacing
					System.out.println("");
					// Definition of keyword
					System.out.println("LIVE EDITING - A development feature that allows a programmer to make changes to the UI without the need to recompile the code.");
					// New line for spacing
					System.out.println("");
					// Example of use(if needed)
					System.out.println("");
					break;
				
				// Keyword
				case "LOCAL CLASSES":
					// New line for spacing
					System.out.println("");
					// Definition of keyword
					System.out.println("LOCAL CLASSES - Nested classes that are local to a block of code.");
					// New line for spacing
					System.out.println("");
					// Example of use(if needed)
					System.out.println("");
					break;

				// Keyword
				case "LOCAL VARIABLE":
					// New line for spacing
					System.out.println("");
					// Definition of keyword
					System.out.println("LOCAL VARIABLE - A variable known only within the boundries of a method.");
					// New line for spacing
					System.out.println("");
					// Example of use(if needed)
					System.out.println("");
					break;

				// Keyword
				case "LOCAL VARIABLES":
					// New line for spacing
					System.out.println("");
					// Definition of keyword
					System.out.println("LOCAL VARIABLES - A variable known only within the boundries of a method.");
					// New line for spacing
					System.out.println("");
					// Example of use(if needed)
					System.out.println("");
					break;
				
				// Keyword
				case "LOGIC":
					// New line for spacing
					System.out.println("");
					// Definition of keyword
					System.out.println("LOGIC - Describes the order of the program statements that produce correct results.");
					// New line for spacing
					System.out.println("");
					// Example of use(if needed)
					System.out.println("");
					break;
				
				// Keyword
				case "LOGIC ERROR":
					// New line for spacing
					System.out.println("");
					// Definition of keyword
					System.out.println("LOGIC ERROR - A Programming bug that allows a srouce program to be translated to an executable program successfully, but that produces incorrect results.");
					// New line for spacing
					System.out.println("");
					// Example of use(if needed)
					System.out.println("");
					break;
				
				// Keyword
				case "LOGICAL AND OPERATOR":
					// New line for spacing
					System.out.println("");
					// Definition of keyword
					System.out.println("LOGICAL AND OPERATOR - An operator used between BOOLEAN EXPRESSIONS to determine weather both are \"true\"; written as two ampersands (&&).");
					// New line for spacing
					System.out.println("");
					// Example of use(if needed)
					System.out.println("");
					break;
				
				// Keyword
				case "LOGICAL OR OPERATOR":
					// New line for spacing
					System.out.println("");
					// Definition of keyword
					System.out.println("LOGICAL OR OPERATOR - An operator used between BOOLEAN EXPRESSIONS to determine whether either expression is \"true; written as two pipes (||).");
					// New line for spacing
					System.out.println("");
					// Example of use(if needed)
					System.out.println("");
					break;
				
				// Keyword
				case "LONG":
					// New line for spacing
					System.out.println("");
					// Definition of keyword
					System.out.println("LONG - Data type that holds very large integers from -9,223,372,036,854,775,808 - 9,223,372,036,854,775,807.");
					// New line for spacing
					System.out.println("");
					// Example of use(if needed)
					System.out.println("");
					break;
				
				// Keyword
				case "LOOK AND FEEL":
					// New line for spacing
					System.out.println("");
					// Definition of keyword
					System.out.println("LOOK AND FEEL - The elements of design, style, and funtionality in a user interface.");
					// New line for spacing
					System.out.println("");
					// Example of use(if needed)
					System.out.println("");
					break;
				
				// Keyword
				case "LOOP":
					// New line for spacing
					System.out.println("");
					// Definition of keyword
					System.out.println("LOOP - A structure that allows repeated execution of a block of statements.");
					// New line for spacing
					System.out.println("");
					// Example of use(if needed)
					System.out.println("");
					break;

				// Keyword
				case "LOOP BODY":
					// New line for spacing
					System.out.println("");
					// Definition of keyword
					System.out.println("LOOP BODY - The block of statements that executed when the boolean expression that controls the loop is \"true\n.");
					// New line for spacing
					System.out.println("");
					// Example of use(if needed)
					System.out.println("");
					break;

				// Keyword
				case "LOOP CONTROL VARIABLE":
					// New line for spacing
					System.out.println("");
					// Definition of keyword
					System.out.println("LOOP CONTROL VARIBALE - A variable whose value determines wheter loop execution continues.");
					// New line for spacing
					System.out.println("");
					// Example of use(if needed)
					System.out.println("");
					break;

				// Keyword
				case "LOOP FUSION":
					// New line for spacing
					System.out.println("");
					// Definition of keyword
					System.out.println("LOOP FUSION - The technique of combining two loops into one.");
					// New line for spacing
					System.out.println("");
					// Example of use(if needed)
					System.out.println("");
					break;

				// Keyword
				case "LVALUE":
					// New line for spacing
					System.out.println("");
					// Definition of keyword
					System.out.println("LVALUE - An expression that can appear on the left side of an assignment statement. Contrast with RVALUE.");
					// New line for spacing
					System.out.println("");
					// Example of use(if needed)
					System.out.println("");
					break;

				/*----------------------- LETTER M -----------------------------*/

				// Keyword
				case "MACHINE LANGUAGE":
					// New line for spacing
					System.out.println("");
					// Definition of keyword
					System.out.println("MACHINE LANGUAGE - Circuitry-level language; a series of on and off switches. Compare with LOW-LEVEL PROGRAMMING LANGUAGE");
					// New line for spacing
					System.out.println("");
					// Example of use(if needed)
					System.out.println("");
					break;

				// Keyword
				case "MAGIC NUMBER":
					// New line for spacing
					System.out.println("");
					// Definition of keyword
					System.out.println("MAGIC NUMBER - a value that does not have immediate, intuitive meaning or a number that cannot be explained without additional knowledge. UNNAMED CONSTANTS are MAGIC NUMBERS.");
					// New line for spacing
					System.out.println("");
					// Example of use(if needed)
					System.out.println("");
					break;


				// Keyword
				case "MACHINE CODE":
					// New line for spacing
					System.out.println("");
					// Definition of keyword
					System.out.println("MACHINE CODE - Machine language.");
					// New line for spacing
					System.out.println("");
					// Example of use(if needed)
					System.out.println("");
					break;

				// Keyword
				case "METHOD":
					// New line for spacing
					System.out.println("");
					// Definition of keyword
					System.out.println("METHOD - A program module that contains a series of statements that carry out a task.");
					// New line for spacing
					System.out.println("");
					// Example of use(if needed)
					System.out.println("");
					break;

				// Keyword
				case "METHOD BODY":
					// New line for spacing
					System.out.println("");
					// Definition of keyword
					System.out.println("METHOD BODY - The set of statements between curly braces that follow the method header and carry out the method's actions.");
					// New line for spacing
					System.out.println("");
					// Example of use(if needed)
					System.out.println("");
					break;

				// Keyword
				case "METHOD HEADER":
					// New line for spacing
					System.out.println("");
					// Definition of keyword
					System.out.println("METHOD HEADER - The declaration or first line of a method that contains information about how other methods interact with it.");
					// New line for spacing
					System.out.println("");
					// Example of use(if needed)
					System.out.println("");
					break;

				// Keyword
				case "METHOD'S TYPE":
					// New line for spacing
					System.out.println("");
					// Definition of keyword
					System.out.println("METHOD'S TYPE - A method's return type.");
					// New line for spacing
					System.out.println("");
					// Example of use(if needed)
					System.out.println("");
					break;

				// Keyword
				case "MODULUS OPERATOR":
					// New line for spacing
					System.out.println("");
					// Definition of keyword
					System.out.println("MODULUS OPERATOR - The percent sign (%); When it is used with two integers, the result is an integer with the value of the remainder after division takes place. Also called the REMAINDER OPERATOR or MOD");
					// New line for spacing
					System.out.println("");
					// Example of use(if needed)
					System.out.println("");
					break;

				// Keyword
				case "MULTIPLY AND ASSIGN OPERATOR":
					// New line for spacing
					System.out.println("");
					// Definition of keyword
					System.out.println("MULTIPLY AND ASSIGN OPERATOR - An operator that alters the value of the operand on the left by multiplying the operand on the right by it; it is composed of an asterisk and an equal sign (*=).");
					// New line for spacing
					System.out.println("");
					// Example of use(if needed)
					System.out.println("");
					break;

				// Keyword
				case "MUTATOR METHODS":
					// New line for spacing
					System.out.println("");
					// Definition of keyword
					System.out.println("MUTATOR METHODS - Methods that set field values. Also known as setters.");
					// New line for spacing
					System.out.println("");
					// Example of use(if needed)
					System.out.println("");
					break;

				/*----------------------- LETTER N -----------------------------*/

				// Keyword
				case "NAMED CONSTANT":
					// New line for spacing
					System.out.println("");
					// Definition of keyword
					System.out.println("NAMED CONSTANT - A named memory location whose value cannot change during the program execution.");
					// New line for spacing
					System.out.println("");
					// Example of use(if needed)
					System.out.println("");
					break;

				// Keyword
				case "NAN":
					// New line for spacing
					System.out.println("");
					// Definition of keyword
					System.out.println("NAN - Abbreviation for not a number.");
					// New line for spacing
					System.out.println("");
					// Example of use(if needed)
					System.out.println("");
					break;

				// Keyword
				case "NANOSECOND":
					// New line for spacing
					System.out.println("");
					// Definition of keyword
					System.out.println("NANOSECOND - One-billionth of a second.");
					// New line for spacing
					System.out.println("");
					// Example of use(if needed)
					System.out.println("");
					break;

				// Keyword
				case "NESTED":
					// New line for spacing
					System.out.println("");
					// Definition of keyword
					System.out.println("NESTED - Describes the relationship of statements, blocks, or classes when one contains the other.");
					// New line for spacing
					System.out.println("");
					// Example of use(if needed)
					System.out.println("");
					break;

				// Keyword
				case "NESTED CLASSES":
					// New line for spacing
					System.out.println("");
					// Definition of keyword
					System.out.println("NESTED CLASSES - Classes contained in other classes.");
					// New line for spacing
					System.out.println("");
					// Example of use(if needed)
					System.out.println("");
					break;

				// Keyword
				case "NESTED IF STATEMENTS":
					// New line for spacing
					System.out.println("");
					// Definition of keyword
					System.out.println("NESTED IF STATEMENTS - Describes \"if\" statements when one is contained within another.");
					// New line for spacing
					System.out.println("");
					// Example of use(if needed)
					System.out.println("");
					break;

				// Keyword
				case "NEW OPERATOR":
					// New line for spacing
					System.out.println("");
					// Definition of keyword
					System.out.println("NEW OPERATOR - An operator that allocates the memory needed to hold an object.");
					// New line for spacing
					System.out.println("");
					// Example of use(if needed)
					System.out.println("");
					break;

				// Keyword
				case "NONSTATIC METHODS":
					// New line for spacing
					System.out.println("");
					// Definition of keyword
					System.out.println("NONSTATIC METHODS - Methods used with object instantiations. See also INSTANCE METHODS.");
					// New line for spacing
					System.out.println("");
					// Example of use(if needed)
					System.out.println("");
					break;

				// Keyword
				case "NONSTATIC MEMBER CLASSES":
					// New line for spacing
					System.out.println("");
					// Definition of keyword
					System.out.println("NONSTATIC MEMBER CLASSES - Nested classes that require an instance. See also INNER CLASSES.");
					// New line for spacing
					System.out.println("");
					// Example of use(if needed)
					System.out.println("");
					break;

				// Keyword
				case "NOT OPERATOR (!)":
					// New line for spacing
					System.out.println("");
					// Definition of keyword
					System.out.println("NOT OPERATOR (!) - The operator that negates the result of any boolean expression.");
					// New line for spacing
					System.out.println("");
					// Example of use(if needed)
					System.out.println("");
					break;

				// Keyword
				case "NULL STRING":
					// New line for spacing
					System.out.println("");
					// Definition of keyword
					System.out.println("NULL STRING - A \"String\" that does not hold a memory address and that can be created by assigning the value of \"null\" or by making no assignment to a declared string.");
					// New line for spacing
					System.out.println("");
					// Example of use(if needed)
					System.out.println("");
					break;

				// Keyword
				case "NUMERIC CONSTANT":
					// New line for spacing
					System.out.println("");
					// Definition of keyword
					System.out.println("NUMERIC CONSTANT - A numbers whose value is taken literally at each use.");
					// New line for spacing
					System.out.println("");
					// Example of use(if needed)
					System.out.println("");
					break;

				/*----------------------- LETTER O -----------------------------*/

				// Keyword
				case "OBJECT":
					// New line for spacing
					System.out.println("");
					// Definition of keyword
					System.out.println("OBJECT - An instance of a class.");
					// New line for spacing
					System.out.println("");
					// Example of use(if needed)
					System.out.println("");
					break;

				// Keyword
				case "OBJECT-ORIENTED PROGRAMS":
					// New line for spacing
					System.out.println("");
					// Definition of keyword
					System.out.println("OBJECT-ORIENTED PROGRAMS - Programs that use a style of programming that involves creating classes, creating objects from those classes and creating applications that use those objects. Contrast with PROCEDURAL PROGRAMMING.");
					// New line for spacing
					System.out.println("");
					// Example of use(if needed)
					System.out.println("");
					break;

				// Keyword
				case "ONE-DIMENSIONAL ARRAY":
					// New line for spacing
					System.out.println("");
					// Definition of keyword
					System.out.println("ONE-DIMENSIONAL ARRAY");
					// New line for spacing
					System.out.println("");
					// Example of use(if needed)
					System.out.println("");
					break;

				// Keyword
				case "OPERAND":
					// New line for spacing
					System.out.println("");
					// Definition of keyword
					System.out.println("OPERAND - A value used in an arithmetic statement.");
					// New line for spacing
					System.out.println("");
					// Example of use(if needed)
					System.out.println("");
					break;

				// Keyword
				case "OPERATOR PRECEDENCE":
					// New line for spacing
					System.out.println("");
					// Definition of keyword
					System.out.println("OPERATOR PRECEDENCE - The rules for the order in which parts of a mathematical expression are evaluated.");
					// New line for spacing
					System.out.println("");
					// Example of use(if needed)
					System.out.println("OPERATOR PRECEDENCE");
					System.out.println("P,E,M,D,A,S");
					break;

				// Keyword
				case "OPTIONAL CLASSES":
					// New line for spacing
					System.out.println("");
					// Definition of keyword
					System.out.println("OPTIONAL CLASSES - Classes that reside in packages that must be explicitly imported into programs. Contrast with FUNDAMENTAL CLASSES.");
					// New line for spacing
					System.out.println("");
					// Example of use(if needed)
					System.out.println("OPTIONAL CLASSES");
					System.out.println("import javax.swing.JOptionPane");
					break;

				// Keyword
				case "OUT OF BOUNDS":
					// New line for spacing
					System.out.println("");
					// Definition of keyword
					System.out.println("OUT OF BOUNDS - Describes a SUBSCRIPT that is not within the allowed range for an array.");
					// New line for spacing
					System.out.println("");
					// Example of use(if needed)
					System.out.println("");
					break;

				// Keyword
				case "OUTER BLOCK":
					// New line for spacing
					System.out.println("");
					// Definition of keyword
					System.out.println("OUTER BLOCK - A block that contains a nested block.");
					// New line for spacing
					System.out.println("");
					// Example of use(if needed)
					System.out.println("");
					break;

				// Keyword
				case "OUTER LOOP":
					// New line for spacing
					System.out.println("");
					// Definition of keyword
					System.out.println("OUTER LOOP - A loop that contains another loop.");
					// New line for spacing
					System.out.println("");
					// Example of use(if needed)
					System.out.println("");
					break;

				// Keyword
				case "OVERLOADING":
					// New line for spacing
					System.out.println("");
					// Definition of keyword
					System.out.println("OVERLOADING - Describes using one term to indicate diverse meanings, or writing multiple methods with the same name but with different arguments.");
					// New line for spacing
					System.out.println("");
					// Example of use(if needed)
					System.out.println("");
					break;

				// Keyword
				case "OVERRIDE":
					// New line for spacing
					System.out.println("");
					// Definition of keyword
					System.out.println("OVERRIDE - Describes the precedence of a variable's name in a called method when the same name exists in the calling method; also to use the child class's version of a field or method instead of the parent's.");
					// New line for spacing
					System.out.println("");
					// Example of use(if needed)
					System.out.println("");
					break;

				/*----------------------- LETTER P -----------------------------*/

				// Keyword
				case "PACKAGE":
					// New line for spacing
					System.out.println("");
					// Definition of keyword
					System.out.println("PACKAGE - A named collection or library of classes. See also LIBRARY OF CLASSES.");
					// New line for spacing
					System.out.println("");
					// Example of use(if needed)
					System.out.println("");
					break;

				// Keyword
				case "PARALLEL ARRAY":
					// New line for spacing
					System.out.println("");
					// Definition of keyword
					System.out.println("PARALLEL ARRAY - An array with the same number of elements as another, and for which the calues in corresponding elements are related.");
					// New line for spacing
					System.out.println("");
					// Example of use(if needed)
					System.out.println("");
					break;

				// Keyword
				case "PARAMETERS":
					// New line for spacing
					System.out.println("");
					// Definition of keyword
					System.out.println("PARAMETERS - Data items received by a method.");
					// New line for spacing
					System.out.println("");
					// Example of use(if needed)
					System.out.println("PARAMETERS");
					System.out.println("public static void method(String name, int age)");
					System.out.println("parameters                ^^^^^^^^^^^^^^^^^^^^");
					break;

				// Keyword
				case "PARSE":
					// New line for spacing
					System.out.println("");
					// Definition of keyword
					System.out.println("PARSE - To break into component parts.");
					// New line for spacing
					System.out.println("");
					// Example of use(if needed)
					System.out.println("");
					break;

				// Keyword
				case "PARSING":
					// New line for spacing
					System.out.println("");
					// Definition of keyword
					System.out.println("PARSING - The process of breaking something into its component parts.");
					// New line for spacing
					System.out.println("");
					// Example of use(if needed)
					System.out.println("");
					break;

				// Keyword
				case "PASCAL CASING":
					// New line for spacing
					System.out.println("");
					// Definition of keyword
					System.out.println("PASCAL CASING - The style of using an uppercase letter to begin an identifier and to start each new word in an identifier. Contrast with CAMEL CASING. Compare to UPPER CAMEL CASING.");
					// New line for spacing
					System.out.println("");
					// Example of use(if needed)
					System.out.println("");
					break;

				// Keyword
				case "PASSED BY REFERENCE":
					// New line for spacing
					System.out.println("");
					// Definition of keyword
					System.out.println("PASSED BY REFERENCE - Describes wht happens when a reference (address) is passed to a method. Contrast with PASSED BY VALUE.");
					// New line for spacing
					System.out.println("");
					// Example of use(if needed)
					System.out.println("");
					break;

				// Keyword
				case "PASSED BY VALUE":
					// New line for spacing
					System.out.println("");
					// Definition of keyword
					System.out.println("PASSED BY VALUE - Describes what happens when a variable is passed to a method and a copy is made in the receiving method. Contrast with PASSED BY REFERENCE.");
					// New line for spacing
					System.out.println("");
					// Example of use(if needed)
					System.out.println("");
					break;

				// Keyword
				case "PASSING ARGUMENTS":
					// New line for spacing
					System.out.println("");
					// Definition of keyword
					System.out.println("PASSING ARGUMENTS - The act of sending arguments to a method.");
					// New line for spacing
					System.out.println("");
					// Example of use(if needed)
					System.out.println("");
					break;

				// Keyword
				case "POLYMORPHISM":
					// New line for spacing
					System.out.println("");
					// Definition of keyword
					System.out.println("POLYMORPHISM - The feature of languages that allows the same word to be interpreted correctly for different situations based on the context; the act of using the same method name to indicate different implementations.");
					// New line for spacing
					System.out.println("");
					// Example of use(if needed)
					System.out.println("");
					break;

				// Keyword
				case "POPULATING AN ARRAY":
					// New line for spacing
					System.out.println("");
					// Definition of keyword
					System.out.println("POPULATING AN ARRAY - The act of providing values for all of the elements in an array.");
					// New line for spacing
					System.out.println("");
					// Example of use(if needed)
					System.out.println("");
					break;

				// Keyword
				case "POSTFIX ++":
					// New line for spacing
					System.out.println("");
					// Definition of keyword
					System.out.println("POSTFIX ++ - An operator that is composed by placing two plus signs to the right of a variable; it evaluates the variable, then adds 1 to it. Contrast with PREFIX ++");
					// New line for spacing
					System.out.println("");
					// Example of use(if needed)
					System.out.println("");
					break;

				// Keyword
				case "POSTFIX --":
					// New line for spacing
					System.out.println("");
					// Definition of keyword
					System.out.println("POSTFIX -- - An operator that is composed of two minus signs to the right of a variable; it evaluates the variable, then subtracts 1 to it. Contrast with PREFIX --");
					// New line for spacing
					System.out.println("");
					// Example of use(if needed)
					System.out.println("");
					break;

				// Keyword
				case "POSTFIX DECREMENT OPERATOR":
					// New line for spacing
					System.out.println("");
					// Definition of keyword
					System.out.println("POSTFIX DECREMENT OPERATOR - An operator that is composed of two minus signs to the right of a variable; it evaluates the variable, then subtracts 1 to it. Contrast with PREFIX DECREMENT OPERATOR.");
					// New line for spacing
					System.out.println("");
					// Example of use(if needed)
					System.out.println("");
					break;

				// Keyword
				case "POSTFIX INCREMENT OPERATOR":
					// New line for spacing
					System.out.println("");
					// Definition of keyword
					System.out.println("POSTFIX INCREMENT OPERATOR - An operator that is composed by placing two plus signs to the right of a variable; it evaluates the variable, then adds 1 to it. Contrast with PREFIX INCREMENT OPERATOR.");
					// New line for spacing
					System.out.println("");
					// Example of use(if needed)
					System.out.println("");
					break;

				// Keyword
				case "POSTTEST LOOP":
					// New line for spacing
					System.out.println("");
					// Definition of keyword
					System.out.println("POSTTEST LOOP - A loop in which the loop control varibale is tested after the loop body executes. Contrast with PRETEST LOOP.");
					// New line for spacing
					System.out.println("");
					// Example of use(if needed)
					System.out.println("");
					break;

				// Keyword
				case "PREFIX ++":
					// New line for spacing
					System.out.println("");
					// Definition of keyword
					System.out.println("PREFIX ++ - An operator that is composed by placing two plus signs to the left of a varibale; it adds 1 to the variable, then evaluates it. Contrast with POSTFIX ++");
					// New line for spacing
					System.out.println("");
					// Example of use(if needed)
					System.out.println("");
					break;

				// Keyword
				case "PREFIX --":
					// New line for spacing
					System.out.println("");
					// Definition of keyword
					System.out.println("PREFIX -- - An operator that is composed of two minus signs to the left of a variable; it subtracts 1 to the variable, then evaluates it. Contrast with POSTFIX --");
					// New line for spacing
					System.out.println("");
					// Example of use(if needed)
					System.out.println("");
					break;

				// Keyword
				case "PREFIX DECREMENT OPERATOR":
					// New line for spacing
					System.out.println("");
					// Definition of keyword
					System.out.println("PREFIX DECREMENT OPERATOR - An operator that is composed of two minus signs to the left of a variable; it subtracts 1 to the variable, then evaluates it. Contrast with POSTFIX DECREMENT OPERATOR.");
					// New line for spacing
					System.out.println("");
					// Example of use(if needed)
					System.out.println("");
					break;

				// Keyword
				case "PREFIX INCREMENT OPERATOR":
					// New line for spacing
					System.out.println("");
					// Definition of keyword
					System.out.println("PREFIX INCREMENT OPERATOR - An operator that is composed by placing two plus signs to the left of a varibale; it adds 1 to the variable, then evaluates it. Contrast with POSTFIX INCREMENT OPERATOR.");
					// New line for spacing
					System.out.println("");
					// Example of use(if needed)
					System.out.println("");
					break;

				// Keyword
				case "PRETEST LOOP":
					// New line for spacing
					System.out.println("");
					// Definition of keyword
					System.out.println("PRETEST LOOP - A loop in which the loop control a variable is tested before the loop body executes. Contrast with POSTTEST LOOP.");
					// New line for spacing
					System.out.println("");
					// Example of use(if needed)
					System.out.println("");
					break;

				// Keyword
				case "PRIMARY KEY":
					// New line for spacing
					System.out.println("");
					// Definition of keyword
					System.out.println("PRIMARY KEY - A unique identifier for data within a database.");
					// New line for spacing
					System.out.println("");
					// Example of use(if needed)
					System.out.println("");
					break;

				// Keyword
				case "PRIMING INPUT":
					// New line for spacing
					System.out.println("");
					// Definition of keyword
					System.out.println("PRIMING INPUT - The first input statement prior to a loop that will execute subsequent input statements for the same variable.");
					// New line for spacing
					System.out.println("");
					// Example of use(if needed)
					System.out.println("");
					break;

				// Keyword
				case "PRIMING READ":
					// New line for spacing
					System.out.println("");
					// Definition of keyword
					System.out.println("PRIMING READ - The first input statement prior to a loop that will execute subsequent input statements for the same variable.");
					// New line for spacing
					System.out.println("");
					// Example of use(if needed)
					System.out.println("");
					break;

				// Keyword
				case "PRIMITIVE TYPES":
					// New line for spacing
					System.out.println("");
					// Definition of keyword
					System.out.println("PRIMITIVE TYPES - A simple data type, Java's PRIMITIVE TYPES are BYTE, SHORT, INT, LONG, FLOAT, DOUBLE, CHAR, AND BOOLEAN.");
					// New line for spacing
					System.out.println("");
					// Example of use(if needed)
					System.out.println("");
					break;

				// Keyword
				case "PRIMITIVE TYPE":
					// New line for spacing
					System.out.println("");
					// Definition of keyword
					System.out.println("PRIMITIVE TYPE - A simple data type. Java's PRIMITIVE TYPES are BYTE, SHORT INT, LONG, FLOAT, DOUBLE, CHAR, AND BOOLEAN.");
					// New line for spacing
					System.out.println("");
					// Example of use(if needed)
					System.out.println("");
					break;

				// Keyword
				case "PRIVATE ACCESS":
					// New line for spacing
					System.out.println("");
					// Definition of keyword
					System.out.println("PRIVATE ACCESS - Describes a field or method that no other classes can access.");
					// New line for spacing
					System.out.println("");
					// Example of use(if needed)
					System.out.println("");
					break;

				// Keyword
				case "PROCEDURAL PROGRAMMING":
					// New line for spacing
					System.out.println("");
					// Definition of keyword
					System.out.println("PROCEDURAL PROGRAMMING - A style of programming in which sets of operations are executed one after another in sequence. Contrast with OBJECT-ORIENTED PROGRAMS.");
					// New line for spacing
					System.out.println("");
					// Example of use(if needed)
					System.out.println("");
					break;

				// Keyword
				case "PROCEDURES":
					// New line for spacing
					System.out.println("");
					// Definition of keyword
					System.out.println("PROCEDURES - Sets of operations performed by a computer program.");
					// New line for spacing
					System.out.println("");
					// Example of use(if needed)
					System.out.println("");
					break;

				// Keyword
				case "PROGRAM COMMENTS":
					// New line for spacing
					System.out.println("");
					// Definition of keyword
					System.out.println("PROGRAM COMMENTS - Nonexecuting statements added to a Java file for documentation.");
					// New line for spacing
					System.out.println("");
					// Example of use(if needed)
					System.out.println("");
					break;

				// Keyword
				case "PROGRAM STATEMENTS":
					// New line for spacing
					System.out.println("");
					// Definition of keyword
					System.out.println("PROGRAM STATEMENTS - Similar to English sentences; instructions that carry out the tasks that programs perform.");
					// New line for spacing
					System.out.println("");
					// Example of use(if needed)
					System.out.println("");
					break;

				// Keyword
				case "PROGRAMMER-DEFINED DATA TYPE":
					// New line for spacing
					System.out.println("");
					// Definition of keyword
					System.out.println("PROGRAMMER-DEFINED DATA TYPE - A typee that is created by a programmer and not built into the language; a class.");
					// New line for spacing
					System.out.println("");
					// Example of use(if needed)
					System.out.println("");
					break;

				// Keyword
				case "PROPERTIES":
					// New line for spacing
					System.out.println("");
					// Definition of keyword
					System.out.println("PROPERTIES - The characteristics that define an object; an instance variable, field, or attribute of a class.");
					// New line for spacing
					System.out.println("");
					// Example of use(if needed)
					System.out.println("");
					break;

				// Keyword
				case "PROMOTION":
					// New line for spacing
					System.out.println("");
					// Definition of keyword
					System.out.println("PROMOTION - The automatica transformation of one data type to another. Also called IMPLICIT CONVERSION.");
					// New line for spacing
					System.out.println("");
					// Example of use(if needed)
					System.out.println("");
					break;

				// Keyword
				case "PROMPT":
					// New line for spacing
					System.out.println("");
					// Definition of keyword
					System.out.println("PROMPT - A message that requests and describes user input.");
					// New line for spacing
					System.out.println("");
					// Example of use(if needed)
					System.out.println("");
					break;

				// Keyword
				case "PROPTERY":
					// New line for spacing
					System.out.println("");
					// Definition of keyword
					System.out.println("PROPTERY - The characteristics that define an object; an instance variable, field, or attribute of a class.");
					// New line for spacing
					System.out.println("");
					// Example of use(if needed)
					System.out.println("");
					break;

				// Keyword
				case "PSEUDOCODE":
					// New line for spacing
					System.out.println("");
					// Definition of keyword
					System.out.println("PSEUDOCODE - a tool that helps programmers plan a program's logic by wrtiting plain English statements without concern for programming language syntax.");
					// New line for spacing
					System.out.println("");
					// Example of use(if needed)
					System.out.println("");
					break;

				/*----------------------- LETTER Q -----------------------------*/

				/*----------------------- LETTER R -----------------------------*/

				// Keyword
				case "RANGE CHECK":
					// New line for spacing
					System.out.println("");
					// Definition of keyword
					System.out.println("RANGE CHECK - A series of statements that determine within which of a set of ranges a value falls.");
					// New line for spacing
					System.out.println("");
					// Example of use(if needed)
					System.out.println("");
					break;

				// Keyword
				case "RANGE MATCH":
					// New line for spacing
					System.out.println("");
					// Definition of keyword
					System.out.println("RANGE MATCH - The process of comparing value to the endpoints of numerical ranges to find a category to which the value belongs.");
					// New line for spacing
					System.out.println("");
					// Example of use(if needed)
					System.out.println("");
					break;

				// Keyword
				case "REDECLARE A VARIABLE":
					// New line for spacing
					System.out.println("");
					// Definition of keyword
					System.out.println("REDECLARE A VARIABLE - To attempt to declare a variable twice; an illegal action.");
					// New line for spacing
					System.out.println("");
					// Example of use(if needed)
					System.out.println("");
					break;

				// Keyword
				case "REFERENCE":
					// New line for spacing
					System.out.println("");
					// Definition of keyword
					System.out.println("REFERENCE - A variable that holds a memory address.");
					// New line for spacing
					System.out.println("");
					// Example of use(if needed)
					System.out.println("");
					break;

				// Keyword
				case "REFERENCE TO AN OBJECT":
					// New line for spacing
					System.out.println("");
					// Definition of keyword
					System.out.println("REFERENCE TO AN OBJECT - The name for a memory address where the object is held.");
					// New line for spacing
					System.out.println("");
					// Example of use(if needed)
					System.out.println("");
					break;

				// Keyword
				case "REFERENCE TYPES":
					// New line for spacing
					System.out.println("");
					// Definition of keyword
					System.out.println("REFERENCE TYPES - Data types that hold memory addresses where values are stored.");
					// New line for spacing
					System.out.println("");
					// Example of use(if needed)
					System.out.println("");
					break;

				// Keyword
				case "RELATIONAL OPERATOR":
					// New line for spacing
					System.out.println("");
					// Definition of keyword
					System.out.println("RELATIONAL OPERATOR - An operator that compares two items; and expression that contains a relations operator has a boolean value.");
					// New line for spacing
					System.out.println("");
					// Example of use(if needed)
					System.out.println("RELATIONAL OPERATOR");
					System.out.println("< > <= >= ==");
					break;

				// Keyword
				case "REMAINDER AND ASSIGN OPERATOR":
					// New line for spacing
					System.out.println("");
					// Definition of keyword
					System.out.println("REMAINDER AND ASSIGN OPERATOR - An operator that alters the value of an operand on the left by assigning the remainder when the left operand is divided by the right operand; composed of a percent sign and an equal sign (%=).");
					// New line for spacing
					System.out.println("");
					// Example of use(if needed)
					System.out.println("");
					break;

				// Keyword
				case "REMAINDER OPERATOR":
					// New line for spacing
					System.out.println("");
					// Definition of keyword
					System.out.println("REMAINDER OPERATOR - The percent sign (%); wjem it is used with two integers, the result is an integer with the value of the remainder after division takes places. Also caalled MODULUS OPERATOR.");
					// New line for spacing
					System.out.println("");
					// Example of use(if needed)
					System.out.println("");
					break;

				// Keyword
				case "RETURN A VALUE":
					// New line for spacing
					System.out.println("");
					// Definition of keyword
					System.out.println("RETURN A VALUE - To send a data value from a called method back to the calling method.");
					// New line for spacing
					System.out.println("");
					// Example of use(if needed)
					System.out.println("");
					break;

				// Keyword
				case "RETURN STATEMENT":
					// New line for spacing
					System.out.println("");
					// Definition of keyword
					System.out.println("RETURN STATEMENT - A statement that ends a method, and frquently sends a value from a called method back to the calling method.");
					// New line for spacing
					System.out.println("");
					// Example of use(if needed)
					System.out.println("");
					break;

				// Keyword
				case "RETURN TYPE":
					// New line for spacing
					System.out.println("");
					// Definition of keyword
					System.out.println("RETURN TYPE - The type of data that, upon completion of a method, is sent back to its calling method.");
					// New line for spacing
					System.out.println("");
					// Example of use(if needed)
					System.out.println("");
					break;

				// Keyword
				case "RUNTIME ERROR":
					// New line for spacing
					System.out.println("");
					// Definition of keyword
					System.out.println("RUNTIME ERROR - An error tat occurs when a program compiles successfully but does not execute.");
					// New line for spacing
					System.out.println("");
					// Example of use(if needed)
					System.out.println("");
					break;

				// Keyword
				case "RVALUE":
					// New line for spacing
					System.out.println("");
					// Definition of keyword
					System.out.println("RVALUE - An expression that can appear only on the right side of an assignment statement. Contrast with LVALUE.");
					// New line for spacing
					System.out.println("");
					// Example of use(if needed)
					System.out.println("");
					break;

				/*----------------------- LETTER S -----------------------------*/

				// Keyword
				case "SCIENTIFIC NOTATION":
					// New line for spacing
					System.out.println("");
					// Definition of keyword
					System.out.println("SCIENTIFIC NOTATION - A display format that more conveniently expresses large or small numeric values; a multidigit number is converted to a single-digit number (possibly with decimal places) and multiplied by 10 to a power.");
					// New line for spacing
					System.out.println("");
					// Example of use(if needed)
					System.out.println("");
					break;

				// Keyword
				case "SCOPE":
					// New line for spacing
					System.out.println("");
					// Definition of keyword
					System.out.println("SCOPE - The part of a program in which a variable exists can can be accesed using its unqualified name.");
					// New line for spacing
					System.out.println("");
					// Example of use(if needed)
					System.out.println("");
					break;

				// Keyword
				case "SCOPE LEVEL":
					// New line for spacing
					System.out.println("");
					// Definition of keyword
					System.out.println("SCOPE LEVEL - In Java, a variable's block. See also SCOPE.");
					// New line for spacing
					System.out.println("");
					// Example of use(if needed)
					System.out.println("");
					break;

				// Keyword
				case "SDK":
					// New line for spacing
					System.out.println("");
					// Definition of keyword
					System.out.println("SDK - A software development kit, or a set of tools useful to programmers; the Java EE Development Kit.");
					// New line for spacing
					System.out.println("");
					// Example of use(if needed)
					System.out.println("");
					break;

				// Keyword
				case "SEARCHING AN ARRAY":
					// New line for spacing
					System.out.println("");
					// Definition of keyword
					System.out.println("sEARCHING AN ARRAY - The process of comparing a value to a list of values in an array, looking for a match.");
					// New line for spacing
					System.out.println("");
					// Example of use(if needed)
					System.out.println("");
					break;

				// Keyword
				case "SEMANTIC ERRORS":
					// New line for spacing
					System.out.println("");
					// Definition of keyword
					System.out.println("SEMANTIC ERRORS - The type of errors that occur when a correct word is used in the wrong context in program code.");
					// New line for spacing
					System.out.println("");
					// Example of use(if needed)
					System.out.println("");
					break;

				// Keyword
				case "SENTINEL":
					// New line for spacing
					System.out.println("");
					// Definition of keyword
					System.out.println("SENTINEL - A value that stops a loop.");
					// New line for spacing
					System.out.println("");
					// Example of use(if needed)
					System.out.println("");
					break;

				// Keyword
				case "SEQUENCE STRUCTURE":
					// New line for spacing
					System.out.println("");
					// Definition of keyword
					System.out.println("SEQUENCE STRUCTURE - A logical structure in which one step follows another unconditionally.");
					// New line for spacing
					System.out.println("");
					// Example of use(if needed)
					System.out.println("");
					break;

				// Keyword
				case "SHADOWING":
					// New line for spacing
					System.out.println("");
					// Definition of keyword
					System.out.println("SHADOWING - The action that occurs when a local variable hides a variable with the same name that is further away in scope.");
					// New line for spacing
					System.out.println("");
					// Example of use(if needed)
					System.out.println("");
					break;

				// Keyword
				case "SHORT":
					// New line for spacing
					System.out.println("");
					// Definition of keyword
					System.out.println("SHORT - The data type that holds small integers from -32,768 - 32,767.");
					// New line for spacing
					System.out.println("");
					// Example of use(if needed)
					System.out.println("");
					break;

				// Keyword
				case "SHORT-CIRCUIT EVALUATION":
					// New line for spacing
					System.out.println("");
					// Definition of keyword
					System.out.println("SHORT-CIRCUIT EVALUATION - Describes the feature of the \"and\" and \"or\" operators in which evaluation is performed only as far as necessary to make a final decision.");
					// New line for spacing
					System.out.println("");
					// Example of use(if needed)
					System.out.println("");
					break;

				// Keyword
				case "SIDE EFFECT":
					// New line for spacing
					System.out.println("");
					// Definition of keyword
					System.out.println("SIDE EFFECT - Any action in a method other than returning a value.");
					// New line for spacing
					System.out.println("");
					// Example of use(if needed)
					System.out.println("");
					break;

				// Keyword
				case "SIGNATURE":
					// New line for spacing
					System.out.println("");
					// Definition of keyword
					System.out.println("SIGNATURE - A method's name and the number, types, and order of arguments.");
					// New line for spacing
					System.out.println("");
					// Example of use(if needed)
					System.out.println("");
					break;

				// Keyword
				case "SIGNIFICANT DIGITS":
					// New line for spacing
					System.out.println("");
					// Definition of keyword
					System.out.println("SIGNIFICANT DIGITS - Refers to a mathematical accuracy of a value.");
					// New line for spacing
					System.out.println("");
					// Example of use(if needed)
					System.out.println("");
					break;

				// Keyword
				case "SINGLE-ALTERNATIVE SELECTION":
					// New line for spacing
					System.out.println("");
					// Definition of keyword
					System.out.println("SINGLE-ALTERNATIVE SELECTION - A decision structure that performs an action, or not, based on one alternative.");
					// New line for spacing
					System.out.println("");
					// Example of use(if needed)
					System.out.println("");
					break;

				// Keyword
				case "SINGLE-PRECISION FLOATING-POINT NUMBER":
					// New line for spacing
					System.out.println("");
					// Definition of keyword
					System.out.println("SINGLE-PRECISION FLOATING-POINT NUMBER - A type of value that is stored in a \"float\".");
					// New line for spacing
					System.out.println("");
					// Example of use(if needed)
					System.out.println("");
					break;

				// Keyword
				case "SOFTWARE":
					// New line for spacing
					System.out.println("");
					// Definition of keyword
					System.out.println("SOFTWARE - The general term  for computer programs.");
					// New line for spacing
					System.out.println("");
					// Example of use(if needed)
					System.out.println("");
					break;

				// Keyword
				case "SORTING":
					// New line for spacing
					System.out.println("");
					// Definition of keyword
					System.out.println("SORTING - The process of arranging a series of objects in some logical order.");
					// New line for spacing
					System.out.println("");
					// Example of use(if needed)
					System.out.println("");
					break;

				// Keyword
				case "SOURCE CODE":
					// New line for spacing
					System.out.println("");
					// Definition of keyword
					System.out.println("SOURCE CODE - Programming statements written in a high-level programming language.");
					// New line for spacing
					System.out.println("");
					// Example of use(if needed)
					System.out.println("");
					break;

				// Keyword
				case "STANDARD ARITHMETIC OPERATORS":
					// New line for spacing
					System.out.println("");
					// Definition of keyword
					System.out.println("STANDARD ARITHMETIC OPERATORS - Operators that are used to perform calculations.");
					// New line for spacing
					System.out.println("");
					// Example of use(if needed)
					System.out.println("+ / * - %");
					break;

				// Keyword
				case "STANDARD INPUT DEVICE":
					// New line for spacing
					System.out.println("");
					// Definition of keyword
					System.out.println("STANDARD INPUT DEVICE - Usually the keyboard.");
					// New line for spacing
					System.out.println("");
					// Example of use(if needed)
					System.out.println("");
					break;

				// Keyword
				case "STANDARD OUTPUT DEVICE":
					// New line for spacing
					System.out.println("");
					// Definition of keyword
					System.out.println("STANDARD OUTPUT DEVICE - Usually the monitor.");
					// New line for spacing
					System.out.println("");
					// Example of use(if needed)
					System.out.println("");
					break;

				// Keyword
				case "STATE":
					// New line for spacing
					System.out.println("");
					// Definition of keyword
					System.out.println("STATE - The values of the attributes of an object.");
					// New line for spacing
					System.out.println("");
					// Example of use(if needed)
					System.out.println("");
					break;

				// Keyword
				case "STATIC":
					// New line for spacing
					System.out.println("");
					// Definition of keyword
					System.out.println("STATIC - A keyword that means a method is accessible and useable even though no objects of the class exist.");
					// New line for spacing
					System.out.println("");
					// Example of use(if needed)
					System.out.println("");
					break;

				// Keyword
				case "STATIC MEMBER CLASS":
					// New line for spacing
					System.out.println("");
					// Definition of keyword
					System.out.println("STATIC MEMBER CLASS - Atype of nested class that has access to all \"static\" constants without their class name.");
					// New line for spacing
					System.out.println("");
					// Example of use(if needed)
					System.out.println("");
					break;

				// Keyword
				case "STRING":
					// New line for spacing
					System.out.println("");
					// Definition of keyword
					System.out.println("STRING - A class based off of the CHAR data type.");
					// New line for spacing
					System.out.println("");
					// Example of use(if needed)
					System.out.println("");
					break;

				// Keyword
				case "STRING CLASS":
					// New line for spacing
					System.out.println("");
					// Definition of keyword
					System.out.println("STRING CLASS - A built-in Java class used to work with string data.");
					// New line for spacing
					System.out.println("");
					// Example of use(if needed)
					System.out.println("");
					break;

				// Keyword
				case "STRING VARIABLE":
					// New line for spacing
					System.out.println("");
					// Definition of keyword
					System.out.println("STRING VARIABLE - A named object of the \"String\" class.");
					// New line for spacing
					System.out.println("");
					// Example of use(if needed)
					System.out.println("");
					break;

				// Keyword
				case "STRINGBUFFER CLASS":
					// New line for spacing
					System.out.println("");
					// Definition of keyword
					System.out.println("STRINGBUFFER CLASS - A thread safe class for storing and manipulating changeable data composed of multiple characters.");
					// New line for spacing
					System.out.println("");
					// Example of use(if needed)
					System.out.println("");
					break;

				// Keyword
				case "STRINGBUILDER CLASS":
					// New line for spacing
					System.out.println("");
					// Definition of keyword
					System.out.println("STRINGBUILDER CLASS - An efficient built-in Java class for storing and manipulating changeable data composed of multiple characters.");
					// New line for spacing
					System.out.println("");
					// Example of use(if needed)
					System.out.println("");
					break;

				// Keyword
				case "STRONGLY STYPES LANGUAGE":
					// New line for spacing
					System.out.println("");
					// Definition of keyword
					System.out.println("STRONGLY TYPED LANGUAGE - A language in which all variables must be declared before they can be used.");
					// New line for spacing
					System.out.println("");
					// Example of use(if needed)
					System.out.println("");
					break;

				// Keyword
				case "STUB":
					// New line for spacing
					System.out.println("");
					// Definition of keyword
					System.out.println("STUB - A method that contains no statements programmers create stubs as temporary placeholders during the program development process.");
					// New line for spacing
					System.out.println("");
					// Example of use(if needed)
					System.out.println("");
					break;

				// Keyword
				case "SUBSCRIPT":
					// New line for spacing
					System.out.println("");
					// Definition of keyword
					System.out.println("SUBSCRIPT - An integer (contained within square brackets in Java) that indicates one of an array's variables, or elements.");
					// New line for spacing
					System.out.println("");
					// Example of use(if needed)
					System.out.println("");
					break;

				// Keyword
				case "SUBTRACT AND ASSIGN OPERATOR":
					// New line for spacing
					System.out.println("");
					// Definition of keyword
					System.out.println("SUBTRACT AND ASSIGN OPERATOR - An operator that alters the value of the operand on the left by subtracting the operand on the right from it; it is composed of a minus sign and an equal sign (-=).");
					// New line for spacing
					System.out.println("");
					// Example of use(if needed)
					System.out.println("");
					break;

				// Keyword
				case "SWITCH STATEMENT":
					// New line for spacing
					System.out.println("");
					// Definition of keyword
					System.out.println("SWITCH STATEMENT - A statement that uses up to four keywords to test a single variable against a series of exact integer or character values. The keywords are \"switch\", \"case\", \"break\", and \"default\".");
					// New line for spacing
					System.out.println("");
					// Example of use(if needed)
					System.out.println("");
					break;

				// Keyword
				case "SYMBOLIC CONSTANT":
					// New line for spacing
					System.out.println("");
					// Definition of keyword
					System.out.println("SYMBOLIC CONSTANT - A named constant.");
					// New line for spacing
					System.out.println("");
					// Example of use(if needed)
					System.out.println("");
					break;

				// Keyword
				case "SYNTAX":
					// New line for spacing
					System.out.println("");
					// Definition of keyword
					System.out.println("SYNTAX - The rules that define how language elements are used together correctly to create usable statements.");
					// New line for spacing
					System.out.println("");
					// Example of use(if needed)
					System.out.println("");
					break;

				// Keyword
				case "SYNTAX ERROR":
					// New line for spacing
					System.out.println("");
					// Definition of keyword
					System.out.println("SYNTAX ERROR - A programming error that occurs when a program contains typing errors or incorrect language use; a program containing syntax errors cannot be translated into an executable program.");
					// New line for spacing
					System.out.println("");
					// Example of use(if needed)
					System.out.println("");
					break;
				
				// Keyword
				case "SYSTEM SOFTWARE":
					// New line for spacing
					System.out.println("");
					// Definition of keyword
					System.out.println("SYSTEM SOFTWARE - The set of programs that manage the computer. Contrast with APPLICATION SOFTWARE");
					// New line for spacing
					System.out.println("");
					// Example of use(if needed)
					System.out.println("");
					break;

				/*----------------------- LETTER T -----------------------------*/

				// Keyword
				case "TERNARY OPERATOR":
					// New line for spacing
					System.out.println("");
					// Definition of keyword
					System.out.println("TERNARY OPERATOR - An operator that needs three operands.");
					// New line for spacing
					System.out.println("");
					// Example of use(if needed)
					System.out.println("");
					break;

				// Keyword
				case "THIS REFERENCE":
					// New line for spacing
					System.out.println("");
					// Definition of keyword
					System.out.println("THIS REFERENCE - A reference to an object that is passed to any object's");
					// New line for spacing
					System.out.println("");
					// Example of use(if needed)
					System.out.println("");
					break;

				// Keyword
				case "THREADS OF EXECUTION":
					// New line for spacing
					System.out.println("");
					// Definition of keyword
					System.out.println("THREADS OF EXECUTION - Units of processing that are scheduled by an operating system and that can be used to create multiple paths of control during program execution.");
					// New line for spacing
					System.out.println("");
					// Example of use(if needed)
					System.out.println("");
					break;

				// Keyword
				case "TOKEN":
					// New line for spacing
					System.out.println("");
					// Definition of keyword
					System.out.println("TOKEN - A unit of data; the \"Scanner\" class separates input into tokens.");
					// New line for spacing
					System.out.println("");
					// Example of use(if needed)
					System.out.println("");
					break;

				// Keyword
				case "TOP-LEVEL CLASS":
					// New line for spacing
					System.out.println("");
					// Definition of keyword
					System.out.println("TOP-LEVEL CLASS - The containing class in nested classes.");
					// New line for spacing
					System.out.println("");
					// Example of use(if needed)
					System.out.println("");
					break;

				// Keyword
				case "TYPE-AHEAD BUFFER":
					// New line for spacing
					System.out.println("");
					// Definition of keyword
					System.out.println("TYPE-AHEAD BUFFER - A small area of memory where keystrokes are stored before they are retrieved into a program. Also called the KEYBOARD BUFFER.");
					// New line for spacing
					System.out.println("");
					// Example of use(if needed)
					System.out.println("");
					break;

				// Keyword
				case "TYPE-WRAPPER CLASSES":
					// New line for spacing
					System.out.println("");
					// Definition of keyword
					System.out.println("TYPE-WRAPPER CLASSES - A method that can process primitive type values.");
					// New line for spacing
					System.out.println("");
					// Example of use(if needed)
					System.out.println("");
					break;
				
				// Keyword
				case "TYPE CASTING":
					// New line for spacing
					System.out.println("");
					// Definition of keyword
					System.out.println("TYPE CASTING - An action that forces a value of one data type to be used as a value of another type.");
					// New line for spacing
					System.out.println("");
					// Example of use(if needed)
					System.out.println("");
					break;

				// Keyword
				case "TYPE CONVERSION":
					// New line for spacing
					System.out.println("");
					// Definition of keyword
					System.out.println("TYPE CONVERSION - The process of converting one data type to another.");
					// New line for spacing
					System.out.println("");
					// Example of use(if needed)
					System.out.println("");
					break;

				/*----------------------- LETTER U -----------------------------*/

				// Keyword
				case "UNARY CAST OPERATOR":
					// New line for spacing
					System.out.println("");
					// Definition of keyword
					System.out.println("UNARY CAST OPERATOR - A more complete name for the cast operator that performs explicit conversions.");
					// New line for spacing
					System.out.println("");
					// Example of use(if needed)
					System.out.println("");
					break;

				// Keyword
				case "UNARY OPERATOR":
					// New line for spacing
					System.out.println("");
					// Definition of keyword
					System.out.println("UNARY OPERATOR - An operator that uses only one operand.");
					// New line for spacing
					System.out.println("");
					// Example of use(if needed)
					System.out.println("");
					break;

				// Keyword
				case "UNICODE":
					// New line for spacing
					System.out.println("");
					// Definition of keyword
					System.out.println("UNICODE - An international system of character representation.");
					// New line for spacing
					System.out.println("");
					// Example of use(if needed)
					System.out.println("");
					break;

				// Keyword
				case "UNIFYING TYPE":
					// New line for spacing
					System.out.println("");
					// Definition of keyword
					System.out.println("UNIFYING TYPE - A single data type to which all operands in an expression are converted.");
					// New line for spacing
					System.out.println("");
					// Example of use(if needed)
					System.out.println("");
					break;

				// Keyword
				case "UNINITIALIZED VARIABLE":
					// New line for spacing
					System.out.println("");
					// Definition of keyword
					System.out.println("UNINITIALIZED VARIABLE - A variable that has been declared but that has not been assigned a value.");
					// New line for spacing
					System.out.println("");
					// Example of use(if needed)
					System.out.println("UNINITIALIZED VARIABLE");
					System.out.println("double salesTax;");
					break;

				// Keyword
				case "UNNAMED CONSTANT":
					// New line for spacing
					System.out.println("");
					// Definition of keyword
					System.out.println("UNNAMED CONSTANT - A constant value that has no identifier associated with it. See also LITERAL CONSTANT.");
					// New line for spacing
					System.out.println("");
					// Example of use(if needed)
					System.out.println("");
					break;

				// Keyword
				case "UNREACHABLE STATEMENTS":
					// New line for spacing
					System.out.println("");
					// Definition of keyword
					System.out.println("UNREACHABLE STATEMENTS - Statements that cannot be executed because the logical path can never encounter them; in some languages, including Java, an unreachable statement causes a compiler error. See also DEAD CODE.");
					// New line for spacing
					System.out.println("");
					// Example of use(if needed)
					System.out.println("");
					break;

				// Keyword
				case "UPPER CAMEL CASING":
					// New line for spacing
					System.out.println("");
					// Definition of keyword
					System.out.println("UPPER CAMEL CASING - The style of using an uppercase letter to begin an identifier and to start each new word in an identifier. Also called PASCAL CAASING.");
					// New line for spacing
					System.out.println("");
					// Example of use(if needed)
					System.out.println("");
					break;

				/*----------------------- LETTER V -----------------------------*/

				// Keyword
				case "VALIDATING DATA":
					// New line for spacing
					System.out.println("");
					// Definition of keyword
					System.out.println("VALIDATING DATA - The process of ensuring that  alue falls within a specified range.");
					// New line for spacing
					System.out.println("");
					// Example of use(if needed)
					System.out.println("");
					break;

				// Keyword
				case "VARIABLE":
					// New line for spacing
					System.out.println("");
					// Definition of keyword
					System.out.println("VARIABLE - A named memory location whose contents can be altered during program execution.");
					// New line for spacing
					System.out.println("");
					// Example of use(if needed)
					System.out.println("");
					break;

				// Keyword
				case "VARIABLE DECLARATION":
					// New line for spacing
					System.out.println("");
					// Definition of keyword
					System.out.println("VARIABLE DECLARATION - A statement that reserves a named memory location.");
					// New line for spacing
					System.out.println("");
					// Example of use(if needed)
					System.out.println("");
					break;

				// Keyword
				case "VARIABLES":
					// New line for spacing
					System.out.println("");
					// Definition of keyword
					System.out.println("VARIABLES - Named memory locaions that cna hold data that is changable.");
					// New line for spacing
					System.out.println("");
					// Example of use(if needed)
					System.out.println("");
					break;

				// Keyword
				case "VOID":
					// New line for spacing
					System.out.println("");
					// Definition of keyword
					System.out.println("VOID - A keyword that, when used in a method, indicates that the method does not return any value when its called.");
					// New line for spacing
					System.out.println("");
					// Example of use(if needed)
					System.out.println("");
					break;

				/*----------------------- LETTER W -----------------------------*/

				// Keyword
				case "WHILE LOOP":
					// New line for spacing
					System.out.println("");
					// Definition of keyword
					System.out.println("WHILE LOOP - A constructor that executes a body of statements continually as long ass the boolean expression that controls entry into the loop and continues to be \"true\".");
					// New line for spacing
					System.out.println("");
					// Example of use(if needed)
					System.out.println("");
					break;

				// Keyword
				case "WHITESPACE":
					// New line for spacing
					System.out.println("");
					// Definition of keyword
					System.out.println("WHITESPACE - Any combination of nonprinting characters; for example, space, tabs, and carriage returns (blank lines).");
					// New line for spacing
					System.out.println("");
					// Example of use(if needed)
					System.out.println("");
					break;

				// Keyword
				case "WILDCARD SYMBOL":
					// New line for spacing
					System.out.println("");
					// Definition of keyword
					System.out.println("WILDCARD SYMBOL - A symbol used to indicate that it can be replaced by any set of characters. In a Java \"import\" statement, the wildcard symbol is an asterisk (*).");
					// New line for spacing
					System.out.println("");
					// Example of use(if needed)
					System.out.println("");
					break;

				// Keyword
				case "WINDOWED APPLICATIONS":
					// New line for spacing
					System.out.println("");
					// Definition of keyword
					System.out.println("WINDOWED APPLICATIONS - Programs that create a graphical user interface (GUI) with elements such as menus, toolbars, and dialog boxes.");
					// New line for spacing
					System.out.println("");
					// Example of use(if needed)
					System.out.println("");
					break;

				// Keyword
				case "WRAPPED":
					// New line for spacing
					System.out.println("");
					// Definition of keyword
					System.out.println("WRAPPED - To be encompased in another type.");
					// New line for spacing
					System.out.println("");
					// Example of use(if needed)
					System.out.println("");
					break;

				// Keyword
				case "WRAPPER":
					// New line for spacing
					System.out.println("");
					// Definition of keyword
					System.out.println("WRAPPER - A class or object that is \"wrapped around\" a simpler element.");
					// New line for spacing
					System.out.println("");
					// Example of use(if needed)
					System.out.println("WRAPPER");
					System.out.println("Integer.parseInt(JOptionPane.showMessageDialog(null, \"content\"));");
					System.out.println("Integer.parseInt(); is the wrapper.");
					break;

				// Keyword
				case "\"WRITE ONCE, RUN ANYWHERE\" (WORA)":
					// New line for spacing
					System.out.println("");
					// Definition of keyword
					System.out.println("WRITE ONCE, RUN ANYWHERE - A slogan developed by Sun Microsystems to describe the ability of one java program verion to work correctly on multiple platforms.");
					// New line for spacing
					System.out.println("");
					// Example of use(if needed)
					System.out.println("");
					break;

				// Keyword
				case "WORA":
					// New line for spacing
					System.out.println("");
					// Definition of keyword
					System.out.println("WORA - A slogan developed by Sun Microsystems to describe the ability of one java program verion to work correctly on multiple platforms.");
					// New line for spacing
					System.out.println("");
					// Example of use(if needed)
					System.out.println("");
					break;

				/*----------------------- LETTER X -----------------------------*/

				/*----------------------- LETTER Y -----------------------------*/

				/*----------------------- LETTER Z -----------------------------*/

				// Keyword
				case "":
					// New line for spacing
					System.out.println("");
					// Definition of keyword
					System.out.println("");
					// New line for spacing
					System.out.println("");
					// Example of use(if needed)
					System.out.println("");
					break;

				default:
				System.out.println("Not valid Java terminology.");
				System.out.println("Please make sure you spelled it exactly as it does in book.");
				break;
			}
		}
		kybd.close();
	}
}