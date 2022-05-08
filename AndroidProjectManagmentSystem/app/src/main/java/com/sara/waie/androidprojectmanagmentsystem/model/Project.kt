package com.sara.waie.androidprojectmanagmentsystem.model

//startDate- timestamp
//resourceRequired->Skill,Number of resource required
//actualResource->Skill,Number of resource we have
class Project(var projectId: String) {
    //>=Admin
    var name: String? = null
    //>=Manager
    var tasks: ArrayList<Task> = ArrayList()
    //>=Admin
    var startDate: Long = System.currentTimeMillis()
    //>=Manager
    var plannedEndDate: Long? = null
    //>=Manager
    var resourceRequired:HashMap<String,Int> = HashMap()
    //>=Manager
    var actualResource:HashMap<String,Int> =HashMap()
    //>=Manager
    var team:ArrayList<Member> = arrayListOf()
    //>=Admin
    var completedDate: Long? = null



    constructor(projectId: String, projectName: String) : this(projectId) {
        this.name = projectName
    }

    constructor(projectId: String, projectName: String, tasks: ArrayList<Task>) : this(
        projectId,
        projectName
    ) {
        this.tasks = tasks
    }


    fun getTotalEstimation():Float{
        //resourceRequired total
        return 10.0f
    }

    fun getEstimationBySkill(skill:String):Float{
        //resourceRequired->for selected skil
        return 10.0f
    }



}
