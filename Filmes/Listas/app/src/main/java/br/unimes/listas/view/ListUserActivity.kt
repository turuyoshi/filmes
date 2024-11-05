package br.unimes.listas.view

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import br.unimes.listas.R
import br.unimes.listas.adapter.UserAdapter
import br.unimes.listas.dao.UserDao
import br.unimes.listas.databinding.ActivityListUserBinding
import br.unimes.listas.model.User

class ListUserActivity : AppCompatActivity() {
    private lateinit var binding: ActivityListUserBinding
    private  val dao = UserDao()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityListUserBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val rvUsers = binding.rvUsers
        val users = dao.findAll()

        rvUsers.layoutManager = LinearLayoutManager(this)
        rvUsers.adapter = UserAdapter(users)
        }
    }