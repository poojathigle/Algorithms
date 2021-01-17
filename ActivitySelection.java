package algorithms;

import java.util.*;

class ActivityClass{
    int start_time=0, end_time=0;
    public ActivityClass(int start, int end){
        this.start_time = start;
        this.end_time = end;
    }
}
class compareActivities implements Comparator<ActivityClass>{
    public int compare(ActivityClass a, ActivityClass b){
        return a.end_time - b.end_time;
    }
}

class Activity
{
    static int activitySelection(int start[], int end[], int n)
    {
        // add your code here
        ArrayList<ActivityClass> list = new ArrayList<>();
        for(int i = 0; i< n; i++){
            ActivityClass a = new ActivityClass(start[i],end[i]);
            list.add(a);
        }
        Collections.sort(list, new compareActivities());
        // or list.sort((a,b)-> a.end-b.end);
        int count = 0, c = -1;
        for(int i = 0; i< n; i++){
            if(list.get(i).start_time >= c){
                c = list.get(i).end_time;
                count++;
            }
        }
        return count;
    }
}