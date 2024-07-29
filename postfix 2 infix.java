import java.util.Scanner;
import java.util.Stack;
class main
{
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        String str=s.nextLine();
        String res=convert(str);
        System.out.print(res);
    }
    public static String convert(String str)
    {
        Stack<String> ss=new Stack<>();
        
        for(int i=0;i<str.length();i++)
        {
            char c=str.charAt(i);
            
            if(Character.isLetterOrDigit(c))
            {
                ss.push(Character.toString(c));
            }
            else if(c=='+'||c=='-'||c=='*'||c=='/'||c=='^')
            {
                String op2=ss.pop();
                String op1=ss.pop();
                String exp="(" + op1 + c + op2 + ")";
                ss.push(exp);
            }
        }
        return ss.pop();
    }
}
