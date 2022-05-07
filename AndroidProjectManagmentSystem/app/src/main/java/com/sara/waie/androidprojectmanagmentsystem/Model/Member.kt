package com.sara.waie.androidprojectmanagmentsystem.Model
//id -Non nullable
//name-Nullable
//email-nullable
//contact-nullable
//role-ENUM of Role
//SkillList -hold the list of skill id(reference)- can change to int if required
//projectList- hold the list of Project id(reference)
//taskList- hold the list of Task  in each project (ProjectId,TaskList)
open class Member(open var id:String){
    var name:String?=null
    var email:String?=null
    var contact:Contact?=null
    protected var role:Role=Role.NON_TEAM_MEMBER
    protected var skillList:ArrayList<String> = ArrayList()
    protected var projectList:ArrayList<Project> = ArrayList()
    private var taskList:HashMap<String,ArrayList<Task>> = HashMap()
}
