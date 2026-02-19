class voterLst{
        void chekvt(int age){
            if(age>18){
                System.out.println("eligible for vote");
            }
            else{
                System.out.println("not eligible for vote");
            }
        }
}
 interface  vector {
    void checkVote(int age);

    
}

public class methodvote {
    public static void main(String[] args) {
        vector v=(age)->{
            if(age>18){
                System.out.println("eligible for vote");
            }
            else{
                System.out.println("not eligible for vote");
            }
        };
        v.checkVote(20);
        //method reference
        voterLst vl=new voterLst();
        vector v1=vl::chekvt;
        v1.checkVote(17);
    }

    
}