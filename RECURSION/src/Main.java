public class Main {
    public static void main(String[] args) {
        //WRITE A FUNCTION THAT TAKES IN NUMBER AND PRINTS IT
        //PRINT FIRST 5 NUMBERS
        print(1);
    }
    static void print(int n){
        if(n==5){//base condition
            System.out.println(5);
            return; 
        }
        System.out.println(n);
        //recursive call
        //if you are calling a function again ana again, you can treat it as a separate call in the stack
        print(n+1);
    }
}