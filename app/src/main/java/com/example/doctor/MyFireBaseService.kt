package com.example.doctor

import android.app.NotificationManager
import android.content.Context
import android.media.RingtoneManager
import android.util.Log
import androidx.core.app.NotificationCompat
import com.google.firebase.messaging.FirebaseMessagingService
import com.google.firebase.messaging.RemoteMessage

class MyFireBaseService: FirebaseMessagingService() {

    override fun onNewToken(token: String) {
        super.onNewToken(token)
        Log.d("Token",token)
    }

    override fun onMessageReceived(message: RemoteMessage) {
        super.onMessageReceived(message)
        if (message!=null){
            showNotification(message.notification!!.title,message.notification!!.body)

        }
    }

    fun showNotification(title:String?,body:String?){
        val sound=RingtoneManager.getDefaultUri(RingtoneManager.TYPE_NOTIFICATION)
        val notification=NotificationCompat.Builder(this)
            .setSmallIcon(android.R.drawable.stat_notify_chat)
            .setContentTitle(title)
            .setContentText(body).setSound(sound)
            .setAutoCancel(true)

        val notifyManager=getSystemService(Context.NOTIFICATION_SERVICE)
            as NotificationManager

        notifyManager.notify(0,notification.build())
    }


}