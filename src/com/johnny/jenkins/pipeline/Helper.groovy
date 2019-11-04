#!/usr/bin/env groovy

package com.johnny.jenkins.pipeline

import com.johnny.jenkins.Config
import com.johnny.jenkins.Git

class Helper implements Serializable {
  def name
  def steps

  Helper(name, steps) {
    this.name = name
    this.steps = steps
  }
 
  def checkOut() {
    def gitRepo = Git(this.name)
    gitRepo.checkOut()
  }

  def test() {
    println 'make test'
  }

  def build() {
    println 'make build'
  }

  def createImage() {
    println 'make docker'
  }

  def pushImage() {
    println 'push image'
  }

  def archive() {
    println 'archive'
  }
}
