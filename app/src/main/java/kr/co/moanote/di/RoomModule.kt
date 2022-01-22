package kr.co.moanote.di

import kr.co.moanote.room.user.UserDB
import kr.co.moanote.room.user.UserServiceImpl
import org.koin.dsl.module

val roomModule = module {
    single<UserServiceImpl> {   // User DataBase
        UserServiceImpl(UserDB.getInstance(get())!!.userDao())
    }
}