public class prac1 {
    public static void main(String[] args) {
        StringBuffer s = new StringBuffer("bhumika");//here string is mutble both String and StringBuffer are different types
        s=s.append(" Y");
        s=s.insert(0," Java ");
        s=s.delete(0, 5);
        System.out.println(s);
    }
}
