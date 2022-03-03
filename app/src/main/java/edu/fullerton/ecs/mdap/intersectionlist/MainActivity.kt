package edu.fullerton.ecs.mdap.intersectionlist

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import edu.fullerton.ecs.mdap.intersectionlist.adapter.IntersectionListAdapter
import edu.fullerton.ecs.mdap.intersectionlist.databinding.ActivityMainBinding

/**
 * Defines the functionalities for the main screen of the application.
 */
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        /**
         * Create a binding to activity_main.xml. Binding classes are auto-generated. The name of
         * the class is taken from the name of the XML file, but using camel case and omitting
         * underscores and the file extension. The class name ends with the word Binding.  In this
         * case activity_main.xml -> ActivityMainBinding. The inflate function is used to generate
         * the visual representation of the XML file. layoutinflater is an inherited property that
         * is an object used for performing inflation.
         */
        var binding = ActivityMainBinding.inflate(layoutInflater)
        // root is a property holding the view of the inflated XML and is set as the contentView
        setContentView(binding.root)

        /**
         * READ ONLY WHEN WORKING ON MODEL 2:
         * We create an intersectionListAdapter that provides the methods required by a
         * RecylerView object. We assign it to the adapter property so that the recyclerView can
         * call our implementation of the methods inside intersectionListAdapter.
         */
        /*
        var intersectionListAdapter = IntersectionListAdapter(this)
        binding.recyclerView.adapter = intersectionListAdapter
        */

        /**
         * Elements of the XML can be accessed through the binding by using the dot notation
         * followed by the id of the element. In this case, addIntersection is a Button inside
         * activity_main.xml. We use the element's setOnClickListener to define its reaction to
         * click events.
         */
        binding.addIntersection.setOnClickListener {
            /** We create a Toast object to display the appropriate message. Take note we also use
             * binding to retrieve the name and address values from the corresponding TextView
             * objects in the layout.
             */
            val toast = Toast.makeText(
                this,
                "Adding ${binding.intersectionName.text}",
                Toast.LENGTH_SHORT
            )
            toast.show()
            /** READ ONLY WHEN WORKING ON MODEL 2 **/
            /*
            // We can access the data through the dataset property inside intersectionListAdapter.
            intersectionListAdapter.dataset.add("${binding.intersectionName.text} @ ${binding.intersectionAddress.text}")

            // Inform the adapter that we made changes so the visual representation can be updated.
            intersectionListAdapter.notifyDataSetChanged()
            */
        }
    }
}
