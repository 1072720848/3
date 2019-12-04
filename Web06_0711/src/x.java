public class x {
    public static void main(String[] args) {
        System.out.println(x.class.getClassLoader().getResourceAsStream("druid.properties"));
    }
}
