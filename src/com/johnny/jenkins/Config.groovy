#!/usr/bin/env groovy

package com.johnny.jenkins

class Config{
  // config map
  private def config = [
    versionFile : "/etc/version.txt",
    
    // git configs
    gitUrl : "https://github.com",
    gitUser : "arutselvan15",
    
    // go configs
    goCache : "/tmp",
    
    // docker configs
    dockerHub : "https://hub.docker.com/",
    dockerUser : "arutselvan15",
    dockerToken : "510b049b-c3d2-4ed5-b43b-c4caae3880df",
    dockerTokenDesc : "arutselvan15+jenksin-ci",
    dockerGoBuildImage : "golang:1.12.4",
    
    // alert configs
    // slack
    slackSubDomain : "arutselvan15",
    slackToken : "6rNH8TUK5Kv59cxhWIl1xRDP",
    slackJenkinsChannel : "#jenkins",
    // email
    email : "johnnyimbot@gmail.com",
    
    // colors
    colorRed : "red",
    colorGreen : "green",
    colorYellow : "yellow",

    // colorcodes
    colorCodes : [
      green : "#008000",
      red : "#FF0000",
      yellow : "#FFFF00",
    ]
  ]

  static def getConfig(){
    return this.config
  }
}
