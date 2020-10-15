package dry;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class AccountTest {
    private Account account;

    @BeforeEach
    void setUp() {
        account = new Account();
    }

    @Test
    public void testPositiveBalance() throws Exception {
        account.debit(50);
        account.credit(20);

        assertThat(account.getBalance()).isEqualTo(30);
    }

    @Test
    public void getLastTransactionDate() throws Exception {
        account.debit(50);

        assertThat(account.getLastTransactionDate()).isNotNull();
    }

}