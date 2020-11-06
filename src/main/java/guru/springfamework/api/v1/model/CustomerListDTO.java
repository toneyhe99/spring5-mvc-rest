package guru.springfamework.api.v1.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * Created by jt on 9/27/17.
 */
@Data
public class CustomerListDTO {
    List<CustomerDTO> customers;

    public CustomerListDTO(List<CustomerDTO> customers) {
        this.customers = customers;
    }
}
