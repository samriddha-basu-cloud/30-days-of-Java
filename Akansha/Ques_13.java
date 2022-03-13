class Thirteenth {
     public static void main(String[] args) {
     String se  =  "apple";
    System.out.println("Original string: "+se);
       char str[] = se.toCharArray();
       int n = str.length; 
     int start=0,end = n-1;
     while(start<=end){
           char temp = str[start];
         str[start] = str[end];
         str[end] = temp;
          start++;
          end--; }
     String reversedString = String.valueOf(str);
     System.out.println("Reversed string: "+reversedString);
 }

}

