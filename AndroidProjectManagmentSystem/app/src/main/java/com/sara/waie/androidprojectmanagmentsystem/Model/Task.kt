package com.sara.waie.androidprojectmanagmentsystem.Model

data class Task(var projectId:String,var taskId:String,var taskStatus:TaskStatus=TaskStatus.OPEN)