package com.example.oo_to_fp

class UserDataBase {

    val users = listOf(
        User( 1,  "Bruce", false),
        User( 2,  "Juan",  true),
        User( 3,  "Carlos",  false),
        User( 4,  "Jhon",  true),
        User(5,  "Jose",  false),
        User( 6, "Tomas",  true),
        User( 7, "Gabriel",  false),
        User( 8,  "Bruce",  false),
        User( 9,  "Rachel",  true),
        User( 10,  "Shirley",  false),
        User( 11,  "Eric",  true),
        User( 12,  "Helen",  false),
        User( 13,  "Harold",  true),
        User( 14,  "Joyse",  false)
    )
}

data class User(val id: Int, val name: String, val active: Boolean)

fun main(args: Array<String>){

    val userDataBNase = UserDataBase()
    println(userDataBNase.users)
}