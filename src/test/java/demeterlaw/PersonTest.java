package demeterlaw;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

public class PersonTest {

    @Test
    public void testPersonZipCode() {
        Address address = new AddressImpl();
        address.setName("01");
        address.setZipCode("08005");

        House house = new HouseImpl();
        house.setAddress(address);

        Person person = new PersonImpl();
        person.setHouse(house);

        String personZipCode = person.getHouse().getAddress().getZipCode();
        assertThat(personZipCode).isNotNull();
    }

}