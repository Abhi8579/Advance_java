 interface calc {
    void calculate(int n1,int n2);
     default void calculate(int n1,int n2,int n3) {
    
     int s=n1+n2+n3;
     System.out.println(s);
     }


    
}

class sum implements calc{
    public void calculate(int n1,int n2){
        int s=n1+n2;
        System.out.println(s);
    }
    public void calculate(int n1,int n2,int n3){
        int s=n1+n2+n3;
        System.out.println(s);
    }
}
public class java_8 {
    public static void main(String[] args) {
        sum s=new sum();
        s.calculate(10, 20);
        s.calculate(10, 20, 30);
    }
}