# bazel-thrift-demo

## install thrift

    brew install boost
    brew install bison
    brew install libevent
    brew install thrift

## generate code

    thrift -r -gen java -out src/main/java/ hello.thrift

## 启动server:

    bazel run :thrift-server

## 启动client:

    bazel run :thrift-client
    
    # 带传参请求
    bazel run :thrift-client -- litong.deng