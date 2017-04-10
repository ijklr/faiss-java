#include "faiss_jni.h"

#include <iostream>
#include <cstdio>
#include <cstdlib>
#include <jni.h>
#include <Index.h>
#include <IndexFlat.h>
#include <vector>

using namespace std;
using namespace faiss;
namespace
{
    static Index *indexInterface;
}


/*
 * Class:     faiss_FaissJni
 * Method:    cppCtor
 * Signature: (II)V
 */
JNIEXPORT void JNICALL Java_faiss_FaissJni_cppCtor
  (JNIEnv *env, jobject obj, jint dim, jint index_type) {
    switch(index_type) {
	case 0:
	    indexInterface = new Index();
	case 1:
	    indexInterface = new IndexFlat(dim);
    }
    std::cout << ":)!!! jint=" << dim <<std::endl;
    std::cout << "index_type"<< index_type <<std::endl;
  }
