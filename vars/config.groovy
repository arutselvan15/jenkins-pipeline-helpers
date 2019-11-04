#!/usr/bin/env groovy

import com.johnny.jenkins.Config

def show(){
    for (c in Config.getConfig() ) {
        println "${c.key} = ${c.value}"
    }
}

def get(){
    return Config.getConfig()
}
