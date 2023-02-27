import org.junit.jupiter.api.Test;

public class ObjectPractice {
    @Test
    public void workingWithOrders() {
        Order firstOrder = new Order();
        firstOrder.setTotalPrice(22.15);
        firstOrder.setAddress("Brivibas str. 22");
        firstOrder.setItemCount(9);

        Order secondOrder = new Order();
        secondOrder.setTotalPrice(14.20);
        secondOrder.setAddress("Lubanas str. 16");
        secondOrder.setItemCount(2);

//        System.out.println("Hello, world!");
        System.out.println("1st Order");
        System.out.println(firstOrder.getTotalPrice());

        System.out.println("2nd Order");
        System.out.println(secondOrder.getTotalPrice());

}
}
