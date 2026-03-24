import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
//compartable and comparable
public class sorted {
    //it is most important
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(1,2,30,40,50,6,7,8,9,10);

        List<Integer>sortedlist=list.stream().sorted((a,b)->b-a).toList();
        System.out.println(list);


        List<Integer>sortedlist1=list.stream().sorted((a,b)->a-b).toList();
        System.out.println(sortedlist1);
//find out top 3 highest no
        List<Integer>top3=list.stream().sorted((a,b)->b-a).limit(3).toList();
        System.out.println(top3);//we can use skip mean start sa kitna skip kar sakta hai



        //sort only even no
        List<Integer>even=list.stream().filter(x->x%2==0).sorted((a,b)->b-a).toList();
        System.out.println(even);


        //sort list and store in new list
        List<Integer>dup=list.stream().distinct().sorted((a,b)->b-a).toList();
        System.out.println(dup);

        //secound highest
      
       List<Integer>secondh = list.stream().sorted(Comparator.reverseOrder()).toList().get(1);        
       System.out.println(secondh);
        

        //sorted no grater than 20
        List<Integer>twegre=list.stream().filter(x->x>20).sorted((a,b)->b-a).toList();
        System.out.println("grater than 20 "+twegre);
        //decending order store in new list




        List<String> str= Arrays.asList("abhi","subhi","aman","raman");
        //sort alphabetically
        str.stream().sorted((a, b) -> b.compareTo(a))



    }
}