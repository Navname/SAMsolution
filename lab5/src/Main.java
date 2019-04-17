public class Main {
    public static void main(String[] args) {
        Employee engineer1 = new Engineer();
        engineer1.setName("Vasya");
        Employee engineer2 = new Engineer();
        engineer2.setName("Vanya");
        Employee engineer3 = new Engineer();
        engineer3.setName("Alexey");
        engineer1.printName();
        engineer1.setQuantity(12);
        engineer1.countSalary();
        System.out.println(engineer1.getSalary());
        System.out.println(engineer1.taxCounter());
    }
}
