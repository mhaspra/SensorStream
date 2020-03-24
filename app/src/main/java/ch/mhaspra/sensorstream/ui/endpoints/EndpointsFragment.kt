package ch.mhaspra.sensorstream.ui.endpoints

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ListView
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
        val endpointsViewModel by viewModels<EndpointsViewModel>()

        val root = inflater.inflate(R.layout.fragment_endpoints, container, false)

        val listView = root.findViewById(R.id.endpoints_list) as ListView
        endpointsViewModel.endpoints.observe(viewLifecycleOwner, Observer {
            listView.adapter = EndpointAdapter(root.context, it)
        })

        return root
    }
}