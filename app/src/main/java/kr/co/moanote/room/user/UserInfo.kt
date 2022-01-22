package kr.co.moanote.room.user

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class UserInfo(var name:String,
                    var pw:String,
                    var phone:String
                    ){
                        @PrimaryKey var id:String = "0"
                    }
