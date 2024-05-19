package com.oscargil80.bottoncodelia

import android.app.NotificationChannel
import android.app.NotificationManager
import android.content.Context
import android.graphics.Color
import android.graphics.LightingColorFilter
import android.hardware.lights.Light
import android.os.Build
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.app.NotificationCompat
import androidx.core.app.NotificationManagerCompat
import com.oscargil80.bottoncodelia.databinding.FragmentPrimerBinding


class primerFragment : Fragment() {

    private var _binding:FragmentPrimerBinding? = null
    private val binding get() = _binding!!

    private val channelID = "channelID"
    private val channelName = "channelName"
    private val notificacionID = 0

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View{
        _binding = FragmentPrimerBinding.inflate(inflater, container, false)

        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        createNotificationChannel()
        val notification = NotificationCompat.Builder(requireContext(), channelID).also{
            it.setContentTitle("SAAD")
            it.setContentText("SAAD NOTIFICA QUE TIENE NUEVO MENSAJE, DEBE PRESNTAR CREDENCIALES PARA CONCRETAR LA COMPRA")
            it.setSmallIcon(R.drawable.ic_rojo_message)
            it.setPriority(NotificationCompat.PRIORITY_MAX)
        }.build()

        val notificationManager: NotificationManagerCompat = NotificationManagerCompat.from(requireContext())

        binding.notifi.setOnClickListener {
           notificationManager.notify(notificacionID, notification)
        }

    }

    private fun createNotificationChannel() {
      if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.O){
          val importance : Int = NotificationManager.IMPORTANCE_HIGH

          val channel = NotificationChannel(channelID, channelName, importance).apply {
              //LightingColorFilter = Color.RED
              enableLights(true)
          }

          val manager:NotificationManager = activity?.getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager

          manager.createNotificationChannel(channel)

      }
    }
}