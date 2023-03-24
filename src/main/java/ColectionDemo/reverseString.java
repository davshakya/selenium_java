package ColectionDemo;
public class reverseString {
    public static void main (String[] args) {
        
        String str= "Geeks";
        String  rString="";
        
        System.out.print("Original word: ");
        System.out.println("Geeks"); //Example word
        
        for (int i=0; i<str.length(); i++)
        {
             rString= str.charAt(i)+rString; //extracts each character
        }
        System.out.println(rString);
    }
}

