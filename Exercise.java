import java.util.Random;


public class Exercise {

	public String name;
	int sets;
	int reps;
	private static int arrayIndex = 0;
	
	enum EXERCISES { pushups, situps, squats, lunges , crunches, leg_raises, dips , 
		pullups , reverse_crunches, scissors, flutter_kicks , butterflys }
	static String[] EX_ARRAY = new String[EXERCISES.values().length];
	public Exercise() {
		name = "";
		sets = 0;
		reps = 0;
	}
	
	public void setName (String n) {
		name = n;
	}
	
	public void setSets (int s) {
		sets = s;
	}
	
	public void setReps (int r) {
		reps = r;
	}
	
	public static void shuffle()
	{
		Random ran = new Random();
          int index1, index2;
		
		for(int i=0; i<17; i++) //Performs 80 random "swaps" of indices.
		{
			
			index1 = ran.nextInt(11); //random index between 0-19
			index2 = ran.nextInt(11); //random index between 0-19
			swap(index1, index2);
		}
		
	}//shuffle
	
	public static void swap(int a, int b) //swaps items @ indices a & b in WORD_ARRAY
	{
		String temp = EX_ARRAY[a];
		EX_ARRAY[a] = EX_ARRAY[b];
		EX_ARRAY[b] = temp;
	}//swap
	
	
	public static void ExerciseARRAY()
	{
		int i = 0;
		for (EXERCISES e: EXERCISES.values())
		{
			EX_ARRAY[i] = e.toString();
			i++;
		}
		shuffle();
	}//EXERCISE_ARRAY
	
	public static String new_Exercise()
	{
		if(arrayIndex == 0)
			ExerciseARRAY();
		
		String myExercise = EX_ARRAY[arrayIndex];
		arrayIndex++;
		return myExercise;
		
	}
	
	public int new_set()
	{
		Random s =new Random();
		while(sets<=1)
		sets = s.nextInt(5);
		return sets;
	}
	
	public int new_rep()
	{
		Random r =new Random();
		while(reps<=1)
		reps = r.nextInt(10);
		return reps;
	}
	
}//EXERCISE