package org.example.bto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.example.util.SubjectCategory;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class SubjectDto {
    private Integer id;
    private String name;
    private SubjectCategory category;
}
