package myPackage;

//задачка про скобки
public class Ex1 {
    public static boolean proverkaSkobok(String inputStr) {

        String string = "";

        for(int x = 0; x < inputStr.length(); x++)
        {
            if(inputStr.charAt(x) == '(' || inputStr.charAt(x) == ')')
                string += inputStr.charAt(x);
        }

        if(string.charAt(0) == ')'
                || string.charAt(string.length()-1) == '('
                || string.length()%2 != 0)
            return false;

        //Для контроля скобок. Увеличивается при открывающей скобке, уменьшается при закрывающей
        int count = 0;

        for(int x = 0; x < string.length(); x++) {
            if(string.charAt(x) == '(')
                count++;
            else
                count--;

            //если закрывающих скобок стало больше открывающих, то false
            if(count < 0 )
                return false;
        }

        if(count != 0)
            return false;

        return true;
    }
}
