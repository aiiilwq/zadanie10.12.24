package com.example.myapplication

import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    // Метод для кнопки Submit
    fun onSubmitClick(view: View) {
        // Получаем значения из полей ввода
        val nameEditText = findViewById<EditText>(R.id.editTextName)
        val emailEditText = findViewById<EditText>(R.id.editTextEmail)
        val messageEditText = findViewById<EditText>(R.id.editTextMessage)

        val name = nameEditText.text.toString()
        val email = emailEditText.text.toString()
        val message = messageEditText.text.toString()

        // Пример обработки данных
        if (name.isNotEmpty() && email.isNotEmpty() && message.isNotEmpty()) {
            // Отображаем сообщение в Toast
            Toast.makeText(this, "Form submitted!", Toast.LENGTH_SHORT).show()
        } else {
            // Если не все поля заполнены, показываем сообщение
            Toast.makeText(this, "Please fill out all fields", Toast.LENGTH_SHORT).show()
        }
    }

    // Метод для кнопки Cancel
    fun onCancelClick(view: View) {
        // Очищаем все поля
        val nameEditText = findViewById<EditText>(R.id.editTextName)
        val emailEditText = findViewById<EditText>(R.id.editTextEmail)
        val messageEditText = findViewById<EditText>(R.id.editTextMessage)

        nameEditText.text.clear()
        emailEditText.text.clear()
        messageEditText.text.clear()

        // Показываем сообщение
        Toast.makeText(this, "Form reset", Toast.LENGTH_SHORT).show()
    }
}
