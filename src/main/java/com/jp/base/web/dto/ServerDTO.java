package com.jp.base.web.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.NotBlank;

import javax.validation.constraints.Size;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ServerDTO {

    private Long id;

    @NotBlank
    @Size(max = 50)
    private String name;
}
