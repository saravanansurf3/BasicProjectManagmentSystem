package com.sara.waie.androidprojectmanagmentsystem.model

/**
 * @property projectId unique identity for project (>=Manager can update)
 * @property taskId unique identity for task (>=Manager can update)
 * @property taskStatus status of the task TaskStatus:Enum (>=TeamMember can update)
 * @property desc description of task (>=TeamLead can update)
 * @property skillRequired skills required to work on task (>=Manager can update)
 * @property timeRequired time estimated to work on task (>=TeamLead can update)
 * @property assigned member to got assigned task (>=TeamLead can update)
 * @property timeTaken effort taken for this task eg:2 hour 30 min will consider as "2.50" (>=TeamMember can update)
 * @property comments list of comment about the task (>=TeamMember can update)
 * @property dependencyTasks list of task depended for this current task (>=TeamMember can update)
 * */
data class Task(

    var projectId: String,
    var taskId: String?=null,
    var taskStatus: TaskStatus = TaskStatus.OPEN,
    var desc: String? = null,
    var skillRequired: ArrayList<String> = arrayListOf(),
    var timeRequired: Float = 0.0F,
    var assigned: Member? = null,
    var timeTaken: Float = 0.0F,
    var comments: ArrayList<Comment> = arrayListOf(),
    var dependencyTasks: ArrayList<Task> = arrayListOf()
) {

    /**
     * function to start work on Task
     * */
    fun startWork(){
        if (isAllClearToWork()){
            taskStatus=TaskStatus.INPROGRESS
        }
    }

    /**
     * function to complete the Task
     * */
    fun completeWork(){
        if (taskStatus==TaskStatus.INPROGRESS){
            taskStatus=TaskStatus.COMPLETED
        }
    }

    /**
     * function to put on Hold
     * @param reason reason for HOLD
     * */
    fun putOnHold(reason:String){
        if (taskStatus==TaskStatus.INPROGRESS){
            //add reason as comment in list
            taskStatus=TaskStatus.HOLD
        }
    }

    /**
     * function to identify can start work or not
     * */
    fun isAllClearToWork():Boolean{
        return (taskStatus==TaskStatus.OPEN && dependencyTasks.size==0)
    }

}