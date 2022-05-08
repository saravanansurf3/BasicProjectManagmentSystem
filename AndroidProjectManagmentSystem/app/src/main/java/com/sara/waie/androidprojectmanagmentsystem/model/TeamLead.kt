package com.sara.waie.androidprojectmanagmentsystem.model

open class TeamLead(override var id:String):TeamMember(id) {
    //TASK related operation
    /**
     * function to update Task
     * @param project Project to update
     * @param updatedTask Task in the Project to update
     * */
    fun updateTask(project: Project, updatedTask: Task){
        //if already created check the project have the task ->update it
        //update desc
        //skillRequired
        //timeRequired
        //update assignee
    }

    /**
     * function to update Task description
     * @param task task to update
     * @param newDesc update description for the task
     * */
    fun updateTaskDesc(task: Task, newDesc:String){

    }

    /**
     * function to update time estimation for the task
     * @param task task to update
     * @param newTime new estimation for the task
     * */
    fun updateTimeRequired(task: Task, newTime:Float){

    }

    /**
     * function to assign task for member
     * @param task task to update description
     * @param teamMember member to assign for the task
     * */
    fun assignTask(task: Task, teamMember: TeamMember){

    }

    /**
     * function to add dependency for the task
     * @param myTask task to update description
     * @param dependTask the task dependent for myTask
     * */
    fun addDependency(myTask: Task, dependTask:Task){

    }

    /**
     * function to remove dependency for the task
     * @param myTask task to update
     * @param dependTask the task dependent for myTask
     * */
    fun removeDependency(myTask: Task, dependTask:Task){

    }


    //ROLE related operation
    /**
     * function to add member into project team
     * @param project project to update
     * @param newTeamMember member to add into team
     * */
    fun createTeamMember(project: Project,newTeamMember: TeamMember){

    }

    /**
     * function to add member into project team
     * @param project project to update
     * @param newTeamMember member to update into team
     * */
    fun updateTeamMember(project: Project,newTeamMember: TeamMember){

    }



}


