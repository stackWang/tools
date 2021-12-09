package com.ks.ext;

import com.google.protobuf.nano.*;
import com.ks.ClientEvent;

import java.io.IOException;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Arrays;

/* compiled from: kSourceFile */
public final class SocketMessages$SocketMessage extends MessageNano {
    public int payloadType = 0;
    public int compressionType = 0;

    /* renamed from: c  reason: collision with root package name */
    public byte[] payload = WireFormatNano.EMPTY_BYTES;
    public long d = 0;
    public String e = "";

    @Retention(RetentionPolicy.SOURCE)
    /* compiled from: kSourceFile */
    public @interface CompressionType {
    }


    public static SocketMessages$SocketMessage parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (SocketMessages$SocketMessage) MessageNano.mergeFrom(new SocketMessages$SocketMessage(), bArr);
    }

    public SocketMessages$SocketMessage() {
        this.cachedSize = -1;
    }

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
        long j2 = this.d;
        if (j2 != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.computeUInt64Size(4, j2);
        }
        if (!this.e.equals("")) {
            return computeSerializedSize + CodedOutputByteBufferNano.computeStringSize(5, this.e);
        }
        return computeSerializedSize;
    }

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
        long j2 = this.d;
        if (j2 != 0) {
            codedOutputByteBufferNano.writeUInt64(4, j2);
        }
        if (!this.e.equals("")) {
            codedOutputByteBufferNano.writeString(5, this.e);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    public MessageNano mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                break;
            } else if (readTag == 8) {
                int readInt32 = codedInputByteBufferNano.readInt32();
                if (!(readInt32 == 0 || readInt32 == 1 || readInt32 == 3 || readInt32 == 4 || readInt32 == 370 || readInt32 == 371)) {
                    switch (readInt32) {
                        case 51:
                        case 340:
                        case ClientEvent.TaskEvent.Action.KARAOKE_RECORD:
                        case ClientEvent.TaskEvent.Action.IMPORT_VIDEO:
                        case ClientEvent.TaskEvent.Action.ADD_LOCATION:
                        case ClientEvent.TaskEvent.Action.ADD_DESCRIPTION:
                        case ClientEvent.TaskEvent.Action.SET_PRODUCTION_STATUS:
                        case ClientEvent.TaskEvent.Action.FOCUS_ON_SCREEN:
                        case ClientEvent.TaskEvent.Action.USE_MAGIC_FACE:
                        case ClientEvent.TaskEvent.Action.PUBLISH_FULL_VIDEO:
                        case ClientEvent.TaskEvent.Action.CLICK_OPERATION_MAGIC_FACE_ENTRANCE:
                        case ClientEvent.TaskEvent.Action.CLOSE_OPERATION_MAGIC_FACE_ENTRANCE:
                        case ClientEvent.TaskEvent.Action.SHOW_MAGIC_FACE_ENTRANCE:
                        case ClientEvent.TaskEvent.Action.VIEW_OTHERS_HOW_TO_TAKE:
                        case ClientEvent.TaskEvent.Action.SHOW_MAGIC_FACE_COVER:
                        case ClientEvent.TaskEvent.Action.USE_SOUND_TRACK_AS_MUSIC:
                        case ClientEvent.TaskEvent.Action.KUAISHAN_TEMPLATE_SELECT_OPERATION:
                        case ClientEvent.TaskEvent.Action.KUAISHAN_TEMPLATE_EDIT_OPERATION:
                        case ClientEvent.TaskEvent.Action.LIVE_SOUND_EFFECT_AUTO_POPUP:
                        case 501:
                        case ClientEvent.TaskEvent.Action.CLICK_AUDIENCE_HEAD:
                        case ClientEvent.TaskEvent.Action.POST_LIVE_COMMENT:
                        case ClientEvent.TaskEvent.Action.SEND_LIVE_QUIZ_TO_AUDIENCE:
                        case ClientEvent.TaskEvent.Action.PACK_UP_LIVE_QUIZ_DIALOG:
                        case ClientEvent.TaskEvent.Action.SHOW_LIVE_QUIZ_DIALOG:
                        case ClientEvent.TaskEvent.Action.VIEW_EXCHANGE_AWARD:
                        case ClientEvent.TaskEvent.Action.LIVE_QUIZ_FAIL_DIALOG:
                        case ClientEvent.TaskEvent.Action.LIVE_QUIZ_LATE_WATCH_END_DIALOG:
                        case ClientEvent.TaskEvent.Action.QUIZ_BALANCE_BIND_ACCOUNT:
                        case ClientEvent.TaskEvent.Action.LIVE_QUIZ_URGENT_EXCEPTION_DIALOG:
                        case ClientEvent.TaskEvent.Action.LIVE_QUIZ_PROFILE_DIALOG:
                        case ClientEvent.TaskEvent.Action.CLICK_MY_SHOP_ENTRANCE:
                        case ClientEvent.TaskEvent.Action.ENTER_INTO_MY_WALLET:
                        case ClientEvent.TaskEvent.Action.MODIFY_GUESS_BONUS:
                        case ClientEvent.TaskEvent.Action.START_GUESS:
                        case ClientEvent.TaskEvent.Action.SHOW_LIVE_GUESS_RESULT:
                        case ClientEvent.TaskEvent.Action.START_WISH:
                        case ClientEvent.TaskEvent.Action.STOP_WISH:
                        case 581:
                        case 582:
                        case 583:
                        case 584:
                        case 585:
                        case 586:
                        case 587:
                        case 588:
                        case 590:
                        case 591:
                        case 592:
                        case 593:
                        case 594:
                        case 595:
                        case 596:
                        case ClientEvent.TaskEvent.Action.PICTURE_UPLOAD:
                        case ClientEvent.TaskEvent.Action.SEGMENT_UPLOAD:
                        case ClientEvent.TaskEvent.Action.PART_UPLOAD:
                        case ClientEvent.TaskEvent.Action.REQUEST_SEGMENT_INFO:
                        case ClientEvent.TaskEvent.Action.UPLOAD_MAKE_FILE:
                        case ClientEvent.TaskEvent.Action.UPLOAD_COVER:
                        case ClientEvent.TaskEvent.Action.UPLOAD_MUSIC:
                        case ClientEvent.TaskEvent.Action.UPLOAD_ATLAS:
                        case ClientEvent.TaskEvent.Action.REQUEST_ATLAS_KEY:
                        case ClientEvent.TaskEvent.Action.PUBLISH_ATLAS:
                        case ClientEvent.TaskEvent.Action.UPLOAD_KARAOKE_VIDEO:
                        case ClientEvent.TaskEvent.Action.UPLOAD_KARAOKE_AUDIO:
                        case ClientEvent.TaskEvent.Action.WHOLE_UPLOAD:
                        case ClientEvent.TaskEvent.Action.REQUEST_PIPELINE_UPLOAD_KEY:
                        case ClientEvent.TaskEvent.Action.UPLOAD_PIPELINE_PAYLOAD:
                        case 620:
                        case 621:
                        case 622:
                        case 623:
                        case 630:
                        case 631:
                        case 632:
                        case 633:
                        case 634:
                        case 641:
                        case 642:
                        case 643:
                        case 644:
                        case 645:
                        case 646:
                        case 647:
                        case 648:
                        case 649:
                        case 650:
                        case 651:
                        case 652:
                        case 653:
                        case 654:
                        case 655:
                        case 656:
                        case 657:
                        case 660:
                        case 661:
                        case 662:
                        case 663:
                        case 664:
                        case 665:
                        case 666:
                        case 667:
                        case 670:
                        case 671:
                        case 672:
                        case 673:
                        case 674:
                        case 675:
                        case 676:
                        case 677:
                        case 678:
                        case 679:
                        case 680:
                        case 681:
                        case 682:
                        case 683:
                        case 684:
                        case 685:
                        case 686:
                        case 687:
                        case 688:
                        case 689:
                        case 690:
                        case 691:
                        case 692:
                        case 693:
                        case 694:
                        case 695:
                        case 696:
                        case 697:
                        case 698:
                        case 699:
                        case ClientEvent.TaskEvent.Action.CAST_SCREEN:
                        case ClientEvent.TaskEvent.Action.CREATE_QRCODE:
                        case ClientEvent.TaskEvent.Action.CHANGE_ENCODE_LEVEL:
                        case ClientEvent.TaskEvent.Action.INSTALL_LIVEMATE:
                        case ClientEvent.TaskEvent.Action.GET_HARDWARE_ENCODER_INFO:
                        case 705:
                        case 706:
                        case 707:
                        case 708:
                        case 709:
                        case 710:
                        case 711:
                        case 712:
                        case 713:
                        case 714:
                        case 715:
                        case 716:
                        case 717:
                        case 718:
                        case 719:
                        case 720:
                        case 721:
                        case 722:
                        case 723:
                            break;
                        default:
                            switch (readInt32) {
                                case 320:
                                case 321:
                                case 322:
                                case 323:
                                case 324:
                                case 325:
                                case 326:
                                case 327:
                                case 328:
                                case 329:
                                case 330:
                                case 331:
                                    break;
                                default:
                                    switch (readInt32) {
                                        case 380:
                                        case 381:
                                        case 382:
                                        case 383:
                                        case 384:
                                        case 385:
                                        case 386:
                                        case 387:
                                        case 388:
                                        case 389:
                                        case 390:
                                        case 391:
                                            break;
                                        default:
                                            switch (readInt32) {
                                                case 399:
                                                case 400:
                                                case ClientEvent.TaskEvent.Action.FINISH_ADVANCED_EDIT:
                                                case ClientEvent.TaskEvent.Action.FINISH_PREVIEW_RENDER:
                                                case ClientEvent.TaskEvent.Action.FINISH_EFFECT_EDIT:
                                                    break;
                                                default:
                                                    switch (readInt32) {
                                                        case ClientEvent.TaskEvent.Action.SHOW_BUILT_IN_MUSIC:
                                                        case ClientEvent.TaskEvent.Action.SHOW_MAGIC_FACE:
                                                        case ClientEvent.TaskEvent.Action.RECORD_FEATURE_GUIDE_DIALOG:
                                                            break;
                                                        default:
                                                            switch (readInt32) {
                                                                case ClientEvent.TaskEvent.Action.CAMERA_LAUNCH:
                                                                case ClientEvent.TaskEvent.Action.CAMERA_INIT:
                                                                case ClientEvent.TaskEvent.Action.SWITCH_CAMERA:
                                                                case ClientEvent.TaskEvent.Action.LAUNCH_MAGIC_FACE:
                                                                case ClientEvent.TaskEvent.Action.PICK_MUSIC:
                                                                case ClientEvent.TaskEvent.Action.LAUNCH_FACEPP:
                                                                case ClientEvent.TaskEvent.Action.ALBUM_LAUNCH:
                                                                case ClientEvent.TaskEvent.Action.PICK_PHOTO:
                                                                case ClientEvent.TaskEvent.Action.IMPORTED_VIDEO_CLIP:
                                                                case ClientEvent.TaskEvent.Action.IMPORT_LOCAL_ALBUM_VIDEO:
                                                                case ClientEvent.TaskEvent.Action.FINISH_RECORDING:
                                                                case ClientEvent.TaskEvent.Action.PREVIEW_LAUNCH:
                                                                case ClientEvent.TaskEvent.Action.PREVIEW_INIT:
                                                                    break;
                                                                default:
                                                                    switch (readInt32) {
                                                                        case ClientEvent.TaskEvent.Action.EDIT_VIDEO_VIDEO_PREVIEW:
                                                                        case ClientEvent.TaskEvent.Action.EDIT_VIDEO_THUMBNAIL:
                                                                        case ClientEvent.TaskEvent.Action.EDIT_VIDEO_VIDEO_CLIP:
                                                                        case 463:
                                                                            break;
                                                                        default:
                                                                            switch (readInt32) {
                                                                                case ClientEvent.TaskEvent.Action.GRANT_THUMBNAIL_FIRST_FRAME:
                                                                                case ClientEvent.TaskEvent.Action.MV_TEMPLATE_LOADING:
                                                                                case ClientEvent.TaskEvent.Action.MV_COMPOSITE:
                                                                                    break;
                                                                                default:
                                                                                    switch (readInt32) {
                                                                                        case ClientEvent.TaskEvent.Action.POST_CLICK_CREATE_GROUP:
                                                                                        case ClientEvent.TaskEvent.Action.POST_CLICK_SHOW_ALL_GROUPS:
                                                                                        case ClientEvent.TaskEvent.Action.FOLLOW_SHOOT_SWITCH_FLOATING_WINDOW:
                                                                                        case ClientEvent.TaskEvent.Action.EDIT_NEW_FEATURE_GUIDE_POP:
                                                                                        case ClientEvent.TaskEvent.Action.RECORD_PRODUCTION_SHOW_OPERATION:
                                                                                            break;
                                                                                        default:
                                                                                            switch (readInt32) {
                                                                                                case ClientEvent.TaskEvent.Action.VIDEO_COVER_SELECTION:
                                                                                                case ClientEvent.TaskEvent.Action.VIDEO_COVER_SELECTION_UPLOAD:
                                                                                                case ClientEvent.TaskEvent.Action.VIDEO_CLIP_THUMB:
                                                                                                case ClientEvent.TaskEvent.Action.CHORUS_RECORD:
                                                                                                    break;
                                                                                                default:
                                                                                                    switch (readInt32) {
                                                                                                        case 101:
                                                                                                        case 102:
                                                                                                        case 103:
                                                                                                        case 104:
                                                                                                        case 105:
                                                                                                            break;
                                                                                                        default:
                                                                                                            switch (readInt32) {
                                                                                                                case 200:
                                                                                                                case 201:
                                                                                                                case 202:
                                                                                                                case 203:
                                                                                                                case 204:
                                                                                                                case 205:
                                                                                                                case 206:
                                                                                                                    break;
                                                                                                                default:
                                                                                                                    switch (readInt32) {
                                                                                                                        case 300:
                                                                                                                        case 301:
                                                                                                                        case 302:
                                                                                                                        case 303:
                                                                                                                        case 304:
                                                                                                                        case 305:
                                                                                                                        case 306:
                                                                                                                        case 307:
                                                                                                                        case 308:
                                                                                                                            break;
                                                                                                                        default:
                                                                                                                            switch (readInt32) {
                                                                                                                                case 310:
                                                                                                                                case 311:
                                                                                                                                case 312:
                                                                                                                                    break;
                                                                                                                                default:
                                                                                                                                    switch (readInt32) {
                                                                                                                                        case 350:
                                                                                                                                        case 351:
                                                                                                                                        case 352:
                                                                                                                                        case 353:
                                                                                                                                        case 354:
                                                                                                                                        case 355:
                                                                                                                                        case 356:
                                                                                                                                        case 357:
                                                                                                                                            break;
                                                                                                                                        default:
                                                                                                                                            switch (readInt32) {
                                                                                                                                                case 361:
                                                                                                                                                case 362:
                                                                                                                                                case 363:
                                                                                                                                                    break;
                                                                                                                                                default:
                                                                                                                                                    continue;
                                                                                                                                            }
                                                                                                                                    }
                                                                                                                            }
                                                                                                                    }
                                                                                                            }
                                                                                                    }
                                                                                            }
                                                                                    }
                                                                            }
                                                                    }
                                                            }
                                                    }
                                            }
                                    }
                            }
                    }
                }
                this.payloadType = readInt32;
            } else if (readTag == 16) {
                int readInt322 = codedInputByteBufferNano.readInt32();
                if (readInt322 == 0 || readInt322 == 1 || readInt322 == 2 || readInt322 == 3) {
                    this.compressionType = readInt322;
                }
            } else if (readTag == 26) {
                this.payload = codedInputByteBufferNano.readBytes();
            } else if (readTag == 32) {
                this.d = codedInputByteBufferNano.readUInt64();
            } else if (readTag == 42) {
                this.e = codedInputByteBufferNano.readString();
            } else if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                break;
            }
        }
        return this;
    }
}
