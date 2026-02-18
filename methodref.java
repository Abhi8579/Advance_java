class Calculator{
    Calculator(){
        System.out.println("Constructor called");
    }
    Calculator(int n,int m){
        System.out.println("Constructor with parameter called: "+n+m);
    }
    int sub(int n1,int n2){
        return n1-n2;
    }
    static int mul(int n1,int n2){
        return n1*n2;
    }
}
@FunctionalInterface
interface cals{
    int cal(int n1,int n2);
}

//constructor allow ,if  constructor parameter and functional interface method  parameter
//  are same then only we can use constructor reference

public class methodref {
    public static void main(String[] args) {
        Calculator c=new Calculator();
        int result=c.sub(10,5);
        System.out.println(result);
        // instance method reference

        cals c1=c::sub;
        int s1=c1.cal(20, 10);
        System.out.println("Sub=> "+s1);
        // static method reference
        cals c2=Calculator::mul;
        int s2=c2.cal(5, 6);
        System.out.println("multily=> "+s2);
        // constructor reference
        // cals c3=Calculator::new;
        // int s3=c3.cal(10, 20);//its throw error because constructor does not return any value
        

        
    }
}