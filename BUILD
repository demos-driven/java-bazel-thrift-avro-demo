load("@rules_java//java:defs.bzl", "java_binary", "java_library")

package(default_visibility = ["//visibility:public"])

java_binary(
    name = "thrift_server",
    main_class = "urbancompass.bootcamp.thrift.HelloServer",
    runtime_deps = [":thrift_lib"],
)

java_binary(
    name = "thrift_client",
    main_class = "urbancompass.bootcamp.thrift.HelloClient",
    runtime_deps = [":thrift_lib"],
)

java_library(
    name = "thrift_lib",
    srcs = glob([
        "src/main/java/urbancompass/bootcamp/thrift/*.java",
    ]),
    deps = [
        "@maven//:javax_annotation_javax_annotation_api",
        "@maven//:org_apache_thrift_libthrift",
        "@maven//:org_slf4j_slf4j_api",
    ],
)

java_binary(
    name = "avro_serialization",
    main_class = "urbancompass.bootcamp.avro.AvroSerilization",
    runtime_deps = [":avro_lib"],
)

java_library(
    name = "avro_lib",
    srcs = glob([
        "src/main/java/urbancompass/bootcamp/avro/*.java",
    ]),
    deps = [
        "@maven//:com_google_guava_guava",
        "@maven//:org_apache_avro_avro",
    ],
)
