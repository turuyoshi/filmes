package br.unimes.listas.dao

import br.unimes.listas.model.User

class UserDao {
    companion object {
        private val users = mutableListOf<User>()
    }
    fun save(user:User){
        users.add(user)
    }
    fun findAll():List<User>{
        return users
    }


}