package ru.clevertec

import org.gradle.api.Plugin
import org.gradle.api.Project

class PagePlugin implements Plugin<Project> {
    @Override
    void apply(Project project) {
        project.tasks.register('page', PageTask) {
        }
    }
}

