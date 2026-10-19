package HumanBody.classes;

public interface HumanBodyProcesses {
    void process(double amount);
    default void validateAmount(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException(
                    "Amount must be positive."
            );
        }
    }
}
