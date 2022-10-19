/**
 * Copyright (C) 2022 Urban Compass, Inc.
 */
package urbancompass.bootcamp.avro;

import java.io.File;
import java.io.IOException;

import org.apache.avro.file.DataFileReader;
import org.apache.avro.file.DataFileWriter;
import org.apache.avro.io.DatumReader;
import org.apache.avro.io.DatumWriter;
import org.apache.avro.specific.SpecificDatumReader;
import org.apache.avro.specific.SpecificDatumWriter;

public class AvroSerilization {

  private static void serializeTo(String fileName) throws IOException {
    User user1 = User.newBuilder().setId(1).setName("Jack").build();
    User user2 = User.newBuilder().setId(2).setName("Bob").build();

    DatumWriter<User> userDatumWriter = new SpecificDatumWriter<>(User.class);
    DataFileWriter<User> dataFileWriter = new DataFileWriter<>(userDatumWriter);
    dataFileWriter.create(user1.getSchema(), new File(fileName));
    dataFileWriter.append(user1);
    dataFileWriter.append(user2);
    dataFileWriter.close();

    System.out.println("Serialization done.");
  }

  private static void deserializeFrom(String fileName) throws IOException {
    File file = new File(fileName);
    DatumReader<User> userDatumReader = new SpecificDatumReader<>(User.class);
    DataFileReader<User> dataFileReader = new DataFileReader<User>(file, userDatumReader);

    User user = null;
    while (dataFileReader.hasNext()) {
      user = dataFileReader.next(user);
      System.out.println("Read: " + user);
    }

    System.out.println("Deserialization done.");
  }

  public static void main(String[] args) throws IOException {
    String fileName = "/Users/litong.deng/workspace/compass/dip/java-bazel-thrift-demo/users.avro";
    serializeTo(fileName);
    // deserializeFrom(fileName);
  }
}
