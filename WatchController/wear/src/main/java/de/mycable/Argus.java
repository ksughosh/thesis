// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: argus.proto

package de.mycable;

public final class Argus {
  private Argus() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public interface ArgusEventOrBuilder
      extends com.google.protobuf.MessageOrBuilder {

    // required .argus.ArgusEvent.EventType type = 1;
    /**
     * <code>required .argus.ArgusEvent.EventType type = 1;</code>
     */
    boolean hasType();
    /**
     * <code>required .argus.ArgusEvent.EventType type = 1;</code>
     */
    ArgusEvent.EventType getType();

    // optional uint32 PosX = 2;
    /**
     * <code>optional uint32 PosX = 2;</code>
     *
     * <pre>
     *
     * Touch event members
     * </pre>
     */
    boolean hasPosX();
    /**
     * <code>optional uint32 PosX = 2;</code>
     *
     * <pre>
     *
     * Touch event members
     * </pre>
     */
    int getPosX();

    // optional uint32 PosY = 3;
    /**
     * <code>optional uint32 PosY = 3;</code>
     *
     * <pre>
     * Y position of the touch event
     * </pre>
     */
    boolean hasPosY();
    /**
     * <code>optional uint32 PosY = 3;</code>
     *
     * <pre>
     * Y position of the touch event
     * </pre>
     */
    int getPosY();

    // optional .argus.ArgusEvent.ScrollType Scrolling = 4;
    /**
     * <code>optional .argus.ArgusEvent.ScrollType Scrolling = 4;</code>
     *
     * <pre>
     *
     * Scroll event members
     * </pre>
     */
    boolean hasScrolling();
    /**
     * <code>optional .argus.ArgusEvent.ScrollType Scrolling = 4;</code>
     *
     * <pre>
     *
     * Scroll event members
     * </pre>
     */
    ArgusEvent.ScrollType getScrolling();

    // optional uint32 ScrollAmount = 5;
    /**
     * <code>optional uint32 ScrollAmount = 5;</code>
     *
     * <pre>
     * Amount of pixel to be scrolled
     * </pre>
     */
    boolean hasScrollAmount();
    /**
     * <code>optional uint32 ScrollAmount = 5;</code>
     *
     * <pre>
     * Amount of pixel to be scrolled
     * </pre>
     */
    int getScrollAmount();
  }
  /**
   * Protobuf type {@code argus.ArgusEvent}
   */
  public static final class ArgusEvent extends
      com.google.protobuf.GeneratedMessage
      implements ArgusEventOrBuilder {
    // Use ArgusEvent.newBuilder() to construct.
    private ArgusEvent(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }
    private ArgusEvent(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

    private static final ArgusEvent defaultInstance;
    public static ArgusEvent getDefaultInstance() {
      return defaultInstance;
    }

    public ArgusEvent getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    @Override
    public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
      return this.unknownFields;
    }
    private ArgusEvent(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      initFields();
      int mutable_bitField0_ = 0;
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
            default: {
              if (!parseUnknownField(input, unknownFields,
                                     extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
            case 8: {
              int rawValue = input.readEnum();
              EventType value = EventType.valueOf(rawValue);
              if (value == null) {
                unknownFields.mergeVarintField(1, rawValue);
              } else {
                bitField0_ |= 0x00000001;
                type_ = value;
              }
              break;
            }
            case 16: {
              bitField0_ |= 0x00000002;
              posX_ = input.readUInt32();
              break;
            }
            case 24: {
              bitField0_ |= 0x00000004;
              posY_ = input.readUInt32();
              break;
            }
            case 32: {
              int rawValue = input.readEnum();
              ScrollType value = ScrollType.valueOf(rawValue);
              if (value == null) {
                unknownFields.mergeVarintField(4, rawValue);
              } else {
                bitField0_ |= 0x00000008;
                scrolling_ = value;
              }
              break;
            }
            case 40: {
              bitField0_ |= 0x00000010;
              scrollAmount_ = input.readUInt32();
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e.getMessage()).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return Argus.internal_static_argus_ArgusEvent_descriptor;
    }

    protected FieldAccessorTable
        internalGetFieldAccessorTable() {
      return Argus.internal_static_argus_ArgusEvent_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              ArgusEvent.class, Builder.class);
    }

    public static com.google.protobuf.Parser<ArgusEvent> PARSER =
        new com.google.protobuf.AbstractParser<ArgusEvent>() {
      public ArgusEvent parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new ArgusEvent(input, extensionRegistry);
      }
    };

    @Override
    public com.google.protobuf.Parser<ArgusEvent> getParserForType() {
      return PARSER;
    }

    /**
     * Protobuf enum {@code argus.ArgusEvent.EventType}
     */
    public enum EventType
        implements com.google.protobuf.ProtocolMessageEnum {
      /**
       * <code>EVENT_TYPE_UNUSED = 0;</code>
       */
      EVENT_TYPE_UNUSED(0, 0),
      /**
       * <code>EVENT_TYPE_EVENT_TOUCH = 1;</code>
       */
      EVENT_TYPE_EVENT_TOUCH(1, 1),
      /**
       * <code>EVENT_TYPE_EVENT_SCROLL = 2;</code>
       */
      EVENT_TYPE_EVENT_SCROLL(2, 2),
      /**
       * <code>EVENT_TYPE_EVENT_STOPVIDEO = 3;</code>
       */
      EVENT_TYPE_EVENT_STOPVIDEO(3, 3),
      /**
       * <code>EVENT_TYPE_LAST = 4;</code>
       */
      EVENT_TYPE_LAST(4, 4),
      ;

      /**
       * <code>EVENT_TYPE_UNUSED = 0;</code>
       */
      public static final int EVENT_TYPE_UNUSED_VALUE = 0;
      /**
       * <code>EVENT_TYPE_EVENT_TOUCH = 1;</code>
       */
      public static final int EVENT_TYPE_EVENT_TOUCH_VALUE = 1;
      /**
       * <code>EVENT_TYPE_EVENT_SCROLL = 2;</code>
       */
      public static final int EVENT_TYPE_EVENT_SCROLL_VALUE = 2;
      /**
       * <code>EVENT_TYPE_EVENT_STOPVIDEO = 3;</code>
       */
      public static final int EVENT_TYPE_EVENT_STOPVIDEO_VALUE = 3;
      /**
       * <code>EVENT_TYPE_LAST = 4;</code>
       */
      public static final int EVENT_TYPE_LAST_VALUE = 4;


      public final int getNumber() { return value; }

      public static EventType valueOf(int value) {
        switch (value) {
          case 0: return EVENT_TYPE_UNUSED;
          case 1: return EVENT_TYPE_EVENT_TOUCH;
          case 2: return EVENT_TYPE_EVENT_SCROLL;
          case 3: return EVENT_TYPE_EVENT_STOPVIDEO;
          case 4: return EVENT_TYPE_LAST;
          default: return null;
        }
      }

      public static com.google.protobuf.Internal.EnumLiteMap<EventType>
          internalGetValueMap() {
        return internalValueMap;
      }
      private static com.google.protobuf.Internal.EnumLiteMap<EventType>
          internalValueMap =
            new com.google.protobuf.Internal.EnumLiteMap<EventType>() {
              public EventType findValueByNumber(int number) {
                return EventType.valueOf(number);
              }
            };

      public final com.google.protobuf.Descriptors.EnumValueDescriptor
          getValueDescriptor() {
        return getDescriptor().getValues().get(index);
      }
      public final com.google.protobuf.Descriptors.EnumDescriptor
          getDescriptorForType() {
        return getDescriptor();
      }
      public static final com.google.protobuf.Descriptors.EnumDescriptor
          getDescriptor() {
        return ArgusEvent.getDescriptor().getEnumTypes().get(0);
      }

      private static final EventType[] VALUES = values();

      public static EventType valueOf(
          com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
        if (desc.getType() != getDescriptor()) {
          throw new IllegalArgumentException(
            "EnumValueDescriptor is not for this type.");
        }
        return VALUES[desc.getIndex()];
      }

      private final int index;
      private final int value;

      private EventType(int index, int value) {
        this.index = index;
        this.value = value;
      }

      // @@protoc_insertion_point(enum_scope:argus.ArgusEvent.EventType)
    }

    /**
     * Protobuf enum {@code argus.ArgusEvent.ScrollType}
     */
    public enum ScrollType
        implements com.google.protobuf.ProtocolMessageEnum {
      /**
       * <code>SCROLL_EVENT_UNUSED = 0;</code>
       */
      SCROLL_EVENT_UNUSED(0, 0),
      /**
       * <code>SCROLL_EVENT_UP = 1;</code>
       */
      SCROLL_EVENT_UP(1, 1),
      /**
       * <code>SCROLL_EVENT_DOWN = 2;</code>
       */
      SCROLL_EVENT_DOWN(2, 2),
      /**
       * <code>SCROLL_EVENT_LEFT = 3;</code>
       */
      SCROLL_EVENT_LEFT(3, 3),
      /**
       * <code>SCROLL_EVENT_RIGHT = 4;</code>
       */
      SCROLL_EVENT_RIGHT(4, 4),
      /**
       * <code>SCROLL_EVENT_LAST = 5;</code>
       */
      SCROLL_EVENT_LAST(5, 5),
      ;

      /**
       * <code>SCROLL_EVENT_UNUSED = 0;</code>
       */
      public static final int SCROLL_EVENT_UNUSED_VALUE = 0;
      /**
       * <code>SCROLL_EVENT_UP = 1;</code>
       */
      public static final int SCROLL_EVENT_UP_VALUE = 1;
      /**
       * <code>SCROLL_EVENT_DOWN = 2;</code>
       */
      public static final int SCROLL_EVENT_DOWN_VALUE = 2;
      /**
       * <code>SCROLL_EVENT_LEFT = 3;</code>
       */
      public static final int SCROLL_EVENT_LEFT_VALUE = 3;
      /**
       * <code>SCROLL_EVENT_RIGHT = 4;</code>
       */
      public static final int SCROLL_EVENT_RIGHT_VALUE = 4;
      /**
       * <code>SCROLL_EVENT_LAST = 5;</code>
       */
      public static final int SCROLL_EVENT_LAST_VALUE = 5;


      public final int getNumber() { return value; }

      public static ScrollType valueOf(int value) {
        switch (value) {
          case 0: return SCROLL_EVENT_UNUSED;
          case 1: return SCROLL_EVENT_UP;
          case 2: return SCROLL_EVENT_DOWN;
          case 3: return SCROLL_EVENT_LEFT;
          case 4: return SCROLL_EVENT_RIGHT;
          case 5: return SCROLL_EVENT_LAST;
          default: return null;
        }
      }

      public static com.google.protobuf.Internal.EnumLiteMap<ScrollType>
          internalGetValueMap() {
        return internalValueMap;
      }
      private static com.google.protobuf.Internal.EnumLiteMap<ScrollType>
          internalValueMap =
            new com.google.protobuf.Internal.EnumLiteMap<ScrollType>() {
              public ScrollType findValueByNumber(int number) {
                return ScrollType.valueOf(number);
              }
            };

      public final com.google.protobuf.Descriptors.EnumValueDescriptor
          getValueDescriptor() {
        return getDescriptor().getValues().get(index);
      }
      public final com.google.protobuf.Descriptors.EnumDescriptor
          getDescriptorForType() {
        return getDescriptor();
      }
      public static final com.google.protobuf.Descriptors.EnumDescriptor
          getDescriptor() {
        return ArgusEvent.getDescriptor().getEnumTypes().get(1);
      }

      private static final ScrollType[] VALUES = values();

      public static ScrollType valueOf(
          com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
        if (desc.getType() != getDescriptor()) {
          throw new IllegalArgumentException(
            "EnumValueDescriptor is not for this type.");
        }
        return VALUES[desc.getIndex()];
      }

      private final int index;
      private final int value;

      private ScrollType(int index, int value) {
        this.index = index;
        this.value = value;
      }

      // @@protoc_insertion_point(enum_scope:argus.ArgusEvent.ScrollType)
    }

    private int bitField0_;
    // required .argus.ArgusEvent.EventType type = 1;
    public static final int TYPE_FIELD_NUMBER = 1;
    private EventType type_;
    /**
     * <code>required .argus.ArgusEvent.EventType type = 1;</code>
     */
    public boolean hasType() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>required .argus.ArgusEvent.EventType type = 1;</code>
     */
    public EventType getType() {
      return type_;
    }

    // optional uint32 PosX = 2;
    public static final int POSX_FIELD_NUMBER = 2;
    private int posX_;
    /**
     * <code>optional uint32 PosX = 2;</code>
     *
     * <pre>
     *
     * Touch event members
     * </pre>
     */
    public boolean hasPosX() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     * <code>optional uint32 PosX = 2;</code>
     *
     * <pre>
     *
     * Touch event members
     * </pre>
     */
    public int getPosX() {
      return posX_;
    }

    // optional uint32 PosY = 3;
    public static final int POSY_FIELD_NUMBER = 3;
    private int posY_;
    /**
     * <code>optional uint32 PosY = 3;</code>
     *
     * <pre>
     * Y position of the touch event
     * </pre>
     */
    public boolean hasPosY() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    /**
     * <code>optional uint32 PosY = 3;</code>
     *
     * <pre>
     * Y position of the touch event
     * </pre>
     */
    public int getPosY() {
      return posY_;
    }

    // optional .argus.ArgusEvent.ScrollType Scrolling = 4;
    public static final int SCROLLING_FIELD_NUMBER = 4;
    private ScrollType scrolling_;
    /**
     * <code>optional .argus.ArgusEvent.ScrollType Scrolling = 4;</code>
     *
     * <pre>
     *
     * Scroll event members
     * </pre>
     */
    public boolean hasScrolling() {
      return ((bitField0_ & 0x00000008) == 0x00000008);
    }
    /**
     * <code>optional .argus.ArgusEvent.ScrollType Scrolling = 4;</code>
     *
     * <pre>
     *
     * Scroll event members
     * </pre>
     */
    public ScrollType getScrolling() {
      return scrolling_;
    }

    // optional uint32 ScrollAmount = 5;
    public static final int SCROLLAMOUNT_FIELD_NUMBER = 5;
    private int scrollAmount_;
    /**
     * <code>optional uint32 ScrollAmount = 5;</code>
     *
     * <pre>
     * Amount of pixel to be scrolled
     * </pre>
     */
    public boolean hasScrollAmount() {
      return ((bitField0_ & 0x00000010) == 0x00000010);
    }
    /**
     * <code>optional uint32 ScrollAmount = 5;</code>
     *
     * <pre>
     * Amount of pixel to be scrolled
     * </pre>
     */
    public int getScrollAmount() {
      return scrollAmount_;
    }

    private void initFields() {
      type_ = EventType.EVENT_TYPE_UNUSED;
      posX_ = 0;
      posY_ = 0;
      scrolling_ = ScrollType.SCROLL_EVENT_UNUSED;
      scrollAmount_ = 0;
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized != -1) return isInitialized == 1;

      if (!hasType()) {
        memoizedIsInitialized = 0;
        return false;
      }
      memoizedIsInitialized = 1;
      return true;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeEnum(1, type_.getNumber());
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeUInt32(2, posX_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        output.writeUInt32(3, posY_);
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        output.writeEnum(4, scrolling_.getNumber());
      }
      if (((bitField0_ & 0x00000010) == 0x00000010)) {
        output.writeUInt32(5, scrollAmount_);
      }
      getUnknownFields().writeTo(output);
    }

    private int memoizedSerializedSize = -1;
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream
          .computeEnumSize(1, type_.getNumber());
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(2, posX_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(3, posY_);
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        size += com.google.protobuf.CodedOutputStream
          .computeEnumSize(4, scrolling_.getNumber());
      }
      if (((bitField0_ & 0x00000010) == 0x00000010)) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(5, scrollAmount_);
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }

    private static final long serialVersionUID = 0L;
    @Override
    protected Object writeReplace()
        throws java.io.ObjectStreamException {
      return super.writeReplace();
    }

    public static ArgusEvent parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static ArgusEvent parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static ArgusEvent parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static ArgusEvent parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static ArgusEvent parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static ArgusEvent parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static ArgusEvent parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static ArgusEvent parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static ArgusEvent parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static ArgusEvent parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(ArgusEvent prototype) {
      return newBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() { return newBuilder(this); }

    @Override
    protected Builder newBuilderForType(
        BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code argus.ArgusEvent}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder>
       implements ArgusEventOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return Argus.internal_static_argus_ArgusEvent_descriptor;
      }

      protected FieldAccessorTable
          internalGetFieldAccessorTable() {
        return Argus.internal_static_argus_ArgusEvent_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                ArgusEvent.class, Builder.class);
      }

      // Construct using de.mycable.Argus.ArgusEvent.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
        }
      }
      private static Builder create() {
        return new Builder();
      }

      public Builder clear() {
        super.clear();
        type_ = EventType.EVENT_TYPE_UNUSED;
        bitField0_ = (bitField0_ & ~0x00000001);
        posX_ = 0;
        bitField0_ = (bitField0_ & ~0x00000002);
        posY_ = 0;
        bitField0_ = (bitField0_ & ~0x00000004);
        scrolling_ = ScrollType.SCROLL_EVENT_UNUSED;
        bitField0_ = (bitField0_ & ~0x00000008);
        scrollAmount_ = 0;
        bitField0_ = (bitField0_ & ~0x00000010);
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return Argus.internal_static_argus_ArgusEvent_descriptor;
      }

      public ArgusEvent getDefaultInstanceForType() {
        return ArgusEvent.getDefaultInstance();
      }

      public ArgusEvent build() {
        ArgusEvent result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public ArgusEvent buildPartial() {
        ArgusEvent result = new ArgusEvent(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.type_ = type_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.posX_ = posX_;
        if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
          to_bitField0_ |= 0x00000004;
        }
        result.posY_ = posY_;
        if (((from_bitField0_ & 0x00000008) == 0x00000008)) {
          to_bitField0_ |= 0x00000008;
        }
        result.scrolling_ = scrolling_;
        if (((from_bitField0_ & 0x00000010) == 0x00000010)) {
          to_bitField0_ |= 0x00000010;
        }
        result.scrollAmount_ = scrollAmount_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof ArgusEvent) {
          return mergeFrom((ArgusEvent)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(ArgusEvent other) {
        if (other == ArgusEvent.getDefaultInstance()) return this;
        if (other.hasType()) {
          setType(other.getType());
        }
        if (other.hasPosX()) {
          setPosX(other.getPosX());
        }
        if (other.hasPosY()) {
          setPosY(other.getPosY());
        }
        if (other.hasScrolling()) {
          setScrolling(other.getScrolling());
        }
        if (other.hasScrollAmount()) {
          setScrollAmount(other.getScrollAmount());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }

      public final boolean isInitialized() {
        if (!hasType()) {
          
          return false;
        }
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        ArgusEvent parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (ArgusEvent) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      // required .argus.ArgusEvent.EventType type = 1;
      private EventType type_ = EventType.EVENT_TYPE_UNUSED;
      /**
       * <code>required .argus.ArgusEvent.EventType type = 1;</code>
       */
      public boolean hasType() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <code>required .argus.ArgusEvent.EventType type = 1;</code>
       */
      public EventType getType() {
        return type_;
      }
      /**
       * <code>required .argus.ArgusEvent.EventType type = 1;</code>
       */
      public Builder setType(EventType value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000001;
        type_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required .argus.ArgusEvent.EventType type = 1;</code>
       */
      public Builder clearType() {
        bitField0_ = (bitField0_ & ~0x00000001);
        type_ = EventType.EVENT_TYPE_UNUSED;
        onChanged();
        return this;
      }

      // optional uint32 PosX = 2;
      private int posX_ ;
      /**
       * <code>optional uint32 PosX = 2;</code>
       *
       * <pre>
       *
       * Touch event members
       * </pre>
       */
      public boolean hasPosX() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      /**
       * <code>optional uint32 PosX = 2;</code>
       *
       * <pre>
       *
       * Touch event members
       * </pre>
       */
      public int getPosX() {
        return posX_;
      }
      /**
       * <code>optional uint32 PosX = 2;</code>
       *
       * <pre>
       *
       * Touch event members
       * </pre>
       */
      public Builder setPosX(int value) {
        bitField0_ |= 0x00000002;
        posX_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional uint32 PosX = 2;</code>
       *
       * <pre>
       *
       * Touch event members
       * </pre>
       */
      public Builder clearPosX() {
        bitField0_ = (bitField0_ & ~0x00000002);
        posX_ = 0;
        onChanged();
        return this;
      }

      // optional uint32 PosY = 3;
      private int posY_ ;
      /**
       * <code>optional uint32 PosY = 3;</code>
       *
       * <pre>
       * Y position of the touch event
       * </pre>
       */
      public boolean hasPosY() {
        return ((bitField0_ & 0x00000004) == 0x00000004);
      }
      /**
       * <code>optional uint32 PosY = 3;</code>
       *
       * <pre>
       * Y position of the touch event
       * </pre>
       */
      public int getPosY() {
        return posY_;
      }
      /**
       * <code>optional uint32 PosY = 3;</code>
       *
       * <pre>
       * Y position of the touch event
       * </pre>
       */
      public Builder setPosY(int value) {
        bitField0_ |= 0x00000004;
        posY_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional uint32 PosY = 3;</code>
       *
       * <pre>
       * Y position of the touch event
       * </pre>
       */
      public Builder clearPosY() {
        bitField0_ = (bitField0_ & ~0x00000004);
        posY_ = 0;
        onChanged();
        return this;
      }

      // optional .argus.ArgusEvent.ScrollType Scrolling = 4;
      private ScrollType scrolling_ = ScrollType.SCROLL_EVENT_UNUSED;
      /**
       * <code>optional .argus.ArgusEvent.ScrollType Scrolling = 4;</code>
       *
       * <pre>
       *
       * Scroll event members
       * </pre>
       */
      public boolean hasScrolling() {
        return ((bitField0_ & 0x00000008) == 0x00000008);
      }
      /**
       * <code>optional .argus.ArgusEvent.ScrollType Scrolling = 4;</code>
       *
       * <pre>
       *
       * Scroll event members
       * </pre>
       */
      public ScrollType getScrolling() {
        return scrolling_;
      }
      /**
       * <code>optional .argus.ArgusEvent.ScrollType Scrolling = 4;</code>
       *
       * <pre>
       *
       * Scroll event members
       * </pre>
       */
      public Builder setScrolling(ScrollType value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000008;
        scrolling_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional .argus.ArgusEvent.ScrollType Scrolling = 4;</code>
       *
       * <pre>
       *
       * Scroll event members
       * </pre>
       */
      public Builder clearScrolling() {
        bitField0_ = (bitField0_ & ~0x00000008);
        scrolling_ = ScrollType.SCROLL_EVENT_UNUSED;
        onChanged();
        return this;
      }

      // optional uint32 ScrollAmount = 5;
      private int scrollAmount_ ;
      /**
       * <code>optional uint32 ScrollAmount = 5;</code>
       *
       * <pre>
       * Amount of pixel to be scrolled
       * </pre>
       */
      public boolean hasScrollAmount() {
        return ((bitField0_ & 0x00000010) == 0x00000010);
      }
      /**
       * <code>optional uint32 ScrollAmount = 5;</code>
       *
       * <pre>
       * Amount of pixel to be scrolled
       * </pre>
       */
      public int getScrollAmount() {
        return scrollAmount_;
      }
      /**
       * <code>optional uint32 ScrollAmount = 5;</code>
       *
       * <pre>
       * Amount of pixel to be scrolled
       * </pre>
       */
      public Builder setScrollAmount(int value) {
        bitField0_ |= 0x00000010;
        scrollAmount_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional uint32 ScrollAmount = 5;</code>
       *
       * <pre>
       * Amount of pixel to be scrolled
       * </pre>
       */
      public Builder clearScrollAmount() {
        bitField0_ = (bitField0_ & ~0x00000010);
        scrollAmount_ = 0;
        onChanged();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:argus.ArgusEvent)
    }

    static {
      defaultInstance = new ArgusEvent(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:argus.ArgusEvent)
  }

  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_argus_ArgusEvent_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_argus_ArgusEvent_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    String[] descriptorData = {
      "\n\013argus.proto\022\005argus\"\307\003\n\nArgusEvent\022)\n\004t" +
      "ype\030\001 \002(\0162\033.argus.ArgusEvent.EventType\022\014" +
      "\n\004PosX\030\002 \001(\r\022\014\n\004PosY\030\003 \001(\r\022/\n\tScrolling\030" +
      "\004 \001(\0162\034.argus.ArgusEvent.ScrollType\022\024\n\014S" +
      "crollAmount\030\005 \001(\r\"\220\001\n\tEventType\022\025\n\021EVENT" +
      "_TYPE_UNUSED\020\000\022\032\n\026EVENT_TYPE_EVENT_TOUCH" +
      "\020\001\022\033\n\027EVENT_TYPE_EVENT_SCROLL\020\002\022\036\n\032EVENT" +
      "_TYPE_EVENT_STOPVIDEO\020\003\022\023\n\017EVENT_TYPE_LA" +
      "ST\020\004\"\227\001\n\nScrollType\022\027\n\023SCROLL_EVENT_UNUS" +
      "ED\020\000\022\023\n\017SCROLL_EVENT_UP\020\001\022\025\n\021SCROLL_EVEN",
      "T_DOWN\020\002\022\025\n\021SCROLL_EVENT_LEFT\020\003\022\026\n\022SCROL" +
      "L_EVENT_RIGHT\020\004\022\025\n\021SCROLL_EVENT_LAST\020\005B\023" +
      "\n\nde.mycableB\005Argus"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
      new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
        public com.google.protobuf.ExtensionRegistry assignDescriptors(
            com.google.protobuf.Descriptors.FileDescriptor root) {
          descriptor = root;
          internal_static_argus_ArgusEvent_descriptor =
            getDescriptor().getMessageTypes().get(0);
          internal_static_argus_ArgusEvent_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_argus_ArgusEvent_descriptor,
              new String[] { "Type", "PosX", "PosY", "Scrolling", "ScrollAmount", });
          return null;
        }
      };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
  }

  // @@protoc_insertion_point(outer_class_scope)
}
