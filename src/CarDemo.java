public class CarDemo {
    public static void main(String[] args) {
        Car c1 = new Car();
        c1.setBrand("Mercèdes");
        c1.setModel("class A");
        c1.setPlaque("2 AVE 412");
        c1.setColor("bleu");
        c1.setBuyPrice(35233.45);

        Car c2 = new Car();
        c2.setBrand("Mercèdes");
        c2.setModel("class A");
        c2.setPlaque("2 AVE 412");
        c2.setColor("bleu");
        c2.setBuyPrice(35233.45);

        System.out.println(c1 == c2);
        boolean b = c1.getPlaque().equals(c2.getPlaque());
        System.out.println(c1.equals(c2));
        System.out.println(c2.equals(c1));
    }
}
