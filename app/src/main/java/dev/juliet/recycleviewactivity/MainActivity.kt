//package dev.juliet.recycleviewactivity
//
//import androidx.appcompat.app.AppCompatActivity
//import android.os.Bundle
//import androidx.recyclerview.widget.LinearLayoutManager
//
//class MainActivity : AppCompatActivity() {
//    lateinit var binding: ActivityMainBinding
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        binding= ActivityMainBinding.inflate(layoutInflater)
//        setContentView(binding.root)
//        displayNames()
////        setContentView(R.layout.activity_main)
//    }
//    fun displayNames(){
//        var namesList= listOf(1,2,3,4,5,6,7,8,9,10)
//        val nameAdapter=NumbersRecyclerViewAdapter(namesList)
//        binding.rvName.layoutManager= LinearLayoutManager(this)
//        binding.rvName.adapter=nameAdapter
//    }
//}