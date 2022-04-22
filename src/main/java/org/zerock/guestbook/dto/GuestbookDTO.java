package org.zerock.guestbook.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class GuestbookDTO {
//DTO => 엔티티 객체와 달리 각 계층끼리 주고받는 상자 개념
    // 목적이 전달 읽기, 쓰기 모두 허용 일회성 사용 성격
    //엔티티 객체를 영속 계층 바깥쪽에서 사용하는 방식 보다 DTO 이용 권장
    private Long gno;
    private String title;
    private String content;
    private String writer;
    private LocalDateTime regDate, modDate;
}
