public class PersonPrintlnDemo {
    public static void main(String[] args) {
        PersonPrintln caroline = new PersonPrintln();
        caroline.setIdentifier("920614-123-45");
        caroline.setFirstName("Caroline");
        caroline.setLastName("Janson");
        caroline.setEmail("caro.jan@super.com");
        caroline.setBirthYear(1992);

        System.out.println(caroline.getEmail());
        System.out.println(caroline.getAge());

        PersonPrintln jj = new PersonPrintln();
        jj.setIdentifier("20100806-543-21");
        jj.setFirstName("Jean-Jacques");
        jj.setLastName("Joyeux");
        jj.setEmail("jj@test.com");
        jj.setBirthYear(2010);

        System.out.println(jj.getAge());
    }
}
