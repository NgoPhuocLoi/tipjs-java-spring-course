package com.nploi.tipjs_course.dto.request;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class FeedRequestDto {
    private String title;
    private Long userId;
}
