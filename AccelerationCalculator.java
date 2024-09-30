public class AccelerationCalculator {
    private double prediction; 
    private int trial;
    private double displacement;
    private double time;
    private double acceleration; 
    private double allAcceleration;
    private double averageAcceleration;

    public AccelerationCalculator(double prediction){
        this.prediction = prediction;
    }

    public int getTrial(){
        return trial;
    }

    public void increaseTrial(){
        trial ++;
    }

    public void recordDisplacement(double displacement){
        this.displacement = (double) displacement; 
    }

    public void recordTime(double time){
        this.time = (double) time; 
    }

    public String recordAcceleration(){
        acceleration = (displacement*2)/(Math.pow(time,2));
        allAcceleration += acceleration;
        return acceleration + " m/s^2";
    }

    public String recordAverageAcceleration(){
        averageAcceleration = allAcceleration/trial;
        return averageAcceleration + " m/s^2";
    }

    public boolean wasPredictionCorrect(){
        if(prediction == averageAcceleration){
            return true;
        }
        else{
            return false;
        }
    }
}
