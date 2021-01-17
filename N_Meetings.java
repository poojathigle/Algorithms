package algorithms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class N_Meetings {
    public static int maxMeetings(int start[], int end[], int n) {
        // add your code here
         ArrayList<MeetingClass> list = new ArrayList<>();
        for(int i = 0; i< n; i++){
            MeetingClass a = new MeetingClass(start[i],end[i]);
            list.add(a);
        }
        Collections.sort(list, new compareMeeting());
        // or list.sort((a,b)-> a.end-b.end);
        int count = 0, c = -1;
        for(int i = 0; i< n; i++){
            if(list.get(i).start_time > c){
                c = list.get(i).end_time;
                count++;
            }
        }
        return count;
    }
}
class MeetingClass{
    int start_time=0, end_time=0;
    public MeetingClass(int start, int end){
        this.start_time = start;
        this.end_time = end;
    }
}
class compareMeeting implements Comparator<MeetingClass>{
    public int compare(MeetingClass a, MeetingClass b){
        return a.end_time - b.end_time;
    }
}