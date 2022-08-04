package com.brandxcorp.api.response

import java.math.BigDecimal

data class AddClipResponse (
    /**
     * 클립 고유번호
     */
    val clipSeq: Int?,
    /**
     * 강사 고유번호
     */
    val trainerSeq: Long?,
    /**
     * 클립 내용
     */
    val clipContent: String?,
    /**
     * 클립 동영상 경로
     */
    val clipVideoPath: String?,
    /**
     * 클립 이미지 경로
     */
    val clipImagePath: String?,
    /**
     * 클립 유효여부
     */
    val clipValid: String?,
    /**
     * 등록시간
     */
    val createdTime: BigDecimal?,
    /**
     * 수정시간
     */
    val updatedTime: BigDecimal?
)
