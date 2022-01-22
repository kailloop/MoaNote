package kr.co.moanote.room.user

import androidx.room.*
import kotlinx.coroutines.flow.Flow

@Dao
interface UserDao {

    @Query("SELECT * FROM UserInfo")
    fun getAllUser():Flow<MutableList<UserInfo>>

    @Insert
    fun addUser(vararg user:UserInfo)  // 유저 등록

    @Update
    fun modifyUser(vararg user:UserInfo)   // 유저 수정
    
    @Delete
    fun deleteUser(vararg user:UserInfo)   // 유저 삭제
}