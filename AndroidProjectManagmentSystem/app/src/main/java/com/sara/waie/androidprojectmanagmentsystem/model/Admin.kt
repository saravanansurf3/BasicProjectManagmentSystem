package com.sara.waie.androidprojectmanagmentsystem.model
/**
 * Admin is like HR in organization
 * */
open class Admin(override var id:String):TeamManager(id) {


    //ROLE related operation
    /**
     * function to update member as manager
     * @param newManager
     * */
    fun createManager(newManager: TeamManager){

    }

    /**
     * function to update manager details
     * @param manager
     * */
    fun updateManager(manager: TeamManager){

    }

    //PROJECT related operation
    /**
     * function to create project
     * */
    fun createProject(newProject: Project){

    }

    /**
     * function to update project name
     * */
    fun updateProjectName(project: Project, newName:String){


    }

    /**
     * function to update start date of project
     * */
    fun updateStartDate(project: Project, newStartDate:Long){

    }

    /**
     * function to update completed date of project
     * */
    fun updateCompletedDate(project: Project, completedDate:Long){

    }



}