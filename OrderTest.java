public class OrderTest {
    public static void main(String[] args) {
        OrderAction orderAction = new OrderAction();
        orderAction.calculateTotal(10.0, 2);
        orderAction.placeOrder("John Doe", "123 Main St");
        orderAction.generateInvoice("order_123.pdf");
        orderAction.sendEmailNotification("johndoe@example.com");
    }
}