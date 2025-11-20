public class BmiCalculator {

    private double weight; // kg
    private double height; // meters

    public BmiCalculator(double weight, double height) {
        setWeight(weight);
        setHeight(height);
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        if (weight <= 0) {
            throw new IllegalArgumentException("Weight must be positive");
        }
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        if (height <= 0) {
            throw new IllegalArgumentException("Height must be positive");
        }
        this.height = height;
    }

    public double getBmi() {
        return weight / (height * height);
    }

    public String getCategory() {
        double bmi = getBmi();

        if (bmi < 18.5) return "Deficit";
        if (bmi < 25)   return "Norm";
        if (bmi < 30)   return "Warning!";
        return "Fat";
    }
}
