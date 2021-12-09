package com.ks;

import com.google.protobuf.nano.*;

import java.io.IOException;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Arrays;

public interface LiveSegmentMessages {

    /* compiled from: kSourceFile */
    public static final class LiveSegmentFeedInfo extends MessageNano {
        public static volatile LiveSegmentFeedInfo[] _emptyArray;
        public LiveSegmentReplayFeed feed;
        public long segmentOffsetTime;

        public LiveSegmentFeedInfo() {
            clear();
        }

        public static LiveSegmentFeedInfo[] emptyArray() {
            if (_emptyArray == null) {
                synchronized (InternalNano.LAZY_INIT_LOCK) {
                    if (_emptyArray == null) {
                        _emptyArray = new LiveSegmentFeedInfo[0];
                    }
                }
            }
            return _emptyArray;
        }

        public LiveSegmentFeedInfo clear() {
            this.feed = null;
            this.segmentOffsetTime = 0;
            this.cachedSize = -1;
            return this;
        }

        public int computeSerializedSize() {
            int computeSerializedSize = super.computeSerializedSize();
            LiveSegmentReplayFeed liveSegmentReplayFeed = this.feed;
            if (liveSegmentReplayFeed != null) {
                computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(1, liveSegmentReplayFeed);
            }
            long j2 = this.segmentOffsetTime;
            if (j2 != 0) {
                return computeSerializedSize + CodedOutputByteBufferNano.computeUInt64Size(2, j2);
            }
            return computeSerializedSize;
        }

        public static LiveSegmentFeedInfo parseFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
            return new LiveSegmentFeedInfo().mergeFrom(codedInputByteBufferNano);
        }

        public static LiveSegmentFeedInfo parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
            return (LiveSegmentFeedInfo) MessageNano.mergeFrom(new LiveSegmentFeedInfo(), bArr);
        }

        public LiveSegmentFeedInfo mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
            while (true) {
                int readTag = codedInputByteBufferNano.readTag();
                if (readTag == 0) {
                    return this;
                }
                if (readTag == 10) {
                    if (this.feed == null) {
                        this.feed = new LiveSegmentReplayFeed();
                    }
                    codedInputByteBufferNano.readMessage(this.feed);
                } else if (readTag == 16) {
                    this.segmentOffsetTime = codedInputByteBufferNano.readUInt64();
                } else if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    return this;
                }
            }
        }

        public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            LiveSegmentReplayFeed liveSegmentReplayFeed = this.feed;
            if (liveSegmentReplayFeed != null) {
                codedOutputByteBufferNano.writeMessage(1, liveSegmentReplayFeed);
            }
            long j2 = this.segmentOffsetTime;
            if (j2 != 0) {
                codedOutputByteBufferNano.writeUInt64(2, j2);
            }
            super.writeTo(codedOutputByteBufferNano);
        }
    }

    /* compiled from: kSourceFile */
    public static final class LiveSegmentFeedInfoResponse extends MessageNano {
        public static volatile LiveSegmentFeedInfoResponse[] _emptyArray;
        public String cursor;
        public LiveSegmentFeedInfo[] feedInfo;

        public LiveSegmentFeedInfoResponse() {
            clear();
        }

        public static LiveSegmentFeedInfoResponse[] emptyArray() {
            if (_emptyArray == null) {
                synchronized (InternalNano.LAZY_INIT_LOCK) {
                    if (_emptyArray == null) {
                        _emptyArray = new LiveSegmentFeedInfoResponse[0];
                    }
                }
            }
            return _emptyArray;
        }

        public LiveSegmentFeedInfoResponse clear() {
            this.feedInfo = LiveSegmentFeedInfo.emptyArray();
            this.cursor = "";
            this.cachedSize = -1;
            return this;
        }

        public int computeSerializedSize() {
            int computeSerializedSize = super.computeSerializedSize();
            LiveSegmentFeedInfo[] liveSegmentFeedInfoArr = this.feedInfo;
            if (liveSegmentFeedInfoArr != null && liveSegmentFeedInfoArr.length > 0) {
                int i = 0;
                while (true) {
                    LiveSegmentFeedInfo[] liveSegmentFeedInfoArr2 = this.feedInfo;
                    if (i >= liveSegmentFeedInfoArr2.length) {
                        break;
                    }
                    LiveSegmentFeedInfo liveSegmentFeedInfo = liveSegmentFeedInfoArr2[i];
                    if (liveSegmentFeedInfo != null) {
                        computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(1, liveSegmentFeedInfo);
                    }
                    i++;
                }
            }
            if (!this.cursor.equals("")) {
                return computeSerializedSize + CodedOutputByteBufferNano.computeStringSize(2, this.cursor);
            }
            return computeSerializedSize;
        }

        public static LiveSegmentFeedInfoResponse parseFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
            return new LiveSegmentFeedInfoResponse().mergeFrom(codedInputByteBufferNano);
        }

        public static LiveSegmentFeedInfoResponse parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
            return (LiveSegmentFeedInfoResponse) MessageNano.mergeFrom(new LiveSegmentFeedInfoResponse(), bArr);
        }

        public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            LiveSegmentFeedInfo[] liveSegmentFeedInfoArr = this.feedInfo;
            if (liveSegmentFeedInfoArr != null && liveSegmentFeedInfoArr.length > 0) {
                int i = 0;
                while (true) {
                    LiveSegmentFeedInfo[] liveSegmentFeedInfoArr2 = this.feedInfo;
                    if (i >= liveSegmentFeedInfoArr2.length) {
                        break;
                    }
                    LiveSegmentFeedInfo liveSegmentFeedInfo = liveSegmentFeedInfoArr2[i];
                    if (liveSegmentFeedInfo != null) {
                        codedOutputByteBufferNano.writeMessage(1, liveSegmentFeedInfo);
                    }
                    i++;
                }
            }
            if (!this.cursor.equals("")) {
                codedOutputByteBufferNano.writeString(2, this.cursor);
            }
            super.writeTo(codedOutputByteBufferNano);
        }

        public LiveSegmentFeedInfoResponse mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
            int i;
            while (true) {
                int readTag = codedInputByteBufferNano.readTag();
                if (readTag == 0) {
                    return this;
                }
                if (readTag == 10) {
                    int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 10);
                    LiveSegmentFeedInfo[] liveSegmentFeedInfoArr = this.feedInfo;
                    if (liveSegmentFeedInfoArr == null) {
                        i = 0;
                    } else {
                        i = liveSegmentFeedInfoArr.length;
                    }
                    int i2 = repeatedFieldArrayLength + i;
                    LiveSegmentFeedInfo[] liveSegmentFeedInfoArr2 = new LiveSegmentFeedInfo[i2];
                    if (i != 0) {
                        System.arraycopy(this.feedInfo, 0, liveSegmentFeedInfoArr2, 0, i);
                    }
                    while (i < i2 - 1) {
                        liveSegmentFeedInfoArr2[i] = new LiveSegmentFeedInfo();
                        codedInputByteBufferNano.readMessage(liveSegmentFeedInfoArr2[i]);
                        codedInputByteBufferNano.readTag();
                        i++;
                    }
                    liveSegmentFeedInfoArr2[i] = new LiveSegmentFeedInfo();
                    codedInputByteBufferNano.readMessage(liveSegmentFeedInfoArr2[i]);
                    this.feedInfo = liveSegmentFeedInfoArr2;
                } else if (readTag == 18) {
                    this.cursor = codedInputByteBufferNano.readString();
                } else if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    return this;
                }
            }
        }
    }

    /* compiled from: kSourceFile */
    public static final class LiveSegmentReplayFeed extends MessageNano {
        public static volatile LiveSegmentReplayFeed[] _emptyArray;
        public int compressionType;
        public long liveOffsetTime;
        public byte[] payload;

        @Retention(RetentionPolicy.SOURCE)
        /* compiled from: kSourceFile */
        public @interface CompressionType {
        }

        public LiveSegmentReplayFeed() {
            clear();
        }

        public static LiveSegmentReplayFeed[] emptyArray() {
            if (_emptyArray == null) {
                synchronized (InternalNano.LAZY_INIT_LOCK) {
                    if (_emptyArray == null) {
                        _emptyArray = new LiveSegmentReplayFeed[0];
                    }
                }
            }
            return _emptyArray;
        }

        public LiveSegmentReplayFeed clear() {
            this.compressionType = 0;
            this.payload = WireFormatNano.EMPTY_BYTES;
            this.liveOffsetTime = 0;
            this.cachedSize = -1;
            return this;
        }

        public int computeSerializedSize() {
            int computeSerializedSize = super.computeSerializedSize();
            int i = this.compressionType;
            if (i != 0) {
                computeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(1, i);
            }
            if (!Arrays.equals(this.payload, WireFormatNano.EMPTY_BYTES)) {
                computeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(2, this.payload);
            }
            long j2 = this.liveOffsetTime;
            if (j2 != 0) {
                return computeSerializedSize + CodedOutputByteBufferNano.computeUInt64Size(3, j2);
            }
            return computeSerializedSize;
        }

        public static LiveSegmentReplayFeed parseFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
            return new LiveSegmentReplayFeed().mergeFrom(codedInputByteBufferNano);
        }

        public static LiveSegmentReplayFeed parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
            return (LiveSegmentReplayFeed) MessageNano.mergeFrom(new LiveSegmentReplayFeed(), bArr);
        }

        public LiveSegmentReplayFeed mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
            while (true) {
                int readTag = codedInputByteBufferNano.readTag();
                if (readTag == 0) {
                    return this;
                }
                if (readTag == 8) {
                    int readInt32 = codedInputByteBufferNano.readInt32();
                    if (readInt32 == 0 || readInt32 == 1 || readInt32 == 2) {
                        this.compressionType = readInt32;
                    }
                } else if (readTag == 18) {
                    this.payload = codedInputByteBufferNano.readBytes();
                } else if (readTag == 24) {
                    this.liveOffsetTime = codedInputByteBufferNano.readUInt64();
                } else if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    return this;
                }
            }
        }

        public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            int i = this.compressionType;
            if (i != 0) {
                codedOutputByteBufferNano.writeInt32(1, i);
            }
            if (!Arrays.equals(this.payload, WireFormatNano.EMPTY_BYTES)) {
                codedOutputByteBufferNano.writeBytes(2, this.payload);
            }
            long j2 = this.liveOffsetTime;
            if (j2 != 0) {
                codedOutputByteBufferNano.writeUInt64(3, j2);
            }
            super.writeTo(codedOutputByteBufferNano);
        }
    }
}
