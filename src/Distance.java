public class Distance {
    public static Double distance(double x1, double y1, double x2, double y2){
        return Math.sqrt(Math.pow((x2-x1),2)+Math.pow((y2-y1),2));
    }

    public static void main(String[] args) {
        double dist = distance(2.3,3.5,4.3,5.5);
        if (Math.abs(dist - 2.828427125) < 0.0001){
            System.out.println("Equal distance");
        }else{
            System.out.println("Unequal distance");
        }
    }
}
