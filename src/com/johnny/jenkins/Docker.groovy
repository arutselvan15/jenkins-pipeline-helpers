#!/usr/bin/env groovy

package com.johnny.jenkins.pipeline

import com.johnny.jenkins.Config

class Docker{
  def imageName

  Docker(imageName) {
    this.imageName = imageName
    this.config = Config.getConfig()
  }

  def getRepoPath() {
    return this.config.dockerUser + '/' + this.imageName
  }

  def getRepoTagPath(tag) {
    return this.getRepoPath() + ':' + tag
  }
}
