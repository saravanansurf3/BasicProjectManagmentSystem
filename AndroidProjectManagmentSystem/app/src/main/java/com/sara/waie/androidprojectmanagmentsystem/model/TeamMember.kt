package com.sara.waie.androidprojectmanagmentsystem.model

open class TeamMember(override var id: String) : Member(id) {

    fun updateTaskStatus(task: Task, newTaskStatus: TaskStatus) {
        //update the status of specific task

    }

    fun updateTimeTaken(task: Task, taken: Float) {
        //update the timeTaken of specific task
    }

    fun addOrUpdateComment(task: Task, comment: TaskComment) {
        //update the comments of specific task
        //if comment id is nulll-> create new comment and add
        //if the comment already exsist in list ->update it
    }

    //Project Related
}



