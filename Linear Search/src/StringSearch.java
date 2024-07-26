public class StringSearch {
    public static void main(String[] args) {
        String a = "Tushar";
        char target = 'v';

        System.out.println(SearchString(a,target));

    }

    public  static  boolean SearchString(String name, char target){
        if (name.toCharArray().length == 0){
            //checking the length of name with converting it to array first
            return false;
        }
        for(char i : name.toCharArray()){
            if(i==target){ //Target found -> True
                return true;

            }
        }

        return false;
    }




}
