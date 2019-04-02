// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/datalabeling/v1beta1/annotation.proto

package com.google.cloud.datalabeling.v1beta1;

/**
 *
 *
 * <pre>
 * Specifies where is the answer from.
 * </pre>
 *
 * Protobuf enum {@code google.cloud.datalabeling.v1beta1.AnnotationSource}
 */
public enum AnnotationSource implements com.google.protobuf.ProtocolMessageEnum {
  /** <code>ANNOTATION_SOURCE_UNSPECIFIED = 0;</code> */
  ANNOTATION_SOURCE_UNSPECIFIED(0),
  /**
   *
   *
   * <pre>
   * Answer is provided by a human contributor.
   * </pre>
   *
   * <code>OPERATOR = 3;</code>
   */
  OPERATOR(3),
  UNRECOGNIZED(-1),
  ;

  /** <code>ANNOTATION_SOURCE_UNSPECIFIED = 0;</code> */
  public static final int ANNOTATION_SOURCE_UNSPECIFIED_VALUE = 0;
  /**
   *
   *
   * <pre>
   * Answer is provided by a human contributor.
   * </pre>
   *
   * <code>OPERATOR = 3;</code>
   */
  public static final int OPERATOR_VALUE = 3;

  public final int getNumber() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalArgumentException(
          "Can't get the number of an unknown enum value.");
    }
    return value;
  }

  /** @deprecated Use {@link #forNumber(int)} instead. */
  @java.lang.Deprecated
  public static AnnotationSource valueOf(int value) {
    return forNumber(value);
  }

  public static AnnotationSource forNumber(int value) {
    switch (value) {
      case 0:
        return ANNOTATION_SOURCE_UNSPECIFIED;
      case 3:
        return OPERATOR;
      default:
        return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<AnnotationSource> internalGetValueMap() {
    return internalValueMap;
  }

  private static final com.google.protobuf.Internal.EnumLiteMap<AnnotationSource> internalValueMap =
      new com.google.protobuf.Internal.EnumLiteMap<AnnotationSource>() {
        public AnnotationSource findValueByNumber(int number) {
          return AnnotationSource.forNumber(number);
        }
      };

  public final com.google.protobuf.Descriptors.EnumValueDescriptor getValueDescriptor() {
    return getDescriptor().getValues().get(ordinal());
  }

  public final com.google.protobuf.Descriptors.EnumDescriptor getDescriptorForType() {
    return getDescriptor();
  }

  public static final com.google.protobuf.Descriptors.EnumDescriptor getDescriptor() {
    return com.google.cloud.datalabeling.v1beta1.AnnotationOuterClass.getDescriptor()
        .getEnumTypes()
        .get(0);
  }

  private static final AnnotationSource[] VALUES = values();

  public static AnnotationSource valueOf(com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
    if (desc.getType() != getDescriptor()) {
      throw new java.lang.IllegalArgumentException("EnumValueDescriptor is not for this type.");
    }
    if (desc.getIndex() == -1) {
      return UNRECOGNIZED;
    }
    return VALUES[desc.getIndex()];
  }

  private final int value;

  private AnnotationSource(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:google.cloud.datalabeling.v1beta1.AnnotationSource)
}
