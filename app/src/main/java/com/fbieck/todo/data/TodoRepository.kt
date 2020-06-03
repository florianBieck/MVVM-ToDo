package com.fbieck.todo.data

import android.app.Application
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.fbieck.todo.data.db.TodoDatabase
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

class TodoRepository(application: Application) {

    private val allTodos: LiveData<List<String>>

    init {
        val database = TodoDatabase.getInstance(application.applicationContext)

        val placeholder: MutableLiveData<List<String>> by lazy {
            MutableLiveData<List<String>>()
        }
        allTodos = placeholder
    }

    fun saveTodo(todo: String) = runBlocking {
        this.launch(Dispatchers.IO) {

        }
    }

    fun updateTodo(todo: String) = runBlocking {
        this.launch(Dispatchers.IO) {

        }
    }


    fun deleteTodo(todo: String) {
        runBlocking {
            this.launch(Dispatchers.IO) {

            }
        }
    }

    fun getAllTodoList(): LiveData<List<String>> {
        return allTodos
    }
}