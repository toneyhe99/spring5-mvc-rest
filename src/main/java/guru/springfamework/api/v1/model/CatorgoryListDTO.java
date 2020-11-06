package guru.springfamework.api.v1.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

/**
 * Created by jt on 9/26/17.
 */
@Data
public class CatorgoryListDTO {
    List<CategoryDTO> categories;

    public CatorgoryListDTO(List<CategoryDTO> categories) {
        this.categories = categories;
    }
}
