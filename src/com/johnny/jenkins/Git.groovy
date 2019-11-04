#!/usr/bin/env groovy

package com.johnny.jenkins.pipeline

import com.johnny.jenkins.Config

class Git{
  def repoName

  Git(repoName) {
    this.repoName = repoName
    this.config = Config.getConfig()
  }

  def getRepoPath() {
    return this.config.gitUrl + '/' + this.config.gitUser + '/' + this.repoName + '.git'
  }

  def checkOut() {
    println 'checkout ' + this.getRepoPath()
  }
}
