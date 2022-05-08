package com.sara.waie.androidprojectmanagmentsystem.model

open class TeamMember(override var id: String) : Member(id) {
    /**
     * function to update task status
     * @param task,task to update
     * @param newTaskStatus TaskStatus.ENUM
     * */
    fun updateTaskStatus(task: Task, newTaskStatus: TaskStatus) {
        //ToDo:update the status of specific task

    }

    /**
     * function to update time taken for the task
     * @param task,task to update
     * @param time time taken for the task
     *  */
    fun updateTimeTaken(task: Task, time: Float) {
        //ToDo:update the timeTaken of specific task
    }

    /**
     * funtion to Add or Update comment for the task
     * eg:This task will lake more than expected,need more effort
     * @param task the task to update comment
     * @param comment new or updated comment
     * */
    fun addOrUpdateComment(task: Task, comment: Comment) {
        //ToDo:update the comments of specific task
        //ToDo: comment id is nulll-> create new comment and add
        //ToDo: the comment already exist in list ->update it
    }

    //Project Related
}



