package com.sara.waie.androidprojectmanagmentsystem.model
//Like HR
open class Administrator(override var id:String):Manager(id) {


    //ROLE related operation
    fun createManager(newManager: Manager){

    }

    fun updateManager(manager: Manager){

    }

    //PROJECT related operation
    fun createProject(newProject: Project){

    }

    fun updateProjectName(project: Project,newName:String){

    }
    fun updateStartDate(project: Project,newStartDate:Long){

    }
    fun updateCompletedDate(project: Project,completedDate:Long){

    }



}