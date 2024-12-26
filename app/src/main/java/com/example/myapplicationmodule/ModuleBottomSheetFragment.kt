import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplicationmodule.ModuleAdapter
import com.example.myapplicationmodule.R
//import androidx.fragment.app.BottomSheetDialogFragment
import com.google.android.material.bottomsheet.BottomSheetDialogFragment


class ModuleBottomSheetFragment : BottomSheetDialogFragment() {

    private lateinit var closeButton: ImageView
    private lateinit var recyclerView: RecyclerView
    private val moduleList = listOf("Module A", "Module B", "Module C", "Module D", "Module E", "Module F","Module G", "Module H","Module B", "Module C", "Module D", "Module E", "Module F","Module G", "Module H") // Your modules

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_module_bottom_sheet, container, false)

        closeButton = view.findViewById(R.id.closeButton)
        recyclerView = view.findViewById(R.id.recyclerView)

        // Set up RecyclerView
        recyclerView.layoutManager = LinearLayoutManager(activity)
        recyclerView.adapter = ModuleAdapter(moduleList)

        // Close Button functionality
        closeButton.setOnClickListener {
            dismiss()
        }

        return view
    }
}