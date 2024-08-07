package com.example.locavel.apiPayload.code.status;

import com.example.locavel.apiPayload.code.BaseCode;
import com.example.locavel.apiPayload.code.ReasonDTO;
import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.http.HttpStatus;

@Getter
@AllArgsConstructor
public enum SuccessStatus implements BaseCode {

    //일반적인 응답
    _OK(HttpStatus.OK, "COMMON200", "성공입니다."),

    //유저
    USER_PROFILE_UPDATED(HttpStatus.OK, "USER2002", "프로필이 정상적으로 수정되었습니다."),
    USER_DELETED(HttpStatus.OK,"USER2003", "유저가 정상적으로 삭제되었습니다."),
    USER_FOUND(HttpStatus.OK,"USER2005","유저를 정상적으로 조회했습니다."),

    //리뷰
    REVIEW_CREATE_OK(HttpStatus.OK,"REVIEW2001", "리뷰가 정상적으로 등록되었습니다."),
    REVIEW_UPDATE_OK(HttpStatus.OK,"REVIEW2002", "리뷰가 정상적으로 수정되었습니다."),
    REVIEW_DELETE_OK(HttpStatus.OK,"REVIEW2003", "리뷰가 정상적으로 삭제되었습니다."),
    REVIEW_GET_OK(HttpStatus.OK,"REVIEW2004","리뷰 목록을 조회했습니다."),
    REVIEW_SUMMARY_GET_OK(HttpStatus.OK,"REVIEW2005", "리뷰 요약을 조회했습니다."),
    ;

    private final HttpStatus httpStatus;
    private final String code;
    private final String message;

    @Override
    public ReasonDTO getReason() {
        return ReasonDTO.builder()
                .message(message)
                .code(code)
                .isSuccess(true)
                .build();
    }

    @Override
    public ReasonDTO getReasonHttpStatus() {
        return ReasonDTO.builder()
                .message(message)
                .code(code)
                .isSuccess(true)
                .httpStatus(httpStatus)
                .build()
                ;
    }

}
