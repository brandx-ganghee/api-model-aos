package com.brandxcorp.api.response

data class EmailLoginRequest (
    /**
     * 로그인 이메일
     */
    val email: String?, 
    /**
     * 패스워드
     */
    val password: String?
)
