package Week1;

public class Sum {

    private int first;
    private int second;

    public Sum() {
        this.first = 10;
        this.second = 3;
    }

    public static void main(String[] args) {
        Sum obj = new Sum();
        //addition
        System.out.println(Math.addExact(obj.first, obj.second));
        //minus
        System.out.println(Math.subtractExact(obj.first, obj.second));
        //multiply
        System.out.println(Math.multiplyExact(obj.first, obj.second));
        //divide
        System.out.println(Math.divideExact(obj.first, obj.second));
        //maximum between first and second
        System.out.println(Math.max(obj.first, obj.second));
    }
}
