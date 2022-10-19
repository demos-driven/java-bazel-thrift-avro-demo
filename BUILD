load("@rules_java//java:defs.bzl", "java_binary", "java_library")

package(default_visibility = ["//visibility:public"])

java_binary(
    name = "thrift-server",
    main_class = "urbancompass.bootcamp.thrift.HelloServer",
    runtime_deps = [":thrift-lib"],
)

java_binary(
    name = "thrift-client",
    main_class = "urbancompass.bootcamp.thrift.HelloClient",
    runtime_deps = [":thrift-lib"],
)

java_library(
    name = "thrift-lib",
    srcs = glob([
        "**/*.java",
    ]),
    deps = [
        "@maven//:org_apache_thrift_libthrift",
        "@maven//:org_slf4j_slf4j_api",
        "@maven//:javax_annotation_javax_annotation_api",
    ]
)