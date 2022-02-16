https://github.com/in28minutes/functional-programming-with-java/blob/master/code.md
Topics
1. method reference
2. stream
3. filter
4. map
5. foreach
6. reduce
7. distinct
8. sorted
  sort in reverse order by length
   courses.stream().sorted((x,y)->y.length()-x.length()).forEach(System.out::println)
9. collect


10. Intermediate operation--steam, map, filter,sorted, distinct 
11. Terminal operation -- forEach,reduce
12. collect--specific return type
13. Functional Interface------>
14. Function<T,R>; Predicate<T>; Consumer<T,R>
15. Behaviour Parameterization
16. BinaryOperator<Integer>--operator: all the params are of the same types, two inputs  
      and one out put

17. Supplier-- no input / but returns
18. UnaryOperator<Integer>
19. BiPredicate
20. Biunction
21. BiConsumer
22. allmatch, nonematch, anymatch
23. Comparator
24. limit, skip, 
25. takewhile---if one element breaks the criteria we will not consider anything after this
26. dropwhile--as long as condition is true we will skip the elements , when we get
                 any element which does not meet the requirement we will consider all the elements 
                 including this
27. top, max, min, findFirst, findAny
28. Collect--Collectors--grouping by , maxBy, mapping
29. Stream.of(), Arrays.stream(new int[] {1,2,3})--stream with primitive value
30. IntStream.iterate, IntStream.range()
31. BigInteger 
32. flatMap
33. HigherOrder function
34. peek()
35. intermediate operations are lazy--executed on the basis of terminal operation--
        execute the work only what is needed
36. Parallel stream
37. removeIf --replaceAll
38. File operations
39. 

