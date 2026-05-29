public class LargestString{
    

    public static void main(String args[]){
        String strs[] = {"apple", "mango", "banana"};
        String largest = strs[0];
         for(int i =1; i<strs.length ; i++){
             if(largest.compareTo(strs[i]) < 0){
                largest = strs[i];
             }
        }

        System.out.println("apple".compareToIgnoreCase("Apple"));

        System.out.println(largest);

    

    }
}