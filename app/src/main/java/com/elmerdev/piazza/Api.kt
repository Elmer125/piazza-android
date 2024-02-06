package com.elmerdev.piazza

import dev.hotwire.turbo.BuildConfig

class Api {
  companion object {
//    private val baseUrl = if(BuildConfig.DEBUG)
//      "http://192.168.0.11:3000"
//    else
//      "https://piazza-web-3ps7.onrender.com"
    private val baseUrl = "http://192.168.0.11:3000"

    val rootUrl = "$baseUrl/"
    val profileUrl = "$baseUrl/profile"
    val loginUrl = "$baseUrl/login"

  }
}