package com.sara.waie.androidprojectmanagmentsystem.ui

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import android.view.Menu
import android.view.MenuItem
import com.sara.waie.androidprojectmanagmentsystem.R
import com.sara.waie.androidprojectmanagmentsystem.model.*
import com.sara.waie.androidprojectmanagmentsystem.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var appBarConfiguration: AppBarConfiguration
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setSupportActionBar(binding.toolbar)

        val navController = findNavController(R.id.nav_host_fragment_content_main)
        appBarConfiguration = AppBarConfiguration(navController.graph)
        setupActionBarWithNavController(navController, appBarConfiguration)

        binding.fab.setOnClickListener { view ->
//            Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
//                .setAction("Action", null).show()

//            val listOfPeople=ArrayList<Member>()
//
//            listOfPeople.add(TeamMember("TramMember1"))
//            listOfPeople.add(TeamMember("TramMember2"))
//            listOfPeople.add(TeamLead("TeamLead1"))
//            listOfPeople.add(Manager("Manager1"))
//
//
//            for (m in listOfPeople){
//                when(m){
//                    is Manager->{
//                        Log.d("TEST","am Team Manager obj"+m.id)
//                    }
//                    is TeamLead->{
//                        Log.d("TEST","am Team TeamLead obj"+m.id)
//                    }
//                    is TeamMember->{
//                    Log.d("TEST","am Team Member obj"+m.id)
//                    }
//
//
//                }
//
//            }


            val mytasks=ArrayList<Task>()
            mytasks.add(Task(projectId = "Pj1",taskId = "TSK1",skillRequired = arrayListOf("SKILL1","SKILL@"),timeRequired = 25.0F))
            mytasks.add(Task(projectId = "Pj1",taskId ="TSK2",taskStatus = TaskStatus.INPROGRESS,skillRequired = arrayListOf("SKILL1"),timeRequired = 25.0F,timeTaken = 8.0F))
            val pj1=Project(projectId = "proj1",projectName = "projName1",tasks = mytasks)


            Log.d("TEST","pj1 id:"+pj1.projectId)
            Log.d("TEST","pj1 name:"+pj1.name)
            Log.d("TEST","pj1 tasks:"+pj1.tasks)

            var newManager=TeamManager("Mng1")
            var newAdmin=Admin("Adm1")
            newManager.updateTeamLead(pj1,TeamLead("TemL1"))
//            newManager.updateProjectName(pj1,"newNameOfProject")
            newAdmin.updateProjectName(pj1,"newNameOfProject")





        }


    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.menu_main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        return when (item.itemId) {
            R.id.action_settings -> true
            else -> super.onOptionsItemSelected(item)
        }
    }

    override fun onSupportNavigateUp(): Boolean {
        val navController = findNavController(R.id.nav_host_fragment_content_main)
        return navController.navigateUp(appBarConfiguration)
                || super.onSupportNavigateUp()
    }
}