package org.example.bto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.example.util.Subject;


@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class ExamDto {
    private Integer id;
    private String name;
    private Subject subject;
    private String date;
    private String examHall;
    private Integer invigilator;
    private Integer participantCount;
}
