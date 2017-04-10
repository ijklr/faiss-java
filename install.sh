#!/bin/bash


curl -LOk https://github.com/facebookresearch/faiss/archive/master.zip
rm -rf faiss-master
unzip -q master.zip
unamestr=`uname`
if [[ "$unamestr" == 'Linux' ]]; then
    cp makefile.inc.Linux faiss-master/makefile.inc
else 
    cp makefile.inc.Mac.brew faiss-master/makefile.inc
fi
javah -cp src/main/java -o src/main/resources/faiss_jni.h faiss.FaissJni
cp src/main/resources/faiss_jni.* faiss-master
cp src/main/resources/easytest.cpp faiss-master
cd faiss-master
make clean
make
make faissjni
make easy
./easytest


