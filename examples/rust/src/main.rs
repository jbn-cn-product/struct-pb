pub mod user {
    include!(concat!(env!("OUT_DIR"), "/user.rs"));
}

fn main() {
    let user = user::User {
        id: "789".to_string(),
    };

    println!("User ID: {}", user.id);

    // Serialize to a byte array
    let bytes = prost::Message::encode_to_vec(&user);
    println!("Serialized bytes: {:?}", bytes);

    // Deserialize from a byte array
    let deserialized_user: user::User = prost::Message::decode(&bytes[..]).unwrap();
    println!("Deserialized User ID: {}", deserialized_user.id);
}
