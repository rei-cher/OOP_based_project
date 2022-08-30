package finalexam;

public class Time {
    private int hour;
    private int mins;
    private int secs;
    
    Time(){
        hour=0;
        mins=0;
        secs=0;
    }
    
    Time(int h, int m, int s){
        hour=h;
        mins=m;
        secs=s;
    }
    
    public int getHour(){
        return hour;
    }
    
    public int getMinute(){
        return mins;
    }
    
    public int getSecond(){
        return secs;
    }
    
    public void setHour(int h) throws IllegalArgumentException{
        if(h<0||h>24){
            throw new IllegalArgumentException("Wrong hour set");
        }
        hour=h;
    }
    
    public void setMinute(int m){
        if(m<0||m>24){
            throw new IllegalArgumentException("Wrong minutes set");
        }
        mins=m;
    }
    
    public void setSecond(int s){
        if(s<0||s>24){
            throw new IllegalArgumentException("Wrong seconds set");
        }
        secs=s;
    }
    
    public void Display(){
        System.out.println(hour+":"+mins+":"+secs);
    }
    
    public boolean isGreater(Time t){
        if (hour>t.hour) return true;
        else if(hour==t.hour)
        {
            if(mins>t.mins) return true;
            else if (mins==t.mins){
            if(secs>t.secs) return true;
            }
        }
        return false;
    }
    
    public boolean isEqual(Time t){
        return (mins==t.mins)&&(hour==t.hour);//&&(secs=t.secs);
    }
    
    public void increment(){
        secs++;
        if (secs>59){
            mins++;
            if(mins>59){
                hour++;
            }
        }
    }
    
}
