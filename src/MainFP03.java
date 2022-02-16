import java.util.List;
import java.util.Locale;
import java.util.Random;
import java.util.function.*;
import java.util.stream.Collectors;

public class MainFP03 {
    public static void main(String args[]){
        List<Integer> numbers= List.of(1,2,3,4,5);

        BinaryOperator<Integer> sum = new BinaryOperator<Integer>() {
            @Override
            public Integer apply(Integer integer, Integer integer2) {
                return integer+integer2;
            }
        };
       System.out.println( numbers.stream().reduce(0, sum));


        Function<Integer, Integer> integerIntegerFunction = x -> x * x*x;
        numbers.stream().map(integerIntegerFunction);

      List<Integer> numberlist= behaviourParamerterizaion(numbers, integerIntegerFunction);
      System.out.println(numberlist);

        Supplier<Integer> randomItegerSuppiler=()->{
         return   new Random().nextInt();
        };
        System.out.println(randomItegerSuppiler.get());

        UnaryOperator<Integer> unaryOperator=(x)->3*x;

        System.out.println(unaryOperator.apply(4));

        BiPredicate<Integer, String> biPredicate=(x,y)-> {
            
            return x>10 && y.length()>5;
        };

       System.out.println(biPredicate.test(12,"testing"));

       BiFunction<Integer, String,Boolean> biFunction=(x,y)-> {

           return x>10 && y.length()>5;
       };

       System.out.println(biFunction.apply(15,"testing"));


       BiConsumer<String,String> biConsumer=(x,y)->{
          System.out.println(x+" "+y);
       };

       biConsumer.accept("testing","abccdcd");

        List<String> courses = List.of("Spring", "Spring Boot", "API" , "Microservices","AWS", "PCF","Azure", "Docker", "Kubernetes");

        courses.stream()
                .map(String::toUpperCase).forEach(System.out::println);

    }

    private static List<Integer> behaviourParamerterizaion(List<Integer> numbers, Function<Integer, Integer> integerIntegerFunction) {
       return numbers.stream().map(integerIntegerFunction).collect(Collectors.toList());

    }
}
