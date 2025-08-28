public class LongestcommonPrefix {

    public static String longestCommonPrefix(String[] str) {

      if(str == null || str.length == 0){
        return "";
      }
     String first=str[0];
     int prefixlen=first.length();

     for(int i=1;i<str.length;i++){
      int j=0;
      
      while(j<prefixlen && j<str[i].length() && first.charAt(j)==str[i].charAt(j)){
        j++;
      }
      prefixlen=j;
      if(prefixlen ==0 ){
        return "";
      }

     }
     return first.substring(0,prefixlen);
  }
  public static void main(String[] args) {
    String []str={"flower","flow","flew"};
    System.out.println("longest common prefix "+ longestCommonPrefix(str));
  }
}

