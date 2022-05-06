package itis.eventmaker.dto.out;

import itis.eventmaker.dto.in.CategoryDto;
import itis.eventmaker.dto.in.EventTypeDto;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class EventOutDto {
    private long id;
    private String name;
    private String description;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private String date;
    private EventTypeDto eventType;
    private CategoryDto category;
    private UserDtoOut user;
    private List<UserDtoOut> participants;
}