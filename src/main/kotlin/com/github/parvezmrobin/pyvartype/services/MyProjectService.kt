package com.github.parvezmrobin.pyvartype.services

import com.github.parvezmrobin.pyvartype.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
