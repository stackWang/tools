package com.ks;

import com.google.protobuf.nano.*;

import java.io.IOException;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* compiled from: kSourceFile */
public interface LiveStreamWebMessages {

    @Retention(RetentionPolicy.SOURCE)
    /* compiled from: kSourceFile */
    public @interface FeedShowType {
    }

    @Retention(RetentionPolicy.SOURCE)
    /* compiled from: kSourceFile */
    public @interface LiveWebChatCallRejectReason {
    }

    @Retention(RetentionPolicy.SOURCE)
    /* compiled from: kSourceFile */
    public @interface WebChatMediaType {
    }

    @Retention(RetentionPolicy.SOURCE)
    /* compiled from: kSourceFile */
    public @interface WebLiveAssistantType {
    }

    @Retention(RetentionPolicy.SOURCE)
    /* compiled from: kSourceFile */
    public @interface WebPauseType {
    }

    @Retention(RetentionPolicy.SOURCE)
    /* compiled from: kSourceFile */
    public @interface WebPkAbnormalEndType {
    }

    @Retention(RetentionPolicy.SOURCE)
    /* compiled from: kSourceFile */
    public @interface WebRedPackCoverType {
    }

    @Retention(RetentionPolicy.SOURCE)
    /* compiled from: kSourceFile */
    public @interface WebUserPauseType {
    }

    /* compiled from: kSourceFile */
    public static final class CSWebEnterRoom extends MessageNano {
        public static volatile CSWebEnterRoom[] _emptyArray;
        public String attach;
        public String expTag;
        public int lastErrorCode;
        public String liveStreamId;
        public String pageId;
        public int reconnectCount;
        public String token;

        public CSWebEnterRoom() {
            clear();
        }

        public static CSWebEnterRoom[] emptyArray() {
            if (_emptyArray == null) {
                synchronized (InternalNano.LAZY_INIT_LOCK) {
                    if (_emptyArray == null) {
                        _emptyArray = new CSWebEnterRoom[0];
                    }
                }
            }
            return _emptyArray;
        }

        public CSWebEnterRoom clear() {
            this.token = "";
            this.liveStreamId = "";
            this.reconnectCount = 0;
            this.lastErrorCode = 0;
            this.expTag = "";
            this.attach = "";
            this.pageId = "";
            this.cachedSize = -1;
            return this;
        }

        public int computeSerializedSize() {
            int computeSerializedSize = super.computeSerializedSize();
            if (!this.token.equals("")) {
                computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(1, this.token);
            }
            if (!this.liveStreamId.equals("")) {
                computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(2, this.liveStreamId);
            }
            int i = this.reconnectCount;
            if (i != 0) {
                computeSerializedSize += CodedOutputByteBufferNano.computeUInt32Size(3, i);
            }
            int i2 = this.lastErrorCode;
            if (i2 != 0) {
                computeSerializedSize += CodedOutputByteBufferNano.computeUInt32Size(4, i2);
            }
            if (!this.expTag.equals("")) {
                computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(5, this.expTag);
            }
            if (!this.attach.equals("")) {
                computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(6, this.attach);
            }
            if (!this.pageId.equals("")) {
                return computeSerializedSize + CodedOutputByteBufferNano.computeStringSize(7, this.pageId);
            }
            return computeSerializedSize;
        }

        public static CSWebEnterRoom parseFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
            return new CSWebEnterRoom().mergeFrom(codedInputByteBufferNano);
        }

        public static CSWebEnterRoom parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
            return (CSWebEnterRoom) MessageNano.mergeFrom(new CSWebEnterRoom(), bArr);
        }

        public CSWebEnterRoom mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
            while (true) {
                int readTag = codedInputByteBufferNano.readTag();
                if (readTag == 0) {
                    return this;
                }
                if (readTag == 10) {
                    this.token = codedInputByteBufferNano.readString();
                } else if (readTag == 18) {
                    this.liveStreamId = codedInputByteBufferNano.readString();
                } else if (readTag == 24) {
                    this.reconnectCount = codedInputByteBufferNano.readUInt32();
                } else if (readTag == 32) {
                    this.lastErrorCode = codedInputByteBufferNano.readUInt32();
                } else if (readTag == 42) {
                    this.expTag = codedInputByteBufferNano.readString();
                } else if (readTag == 50) {
                    this.attach = codedInputByteBufferNano.readString();
                } else if (readTag == 58) {
                    this.pageId = codedInputByteBufferNano.readString();
                } else if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    return this;
                }
            }
        }

        public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            if (!this.token.equals("")) {
                codedOutputByteBufferNano.writeString(1, this.token);
            }
            if (!this.liveStreamId.equals("")) {
                codedOutputByteBufferNano.writeString(2, this.liveStreamId);
            }
            int i = this.reconnectCount;
            if (i != 0) {
                codedOutputByteBufferNano.writeUInt32(3, i);
            }
            int i2 = this.lastErrorCode;
            if (i2 != 0) {
                codedOutputByteBufferNano.writeUInt32(4, i2);
            }
            if (!this.expTag.equals("")) {
                codedOutputByteBufferNano.writeString(5, this.expTag);
            }
            if (!this.attach.equals("")) {
                codedOutputByteBufferNano.writeString(6, this.attach);
            }
            if (!this.pageId.equals("")) {
                codedOutputByteBufferNano.writeString(7, this.pageId);
            }
            super.writeTo(codedOutputByteBufferNano);
        }
    }

    /* compiled from: kSourceFile */
    public static final class CSWebError extends MessageNano {
        public static volatile CSWebError[] _emptyArray;
        public int code;
        public String msg;

        public CSWebError() {
            clear();
        }

        public static CSWebError[] emptyArray() {
            if (_emptyArray == null) {
                synchronized (InternalNano.LAZY_INIT_LOCK) {
                    if (_emptyArray == null) {
                        _emptyArray = new CSWebError[0];
                    }
                }
            }
            return _emptyArray;
        }

        public CSWebError clear() {
            this.code = 0;
            this.msg = "";
            this.cachedSize = -1;
            return this;
        }

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

        public static CSWebError parseFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
            return new CSWebError().mergeFrom(codedInputByteBufferNano);
        }

        public static CSWebError parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
            return (CSWebError) MessageNano.mergeFrom(new CSWebError(), bArr);
        }

        public CSWebError mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
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
    public static final class CSWebHeartbeat extends MessageNano {
        public static volatile CSWebHeartbeat[] _emptyArray;
        public long timestamp;

        public CSWebHeartbeat() {
            clear();
        }

        public static CSWebHeartbeat[] emptyArray() {
            if (_emptyArray == null) {
                synchronized (InternalNano.LAZY_INIT_LOCK) {
                    if (_emptyArray == null) {
                        _emptyArray = new CSWebHeartbeat[0];
                    }
                }
            }
            return _emptyArray;
        }

        public CSWebHeartbeat clear() {
            this.timestamp = 0;
            this.cachedSize = -1;
            return this;
        }

        public int computeSerializedSize() {
            int computeSerializedSize = super.computeSerializedSize();
            long j2 = this.timestamp;
            if (j2 != 0) {
                return computeSerializedSize + CodedOutputByteBufferNano.computeUInt64Size(1, j2);
            }
            return computeSerializedSize;
        }

        public static CSWebHeartbeat parseFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
            return new CSWebHeartbeat().mergeFrom(codedInputByteBufferNano);
        }

        public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            long j2 = this.timestamp;
            if (j2 != 0) {
                codedOutputByteBufferNano.writeUInt64(1, j2);
            }
            super.writeTo(codedOutputByteBufferNano);
        }

        public static CSWebHeartbeat parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
            return (CSWebHeartbeat) MessageNano.mergeFrom(new CSWebHeartbeat(), bArr);
        }

        public CSWebHeartbeat mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
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
    public static final class CSWebUserExit extends MessageNano {
        public static volatile CSWebUserExit[] _emptyArray;
        public long time;

        public CSWebUserExit() {
            clear();
        }

        public static CSWebUserExit[] emptyArray() {
            if (_emptyArray == null) {
                synchronized (InternalNano.LAZY_INIT_LOCK) {
                    if (_emptyArray == null) {
                        _emptyArray = new CSWebUserExit[0];
                    }
                }
            }
            return _emptyArray;
        }

        public CSWebUserExit clear() {
            this.time = 0;
            this.cachedSize = -1;
            return this;
        }

        public int computeSerializedSize() {
            int computeSerializedSize = super.computeSerializedSize();
            long j2 = this.time;
            if (j2 != 0) {
                return computeSerializedSize + CodedOutputByteBufferNano.computeUInt64Size(1, j2);
            }
            return computeSerializedSize;
        }

        public static CSWebUserExit parseFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
            return new CSWebUserExit().mergeFrom(codedInputByteBufferNano);
        }

        public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            long j2 = this.time;
            if (j2 != 0) {
                codedOutputByteBufferNano.writeUInt64(1, j2);
            }
            super.writeTo(codedOutputByteBufferNano);
        }

        public static CSWebUserExit parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
            return (CSWebUserExit) MessageNano.mergeFrom(new CSWebUserExit(), bArr);
        }

        public CSWebUserExit mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
            while (true) {
                int readTag = codedInputByteBufferNano.readTag();
                if (readTag == 0) {
                    return this;
                }
                if (readTag == 8) {
                    this.time = codedInputByteBufferNano.readUInt64();
                } else if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    return this;
                }
            }
        }
    }

    /* compiled from: kSourceFile */
    public static final class CSWebUserPause extends MessageNano {
        public static volatile CSWebUserPause[] _emptyArray;
        public int pauseType;
        public long time;

        public CSWebUserPause() {
            clear();
        }

        public static CSWebUserPause[] emptyArray() {
            if (_emptyArray == null) {
                synchronized (InternalNano.LAZY_INIT_LOCK) {
                    if (_emptyArray == null) {
                        _emptyArray = new CSWebUserPause[0];
                    }
                }
            }
            return _emptyArray;
        }

        public CSWebUserPause clear() {
            this.time = 0;
            this.pauseType = 0;
            this.cachedSize = -1;
            return this;
        }

        public int computeSerializedSize() {
            int computeSerializedSize = super.computeSerializedSize();
            long j2 = this.time;
            if (j2 != 0) {
                computeSerializedSize += CodedOutputByteBufferNano.computeUInt64Size(1, j2);
            }
            int i = this.pauseType;
            if (i != 0) {
                return computeSerializedSize + CodedOutputByteBufferNano.computeInt32Size(2, i);
            }
            return computeSerializedSize;
        }

        public static CSWebUserPause parseFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
            return new CSWebUserPause().mergeFrom(codedInputByteBufferNano);
        }

        public static CSWebUserPause parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
            return (CSWebUserPause) MessageNano.mergeFrom(new CSWebUserPause(), bArr);
        }

        public CSWebUserPause mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
            while (true) {
                int readTag = codedInputByteBufferNano.readTag();
                if (readTag == 0) {
                    return this;
                }
                if (readTag == 8) {
                    this.time = codedInputByteBufferNano.readUInt64();
                } else if (readTag == 16) {
                    int readInt32 = codedInputByteBufferNano.readInt32();
                    if (readInt32 == 0 || readInt32 == 1) {
                        this.pauseType = readInt32;
                    }
                } else if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    return this;
                }
            }
        }

        public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            long j2 = this.time;
            if (j2 != 0) {
                codedOutputByteBufferNano.writeUInt64(1, j2);
            }
            int i = this.pauseType;
            if (i != 0) {
                codedOutputByteBufferNano.writeInt32(2, i);
            }
            super.writeTo(codedOutputByteBufferNano);
        }
    }

    /* compiled from: kSourceFile */
    public static final class SCWebAuthorPause extends MessageNano {
        public static volatile SCWebAuthorPause[] _emptyArray;
        public int pauseType;
        public long time;

        public SCWebAuthorPause() {
            clear();
        }

        public static SCWebAuthorPause[] emptyArray() {
            if (_emptyArray == null) {
                synchronized (InternalNano.LAZY_INIT_LOCK) {
                    if (_emptyArray == null) {
                        _emptyArray = new SCWebAuthorPause[0];
                    }
                }
            }
            return _emptyArray;
        }

        public SCWebAuthorPause clear() {
            this.time = 0;
            this.pauseType = 0;
            this.cachedSize = -1;
            return this;
        }

        public int computeSerializedSize() {
            int computeSerializedSize = super.computeSerializedSize();
            long j2 = this.time;
            if (j2 != 0) {
                computeSerializedSize += CodedOutputByteBufferNano.computeUInt64Size(1, j2);
            }
            int i = this.pauseType;
            if (i != 0) {
                return computeSerializedSize + CodedOutputByteBufferNano.computeInt32Size(2, i);
            }
            return computeSerializedSize;
        }

        public static SCWebAuthorPause parseFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
            return new SCWebAuthorPause().mergeFrom(codedInputByteBufferNano);
        }

        public static SCWebAuthorPause parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
            return (SCWebAuthorPause) MessageNano.mergeFrom(new SCWebAuthorPause(), bArr);
        }

        public SCWebAuthorPause mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
            while (true) {
                int readTag = codedInputByteBufferNano.readTag();
                if (readTag == 0) {
                    return this;
                }
                if (readTag == 8) {
                    this.time = codedInputByteBufferNano.readUInt64();
                } else if (readTag == 16) {
                    int readInt32 = codedInputByteBufferNano.readInt32();
                    if (readInt32 == 0 || readInt32 == 1 || readInt32 == 2) {
                        this.pauseType = readInt32;
                    }
                } else if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    return this;
                }
            }
        }

        public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            long j2 = this.time;
            if (j2 != 0) {
                codedOutputByteBufferNano.writeUInt64(1, j2);
            }
            int i = this.pauseType;
            if (i != 0) {
                codedOutputByteBufferNano.writeInt32(2, i);
            }
            super.writeTo(codedOutputByteBufferNano);
        }
    }

    /* compiled from: kSourceFile */
    public static final class SCWebAuthorResume extends MessageNano {
        public static volatile SCWebAuthorResume[] _emptyArray;
        public long time;

        public SCWebAuthorResume() {
            clear();
        }

        public static SCWebAuthorResume[] emptyArray() {
            if (_emptyArray == null) {
                synchronized (InternalNano.LAZY_INIT_LOCK) {
                    if (_emptyArray == null) {
                        _emptyArray = new SCWebAuthorResume[0];
                    }
                }
            }
            return _emptyArray;
        }

        public SCWebAuthorResume clear() {
            this.time = 0;
            this.cachedSize = -1;
            return this;
        }

        public int computeSerializedSize() {
            int computeSerializedSize = super.computeSerializedSize();
            long j2 = this.time;
            if (j2 != 0) {
                return computeSerializedSize + CodedOutputByteBufferNano.computeUInt64Size(1, j2);
            }
            return computeSerializedSize;
        }

        public static SCWebAuthorResume parseFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
            return new SCWebAuthorResume().mergeFrom(codedInputByteBufferNano);
        }

        public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            long j2 = this.time;
            if (j2 != 0) {
                codedOutputByteBufferNano.writeUInt64(1, j2);
            }
            super.writeTo(codedOutputByteBufferNano);
        }

        public static SCWebAuthorResume parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
            return (SCWebAuthorResume) MessageNano.mergeFrom(new SCWebAuthorResume(), bArr);
        }

        public SCWebAuthorResume mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
            while (true) {
                int readTag = codedInputByteBufferNano.readTag();
                if (readTag == 0) {
                    return this;
                }
                if (readTag == 8) {
                    this.time = codedInputByteBufferNano.readUInt64();
                } else if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    return this;
                }
            }
        }
    }

    /* compiled from: kSourceFile */
    public static final class SCWebBetChanged extends MessageNano {
        public static volatile SCWebBetChanged[] _emptyArray;
        public long maxDelayMillis;

        public SCWebBetChanged() {
            clear();
        }

        public static SCWebBetChanged[] emptyArray() {
            if (_emptyArray == null) {
                synchronized (InternalNano.LAZY_INIT_LOCK) {
                    if (_emptyArray == null) {
                        _emptyArray = new SCWebBetChanged[0];
                    }
                }
            }
            return _emptyArray;
        }

        public SCWebBetChanged clear() {
            this.maxDelayMillis = 0;
            this.cachedSize = -1;
            return this;
        }

        public int computeSerializedSize() {
            int computeSerializedSize = super.computeSerializedSize();
            long j2 = this.maxDelayMillis;
            if (j2 != 0) {
                return computeSerializedSize + CodedOutputByteBufferNano.computeUInt64Size(1, j2);
            }
            return computeSerializedSize;
        }

        public static SCWebBetChanged parseFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
            return new SCWebBetChanged().mergeFrom(codedInputByteBufferNano);
        }

        public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            long j2 = this.maxDelayMillis;
            if (j2 != 0) {
                codedOutputByteBufferNano.writeUInt64(1, j2);
            }
            super.writeTo(codedOutputByteBufferNano);
        }

        public static SCWebBetChanged parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
            return (SCWebBetChanged) MessageNano.mergeFrom(new SCWebBetChanged(), bArr);
        }

        public SCWebBetChanged mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
            while (true) {
                int readTag = codedInputByteBufferNano.readTag();
                if (readTag == 0) {
                    return this;
                }
                if (readTag == 8) {
                    this.maxDelayMillis = codedInputByteBufferNano.readUInt64();
                } else if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    return this;
                }
            }
        }
    }

    /* compiled from: kSourceFile */
    public static final class SCWebBetClosed extends MessageNano {
        public static volatile SCWebBetClosed[] _emptyArray;
        public long maxDelayMillis;

        public SCWebBetClosed() {
            clear();
        }

        public static SCWebBetClosed[] emptyArray() {
            if (_emptyArray == null) {
                synchronized (InternalNano.LAZY_INIT_LOCK) {
                    if (_emptyArray == null) {
                        _emptyArray = new SCWebBetClosed[0];
                    }
                }
            }
            return _emptyArray;
        }

        public SCWebBetClosed clear() {
            this.maxDelayMillis = 0;
            this.cachedSize = -1;
            return this;
        }

        public int computeSerializedSize() {
            int computeSerializedSize = super.computeSerializedSize();
            long j2 = this.maxDelayMillis;
            if (j2 != 0) {
                return computeSerializedSize + CodedOutputByteBufferNano.computeUInt64Size(1, j2);
            }
            return computeSerializedSize;
        }

        public static SCWebBetClosed parseFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
            return new SCWebBetClosed().mergeFrom(codedInputByteBufferNano);
        }

        public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            long j2 = this.maxDelayMillis;
            if (j2 != 0) {
                codedOutputByteBufferNano.writeUInt64(1, j2);
            }
            super.writeTo(codedOutputByteBufferNano);
        }

        public static SCWebBetClosed parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
            return (SCWebBetClosed) MessageNano.mergeFrom(new SCWebBetClosed(), bArr);
        }

        public SCWebBetClosed mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
            while (true) {
                int readTag = codedInputByteBufferNano.readTag();
                if (readTag == 0) {
                    return this;
                }
                if (readTag == 8) {
                    this.maxDelayMillis = codedInputByteBufferNano.readUInt64();
                } else if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    return this;
                }
            }
        }
    }

    /* compiled from: kSourceFile */
    public static final class SCWebCurrentRedPackFeed extends MessageNano {
        public static volatile SCWebCurrentRedPackFeed[] _emptyArray;
        public WebRedPackInfo[] redPack;

        public SCWebCurrentRedPackFeed() {
            clear();
        }

        public static SCWebCurrentRedPackFeed[] emptyArray() {
            if (_emptyArray == null) {
                synchronized (InternalNano.LAZY_INIT_LOCK) {
                    if (_emptyArray == null) {
                        _emptyArray = new SCWebCurrentRedPackFeed[0];
                    }
                }
            }
            return _emptyArray;
        }

        public SCWebCurrentRedPackFeed clear() {
            this.redPack = WebRedPackInfo.emptyArray();
            this.cachedSize = -1;
            return this;
        }

        public int computeSerializedSize() {
            int computeSerializedSize = super.computeSerializedSize();
            WebRedPackInfo[] webRedPackInfoArr = this.redPack;
            if (webRedPackInfoArr != null && webRedPackInfoArr.length > 0) {
                int i = 0;
                while (true) {
                    WebRedPackInfo[] webRedPackInfoArr2 = this.redPack;
                    if (i >= webRedPackInfoArr2.length) {
                        break;
                    }
                    WebRedPackInfo webRedPackInfo = webRedPackInfoArr2[i];
                    if (webRedPackInfo != null) {
                        computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(1, webRedPackInfo);
                    }
                    i++;
                }
            }
            return computeSerializedSize;
        }

        public static SCWebCurrentRedPackFeed parseFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
            return new SCWebCurrentRedPackFeed().mergeFrom(codedInputByteBufferNano);
        }

        public static SCWebCurrentRedPackFeed parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
            return (SCWebCurrentRedPackFeed) MessageNano.mergeFrom(new SCWebCurrentRedPackFeed(), bArr);
        }

        public SCWebCurrentRedPackFeed mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
            int i;
            while (true) {
                int readTag = codedInputByteBufferNano.readTag();
                if (readTag == 0) {
                    return this;
                }
                if (readTag == 10) {
                    int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 10);
                    WebRedPackInfo[] webRedPackInfoArr = this.redPack;
                    if (webRedPackInfoArr == null) {
                        i = 0;
                    } else {
                        i = webRedPackInfoArr.length;
                    }
                    int i2 = repeatedFieldArrayLength + i;
                    WebRedPackInfo[] webRedPackInfoArr2 = new WebRedPackInfo[i2];
                    if (i != 0) {
                        System.arraycopy(this.redPack, 0, webRedPackInfoArr2, 0, i);
                    }
                    while (i < i2 - 1) {
                        webRedPackInfoArr2[i] = new WebRedPackInfo();
                        codedInputByteBufferNano.readMessage(webRedPackInfoArr2[i]);
                        codedInputByteBufferNano.readTag();
                        i++;
                    }
                    webRedPackInfoArr2[i] = new WebRedPackInfo();
                    codedInputByteBufferNano.readMessage(webRedPackInfoArr2[i]);
                    this.redPack = webRedPackInfoArr2;
                } else if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    return this;
                }
            }
        }

        public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            WebRedPackInfo[] webRedPackInfoArr = this.redPack;
            if (webRedPackInfoArr != null && webRedPackInfoArr.length > 0) {
                int i = 0;
                while (true) {
                    WebRedPackInfo[] webRedPackInfoArr2 = this.redPack;
                    if (i >= webRedPackInfoArr2.length) {
                        break;
                    }
                    WebRedPackInfo webRedPackInfo = webRedPackInfoArr2[i];
                    if (webRedPackInfo != null) {
                        codedOutputByteBufferNano.writeMessage(1, webRedPackInfo);
                    }
                    i++;
                }
            }
            super.writeTo(codedOutputByteBufferNano);
        }
    }

    /* compiled from: kSourceFile */
    public static final class SCWebEnterRoomAck extends MessageNano {
        public static volatile SCWebEnterRoomAck[] _emptyArray;
        public long heartbeatIntervalMs;
        public long maxReconnectMs;
        public long minReconnectMs;

        public SCWebEnterRoomAck() {
            clear();
        }

        public static SCWebEnterRoomAck[] emptyArray() {
            if (_emptyArray == null) {
                synchronized (InternalNano.LAZY_INIT_LOCK) {
                    if (_emptyArray == null) {
                        _emptyArray = new SCWebEnterRoomAck[0];
                    }
                }
            }
            return _emptyArray;
        }

        public SCWebEnterRoomAck clear() {
            this.minReconnectMs = 0;
            this.maxReconnectMs = 0;
            this.heartbeatIntervalMs = 0;
            this.cachedSize = -1;
            return this;
        }

        public int computeSerializedSize() {
            int computeSerializedSize = super.computeSerializedSize();
            long j2 = this.minReconnectMs;
            if (j2 != 0) {
                computeSerializedSize += CodedOutputByteBufferNano.computeUInt64Size(1, j2);
            }
            long j3 = this.maxReconnectMs;
            if (j3 != 0) {
                computeSerializedSize += CodedOutputByteBufferNano.computeUInt64Size(2, j3);
            }
            long j4 = this.heartbeatIntervalMs;
            if (j4 != 0) {
                return computeSerializedSize + CodedOutputByteBufferNano.computeUInt64Size(3, j4);
            }
            return computeSerializedSize;
        }

        public static SCWebEnterRoomAck parseFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
            return new SCWebEnterRoomAck().mergeFrom(codedInputByteBufferNano);
        }

        public static SCWebEnterRoomAck parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
            return (SCWebEnterRoomAck) MessageNano.mergeFrom(new SCWebEnterRoomAck(), bArr);
        }

        public SCWebEnterRoomAck mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
            while (true) {
                int readTag = codedInputByteBufferNano.readTag();
                if (readTag == 0) {
                    return this;
                }
                if (readTag == 8) {
                    this.minReconnectMs = codedInputByteBufferNano.readUInt64();
                } else if (readTag == 16) {
                    this.maxReconnectMs = codedInputByteBufferNano.readUInt64();
                } else if (readTag == 24) {
                    this.heartbeatIntervalMs = codedInputByteBufferNano.readUInt64();
                } else if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    return this;
                }
            }
        }

        public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            long j2 = this.minReconnectMs;
            if (j2 != 0) {
                codedOutputByteBufferNano.writeUInt64(1, j2);
            }
            long j3 = this.maxReconnectMs;
            if (j3 != 0) {
                codedOutputByteBufferNano.writeUInt64(2, j3);
            }
            long j4 = this.heartbeatIntervalMs;
            if (j4 != 0) {
                codedOutputByteBufferNano.writeUInt64(3, j4);
            }
            super.writeTo(codedOutputByteBufferNano);
        }
    }

    /* compiled from: kSourceFile */
    public static final class SCWebError extends MessageNano {
        public static volatile SCWebError[] _emptyArray;
        public int code;
        public String msg;
        public int subCode;

        public SCWebError() {
            clear();
        }

        public static SCWebError[] emptyArray() {
            if (_emptyArray == null) {
                synchronized (InternalNano.LAZY_INIT_LOCK) {
                    if (_emptyArray == null) {
                        _emptyArray = new SCWebError[0];
                    }
                }
            }
            return _emptyArray;
        }

        public SCWebError clear() {
            this.code = 0;
            this.msg = "";
            this.subCode = 0;
            this.cachedSize = -1;
            return this;
        }

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
                return computeSerializedSize + CodedOutputByteBufferNano.computeUInt32Size(3, i2);
            }
            return computeSerializedSize;
        }

        public static SCWebError parseFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
            return new SCWebError().mergeFrom(codedInputByteBufferNano);
        }

        public static SCWebError parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
            return (SCWebError) MessageNano.mergeFrom(new SCWebError(), bArr);
        }

        public SCWebError mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
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
                } else if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    return this;
                }
            }
        }

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
            super.writeTo(codedOutputByteBufferNano);
        }
    }

    /* compiled from: kSourceFile */
    public static final class SCWebFeedPush extends MessageNano {
        public static volatile SCWebFeedPush[] _emptyArray;
        public WebComboCommentFeed[] comboCommentFeed;
        public String commentCursor;
        public WebCommentFeed[] commentFeeds;
        public String displayLikeCount;
        public String displayWatchingCount;
        public String giftCursor;
        public WebGiftFeed[] giftFeeds;
        public WebLikeFeed[] likeFeeds;
        public long pendingLikeCount;
        public long pushInterval;
        public WebShareFeed[] shareFeeds;
        public WebSystemNoticeFeed[] systemNoticeFeeds;

        public SCWebFeedPush() {
            clear();
        }

        public static SCWebFeedPush[] emptyArray() {
            if (_emptyArray == null) {
                synchronized (InternalNano.LAZY_INIT_LOCK) {
                    if (_emptyArray == null) {
                        _emptyArray = new SCWebFeedPush[0];
                    }
                }
            }
            return _emptyArray;
        }

        public SCWebFeedPush clear() {
            this.displayWatchingCount = "";
            this.displayLikeCount = "";
            this.pendingLikeCount = 0;
            this.pushInterval = 0;
            this.commentFeeds = WebCommentFeed.emptyArray();
            this.commentCursor = "";
            this.comboCommentFeed = WebComboCommentFeed.emptyArray();
            this.likeFeeds = WebLikeFeed.emptyArray();
            this.giftFeeds = WebGiftFeed.emptyArray();
            this.giftCursor = "";
            this.systemNoticeFeeds = WebSystemNoticeFeed.emptyArray();
            this.shareFeeds = WebShareFeed.emptyArray();
            this.cachedSize = -1;
            return this;
        }

        public int computeSerializedSize() {
            int computeSerializedSize = super.computeSerializedSize();
            if (!this.displayWatchingCount.equals("")) {
                computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(1, this.displayWatchingCount);
            }
            if (!this.displayLikeCount.equals("")) {
                computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(2, this.displayLikeCount);
            }
            long j2 = this.pendingLikeCount;
            if (j2 != 0) {
                computeSerializedSize += CodedOutputByteBufferNano.computeUInt64Size(3, j2);
            }
            long j3 = this.pushInterval;
            if (j3 != 0) {
                computeSerializedSize += CodedOutputByteBufferNano.computeUInt64Size(4, j3);
            }
            WebCommentFeed[] webCommentFeedArr = this.commentFeeds;
            int i = 0;
            if (webCommentFeedArr != null && webCommentFeedArr.length > 0) {
                int i2 = 0;
                while (true) {
                    WebCommentFeed[] webCommentFeedArr2 = this.commentFeeds;
                    if (i2 >= webCommentFeedArr2.length) {
                        break;
                    }
                    WebCommentFeed webCommentFeed = webCommentFeedArr2[i2];
                    if (webCommentFeed != null) {
                        computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(5, webCommentFeed);
                    }
                    i2++;
                }
            }
            if (!this.commentCursor.equals("")) {
                computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(6, this.commentCursor);
            }
            WebComboCommentFeed[] webComboCommentFeedArr = this.comboCommentFeed;
            if (webComboCommentFeedArr != null && webComboCommentFeedArr.length > 0) {
                int i3 = 0;
                while (true) {
                    WebComboCommentFeed[] webComboCommentFeedArr2 = this.comboCommentFeed;
                    if (i3 >= webComboCommentFeedArr2.length) {
                        break;
                    }
                    WebComboCommentFeed webComboCommentFeed = webComboCommentFeedArr2[i3];
                    if (webComboCommentFeed != null) {
                        computeSerializedSize = CodedOutputByteBufferNano.computeMessageSize(7, webComboCommentFeed) + computeSerializedSize;
                    }
                    i3++;
                }
            }
            WebLikeFeed[] webLikeFeedArr = this.likeFeeds;
            if (webLikeFeedArr != null && webLikeFeedArr.length > 0) {
                int i4 = 0;
                while (true) {
                    WebLikeFeed[] webLikeFeedArr2 = this.likeFeeds;
                    if (i4 >= webLikeFeedArr2.length) {
                        break;
                    }
                    WebLikeFeed webLikeFeed = webLikeFeedArr2[i4];
                    if (webLikeFeed != null) {
                        computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(8, webLikeFeed);
                    }
                    i4++;
                }
            }
            WebGiftFeed[] webGiftFeedArr = this.giftFeeds;
            if (webGiftFeedArr != null && webGiftFeedArr.length > 0) {
                int i5 = 0;
                while (true) {
                    WebGiftFeed[] webGiftFeedArr2 = this.giftFeeds;
                    if (i5 >= webGiftFeedArr2.length) {
                        break;
                    }
                    WebGiftFeed webGiftFeed = webGiftFeedArr2[i5];
                    if (webGiftFeed != null) {
                        computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(9, webGiftFeed);
                    }
                    i5++;
                }
            }
            if (!this.giftCursor.equals("")) {
                computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(10, this.giftCursor);
            }
            WebSystemNoticeFeed[] webSystemNoticeFeedArr = this.systemNoticeFeeds;
            if (webSystemNoticeFeedArr != null && webSystemNoticeFeedArr.length > 0) {
                int i6 = 0;
                while (true) {
                    WebSystemNoticeFeed[] webSystemNoticeFeedArr2 = this.systemNoticeFeeds;
                    if (i6 >= webSystemNoticeFeedArr2.length) {
                        break;
                    }
                    WebSystemNoticeFeed webSystemNoticeFeed = webSystemNoticeFeedArr2[i6];
                    if (webSystemNoticeFeed != null) {
                        computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(11, webSystemNoticeFeed);
                    }
                    i6++;
                }
            }
            WebShareFeed[] webShareFeedArr = this.shareFeeds;
            if (webShareFeedArr != null && webShareFeedArr.length > 0) {
                while (true) {
                    WebShareFeed[] webShareFeedArr2 = this.shareFeeds;
                    if (i >= webShareFeedArr2.length) {
                        break;
                    }
                    WebShareFeed webShareFeed = webShareFeedArr2[i];
                    if (webShareFeed != null) {
                        computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(12, webShareFeed);
                    }
                    i++;
                }
            }
            return computeSerializedSize;
        }

        public static SCWebFeedPush parseFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
            return new SCWebFeedPush().mergeFrom(codedInputByteBufferNano);
        }

        public static SCWebFeedPush parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
            return (SCWebFeedPush) MessageNano.mergeFrom(new SCWebFeedPush(), bArr);
        }

        public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            if (!this.displayWatchingCount.equals("")) {
                codedOutputByteBufferNano.writeString(1, this.displayWatchingCount);
            }
            if (!this.displayLikeCount.equals("")) {
                codedOutputByteBufferNano.writeString(2, this.displayLikeCount);
            }
            long j2 = this.pendingLikeCount;
            if (j2 != 0) {
                codedOutputByteBufferNano.writeUInt64(3, j2);
            }
            long j3 = this.pushInterval;
            if (j3 != 0) {
                codedOutputByteBufferNano.writeUInt64(4, j3);
            }
            WebCommentFeed[] webCommentFeedArr = this.commentFeeds;
            int i = 0;
            if (webCommentFeedArr != null && webCommentFeedArr.length > 0) {
                int i2 = 0;
                while (true) {
                    WebCommentFeed[] webCommentFeedArr2 = this.commentFeeds;
                    if (i2 >= webCommentFeedArr2.length) {
                        break;
                    }
                    WebCommentFeed webCommentFeed = webCommentFeedArr2[i2];
                    if (webCommentFeed != null) {
                        codedOutputByteBufferNano.writeMessage(5, webCommentFeed);
                    }
                    i2++;
                }
            }
            if (!this.commentCursor.equals("")) {
                codedOutputByteBufferNano.writeString(6, this.commentCursor);
            }
            WebComboCommentFeed[] webComboCommentFeedArr = this.comboCommentFeed;
            if (webComboCommentFeedArr != null && webComboCommentFeedArr.length > 0) {
                int i3 = 0;
                while (true) {
                    WebComboCommentFeed[] webComboCommentFeedArr2 = this.comboCommentFeed;
                    if (i3 >= webComboCommentFeedArr2.length) {
                        break;
                    }
                    WebComboCommentFeed webComboCommentFeed = webComboCommentFeedArr2[i3];
                    if (webComboCommentFeed != null) {
                        codedOutputByteBufferNano.writeMessage(7, webComboCommentFeed);
                    }
                    i3++;
                }
            }
            WebLikeFeed[] webLikeFeedArr = this.likeFeeds;
            if (webLikeFeedArr != null && webLikeFeedArr.length > 0) {
                int i4 = 0;
                while (true) {
                    WebLikeFeed[] webLikeFeedArr2 = this.likeFeeds;
                    if (i4 >= webLikeFeedArr2.length) {
                        break;
                    }
                    WebLikeFeed webLikeFeed = webLikeFeedArr2[i4];
                    if (webLikeFeed != null) {
                        codedOutputByteBufferNano.writeMessage(8, webLikeFeed);
                    }
                    i4++;
                }
            }
            WebGiftFeed[] webGiftFeedArr = this.giftFeeds;
            if (webGiftFeedArr != null && webGiftFeedArr.length > 0) {
                int i5 = 0;
                while (true) {
                    WebGiftFeed[] webGiftFeedArr2 = this.giftFeeds;
                    if (i5 >= webGiftFeedArr2.length) {
                        break;
                    }
                    WebGiftFeed webGiftFeed = webGiftFeedArr2[i5];
                    if (webGiftFeed != null) {
                        codedOutputByteBufferNano.writeMessage(9, webGiftFeed);
                    }
                    i5++;
                }
            }
            if (!this.giftCursor.equals("")) {
                codedOutputByteBufferNano.writeString(10, this.giftCursor);
            }
            WebSystemNoticeFeed[] webSystemNoticeFeedArr = this.systemNoticeFeeds;
            if (webSystemNoticeFeedArr != null && webSystemNoticeFeedArr.length > 0) {
                int i6 = 0;
                while (true) {
                    WebSystemNoticeFeed[] webSystemNoticeFeedArr2 = this.systemNoticeFeeds;
                    if (i6 >= webSystemNoticeFeedArr2.length) {
                        break;
                    }
                    WebSystemNoticeFeed webSystemNoticeFeed = webSystemNoticeFeedArr2[i6];
                    if (webSystemNoticeFeed != null) {
                        codedOutputByteBufferNano.writeMessage(11, webSystemNoticeFeed);
                    }
                    i6++;
                }
            }
            WebShareFeed[] webShareFeedArr = this.shareFeeds;
            if (webShareFeedArr != null && webShareFeedArr.length > 0) {
                while (true) {
                    WebShareFeed[] webShareFeedArr2 = this.shareFeeds;
                    if (i >= webShareFeedArr2.length) {
                        break;
                    }
                    WebShareFeed webShareFeed = webShareFeedArr2[i];
                    if (webShareFeed != null) {
                        codedOutputByteBufferNano.writeMessage(12, webShareFeed);
                    }
                    i++;
                }
            }
            super.writeTo(codedOutputByteBufferNano);
        }

        public SCWebFeedPush mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
            int i;
            int i2;
            int i3;
            int i4;
            int i5;
            int i6;
            while (true) {
                int readTag = codedInputByteBufferNano.readTag();
                switch (readTag) {
                    case 0:
                        return this;
                    case 10:
                        this.displayWatchingCount = codedInputByteBufferNano.readString();
                        break;
                    case 18:
                        this.displayLikeCount = codedInputByteBufferNano.readString();
                        break;
                    case 24:
                        this.pendingLikeCount = codedInputByteBufferNano.readUInt64();
                        break;
                    case 32:
                        this.pushInterval = codedInputByteBufferNano.readUInt64();
                        break;
                    case 42:
                        int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 42);
                        WebCommentFeed[] webCommentFeedArr = this.commentFeeds;
                        if (webCommentFeedArr == null) {
                            i = 0;
                        } else {
                            i = webCommentFeedArr.length;
                        }
                        int i7 = repeatedFieldArrayLength + i;
                        WebCommentFeed[] webCommentFeedArr2 = new WebCommentFeed[i7];
                        if (i != 0) {
                            System.arraycopy(this.commentFeeds, 0, webCommentFeedArr2, 0, i);
                        }
                        while (i < i7 - 1) {
                            webCommentFeedArr2[i] = new WebCommentFeed();
                            codedInputByteBufferNano.readMessage(webCommentFeedArr2[i]);
                            codedInputByteBufferNano.readTag();
                            i++;
                        }
                        webCommentFeedArr2[i] = new WebCommentFeed();
                        codedInputByteBufferNano.readMessage(webCommentFeedArr2[i]);
                        this.commentFeeds = webCommentFeedArr2;
                        break;
                    case 50:
                        this.commentCursor = codedInputByteBufferNano.readString();
                        break;
                    case 58:
                        int repeatedFieldArrayLength2 = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 58);
                        WebComboCommentFeed[] webComboCommentFeedArr = this.comboCommentFeed;
                        if (webComboCommentFeedArr == null) {
                            i2 = 0;
                        } else {
                            i2 = webComboCommentFeedArr.length;
                        }
                        int i8 = repeatedFieldArrayLength2 + i2;
                        WebComboCommentFeed[] webComboCommentFeedArr2 = new WebComboCommentFeed[i8];
                        if (i2 != 0) {
                            System.arraycopy(this.comboCommentFeed, 0, webComboCommentFeedArr2, 0, i2);
                        }
                        while (i2 < i8 - 1) {
                            webComboCommentFeedArr2[i2] = new WebComboCommentFeed();
                            codedInputByteBufferNano.readMessage(webComboCommentFeedArr2[i2]);
                            codedInputByteBufferNano.readTag();
                            i2++;
                        }
                        webComboCommentFeedArr2[i2] = new WebComboCommentFeed();
                        codedInputByteBufferNano.readMessage(webComboCommentFeedArr2[i2]);
                        this.comboCommentFeed = webComboCommentFeedArr2;
                        break;
                    case 66:
                        int repeatedFieldArrayLength3 = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 66);
                        WebLikeFeed[] webLikeFeedArr = this.likeFeeds;
                        if (webLikeFeedArr == null) {
                            i3 = 0;
                        } else {
                            i3 = webLikeFeedArr.length;
                        }
                        int i9 = repeatedFieldArrayLength3 + i3;
                        WebLikeFeed[] webLikeFeedArr2 = new WebLikeFeed[i9];
                        if (i3 != 0) {
                            System.arraycopy(this.likeFeeds, 0, webLikeFeedArr2, 0, i3);
                        }
                        while (i3 < i9 - 1) {
                            webLikeFeedArr2[i3] = new WebLikeFeed();
                            codedInputByteBufferNano.readMessage(webLikeFeedArr2[i3]);
                            codedInputByteBufferNano.readTag();
                            i3++;
                        }
                        webLikeFeedArr2[i3] = new WebLikeFeed();
                        codedInputByteBufferNano.readMessage(webLikeFeedArr2[i3]);
                        this.likeFeeds = webLikeFeedArr2;
                        break;
                    case 74:
                        int repeatedFieldArrayLength4 = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 74);
                        WebGiftFeed[] webGiftFeedArr = this.giftFeeds;
                        if (webGiftFeedArr == null) {
                            i4 = 0;
                        } else {
                            i4 = webGiftFeedArr.length;
                        }
                        int i10 = repeatedFieldArrayLength4 + i4;
                        WebGiftFeed[] webGiftFeedArr2 = new WebGiftFeed[i10];
                        if (i4 != 0) {
                            System.arraycopy(this.giftFeeds, 0, webGiftFeedArr2, 0, i4);
                        }
                        while (i4 < i10 - 1) {
                            webGiftFeedArr2[i4] = new WebGiftFeed();
                            codedInputByteBufferNano.readMessage(webGiftFeedArr2[i4]);
                            codedInputByteBufferNano.readTag();
                            i4++;
                        }
                        webGiftFeedArr2[i4] = new WebGiftFeed();
                        codedInputByteBufferNano.readMessage(webGiftFeedArr2[i4]);
                        this.giftFeeds = webGiftFeedArr2;
                        break;
                    case 82:
                        this.giftCursor = codedInputByteBufferNano.readString();
                        break;
                    case 90:
                        int repeatedFieldArrayLength5 = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 90);
                        WebSystemNoticeFeed[] webSystemNoticeFeedArr = this.systemNoticeFeeds;
                        if (webSystemNoticeFeedArr == null) {
                            i5 = 0;
                        } else {
                            i5 = webSystemNoticeFeedArr.length;
                        }
                        int i11 = repeatedFieldArrayLength5 + i5;
                        WebSystemNoticeFeed[] webSystemNoticeFeedArr2 = new WebSystemNoticeFeed[i11];
                        if (i5 != 0) {
                            System.arraycopy(this.systemNoticeFeeds, 0, webSystemNoticeFeedArr2, 0, i5);
                        }
                        while (i5 < i11 - 1) {
                            webSystemNoticeFeedArr2[i5] = new WebSystemNoticeFeed();
                            codedInputByteBufferNano.readMessage(webSystemNoticeFeedArr2[i5]);
                            codedInputByteBufferNano.readTag();
                            i5++;
                        }
                        webSystemNoticeFeedArr2[i5] = new WebSystemNoticeFeed();
                        codedInputByteBufferNano.readMessage(webSystemNoticeFeedArr2[i5]);
                        this.systemNoticeFeeds = webSystemNoticeFeedArr2;
                        break;
                    case 98:
                        int repeatedFieldArrayLength6 = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 98);
                        WebShareFeed[] webShareFeedArr = this.shareFeeds;
                        if (webShareFeedArr == null) {
                            i6 = 0;
                        } else {
                            i6 = webShareFeedArr.length;
                        }
                        int i12 = repeatedFieldArrayLength6 + i6;
                        WebShareFeed[] webShareFeedArr2 = new WebShareFeed[i12];
                        if (i6 != 0) {
                            System.arraycopy(this.shareFeeds, 0, webShareFeedArr2, 0, i6);
                        }
                        while (i6 < i12 - 1) {
                            webShareFeedArr2[i6] = new WebShareFeed();
                            codedInputByteBufferNano.readMessage(webShareFeedArr2[i6]);
                            codedInputByteBufferNano.readTag();
                            i6++;
                        }
                        webShareFeedArr2[i6] = new WebShareFeed();
                        codedInputByteBufferNano.readMessage(webShareFeedArr2[i6]);
                        this.shareFeeds = webShareFeedArr2;
                        break;
                    default:
                        if (WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                            break;
                        } else {
                            return this;
                        }
                }
            }
        }
    }

    /* compiled from: kSourceFile */
    public static final class SCWebGuessClosed extends MessageNano {
        public static volatile SCWebGuessClosed[] _emptyArray;
        public long displayMaxDelayMillis;
        public String guessId;
        public long time;

        public SCWebGuessClosed() {
            clear();
        }

        public static SCWebGuessClosed[] emptyArray() {
            if (_emptyArray == null) {
                synchronized (InternalNano.LAZY_INIT_LOCK) {
                    if (_emptyArray == null) {
                        _emptyArray = new SCWebGuessClosed[0];
                    }
                }
            }
            return _emptyArray;
        }

        public SCWebGuessClosed clear() {
            this.time = 0;
            this.guessId = "";
            this.displayMaxDelayMillis = 0;
            this.cachedSize = -1;
            return this;
        }

        public int computeSerializedSize() {
            int computeSerializedSize = super.computeSerializedSize();
            long j2 = this.time;
            if (j2 != 0) {
                computeSerializedSize += CodedOutputByteBufferNano.computeUInt64Size(1, j2);
            }
            if (!this.guessId.equals("")) {
                computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(2, this.guessId);
            }
            long j3 = this.displayMaxDelayMillis;
            if (j3 != 0) {
                return computeSerializedSize + CodedOutputByteBufferNano.computeUInt64Size(3, j3);
            }
            return computeSerializedSize;
        }

        public static SCWebGuessClosed parseFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
            return new SCWebGuessClosed().mergeFrom(codedInputByteBufferNano);
        }

        public static SCWebGuessClosed parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
            return (SCWebGuessClosed) MessageNano.mergeFrom(new SCWebGuessClosed(), bArr);
        }

        public SCWebGuessClosed mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
            while (true) {
                int readTag = codedInputByteBufferNano.readTag();
                if (readTag == 0) {
                    return this;
                }
                if (readTag == 8) {
                    this.time = codedInputByteBufferNano.readUInt64();
                } else if (readTag == 18) {
                    this.guessId = codedInputByteBufferNano.readString();
                } else if (readTag == 24) {
                    this.displayMaxDelayMillis = codedInputByteBufferNano.readUInt64();
                } else if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    return this;
                }
            }
        }

        public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            long j2 = this.time;
            if (j2 != 0) {
                codedOutputByteBufferNano.writeUInt64(1, j2);
            }
            if (!this.guessId.equals("")) {
                codedOutputByteBufferNano.writeString(2, this.guessId);
            }
            long j3 = this.displayMaxDelayMillis;
            if (j3 != 0) {
                codedOutputByteBufferNano.writeUInt64(3, j3);
            }
            super.writeTo(codedOutputByteBufferNano);
        }
    }

    /* compiled from: kSourceFile */
    public static final class SCWebGuessOpened extends MessageNano {
        public static volatile SCWebGuessOpened[] _emptyArray;
        public long displayMaxDelayMillis;
        public String guessId;
        public long submitDeadline;
        public long time;

        public SCWebGuessOpened() {
            clear();
        }

        public static SCWebGuessOpened[] emptyArray() {
            if (_emptyArray == null) {
                synchronized (InternalNano.LAZY_INIT_LOCK) {
                    if (_emptyArray == null) {
                        _emptyArray = new SCWebGuessOpened[0];
                    }
                }
            }
            return _emptyArray;
        }

        public SCWebGuessOpened clear() {
            this.time = 0;
            this.guessId = "";
            this.submitDeadline = 0;
            this.displayMaxDelayMillis = 0;
            this.cachedSize = -1;
            return this;
        }

        public int computeSerializedSize() {
            int computeSerializedSize = super.computeSerializedSize();
            long j2 = this.time;
            if (j2 != 0) {
                computeSerializedSize += CodedOutputByteBufferNano.computeUInt64Size(1, j2);
            }
            if (!this.guessId.equals("")) {
                computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(2, this.guessId);
            }
            long j3 = this.submitDeadline;
            if (j3 != 0) {
                computeSerializedSize += CodedOutputByteBufferNano.computeUInt64Size(3, j3);
            }
            long j4 = this.displayMaxDelayMillis;
            if (j4 != 0) {
                return computeSerializedSize + CodedOutputByteBufferNano.computeUInt64Size(4, j4);
            }
            return computeSerializedSize;
        }

        public static SCWebGuessOpened parseFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
            return new SCWebGuessOpened().mergeFrom(codedInputByteBufferNano);
        }

        public static SCWebGuessOpened parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
            return (SCWebGuessOpened) MessageNano.mergeFrom(new SCWebGuessOpened(), bArr);
        }

        public SCWebGuessOpened mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
            while (true) {
                int readTag = codedInputByteBufferNano.readTag();
                if (readTag == 0) {
                    return this;
                }
                if (readTag == 8) {
                    this.time = codedInputByteBufferNano.readUInt64();
                } else if (readTag == 18) {
                    this.guessId = codedInputByteBufferNano.readString();
                } else if (readTag == 24) {
                    this.submitDeadline = codedInputByteBufferNano.readUInt64();
                } else if (readTag == 32) {
                    this.displayMaxDelayMillis = codedInputByteBufferNano.readUInt64();
                } else if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    return this;
                }
            }
        }

        public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            long j2 = this.time;
            if (j2 != 0) {
                codedOutputByteBufferNano.writeUInt64(1, j2);
            }
            if (!this.guessId.equals("")) {
                codedOutputByteBufferNano.writeString(2, this.guessId);
            }
            long j3 = this.submitDeadline;
            if (j3 != 0) {
                codedOutputByteBufferNano.writeUInt64(3, j3);
            }
            long j4 = this.displayMaxDelayMillis;
            if (j4 != 0) {
                codedOutputByteBufferNano.writeUInt64(4, j4);
            }
            super.writeTo(codedOutputByteBufferNano);
        }
    }

    /* compiled from: kSourceFile */
    public static final class SCWebHeartbeatAck extends MessageNano {
        public static volatile SCWebHeartbeatAck[] _emptyArray;
        public long clientTimestamp;
        public long timestamp;

        public SCWebHeartbeatAck() {
            clear();
        }

        public static SCWebHeartbeatAck[] emptyArray() {
            if (_emptyArray == null) {
                synchronized (InternalNano.LAZY_INIT_LOCK) {
                    if (_emptyArray == null) {
                        _emptyArray = new SCWebHeartbeatAck[0];
                    }
                }
            }
            return _emptyArray;
        }

        public SCWebHeartbeatAck clear() {
            this.timestamp = 0;
            this.clientTimestamp = 0;
            this.cachedSize = -1;
            return this;
        }

        public int computeSerializedSize() {
            int computeSerializedSize = super.computeSerializedSize();
            long j2 = this.timestamp;
            if (j2 != 0) {
                computeSerializedSize += CodedOutputByteBufferNano.computeUInt64Size(1, j2);
            }
            long j3 = this.clientTimestamp;
            if (j3 != 0) {
                return computeSerializedSize + CodedOutputByteBufferNano.computeUInt64Size(2, j3);
            }
            return computeSerializedSize;
        }

        public static SCWebHeartbeatAck parseFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
            return new SCWebHeartbeatAck().mergeFrom(codedInputByteBufferNano);
        }

        public static SCWebHeartbeatAck parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
            return (SCWebHeartbeatAck) MessageNano.mergeFrom(new SCWebHeartbeatAck(), bArr);
        }

        public SCWebHeartbeatAck mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
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

        public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            long j2 = this.timestamp;
            if (j2 != 0) {
                codedOutputByteBufferNano.writeUInt64(1, j2);
            }
            long j3 = this.clientTimestamp;
            if (j3 != 0) {
                codedOutputByteBufferNano.writeUInt64(2, j3);
            }
            super.writeTo(codedOutputByteBufferNano);
        }
    }

    /* compiled from: kSourceFile */
    public static final class SCWebLiveChatCall extends MessageNano {
        public static volatile SCWebLiveChatCall[] _emptyArray;
        public boolean allowVideoChat;

        public SCWebLiveChatCall() {
            clear();
        }

        public static SCWebLiveChatCall[] emptyArray() {
            if (_emptyArray == null) {
                synchronized (InternalNano.LAZY_INIT_LOCK) {
                    if (_emptyArray == null) {
                        _emptyArray = new SCWebLiveChatCall[0];
                    }
                }
            }
            return _emptyArray;
        }

        public SCWebLiveChatCall clear() {
            this.allowVideoChat = false;
            this.cachedSize = -1;
            return this;
        }

        public int computeSerializedSize() {
            int computeSerializedSize = super.computeSerializedSize();
            boolean z = this.allowVideoChat;
            if (z) {
                return computeSerializedSize + CodedOutputByteBufferNano.computeBoolSize(1, z);
            }
            return computeSerializedSize;
        }

        public static SCWebLiveChatCall parseFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
            return new SCWebLiveChatCall().mergeFrom(codedInputByteBufferNano);
        }

        public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            boolean z = this.allowVideoChat;
            if (z) {
                codedOutputByteBufferNano.writeBool(1, z);
            }
            super.writeTo(codedOutputByteBufferNano);
        }

        public static SCWebLiveChatCall parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
            return (SCWebLiveChatCall) MessageNano.mergeFrom(new SCWebLiveChatCall(), bArr);
        }

        public SCWebLiveChatCall mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
            while (true) {
                int readTag = codedInputByteBufferNano.readTag();
                if (readTag == 0) {
                    return this;
                }
                if (readTag == 8) {
                    this.allowVideoChat = codedInputByteBufferNano.readBool();
                } else if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    return this;
                }
            }
        }
    }

    /* compiled from: kSourceFile */
    public static final class SCWebLiveChatCallAccepted extends MessageNano {
        public static volatile SCWebLiveChatCallAccepted[] _emptyArray;
        public long guestUserId;
        public int liveChatRoomId;
        public int mediaType;
        public String sGuestUserId;

        public SCWebLiveChatCallAccepted() {
            clear();
        }

        public static SCWebLiveChatCallAccepted[] emptyArray() {
            if (_emptyArray == null) {
                synchronized (InternalNano.LAZY_INIT_LOCK) {
                    if (_emptyArray == null) {
                        _emptyArray = new SCWebLiveChatCallAccepted[0];
                    }
                }
            }
            return _emptyArray;
        }

        public SCWebLiveChatCallAccepted clear() {
            this.liveChatRoomId = 0;
            this.guestUserId = 0;
            this.mediaType = 0;
            this.sGuestUserId = "";
            this.cachedSize = -1;
            return this;
        }

        public int computeSerializedSize() {
            int computeSerializedSize = super.computeSerializedSize();
            int i = this.liveChatRoomId;
            if (i != 0) {
                computeSerializedSize += CodedOutputByteBufferNano.computeUInt32Size(1, i);
            }
            long j2 = this.guestUserId;
            if (j2 != 0) {
                computeSerializedSize += CodedOutputByteBufferNano.computeUInt64Size(2, j2);
            }
            int i2 = this.mediaType;
            if (i2 != 0) {
                computeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(3, i2);
            }
            if (!this.sGuestUserId.equals("")) {
                return computeSerializedSize + CodedOutputByteBufferNano.computeStringSize(4, this.sGuestUserId);
            }
            return computeSerializedSize;
        }

        public static SCWebLiveChatCallAccepted parseFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
            return new SCWebLiveChatCallAccepted().mergeFrom(codedInputByteBufferNano);
        }

        public static SCWebLiveChatCallAccepted parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
            return (SCWebLiveChatCallAccepted) MessageNano.mergeFrom(new SCWebLiveChatCallAccepted(), bArr);
        }

        public SCWebLiveChatCallAccepted mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
            while (true) {
                int readTag = codedInputByteBufferNano.readTag();
                if (readTag == 0) {
                    return this;
                }
                if (readTag == 8) {
                    this.liveChatRoomId = codedInputByteBufferNano.readUInt32();
                } else if (readTag == 16) {
                    this.guestUserId = codedInputByteBufferNano.readUInt64();
                } else if (readTag == 24) {
                    int readInt32 = codedInputByteBufferNano.readInt32();
                    if (readInt32 == 0 || readInt32 == 1 || readInt32 == 2) {
                        this.mediaType = readInt32;
                    }
                } else if (readTag == 34) {
                    this.sGuestUserId = codedInputByteBufferNano.readString();
                } else if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    return this;
                }
            }
        }

        public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            int i = this.liveChatRoomId;
            if (i != 0) {
                codedOutputByteBufferNano.writeUInt32(1, i);
            }
            long j2 = this.guestUserId;
            if (j2 != 0) {
                codedOutputByteBufferNano.writeUInt64(2, j2);
            }
            int i2 = this.mediaType;
            if (i2 != 0) {
                codedOutputByteBufferNano.writeInt32(3, i2);
            }
            if (!this.sGuestUserId.equals("")) {
                codedOutputByteBufferNano.writeString(4, this.sGuestUserId);
            }
            super.writeTo(codedOutputByteBufferNano);
        }
    }

    /* compiled from: kSourceFile */
    public static final class SCWebLiveChatCallRejected extends MessageNano {
        public static volatile SCWebLiveChatCallRejected[] _emptyArray;
        public long guestUserId;
        public int liveChatRoomId;
        public int rejectReason;
        public String sGuestUserId;

        public SCWebLiveChatCallRejected() {
            clear();
        }

        public static SCWebLiveChatCallRejected[] emptyArray() {
            if (_emptyArray == null) {
                synchronized (InternalNano.LAZY_INIT_LOCK) {
                    if (_emptyArray == null) {
                        _emptyArray = new SCWebLiveChatCallRejected[0];
                    }
                }
            }
            return _emptyArray;
        }

        public SCWebLiveChatCallRejected clear() {
            this.liveChatRoomId = 0;
            this.guestUserId = 0;
            this.sGuestUserId = "";
            this.rejectReason = 0;
            this.cachedSize = -1;
            return this;
        }

        public int computeSerializedSize() {
            int computeSerializedSize = super.computeSerializedSize();
            int i = this.liveChatRoomId;
            if (i != 0) {
                computeSerializedSize += CodedOutputByteBufferNano.computeUInt32Size(1, i);
            }
            long j2 = this.guestUserId;
            if (j2 != 0) {
                computeSerializedSize += CodedOutputByteBufferNano.computeUInt64Size(2, j2);
            }
            if (!this.sGuestUserId.equals("")) {
                computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(3, this.sGuestUserId);
            }
            int i2 = this.rejectReason;
            if (i2 != 0) {
                return computeSerializedSize + CodedOutputByteBufferNano.computeInt32Size(4, i2);
            }
            return computeSerializedSize;
        }

        public static SCWebLiveChatCallRejected parseFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
            return new SCWebLiveChatCallRejected().mergeFrom(codedInputByteBufferNano);
        }

        public static SCWebLiveChatCallRejected parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
            return (SCWebLiveChatCallRejected) MessageNano.mergeFrom(new SCWebLiveChatCallRejected(), bArr);
        }

        public SCWebLiveChatCallRejected mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
            while (true) {
                int readTag = codedInputByteBufferNano.readTag();
                if (readTag == 0) {
                    return this;
                }
                if (readTag == 8) {
                    this.liveChatRoomId = codedInputByteBufferNano.readUInt32();
                } else if (readTag == 16) {
                    this.guestUserId = codedInputByteBufferNano.readUInt64();
                } else if (readTag == 26) {
                    this.sGuestUserId = codedInputByteBufferNano.readString();
                } else if (readTag == 32) {
                    int readInt32 = codedInputByteBufferNano.readInt32();
                    if (readInt32 == 0 || readInt32 == 1 || readInt32 == 2 || readInt32 == 3) {
                        this.rejectReason = readInt32;
                    }
                } else if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    return this;
                }
            }
        }

        public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            int i = this.liveChatRoomId;
            if (i != 0) {
                codedOutputByteBufferNano.writeUInt32(1, i);
            }
            long j2 = this.guestUserId;
            if (j2 != 0) {
                codedOutputByteBufferNano.writeUInt64(2, j2);
            }
            if (!this.sGuestUserId.equals("")) {
                codedOutputByteBufferNano.writeString(3, this.sGuestUserId);
            }
            int i2 = this.rejectReason;
            if (i2 != 0) {
                codedOutputByteBufferNano.writeInt32(4, i2);
            }
            super.writeTo(codedOutputByteBufferNano);
        }
    }

    /* compiled from: kSourceFile */
    public static final class SCWebLiveChatEnded extends MessageNano {
        public static volatile SCWebLiveChatEnded[] _emptyArray;

        public SCWebLiveChatEnded clear() {
            this.cachedSize = -1;
            return this;
        }

        public SCWebLiveChatEnded() {
            clear();
        }

        public static SCWebLiveChatEnded[] emptyArray() {
            if (_emptyArray == null) {
                synchronized (InternalNano.LAZY_INIT_LOCK) {
                    if (_emptyArray == null) {
                        _emptyArray = new SCWebLiveChatEnded[0];
                    }
                }
            }
            return _emptyArray;
        }

        public static SCWebLiveChatEnded parseFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
            return new SCWebLiveChatEnded().mergeFrom(codedInputByteBufferNano);
        }

        public static SCWebLiveChatEnded parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
            return (SCWebLiveChatEnded) MessageNano.mergeFrom(new SCWebLiveChatEnded(), bArr);
        }

        /*  JADX ERROR: StackOverflow in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: 
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
            	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
            */
        public SCWebLiveChatEnded mergeFrom(CodedInputByteBufferNano r2) throws IOException {
            /*
                r1 = this;
            L_0x0000:
                int r0 = r2.readTag()
                if (r0 == 0) goto L_0x000c
                boolean r0 = com.google.protobuf.nano.WireFormatNano.parseUnknownField(r2, r0)
                if (r0 != 0) goto L_0x0000
            L_0x000c:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: SCWebLiveChatEnded.mergeFrom(com.google.protobuf.nano.CodedInputByteBufferNano):com.kuaishou.livestream.message.nano.LiveStreamWebMessages$SCWebLiveChatEnded");
        }
    }

    /* compiled from: kSourceFile */
    public static final class SCWebLiveChatReady extends MessageNano {
        public static volatile SCWebLiveChatReady[] _emptyArray;
        public SimpleUserInfo author;
        public SimpleUserInfo guestUser;
        public int liveGuestAssistantType;
        public int mediaType;
        public int xOffset;
        public int yOffset;

        public SCWebLiveChatReady() {
            clear();
        }

        public static SCWebLiveChatReady[] emptyArray() {
            if (_emptyArray == null) {
                synchronized (InternalNano.LAZY_INIT_LOCK) {
                    if (_emptyArray == null) {
                        _emptyArray = new SCWebLiveChatReady[0];
                    }
                }
            }
            return _emptyArray;
        }

        public SCWebLiveChatReady clear() {
            this.author = null;
            this.guestUser = null;
            this.mediaType = 0;
            this.xOffset = 0;
            this.yOffset = 0;
            this.liveGuestAssistantType = 0;
            this.cachedSize = -1;
            return this;
        }

        public int computeSerializedSize() {
            int computeSerializedSize = super.computeSerializedSize();
            SimpleUserInfo simpleUserInfo = this.author;
            if (simpleUserInfo != null) {
                computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(1, simpleUserInfo);
            }
            SimpleUserInfo simpleUserInfo2 = this.guestUser;
            if (simpleUserInfo2 != null) {
                computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(2, simpleUserInfo2);
            }
            int i = this.mediaType;
            if (i != 0) {
                computeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(3, i);
            }
            int i2 = this.xOffset;
            if (i2 != 0) {
                computeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(4, i2);
            }
            int i3 = this.yOffset;
            if (i3 != 0) {
                computeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(5, i3);
            }
            int i4 = this.liveGuestAssistantType;
            if (i4 != 0) {
                return computeSerializedSize + CodedOutputByteBufferNano.computeInt32Size(6, i4);
            }
            return computeSerializedSize;
        }

        public static SCWebLiveChatReady parseFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
            return new SCWebLiveChatReady().mergeFrom(codedInputByteBufferNano);
        }

        public static SCWebLiveChatReady parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
            return (SCWebLiveChatReady) MessageNano.mergeFrom(new SCWebLiveChatReady(), bArr);
        }

        public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            SimpleUserInfo simpleUserInfo = this.author;
            if (simpleUserInfo != null) {
                codedOutputByteBufferNano.writeMessage(1, simpleUserInfo);
            }
            SimpleUserInfo simpleUserInfo2 = this.guestUser;
            if (simpleUserInfo2 != null) {
                codedOutputByteBufferNano.writeMessage(2, simpleUserInfo2);
            }
            int i = this.mediaType;
            if (i != 0) {
                codedOutputByteBufferNano.writeInt32(3, i);
            }
            int i2 = this.xOffset;
            if (i2 != 0) {
                codedOutputByteBufferNano.writeInt32(4, i2);
            }
            int i3 = this.yOffset;
            if (i3 != 0) {
                codedOutputByteBufferNano.writeInt32(5, i3);
            }
            int i4 = this.liveGuestAssistantType;
            if (i4 != 0) {
                codedOutputByteBufferNano.writeInt32(6, i4);
            }
            super.writeTo(codedOutputByteBufferNano);
        }

        public SCWebLiveChatReady mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
            while (true) {
                int readTag = codedInputByteBufferNano.readTag();
                if (readTag == 0) {
                    return this;
                }
                if (readTag == 10) {
                    if (this.author == null) {
                        this.author = new SimpleUserInfo();
                    }
                    codedInputByteBufferNano.readMessage(this.author);
                } else if (readTag == 18) {
                    if (this.guestUser == null) {
                        this.guestUser = new SimpleUserInfo();
                    }
                    codedInputByteBufferNano.readMessage(this.guestUser);
                } else if (readTag == 24) {
                    int readInt32 = codedInputByteBufferNano.readInt32();
                    if (readInt32 == 0 || readInt32 == 1 || readInt32 == 2) {
                        this.mediaType = readInt32;
                    }
                } else if (readTag == 32) {
                    this.xOffset = codedInputByteBufferNano.readInt32();
                } else if (readTag == 40) {
                    this.yOffset = codedInputByteBufferNano.readInt32();
                } else if (readTag == 48) {
                    int readInt322 = codedInputByteBufferNano.readInt32();
                    if (readInt322 == 0 || readInt322 == 1 || readInt322 == 2) {
                        this.liveGuestAssistantType = readInt322;
                    }
                } else if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    return this;
                }
            }
        }
    }

    /* compiled from: kSourceFile */
    public static final class SCWebLiveShareRedPackAuthorPublish extends MessageNano {
        public static volatile SCWebLiveShareRedPackAuthorPublish[] _emptyArray;
        public long duration;
        public String liveStreamId;
        public SimpleUserInfo senderInfo;
        public String shareRedPackId;
        public long startTime;

        public SCWebLiveShareRedPackAuthorPublish() {
            clear();
        }

        public static SCWebLiveShareRedPackAuthorPublish[] emptyArray() {
            if (_emptyArray == null) {
                synchronized (InternalNano.LAZY_INIT_LOCK) {
                    if (_emptyArray == null) {
                        _emptyArray = new SCWebLiveShareRedPackAuthorPublish[0];
                    }
                }
            }
            return _emptyArray;
        }

        public SCWebLiveShareRedPackAuthorPublish clear() {
            this.liveStreamId = "";
            this.shareRedPackId = "";
            this.startTime = 0;
            this.duration = 0;
            this.senderInfo = null;
            this.cachedSize = -1;
            return this;
        }

        public int computeSerializedSize() {
            int computeSerializedSize = super.computeSerializedSize();
            if (!this.liveStreamId.equals("")) {
                computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(1, this.liveStreamId);
            }
            if (!this.shareRedPackId.equals("")) {
                computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(2, this.shareRedPackId);
            }
            long j2 = this.startTime;
            if (j2 != 0) {
                computeSerializedSize += CodedOutputByteBufferNano.computeUInt64Size(3, j2);
            }
            long j3 = this.duration;
            if (j3 != 0) {
                computeSerializedSize += CodedOutputByteBufferNano.computeUInt64Size(4, j3);
            }
            SimpleUserInfo simpleUserInfo = this.senderInfo;
            if (simpleUserInfo != null) {
                return computeSerializedSize + CodedOutputByteBufferNano.computeMessageSize(5, simpleUserInfo);
            }
            return computeSerializedSize;
        }

        public static SCWebLiveShareRedPackAuthorPublish parseFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
            return new SCWebLiveShareRedPackAuthorPublish().mergeFrom(codedInputByteBufferNano);
        }

        public static SCWebLiveShareRedPackAuthorPublish parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
            return (SCWebLiveShareRedPackAuthorPublish) MessageNano.mergeFrom(new SCWebLiveShareRedPackAuthorPublish(), bArr);
        }

        public SCWebLiveShareRedPackAuthorPublish mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
            while (true) {
                int readTag = codedInputByteBufferNano.readTag();
                if (readTag == 0) {
                    return this;
                }
                if (readTag == 10) {
                    this.liveStreamId = codedInputByteBufferNano.readString();
                } else if (readTag == 18) {
                    this.shareRedPackId = codedInputByteBufferNano.readString();
                } else if (readTag == 24) {
                    this.startTime = codedInputByteBufferNano.readUInt64();
                } else if (readTag == 32) {
                    this.duration = codedInputByteBufferNano.readUInt64();
                } else if (readTag == 42) {
                    if (this.senderInfo == null) {
                        this.senderInfo = new SimpleUserInfo();
                    }
                    codedInputByteBufferNano.readMessage(this.senderInfo);
                } else if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    return this;
                }
            }
        }

        public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            if (!this.liveStreamId.equals("")) {
                codedOutputByteBufferNano.writeString(1, this.liveStreamId);
            }
            if (!this.shareRedPackId.equals("")) {
                codedOutputByteBufferNano.writeString(2, this.shareRedPackId);
            }
            long j2 = this.startTime;
            if (j2 != 0) {
                codedOutputByteBufferNano.writeUInt64(3, j2);
            }
            long j3 = this.duration;
            if (j3 != 0) {
                codedOutputByteBufferNano.writeUInt64(4, j3);
            }
            SimpleUserInfo simpleUserInfo = this.senderInfo;
            if (simpleUserInfo != null) {
                codedOutputByteBufferNano.writeMessage(5, simpleUserInfo);
            }
            super.writeTo(codedOutputByteBufferNano);
        }
    }

    /* compiled from: kSourceFile */
    public static final class SCWebLiveShareRedPackTerminate extends MessageNano {
        public static volatile SCWebLiveShareRedPackTerminate[] _emptyArray;
        public String liveStreamId;
        public long maxDelayTime;
        public String shareRedPackId;

        public SCWebLiveShareRedPackTerminate() {
            clear();
        }

        public static SCWebLiveShareRedPackTerminate[] emptyArray() {
            if (_emptyArray == null) {
                synchronized (InternalNano.LAZY_INIT_LOCK) {
                    if (_emptyArray == null) {
                        _emptyArray = new SCWebLiveShareRedPackTerminate[0];
                    }
                }
            }
            return _emptyArray;
        }

        public SCWebLiveShareRedPackTerminate clear() {
            this.liveStreamId = "";
            this.shareRedPackId = "";
            this.maxDelayTime = 0;
            this.cachedSize = -1;
            return this;
        }

        public int computeSerializedSize() {
            int computeSerializedSize = super.computeSerializedSize();
            if (!this.liveStreamId.equals("")) {
                computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(1, this.liveStreamId);
            }
            if (!this.shareRedPackId.equals("")) {
                computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(2, this.shareRedPackId);
            }
            long j2 = this.maxDelayTime;
            if (j2 != 0) {
                return computeSerializedSize + CodedOutputByteBufferNano.computeUInt64Size(3, j2);
            }
            return computeSerializedSize;
        }

        public static SCWebLiveShareRedPackTerminate parseFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
            return new SCWebLiveShareRedPackTerminate().mergeFrom(codedInputByteBufferNano);
        }

        public static SCWebLiveShareRedPackTerminate parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
            return (SCWebLiveShareRedPackTerminate) MessageNano.mergeFrom(new SCWebLiveShareRedPackTerminate(), bArr);
        }

        public SCWebLiveShareRedPackTerminate mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
            while (true) {
                int readTag = codedInputByteBufferNano.readTag();
                if (readTag == 0) {
                    return this;
                }
                if (readTag == 10) {
                    this.liveStreamId = codedInputByteBufferNano.readString();
                } else if (readTag == 18) {
                    this.shareRedPackId = codedInputByteBufferNano.readString();
                } else if (readTag == 24) {
                    this.maxDelayTime = codedInputByteBufferNano.readUInt64();
                } else if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    return this;
                }
            }
        }

        public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            if (!this.liveStreamId.equals("")) {
                codedOutputByteBufferNano.writeString(1, this.liveStreamId);
            }
            if (!this.shareRedPackId.equals("")) {
                codedOutputByteBufferNano.writeString(2, this.shareRedPackId);
            }
            long j2 = this.maxDelayTime;
            if (j2 != 0) {
                codedOutputByteBufferNano.writeUInt64(3, j2);
            }
            super.writeTo(codedOutputByteBufferNano);
        }
    }

    /* compiled from: kSourceFile */
    public static final class SCWebLiveSpecialAccountConfigState extends MessageNano {
        public static volatile SCWebLiveSpecialAccountConfigState[] _emptyArray;
        public LiveSpecialAccountConfigProto.ConfigSwitchItem[] configSwitchItem;
        public long timestamp;

        public SCWebLiveSpecialAccountConfigState() {
            clear();
        }

        public static SCWebLiveSpecialAccountConfigState[] emptyArray() {
            if (_emptyArray == null) {
                synchronized (InternalNano.LAZY_INIT_LOCK) {
                    if (_emptyArray == null) {
                        _emptyArray = new SCWebLiveSpecialAccountConfigState[0];
                    }
                }
            }
            return _emptyArray;
        }

        public SCWebLiveSpecialAccountConfigState clear() {
            this.configSwitchItem = LiveSpecialAccountConfigProto.ConfigSwitchItem.emptyArray();
            this.timestamp = 0;
            this.cachedSize = -1;
            return this;
        }

        public int computeSerializedSize() {
            int computeSerializedSize = super.computeSerializedSize();
            LiveSpecialAccountConfigProto.ConfigSwitchItem[] configSwitchItemArr = this.configSwitchItem;
            if (configSwitchItemArr != null && configSwitchItemArr.length > 0) {
                int i = 0;
                while (true) {
                    LiveSpecialAccountConfigProto.ConfigSwitchItem[] configSwitchItemArr2 = this.configSwitchItem;
                    if (i >= configSwitchItemArr2.length) {
                        break;
                    }
                    LiveSpecialAccountConfigProto.ConfigSwitchItem configSwitchItem2 = configSwitchItemArr2[i];
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

        public static SCWebLiveSpecialAccountConfigState parseFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
            return new SCWebLiveSpecialAccountConfigState().mergeFrom(codedInputByteBufferNano);
        }

        public static SCWebLiveSpecialAccountConfigState parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
            return (SCWebLiveSpecialAccountConfigState) MessageNano.mergeFrom(new SCWebLiveSpecialAccountConfigState(), bArr);
        }

        public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            LiveSpecialAccountConfigProto.ConfigSwitchItem[] configSwitchItemArr = this.configSwitchItem;
            if (configSwitchItemArr != null && configSwitchItemArr.length > 0) {
                int i = 0;
                while (true) {
                    LiveSpecialAccountConfigProto.ConfigSwitchItem[] configSwitchItemArr2 = this.configSwitchItem;
                    if (i >= configSwitchItemArr2.length) {
                        break;
                    }
                    LiveSpecialAccountConfigProto.ConfigSwitchItem configSwitchItem2 = configSwitchItemArr2[i];
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

        public SCWebLiveSpecialAccountConfigState mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
            int i;
            while (true) {
                int readTag = codedInputByteBufferNano.readTag();
                if (readTag == 0) {
                    return this;
                }
                if (readTag == 10) {
                    int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 10);
                    LiveSpecialAccountConfigProto.ConfigSwitchItem[] configSwitchItemArr = this.configSwitchItem;
                    if (configSwitchItemArr == null) {
                        i = 0;
                    } else {
                        i = configSwitchItemArr.length;
                    }
                    int i2 = repeatedFieldArrayLength + i;
                    LiveSpecialAccountConfigProto.ConfigSwitchItem[] configSwitchItemArr2 = new LiveSpecialAccountConfigProto.ConfigSwitchItem[i2];
                    if (i != 0) {
                        System.arraycopy(this.configSwitchItem, 0, configSwitchItemArr2, 0, i);
                    }
                    while (i < i2 - 1) {
                        configSwitchItemArr2[i] = new LiveSpecialAccountConfigProto.ConfigSwitchItem();
                        codedInputByteBufferNano.readMessage(configSwitchItemArr2[i]);
                        codedInputByteBufferNano.readTag();
                        i++;
                    }
                    configSwitchItemArr2[i] = new LiveSpecialAccountConfigProto.ConfigSwitchItem();
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

    /* compiled from: kSourceFile */
    public static final class SCWebLiveWatchingUsers extends MessageNano {
        public static volatile SCWebLiveWatchingUsers[] _emptyArray;
        public String displayWatchingCount;
        public long pendingDuration;
        public WebWatchingUserInfo[] watchingUser;

        public SCWebLiveWatchingUsers() {
            clear();
        }

        public static SCWebLiveWatchingUsers[] emptyArray() {
            if (_emptyArray == null) {
                synchronized (InternalNano.LAZY_INIT_LOCK) {
                    if (_emptyArray == null) {
                        _emptyArray = new SCWebLiveWatchingUsers[0];
                    }
                }
            }
            return _emptyArray;
        }

        public SCWebLiveWatchingUsers clear() {
            this.watchingUser = WebWatchingUserInfo.emptyArray();
            this.displayWatchingCount = "";
            this.pendingDuration = 0;
            this.cachedSize = -1;
            return this;
        }

        public int computeSerializedSize() {
            int computeSerializedSize = super.computeSerializedSize();
            WebWatchingUserInfo[] webWatchingUserInfoArr = this.watchingUser;
            if (webWatchingUserInfoArr != null && webWatchingUserInfoArr.length > 0) {
                int i = 0;
                while (true) {
                    WebWatchingUserInfo[] webWatchingUserInfoArr2 = this.watchingUser;
                    if (i >= webWatchingUserInfoArr2.length) {
                        break;
                    }
                    WebWatchingUserInfo webWatchingUserInfo = webWatchingUserInfoArr2[i];
                    if (webWatchingUserInfo != null) {
                        computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(1, webWatchingUserInfo);
                    }
                    i++;
                }
            }
            if (!this.displayWatchingCount.equals("")) {
                computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(2, this.displayWatchingCount);
            }
            long j2 = this.pendingDuration;
            if (j2 != 0) {
                return computeSerializedSize + CodedOutputByteBufferNano.computeUInt64Size(3, j2);
            }
            return computeSerializedSize;
        }

        public static SCWebLiveWatchingUsers parseFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
            return new SCWebLiveWatchingUsers().mergeFrom(codedInputByteBufferNano);
        }

        public static SCWebLiveWatchingUsers parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
            return (SCWebLiveWatchingUsers) MessageNano.mergeFrom(new SCWebLiveWatchingUsers(), bArr);
        }

        public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            WebWatchingUserInfo[] webWatchingUserInfoArr = this.watchingUser;
            if (webWatchingUserInfoArr != null && webWatchingUserInfoArr.length > 0) {
                int i = 0;
                while (true) {
                    WebWatchingUserInfo[] webWatchingUserInfoArr2 = this.watchingUser;
                    if (i >= webWatchingUserInfoArr2.length) {
                        break;
                    }
                    WebWatchingUserInfo webWatchingUserInfo = webWatchingUserInfoArr2[i];
                    if (webWatchingUserInfo != null) {
                        codedOutputByteBufferNano.writeMessage(1, webWatchingUserInfo);
                    }
                    i++;
                }
            }
            if (!this.displayWatchingCount.equals("")) {
                codedOutputByteBufferNano.writeString(2, this.displayWatchingCount);
            }
            long j2 = this.pendingDuration;
            if (j2 != 0) {
                codedOutputByteBufferNano.writeUInt64(3, j2);
            }
            super.writeTo(codedOutputByteBufferNano);
        }

        public SCWebLiveWatchingUsers mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
            int i;
            while (true) {
                int readTag = codedInputByteBufferNano.readTag();
                if (readTag == 0) {
                    return this;
                }
                if (readTag == 10) {
                    int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 10);
                    WebWatchingUserInfo[] webWatchingUserInfoArr = this.watchingUser;
                    if (webWatchingUserInfoArr == null) {
                        i = 0;
                    } else {
                        i = webWatchingUserInfoArr.length;
                    }
                    int i2 = repeatedFieldArrayLength + i;
                    WebWatchingUserInfo[] webWatchingUserInfoArr2 = new WebWatchingUserInfo[i2];
                    if (i != 0) {
                        System.arraycopy(this.watchingUser, 0, webWatchingUserInfoArr2, 0, i);
                    }
                    while (i < i2 - 1) {
                        webWatchingUserInfoArr2[i] = new WebWatchingUserInfo();
                        codedInputByteBufferNano.readMessage(webWatchingUserInfoArr2[i]);
                        codedInputByteBufferNano.readTag();
                        i++;
                    }
                    webWatchingUserInfoArr2[i] = new WebWatchingUserInfo();
                    codedInputByteBufferNano.readMessage(webWatchingUserInfoArr2[i]);
                    this.watchingUser = webWatchingUserInfoArr2;
                } else if (readTag == 18) {
                    this.displayWatchingCount = codedInputByteBufferNano.readString();
                } else if (readTag == 24) {
                    this.pendingDuration = codedInputByteBufferNano.readUInt64();
                } else if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    return this;
                }
            }
        }
    }

    /* compiled from: kSourceFile */
    public static final class SCWebPipEnded extends MessageNano {
        public static volatile SCWebPipEnded[] _emptyArray;
        public long time;

        public SCWebPipEnded() {
            clear();
        }

        public static SCWebPipEnded[] emptyArray() {
            if (_emptyArray == null) {
                synchronized (InternalNano.LAZY_INIT_LOCK) {
                    if (_emptyArray == null) {
                        _emptyArray = new SCWebPipEnded[0];
                    }
                }
            }
            return _emptyArray;
        }

        public SCWebPipEnded clear() {
            this.time = 0;
            this.cachedSize = -1;
            return this;
        }

        public int computeSerializedSize() {
            int computeSerializedSize = super.computeSerializedSize();
            long j2 = this.time;
            if (j2 != 0) {
                return computeSerializedSize + CodedOutputByteBufferNano.computeUInt64Size(1, j2);
            }
            return computeSerializedSize;
        }

        public static SCWebPipEnded parseFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
            return new SCWebPipEnded().mergeFrom(codedInputByteBufferNano);
        }

        public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            long j2 = this.time;
            if (j2 != 0) {
                codedOutputByteBufferNano.writeUInt64(1, j2);
            }
            super.writeTo(codedOutputByteBufferNano);
        }

        public static SCWebPipEnded parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
            return (SCWebPipEnded) MessageNano.mergeFrom(new SCWebPipEnded(), bArr);
        }

        public SCWebPipEnded mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
            while (true) {
                int readTag = codedInputByteBufferNano.readTag();
                if (readTag == 0) {
                    return this;
                }
                if (readTag == 8) {
                    this.time = codedInputByteBufferNano.readUInt64();
                } else if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    return this;
                }
            }
        }
    }

    /* compiled from: kSourceFile */
    public static final class SCWebPipStarted extends MessageNano {
        public static volatile SCWebPipStarted[] _emptyArray;
        public long time;

        public SCWebPipStarted() {
            clear();
        }

        public static SCWebPipStarted[] emptyArray() {
            if (_emptyArray == null) {
                synchronized (InternalNano.LAZY_INIT_LOCK) {
                    if (_emptyArray == null) {
                        _emptyArray = new SCWebPipStarted[0];
                    }
                }
            }
            return _emptyArray;
        }

        public SCWebPipStarted clear() {
            this.time = 0;
            this.cachedSize = -1;
            return this;
        }

        public int computeSerializedSize() {
            int computeSerializedSize = super.computeSerializedSize();
            long j2 = this.time;
            if (j2 != 0) {
                return computeSerializedSize + CodedOutputByteBufferNano.computeUInt64Size(1, j2);
            }
            return computeSerializedSize;
        }

        public static SCWebPipStarted parseFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
            return new SCWebPipStarted().mergeFrom(codedInputByteBufferNano);
        }

        public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            long j2 = this.time;
            if (j2 != 0) {
                codedOutputByteBufferNano.writeUInt64(1, j2);
            }
            super.writeTo(codedOutputByteBufferNano);
        }

        public static SCWebPipStarted parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
            return (SCWebPipStarted) MessageNano.mergeFrom(new SCWebPipStarted(), bArr);
        }

        public SCWebPipStarted mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
            while (true) {
                int readTag = codedInputByteBufferNano.readTag();
                if (readTag == 0) {
                    return this;
                }
                if (readTag == 8) {
                    this.time = codedInputByteBufferNano.readUInt64();
                } else if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    return this;
                }
            }
        }
    }

    /* compiled from: kSourceFile */
    public static final class SCWebPkAbnormalEnd extends MessageNano {
        public static volatile SCWebPkAbnormalEnd[] _emptyArray;
        public String endLiveStreamId;
        public int endType;
        public String pkId;
        public long time;

        public SCWebPkAbnormalEnd() {
            clear();
        }

        public static SCWebPkAbnormalEnd[] emptyArray() {
            if (_emptyArray == null) {
                synchronized (InternalNano.LAZY_INIT_LOCK) {
                    if (_emptyArray == null) {
                        _emptyArray = new SCWebPkAbnormalEnd[0];
                    }
                }
            }
            return _emptyArray;
        }

        public SCWebPkAbnormalEnd clear() {
            this.pkId = "";
            this.time = 0;
            this.endType = 0;
            this.endLiveStreamId = "";
            this.cachedSize = -1;
            return this;
        }

        public int computeSerializedSize() {
            int computeSerializedSize = super.computeSerializedSize();
            if (!this.pkId.equals("")) {
                computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(1, this.pkId);
            }
            long j2 = this.time;
            if (j2 != 0) {
                computeSerializedSize += CodedOutputByteBufferNano.computeUInt64Size(2, j2);
            }
            int i = this.endType;
            if (i != 0) {
                computeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(3, i);
            }
            if (!this.endLiveStreamId.equals("")) {
                return computeSerializedSize + CodedOutputByteBufferNano.computeStringSize(4, this.endLiveStreamId);
            }
            return computeSerializedSize;
        }

        public static SCWebPkAbnormalEnd parseFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
            return new SCWebPkAbnormalEnd().mergeFrom(codedInputByteBufferNano);
        }

        public static SCWebPkAbnormalEnd parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
            return (SCWebPkAbnormalEnd) MessageNano.mergeFrom(new SCWebPkAbnormalEnd(), bArr);
        }

        public SCWebPkAbnormalEnd mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
            while (true) {
                int readTag = codedInputByteBufferNano.readTag();
                if (readTag == 0) {
                    return this;
                }
                if (readTag == 10) {
                    this.pkId = codedInputByteBufferNano.readString();
                } else if (readTag == 16) {
                    this.time = codedInputByteBufferNano.readUInt64();
                } else if (readTag == 24) {
                    int readInt32 = codedInputByteBufferNano.readInt32();
                    if (readInt32 == 0 || readInt32 == 1 || readInt32 == 2 || readInt32 == 3 || readInt32 == 4 || readInt32 == 5) {
                        this.endType = readInt32;
                    }
                } else if (readTag == 34) {
                    this.endLiveStreamId = codedInputByteBufferNano.readString();
                } else if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    return this;
                }
            }
        }

        public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            if (!this.pkId.equals("")) {
                codedOutputByteBufferNano.writeString(1, this.pkId);
            }
            long j2 = this.time;
            if (j2 != 0) {
                codedOutputByteBufferNano.writeUInt64(2, j2);
            }
            int i = this.endType;
            if (i != 0) {
                codedOutputByteBufferNano.writeInt32(3, i);
            }
            if (!this.endLiveStreamId.equals("")) {
                codedOutputByteBufferNano.writeString(4, this.endLiveStreamId);
            }
            super.writeTo(codedOutputByteBufferNano);
        }
    }

    /* compiled from: kSourceFile */
    public static final class SCWebPkLikeMomentStarted extends MessageNano {
        public static volatile SCWebPkLikeMomentStarted[] _emptyArray;
        public long likeMomentDeadline;
        public int likeMomentMultipleWeight;
        public String likeMomentRule;
        public String pkId;
        public long time;

        public SCWebPkLikeMomentStarted() {
            clear();
        }

        public static SCWebPkLikeMomentStarted[] emptyArray() {
            if (_emptyArray == null) {
                synchronized (InternalNano.LAZY_INIT_LOCK) {
                    if (_emptyArray == null) {
                        _emptyArray = new SCWebPkLikeMomentStarted[0];
                    }
                }
            }
            return _emptyArray;
        }

        public SCWebPkLikeMomentStarted clear() {
            this.pkId = "";
            this.time = 0;
            this.likeMomentDeadline = 0;
            this.likeMomentMultipleWeight = 0;
            this.likeMomentRule = "";
            this.cachedSize = -1;
            return this;
        }

        public int computeSerializedSize() {
            int computeSerializedSize = super.computeSerializedSize();
            if (!this.pkId.equals("")) {
                computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(1, this.pkId);
            }
            long j2 = this.time;
            if (j2 != 0) {
                computeSerializedSize += CodedOutputByteBufferNano.computeUInt64Size(2, j2);
            }
            long j3 = this.likeMomentDeadline;
            if (j3 != 0) {
                computeSerializedSize += CodedOutputByteBufferNano.computeUInt64Size(3, j3);
            }
            int i = this.likeMomentMultipleWeight;
            if (i != 0) {
                computeSerializedSize += CodedOutputByteBufferNano.computeUInt32Size(4, i);
            }
            if (!this.likeMomentRule.equals("")) {
                return computeSerializedSize + CodedOutputByteBufferNano.computeStringSize(5, this.likeMomentRule);
            }
            return computeSerializedSize;
        }

        public static SCWebPkLikeMomentStarted parseFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
            return new SCWebPkLikeMomentStarted().mergeFrom(codedInputByteBufferNano);
        }

        public static SCWebPkLikeMomentStarted parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
            return (SCWebPkLikeMomentStarted) MessageNano.mergeFrom(new SCWebPkLikeMomentStarted(), bArr);
        }

        public SCWebPkLikeMomentStarted mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
            while (true) {
                int readTag = codedInputByteBufferNano.readTag();
                if (readTag == 0) {
                    return this;
                }
                if (readTag == 10) {
                    this.pkId = codedInputByteBufferNano.readString();
                } else if (readTag == 16) {
                    this.time = codedInputByteBufferNano.readUInt64();
                } else if (readTag == 24) {
                    this.likeMomentDeadline = codedInputByteBufferNano.readUInt64();
                } else if (readTag == 32) {
                    this.likeMomentMultipleWeight = codedInputByteBufferNano.readUInt32();
                } else if (readTag == 42) {
                    this.likeMomentRule = codedInputByteBufferNano.readString();
                } else if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    return this;
                }
            }
        }

        public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            if (!this.pkId.equals("")) {
                codedOutputByteBufferNano.writeString(1, this.pkId);
            }
            long j2 = this.time;
            if (j2 != 0) {
                codedOutputByteBufferNano.writeUInt64(2, j2);
            }
            long j3 = this.likeMomentDeadline;
            if (j3 != 0) {
                codedOutputByteBufferNano.writeUInt64(3, j3);
            }
            int i = this.likeMomentMultipleWeight;
            if (i != 0) {
                codedOutputByteBufferNano.writeUInt32(4, i);
            }
            if (!this.likeMomentRule.equals("")) {
                codedOutputByteBufferNano.writeString(5, this.likeMomentRule);
            }
            super.writeTo(codedOutputByteBufferNano);
        }
    }

    /* compiled from: kSourceFile */
    public static final class SCWebPkOtherPlayerVoiceClosed extends MessageNano {
        public static volatile SCWebPkOtherPlayerVoiceClosed[] _emptyArray;
        public String pkId;
        public long time;

        public SCWebPkOtherPlayerVoiceClosed() {
            clear();
        }

        public static SCWebPkOtherPlayerVoiceClosed[] emptyArray() {
            if (_emptyArray == null) {
                synchronized (InternalNano.LAZY_INIT_LOCK) {
                    if (_emptyArray == null) {
                        _emptyArray = new SCWebPkOtherPlayerVoiceClosed[0];
                    }
                }
            }
            return _emptyArray;
        }

        public SCWebPkOtherPlayerVoiceClosed clear() {
            this.pkId = "";
            this.time = 0;
            this.cachedSize = -1;
            return this;
        }

        public int computeSerializedSize() {
            int computeSerializedSize = super.computeSerializedSize();
            if (!this.pkId.equals("")) {
                computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(1, this.pkId);
            }
            long j2 = this.time;
            if (j2 != 0) {
                return computeSerializedSize + CodedOutputByteBufferNano.computeUInt64Size(2, j2);
            }
            return computeSerializedSize;
        }

        public static SCWebPkOtherPlayerVoiceClosed parseFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
            return new SCWebPkOtherPlayerVoiceClosed().mergeFrom(codedInputByteBufferNano);
        }

        public static SCWebPkOtherPlayerVoiceClosed parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
            return (SCWebPkOtherPlayerVoiceClosed) MessageNano.mergeFrom(new SCWebPkOtherPlayerVoiceClosed(), bArr);
        }

        public SCWebPkOtherPlayerVoiceClosed mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
            while (true) {
                int readTag = codedInputByteBufferNano.readTag();
                if (readTag == 0) {
                    return this;
                }
                if (readTag == 10) {
                    this.pkId = codedInputByteBufferNano.readString();
                } else if (readTag == 16) {
                    this.time = codedInputByteBufferNano.readUInt64();
                } else if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    return this;
                }
            }
        }

        public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            if (!this.pkId.equals("")) {
                codedOutputByteBufferNano.writeString(1, this.pkId);
            }
            long j2 = this.time;
            if (j2 != 0) {
                codedOutputByteBufferNano.writeUInt64(2, j2);
            }
            super.writeTo(codedOutputByteBufferNano);
        }
    }

    /* compiled from: kSourceFile */
    public static final class SCWebPkOtherPlayerVoiceOpened extends MessageNano {
        public static volatile SCWebPkOtherPlayerVoiceOpened[] _emptyArray;
        public String pkId;
        public long time;

        public SCWebPkOtherPlayerVoiceOpened() {
            clear();
        }

        public static SCWebPkOtherPlayerVoiceOpened[] emptyArray() {
            if (_emptyArray == null) {
                synchronized (InternalNano.LAZY_INIT_LOCK) {
                    if (_emptyArray == null) {
                        _emptyArray = new SCWebPkOtherPlayerVoiceOpened[0];
                    }
                }
            }
            return _emptyArray;
        }

        public SCWebPkOtherPlayerVoiceOpened clear() {
            this.pkId = "";
            this.time = 0;
            this.cachedSize = -1;
            return this;
        }

        public int computeSerializedSize() {
            int computeSerializedSize = super.computeSerializedSize();
            if (!this.pkId.equals("")) {
                computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(1, this.pkId);
            }
            long j2 = this.time;
            if (j2 != 0) {
                return computeSerializedSize + CodedOutputByteBufferNano.computeUInt64Size(2, j2);
            }
            return computeSerializedSize;
        }

        public static SCWebPkOtherPlayerVoiceOpened parseFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
            return new SCWebPkOtherPlayerVoiceOpened().mergeFrom(codedInputByteBufferNano);
        }

        public static SCWebPkOtherPlayerVoiceOpened parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
            return (SCWebPkOtherPlayerVoiceOpened) MessageNano.mergeFrom(new SCWebPkOtherPlayerVoiceOpened(), bArr);
        }

        public SCWebPkOtherPlayerVoiceOpened mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
            while (true) {
                int readTag = codedInputByteBufferNano.readTag();
                if (readTag == 0) {
                    return this;
                }
                if (readTag == 10) {
                    this.pkId = codedInputByteBufferNano.readString();
                } else if (readTag == 16) {
                    this.time = codedInputByteBufferNano.readUInt64();
                } else if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    return this;
                }
            }
        }

        public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            if (!this.pkId.equals("")) {
                codedOutputByteBufferNano.writeString(1, this.pkId);
            }
            long j2 = this.time;
            if (j2 != 0) {
                codedOutputByteBufferNano.writeUInt64(2, j2);
            }
            super.writeTo(codedOutputByteBufferNano);
        }
    }

    /* compiled from: kSourceFile */
    public static final class SCWebPkStatistic extends MessageNano {
        public static volatile SCWebPkStatistic[] _emptyArray;
        public long penaltyDeadline;
        public String pkId;
        public WebPkPlayerStatistic[] playStat;
        public long prePenaltyDeadline;
        public String showType;
        public long startTime;
        public long time;
        public long voteDeadline;
        public boolean voteEnd;
        public long voteEndWaitDeadline;

        public SCWebPkStatistic() {
            clear();
        }

        public static SCWebPkStatistic[] emptyArray() {
            if (_emptyArray == null) {
                synchronized (InternalNano.LAZY_INIT_LOCK) {
                    if (_emptyArray == null) {
                        _emptyArray = new SCWebPkStatistic[0];
                    }
                }
            }
            return _emptyArray;
        }

        public SCWebPkStatistic clear() {
            this.pkId = "";
            this.time = 0;
            this.startTime = 0;
            this.voteDeadline = 0;
            this.playStat = WebPkPlayerStatistic.emptyArray();
            this.voteEnd = false;
            this.voteEndWaitDeadline = 0;
            this.prePenaltyDeadline = 0;
            this.penaltyDeadline = 0;
            this.showType = "";
            this.cachedSize = -1;
            return this;
        }

        public int computeSerializedSize() {
            int computeSerializedSize = super.computeSerializedSize();
            if (!this.pkId.equals("")) {
                computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(1, this.pkId);
            }
            long j2 = this.time;
            if (j2 != 0) {
                computeSerializedSize += CodedOutputByteBufferNano.computeUInt64Size(2, j2);
            }
            long j3 = this.startTime;
            if (j3 != 0) {
                computeSerializedSize += CodedOutputByteBufferNano.computeUInt64Size(3, j3);
            }
            long j4 = this.voteDeadline;
            if (j4 != 0) {
                computeSerializedSize += CodedOutputByteBufferNano.computeUInt64Size(4, j4);
            }
            WebPkPlayerStatistic[] webPkPlayerStatisticArr = this.playStat;
            if (webPkPlayerStatisticArr != null && webPkPlayerStatisticArr.length > 0) {
                int i = 0;
                while (true) {
                    WebPkPlayerStatistic[] webPkPlayerStatisticArr2 = this.playStat;
                    if (i >= webPkPlayerStatisticArr2.length) {
                        break;
                    }
                    WebPkPlayerStatistic webPkPlayerStatistic = webPkPlayerStatisticArr2[i];
                    if (webPkPlayerStatistic != null) {
                        computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(5, webPkPlayerStatistic);
                    }
                    i++;
                }
            }
            boolean z = this.voteEnd;
            if (z) {
                computeSerializedSize += CodedOutputByteBufferNano.computeBoolSize(6, z);
            }
            long j5 = this.voteEndWaitDeadline;
            if (j5 != 0) {
                computeSerializedSize += CodedOutputByteBufferNano.computeUInt64Size(7, j5);
            }
            long j6 = this.prePenaltyDeadline;
            if (j6 != 0) {
                computeSerializedSize += CodedOutputByteBufferNano.computeUInt64Size(8, j6);
            }
            long j7 = this.penaltyDeadline;
            if (j7 != 0) {
                computeSerializedSize += CodedOutputByteBufferNano.computeUInt64Size(9, j7);
            }
            if (!this.showType.equals("")) {
                return computeSerializedSize + CodedOutputByteBufferNano.computeStringSize(10, this.showType);
            }
            return computeSerializedSize;
        }

        public static SCWebPkStatistic parseFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
            return new SCWebPkStatistic().mergeFrom(codedInputByteBufferNano);
        }

        public static SCWebPkStatistic parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
            return (SCWebPkStatistic) MessageNano.mergeFrom(new SCWebPkStatistic(), bArr);
        }

        public SCWebPkStatistic mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
            int i;
            while (true) {
                int readTag = codedInputByteBufferNano.readTag();
                switch (readTag) {
                    case 0:
                        return this;
                    case 10:
                        this.pkId = codedInputByteBufferNano.readString();
                        break;
                    case 16:
                        this.time = codedInputByteBufferNano.readUInt64();
                        break;
                    case 24:
                        this.startTime = codedInputByteBufferNano.readUInt64();
                        break;
                    case 32:
                        this.voteDeadline = codedInputByteBufferNano.readUInt64();
                        break;
                    case 42:
                        int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 42);
                        WebPkPlayerStatistic[] webPkPlayerStatisticArr = this.playStat;
                        if (webPkPlayerStatisticArr == null) {
                            i = 0;
                        } else {
                            i = webPkPlayerStatisticArr.length;
                        }
                        int i2 = repeatedFieldArrayLength + i;
                        WebPkPlayerStatistic[] webPkPlayerStatisticArr2 = new WebPkPlayerStatistic[i2];
                        if (i != 0) {
                            System.arraycopy(this.playStat, 0, webPkPlayerStatisticArr2, 0, i);
                        }
                        while (i < i2 - 1) {
                            webPkPlayerStatisticArr2[i] = new WebPkPlayerStatistic();
                            codedInputByteBufferNano.readMessage(webPkPlayerStatisticArr2[i]);
                            codedInputByteBufferNano.readTag();
                            i++;
                        }
                        webPkPlayerStatisticArr2[i] = new WebPkPlayerStatistic();
                        codedInputByteBufferNano.readMessage(webPkPlayerStatisticArr2[i]);
                        this.playStat = webPkPlayerStatisticArr2;
                        break;
                    case 48:
                        this.voteEnd = codedInputByteBufferNano.readBool();
                        break;
                    case 56:
                        this.voteEndWaitDeadline = codedInputByteBufferNano.readUInt64();
                        break;
                    case 64:
                        this.prePenaltyDeadline = codedInputByteBufferNano.readUInt64();
                        break;
                    case 72:
                        this.penaltyDeadline = codedInputByteBufferNano.readUInt64();
                        break;
                    case 82:
                        this.showType = codedInputByteBufferNano.readString();
                        break;
                    default:
                        if (WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                            break;
                        } else {
                            return this;
                        }
                }
            }
        }

        public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            if (!this.pkId.equals("")) {
                codedOutputByteBufferNano.writeString(1, this.pkId);
            }
            long j2 = this.time;
            if (j2 != 0) {
                codedOutputByteBufferNano.writeUInt64(2, j2);
            }
            long j3 = this.startTime;
            if (j3 != 0) {
                codedOutputByteBufferNano.writeUInt64(3, j3);
            }
            long j4 = this.voteDeadline;
            if (j4 != 0) {
                codedOutputByteBufferNano.writeUInt64(4, j4);
            }
            WebPkPlayerStatistic[] webPkPlayerStatisticArr = this.playStat;
            if (webPkPlayerStatisticArr != null && webPkPlayerStatisticArr.length > 0) {
                int i = 0;
                while (true) {
                    WebPkPlayerStatistic[] webPkPlayerStatisticArr2 = this.playStat;
                    if (i >= webPkPlayerStatisticArr2.length) {
                        break;
                    }
                    WebPkPlayerStatistic webPkPlayerStatistic = webPkPlayerStatisticArr2[i];
                    if (webPkPlayerStatistic != null) {
                        codedOutputByteBufferNano.writeMessage(5, webPkPlayerStatistic);
                    }
                    i++;
                }
            }
            boolean z = this.voteEnd;
            if (z) {
                codedOutputByteBufferNano.writeBool(6, z);
            }
            long j5 = this.voteEndWaitDeadline;
            if (j5 != 0) {
                codedOutputByteBufferNano.writeUInt64(7, j5);
            }
            long j6 = this.prePenaltyDeadline;
            if (j6 != 0) {
                codedOutputByteBufferNano.writeUInt64(8, j6);
            }
            long j7 = this.penaltyDeadline;
            if (j7 != 0) {
                codedOutputByteBufferNano.writeUInt64(9, j7);
            }
            if (!this.showType.equals("")) {
                codedOutputByteBufferNano.writeString(10, this.showType);
            }
            super.writeTo(codedOutputByteBufferNano);
        }
    }

    /* compiled from: kSourceFile */
    public static final class SCWebRefreshWallet extends MessageNano {
        public static volatile SCWebRefreshWallet[] _emptyArray;

        public SCWebRefreshWallet clear() {
            this.cachedSize = -1;
            return this;
        }

        public SCWebRefreshWallet() {
            clear();
        }

        public static SCWebRefreshWallet[] emptyArray() {
            if (_emptyArray == null) {
                synchronized (InternalNano.LAZY_INIT_LOCK) {
                    if (_emptyArray == null) {
                        _emptyArray = new SCWebRefreshWallet[0];
                    }
                }
            }
            return _emptyArray;
        }

        public static SCWebRefreshWallet parseFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
            return new SCWebRefreshWallet().mergeFrom(codedInputByteBufferNano);
        }

        public static SCWebRefreshWallet parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
            return (SCWebRefreshWallet) MessageNano.mergeFrom(new SCWebRefreshWallet(), bArr);
        }

        /*  JADX ERROR: StackOverflow in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException:
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
            	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
            */
        public SCWebRefreshWallet mergeFrom(CodedInputByteBufferNano r2) throws IOException {
            /*
                r1 = this;
            L_0x0000:
                int r0 = r2.readTag()
                if (r0 == 0) goto L_0x000c
                boolean r0 = com.google.protobuf.nano.WireFormatNano.parseUnknownField(r2, r0)
                if (r0 != 0) goto L_0x0000
            L_0x000c:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: SCWebRefreshWallet.mergeFrom(com.google.protobuf.nano.CodedInputByteBufferNano):com.kuaishou.livestream.message.nano.LiveStreamWebMessages$SCWebRefreshWallet");
        }
    }

    /* compiled from: kSourceFile */
    public static final class SCWebRideChanged extends MessageNano {
        public static volatile SCWebRideChanged[] _emptyArray;
        public int requestMaxDelayMillis;
        public String rideId;

        public SCWebRideChanged() {
            clear();
        }

        public static SCWebRideChanged[] emptyArray() {
            if (_emptyArray == null) {
                synchronized (InternalNano.LAZY_INIT_LOCK) {
                    if (_emptyArray == null) {
                        _emptyArray = new SCWebRideChanged[0];
                    }
                }
            }
            return _emptyArray;
        }

        public SCWebRideChanged clear() {
            this.rideId = "";
            this.requestMaxDelayMillis = 0;
            this.cachedSize = -1;
            return this;
        }

        public int computeSerializedSize() {
            int computeSerializedSize = super.computeSerializedSize();
            if (!this.rideId.equals("")) {
                computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(1, this.rideId);
            }
            int i = this.requestMaxDelayMillis;
            if (i != 0) {
                return computeSerializedSize + CodedOutputByteBufferNano.computeUInt32Size(2, i);
            }
            return computeSerializedSize;
        }

        public static SCWebRideChanged parseFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
            return new SCWebRideChanged().mergeFrom(codedInputByteBufferNano);
        }

        public static SCWebRideChanged parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
            return (SCWebRideChanged) MessageNano.mergeFrom(new SCWebRideChanged(), bArr);
        }

        public SCWebRideChanged mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
            while (true) {
                int readTag = codedInputByteBufferNano.readTag();
                if (readTag == 0) {
                    return this;
                }
                if (readTag == 10) {
                    this.rideId = codedInputByteBufferNano.readString();
                } else if (readTag == 16) {
                    this.requestMaxDelayMillis = codedInputByteBufferNano.readUInt32();
                } else if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    return this;
                }
            }
        }

        public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            if (!this.rideId.equals("")) {
                codedOutputByteBufferNano.writeString(1, this.rideId);
            }
            int i = this.requestMaxDelayMillis;
            if (i != 0) {
                codedOutputByteBufferNano.writeUInt32(2, i);
            }
            super.writeTo(codedOutputByteBufferNano);
        }
    }

    /* compiled from: kSourceFile */
    public static final class SCWebSuspectedViolation extends MessageNano {
        public static volatile SCWebSuspectedViolation[] _emptyArray;
        public boolean suspectedViolation;

        public SCWebSuspectedViolation() {
            clear();
        }

        public static SCWebSuspectedViolation[] emptyArray() {
            if (_emptyArray == null) {
                synchronized (InternalNano.LAZY_INIT_LOCK) {
                    if (_emptyArray == null) {
                        _emptyArray = new SCWebSuspectedViolation[0];
                    }
                }
            }
            return _emptyArray;
        }

        public SCWebSuspectedViolation clear() {
            this.suspectedViolation = false;
            this.cachedSize = -1;
            return this;
        }

        public int computeSerializedSize() {
            int computeSerializedSize = super.computeSerializedSize();
            boolean z = this.suspectedViolation;
            if (z) {
                return computeSerializedSize + CodedOutputByteBufferNano.computeBoolSize(1, z);
            }
            return computeSerializedSize;
        }

        public static SCWebSuspectedViolation parseFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
            return new SCWebSuspectedViolation().mergeFrom(codedInputByteBufferNano);
        }

        public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            boolean z = this.suspectedViolation;
            if (z) {
                codedOutputByteBufferNano.writeBool(1, z);
            }
            super.writeTo(codedOutputByteBufferNano);
        }

        public static SCWebSuspectedViolation parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
            return (SCWebSuspectedViolation) MessageNano.mergeFrom(new SCWebSuspectedViolation(), bArr);
        }

        public SCWebSuspectedViolation mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
            while (true) {
                int readTag = codedInputByteBufferNano.readTag();
                if (readTag == 0) {
                    return this;
                }
                if (readTag == 8) {
                    this.suspectedViolation = codedInputByteBufferNano.readBool();
                } else if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    return this;
                }
            }
        }
    }

    /* compiled from: kSourceFile */
    public static final class SCWebVoipSignal extends MessageNano {
        public static volatile SCWebVoipSignal[] _emptyArray;
        public r signal;

        public SCWebVoipSignal() {
            clear();
        }

        public static SCWebVoipSignal[] emptyArray() {
            if (_emptyArray == null) {
                synchronized (InternalNano.LAZY_INIT_LOCK) {
                    if (_emptyArray == null) {
                        _emptyArray = new SCWebVoipSignal[0];
                    }
                }
            }
            return _emptyArray;
        }

        public SCWebVoipSignal clear() {
            this.signal = null;
            this.cachedSize = -1;
            return this;
        }

        public int computeSerializedSize() {
            int computeSerializedSize = super.computeSerializedSize();
            r rVar = this.signal;
            if (rVar != null) {
                return computeSerializedSize + CodedOutputByteBufferNano.computeMessageSize(1, rVar);
            }
            return computeSerializedSize;
        }

        public static SCWebVoipSignal parseFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
            return new SCWebVoipSignal().mergeFrom(codedInputByteBufferNano);
        }

        public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            r rVar = this.signal;
            if (rVar != null) {
                codedOutputByteBufferNano.writeMessage(1, rVar);
            }
            super.writeTo(codedOutputByteBufferNano);
        }

        public static SCWebVoipSignal parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
            return (SCWebVoipSignal) MessageNano.mergeFrom(new SCWebVoipSignal(), bArr);
        }

        public SCWebVoipSignal mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
            while (true) {
                int readTag = codedInputByteBufferNano.readTag();
                if (readTag == 0) {
                    return this;
                }
                if (readTag == 10) {
                    if (this.signal == null) {
                        this.signal = new r();
                    }
                    codedInputByteBufferNano.readMessage(this.signal);
                } else if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    return this;
                }
            }
        }
    }

    /* compiled from: kSourceFile */
    public static final class SimpleUserInfo extends MessageNano {
        public static volatile SimpleUserInfo[] _emptyArray;
        public String headUrl;
        public String principalId;
        public String userName;

        public SimpleUserInfo() {
            clear();
        }

        public static SimpleUserInfo[] emptyArray() {
            if (_emptyArray == null) {
                synchronized (InternalNano.LAZY_INIT_LOCK) {
                    if (_emptyArray == null) {
                        _emptyArray = new SimpleUserInfo[0];
                    }
                }
            }
            return _emptyArray;
        }

        public SimpleUserInfo clear() {
            this.principalId = "";
            this.userName = "";
            this.headUrl = "";
            this.cachedSize = -1;
            return this;
        }

        public int computeSerializedSize() {
            int computeSerializedSize = super.computeSerializedSize();
            if (!this.principalId.equals("")) {
                computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(1, this.principalId);
            }
            if (!this.userName.equals("")) {
                computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(2, this.userName);
            }
            if (!this.headUrl.equals("")) {
                return computeSerializedSize + CodedOutputByteBufferNano.computeStringSize(3, this.headUrl);
            }
            return computeSerializedSize;
        }

        public static SimpleUserInfo parseFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
            return new SimpleUserInfo().mergeFrom(codedInputByteBufferNano);
        }

        public static SimpleUserInfo parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
            return (SimpleUserInfo) MessageNano.mergeFrom(new SimpleUserInfo(), bArr);
        }

        public SimpleUserInfo mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
            while (true) {
                int readTag = codedInputByteBufferNano.readTag();
                if (readTag == 0) {
                    return this;
                }
                if (readTag == 10) {
                    this.principalId = codedInputByteBufferNano.readString();
                } else if (readTag == 18) {
                    this.userName = codedInputByteBufferNano.readString();
                } else if (readTag == 26) {
                    this.headUrl = codedInputByteBufferNano.readString();
                } else if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    return this;
                }
            }
        }

        public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            if (!this.principalId.equals("")) {
                codedOutputByteBufferNano.writeString(1, this.principalId);
            }
            if (!this.userName.equals("")) {
                codedOutputByteBufferNano.writeString(2, this.userName);
            }
            if (!this.headUrl.equals("")) {
                codedOutputByteBufferNano.writeString(3, this.headUrl);
            }
            super.writeTo(codedOutputByteBufferNano);
        }
    }

    /* compiled from: kSourceFile */
    public static final class WebComboCommentFeed extends MessageNano {
        public static volatile WebComboCommentFeed[] _emptyArray;
        public int comboCount;
        public String content;
        public String id;

        public WebComboCommentFeed() {
            clear();
        }

        public static WebComboCommentFeed[] emptyArray() {
            if (_emptyArray == null) {
                synchronized (InternalNano.LAZY_INIT_LOCK) {
                    if (_emptyArray == null) {
                        _emptyArray = new WebComboCommentFeed[0];
                    }
                }
            }
            return _emptyArray;
        }

        public WebComboCommentFeed clear() {
            this.id = "";
            this.content = "";
            this.comboCount = 0;
            this.cachedSize = -1;
            return this;
        }

        public int computeSerializedSize() {
            int computeSerializedSize = super.computeSerializedSize();
            if (!this.id.equals("")) {
                computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(1, this.id);
            }
            if (!this.content.equals("")) {
                computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(2, this.content);
            }
            int i = this.comboCount;
            if (i != 0) {
                return computeSerializedSize + CodedOutputByteBufferNano.computeUInt32Size(3, i);
            }
            return computeSerializedSize;
        }

        public static WebComboCommentFeed parseFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
            return new WebComboCommentFeed().mergeFrom(codedInputByteBufferNano);
        }

        public static WebComboCommentFeed parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
            return (WebComboCommentFeed) MessageNano.mergeFrom(new WebComboCommentFeed(), bArr);
        }

        public WebComboCommentFeed mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
            while (true) {
                int readTag = codedInputByteBufferNano.readTag();
                if (readTag == 0) {
                    return this;
                }
                if (readTag == 10) {
                    this.id = codedInputByteBufferNano.readString();
                } else if (readTag == 18) {
                    this.content = codedInputByteBufferNano.readString();
                } else if (readTag == 24) {
                    this.comboCount = codedInputByteBufferNano.readUInt32();
                } else if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    return this;
                }
            }
        }

        public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            if (!this.id.equals("")) {
                codedOutputByteBufferNano.writeString(1, this.id);
            }
            if (!this.content.equals("")) {
                codedOutputByteBufferNano.writeString(2, this.content);
            }
            int i = this.comboCount;
            if (i != 0) {
                codedOutputByteBufferNano.writeUInt32(3, i);
            }
            super.writeTo(codedOutputByteBufferNano);
        }
    }

    /* compiled from: kSourceFile */
    public static final class WebCommentFeed extends MessageNano {
        public static volatile WebCommentFeed[] _emptyArray;
        public String color;
        public String content;
        public String deviceHash;
        public String id;
        public int showType;
        public long sortRank;
        public SimpleUserInfo user;

        public WebCommentFeed() {
            clear();
        }

        public static WebCommentFeed[] emptyArray() {
            if (_emptyArray == null) {
                synchronized (InternalNano.LAZY_INIT_LOCK) {
                    if (_emptyArray == null) {
                        _emptyArray = new WebCommentFeed[0];
                    }
                }
            }
            return _emptyArray;
        }

        public WebCommentFeed clear() {
            this.id = "";
            this.user = null;
            this.content = "";
            this.deviceHash = "";
            this.sortRank = 0;
            this.color = "";
            this.showType = 0;
            this.cachedSize = -1;
            return this;
        }

        public int computeSerializedSize() {
            int computeSerializedSize = super.computeSerializedSize();
            if (!this.id.equals("")) {
                computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(1, this.id);
            }
            SimpleUserInfo simpleUserInfo = this.user;
            if (simpleUserInfo != null) {
                computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(2, simpleUserInfo);
            }
            if (!this.content.equals("")) {
                computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(3, this.content);
            }
            if (!this.deviceHash.equals("")) {
                computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(4, this.deviceHash);
            }
            long j2 = this.sortRank;
            if (j2 != 0) {
                computeSerializedSize += CodedOutputByteBufferNano.computeUInt64Size(5, j2);
            }
            if (!this.color.equals("")) {
                computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(6, this.color);
            }
            int i = this.showType;
            if (i != 0) {
                return computeSerializedSize + CodedOutputByteBufferNano.computeInt32Size(7, i);
            }
            return computeSerializedSize;
        }

        public static WebCommentFeed parseFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
            return new WebCommentFeed().mergeFrom(codedInputByteBufferNano);
        }

        public static WebCommentFeed parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
            return (WebCommentFeed) MessageNano.mergeFrom(new WebCommentFeed(), bArr);
        }

        public WebCommentFeed mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
            while (true) {
                int readTag = codedInputByteBufferNano.readTag();
                if (readTag == 0) {
                    return this;
                }
                if (readTag == 10) {
                    this.id = codedInputByteBufferNano.readString();
                } else if (readTag == 18) {
                    if (this.user == null) {
                        this.user = new SimpleUserInfo();
                    }
                    codedInputByteBufferNano.readMessage(this.user);
                } else if (readTag == 26) {
                    this.content = codedInputByteBufferNano.readString();
                } else if (readTag == 34) {
                    this.deviceHash = codedInputByteBufferNano.readString();
                } else if (readTag == 40) {
                    this.sortRank = codedInputByteBufferNano.readUInt64();
                } else if (readTag == 50) {
                    this.color = codedInputByteBufferNano.readString();
                } else if (readTag == 56) {
                    int readInt32 = codedInputByteBufferNano.readInt32();
                    if (readInt32 == 0 || readInt32 == 1 || readInt32 == 2) {
                        this.showType = readInt32;
                    }
                } else if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    return this;
                }
            }
        }

        public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            if (!this.id.equals("")) {
                codedOutputByteBufferNano.writeString(1, this.id);
            }
            SimpleUserInfo simpleUserInfo = this.user;
            if (simpleUserInfo != null) {
                codedOutputByteBufferNano.writeMessage(2, simpleUserInfo);
            }
            if (!this.content.equals("")) {
                codedOutputByteBufferNano.writeString(3, this.content);
            }
            if (!this.deviceHash.equals("")) {
                codedOutputByteBufferNano.writeString(4, this.deviceHash);
            }
            long j2 = this.sortRank;
            if (j2 != 0) {
                codedOutputByteBufferNano.writeUInt64(5, j2);
            }
            if (!this.color.equals("")) {
                codedOutputByteBufferNano.writeString(6, this.color);
            }
            int i = this.showType;
            if (i != 0) {
                codedOutputByteBufferNano.writeInt32(7, i);
            }
            super.writeTo(codedOutputByteBufferNano);
        }
    }

    /* compiled from: kSourceFile */
    public static final class WebGiftFeed extends MessageNano {
        public static volatile WebGiftFeed[] _emptyArray;
        public int batchSize;
        public long clientTimestamp;
        public int comboCount;
        public boolean danmakuDisplay;
        public String deviceHash;
        public long expireDuration;
        public int giftId;
        public String id;
        public int liveAssistantType;
        public String mergeKey;
        public int rank;
        public long slotDisplayDuration;
        public long sortRank;
        public int starLevel;
        public int styleType;
        public long time;
        public SimpleUserInfo user;

        @Retention(RetentionPolicy.SOURCE)
        /* compiled from: kSourceFile */
        public @interface StyleType {
        }

        public WebGiftFeed() {
            clear();
        }

        public static WebGiftFeed[] emptyArray() {
            if (_emptyArray == null) {
                synchronized (InternalNano.LAZY_INIT_LOCK) {
                    if (_emptyArray == null) {
                        _emptyArray = new WebGiftFeed[0];
                    }
                }
            }
            return _emptyArray;
        }

        public WebGiftFeed clear() {
            this.id = "";
            this.user = null;
            this.time = 0;
            this.giftId = 0;
            this.sortRank = 0;
            this.mergeKey = "";
            this.batchSize = 0;
            this.comboCount = 0;
            this.rank = 0;
            this.expireDuration = 0;
            this.clientTimestamp = 0;
            this.slotDisplayDuration = 0;
            this.starLevel = 0;
            this.styleType = 0;
            this.liveAssistantType = 0;
            this.deviceHash = "";
            this.danmakuDisplay = false;
            this.cachedSize = -1;
            return this;
        }

        public int computeSerializedSize() {
            int computeSerializedSize = super.computeSerializedSize();
            if (!this.id.equals("")) {
                computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(1, this.id);
            }
            SimpleUserInfo simpleUserInfo = this.user;
            if (simpleUserInfo != null) {
                computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(2, simpleUserInfo);
            }
            long j2 = this.time;
            if (j2 != 0) {
                computeSerializedSize += CodedOutputByteBufferNano.computeUInt64Size(3, j2);
            }
            int i = this.giftId;
            if (i != 0) {
                computeSerializedSize += CodedOutputByteBufferNano.computeUInt32Size(4, i);
            }
            long j3 = this.sortRank;
            if (j3 != 0) {
                computeSerializedSize += CodedOutputByteBufferNano.computeUInt64Size(5, j3);
            }
            if (!this.mergeKey.equals("")) {
                computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(6, this.mergeKey);
            }
            int i2 = this.batchSize;
            if (i2 != 0) {
                computeSerializedSize += CodedOutputByteBufferNano.computeUInt32Size(7, i2);
            }
            int i3 = this.comboCount;
            if (i3 != 0) {
                computeSerializedSize += CodedOutputByteBufferNano.computeUInt32Size(8, i3);
            }
            int i4 = this.rank;
            if (i4 != 0) {
                computeSerializedSize += CodedOutputByteBufferNano.computeUInt32Size(9, i4);
            }
            long j4 = this.expireDuration;
            if (j4 != 0) {
                computeSerializedSize += CodedOutputByteBufferNano.computeUInt64Size(10, j4);
            }
            long j5 = this.clientTimestamp;
            if (j5 != 0) {
                computeSerializedSize += CodedOutputByteBufferNano.computeUInt64Size(11, j5);
            }
            long j6 = this.slotDisplayDuration;
            if (j6 != 0) {
                computeSerializedSize += CodedOutputByteBufferNano.computeUInt64Size(12, j6);
            }
            int i5 = this.starLevel;
            if (i5 != 0) {
                computeSerializedSize += CodedOutputByteBufferNano.computeUInt32Size(13, i5);
            }
            int i6 = this.styleType;
            if (i6 != 0) {
                computeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(14, i6);
            }
            int i7 = this.liveAssistantType;
            if (i7 != 0) {
                computeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(15, i7);
            }
            if (!this.deviceHash.equals("")) {
                computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(16, this.deviceHash);
            }
            boolean z = this.danmakuDisplay;
            if (z) {
                return computeSerializedSize + CodedOutputByteBufferNano.computeBoolSize(17, z);
            }
            return computeSerializedSize;
        }

        public static WebGiftFeed parseFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
            return new WebGiftFeed().mergeFrom(codedInputByteBufferNano);
        }

        public static WebGiftFeed parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
            return (WebGiftFeed) MessageNano.mergeFrom(new WebGiftFeed(), bArr);
        }

        public WebGiftFeed mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
            while (true) {
                int readTag = codedInputByteBufferNano.readTag();
                switch (readTag) {
                    case 0:
                        return this;
                    case 10:
                        this.id = codedInputByteBufferNano.readString();
                        break;
                    case 18:
                        if (this.user == null) {
                            this.user = new SimpleUserInfo();
                        }
                        codedInputByteBufferNano.readMessage(this.user);
                        break;
                    case 24:
                        this.time = codedInputByteBufferNano.readUInt64();
                        break;
                    case 32:
                        this.giftId = codedInputByteBufferNano.readUInt32();
                        break;
                    case 40:
                        this.sortRank = codedInputByteBufferNano.readUInt64();
                        break;
                    case 50:
                        this.mergeKey = codedInputByteBufferNano.readString();
                        break;
                    case 56:
                        this.batchSize = codedInputByteBufferNano.readUInt32();
                        break;
                    case 64:
                        this.comboCount = codedInputByteBufferNano.readUInt32();
                        break;
                    case 72:
                        this.rank = codedInputByteBufferNano.readUInt32();
                        break;
                    case 80:
                        this.expireDuration = codedInputByteBufferNano.readUInt64();
                        break;
                    case 88:
                        this.clientTimestamp = codedInputByteBufferNano.readUInt64();
                        break;
                    case 96:
                        this.slotDisplayDuration = codedInputByteBufferNano.readUInt64();
                        break;
                    case 104:
                        this.starLevel = codedInputByteBufferNano.readUInt32();
                        break;
                    case 112:
                        int readInt32 = codedInputByteBufferNano.readInt32();
                        switch (readInt32) {
                            case 0:
                            case 1:
                            case 2:
                            case 3:
                            case 4:
                            case 5:
                            case 6:
                            case 7:
                                this.styleType = readInt32;
                                break;
                        }
                    case 120:
                        int readInt322 = codedInputByteBufferNano.readInt32();
                        if (readInt322 != 0 && readInt322 != 1 && readInt322 != 2) {
                            break;
                        } else {
                            this.liveAssistantType = readInt322;
                            break;
                        }
                    case 130:
                        this.deviceHash = codedInputByteBufferNano.readString();
                        break;
                    case 136:
                        this.danmakuDisplay = codedInputByteBufferNano.readBool();
                        break;
                    default:
                        if (WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                            break;
                        } else {
                            return this;
                        }
                }
            }
        }

        public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            if (!this.id.equals("")) {
                codedOutputByteBufferNano.writeString(1, this.id);
            }
            SimpleUserInfo simpleUserInfo = this.user;
            if (simpleUserInfo != null) {
                codedOutputByteBufferNano.writeMessage(2, simpleUserInfo);
            }
            long j2 = this.time;
            if (j2 != 0) {
                codedOutputByteBufferNano.writeUInt64(3, j2);
            }
            int i = this.giftId;
            if (i != 0) {
                codedOutputByteBufferNano.writeUInt32(4, i);
            }
            long j3 = this.sortRank;
            if (j3 != 0) {
                codedOutputByteBufferNano.writeUInt64(5, j3);
            }
            if (!this.mergeKey.equals("")) {
                codedOutputByteBufferNano.writeString(6, this.mergeKey);
            }
            int i2 = this.batchSize;
            if (i2 != 0) {
                codedOutputByteBufferNano.writeUInt32(7, i2);
            }
            int i3 = this.comboCount;
            if (i3 != 0) {
                codedOutputByteBufferNano.writeUInt32(8, i3);
            }
            int i4 = this.rank;
            if (i4 != 0) {
                codedOutputByteBufferNano.writeUInt32(9, i4);
            }
            long j4 = this.expireDuration;
            if (j4 != 0) {
                codedOutputByteBufferNano.writeUInt64(10, j4);
            }
            long j5 = this.clientTimestamp;
            if (j5 != 0) {
                codedOutputByteBufferNano.writeUInt64(11, j5);
            }
            long j6 = this.slotDisplayDuration;
            if (j6 != 0) {
                codedOutputByteBufferNano.writeUInt64(12, j6);
            }
            int i5 = this.starLevel;
            if (i5 != 0) {
                codedOutputByteBufferNano.writeUInt32(13, i5);
            }
            int i6 = this.styleType;
            if (i6 != 0) {
                codedOutputByteBufferNano.writeInt32(14, i6);
            }
            int i7 = this.liveAssistantType;
            if (i7 != 0) {
                codedOutputByteBufferNano.writeInt32(15, i7);
            }
            if (!this.deviceHash.equals("")) {
                codedOutputByteBufferNano.writeString(16, this.deviceHash);
            }
            boolean z = this.danmakuDisplay;
            if (z) {
                codedOutputByteBufferNano.writeBool(17, z);
            }
            super.writeTo(codedOutputByteBufferNano);
        }
    }

    /* compiled from: kSourceFile */
    public static final class WebLikeFeed extends MessageNano {
        public static volatile WebLikeFeed[] _emptyArray;
        public String deviceHash;
        public String id;
        public long sortRank;
        public SimpleUserInfo user;

        public WebLikeFeed() {
            clear();
        }

        public static WebLikeFeed[] emptyArray() {
            if (_emptyArray == null) {
                synchronized (InternalNano.LAZY_INIT_LOCK) {
                    if (_emptyArray == null) {
                        _emptyArray = new WebLikeFeed[0];
                    }
                }
            }
            return _emptyArray;
        }

        public WebLikeFeed clear() {
            this.id = "";
            this.user = null;
            this.sortRank = 0;
            this.deviceHash = "";
            this.cachedSize = -1;
            return this;
        }

        public int computeSerializedSize() {
            int computeSerializedSize = super.computeSerializedSize();
            if (!this.id.equals("")) {
                computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(1, this.id);
            }
            SimpleUserInfo simpleUserInfo = this.user;
            if (simpleUserInfo != null) {
                computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(2, simpleUserInfo);
            }
            long j2 = this.sortRank;
            if (j2 != 0) {
                computeSerializedSize += CodedOutputByteBufferNano.computeUInt64Size(3, j2);
            }
            if (!this.deviceHash.equals("")) {
                return computeSerializedSize + CodedOutputByteBufferNano.computeStringSize(4, this.deviceHash);
            }
            return computeSerializedSize;
        }

        public static WebLikeFeed parseFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
            return new WebLikeFeed().mergeFrom(codedInputByteBufferNano);
        }

        public static WebLikeFeed parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
            return (WebLikeFeed) MessageNano.mergeFrom(new WebLikeFeed(), bArr);
        }

        public WebLikeFeed mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
            while (true) {
                int readTag = codedInputByteBufferNano.readTag();
                if (readTag == 0) {
                    return this;
                }
                if (readTag == 10) {
                    this.id = codedInputByteBufferNano.readString();
                } else if (readTag == 18) {
                    if (this.user == null) {
                        this.user = new SimpleUserInfo();
                    }
                    codedInputByteBufferNano.readMessage(this.user);
                } else if (readTag == 24) {
                    this.sortRank = codedInputByteBufferNano.readUInt64();
                } else if (readTag == 34) {
                    this.deviceHash = codedInputByteBufferNano.readString();
                } else if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    return this;
                }
            }
        }

        public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            if (!this.id.equals("")) {
                codedOutputByteBufferNano.writeString(1, this.id);
            }
            SimpleUserInfo simpleUserInfo = this.user;
            if (simpleUserInfo != null) {
                codedOutputByteBufferNano.writeMessage(2, simpleUserInfo);
            }
            long j2 = this.sortRank;
            if (j2 != 0) {
                codedOutputByteBufferNano.writeUInt64(3, j2);
            }
            if (!this.deviceHash.equals("")) {
                codedOutputByteBufferNano.writeString(4, this.deviceHash);
            }
            super.writeTo(codedOutputByteBufferNano);
        }
    }

    /* compiled from: kSourceFile */
    public static final class WebPkPlayerStatistic extends MessageNano {
        public static volatile WebPkPlayerStatistic[] _emptyArray;
        public String liveStreamId;
        public SimpleUserInfo player;
        public long score;

        public WebPkPlayerStatistic() {
            clear();
        }

        public static WebPkPlayerStatistic[] emptyArray() {
            if (_emptyArray == null) {
                synchronized (InternalNano.LAZY_INIT_LOCK) {
                    if (_emptyArray == null) {
                        _emptyArray = new WebPkPlayerStatistic[0];
                    }
                }
            }
            return _emptyArray;
        }

        public WebPkPlayerStatistic clear() {
            this.player = null;
            this.score = 0;
            this.liveStreamId = "";
            this.cachedSize = -1;
            return this;
        }

        public int computeSerializedSize() {
            int computeSerializedSize = super.computeSerializedSize();
            SimpleUserInfo simpleUserInfo = this.player;
            if (simpleUserInfo != null) {
                computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(1, simpleUserInfo);
            }
            long j2 = this.score;
            if (j2 != 0) {
                computeSerializedSize += CodedOutputByteBufferNano.computeUInt64Size(2, j2);
            }
            if (!this.liveStreamId.equals("")) {
                return computeSerializedSize + CodedOutputByteBufferNano.computeStringSize(3, this.liveStreamId);
            }
            return computeSerializedSize;
        }

        public static WebPkPlayerStatistic parseFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
            return new WebPkPlayerStatistic().mergeFrom(codedInputByteBufferNano);
        }

        public static WebPkPlayerStatistic parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
            return (WebPkPlayerStatistic) MessageNano.mergeFrom(new WebPkPlayerStatistic(), bArr);
        }

        public WebPkPlayerStatistic mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
            while (true) {
                int readTag = codedInputByteBufferNano.readTag();
                if (readTag == 0) {
                    return this;
                }
                if (readTag == 10) {
                    if (this.player == null) {
                        this.player = new SimpleUserInfo();
                    }
                    codedInputByteBufferNano.readMessage(this.player);
                } else if (readTag == 16) {
                    this.score = codedInputByteBufferNano.readUInt64();
                } else if (readTag == 26) {
                    this.liveStreamId = codedInputByteBufferNano.readString();
                } else if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    return this;
                }
            }
        }

        public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            SimpleUserInfo simpleUserInfo = this.player;
            if (simpleUserInfo != null) {
                codedOutputByteBufferNano.writeMessage(1, simpleUserInfo);
            }
            long j2 = this.score;
            if (j2 != 0) {
                codedOutputByteBufferNano.writeUInt64(2, j2);
            }
            if (!this.liveStreamId.equals("")) {
                codedOutputByteBufferNano.writeString(3, this.liveStreamId);
            }
            super.writeTo(codedOutputByteBufferNano);
        }
    }

    /* compiled from: kSourceFile */
    public static final class WebRedPackInfo extends MessageNano {
        public static volatile WebRedPackInfo[] _emptyArray;
        public SimpleUserInfo author;
        public long balance;
        public int coverType;
        public long currentTime;
        public String grabToken;
        public String id;
        public long luckiestDelayMillis;
        public boolean needSendRequest;
        public long openTime;
        public long requestDelayMillis;

        public WebRedPackInfo() {
            clear();
        }

        public static WebRedPackInfo[] emptyArray() {
            if (_emptyArray == null) {
                synchronized (InternalNano.LAZY_INIT_LOCK) {
                    if (_emptyArray == null) {
                        _emptyArray = new WebRedPackInfo[0];
                    }
                }
            }
            return _emptyArray;
        }

        public WebRedPackInfo clear() {
            this.id = "";
            this.author = null;
            this.balance = 0;
            this.openTime = 0;
            this.currentTime = 0;
            this.grabToken = "";
            this.needSendRequest = false;
            this.requestDelayMillis = 0;
            this.luckiestDelayMillis = 0;
            this.coverType = 0;
            this.cachedSize = -1;
            return this;
        }

        public int computeSerializedSize() {
            int computeSerializedSize = super.computeSerializedSize();
            if (!this.id.equals("")) {
                computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(1, this.id);
            }
            SimpleUserInfo simpleUserInfo = this.author;
            if (simpleUserInfo != null) {
                computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(2, simpleUserInfo);
            }
            long j2 = this.balance;
            if (j2 != 0) {
                computeSerializedSize += CodedOutputByteBufferNano.computeUInt64Size(3, j2);
            }
            long j3 = this.openTime;
            if (j3 != 0) {
                computeSerializedSize += CodedOutputByteBufferNano.computeUInt64Size(4, j3);
            }
            long j4 = this.currentTime;
            if (j4 != 0) {
                computeSerializedSize += CodedOutputByteBufferNano.computeUInt64Size(5, j4);
            }
            if (!this.grabToken.equals("")) {
                computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(6, this.grabToken);
            }
            boolean z = this.needSendRequest;
            if (z) {
                computeSerializedSize += CodedOutputByteBufferNano.computeBoolSize(7, z);
            }
            long j5 = this.requestDelayMillis;
            if (j5 != 0) {
                computeSerializedSize += CodedOutputByteBufferNano.computeUInt64Size(8, j5);
            }
            long j6 = this.luckiestDelayMillis;
            if (j6 != 0) {
                computeSerializedSize += CodedOutputByteBufferNano.computeUInt64Size(9, j6);
            }
            int i = this.coverType;
            if (i != 0) {
                return computeSerializedSize + CodedOutputByteBufferNano.computeInt32Size(10, i);
            }
            return computeSerializedSize;
        }

        public static WebRedPackInfo parseFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
            return new WebRedPackInfo().mergeFrom(codedInputByteBufferNano);
        }

        public static WebRedPackInfo parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
            return (WebRedPackInfo) MessageNano.mergeFrom(new WebRedPackInfo(), bArr);
        }

        public WebRedPackInfo mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
            while (true) {
                int readTag = codedInputByteBufferNano.readTag();
                switch (readTag) {
                    case 0:
                        return this;
                    case 10:
                        this.id = codedInputByteBufferNano.readString();
                        break;
                    case 18:
                        if (this.author == null) {
                            this.author = new SimpleUserInfo();
                        }
                        codedInputByteBufferNano.readMessage(this.author);
                        break;
                    case 24:
                        this.balance = codedInputByteBufferNano.readUInt64();
                        break;
                    case 32:
                        this.openTime = codedInputByteBufferNano.readUInt64();
                        break;
                    case 40:
                        this.currentTime = codedInputByteBufferNano.readUInt64();
                        break;
                    case 50:
                        this.grabToken = codedInputByteBufferNano.readString();
                        break;
                    case 56:
                        this.needSendRequest = codedInputByteBufferNano.readBool();
                        break;
                    case 64:
                        this.requestDelayMillis = codedInputByteBufferNano.readUInt64();
                        break;
                    case 72:
                        this.luckiestDelayMillis = codedInputByteBufferNano.readUInt64();
                        break;
                    case 80:
                        int readInt32 = codedInputByteBufferNano.readInt32();
                        if (readInt32 != 0 && readInt32 != 1 && readInt32 != 2) {
                            break;
                        } else {
                            this.coverType = readInt32;
                            break;
                        }
                    default:
                        if (WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                            break;
                        } else {
                            return this;
                        }
                }
            }
        }

        public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            if (!this.id.equals("")) {
                codedOutputByteBufferNano.writeString(1, this.id);
            }
            SimpleUserInfo simpleUserInfo = this.author;
            if (simpleUserInfo != null) {
                codedOutputByteBufferNano.writeMessage(2, simpleUserInfo);
            }
            long j2 = this.balance;
            if (j2 != 0) {
                codedOutputByteBufferNano.writeUInt64(3, j2);
            }
            long j3 = this.openTime;
            if (j3 != 0) {
                codedOutputByteBufferNano.writeUInt64(4, j3);
            }
            long j4 = this.currentTime;
            if (j4 != 0) {
                codedOutputByteBufferNano.writeUInt64(5, j4);
            }
            if (!this.grabToken.equals("")) {
                codedOutputByteBufferNano.writeString(6, this.grabToken);
            }
            boolean z = this.needSendRequest;
            if (z) {
                codedOutputByteBufferNano.writeBool(7, z);
            }
            long j5 = this.requestDelayMillis;
            if (j5 != 0) {
                codedOutputByteBufferNano.writeUInt64(8, j5);
            }
            long j6 = this.luckiestDelayMillis;
            if (j6 != 0) {
                codedOutputByteBufferNano.writeUInt64(9, j6);
            }
            int i = this.coverType;
            if (i != 0) {
                codedOutputByteBufferNano.writeInt32(10, i);
            }
            super.writeTo(codedOutputByteBufferNano);
        }
    }

    /* compiled from: kSourceFile */
    public static final class WebShareFeed extends MessageNano {
        public static volatile WebShareFeed[] _emptyArray;
        public String deviceHash;
        public String id;
        public int liveAssistantType;
        public long sortRank;
        public int thirdPartyPlatform;
        public long time;
        public SimpleUserInfo user;

        public WebShareFeed() {
            clear();
        }

        public static WebShareFeed[] emptyArray() {
            if (_emptyArray == null) {
                synchronized (InternalNano.LAZY_INIT_LOCK) {
                    if (_emptyArray == null) {
                        _emptyArray = new WebShareFeed[0];
                    }
                }
            }
            return _emptyArray;
        }

        public WebShareFeed clear() {
            this.id = "";
            this.user = null;
            this.time = 0;
            this.thirdPartyPlatform = 0;
            this.sortRank = 0;
            this.liveAssistantType = 0;
            this.deviceHash = "";
            this.cachedSize = -1;
            return this;
        }

        public int computeSerializedSize() {
            int computeSerializedSize = super.computeSerializedSize();
            if (!this.id.equals("")) {
                computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(1, this.id);
            }
            SimpleUserInfo simpleUserInfo = this.user;
            if (simpleUserInfo != null) {
                computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(2, simpleUserInfo);
            }
            long j2 = this.time;
            if (j2 != 0) {
                computeSerializedSize += CodedOutputByteBufferNano.computeUInt64Size(3, j2);
            }
            int i = this.thirdPartyPlatform;
            if (i != 0) {
                computeSerializedSize += CodedOutputByteBufferNano.computeUInt32Size(4, i);
            }
            long j3 = this.sortRank;
            if (j3 != 0) {
                computeSerializedSize += CodedOutputByteBufferNano.computeUInt64Size(5, j3);
            }
            int i2 = this.liveAssistantType;
            if (i2 != 0) {
                computeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(6, i2);
            }
            if (!this.deviceHash.equals("")) {
                return computeSerializedSize + CodedOutputByteBufferNano.computeStringSize(7, this.deviceHash);
            }
            return computeSerializedSize;
        }

        public static WebShareFeed parseFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
            return new WebShareFeed().mergeFrom(codedInputByteBufferNano);
        }

        public static WebShareFeed parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
            return (WebShareFeed) MessageNano.mergeFrom(new WebShareFeed(), bArr);
        }

        public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            if (!this.id.equals("")) {
                codedOutputByteBufferNano.writeString(1, this.id);
            }
            SimpleUserInfo simpleUserInfo = this.user;
            if (simpleUserInfo != null) {
                codedOutputByteBufferNano.writeMessage(2, simpleUserInfo);
            }
            long j2 = this.time;
            if (j2 != 0) {
                codedOutputByteBufferNano.writeUInt64(3, j2);
            }
            int i = this.thirdPartyPlatform;
            if (i != 0) {
                codedOutputByteBufferNano.writeUInt32(4, i);
            }
            long j3 = this.sortRank;
            if (j3 != 0) {
                codedOutputByteBufferNano.writeUInt64(5, j3);
            }
            int i2 = this.liveAssistantType;
            if (i2 != 0) {
                codedOutputByteBufferNano.writeInt32(6, i2);
            }
            if (!this.deviceHash.equals("")) {
                codedOutputByteBufferNano.writeString(7, this.deviceHash);
            }
            super.writeTo(codedOutputByteBufferNano);
        }

        public WebShareFeed mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
            while (true) {
                int readTag = codedInputByteBufferNano.readTag();
                if (readTag == 0) {
                    return this;
                }
                if (readTag == 10) {
                    this.id = codedInputByteBufferNano.readString();
                } else if (readTag == 18) {
                    if (this.user == null) {
                        this.user = new SimpleUserInfo();
                    }
                    codedInputByteBufferNano.readMessage(this.user);
                } else if (readTag == 24) {
                    this.time = codedInputByteBufferNano.readUInt64();
                } else if (readTag == 32) {
                    this.thirdPartyPlatform = codedInputByteBufferNano.readUInt32();
                } else if (readTag == 40) {
                    this.sortRank = codedInputByteBufferNano.readUInt64();
                } else if (readTag == 48) {
                    int readInt32 = codedInputByteBufferNano.readInt32();
                    if (readInt32 == 0 || readInt32 == 1 || readInt32 == 2) {
                        this.liveAssistantType = readInt32;
                    }
                } else if (readTag == 58) {
                    this.deviceHash = codedInputByteBufferNano.readString();
                } else if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    return this;
                }
            }
        }
    }

    /* compiled from: kSourceFile */
    public static final class WebSystemNoticeFeed extends MessageNano {
        public static volatile WebSystemNoticeFeed[] _emptyArray;
        public String content;
        public long displayDuration;
        public int displayType;
        public String id;
        public long sortRank;
        public long time;
        public SimpleUserInfo user;

        @Retention(RetentionPolicy.SOURCE)
        /* compiled from: kSourceFile */
        public @interface DisplayType {
        }

        public WebSystemNoticeFeed() {
            clear();
        }

        public static WebSystemNoticeFeed[] emptyArray() {
            if (_emptyArray == null) {
                synchronized (InternalNano.LAZY_INIT_LOCK) {
                    if (_emptyArray == null) {
                        _emptyArray = new WebSystemNoticeFeed[0];
                    }
                }
            }
            return _emptyArray;
        }

        public WebSystemNoticeFeed clear() {
            this.id = "";
            this.user = null;
            this.time = 0;
            this.content = "";
            this.displayDuration = 0;
            this.sortRank = 0;
            this.displayType = 0;
            this.cachedSize = -1;
            return this;
        }

        public int computeSerializedSize() {
            int computeSerializedSize = super.computeSerializedSize();
            if (!this.id.equals("")) {
                computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(1, this.id);
            }
            SimpleUserInfo simpleUserInfo = this.user;
            if (simpleUserInfo != null) {
                computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(2, simpleUserInfo);
            }
            long j2 = this.time;
            if (j2 != 0) {
                computeSerializedSize += CodedOutputByteBufferNano.computeUInt64Size(3, j2);
            }
            if (!this.content.equals("")) {
                computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(4, this.content);
            }
            long j3 = this.displayDuration;
            if (j3 != 0) {
                computeSerializedSize += CodedOutputByteBufferNano.computeUInt64Size(5, j3);
            }
            long j4 = this.sortRank;
            if (j4 != 0) {
                computeSerializedSize += CodedOutputByteBufferNano.computeUInt64Size(6, j4);
            }
            int i = this.displayType;
            if (i != 0) {
                return computeSerializedSize + CodedOutputByteBufferNano.computeInt32Size(7, i);
            }
            return computeSerializedSize;
        }

        public static WebSystemNoticeFeed parseFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
            return new WebSystemNoticeFeed().mergeFrom(codedInputByteBufferNano);
        }

        public static WebSystemNoticeFeed parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
            return (WebSystemNoticeFeed) MessageNano.mergeFrom(new WebSystemNoticeFeed(), bArr);
        }

        public WebSystemNoticeFeed mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
            while (true) {
                int readTag = codedInputByteBufferNano.readTag();
                if (readTag == 0) {
                    return this;
                }
                if (readTag == 10) {
                    this.id = codedInputByteBufferNano.readString();
                } else if (readTag == 18) {
                    if (this.user == null) {
                        this.user = new SimpleUserInfo();
                    }
                    codedInputByteBufferNano.readMessage(this.user);
                } else if (readTag == 24) {
                    this.time = codedInputByteBufferNano.readUInt64();
                } else if (readTag == 34) {
                    this.content = codedInputByteBufferNano.readString();
                } else if (readTag == 40) {
                    this.displayDuration = codedInputByteBufferNano.readUInt64();
                } else if (readTag == 48) {
                    this.sortRank = codedInputByteBufferNano.readUInt64();
                } else if (readTag == 56) {
                    int readInt32 = codedInputByteBufferNano.readInt32();
                    if (readInt32 == 0 || readInt32 == 1 || readInt32 == 2 || readInt32 == 3) {
                        this.displayType = readInt32;
                    }
                } else if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    return this;
                }
            }
        }

        public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            if (!this.id.equals("")) {
                codedOutputByteBufferNano.writeString(1, this.id);
            }
            SimpleUserInfo simpleUserInfo = this.user;
            if (simpleUserInfo != null) {
                codedOutputByteBufferNano.writeMessage(2, simpleUserInfo);
            }
            long j2 = this.time;
            if (j2 != 0) {
                codedOutputByteBufferNano.writeUInt64(3, j2);
            }
            if (!this.content.equals("")) {
                codedOutputByteBufferNano.writeString(4, this.content);
            }
            long j3 = this.displayDuration;
            if (j3 != 0) {
                codedOutputByteBufferNano.writeUInt64(5, j3);
            }
            long j4 = this.sortRank;
            if (j4 != 0) {
                codedOutputByteBufferNano.writeUInt64(6, j4);
            }
            int i = this.displayType;
            if (i != 0) {
                codedOutputByteBufferNano.writeInt32(7, i);
            }
            super.writeTo(codedOutputByteBufferNano);
        }
    }

    /* compiled from: kSourceFile */
    public static final class WebWatchingUserInfo extends MessageNano {
        public static volatile WebWatchingUserInfo[] _emptyArray;
        public int liveAssistantType;
        public boolean offline;
        public boolean tuhao;
        public SimpleUserInfo user;

        public WebWatchingUserInfo() {
            clear();
        }

        public static WebWatchingUserInfo[] emptyArray() {
            if (_emptyArray == null) {
                synchronized (InternalNano.LAZY_INIT_LOCK) {
                    if (_emptyArray == null) {
                        _emptyArray = new WebWatchingUserInfo[0];
                    }
                }
            }
            return _emptyArray;
        }

        public WebWatchingUserInfo clear() {
            this.user = null;
            this.offline = false;
            this.tuhao = false;
            this.liveAssistantType = 0;
            this.cachedSize = -1;
            return this;
        }

        public int computeSerializedSize() {
            int computeSerializedSize = super.computeSerializedSize();
            SimpleUserInfo simpleUserInfo = this.user;
            if (simpleUserInfo != null) {
                computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(1, simpleUserInfo);
            }
            boolean z = this.offline;
            if (z) {
                computeSerializedSize += CodedOutputByteBufferNano.computeBoolSize(2, z);
            }
            boolean z2 = this.tuhao;
            if (z2) {
                computeSerializedSize += CodedOutputByteBufferNano.computeBoolSize(3, z2);
            }
            int i = this.liveAssistantType;
            if (i != 0) {
                return computeSerializedSize + CodedOutputByteBufferNano.computeInt32Size(4, i);
            }
            return computeSerializedSize;
        }

        public static WebWatchingUserInfo parseFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
            return new WebWatchingUserInfo().mergeFrom(codedInputByteBufferNano);
        }

        public static WebWatchingUserInfo parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
            return (WebWatchingUserInfo) MessageNano.mergeFrom(new WebWatchingUserInfo(), bArr);
        }

        public WebWatchingUserInfo mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
            while (true) {
                int readTag = codedInputByteBufferNano.readTag();
                if (readTag == 0) {
                    return this;
                }
                if (readTag == 10) {
                    if (this.user == null) {
                        this.user = new SimpleUserInfo();
                    }
                    codedInputByteBufferNano.readMessage(this.user);
                } else if (readTag == 16) {
                    this.offline = codedInputByteBufferNano.readBool();
                } else if (readTag == 24) {
                    this.tuhao = codedInputByteBufferNano.readBool();
                } else if (readTag == 32) {
                    int readInt32 = codedInputByteBufferNano.readInt32();
                    if (readInt32 == 0 || readInt32 == 1 || readInt32 == 2) {
                        this.liveAssistantType = readInt32;
                    }
                } else if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    return this;
                }
            }
        }

        public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            SimpleUserInfo simpleUserInfo = this.user;
            if (simpleUserInfo != null) {
                codedOutputByteBufferNano.writeMessage(1, simpleUserInfo);
            }
            boolean z = this.offline;
            if (z) {
                codedOutputByteBufferNano.writeBool(2, z);
            }
            boolean z2 = this.tuhao;
            if (z2) {
                codedOutputByteBufferNano.writeBool(3, z2);
            }
            int i = this.liveAssistantType;
            if (i != 0) {
                codedOutputByteBufferNano.writeInt32(4, i);
            }
            super.writeTo(codedOutputByteBufferNano);
        }
    }
}
