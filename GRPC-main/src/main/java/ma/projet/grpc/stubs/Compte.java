// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: compte.proto

package ma.projet.grpc.stubs;

/**
 * <pre>
 * Message représentant un compte
 * </pre>
 *
 * Protobuf type {@code Compte}
 */
public  final class Compte extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:Compte)
    CompteOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Compte.newBuilder() to construct.
  private Compte(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Compte() {
    dateCreation_ = "";
    type_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new Compte();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private Compte(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 8: {

            id_ = input.readInt32();
            break;
          }
          case 21: {

            solde_ = input.readFloat();
            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();

            dateCreation_ = s;
            break;
          }
          case 32: {
            int rawValue = input.readEnum();

            type_ = rawValue;
            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return ma.projet.grpc.stubs.CompteOuterClass.internal_static_Compte_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return ma.projet.grpc.stubs.CompteOuterClass.internal_static_Compte_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            ma.projet.grpc.stubs.Compte.class, ma.projet.grpc.stubs.Compte.Builder.class);
  }

  public static final int ID_FIELD_NUMBER = 1;
  private int id_;
  /**
   * <pre>
   * Changez de string à int32
   * </pre>
   *
   * <code>int32 id = 1;</code>
   * @return The id.
   */
  public int getId() {
    return id_;
  }

  public static final int SOLDE_FIELD_NUMBER = 2;
  private float solde_;
  /**
   * <code>float solde = 2;</code>
   * @return The solde.
   */
  public float getSolde() {
    return solde_;
  }

  public static final int DATECREATION_FIELD_NUMBER = 3;
  private volatile java.lang.Object dateCreation_;
  /**
   * <code>string dateCreation = 3;</code>
   * @return The dateCreation.
   */
  public java.lang.String getDateCreation() {
    java.lang.Object ref = dateCreation_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      dateCreation_ = s;
      return s;
    }
  }
  /**
   * <code>string dateCreation = 3;</code>
   * @return The bytes for dateCreation.
   */
  public com.google.protobuf.ByteString
      getDateCreationBytes() {
    java.lang.Object ref = dateCreation_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      dateCreation_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int TYPE_FIELD_NUMBER = 4;
  private int type_;
  /**
   * <code>.TypeCompte type = 4;</code>
   * @return The enum numeric value on the wire for type.
   */
  public int getTypeValue() {
    return type_;
  }
  /**
   * <code>.TypeCompte type = 4;</code>
   * @return The type.
   */
  public ma.projet.grpc.stubs.TypeCompte getType() {
    @SuppressWarnings("deprecation")
    ma.projet.grpc.stubs.TypeCompte result = ma.projet.grpc.stubs.TypeCompte.valueOf(type_);
    return result == null ? ma.projet.grpc.stubs.TypeCompte.UNRECOGNIZED : result;
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (id_ != 0) {
      output.writeInt32(1, id_);
    }
    if (solde_ != 0F) {
      output.writeFloat(2, solde_);
    }
    if (!getDateCreationBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, dateCreation_);
    }
    if (type_ != ma.projet.grpc.stubs.TypeCompte.COURANT.getNumber()) {
      output.writeEnum(4, type_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (id_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(1, id_);
    }
    if (solde_ != 0F) {
      size += com.google.protobuf.CodedOutputStream
        .computeFloatSize(2, solde_);
    }
    if (!getDateCreationBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, dateCreation_);
    }
    if (type_ != ma.projet.grpc.stubs.TypeCompte.COURANT.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(4, type_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof ma.projet.grpc.stubs.Compte)) {
      return super.equals(obj);
    }
    ma.projet.grpc.stubs.Compte other = (ma.projet.grpc.stubs.Compte) obj;

    if (getId()
        != other.getId()) return false;
    if (java.lang.Float.floatToIntBits(getSolde())
        != java.lang.Float.floatToIntBits(
            other.getSolde())) return false;
    if (!getDateCreation()
        .equals(other.getDateCreation())) return false;
    if (type_ != other.type_) return false;
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + ID_FIELD_NUMBER;
    hash = (53 * hash) + getId();
    hash = (37 * hash) + SOLDE_FIELD_NUMBER;
    hash = (53 * hash) + java.lang.Float.floatToIntBits(
        getSolde());
    hash = (37 * hash) + DATECREATION_FIELD_NUMBER;
    hash = (53 * hash) + getDateCreation().hashCode();
    hash = (37 * hash) + TYPE_FIELD_NUMBER;
    hash = (53 * hash) + type_;
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static ma.projet.grpc.stubs.Compte parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ma.projet.grpc.stubs.Compte parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ma.projet.grpc.stubs.Compte parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ma.projet.grpc.stubs.Compte parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ma.projet.grpc.stubs.Compte parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ma.projet.grpc.stubs.Compte parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ma.projet.grpc.stubs.Compte parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static ma.projet.grpc.stubs.Compte parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static ma.projet.grpc.stubs.Compte parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static ma.projet.grpc.stubs.Compte parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static ma.projet.grpc.stubs.Compte parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static ma.projet.grpc.stubs.Compte parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(ma.projet.grpc.stubs.Compte prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * <pre>
   * Message représentant un compte
   * </pre>
   *
   * Protobuf type {@code Compte}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:Compte)
      ma.projet.grpc.stubs.CompteOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return ma.projet.grpc.stubs.CompteOuterClass.internal_static_Compte_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return ma.projet.grpc.stubs.CompteOuterClass.internal_static_Compte_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              ma.projet.grpc.stubs.Compte.class, ma.projet.grpc.stubs.Compte.Builder.class);
    }

    // Construct using ma.projet.grpc.stubs.Compte.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      id_ = 0;

      solde_ = 0F;

      dateCreation_ = "";

      type_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return ma.projet.grpc.stubs.CompteOuterClass.internal_static_Compte_descriptor;
    }

    @java.lang.Override
    public ma.projet.grpc.stubs.Compte getDefaultInstanceForType() {
      return ma.projet.grpc.stubs.Compte.getDefaultInstance();
    }

    @java.lang.Override
    public ma.projet.grpc.stubs.Compte build() {
      ma.projet.grpc.stubs.Compte result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public ma.projet.grpc.stubs.Compte buildPartial() {
      ma.projet.grpc.stubs.Compte result = new ma.projet.grpc.stubs.Compte(this);
      result.id_ = id_;
      result.solde_ = solde_;
      result.dateCreation_ = dateCreation_;
      result.type_ = type_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof ma.projet.grpc.stubs.Compte) {
        return mergeFrom((ma.projet.grpc.stubs.Compte)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(ma.projet.grpc.stubs.Compte other) {
      if (other == ma.projet.grpc.stubs.Compte.getDefaultInstance()) return this;
      if (other.getId() != 0) {
        setId(other.getId());
      }
      if (other.getSolde() != 0F) {
        setSolde(other.getSolde());
      }
      if (!other.getDateCreation().isEmpty()) {
        dateCreation_ = other.dateCreation_;
        onChanged();
      }
      if (other.type_ != 0) {
        setTypeValue(other.getTypeValue());
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      ma.projet.grpc.stubs.Compte parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (ma.projet.grpc.stubs.Compte) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int id_ ;
    /**
     * <pre>
     * Changez de string à int32
     * </pre>
     *
     * <code>int32 id = 1;</code>
     * @return The id.
     */
    public int getId() {
      return id_;
    }
    /**
     * <pre>
     * Changez de string à int32
     * </pre>
     *
     * <code>int32 id = 1;</code>
     * @param value The id to set.
     * @return This builder for chaining.
     */
    public Builder setId(int value) {
      
      id_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Changez de string à int32
     * </pre>
     *
     * <code>int32 id = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearId() {
      
      id_ = 0;
      onChanged();
      return this;
    }

    private float solde_ ;
    /**
     * <code>float solde = 2;</code>
     * @return The solde.
     */
    public float getSolde() {
      return solde_;
    }
    /**
     * <code>float solde = 2;</code>
     * @param value The solde to set.
     * @return This builder for chaining.
     */
    public Builder setSolde(float value) {
      
      solde_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>float solde = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearSolde() {
      
      solde_ = 0F;
      onChanged();
      return this;
    }

    private java.lang.Object dateCreation_ = "";
    /**
     * <code>string dateCreation = 3;</code>
     * @return The dateCreation.
     */
    public java.lang.String getDateCreation() {
      java.lang.Object ref = dateCreation_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        dateCreation_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string dateCreation = 3;</code>
     * @return The bytes for dateCreation.
     */
    public com.google.protobuf.ByteString
        getDateCreationBytes() {
      java.lang.Object ref = dateCreation_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        dateCreation_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string dateCreation = 3;</code>
     * @param value The dateCreation to set.
     * @return This builder for chaining.
     */
    public Builder setDateCreation(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      dateCreation_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string dateCreation = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearDateCreation() {
      
      dateCreation_ = getDefaultInstance().getDateCreation();
      onChanged();
      return this;
    }
    /**
     * <code>string dateCreation = 3;</code>
     * @param value The bytes for dateCreation to set.
     * @return This builder for chaining.
     */
    public Builder setDateCreationBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      dateCreation_ = value;
      onChanged();
      return this;
    }

    private int type_ = 0;
    /**
     * <code>.TypeCompte type = 4;</code>
     * @return The enum numeric value on the wire for type.
     */
    public int getTypeValue() {
      return type_;
    }
    /**
     * <code>.TypeCompte type = 4;</code>
     * @param value The enum numeric value on the wire for type to set.
     * @return This builder for chaining.
     */
    public Builder setTypeValue(int value) {
      type_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.TypeCompte type = 4;</code>
     * @return The type.
     */
    public ma.projet.grpc.stubs.TypeCompte getType() {
      @SuppressWarnings("deprecation")
      ma.projet.grpc.stubs.TypeCompte result = ma.projet.grpc.stubs.TypeCompte.valueOf(type_);
      return result == null ? ma.projet.grpc.stubs.TypeCompte.UNRECOGNIZED : result;
    }
    /**
     * <code>.TypeCompte type = 4;</code>
     * @param value The type to set.
     * @return This builder for chaining.
     */
    public Builder setType(ma.projet.grpc.stubs.TypeCompte value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      type_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.TypeCompte type = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearType() {
      
      type_ = 0;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:Compte)
  }

  // @@protoc_insertion_point(class_scope:Compte)
  private static final ma.projet.grpc.stubs.Compte DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new ma.projet.grpc.stubs.Compte();
  }

  public static ma.projet.grpc.stubs.Compte getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Compte>
      PARSER = new com.google.protobuf.AbstractParser<Compte>() {
    @java.lang.Override
    public Compte parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new Compte(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<Compte> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Compte> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public ma.projet.grpc.stubs.Compte getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

