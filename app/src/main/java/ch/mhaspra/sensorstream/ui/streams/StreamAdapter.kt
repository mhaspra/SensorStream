package ch.mhaspra.sensorstream.ui.streams

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import ch.mhaspra.sensorstream.R
import ch.mhaspra.sensorstream.domain.Stream

class StreamAdapter(
    context: Context,
    private val streams: List<Stream>
) : BaseAdapter() {
    private val inflater: LayoutInflater =
        context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater

    override fun getCount(): Int {
        return streams.size
    }

    override fun getItem(position: Int): Any {
        return streams[position]
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val rowView = inflater.inflate(R.layout.stream_list_item, parent, false)

        val stream = getItem(position) as Stream

        val iconImageView = rowView.findViewById(R.id.stream_list_item_icon) as ImageView
        iconImageView.setImageResource(android.R.drawable.ic_menu_share)

        val nameTextView = rowView.findViewById(R.id.stream_list_item_name) as TextView
        nameTextView.text = stream.name

        return rowView
    }
}