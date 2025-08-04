package com.works.restapi.entities.dtos;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Value;

import java.io.Serializable;

/**
 * DTO for {@link com.works.restapi.entities.Note}
 */
@Value
public class NoteAddDto implements Serializable {
    @NotNull
    @Size(min = 2, max = 100)
    @NotEmpty
    String title;
    @NotNull
    @Size(min = 5)
    @NotEmpty
    String content;
}