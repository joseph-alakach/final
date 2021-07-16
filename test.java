import java.util.*;
public class test {
    public static void main (String[] args){
        String x1="esh";
        String x2=x1;
        x2="kak";
        System.out.print(x2.substring(0,2));
    } 
    
}
class Point{
    private int size;
    Point(int x){
        this.size=x;
    }
    public void setSize(int x){
        this.size=x;
    }
    public int getSize(){
        return this.size;
    }
}
