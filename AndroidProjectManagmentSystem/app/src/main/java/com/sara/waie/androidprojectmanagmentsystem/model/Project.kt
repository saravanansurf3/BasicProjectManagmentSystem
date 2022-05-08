package com.sara.waie.androidprojectmanagmentsystem.model

/**
 * @param projectId unique id for project (>=Admin can update)
 * @property name name of the project (>=Admin can update)
 * @property tasks task list for the project (>=Manager can update)
 * @property startDate start date of the project (>=Admin can update)
 * @property plannedEndDate estimated end date for the project (>=Manager can update)
 * @property resourceRequired estimated Skill and hours <Skill,Hours> to complete project (>=Manager can update)
 * @property actualResource resource assigned to the project (>=Manager can update)
 * @property team members assigned for the project (>=Manager can update)
 * @property completedDate update the completed date for Project (>=Admin can update)
 * */
class Project(var projectId: String) {
    var name: String? = null
    var tasks: ArrayList<Task> = ArrayList()
    var startDate: Long = System.currentTimeMillis()
    //TODO:planned to calculate based on task & resource
    var plannedEndDate: Long? = null
    var resourceRequired:HashMap<String,Int> = HashMap()
    var actualResource:HashMap<String,Float> =HashMap()
    var team:ArrayList<Member> = arrayListOf()
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


    /**
     * function to get Total Estimated hour for project
     * */
    fun getTotalEstimation(project: Project):Float{
        //resourceRequired total
        return 10.0f
    }

    /**
     * function to get estimated hour for specifc skill
     * */
    fun getEstimationBySkill(project: Project,skill:String):Float{
        //resourceRequired->for selected skill
        return 10.0f
    }





}
