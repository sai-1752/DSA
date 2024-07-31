import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Activity implements Comparable<Activity>{
    int start;
    int finish;

    public Activity(int start,int finish){
        this.start=start;
        this.finish=finish;
    }

    public int compareTo(Activity other){
        return this.finish-other.finish;
    }
}

public class activityselection{

    public static void Activity(Activity[] activity){
        Arrays.sort(activity);

        List<Activity> selectedactivities=new ArrayList<>();
        selectedactivities.add(activity[0]);

        int previousfinishtime=activity[0].finish;

        for (int i = 1; i < activity.length; i++) {
            if (activity[i].start>=previousfinishtime) {
                selectedactivities.add(activity[i]);
                previousfinishtime=activity[i].finish;
            }
        }

        System.out.println(selectedactivities.size());
        for (Activity activities : selectedactivities) {
            System.out.println("Start: " + activities.start + ", Finish: " + activities.finish);
        }
    }

    public static void main(String[] args) {
        Activity[] activity={
            new Activity(1, 4),
            new Activity(3, 5),
            new Activity(0, 6),
            new Activity(5, 7),
            new Activity(3, 8),
            new Activity(5, 9),
            new Activity(6, 10),
            new Activity(8, 11),
            new Activity(8, 12),
            new Activity(2, 13),
            new Activity(12, 14)
        };

        Activity(activity);
    }
}