package com.fbieck.todo.data

import android.app.Application
import androidx.lifecycle.LiveData
import com.fbieck.todo.data.db.TodoDao
import com.fbieck.todo.data.db.TodoDatabase
import com.fbieck.todo.data.db.TodoRecord
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

class TodoRepository(application: Application) {

    private val todoDao: TodoDao


    init {
        val database = TodoDatabase.getInstance(application.applicationContext)
        todoDao = database!!.todoDao()
        //todo
    }

    fun saveTodo(todo: TodoRecord) = runBlocking {
        this.launch(Dispatchers.IO) {
            //todo
        }
    }

    fun updateTodo(todo: TodoRecord) = runBlocking {
        this.launch(Dispatchers.IO) {
            //todo
        }
    }


    fun deleteTodo(todo: TodoRecord) {
        runBlocking {
            this.launch(Dispatchers.IO) {
                //todo
            }
        }
    }

    fun getAllTodoList(): LiveData<List<TodoRecord>> {
        //todo

    }
}