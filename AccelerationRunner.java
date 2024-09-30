public class AccelerationRunner {
    public static void main(String[] args) {
        AccelerationCalculator testRunner = new AccelerationCalculator(10.0);
        testRunner.increaseTrial();
        testRunner.recordDisplacement(1);
        testRunner.recordTime(0.45);
        System.out.println("Trial " + testRunner.getTrial() + ": " + testRunner.recordAcceleration());
        testRunner.increaseTrial();
        testRunner.recordDisplacement(1.05);
        testRunner.recordTime(0.42);
        System.out.println("Trial " + testRunner.getTrial() + ": " + testRunner.recordAcceleration());
        testRunner.increaseTrial();
        testRunner.recordDisplacement(0.95);
        testRunner.recordTime(0.34);
        System.out.println("Trial " + testRunner.getTrial() + ": " + testRunner.recordAcceleration());
        System.out.println("Average Acceleration: " + testRunner.recordAverageAcceleration());
        System.out.println("Was prediction Correct? " + testRunner.wasPredictionCorrect());
    }
}
