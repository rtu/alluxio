// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: grpc/meta_master.proto

package alluxio.grpc;

public interface SetPathConfigurationPRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:alluxio.grpc.meta.SetPathConfigurationPRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>optional string path = 1;</code>
   */
  boolean hasPath();
  /**
   * <code>optional string path = 1;</code>
   */
  java.lang.String getPath();
  /**
   * <code>optional string path = 1;</code>
   */
  com.google.protobuf.ByteString
      getPathBytes();

  /**
   * <code>map&lt;string, string&gt; properties = 2;</code>
   */
  int getPropertiesCount();
  /**
   * <code>map&lt;string, string&gt; properties = 2;</code>
   */
  boolean containsProperties(
      java.lang.String key);
  /**
   * Use {@link #getPropertiesMap()} instead.
   */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String>
  getProperties();
  /**
   * <code>map&lt;string, string&gt; properties = 2;</code>
   */
  java.util.Map<java.lang.String, java.lang.String>
  getPropertiesMap();
  /**
   * <code>map&lt;string, string&gt; properties = 2;</code>
   */

  java.lang.String getPropertiesOrDefault(
      java.lang.String key,
      java.lang.String defaultValue);
  /**
   * <code>map&lt;string, string&gt; properties = 2;</code>
   */

  java.lang.String getPropertiesOrThrow(
      java.lang.String key);

  /**
   * <code>optional .alluxio.grpc.meta.SetPathConfigurationPOptions options = 3;</code>
   */
  boolean hasOptions();
  /**
   * <code>optional .alluxio.grpc.meta.SetPathConfigurationPOptions options = 3;</code>
   */
  alluxio.grpc.SetPathConfigurationPOptions getOptions();
  /**
   * <code>optional .alluxio.grpc.meta.SetPathConfigurationPOptions options = 3;</code>
   */
  alluxio.grpc.SetPathConfigurationPOptionsOrBuilder getOptionsOrBuilder();
}