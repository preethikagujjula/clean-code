package com.movierental;

//import org.junit.Test;
import org.junit.jupiter.api.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class CustomerTest {
    @Test
    public void testThatGeneratedStatementIsCorrect(){

        Customer customer = new Customer("John");
        customer.addRental(new Rental(new Movie("movie1", Movie.REGULAR), 3));
        customer.addRental(new Rental(new Movie("movie2", Movie.CHILDRENS), 2));
        customer.addRental(new Rental(new Movie("movie3", Movie.NEW_RELEASE), 4));
        String result = customer.statement();

        assertThat(result , is(equalTo("Rental Record for John\n\tmovie1\t3.5\n\tmovie2\t1.5\n\tmovie3\t12.0\nAmount owed is 17.0\nYou earned 4 frequent renter points")));
    }

}

