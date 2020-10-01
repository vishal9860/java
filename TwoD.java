public class TwoD {
    public static void main(String[] args) {
        int num[][]={{11,22,33},{44,55,66},{77,88,99}};
        int marks[][];
        marks=num;
        System.out.println("marks[0][1]="+num[0][1]);
        System.out.println("marks[0][1]="+marks[0][1]);
        System.out.println(num.length);
        System.out.println(num[0].length);
    }
}
