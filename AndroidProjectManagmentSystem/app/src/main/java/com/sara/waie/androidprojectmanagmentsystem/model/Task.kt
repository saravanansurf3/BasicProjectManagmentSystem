package com.sara.waie.androidprojectmanagmentsystem.model

//timeRequired- in hours (eg: 4H->4    4.30 -> 4.5)
//skillRequired- list of req skills to complete task
data class Task(
    //>=Manager
    var projectId: String,
    //>=Manager
    var taskId: String?=null,
    //>=TeamMember
    var taskStatus: TaskStatus = TaskStatus.OPEN,
    //>=TeamLead
    var desc: String? = null,
    //>=Manager
    var skillRequired: ArrayList<String> = arrayListOf(),
    //>=TeamLead
    var timeRequired: Float = 0.0F,
    //>=TeamLead
    var assigned: Member? = null,
    //>=Team Member
    var timeTaken: Float = 0.0F,
    //>=Team Member
    var comments: ArrayList<TaskComment> = arrayListOf()
) {

}