package com.brandxcorp.api.response

import java.util.*

data class NoticeListPageResponse (
    /**
     * 
     */
    val totalCount: Int?, 
    /**
     * 페이지 크기
     */
    val size: Int?, 
    /**
     * size * page == offset
     */
    val offset: Int?, 
    /**
     * 
     */
    val orders: String?, 
    /**
     * 페이지 수
     */
    val page: Int?, 
    /**
     * 
     */
    val pageRows: List<NoticeListResponse>?
)

data class NoticeListResponse (
    /**
     * 공지 제목
     */
    val title: String?,
    /**
     * 공지 내용
     */
    val content: String?,
    /**
     * 수정시간
     */
    val updatedAt: Date?,
    /**
     * 공지 고유번호
     */
    val noticeSeq: Int?,
    /**
     * 등록시간
     */
    val createdAt: Date?
)
