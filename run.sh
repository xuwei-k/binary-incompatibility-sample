#!/usr/bin/env bash

rm -rf $HOME/.ivy2/cache/com.example/ &&
rm -rf $HOME/.ivy2/local/ &&
cd library &&
sbt publishLocal &&
cd .. &&
sbt clean update sampleMain/run
