# bazel-thrift-demo

## install thrift

```bash
brew install boost
brew install bison
brew install libevent
brew install thrift
```


## generate code

```bash    
thrift -r -gen java -out src/main/java/ src/main/java/urbancompass/bootcamp/idl/hello.thrift
```

## 启动server:

```bash
bazel run :thrift-server
```

## 启动client:

```bash
 bazel run :thrift-client
```
   
带传参请求:

```bash
bazel run :thrift-client -- litong.deng
```