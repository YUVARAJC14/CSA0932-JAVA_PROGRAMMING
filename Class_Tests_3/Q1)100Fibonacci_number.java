public class Fibonacci{
    public static void main(String[] args){
        int a = 0,b = 1,n = 100;
        for(int i = 0;i < n;i++){
            System.out.print(a+ " ");
            int c = a + b;
            a = b;
            b = c;
        }
    }
}
