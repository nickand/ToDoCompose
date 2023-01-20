package com.example.to_docompose.components

import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import com.example.to_docompose.R
import com.example.to_docompose.ui.theme.taskItemTextColor

@Composable
fun DisplayAlertDialog(
    title: String,
    message: String,
    openDialog: Boolean,
    closeDialog: () -> Unit,
    onYesClicked: () -> Unit
) {
    if (openDialog) {
        AlertDialog(
            title = {
                Text(
                    text = title,
                    color = MaterialTheme.colors.taskItemTextColor,
                    fontSize = MaterialTheme.typography.h5.fontSize,
                    fontWeight = FontWeight.Bold
                )
            },
            text = {
                Text(
                    text = message,
                    color = MaterialTheme.colors.taskItemTextColor,
                    fontSize = MaterialTheme.typography.subtitle1.fontSize,
                    fontWeight = FontWeight.Normal
                )
            },
            confirmButton = {
                TextButton(
                    onClick = {
                        onYesClicked()
                        closeDialog()
                    }
                ) {
                    Text(
                        text = stringResource(R.string.ad_yes),
                        color = MaterialTheme.colors.taskItemTextColor,
                    )
                }
            },
            dismissButton = {
                TextButton(
                    onClick = { closeDialog() }
                ) {
                    Text(
                        text = stringResource(R.string.ad_no),
                        color = MaterialTheme.colors.taskItemTextColor,
                    )
                }
            },
            onDismissRequest = { closeDialog() }
        )
    }
}