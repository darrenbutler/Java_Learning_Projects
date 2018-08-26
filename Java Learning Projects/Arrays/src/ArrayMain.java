public class ArrayMain {
    public static void main (String []args){
        ArrayCode();
        dislikes();
        }//end Main

    static void ArrayCode(){
        String[] likes = new String[3];
        likes[0] = "Piano";
        likes[1] = "Strawberries";
        likes[2] = "Pineapple";

        System.out.println("This is what I like:");

        for (int x =0; x <3; x++) {
            System.out.println(likes[x]);
        }//End for loop
    }//End Array code method

    //When you don't have a specific length for an array use this:
    static void dislikes(){
        String[] dislikes = new String[]{"Cole slaw", "Ignorance", "Low-brow comedy", "Flies", "Delayed flights", "Greasy food",
                "Cirurscee"};
        System.out.println("");
        System.out.println("This is what I don't like");

        for (int x = 0; x < dislikes.length; x++) {
            System.out.println(dislikes[x]);
        }

    }
}//End ArrayMain class
