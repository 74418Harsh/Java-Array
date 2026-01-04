public class Test {
    public static void main(String[] args) {
        String s1 = "Gitanjali";
        String s2 ="Priya";

       // System.out.println(s1.concat(s2)); Output =GitanjaliPriya

       s1.concat(s2);
       //System.out.println(s1); Output = Gitanjali

       s1= s1.concat(s2);
      // System.out.println(s1); Output =GitanjaliPriya
    }
}
