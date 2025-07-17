package com.example.user;

import com.user.UserOuterClass;

public class Example {
    public static void main(String[] args) {
        UserOuterClass.User user = UserOuterClass.User.newBuilder()
                .setId("456")
                .build();

        System.out.println("User ID: " + user.getId());

        // Serialize to a byte array
        byte[] bytes = user.toByteArray();
        System.out.println("Serialized bytes: " + bytes);

        // Deserialize from a byte array
        try {
            UserOuterClass.User deserializedUser = UserOuterClass.User.parseFrom(bytes);
            System.out.println("Deserialized User ID: " + deserializedUser.getId());
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
            e.printStackTrace();
        }
    }
}
