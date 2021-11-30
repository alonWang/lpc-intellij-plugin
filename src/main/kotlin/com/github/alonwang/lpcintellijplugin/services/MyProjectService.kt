package com.github.alonwang.lpcintellijplugin.services

import com.intellij.openapi.project.Project
import com.github.alonwang.lpcintellijplugin.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
