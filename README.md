### env
  - protoc

### dev
  - js
    - npx protoc --js_out=import_style=commonjs,binary:./examples/js log.proto
  - java
    - protoc --java_out=./examples/java/src/main/java log.proto
  - rust
    - cargo run

### examples
  - js:
    - Navigate to the examples/js directory: cd examples/js
    - Run the example: node example.js
  - java:
    - Navigate to the examples/java directory: cd examples/java
    - Compile the Java code (you'll need a Java Development Kit (JDK) installed): javac -cp ".:/path/to/protobuf-java-3.x.x.jar" 
      src/main/java/com/example/user/Example.java src/main/java/com/user/UserOuterClass.java (You'll need to replace /path/to/protobuf-java-3.x.x.jar with the actual path
      to the protobuf Java library. You can download it from Maven Central or include it as a dependency in a build system like Maven or Gradle.)
    - Run the example: java -cp ".:/path/to/protobuf-java-3.x.x.jar" com.example.user.Example
  - rust:
    - Navigate to the examples/rust directory: cd examples/rust
    - Run the example: cargo run