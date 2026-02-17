@FunctionalInterface
interface add{
    int calculate(int n1,int n2);

}
class f_interface {
    public static void main(String[] args) {
        //use anonymous class
        add a=new add(){
            @Override
            public int calculate(int n1,int n2){
                return n1+n2;
            }
        };
       System.out.println(a.calculate(10,20));
       
         add a1=(n1,n2)->n1+n2;// lambda expression
            System.out.println(a1.calculate(10,20));
        
    }
}