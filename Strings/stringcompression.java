public class stringcompression {
    public static String compress(String str){

        StringBuilder sb = new StringBuilder("");
        


         for(int i = 0; i<str.length(); i++){
            int count  = 1;
              char ch = str.charAt(i);
              while(i + 1 < str.length() && str.charAt(i) == str.charAt(i+1)){
                count++;
                i++;

              }
              sb.append(ch);

              if(count > 1){
                sb.append(count);

              } 

         }

         return sb.toString();
    }
    public static void main(String args[]){
        String str = "aaabbcccdd";
        System.out.println(compress(str));
    }
}
