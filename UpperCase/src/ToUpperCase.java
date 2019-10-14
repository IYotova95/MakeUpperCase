public class ToUpperCase {
        public static String MakeUpperCase(String str) {
            String upper = str.toUpperCase();
            System.out.println(upper);
            return upper;

        }

        public static void main(String[] args) {
            MakeUpperCase("hello");
        }
}
