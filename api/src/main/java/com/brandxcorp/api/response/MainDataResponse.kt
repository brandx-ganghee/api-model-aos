package com.brandxcorp.api.response

import java.math.BigDecimal

data class MainDataResponse (
    /**
     * 앱 클라이언트 고유번호
     */
    val appClientSeq: Int?,
    /**
     * 서비스 이름
     */
    val serviceName: String?,
    /**
     * 클라이언트 이름
     */
    val clientName: String?,
    /**
     * 클라이언트 설명
     */
    val clientDescription: String?,
    /**
     * 클라이언트 유효시간
     */
    val clientExpires: Long?,
    /**
     * 클라이언트 공개키
     */
    val clientPublicKey: String?,
    /**
     * 클라이언트 개인키
     */
    val clientPrivateKey: String?,
    /**
     * 클라이언트 유효여부
     */
    val clientValid: Int?,
    /**
     * 등록시간
     */
    val createdTime: BigDecimal?,
    /**
     * 수정시간
     */
    val updatedTime: BigDecimal?
)
