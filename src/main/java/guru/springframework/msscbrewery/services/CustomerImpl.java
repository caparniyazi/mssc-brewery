package guru.springframework.msscbrewery.services;

import guru.springframework.msscbrewery.web.model.CustomerDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Slf4j
@Service
public class CustomerImpl implements  CustomerService {
    @Override
    public CustomerDto getCustomerById(UUID customerId) {
        return CustomerDto.builder().id(UUID.randomUUID()).name("Niyazi").build();
    }

    @Override
    public void deleteById(UUID customerId) {
        log.debug("Deleting a beer..");
    }

    @Override
    public void updateBeer(UUID customerId, CustomerDto customerDto) {
        log.debug("Updating a beer..");
    }

    @Override
    public CustomerDto saveNeCustomer(CustomerDto customerDto) {
        return CustomerDto.builder().id(UUID.randomUUID()).build();
    }
}
