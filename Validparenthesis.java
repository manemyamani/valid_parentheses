package collections.stack;
import java.util.*;

public class Validparenthesis {
    public static  boolean validcheck(String s){
        Stack<Character>stack=new Stack<>();

        for(char c: s.toCharArray()){

            if(c=='('||c=='{'||c=='['){
                stack.push(c);

            }
            else{
                if(stack.empty()){
                    return false;
                }
            

            char top=stack.pop();

            if(c==')'&&top!='('|| c=='}' &&top!='{'||c==']'&&top!='['){
                return false;
            }
        }
    }
        return stack.isEmpty();
        
        


    }    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String p=sc.next();
        boolean b=validcheck(p);
        if(b==true){
        System.out.println("valid expression");
        }
        else{
            System.out.println("not a valid expression");
        }

        sc.close();
        
    }
    
}
