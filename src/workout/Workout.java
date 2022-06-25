package workout;


import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Workout {
    private List<Exercise> exercises;
    private String type;
    private int exerciseCount;

    public Workout(String type, int exerciseCount) {
        this.exercises = new ArrayList<>();
        this.type = type;
        this.exerciseCount = exerciseCount;
    }

    public void addExercise(Exercise exercise) {
        if (this.exerciseCount > this.exercises.size()){
            exercises.add(exercise);
        }
    }
    public boolean removeExercise (String name, String muscle){
        boolean isRemoved = false;
        for (Exercise exercise : exercises) {
            if (exercise.name.equals(name) && exercise.muscle.equals(muscle)){
                exercises.remove(exercise);
                isRemoved = true;
                break;
            }
        }
        return isRemoved;
    }

    public Exercise getExercise(String name, String muscle){
        Exercise exerciseToReturn = null;
        for (Exercise exercise : exercises) {
            if (exercise.name.equals(name) && exercise.muscle.equals(muscle)){
                exerciseToReturn = exercise;
            }
        }
        return exerciseToReturn;
    }

    public Exercise getMostBurnedCaloriesExercise(){

        Exercise exerciseWithMostBurnedCalories = null;
        int mostBurnedCalories = 0;
        for (Exercise exercise : exercises) {
            if (mostBurnedCalories < exercise.burnedCalories){
                exerciseWithMostBurnedCalories = exercise;
            }
        }
        return exerciseWithMostBurnedCalories;
    }

    public int getExerciseCount() {
        return exerciseCount;
    }

    public String getStatistics(){
        return "Workout type: " + type + System.lineSeparator() +  exercises.stream().map(Exercise::toString).collect(Collectors.joining(System.lineSeparator()));
    }
}
