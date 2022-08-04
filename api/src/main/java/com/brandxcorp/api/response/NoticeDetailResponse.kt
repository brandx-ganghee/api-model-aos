package com.brandxcorp.api.response

import java.util.*

data class NoticeDetailResponse (
    /**
     * 공지 고유번호
     */
    val noticeSeq: Int?,
    /**
     * 공지 제목
     */
    val noticeTitle: String?,
    /**
     * 공지 내용
     */
    val noticeContent: String?,
    /**
     * 공지 작성자 고유번호
     */
    val noticeWriter: Int?,
    /**
     * 공지 유효여부
     */
    val noticeValid: String?,
    /**
     * 등록시간
     */
    val createdAt: Date?,
    /**
     * 수정시간
     */
    val updatedAt: Date?
)
