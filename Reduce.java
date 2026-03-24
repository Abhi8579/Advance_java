import java.util.Arrays;
import java.util.List;
import java.util.stream.LongStream;

public class Reduce {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
        //find out secound highest
        int max=list.stream().reduce(0, (a,b)->a>b?a:b);

        System.out.println(max);
        int sec=list.stream().reduce(0,(a,b)->a>b && a<max? a:b);
        System.out.println(sec+"max secound");
        //add all the number output=>15 inital value 0 hai and In case of multiplicatin  then initeal value 1
        float sum=list.stream().reduce(0, (a,b)->a+b);
        System.out.println(sum);

        //secound large no


        //avg
        float avg=list.stream().reduce(0, (a,b)->a+b)/list.size();
        System.out.println(avg+"avg");

        //find the max element
        int max1=list.stream().reduce(0, (a,b)->a>b?a:b);

        System.out.println(max);
        int sec1=list.stream().reduce(0,(a,b)->a>b && a<max? a:b);
        System.out.println(sec+"max secound");

       //find smallest
        int small=list.stream().reduce(0, (a,b)->a<b?a:b);
        System.out.println(small);

        //count element in list
        int element=list.stream().reduce(0, (a,b)->a+1);
        System.out.println(element);

        //sum of even number
        int even =list.stream().reduce(0, (a,b)->a+(b%2==0?b:0));
        System.out.println(even);

        //find th sum of square
//        int sqe=list.stream().reduce(0, (a,b)->a*b);
//        System.out.println(sqe+"sqr");

          List<String>concat=Arrays.asList("abc","b","c","d","e");
          String longest = concat.stream()
                .reduce("", (a, b) -> a.length() >= b.length() ? a : b);
        System.out.println("Longest: " + longest);



          //concat the list all value
        String concatStr=concat.stream().reduce("",(a,b)->a+" "+b);
        System.out.println(concatStr);



        List<Integer> list1 = Arrays.asList(15456);
        /// add digits

        int sum1 = list1.stream()
                .flatMapToInt(num -> String.valueOf(num)
                        .chars()
                        .map(c -> c - '0'))
                .sum();

        System.out.println("Sum of digits: " + sum1);


        int number = 5;

        long factorial = LongStream.rangeClosed(1, number)
                .reduce(1, (a, b) -> a * b);

        System.out.println("Factorial of " + number + " = " + factorial);


    }
}
