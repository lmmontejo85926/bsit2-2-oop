class PetService {
    private static final double BASE_FEE = 50.0;
    private static final double VACCINATION_FEE = 25.0;
    private static final double GROOMING_FEE = 30.0;

    // No-arg method
    public double calculateFee() {
        return BASE_FEE;
    }

    // Overloaded: with vaccination
    public double calculateFee(boolean withVaccination) {
        if (withVaccination) {
            return BASE_FEE + VACCINATION_FEE;
        }
        return BASE_FEE;
    }

    // Overloaded: with vaccination and grooming
    public double calculateFee(boolean withVaccination, boolean withGrooming) {
        double total = BASE_FEE;
        if (withVaccination) total += VACCINATION_FEE;
        if (withGrooming) total += GROOMING_FEE;
        return total;
    }

    // Overloaded: emergency case
    public double calculateFee(String emergencyType) {
        return 200.0;
    }

    public static void main(String[] args) {
        PetService service = new PetService();

        System.out.println("Basic checkup: $" + service.calculateFee());
        System.out.println("Checkup with vaccination: $" + service.calculateFee(true));
        System.out.println("Full service: $" + service.calculateFee(true, true));
        System.out.println("Emergency: $" + service.calculateFee("urgent"));
    }
}
