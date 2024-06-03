package com.example.test.di

import android.content.Context
import com.dicoding.pneumuvision.UserRepository
import com.dicoding.pneumuvision.pref.UserPreference
import com.dicoding.pneumuvision.pref.dataStore

object Injection {
    fun provideRepository(context: Context): UserRepository {
        val pref = UserPreference.getInstance(context.dataStore)
        return UserRepository.getInstance(pref)
    }
}