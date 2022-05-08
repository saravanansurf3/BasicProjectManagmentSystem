package com.sara.waie.androidprojectmanagmentsystem.model

open class TeamLead(override var id:String):TeamMember(id) {


    fun updateTask(project: Project,newTask: Task){
        //if already created check the project have the task ->update it
        //update desc
        //skillRequired
        //timeRequired
        //update assignee
    }

    //TASK related operation
    fun updateTaskDesc(task: Task,newDesc:String){

    }
    fun updateTimeRequired(task: Task,newTime:Float){

    }

    fun assignTask(task: Task,teamMember: TeamMember){

    }


    //ROLE related operation
    fun createTeamMember(newTeamMember: TeamMember){

    }

    fun updateTeamMember(newTeamMember: TeamMember){

    }


    //Project Related



}


