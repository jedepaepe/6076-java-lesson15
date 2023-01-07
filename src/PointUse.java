public class PointUse {
    public static void main(String[] args) {
        Point point = new Point();
        System.out.println("x = " + point.getX());
        System.out.println("y = " + point.getY());
        System.out.println();

        point.setX(10);
        point.setY(-8);
        System.out.println("x = " + point.getX());
        System.out.println("y = " + point.getY());
    }
}
