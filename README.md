# bazel-thrift-demo

## Thrift Serialization Demo

### install thrift

```bash
brew install boost
brew install bison
brew install libevent
brew install thrift
```

### generate code

```bash    
thrift -r -gen java -out src/main/java src/main/java/urbancompass/bootcamp/schema/hello.thrift
```

### 启动server:

```bash
bazel run :thrift_server
```

### 启动client:

```bash
 bazel run :thrift_client
```

带传参请求:

```bash
bazel run :thrift_client -- litong.deng
```

## Avro Serialization Demo

### install avro-tools

```bash
brew install avro-tools
```

### generate code

```bash
avro-tools compile -string schema src/main/java/urbancompass/bootcamp/schema/user.avsc src/main/java
```

### run avro serialization

```bash
bazel run :avro_serialization
```

### Visual serialized code

```bash
xxd -b users.avro
```