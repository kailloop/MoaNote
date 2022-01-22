package kr.co.moanote.room.user

import kotlinx.coroutines.flow.Flow

class UserServiceImpl(private val userDao: UserDao) {

    fun getUserData(): Flow<MutableList<UserInfo>> = userDao.getAllUser()

    fun addUserData(vararg userInfo:UserInfo) = userDao.addUser(*userInfo)
}