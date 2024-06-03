package com.dicoding.pneumuvision.pref

data class UserModel(
    val email: String,
    val token: String,
    val isLogin: Boolean = false,
    val name: String,
)
