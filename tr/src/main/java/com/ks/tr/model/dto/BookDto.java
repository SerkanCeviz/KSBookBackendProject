package com.ks.tr.model.dto;

import com.ks.tr.entity.Category;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.UUID;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class BookDto {
    private UUID id;
    @NotBlank
    private String name;
    @NotNull
    private BigDecimal price;
    private String imagePath;
    private Category category;
}
