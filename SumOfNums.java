


public class SumOfNums{
    public static void main(String arg[])
    {
        int num1=5;
        int num2=10;
        int sum;
        int sub;
        Calculator calc = new Calculator();
        sum = calc.add(num1, num2);
        System.out.println("Sum of Two Numbers is ="+ sum);
        sub = calc.sub(num1, num2);
        System.out.println("Subtraction of Two Numbers is ="+ sub);
    }
}
 class Calculator
  {
  
    public int add(int num1,int num2){
        int a = num1 + num2 ;
        return a;
    }

    public int sub(int num1, int num2)
    {
        int s;
        if(num1>num2)
        {
            s=num1 - num2;
        }
        else{
            s=num2-num1;
        }
        return s;
    }
  }