public class Engineer extends Employee {

    public void drinkVodka() {
        System.out.println(getName() + " has drunk");
    }

    @Override
    public void countSalary() {
        setSalary(getQuantity() * getRate());
    }
}
