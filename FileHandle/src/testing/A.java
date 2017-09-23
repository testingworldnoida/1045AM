package testing;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class A {


	
	public static void main(String[] args) throws IOException {

       B o = new B();     
       B.a=10;    
       System.out.println(B.a);
	System.out.println("Testing");	
	}
	
	
}
