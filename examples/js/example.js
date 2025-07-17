const user_pb = require('./user_pb.js');

const user = new user_pb.User();
user.setId('123');

console.log('User ID:', user.getId());

// Serialize to a byte array
const bytes = user.serializeBinary();
console.log('Serialized bytes:', bytes);

// Deserialize from a byte array
const deserializedUser = user_pb.User.deserializeBinary(bytes);
console.log('Deserialized User ID:', deserializedUser.getId());