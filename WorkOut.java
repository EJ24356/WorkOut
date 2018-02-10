import java.util.Scanner;

public class WorkOut {

	public static void main(String[] args) {

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
				System.out.print("Please enter a number");
				scan = new Scanner(System.in);
			}

		}

		Exercise[] arr = new Exercise[numEx];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = new Exercise();
			System.out.println("Exercise: " + (i + 1));
			System.out.print("Name of exercise: ");
			Scanner n = new Scanner(System.in);
			name = n.next();
			arr[i].setName(name);
			System.out.print("Number of sets: ");
			sets = scan.nextInt();
			arr[i].setSets(sets);
			System.out.print("Number of reps: ");
			reps = scan.nextInt();
			arr[i].setReps(reps);
		}

		String response;
		System.out.print("Are you ready to begin program?");
		response = scan.next();
		if (response.equals("yes"))
			for (int i = 0; i < arr.length; i++) {
				System.out.print(arr[i].name + ": " + arr[i].sets + " sets, " + arr[i].reps + " reps");
				System.out.println();
			}

	}

}
