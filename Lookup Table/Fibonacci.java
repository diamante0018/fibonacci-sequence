package fibonacci;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;
import java.io.*;

public class Fibonacci {
	
	private HashMap<Integer, String> fibSequence;
	private File file;
	private BufferedReader br;
	
	public Fibonacci() throws FileNotFoundException {
		fibSequence = new HashMap<Integer, String>(19999);
		file = new File("C:\\Users\\Edo\\sequence.txt");
		br = new BufferedReader(new FileReader(file)); 
		
		try {
			add();
		} 
		
		catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void add() throws IOException {
		String line; 
		int i = 2;
		
		while ((line = br.readLine()) != null) {
			line = line.replace('{', Character.MIN_VALUE);
			line = line.replace('}', Character.MIN_VALUE);
			line = line.replace(',', Character.MIN_VALUE);
			
			fibSequence.put(i, line);
			i++;
		}	   
	}
	
	public void describe() {
        System.out.println("The HashMap has got " + fibSequence.size() + " numbers saved");
		
		for (Entry<Integer, String> entry : fibSequence.entrySet()) {
		    System.out.println("Fn = " + entry.getKey() + " is:  " + entry.getValue());
		}	
	}
	
	public String get(Integer n) {
		return fibSequence.get(n);
	}

	public static void main(String[] args) throws FileNotFoundException {
		Fibonacci fib = new Fibonacci();
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter Fn: ");
		Integer n = input.nextInt();
		input.close();
		
		if (n<2) {
			System.out.println("Fn is too small!");
			System.exit(0);
		}
		
		System.out.println("Fn is: " + fib.get(n));
	}

}
