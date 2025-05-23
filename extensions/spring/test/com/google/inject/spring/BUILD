# Copyright 2011 Google Inc.  All rights reserved.
# Author: sameb@google.com (Sam Berlin)
load("@rules_java//java:defs.bzl", "java_library")
load("//:build_defs.bzl", "JAVAC_OPTS")
load("//:test_defs.bzl", "guice_test_suites")

package(
    default_testonly = 1,
)

java_library(
    name = "tests",
    srcs = glob(["**/*.java"]),
    javacopts = JAVAC_OPTS,
    deps = [
        "//core/src/com/google/inject",
        "//extensions/spring/src/com/google/inject/spring",
        "//third_party/java/junit",
        "//third_party/java/spring:beans",
    ],
)

guice_test_suites(
    name = "gen_tests",
    sizes = ["small"],
    deps = [
        ":tests",
        "//extensions/spring/src/com/google/inject/spring",  # bazel requires this b/c of package_info.java
    ],
)

[guice_test_suites(
    name = "gen_tests_%s" % include_stack_trace_option,
    args = ["--guice_include_stack_traces=%s" % include_stack_trace_option],
    sizes = [
        "small",
    ],
    suffix = "_stack_trace_%s" % include_stack_trace_option,
    deps = [
        ":tests",
        "//extensions/spring/src/com/google/inject/spring",  # bazel requires this b/c of package_info.java
    ],
) for include_stack_trace_option in [
    "OFF",
]]
