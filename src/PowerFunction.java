import java.util.Scanner;

public class PowerFunction {
    static int calculate(int num,int base,int divisor)
    {
        if(base==0)
        {
            return 1;
        }
        int result=calculate(num,base/2,divisor);
        if(base%2==0)
        {
            return (result*result)%divisor;
        }
        return (result*result*num)%divisor;
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int num=scanner.nextInt();
        int base=scanner.nextInt();
        int divisor=scanner.nextInt();
        System.out.println(calculate(num,base,divisor));
    }
}
