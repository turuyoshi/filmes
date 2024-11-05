package br.unimes.listas.view

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import br.unimes.listas.dao.UserDao
import br.unimes.listas.databinding.ActivityMainBinding
import br.unimes.listas.model.User

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private val dao= UserDao()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.btnSave.setOnClickListener {
            val name= binding.edtName.text.toString()
            val age= binding.edtAge.text.toString().toInt()
            val user = User (name, age)
            dao.save(user)
            binding.edtName.text.clear()
            binding.edtAge.text.clear()
        }

        binding.btnList.setOnClickListener {
            val intent = Intent(this, ListUserActivity::class.java)
            startActivity(intent)
        }
    }
}