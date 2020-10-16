package kiss;

public class Checkout {
    Cart cart;
    Delivery delivery;
    Payment payment;

    public Checkout() {
        cart = new Cart();
        delivery = new Delivery();
        payment = new Payment();
    }

    public void validate() throws Exception {
        cart.validate();
        delivery.validate();
        payment.validate();
    }
}
