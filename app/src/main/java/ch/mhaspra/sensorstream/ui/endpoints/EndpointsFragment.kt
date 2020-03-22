package ch.mhaspra.sensorstream.ui.endpoints

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.Observer
import ch.mhaspra.sensorstream.R

class EndpointsFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val homeViewModel by viewModels<EndpointsViewModel>()

        val root = inflater.inflate(R.layout.fragment_endpoints, container, false)
        val textView: TextView = root.findViewById(R.id.text_endpoints)
        homeViewModel.text.observe(viewLifecycleOwner, Observer {
            textView.text = it
        })
        return root
    }
}