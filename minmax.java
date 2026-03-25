import java.util.*;

public class minmax {
    public static void main(String[] args) {
        List<Integer>list=Arrays.asList(12,23,45,67,11,32,54);
        Optional<Integer>result=list.stream().min((a,b)->a-b);
        result.ifPresent(System.out::println);
        //find the min value
        Optional<Integer>result1=list.stream().max((a,b)->a-b);
        result1.ifPresent(System.out::println);
       //remove the duplicate values
         List<Integer>distinct=list.stream().distinct().toList();
            System.out.println(distinct);
       //find first 4 elements using limit
       List<Integer>limit=list.stream().limit(4).toList();
         System.out.println(limit);
         //skip the first 4 elements
            List<Integer>skip=list.stream().skip(4).toList();
            System.out.println(skip);
            //find the secound smallest element
            Optional<Integer>result2=list.stream().sorted((a,b)->a-b).skip(1).findFirst();;
            result2.ifPresent(System.out::println);
            //find the secound largest element
            Optional<Integer>result3=list.stream().sorted((a,b)->b-a).skip(1).findFirst();;
            result3.ifPresent(System.out::println);
            //print top 3 higest values
            List<Integer>top3=list.stream().sorted((a,b)->b-a).limit(3).toList();
            System.out.println(top3);
            


    }
    
}
