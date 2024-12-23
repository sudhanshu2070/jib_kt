package com.example.iasset_mobile.ui.task

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.support.v4.app.Fragment
import android.arch.lifecycle.ViewModelProvider
import com.example.iasset_mobile.databinding.FragmentTaskBinding

class TaskFragment : Fragment() {

    private var _binding: FragmentTaskBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val taskViewModel =
            ViewModelProvider(
                this,
                ViewModelProvider.NewInstanceFactory()
            ).get(TaskViewModel::class.java)

        _binding = FragmentTaskBinding.inflate(inflater, container, false)
        val root: View = binding.root

        val textView: TextView = binding.textTask
        taskViewModel.text.observe(viewLifecycleOwner) {
            textView.text = it
        }

        // Handling clicks on the status items
        val awaiting: TextView = binding.awaiting
        val assigned: TextView = binding.assigned
        val raised: TextView = binding.raised
        val declined: TextView = binding.declined
        val reAssigned: TextView = binding.reAssigned

        awaiting.setOnClickListener {
            // Handle Awaiting item click
            taskViewModel.updateText ("Awaiting Selected")
        }

        assigned.setOnClickListener {
            // Handle Assigned item click
            taskViewModel.updateText("Assigned Selected")
        }

        raised.setOnClickListener {
            // Handle Raised item click
            taskViewModel.updateText("Raised Selected")
        }

        declined.setOnClickListener {
            // Handle Declined item click
            taskViewModel.updateText("Declined Selected")
        }
        reAssigned.setOnClickListener {
            // Handle Declined item click
            taskViewModel.updateText("Re-assigned Selected")
        }

        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}