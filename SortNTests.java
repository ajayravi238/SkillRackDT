import java.time.*;

class Test implements Comparable<Test> {
    private String sub;
    private LocalTime time;
    private int duration;
    
    public Test(String sub, String time, int duration) {
        this.sub = sub;
        this.time = LocalTime.parse(time);
        this.duration = duration;
    }
    
    @Override
    public int compareTo(Test x) {
        int temp = this.time.compareTo(x.time);
        if(temp != 0) {
            return temp;
        }
        temp = Integer.compare(this.duration, x.duration);
        if(temp != 0) {
            return temp;
        }
        return this.sub.compareTo(x.sub);
    }
    
    @Override
    public String toString() {
        return String.format("%s %s %d", sub, time.toString(), duration);
    }
}
