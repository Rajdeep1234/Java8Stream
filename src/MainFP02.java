import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MainFP02 {
    public static void main(String args[]){
        List<Integer> list=new ArrayList<>();
        list.add(12);
        list.add(8);
        list.add(89);
        list.add(78);

        List<Integer> numbers=List.of(1,2,3,4,5,6,7,8,9);
//       List<Integer> doubledNumber= numbers.stream().map(x->x*x).collect(Collectors.toList());
//        System.out.println(doubledNumber);

        List<Integer> evenNumbers=numbers.stream().filter(x->x%2==0).collect(Collectors.toList());
      //  System.out.println(evenNumbers);

        List<String> courses=List.of("Spring", "Spring Boot", "API" , "Microservices","AWS", "PCF","Azure", "Docker", "Kubernetes");
        List<Integer> courseLength=courses.stream().map(x->x.length()).collect(Collectors.toList());
        System.out.println(courseLength);



      //  addNumberStructured(list);
      //System.out.println( "functional output "+ addNumberFUnctional(list));
    }

    private static int addNumberFUnctional(List<Integer> list) {
     // return  list.stream().reduce(0,MainFP02::sum);
      //  return list.stream().reduce(0,(x,y)->x+y);
        return list.stream().reduce(0,Integer::sum);
    }

    private static Integer sum(Integer integer, Integer integer1) {
        System.out.println(integer+" "+integer1);
        return integer+integer1;
    }


    private static void addNumberStructured(List<Integer> list) {
        int temp=0;
        for(int num:list)
        {
            temp+=num;
        }
        System.out.println(temp);
    }
}
