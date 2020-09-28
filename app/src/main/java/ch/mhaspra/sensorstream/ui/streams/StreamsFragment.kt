package ch.mhaspra.sensorstream.ui.streams

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ListView
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.Observer
import ch.mhaspra.sensorstream.R
import ch.mhaspra.sensorstream.ui.endpoints.AddEndpointFragment
import ch.mhaspra.sensorstream.ui.endpoints.EndpointAdapter
import ch.mhaspra.sensorstream.ui.endpoints.EndpointsViewModel
import com.google.android.material.floatingactionbutton.FloatingActionButton

class StreamsFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val streamsViewModel by viewModels<StreamsViewModel>()

        val root = inflater.inflate(R.layout.fragment_streams, container, false)

        val listView = root.findViewById(R.id.streams_list) as ListView
        streamsViewModel.streams.observe(viewLifecycleOwner, Observer {
            listView.adapter = StreamAdapter(root.context, it)
        })

        val fab: FloatingActionButton = root.findViewById(R.id.add_stream)
        fab.setOnClickListener {
            val dialog = AddEndpointFragment()
            dialog.show(parentFragmentManager, null)
        }

        return root
    }
}