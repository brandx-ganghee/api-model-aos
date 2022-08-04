package com.brandxcorp.api.response

data class SocialLoginResponse (
    /**
     * 인증 토큰
     */
    val authToken: String?, 
    /**
     * 토큰 생성 타임스탬프
     */
    val timestamp: Long?
)
