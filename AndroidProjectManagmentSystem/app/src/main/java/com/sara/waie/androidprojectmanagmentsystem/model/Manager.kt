package com.sara.waie.androidprojectmanagmentsystem.model

open class Manager(override var id:String):TeamLead(id) {





    fun updateSkillRequired(task: Task,newSkil:String){
        //if not already skill in list - add to list
    }


    //ROLE related operation
    fun createTeamLead(newTeamLead: TeamLead){

    }

    fun updateTeamLead(teamLead: TeamLead){

    }

    //PROJECT related operaion
    //>=Admin
    fun createTask(project: Project,newTask: Task){
        //create new task if the task id null
        //if already created ,check the project have the task in list ->update it
        //if the project does not  have that task->add to task list
    }
    fun removeTask(project: Project,task: Task){

    }
    fun updatePlannedEndDate(project: Project,endDate:Long){

    }

    fun updateResourceRequired(project: Project,hoursPerSkill:Pair<String,Int>){
        //Pair<Skill,Hour>
    }

    fun addTeamMemberToProject(project: Project,newResource:TeamMember){
        //check for resource required
        //update actualResource with skill
        //update team member list
    }

    fun removeTeamMemberFromProject(project: Project,newResource:TeamMember){
        //update actual Resource with skill
        //update team member list
    }



}
