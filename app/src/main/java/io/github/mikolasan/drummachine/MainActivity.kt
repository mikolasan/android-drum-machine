package io.github.mikolasan.drummachine

import android.media.MediaPlayer
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val btnCrash: Button = findViewById(R.id.btn_crash)
        val btnHiHat: Button = findViewById(R.id.btn_hihat)
        val btnTom: Button = findViewById(R.id.btn_tom)
        val btnRide: Button = findViewById(R.id.btn_ride)
        val btnSnare: Button = findViewById(R.id.btn_snare)
        val btnKick: Button = findViewById(R.id.btn_kick)
        val btnFloor: Button = findViewById(R.id.btn_floor)

        btnCrash.setOnClickListener {
            val player = MediaPlayer.create(this, R.raw.crash)
            player.start()
        }

        btnHiHat.setOnClickListener {
            val player = MediaPlayer.create(this, R.raw.closed_hat)
            player.start()
        }

        btnTom.setOnClickListener {
            val player = MediaPlayer.create(this, R.raw.tom)
            player.start()
        }

        btnRide.setOnClickListener {
            val player = MediaPlayer.create(this, R.raw.open_hat)
            player.start()
        }

        btnSnare.setOnClickListener {
            val player = MediaPlayer.create(this, R.raw.snare)
            player.start()
        }

        btnKick.setOnClickListener {
            val player = MediaPlayer.create(this, R.raw.kick)
            player.start()
        }

        btnFloor.setOnClickListener {
            val player = MediaPlayer.create(this, R.raw.floor)
            player.start()
        }

    }
}
