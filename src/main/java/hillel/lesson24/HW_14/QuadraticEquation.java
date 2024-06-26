package hillel.lesson24.HW_14;

public class QuadraticEquation {

    private final double secondPowerCoefficient;
    private double firstPowerCoefficient;
    private double zeroPowerCoefficient;

    public QuadraticEquation(double secondPowerCoefficient, double firstPowerCoefficient, double zeroPowerCoefficient) {
        this.secondPowerCoefficient = secondPowerCoefficient;
        this.firstPowerCoefficient = firstPowerCoefficient;
        this.zeroPowerCoefficient = zeroPowerCoefficient;
    }
    public double[] getRoots() {
        double discriminant = getDiscriminant();
        double[] roots;

        if(discriminant < 0) {
            return null;
        } else if (discriminant == 0) {
           roots = new double[1];
           roots[0] = (- 1 * firstPowerCoefficient) / (2 * secondPowerCoefficient);

        } else {
            roots = new double[2];
            roots[0] = (-1 * firstPowerCoefficient + Math.sqrt(discriminant)) / (2 * secondPowerCoefficient);
            roots[1] = (-1 * firstPowerCoefficient - Math.sqrt(discriminant)) / (2 * secondPowerCoefficient);

        }
        return roots;
    }
    private double getDiscriminant() {
        return firstPowerCoefficient * firstPowerCoefficient - 4 * secondPowerCoefficient * zeroPowerCoefficient;
    }
}
