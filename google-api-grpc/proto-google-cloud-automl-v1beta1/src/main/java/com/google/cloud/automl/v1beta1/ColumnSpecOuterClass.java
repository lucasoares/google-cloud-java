// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/automl/v1beta1/column_spec.proto

package com.google.cloud.automl.v1beta1;

public final class ColumnSpecOuterClass {
  private ColumnSpecOuterClass() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_automl_v1beta1_ColumnSpec_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_automl_v1beta1_ColumnSpec_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_automl_v1beta1_ColumnSpec_CorrelatedColumn_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_automl_v1beta1_ColumnSpec_CorrelatedColumn_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n-google/cloud/automl/v1beta1/column_spe"
          + "c.proto\022\033google.cloud.automl.v1beta1\032\034go"
          + "ogle/api/annotations.proto\032,google/cloud"
          + "/automl/v1beta1/data_stats.proto\032,google"
          + "/cloud/automl/v1beta1/data_types.proto\"\204"
          + "\003\n\nColumnSpec\022\014\n\004name\030\001 \001(\t\0228\n\tdata_type"
          + "\030\002 \001(\0132%.google.cloud.automl.v1beta1.Dat"
          + "aType\022\024\n\014display_name\030\003 \001(\t\022:\n\ndata_stat"
          + "s\030\004 \001(\0132&.google.cloud.automl.v1beta1.Da"
          + "taStats\022X\n\026top_correlated_columns\030\005 \003(\0132"
          + "8.google.cloud.automl.v1beta1.ColumnSpec"
          + ".CorrelatedColumn\022\014\n\004etag\030\006 \001(\t\032t\n\020Corre"
          + "latedColumn\022\026\n\016column_spec_id\030\001 \001(\t\022H\n\021c"
          + "orrelation_stats\030\002 \001(\0132-.google.cloud.au"
          + "toml.v1beta1.CorrelationStatsB\204\001\n\037com.go"
          + "ogle.cloud.automl.v1beta1P\001ZAgoogle.gola"
          + "ng.org/genproto/googleapis/cloud/automl/"
          + "v1beta1;automl\312\002\033Google\\Cloud\\AutoMl\\V1b"
          + "eta1b\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
        descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.AnnotationsProto.getDescriptor(),
          com.google.cloud.automl.v1beta1.DataStatsOuterClass.getDescriptor(),
          com.google.cloud.automl.v1beta1.DataTypes.getDescriptor(),
        },
        assigner);
    internal_static_google_cloud_automl_v1beta1_ColumnSpec_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_automl_v1beta1_ColumnSpec_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_automl_v1beta1_ColumnSpec_descriptor,
            new java.lang.String[] {
              "Name", "DataType", "DisplayName", "DataStats", "TopCorrelatedColumns", "Etag",
            });
    internal_static_google_cloud_automl_v1beta1_ColumnSpec_CorrelatedColumn_descriptor =
        internal_static_google_cloud_automl_v1beta1_ColumnSpec_descriptor.getNestedTypes().get(0);
    internal_static_google_cloud_automl_v1beta1_ColumnSpec_CorrelatedColumn_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_automl_v1beta1_ColumnSpec_CorrelatedColumn_descriptor,
            new java.lang.String[] {
              "ColumnSpecId", "CorrelationStats",
            });
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.cloud.automl.v1beta1.DataStatsOuterClass.getDescriptor();
    com.google.cloud.automl.v1beta1.DataTypes.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
