package com.ks;

import com.google.protobuf.nano.*;

import java.io.IOException;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Arrays;

/* compiled from: kSourceFile */
public interface SocketMessages {

    @Retention(RetentionPolicy.SOURCE)
    /* compiled from: kSourceFile */
    public @interface PayloadType {
    }

    @Retention(RetentionPolicy.SOURCE)
    /* compiled from: kSourceFile */
    public @interface SCInfoType {
    }

    /* compiled from: kSourceFile */
    public static final class CSError extends MessageNano {
        public static volatile CSError[] _emptyArray;
        public int code;

        public CSError() {
            clear();
        }

        public static CSError[] emptyArray() {
            if (_emptyArray == null) {
                synchronized (InternalNano.LAZY_INIT_LOCK) {
                    if (_emptyArray == null) {
                        _emptyArray = new CSError[0];
                    }
                }
            }
            return _emptyArray;
        }

        public CSError clear() {
            this.code = 0;
            this.cachedSize = -1;
            return this;
        }

        @Override // com.google.protobuf.nano.MessageNano
        public int computeSerializedSize() {
            int computeSerializedSize = super.computeSerializedSize();
            int i = this.code;
            if (i != 0) {
                return computeSerializedSize + CodedOutputByteBufferNano.computeUInt32Size(1, i);
            }
            return computeSerializedSize;
        }

        public static CSError parseFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
            return new CSError().mergeFrom(codedInputByteBufferNano);
        }

        @Override // com.google.protobuf.nano.MessageNano
        public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            int i = this.code;
            if (i != 0) {
                codedOutputByteBufferNano.writeUInt32(1, i);
            }
            super.writeTo(codedOutputByteBufferNano);
        }

        public static CSError parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
            return (CSError) MessageNano.mergeFrom(new CSError(), bArr);
        }

        @Override // com.google.protobuf.nano.MessageNano
        public CSError mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
            while (true) {
                int readTag = codedInputByteBufferNano.readTag();
                if (readTag == 0) {
                    return this;
                }
                if (readTag == 8) {
                    this.code = codedInputByteBufferNano.readUInt32();
                } else if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    return this;
                }
            }
        }
    }

    /* compiled from: kSourceFile */
    public static final class CSHeartbeat extends MessageNano {
        public static volatile CSHeartbeat[] _emptyArray;
        public long timestamp;

        public CSHeartbeat() {
            clear();
        }

        public static CSHeartbeat[] emptyArray() {
            if (_emptyArray == null) {
                synchronized (InternalNano.LAZY_INIT_LOCK) {
                    if (_emptyArray == null) {
                        _emptyArray = new CSHeartbeat[0];
                    }
                }
            }
            return _emptyArray;
        }

        public CSHeartbeat clear() {
            this.timestamp = 0;
            this.cachedSize = -1;
            return this;
        }

        @Override // com.google.protobuf.nano.MessageNano
        public int computeSerializedSize() {
            int computeSerializedSize = super.computeSerializedSize();
            long j = this.timestamp;
            if (j != 0) {
                return computeSerializedSize + CodedOutputByteBufferNano.computeUInt64Size(1, j);
            }
            return computeSerializedSize;
        }

        public static CSHeartbeat parseFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
            return new CSHeartbeat().mergeFrom(codedInputByteBufferNano);
        }

        @Override // com.google.protobuf.nano.MessageNano
        public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            long j = this.timestamp;
            if (j != 0) {
                codedOutputByteBufferNano.writeUInt64(1, j);
            }
            super.writeTo(codedOutputByteBufferNano);
        }

        public static CSHeartbeat parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
            return (CSHeartbeat) MessageNano.mergeFrom(new CSHeartbeat(), bArr);
        }

        @Override // com.google.protobuf.nano.MessageNano
        public CSHeartbeat mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
            while (true) {
                int readTag = codedInputByteBufferNano.readTag();
                if (readTag == 0) {
                    return this;
                }
                if (readTag == 8) {
                    this.timestamp = codedInputByteBufferNano.readUInt64();
                } else if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    return this;
                }
            }
        }
    }

    /* compiled from: kSourceFile */
    public static final class CSPing extends MessageNano {
        public static volatile CSPing[] _emptyArray;
        public String appVer;
        public int clientId;
        public String deviceId;
        public String echoData;

        public CSPing() {
            clear();
        }

        public static CSPing[] emptyArray() {
            if (_emptyArray == null) {
                synchronized (InternalNano.LAZY_INIT_LOCK) {
                    if (_emptyArray == null) {
                        _emptyArray = new CSPing[0];
                    }
                }
            }
            return _emptyArray;
        }

        public CSPing clear() {
            this.echoData = "";
            this.clientId = 0;
            this.deviceId = "";
            this.appVer = "";
            this.cachedSize = -1;
            return this;
        }

        @Override // com.google.protobuf.nano.MessageNano
        public int computeSerializedSize() {
            int computeSerializedSize = super.computeSerializedSize();
            if (!this.echoData.equals("")) {
                computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(1, this.echoData);
            }
            int i = this.clientId;
            if (i != 0) {
                computeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(2, i);
            }
            if (!this.deviceId.equals("")) {
                computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(3, this.deviceId);
            }
            if (!this.appVer.equals("")) {
                return computeSerializedSize + CodedOutputByteBufferNano.computeStringSize(4, this.appVer);
            }
            return computeSerializedSize;
        }

        public static CSPing parseFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
            return new CSPing().mergeFrom(codedInputByteBufferNano);
        }

        public static CSPing parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
            return (CSPing) MessageNano.mergeFrom(new CSPing(), bArr);
        }

        @Override // com.google.protobuf.nano.MessageNano
        public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            if (!this.echoData.equals("")) {
                codedOutputByteBufferNano.writeString(1, this.echoData);
            }
            int i = this.clientId;
            if (i != 0) {
                codedOutputByteBufferNano.writeInt32(2, i);
            }
            if (!this.deviceId.equals("")) {
                codedOutputByteBufferNano.writeString(3, this.deviceId);
            }
            if (!this.appVer.equals("")) {
                codedOutputByteBufferNano.writeString(4, this.appVer);
            }
            super.writeTo(codedOutputByteBufferNano);
        }

        @Override // com.google.protobuf.nano.MessageNano
        public CSPing mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
            while (true) {
                int readTag = codedInputByteBufferNano.readTag();
                if (readTag == 0) {
                    return this;
                }
                if (readTag == 10) {
                    this.echoData = codedInputByteBufferNano.readString();
                } else if (readTag == 16) {
                    int readInt32 = codedInputByteBufferNano.readInt32();
                    if (readInt32 == 0 || readInt32 == 1 || readInt32 == 2 || readInt32 == 3 || readInt32 == 6 || readInt32 == 13 || readInt32 == 8 || readInt32 == 9 || readInt32 == 22 || readInt32 == 23) {
                        this.clientId = readInt32;
                    }
                } else if (readTag == 26) {
                    this.deviceId = codedInputByteBufferNano.readString();
                } else if (readTag == 34) {
                    this.appVer = codedInputByteBufferNano.readString();
                } else if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    return this;
                }
            }
        }
    }

    /* compiled from: kSourceFile */
    public static final class PSHostInfo extends MessageNano {
        public static volatile PSHostInfo[] _emptyArray;
        public String ip;
        public int port;

        public PSHostInfo() {
            clear();
        }

        public static PSHostInfo[] emptyArray() {
            if (_emptyArray == null) {
                synchronized (InternalNano.LAZY_INIT_LOCK) {
                    if (_emptyArray == null) {
                        _emptyArray = new PSHostInfo[0];
                    }
                }
            }
            return _emptyArray;
        }

        public PSHostInfo clear() {
            this.ip = "";
            this.port = 0;
            this.cachedSize = -1;
            return this;
        }

        @Override // com.google.protobuf.nano.MessageNano
        public int computeSerializedSize() {
            int computeSerializedSize = super.computeSerializedSize();
            if (!this.ip.equals("")) {
                computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(1, this.ip);
            }
            int i = this.port;
            if (i != 0) {
                return computeSerializedSize + CodedOutputByteBufferNano.computeInt32Size(2, i);
            }
            return computeSerializedSize;
        }

        public static PSHostInfo parseFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
            return new PSHostInfo().mergeFrom(codedInputByteBufferNano);
        }

        public static PSHostInfo parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
            return (PSHostInfo) MessageNano.mergeFrom(new PSHostInfo(), bArr);
        }

        @Override // com.google.protobuf.nano.MessageNano
        public PSHostInfo mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
            while (true) {
                int readTag = codedInputByteBufferNano.readTag();
                if (readTag == 0) {
                    return this;
                }
                if (readTag == 10) {
                    this.ip = codedInputByteBufferNano.readString();
                } else if (readTag == 16) {
                    this.port = codedInputByteBufferNano.readInt32();
                } else if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    return this;
                }
            }
        }

        @Override // com.google.protobuf.nano.MessageNano
        public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            if (!this.ip.equals("")) {
                codedOutputByteBufferNano.writeString(1, this.ip);
            }
            int i = this.port;
            if (i != 0) {
                codedOutputByteBufferNano.writeInt32(2, i);
            }
            super.writeTo(codedOutputByteBufferNano);
        }
    }

    /* compiled from: kSourceFile */
    public static final class SCEcho extends MessageNano {
        public static volatile SCEcho[] _emptyArray;
        public String content;

        public SCEcho() {
            clear();
        }

        public static SCEcho[] emptyArray() {
            if (_emptyArray == null) {
                synchronized (InternalNano.LAZY_INIT_LOCK) {
                    if (_emptyArray == null) {
                        _emptyArray = new SCEcho[0];
                    }
                }
            }
            return _emptyArray;
        }

        public SCEcho clear() {
            this.content = "";
            this.cachedSize = -1;
            return this;
        }

        @Override // com.google.protobuf.nano.MessageNano
        public int computeSerializedSize() {
            int computeSerializedSize = super.computeSerializedSize();
            if (!this.content.equals("")) {
                return computeSerializedSize + CodedOutputByteBufferNano.computeStringSize(1, this.content);
            }
            return computeSerializedSize;
        }

        public static SCEcho parseFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
            return new SCEcho().mergeFrom(codedInputByteBufferNano);
        }

        @Override // com.google.protobuf.nano.MessageNano
        public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            if (!this.content.equals("")) {
                codedOutputByteBufferNano.writeString(1, this.content);
            }
            super.writeTo(codedOutputByteBufferNano);
        }

        public static SCEcho parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
            return (SCEcho) MessageNano.mergeFrom(new SCEcho(), bArr);
        }

        @Override // com.google.protobuf.nano.MessageNano
        public SCEcho mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
            while (true) {
                int readTag = codedInputByteBufferNano.readTag();
                if (readTag == 0) {
                    return this;
                }
                if (readTag == 10) {
                    this.content = codedInputByteBufferNano.readString();
                } else if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    return this;
                }
            }
        }
    }

    /* compiled from: kSourceFile */
    public static final class SCError extends MessageNano {
        public static volatile SCError[] _emptyArray;
        public int code;
        public long maxDelayMs;
        public long minDelayMs;
        public String msg;
        public int subCode;

        public SCError() {
            clear();
        }

        public static SCError[] emptyArray() {
            if (_emptyArray == null) {
                synchronized (InternalNano.LAZY_INIT_LOCK) {
                    if (_emptyArray == null) {
                        _emptyArray = new SCError[0];
                    }
                }
            }
            return _emptyArray;
        }

        public SCError clear() {
            this.code = 0;
            this.msg = "";
            this.subCode = 0;
            this.minDelayMs = 0;
            this.maxDelayMs = 0;
            this.cachedSize = -1;
            return this;
        }

        @Override // com.google.protobuf.nano.MessageNano
        public int computeSerializedSize() {
            int computeSerializedSize = super.computeSerializedSize();
            int i = this.code;
            if (i != 0) {
                computeSerializedSize += CodedOutputByteBufferNano.computeUInt32Size(1, i);
            }
            if (!this.msg.equals("")) {
                computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(2, this.msg);
            }
            int i2 = this.subCode;
            if (i2 != 0) {
                computeSerializedSize += CodedOutputByteBufferNano.computeUInt32Size(3, i2);
            }
            long j = this.minDelayMs;
            if (j != 0) {
                computeSerializedSize += CodedOutputByteBufferNano.computeUInt64Size(4, j);
            }
            long j2 = this.maxDelayMs;
            if (j2 != 0) {
                return computeSerializedSize + CodedOutputByteBufferNano.computeUInt64Size(5, j2);
            }
            return computeSerializedSize;
        }

        public static SCError parseFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
            return new SCError().mergeFrom(codedInputByteBufferNano);
        }

        public static SCError parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
            return (SCError) MessageNano.mergeFrom(new SCError(), bArr);
        }

        @Override // com.google.protobuf.nano.MessageNano
        public SCError mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
            while (true) {
                int readTag = codedInputByteBufferNano.readTag();
                if (readTag == 0) {
                    return this;
                }
                if (readTag == 8) {
                    this.code = codedInputByteBufferNano.readUInt32();
                } else if (readTag == 18) {
                    this.msg = codedInputByteBufferNano.readString();
                } else if (readTag == 24) {
                    this.subCode = codedInputByteBufferNano.readUInt32();
                } else if (readTag == 32) {
                    this.minDelayMs = codedInputByteBufferNano.readUInt64();
                } else if (readTag == 40) {
                    this.maxDelayMs = codedInputByteBufferNano.readUInt64();
                } else if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    return this;
                }
            }
        }

        @Override // com.google.protobuf.nano.MessageNano
        public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            int i = this.code;
            if (i != 0) {
                codedOutputByteBufferNano.writeUInt32(1, i);
            }
            if (!this.msg.equals("")) {
                codedOutputByteBufferNano.writeString(2, this.msg);
            }
            int i2 = this.subCode;
            if (i2 != 0) {
                codedOutputByteBufferNano.writeUInt32(3, i2);
            }
            long j = this.minDelayMs;
            if (j != 0) {
                codedOutputByteBufferNano.writeUInt64(4, j);
            }
            long j2 = this.maxDelayMs;
            if (j2 != 0) {
                codedOutputByteBufferNano.writeUInt64(5, j2);
            }
            super.writeTo(codedOutputByteBufferNano);
        }
    }

    /* compiled from: kSourceFile */
    public static final class SCHeartbeatAck extends MessageNano {
        public static volatile SCHeartbeatAck[] _emptyArray;
        public long clientTimestamp;
        public long timestamp;

        public SCHeartbeatAck() {
            clear();
        }

        public static SCHeartbeatAck[] emptyArray() {
            if (_emptyArray == null) {
                synchronized (InternalNano.LAZY_INIT_LOCK) {
                    if (_emptyArray == null) {
                        _emptyArray = new SCHeartbeatAck[0];
                    }
                }
            }
            return _emptyArray;
        }

        public SCHeartbeatAck clear() {
            this.timestamp = 0;
            this.clientTimestamp = 0;
            this.cachedSize = -1;
            return this;
        }

        @Override // com.google.protobuf.nano.MessageNano
        public int computeSerializedSize() {
            int computeSerializedSize = super.computeSerializedSize();
            long j = this.timestamp;
            if (j != 0) {
                computeSerializedSize += CodedOutputByteBufferNano.computeUInt64Size(1, j);
            }
            long j2 = this.clientTimestamp;
            if (j2 != 0) {
                return computeSerializedSize + CodedOutputByteBufferNano.computeUInt64Size(2, j2);
            }
            return computeSerializedSize;
        }

        public static SCHeartbeatAck parseFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
            return new SCHeartbeatAck().mergeFrom(codedInputByteBufferNano);
        }

        public static SCHeartbeatAck parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
            return (SCHeartbeatAck) MessageNano.mergeFrom(new SCHeartbeatAck(), bArr);
        }

        @Override // com.google.protobuf.nano.MessageNano
        public SCHeartbeatAck mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
            while (true) {
                int readTag = codedInputByteBufferNano.readTag();
                if (readTag == 0) {
                    return this;
                }
                if (readTag == 8) {
                    this.timestamp = codedInputByteBufferNano.readUInt64();
                } else if (readTag == 16) {
                    this.clientTimestamp = codedInputByteBufferNano.readUInt64();
                } else if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    return this;
                }
            }
        }

        @Override // com.google.protobuf.nano.MessageNano
        public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            long j = this.timestamp;
            if (j != 0) {
                codedOutputByteBufferNano.writeUInt64(1, j);
            }
            long j2 = this.clientTimestamp;
            if (j2 != 0) {
                codedOutputByteBufferNano.writeUInt64(2, j2);
            }
            super.writeTo(codedOutputByteBufferNano);
        }
    }

    /* compiled from: kSourceFile */
    public static final class SCInfo extends MessageNano {
        public static volatile SCInfo[] _emptyArray;
        public int code;
        public String msg;

        public SCInfo() {
            clear();
        }

        public static SCInfo[] emptyArray() {
            if (_emptyArray == null) {
                synchronized (InternalNano.LAZY_INIT_LOCK) {
                    if (_emptyArray == null) {
                        _emptyArray = new SCInfo[0];
                    }
                }
            }
            return _emptyArray;
        }

        public SCInfo clear() {
            this.code = 0;
            this.msg = "";
            this.cachedSize = -1;
            return this;
        }

        @Override // com.google.protobuf.nano.MessageNano
        public int computeSerializedSize() {
            int computeSerializedSize = super.computeSerializedSize();
            int i = this.code;
            if (i != 0) {
                computeSerializedSize += CodedOutputByteBufferNano.computeUInt32Size(1, i);
            }
            if (!this.msg.equals("")) {
                return computeSerializedSize + CodedOutputByteBufferNano.computeStringSize(2, this.msg);
            }
            return computeSerializedSize;
        }

        public static SCInfo parseFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
            return new SCInfo().mergeFrom(codedInputByteBufferNano);
        }

        public static SCInfo parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
            return (SCInfo) MessageNano.mergeFrom(new SCInfo(), bArr);
        }

        @Override // com.google.protobuf.nano.MessageNano
        public SCInfo mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
            while (true) {
                int readTag = codedInputByteBufferNano.readTag();
                if (readTag == 0) {
                    return this;
                }
                if (readTag == 8) {
                    this.code = codedInputByteBufferNano.readUInt32();
                } else if (readTag == 18) {
                    this.msg = codedInputByteBufferNano.readString();
                } else if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    return this;
                }
            }
        }

        @Override // com.google.protobuf.nano.MessageNano
        public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            int i = this.code;
            if (i != 0) {
                codedOutputByteBufferNano.writeUInt32(1, i);
            }
            if (!this.msg.equals("")) {
                codedOutputByteBufferNano.writeString(2, this.msg);
            }
            super.writeTo(codedOutputByteBufferNano);
        }
    }

    /* compiled from: kSourceFile */
    public static final class SCPingAck extends MessageNano {
        public static volatile SCPingAck[] _emptyArray;
        public String echoData;

        public SCPingAck() {
            clear();
        }

        public static SCPingAck[] emptyArray() {
            if (_emptyArray == null) {
                synchronized (InternalNano.LAZY_INIT_LOCK) {
                    if (_emptyArray == null) {
                        _emptyArray = new SCPingAck[0];
                    }
                }
            }
            return _emptyArray;
        }

        public SCPingAck clear() {
            this.echoData = "";
            this.cachedSize = -1;
            return this;
        }

        @Override // com.google.protobuf.nano.MessageNano
        public int computeSerializedSize() {
            int computeSerializedSize = super.computeSerializedSize();
            if (!this.echoData.equals("")) {
                return computeSerializedSize + CodedOutputByteBufferNano.computeStringSize(1, this.echoData);
            }
            return computeSerializedSize;
        }

        public static SCPingAck parseFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
            return new SCPingAck().mergeFrom(codedInputByteBufferNano);
        }

        @Override // com.google.protobuf.nano.MessageNano
        public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            if (!this.echoData.equals("")) {
                codedOutputByteBufferNano.writeString(1, this.echoData);
            }
            super.writeTo(codedOutputByteBufferNano);
        }

        public static SCPingAck parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
            return (SCPingAck) MessageNano.mergeFrom(new SCPingAck(), bArr);
        }

        @Override // com.google.protobuf.nano.MessageNano
        public SCPingAck mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
            while (true) {
                int readTag = codedInputByteBufferNano.readTag();
                if (readTag == 0) {
                    return this;
                }
                if (readTag == 10) {
                    this.echoData = codedInputByteBufferNano.readString();
                } else if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    return this;
                }
            }
        }
    }

    /* compiled from: kSourceFile */
    public static final class SCVoicePartyAboardApplyResult extends MessageNano {
        public static volatile SCVoicePartyAboardApplyResult[] _emptyArray;
        public boolean allow;
        public String aryaConfig;
        public String liveStreamId;
        public String voicePartyId;

        public SCVoicePartyAboardApplyResult() {
            clear();
        }

        public static SCVoicePartyAboardApplyResult[] emptyArray() {
            if (_emptyArray == null) {
                synchronized (InternalNano.LAZY_INIT_LOCK) {
                    if (_emptyArray == null) {
                        _emptyArray = new SCVoicePartyAboardApplyResult[0];
                    }
                }
            }
            return _emptyArray;
        }

        public SCVoicePartyAboardApplyResult clear() {
            this.liveStreamId = "";
            this.voicePartyId = "";
            this.allow = false;
            this.aryaConfig = "";
            this.cachedSize = -1;
            return this;
        }

        @Override // com.google.protobuf.nano.MessageNano
        public int computeSerializedSize() {
            int computeSerializedSize = super.computeSerializedSize();
            if (!this.liveStreamId.equals("")) {
                computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(1, this.liveStreamId);
            }
            if (!this.voicePartyId.equals("")) {
                computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(2, this.voicePartyId);
            }
            boolean z = this.allow;
            if (z) {
                computeSerializedSize += CodedOutputByteBufferNano.computeBoolSize(3, z);
            }
            if (!this.aryaConfig.equals("")) {
                return computeSerializedSize + CodedOutputByteBufferNano.computeStringSize(4, this.aryaConfig);
            }
            return computeSerializedSize;
        }

        public static SCVoicePartyAboardApplyResult parseFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
            return new SCVoicePartyAboardApplyResult().mergeFrom(codedInputByteBufferNano);
        }

        public static SCVoicePartyAboardApplyResult parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
            return (SCVoicePartyAboardApplyResult) MessageNano.mergeFrom(new SCVoicePartyAboardApplyResult(), bArr);
        }

        @Override // com.google.protobuf.nano.MessageNano
        public SCVoicePartyAboardApplyResult mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
            while (true) {
                int readTag = codedInputByteBufferNano.readTag();
                if (readTag == 0) {
                    return this;
                }
                if (readTag == 10) {
                    this.liveStreamId = codedInputByteBufferNano.readString();
                } else if (readTag == 18) {
                    this.voicePartyId = codedInputByteBufferNano.readString();
                } else if (readTag == 24) {
                    this.allow = codedInputByteBufferNano.readBool();
                } else if (readTag == 34) {
                    this.aryaConfig = codedInputByteBufferNano.readString();
                } else if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    return this;
                }
            }
        }

        @Override // com.google.protobuf.nano.MessageNano
        public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            if (!this.liveStreamId.equals("")) {
                codedOutputByteBufferNano.writeString(1, this.liveStreamId);
            }
            if (!this.voicePartyId.equals("")) {
                codedOutputByteBufferNano.writeString(2, this.voicePartyId);
            }
            boolean z = this.allow;
            if (z) {
                codedOutputByteBufferNano.writeBool(3, z);
            }
            if (!this.aryaConfig.equals("")) {
                codedOutputByteBufferNano.writeString(4, this.aryaConfig);
            }
            super.writeTo(codedOutputByteBufferNano);
        }
    }

    /* compiled from: kSourceFile */
    public static final class SCVoicePartyCoverAuditInfo extends MessageNano {
        public static volatile SCVoicePartyCoverAuditInfo[] _emptyArray;
        public boolean auditPass;
        public String liveStreamId;
        public String voicePartyId;

        public SCVoicePartyCoverAuditInfo() {
            clear();
        }

        public static SCVoicePartyCoverAuditInfo[] emptyArray() {
            if (_emptyArray == null) {
                synchronized (InternalNano.LAZY_INIT_LOCK) {
                    if (_emptyArray == null) {
                        _emptyArray = new SCVoicePartyCoverAuditInfo[0];
                    }
                }
            }
            return _emptyArray;
        }

        public SCVoicePartyCoverAuditInfo clear() {
            this.liveStreamId = "";
            this.voicePartyId = "";
            this.auditPass = false;
            this.cachedSize = -1;
            return this;
        }

        @Override // com.google.protobuf.nano.MessageNano
        public int computeSerializedSize() {
            int computeSerializedSize = super.computeSerializedSize();
            if (!this.liveStreamId.equals("")) {
                computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(1, this.liveStreamId);
            }
            if (!this.voicePartyId.equals("")) {
                computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(2, this.voicePartyId);
            }
            boolean z = this.auditPass;
            if (z) {
                return computeSerializedSize + CodedOutputByteBufferNano.computeBoolSize(3, z);
            }
            return computeSerializedSize;
        }

        public static SCVoicePartyCoverAuditInfo parseFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
            return new SCVoicePartyCoverAuditInfo().mergeFrom(codedInputByteBufferNano);
        }

        public static SCVoicePartyCoverAuditInfo parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
            return (SCVoicePartyCoverAuditInfo) MessageNano.mergeFrom(new SCVoicePartyCoverAuditInfo(), bArr);
        }

        @Override // com.google.protobuf.nano.MessageNano
        public SCVoicePartyCoverAuditInfo mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
            while (true) {
                int readTag = codedInputByteBufferNano.readTag();
                if (readTag == 0) {
                    return this;
                }
                if (readTag == 10) {
                    this.liveStreamId = codedInputByteBufferNano.readString();
                } else if (readTag == 18) {
                    this.voicePartyId = codedInputByteBufferNano.readString();
                } else if (readTag == 24) {
                    this.auditPass = codedInputByteBufferNano.readBool();
                } else if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    return this;
                }
            }
        }

        @Override // com.google.protobuf.nano.MessageNano
        public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            if (!this.liveStreamId.equals("")) {
                codedOutputByteBufferNano.writeString(1, this.liveStreamId);
            }
            if (!this.voicePartyId.equals("")) {
                codedOutputByteBufferNano.writeString(2, this.voicePartyId);
            }
            boolean z = this.auditPass;
            if (z) {
                codedOutputByteBufferNano.writeBool(3, z);
            }
            super.writeTo(codedOutputByteBufferNano);
        }
    }

    /* compiled from: kSourceFile */
    public static final class SocketMessage extends MessageNano {
        public static volatile SocketMessage[] _emptyArray;
        public byte[] ackInfo;
        public int compressionType;
        public String messageId;
        public boolean needAck;
        public byte[] payload;
        public int payloadType;
        public String reportId;
        public long time;

        @Retention(RetentionPolicy.SOURCE)
        /* compiled from: kSourceFile */
        public @interface CompressionType {
        }

        public SocketMessage() {
            clear();
        }

        public static SocketMessage[] emptyArray() {
            if (_emptyArray == null) {
                synchronized (InternalNano.LAZY_INIT_LOCK) {
                    if (_emptyArray == null) {
                        _emptyArray = new SocketMessage[0];
                    }
                }
            }
            return _emptyArray;
        }

        public SocketMessage clear() {
            this.payloadType = 0;
            this.compressionType = 0;
            byte[] bArr = WireFormatNano.EMPTY_BYTES;
            this.payload = bArr;
            this.time = 0;
            this.reportId = "";
            this.messageId = "";
            this.needAck = false;
            this.ackInfo = bArr;
            this.cachedSize = -1;
            return this;
        }

        @Override // com.google.protobuf.nano.MessageNano
        public int computeSerializedSize() {
            int computeSerializedSize = super.computeSerializedSize();
            int i = this.payloadType;
            if (i != 0) {
                computeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(1, i);
            }
            int i2 = this.compressionType;
            if (i2 != 0) {
                computeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(2, i2);
            }
            if (!Arrays.equals(this.payload, WireFormatNano.EMPTY_BYTES)) {
                computeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(3, this.payload);
            }
            long j = this.time;
            if (j != 0) {
                computeSerializedSize += CodedOutputByteBufferNano.computeUInt64Size(4, j);
            }
            if (!this.reportId.equals("")) {
                computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(5, this.reportId);
            }
            if (!this.messageId.equals("")) {
                computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(6, this.messageId);
            }
            boolean z = this.needAck;
            if (z) {
                computeSerializedSize += CodedOutputByteBufferNano.computeBoolSize(7, z);
            }
            if (!Arrays.equals(this.ackInfo, WireFormatNano.EMPTY_BYTES)) {
                return computeSerializedSize + CodedOutputByteBufferNano.computeBytesSize(8, this.ackInfo);
            }
            return computeSerializedSize;
        }

        public static SocketMessage parseFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
            return new SocketMessage().mergeFrom(codedInputByteBufferNano);
        }

        public static SocketMessage parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
            return (SocketMessage) MessageNano.mergeFrom(new SocketMessage(), bArr);
        }

        @Override // com.google.protobuf.nano.MessageNano
        public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            int i = this.payloadType;
            if (i != 0) {
                codedOutputByteBufferNano.writeInt32(1, i);
            }
            int i2 = this.compressionType;
            if (i2 != 0) {
                codedOutputByteBufferNano.writeInt32(2, i2);
            }
            if (!Arrays.equals(this.payload, WireFormatNano.EMPTY_BYTES)) {
                codedOutputByteBufferNano.writeBytes(3, this.payload);
            }
            long j = this.time;
            if (j != 0) {
                codedOutputByteBufferNano.writeUInt64(4, j);
            }
            if (!this.reportId.equals("")) {
                codedOutputByteBufferNano.writeString(5, this.reportId);
            }
            if (!this.messageId.equals("")) {
                codedOutputByteBufferNano.writeString(6, this.messageId);
            }
            boolean z = this.needAck;
            if (z) {
                codedOutputByteBufferNano.writeBool(7, z);
            }
            if (!Arrays.equals(this.ackInfo, WireFormatNano.EMPTY_BYTES)) {
                codedOutputByteBufferNano.writeBytes(8, this.ackInfo);
            }
            super.writeTo(codedOutputByteBufferNano);
        }

        /* JADX WARNING: Removed duplicated region for block: B:51:0x0096 A[FALL_THROUGH] */
        @Override // com.google.protobuf.nano.MessageNano
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public SocketMessage mergeFrom(CodedInputByteBufferNano r5) throws IOException {
            /*
            // Method dump skipped, instructions count: 1756
            */
            throw new UnsupportedOperationException("Method not decompiled: com.kuaishou.socket.nano.SocketMessages.SocketMessage.mergeFrom(com.google.protobuf.nano.CodedInputByteBufferNano):com.kuaishou.socket.nano.SocketMessages$SocketMessage");
        }
    }
}
