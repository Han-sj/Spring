package com.example.ch10.dto.board;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
public class FileDTO {

    private int fno;
    private int ano;    // 해당 파일이 첨부된 글 번호
    private String ofname;
    private String sfname;


}
