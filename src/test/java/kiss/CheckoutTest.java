package kiss;

import org.junit.jupiter.api.Test;

public class CheckoutTest {
    @Test
    public void validateCart() throws Exception {
        Checkout checkout = new Checkout();
        try {
            checkout.validateCart();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}