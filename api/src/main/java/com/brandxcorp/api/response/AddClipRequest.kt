package com.brandxcorp.api.response

data class AddClipRequest (
    /**
     * 클립 내용
     */
    val content: String?, 
    /**
     * 클립 Video Path
     */
    val videoPath: String?
)
