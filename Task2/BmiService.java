public class BmiService {
    public int calculate(double weightKg, double heightMetr) {
        double index = weightKg / (heightMetr * heightMetr);
        return (int) index;
    }
}