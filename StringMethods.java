public class StringMethods{
    public static void main(String[] args){
        String s = "Computer Science Engineer";
        //s=s.concat(" Delta ") ;
        //System.out.println(s);
        System.out.println(s.length());//length of the characters
        System.out.println(s.substring(0,11));//elements from initial position to wanted elements
        System.out.println(s.charAt(0));
        System.out.println(s.charAt(4));//index position of the element

        String s2="Java,python,c++";
        String[] arr=s2.split(",");
        for(String lang:arr){
            System.out.println(lang+" ");
        }
    }
}