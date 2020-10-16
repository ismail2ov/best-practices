package kiss;

import org.junit.jupiter.api.Test;

public class CheckoutTest {
    @Test
    public void validateCart() {
        Checkout checkout = new Checkout();
        try {
            checkout.validate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}