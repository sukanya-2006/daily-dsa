

public class basics {

    public static void printletters(String str){
        int count = 0;
        for(int i = 0; i<str.length(); i++){

            char ch = str.charAt(i);
           if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
            System.out.print(ch + " ");
            count++;
            
           }
        }
        System.out.println();
        System.out.print(count);
    }
    public static void main(String[] args) {
        // 
        


        //string length
        // String fullName = "Tony Stark";
        // System.out.println(fullName.length());


        //string concatenation
       String firstname = "Sukanya";
       String lastname = "Bhowmick";
       String fullname =  firstname + " " + lastname;
       //System.out.println(fullname);
       //System.out.println(fullname.charAt(0));
      printletters(fullname);
    }
}
