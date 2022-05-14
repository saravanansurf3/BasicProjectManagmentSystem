package com.sara.waie.androidprojectmanagmentsystem.model
/**
 * @param id Non nullable,and Mandatory
 * @property name Name of the Member
 * @property email email of Member eg:sara@gmail.com
 * @property contact contact of Member with details
 * @property role Role::Enum,default Role.NON_TEAM_MEMBER
 * @property skillList list of skils member have eg:Android,Design,Construction
 * @property projectList list of projects member was assigned
 * @property taskList list of task member was assigned
 * */
open class Member(open var id:String){
    var name:String?=null
    var email:String?=null
    var contact:Contact?=null
    var role:Role=Role.NON_TEAM_MEMBER
    var skillList:ArrayList<String> = ArrayList()
    var projectList:ArrayList<Project> = ArrayList()
    var taskList:HashMap<String,ArrayList<Task>> = HashMap()
}
