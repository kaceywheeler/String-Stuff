import StringRunner;
class StringStuff {
    
    int len;
    char first;
    char last;

    //Method to return first and last letters as a new string
    public String firstLast (String text) {

        //Find length of text
        len = text.length();

        //Find first letter
        first = text.charAt(0);
        
        //Find last letter
        last = text.charAt((len-1));
        
        String answer = ("" + first + last);
        return answer;
    }

    //Method to return middle letter 
    public char middle (String text) {

        //Find length of text
        len = text.length();

        //Find the index for the middle which is half of the length
        int mid_index = len / 2;

        //Find the char at the middle index
        char mid = text.charAt(mid_index);

        //Return the middle character
        return mid;
    }

    //Method to see if first and last letter are same
    public String isSame (String text) {
        String result;
        
        //Find first letter
        first = text.charAt(0);
        
        //Find last letter
        last = text.charAt(len-1);
        
        
        //If the letters are the same
        if (first == last) {
            result = "true";
        }

        //If the letters aren't the same
        else {
            result = "false";
        }

        //Return the result
        return result;

    }
  

}