class Java10 {
    public static void main(String[] args) {
        //local variable type inference=>It is a feature of java 10 that allows us to declare local 
        // variables without specifying their type. the compiler will infer the type of the variable
        //  based on the value assigned to it.

        //encapsulation def=>
        
        
        var a=10;
        var b=20;
        var c=a+b;
        var name="java 10";
        var d=3.14;
        System.out.println("sum=> "+c);
        var name1=new String("java 10");
        //for each loop with var
        int[] arr={1,2,3,4,5};
        for(var i:arr){
            System.out.println(i);
        }
    }
}