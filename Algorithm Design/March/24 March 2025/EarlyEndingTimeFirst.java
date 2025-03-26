/*import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Activity {
    int start;
    int finish;

    public Activity(int start, int finish) {
        this.start = start;
        this.finish = finish;
    }
}

public class EarlyEndingTimeFirst {
    public static List<Activity> selectActivities(List<Activity> activities) {
        // Step 1: Sort activities by their finish time in ascending order
        Collections.sort(activities, Comparator.comparingInt(a -> a.finish));

        List<Activity> selectedActivities = new ArrayList<>();
        int lastFinishTime = 0;

        // Step 2: Iterate through activities and select non-overlapping ones
        for (Activity activity : activities) {
            if (activity.start >= lastFinishTime) {
                selectedActivities.add(activity);
                lastFinishTime = activity.finish; // Update the last finish time
            }
        }

        return selectedActivities;
    }

    public static void main(String[] args) {
        // Step 3: Create a list of activities (start time, finish time)
        List<Activity> activities = new ArrayList<>();
        activities.add(new Activity(1, 3));
        activities.add(new Activity(2, 5));
        activities.add(new Activity(4, 6));
        activities.add(new Activity(6, 7));
        activities.add(new Activity(5, 9));
        activities.add(new Activity(8, 9));

        // Step 4: Call the selection method and print the selected activities
        List<Activity> selected = selectActivities(activities);

        System.out.println("Selected activities:");
        for (Activity activity : selected) {
            System.out.println("Start: " + activity.start + ", Finish: " + activity.finish);
        }
    }
}
*/