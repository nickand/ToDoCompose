package com.example.to_docompose.ui.screens.task

import android.content.Context
import android.widget.Toast
import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.platform.LocalContext
import com.example.to_docompose.data.models.Priority
import com.example.to_docompose.data.models.ToDoTask
import com.example.to_docompose.ui.viewmodels.SharedViewModel
import com.example.to_docompose.util.Action

@Composable
fun TaskScreen(
    selectedTask: ToDoTask?,
    sharedViewModel: SharedViewModel,
    navigateToListScreen: (Action) -> Unit
) {
    val title: String  by sharedViewModel.title
    val description: String  by sharedViewModel.description
    val priority: Priority  by sharedViewModel.priority

    val context = LocalContext.current

    Scaffold(
        topBar = {
            TaskAppBar(
                selectedTask = selectedTask,
                navigateToListScreen = { action ->
                    if (action == Action.NO_ACTION) {
                        navigateToListScreen(action)
                    } else {
                        if (sharedViewModel.validateFields()) {
                            navigateToListScreen(action)
                        } else {
                            displayToast(context = context )
                        }
                    }
                }
            )
        },
        content = {
            TaskContent(
                title = title,
                onTitleChanged = { taskTitle ->
                    sharedViewModel.updateTitle(taskTitle)
                },
                description = description,
                onDescriptionChanged = { taskDescription ->
                    sharedViewModel.description.value = taskDescription
                },
                priority = priority,
                onPrioritySelected = { taskPriority ->
                    sharedViewModel.priority.value = taskPriority
                }
            )
        }
    )
}

fun displayToast(context: Context) {
    Toast.makeText(context, "Fields empty.", Toast.LENGTH_SHORT).show()
}
