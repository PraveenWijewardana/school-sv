package org.example.bto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.example.util.Subject;


@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class TeacherDto {
    private Integer id;
    private String name;
    private Integer phoneNumber;
    private String address;
    private Subject subject;
}
