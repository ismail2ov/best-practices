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

    public boolean validateCart() throws Exception {

        if (cart.getNumProducts() <= 0) {
            throw new Exception("The cart is empty");
        }

        if (!(cart.getTotal() >= Cart.MIN_PURCHASE_AMOUNT)) {
            throw new Exception("Does not reach the minimum required for the cart");
        }

        if (!(cart.getTotal() < Cart.MAX_PURCHASE_AMOUNT)) {
            throw new Exception("You have exceeded the maximum total allowed for a purchase");
        }

        if (!delivery.checkAddress()) {
            throw new Exception("Invalid address");
        }

        if (!delivery.hasCarrier()) {
            throw new Exception("No carrier");
        }

        if (!payment.hasPaymentMethods()) {
            throw new Exception("No payment methods");
        }

        if (!payment.isCompulsiveBuyer()) {
            throw new Exception("Are you a compulsive buyer signed");
        }

        if (!cart.checkStock()) {
            throw new Exception("No hay stock");
        }

        return true;
    }
}
