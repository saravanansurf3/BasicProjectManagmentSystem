package com.sara.waie.androidprojectmanagmentsystem.model

open class TeamManager(override var id:String):TeamLead(id) {

    /**
     * function to update skill required to work on task
     * @param project Project to update
     * @param task Task in the Project to update
     * @param newSkill newSkill need to perform the task
     * */
    fun updateSkillRequired(project: Project, task: Task, newSkill:String){
        //if not already skill in list - add to list
    }


    //ROLE related operations
    /**
     * function to update make member as TeamLead
     * @param project Project to update
     * @param newTeamLead Member want to change as TeamLead
     * */
    fun createTeamLead(project: Project, newTeamLead: Member){

    }

    /**
     * function to update TeamLead
     * @param project Project to update
     * @param teamLead TeamLead want to update
     * */
    fun updateTeamLead(project: Project, teamLead: TeamLead){

    }

    //PROJECT related operaion
    /**
     * function to create Task
     * @param project Project to update
     * @param newTask task to create for project
     * */
    fun createTask(project: Project, newTask: Task){
        //create new task if the task id null
        //if already created ,check the project have the task in list ->update it
        //if the project does not  have that task->add to task list
    }

    /**
     * function to remove Task
     * @param project Project to update
     * @param newTask task to remove from project
     * */
    fun removeTask(project: Project, task: Task){

    }

    /**
     * function to update EndDate of project
     * @param project Project to update
     * @param endDate end date to update for project
     * */
    fun updatePlannedEndDate(project: Project, endDate:Long){

    }

    /**
     * function to update Resources required to work for the project
     * @param project Project to update
     * @param hoursPerSkill Pair<Skill,HoursWorkOnSkil>
     * */
    fun updateResourceRequired(project: Project, hoursPerSkill:Pair<String,Float>){
        //Pair<Skill,Hour>
    }

    /**
     * function to add TeamMember for project
     * @param project Project to update
     * @param newResource new TeamMember to add
     * */
    fun addTeamMemberToProject(project: Project, newResource:TeamMember){
        //check for resource required
        //update actualResource with skill
        //update team member list
    }

    /**
     * function to remove TeamMember for project
     * @param project Project to update
     * @param newResource new TeamMember to remove
     * */
    fun removeTeamMemberFromProject(project: Project, newResource:TeamMember){
        //update actual Resource with skill
        //update team member list
    }



}
