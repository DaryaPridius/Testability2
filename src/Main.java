public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int weightKg = 55;
        double heightM = 1.7;
        int BMI = service.calculate(55, 1.7);
        System.out.println(BMI);


    }
}
