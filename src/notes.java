public class notes {

    public static boolean sameString(String s1, String s2){
        return(s1==s2);
    }

    public static boolean sameStringUsingEquals(String s1, String s2){
        if(s1.equals(s2)){
            return true;
        }else{
            return false;
        }
    }

    public static boolean sameStringUsingCompareTo(String s1, String s2){
        if(s1.compareTo(s2) == 0){
            return true;
        }else{
            return false;
        }
    }

    public static String newName(String name){
        //get the first name
        //starts at - and ends at the first space
        String name3 = "Alice In Charms";
        String firstName = name.substring(0,name.indexOf(" "));
        //get the first initial
        String fi = firstName.substring(0,1);
        //get the rest of the string
        String name4 = name3.substring(name.indexOf(" ")+1);
        //get the middle name
        String middlename = name4.substring(0,(name4.indexOf(" ")+1));
        //get the middle initial
        String mi = middlename.substring(0,1);
        //get the rest of the string
        String lastname = name4.substring(name4.indexOf(" ") + 1);

        return lastname + " " + fi + " " + mi;


    }
    public static void main(String[] args) {
        String name1 = "Robert";
        String name2 = "Rob";

        System.out.println(name1.substring(0,3));
        System.out.println("comparing strings using ==");
        System.out.println(sameString(name1.substring(0,3),name2));

        name2 = "Robert";
        System.out.println(sameString(name1, name2));

        System.out.println("comparing strings using equals method");

        name2 = "Rob";
        System.out.println(sameStringUsingEquals(name1.substring(0,3),name2));

        name2 = "Robert";
        System.out.println(sameStringUsingEquals(name1.substring(0,3),name2));

        System.out.println("comparing strings using compare to");

        name2 = "Rob";
        System.out.println(sameStringUsingCompareTo(name1.substring(0,3),name2));

        name2 = "Robert";
        System.out.println(sameStringUsingCompareTo(name1.substring(0,3),name2));



    }
}
