package ch.mhaspra.sensorstream.ui.endpoints

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import ch.mhaspra.sensorstream.R
import ch.mhaspra.sensorstream.domain.Endpoint

class EndpointAdapter(
    context: Context,
    private val endpoints: List<Endpoint>
) : BaseAdapter() {
    private val inflater: LayoutInflater =
        context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater

    override fun getCount(): Int {
        return endpoints.size
    }

    override fun getItem(position: Int): Any {
        return endpoints[position]
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val rowView = inflater.inflate(R.layout.endpoint_list_item, parent, false)

        val endpoint = getItem(position) as Endpoint

        val iconImageView = rowView.findViewById(R.id.endpoint_list_item_icon) as ImageView
        iconImageView.setImageResource(android.R.drawable.ic_menu_share)

        val nameTextView = rowView.findViewById(R.id.endpoint_list_item_name) as TextView
        nameTextView.text = endpoint.name

        val urlTextView = rowView.findViewById(R.id.endpoint_list_item_url) as TextView
        urlTextView.text = endpoint.url

        return rowView
    }
}