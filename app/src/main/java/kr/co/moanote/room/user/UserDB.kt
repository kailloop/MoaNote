package kr.co.moanote.room.user

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(entities = [UserInfo::class], version = 1)
abstract class UserDB: RoomDatabase() {
    abstract fun userDao(): UserDao

    companion object {
        private var userDB:UserDB? = null
        private const val dbName = "UserDB"

        @Synchronized
        fun getInstance(context: Context): UserDB? {
            if(userDB == null) {
                synchronized(UserDB::class){
                    userDB = Room.databaseBuilder(
                        context.applicationContext,
                        UserDB::class.java,
                        dbName
                    ).build()
                }
            }

            return userDB
        }
    }
}