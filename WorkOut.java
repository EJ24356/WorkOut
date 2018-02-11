import java.util.Scanner;

public class WorkOut {

	static boolean set = false;
	static boolean rep = false;
	
	public static void main(String[] args) {

		
System.out.println(	"	  _   _   _   _   _   _   _  ");
System.out.println(	"	 / \\ / \\ / \\ / \\ / \\ / \\ / \\ ");
System.out.println(	"	( W | o | r | k | o | u | t )");
System.out.println(	"         \\_/ \\_/ \\_/ \\_/ \\_/ \\_/ \\_/");
		
		Scanner scan = new Scanner(System.in);

		String name;
		int sets;
		int reps;

		int numEx = 0;
		boolean b = true;

		while (b) {
			System.out.print("How many exercises? ");
			if (scan.hasNextInt())
				numEx = scan.nextInt();
			if (numEx > 0) {
				b = false;
			} else {
				System.out.println("Please enter a number");
				scan = new Scanner(System.in);
			}

		}

		Exercise[] arr = new Exercise[numEx];
    System.out.println("Random or Custom workout?  R/C");
      Scanner input = new Scanner (System.in);
          String ans= input.next();
          if (!(ans.equalsIgnoreCase("Custom")||ans.equalsIgnoreCase("C")||
        		  ans.equalsIgnoreCase("Random")||ans.equalsIgnoreCase("R")))
        	  System.exit(0);
          if (ans.equalsIgnoreCase("Custom")||ans.equalsIgnoreCase("C"))
          {
        	do
        	{
		for (int i = 0; i < arr.length; i++) {
			arr[i] = new Exercise();
			System.out.println("Exercise " + (i + 1));
			
			System.out.print("Name of exercise: ");
			name = scan.next();
			arr[i].setName(name);//name
			
			while(!set){
			System.out.print("Number of sets: ");
			if(scan.hasNextInt()) {
			sets = scan.nextInt();
			arr[i].setSets(sets);
			set=true;
			}
			else {
				System.out.println("Please enter a number");
				scan = new Scanner(System.in);
			}
			 }//set
			
			while(!rep){
			System.out.print("Number of reps: ");
			if(scan.hasNextInt()) {
			reps = scan.nextInt();
			arr[i].setReps(reps);
			rep=true;
			b=true;
			}
			else{
				System.out.println("Please enter a number");
				scan = new Scanner(System.in);
			}
		 }	//rep while	
		}//for		
		   }while(!b);//while
          }//customize
          
          else if (ans.equalsIgnoreCase("Random")||ans.equalsIgnoreCase("R"))
          {
        	  for (int i=0;i<arr.length;i++)
        	  {
        		  arr[i]=new Exercise();
        		  String exercise = Exercise.new_Exercise();
        	  arr[i].setName(exercise);
        	  arr[i].setSets(arr[i].new_set());
        	  arr[i].setReps(arr[i].new_rep());
        	  }
          }//randomize
          
      	String response;
		System.out.print("Are you ready to begin program? Y/N"+"\n");
		response = scan.next();
		if (response.equalsIgnoreCase("yes")||response.equalsIgnoreCase("y"))
			for (int i = 0; i < arr.length; i++) {
				System.out.print(arr[i].name + ": " + arr[i].sets + " sets, " + arr[i].reps + " reps");
				System.out.println();
			}
         }//main
}//WorkOut
