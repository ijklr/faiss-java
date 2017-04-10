#!/bin/bash


curl -LOk https://github.com/facebookresearch/faiss/archive/master.zip
rm -rf faiss-master
unzip -q master.zip
cp makefile.inc.Mac.brew faiss-master/makefile.inc
javah -cp src/main/java -o src/main/resources/faiss_jni.h faiss.FaissJni
cp src/main/resources/faiss_jni.* faiss-master
cd faiss-master
make clean
make
make faissjni


