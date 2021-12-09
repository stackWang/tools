package com.ks;

import com.google.protobuf.nano.*;

import java.io.IOException;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* compiled from: kSourceFile */
public interface LiveSpecialAccountConfigProto {

    @Retention(RetentionPolicy.SOURCE)
    /* compiled from: kSourceFile */
    public @interface ConfigSwitchType {
    }

    /* compiled from: kSourceFile */
    public static final class ConfigSwitchItem extends MessageNano {
        public static volatile ConfigSwitchItem[] _emptyArray;
        public int configSwitchType;
        public boolean value;

        public ConfigSwitchItem() {
            clear();
        }

        public static ConfigSwitchItem[] emptyArray() {
            if (_emptyArray == null) {
                synchronized (InternalNano.LAZY_INIT_LOCK) {
                    if (_emptyArray == null) {
                        _emptyArray = new ConfigSwitchItem[0];
                    }
                }
            }
            return _emptyArray;
        }

        public ConfigSwitchItem clear() {
            this.configSwitchType = 0;
            this.value = false;
            this.cachedSize = -1;
            return this;
        }

        public int computeSerializedSize() {
            int computeSerializedSize = super.computeSerializedSize();
            int i = this.configSwitchType;
            if (i != 0) {
                computeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(1, i);
            }
            boolean z = this.value;
            if (z) {
                return computeSerializedSize + CodedOutputByteBufferNano.computeBoolSize(2, z);
            }
            return computeSerializedSize;
        }

        public static ConfigSwitchItem parseFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
            return new ConfigSwitchItem().mergeFrom(codedInputByteBufferNano);
        }

        public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            int i = this.configSwitchType;
            if (i != 0) {
                codedOutputByteBufferNano.writeInt32(1, i);
            }
            boolean z = this.value;
            if (z) {
                codedOutputByteBufferNano.writeBool(2, z);
            }
            super.writeTo(codedOutputByteBufferNano);
        }

        public static ConfigSwitchItem parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
            return (ConfigSwitchItem) MessageNano.mergeFrom(new ConfigSwitchItem(), bArr);
        }

        public ConfigSwitchItem mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
            while (true) {
                int readTag = codedInputByteBufferNano.readTag();
                if (readTag == 0) {
                    return this;
                }
                if (readTag == 8) {
                    int readInt32 = codedInputByteBufferNano.readInt32();
                    if (readInt32 == 0 || readInt32 == 1 || readInt32 == 2) {
                        this.configSwitchType = readInt32;
                    }
                } else if (readTag == 16) {
                    this.value = codedInputByteBufferNano.readBool();
                } else if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    return this;
                }
            }
        }
    }

    /* compiled from: kSourceFile */
    public static final class SCLiveSpecialAccountConfigState extends MessageNano {
        public static volatile SCLiveSpecialAccountConfigState[] _emptyArray;
        public ConfigSwitchItem[] configSwitchItem;
        public long timestamp;

        public SCLiveSpecialAccountConfigState() {
            clear();
        }

        public static SCLiveSpecialAccountConfigState[] emptyArray() {
            if (_emptyArray == null) {
                synchronized (InternalNano.LAZY_INIT_LOCK) {
                    if (_emptyArray == null) {
                        _emptyArray = new SCLiveSpecialAccountConfigState[0];
                    }
                }
            }
            return _emptyArray;
        }

        public SCLiveSpecialAccountConfigState clear() {
            this.configSwitchItem = ConfigSwitchItem.emptyArray();
            this.timestamp = 0;
            this.cachedSize = -1;
            return this;
        }

        public int computeSerializedSize() {
            int computeSerializedSize = super.computeSerializedSize();
            ConfigSwitchItem[] configSwitchItemArr = this.configSwitchItem;
            if (configSwitchItemArr != null && configSwitchItemArr.length > 0) {
                int i = 0;
                while (true) {
                    ConfigSwitchItem[] configSwitchItemArr2 = this.configSwitchItem;
                    if (i >= configSwitchItemArr2.length) {
                        break;
                    }
                    ConfigSwitchItem configSwitchItem2 = configSwitchItemArr2[i];
                    if (configSwitchItem2 != null) {
                        computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(1, configSwitchItem2);
                    }
                    i++;
                }
            }
            long j2 = this.timestamp;
            if (j2 != 0) {
                return computeSerializedSize + CodedOutputByteBufferNano.computeUInt64Size(2, j2);
            }
            return computeSerializedSize;
        }

        public static SCLiveSpecialAccountConfigState parseFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
            return new SCLiveSpecialAccountConfigState().mergeFrom(codedInputByteBufferNano);
        }

        public static SCLiveSpecialAccountConfigState parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
            return (SCLiveSpecialAccountConfigState) MessageNano.mergeFrom(new SCLiveSpecialAccountConfigState(), bArr);
        }

        public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            ConfigSwitchItem[] configSwitchItemArr = this.configSwitchItem;
            if (configSwitchItemArr != null && configSwitchItemArr.length > 0) {
                int i = 0;
                while (true) {
                    ConfigSwitchItem[] configSwitchItemArr2 = this.configSwitchItem;
                    if (i >= configSwitchItemArr2.length) {
                        break;
                    }
                    ConfigSwitchItem configSwitchItem2 = configSwitchItemArr2[i];
                    if (configSwitchItem2 != null) {
                        codedOutputByteBufferNano.writeMessage(1, configSwitchItem2);
                    }
                    i++;
                }
            }
            long j2 = this.timestamp;
            if (j2 != 0) {
                codedOutputByteBufferNano.writeUInt64(2, j2);
            }
            super.writeTo(codedOutputByteBufferNano);
        }

        public SCLiveSpecialAccountConfigState mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
            int i;
            while (true) {
                int readTag = codedInputByteBufferNano.readTag();
                if (readTag == 0) {
                    return this;
                }
                if (readTag == 10) {
                    int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 10);
                    ConfigSwitchItem[] configSwitchItemArr = this.configSwitchItem;
                    if (configSwitchItemArr == null) {
                        i = 0;
                    } else {
                        i = configSwitchItemArr.length;
                    }
                    int i2 = repeatedFieldArrayLength + i;
                    ConfigSwitchItem[] configSwitchItemArr2 = new ConfigSwitchItem[i2];
                    if (i != 0) {
                        System.arraycopy(this.configSwitchItem, 0, configSwitchItemArr2, 0, i);
                    }
                    while (i < i2 - 1) {
                        configSwitchItemArr2[i] = new ConfigSwitchItem();
                        codedInputByteBufferNano.readMessage(configSwitchItemArr2[i]);
                        codedInputByteBufferNano.readTag();
                        i++;
                    }
                    configSwitchItemArr2[i] = new ConfigSwitchItem();
                    codedInputByteBufferNano.readMessage(configSwitchItemArr2[i]);
                    this.configSwitchItem = configSwitchItemArr2;
                } else if (readTag == 16) {
                    this.timestamp = codedInputByteBufferNano.readUInt64();
                } else if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    return this;
                }
            }
        }
    }
}
