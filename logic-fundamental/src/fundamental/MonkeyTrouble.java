package fundamental;

public class MonkeyTrouble {

    /*
    We have two monkeys, a and b, and the parameters aSmile and bSmile indicate if each is smiling. We are in trouble if they are both smiling or if neither of them is smiling. Return true if we are in trouble.

    monkeyTrouble(true, true) → true
    monkeyTrouble(false, false) → true
    monkeyTrouble(true, false) → false
    */

    public static void main(String[] args) {
        /*
        TestCase
        monkeyTrouble(true, true) → true
        monkeyTrouble(false, false) → true
        monkeyTrouble(true, false) → false
         */

        System.out.println(monkeyTrouble(true, true));
        System.out.println(monkeyTrouble(false, false));
        System.out.println(monkeyTrouble(true, false));
        System.out.println(monkeyTrouble(false, true));
    }

    public static boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
        boolean result = false;

        if (aSmile && bSmile){
            result = true;
        }

        if (!aSmile && !bSmile){
            result = true;
        }

        return result;
    }


}
