package dev.ktrzcinski.kthelloworldplugin

import com.intellij.openapi.actionSystem.AnAction
import com.intellij.openapi.actionSystem.AnActionEvent
import com.intellij.openapi.ui.Messages

class HelloWorldAction : AnAction() {

    override fun actionPerformed(e: AnActionEvent) {
        val project = e.project
        val message = "Hello World!"
        Messages.showMessageDialog(
                project,
                message,
                "Hello World Dialog",
                Messages.getInformationIcon()
        )
    }
}