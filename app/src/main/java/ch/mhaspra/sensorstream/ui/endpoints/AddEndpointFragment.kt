package ch.mhaspra.sensorstream.ui.endpoints

import android.app.AlertDialog
import android.app.Dialog
import android.os.Bundle
import android.widget.EditText
import androidx.fragment.app.DialogFragment
import ch.mhaspra.sensorstream.R
import ch.mhaspra.sensorstream.UseCaseLocator
import ch.mhaspra.sensorstream.application.usecases.endpoints.AddEndpointUseCase

class AddEndpointFragment : DialogFragment() {

    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        return activity?.let {
            val inflater = requireActivity().layoutInflater
            val builder = AlertDialog.Builder(it)
            builder.setMessage(R.string.add_endpoint)
                .setView(inflater.inflate(R.layout.endpoint_add_dialog, null))
                .setPositiveButton(R.string.btn_save) { _, _ ->
                    val nameText = dialog?.findViewById<EditText>(R.id.add_endpoint_name)
                    val urlText = dialog?.findViewById<EditText>(R.id.add_endpoint_url)

                    UseCaseLocator.getAddEndpointUseCase().invoke(nameText?.text.toString(), urlText?.text.toString())
                }
                .setNegativeButton(R.string.btn_cancel) { _, _ ->
                    // Nothing to do on cancel
                }
            builder.create()
        } ?: throw IllegalStateException("Activity cannot be null")
    }
}