/**
*****************************************************************************************************
* By writing your name in the space provided below, you are honouring the CIS academic honesty pledge 
* “I have neither given nor received unauthorized aid on this piece of work.”
* NAME: 
*****************************************************************************************************
*/

public class Main {
    
    }
 
    // 1. add
    public int add(int num1, int num2) {
        return (num1 + num2);
    }
        // 2. add
    public int add(int num1, int num2, int num3, int num4) {        
        return (add(num1, add(num2, add(num3, num4))));
    }
        // 3. morningGreeting
    public String morningGreeting(String name) {
        System.out.println("早上好"+name+"!");
        return name;
    }
        // 4. afternoonGreeting
    public String afternoonGreeting(String name) {
        System.out.println("下午好, "+name+"!");
        return name;
    } 
        // 5. triple
    public String triple(String word) {
        String triple = (word + word + word);
        System.out.println(triple);
        return triple;
    }
    // 6. half

    // 7. roundPositiveValueToNearestInteger

    // 8. roundNegativeValueToNearestInteger
