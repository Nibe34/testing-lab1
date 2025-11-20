public class Main {
    public static void main(String[] args) {
        BmiCalculator person = new BmiCalculator(80, 1.52);
        System.out.println(person.getCategory());
    }
}
