package mischa.arcillas.com.recipelist

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.widget.Adapter
import android.widget.LinearLayout
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recycleview = findViewById<RecyclerView>(R.id.recyclerView)

        recycleview.layoutManager = LinearLayoutManager(this, LinearLayout.VERTICAL, false)

        val users = ArrayList<User>()

        users.add(User("Pinoy Spaghetti", "Filipino-style spaghetti is an interesting take on an Italian classic dish. Made with banana catsup and hot dogs, it’s not your ordinary bolognese!"))
        users.add(User("Chicken Curry", "s a common delicacy in South Asia, Southeast Asia, as well as in the Caribbean (where it is usually referred to as \"curry chicken\")."))
        users.add(User("Chicken Adobo", " is a popular dish and cooking process in Philippine cuisine that involves meat, seafood, or vegetables marinated in vinegar, soy sauce, garlic, and black peppercorns, which is browned in oil, and simmered in the marinade. It has sometimes been considered as the unofficial national dish in the Philippines."))
        users.add(User("Chocolate Cake", "Chocolate cake or Chocolate gateau (from French: gâteau au chocolat) is a cake flavored with melted chocolate, cocoa powder, or both."))
        users.add(User("Chocolate Mousse", "A mousse (French 'foam' /ˈmuːs/) is a soft prepared food that incorporates air bubbles to give it a light and airy texture. It can range from light and fluffy to creamy and thick, depending on preparation techniques. A mousse may be sweet or savoury."))
        users.add(User("Mango Lime", " "))
        users.add(User("Fried Rice", "Fried rice is a dish of cooked rice that has been stir-fried in a wok or a frying pan and is usually mixed with other ingredients such as eggs, vegetables, seafood, or meat."))

        val adapter = CustomAdpater(users, applicationContext)

        recycleview.adapter = adapter



    }



}

