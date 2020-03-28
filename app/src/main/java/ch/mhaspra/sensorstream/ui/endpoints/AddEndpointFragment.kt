package ch.mhaspra.sensorstream.ui.endpoints

import android.app.AlertDialog
import android.app.Dialog
import android.content.DialogInterface
import android.os.Bundle
import androidx.fragment.app.DialogFragment
import ch.mhaspra.sensorstream.R

class AddEndpointFragment : DialogFragment() {

    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        return activity?.let {
            val inflater = requireActivity().layoutInflater;
            val builder = AlertDialog.Builder(it)
            builder.setMessage(R.string.add_endpoint)
                .setView(inflater.inflate(R.layout.endpoint_add_dialog, null))
                .setPositiveButton(R.string.btn_save) { dialog, id ->
                    // FIRE ZE MISSILES!
                }
                .setNegativeButton(R.string.btn_cancel) { _, _ ->
                    // Nothing to do on cancel
                }
            builder.create()
        } ?: throw IllegalStateException("Activity cannot be null")
    }
}