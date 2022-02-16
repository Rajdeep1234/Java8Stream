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
