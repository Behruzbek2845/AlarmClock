package com.example.alarmclock

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.media.MediaPlayer
import android.widget.Toast

class AlarmReceiver : BroadcastReceiver() {
    override fun onReceive(context: Context?, intent: Intent?) {
        Toast.makeText(context, "Alarm ringing!", Toast.LENGTH_SHORT).show()
        val media = MediaPlayer.create(context, R.raw.sa)
        media.start()
    }
}