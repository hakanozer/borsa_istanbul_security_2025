package com.works.restapi.entities.dtos;

import jakarta.validation.constraints.*;
import lombok.Value;

import java.io.Serializable;

/**
 * DTO for {@link com.works.restapi.entities.Product}
 */
@Value
public class ProductAddDto implements Serializable {
    @NotNull
    @Size(min = 2, max = 100)
    @NotEmpty
    @NotBlank
    String title;
    @NotNull
    @Min(2)
    @Max(100000)
    Integer price;
}