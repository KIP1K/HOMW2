public class Main2 {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double heightMetr = (100);
        double weightKg = (1.25);
        int bmi = service.calculate(heightMetr,weightKg);//должно получиться 64
        System.out.println(bmi);
    }
}
