public class Main {
    public static void main(String args[]){
        int a=12345;
        int b=reverseMethod(a);
        System.out.println(b);

        StringBuilder b1=new StringBuilder("Rajdeep");
        StringBuilder b2=new StringBuilder("Rajdeep");
        System.out.println(b1.equals(b2));
    }

    private static int reverseMethod(int a) {
        int b=0;
        int counter=0;
        int rem=0;

        while(a!=0){
            rem=a%10;
            b=rem+(getNumberCounter(counter)*b);
            counter++;
            a=a/10;
        }
        return b;
    }

    private static int getNumberCounter(int counter) {

        if(counter==0) return 1;
        else return 10;

    }
}
