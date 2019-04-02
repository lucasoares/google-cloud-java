// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/translate/v3beta1/translation_service.proto

package com.google.cloud.translate.v3beta1;

public interface InputConfigOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.translation.v3beta1.InputConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Optional. Can be "text/plain" or "text/html".
   * For `.tsv`, "text/html" is used if mime_type is missing.
   * For `.html`, this field must be "text/html" or empty.
   * For `.txt`, this field must be "text/plain" or empty.
   * </pre>
   *
   * <code>string mime_type = 1;</code>
   */
  java.lang.String getMimeType();
  /**
   *
   *
   * <pre>
   * Optional. Can be "text/plain" or "text/html".
   * For `.tsv`, "text/html" is used if mime_type is missing.
   * For `.html`, this field must be "text/html" or empty.
   * For `.txt`, this field must be "text/plain" or empty.
   * </pre>
   *
   * <code>string mime_type = 1;</code>
   */
  com.google.protobuf.ByteString getMimeTypeBytes();

  /**
   *
   *
   * <pre>
   * Required. Google Cloud Storage location for the source input.
   * This can be a single file (for example,
   * `gs://translation-test/input.tsv`) or a wildcard (for example,
   * `gs://translation-test/&#42;`). If a file extension is `.tsv`, it can
   * contain either one or two columns. The first column (optional) is the id
   * of the text request. If the first column is missing, we use the row
   * number (0-based) from the input file as the ID in the output file. The
   * second column is the actual text to be
   *  translated. We recommend each row be &lt;= 10K Unicode codepoints,
   * otherwise an error might be returned.
   * The other supported file extensions are `.txt` or `.html`, which is
   * treated as a single large chunk of text.
   * </pre>
   *
   * <code>.google.cloud.translation.v3beta1.GcsSource gcs_source = 2;</code>
   */
  boolean hasGcsSource();
  /**
   *
   *
   * <pre>
   * Required. Google Cloud Storage location for the source input.
   * This can be a single file (for example,
   * `gs://translation-test/input.tsv`) or a wildcard (for example,
   * `gs://translation-test/&#42;`). If a file extension is `.tsv`, it can
   * contain either one or two columns. The first column (optional) is the id
   * of the text request. If the first column is missing, we use the row
   * number (0-based) from the input file as the ID in the output file. The
   * second column is the actual text to be
   *  translated. We recommend each row be &lt;= 10K Unicode codepoints,
   * otherwise an error might be returned.
   * The other supported file extensions are `.txt` or `.html`, which is
   * treated as a single large chunk of text.
   * </pre>
   *
   * <code>.google.cloud.translation.v3beta1.GcsSource gcs_source = 2;</code>
   */
  com.google.cloud.translate.v3beta1.GcsSource getGcsSource();
  /**
   *
   *
   * <pre>
   * Required. Google Cloud Storage location for the source input.
   * This can be a single file (for example,
   * `gs://translation-test/input.tsv`) or a wildcard (for example,
   * `gs://translation-test/&#42;`). If a file extension is `.tsv`, it can
   * contain either one or two columns. The first column (optional) is the id
   * of the text request. If the first column is missing, we use the row
   * number (0-based) from the input file as the ID in the output file. The
   * second column is the actual text to be
   *  translated. We recommend each row be &lt;= 10K Unicode codepoints,
   * otherwise an error might be returned.
   * The other supported file extensions are `.txt` or `.html`, which is
   * treated as a single large chunk of text.
   * </pre>
   *
   * <code>.google.cloud.translation.v3beta1.GcsSource gcs_source = 2;</code>
   */
  com.google.cloud.translate.v3beta1.GcsSourceOrBuilder getGcsSourceOrBuilder();

  public com.google.cloud.translate.v3beta1.InputConfig.SourceCase getSourceCase();
}
