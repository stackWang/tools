package com.ks;

import com.alibaba.fastjson.JSON;
import com.google.protobuf.nano.InvalidProtocolBufferNanoException;
import com.ks.ext.SocketMessages$SocketMessage;
import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;

public class Test {

    public static void main(String[] args) throws IOException {
//        String path = "/Users/stark/Downloads/抖音/hexs/21/";
        String path = "D:\\myfile\\ZH1190\\Desktop\\extra\\hexs";
        File file = new File(path);
        for (File listFile : file.listFiles()) {
            byte[] bytes = FileUtils.readFileToByteArray(listFile);
//            byte[] bytes = FileUtils.readFileToByteArray(new File(path + "websocket_000042_server.bin"));
            try {
                SocketMessages$SocketMessage pack = SocketMessages$SocketMessage.parseFrom(bytes);
                if(pack.payload != null && pack.payload.length > 0){
                    byte[] data = pack.compressionType == 3 ? decodePayload(pack.payload) : pack.payload;
//                    const code = pack.payloadType as keyof typeof SC_COMMAND_MAP
//                    const type = SC_COMMAND_MAP[code]
                    int type = pack.payloadType;
                    String s = decode(type, data);
                    System.out.printf("%s -> %s %s str ->\n\n", listFile.getName(), type, s, new String(bytes));
                }
            }catch (Exception e){
                System.err.println(e.getMessage());
            }
//            break;
        }
    }

    private static String decode(int type, byte[] data) throws InvalidProtocolBufferNanoException {

        //  101: 'SC_HEARTBEAT_ACK',
        //  103: 'SC_ERROR',
        //  105: 'SC_INFO',
        //  300: 'SC_ENTER_ROOM_ACK',
        //  310: 'SC_FEED_PUSH',
        //  330: 'SC_RED_PACK_FEED',
        //  340: 'SC_LIVE_WATCHING_LIST',
        //  370: 'SC_GUESS_OPENED',
        //  371: 'SC_GUESS_CLOSED',
        //  412: 'SC_RIDE_CHANGED',
        //  441: 'SC_BET_CHANGED',
        //  442: 'SC_BET_CLOSED',
        //  645: 'SC_LIVE_SPECIAL_ACCOUNT_CONFIG_STATE',
        Object obj = null;
        switch (type){
            case 101:
                obj = SocketMessages.SCHeartbeatAck.parseFrom(data);
                break;
            case 103:
                obj = SocketMessages.SCError.parseFrom(data);
                break;
            case 105:
                obj = SocketMessages.SCInfo.parseFrom(data);
                break;
            case 300:
                obj = LiveStreamWebMessages.SCWebEnterRoomAck.parseFrom(data);
                break;
            case 310:
                obj = LiveStreamWebMessages.SCWebFeedPush.parseFrom(data);
                break;
            case 330:
                obj = LiveStreamWebMessages.SCWebCurrentRedPackFeed.parseFrom(data);
                break;
            case 340:
                obj = LiveStreamWebMessages.SCWebLiveWatchingUsers.parseFrom(data);
                break;
            case 370:
                obj = LiveStreamWebMessages.SCWebGuessOpened.parseFrom(data);
                break;
            case 371:
                obj = LiveStreamWebMessages.SCWebGuessClosed.parseFrom(data);
                break;
            case 412:
                obj = LiveStreamWebMessages.SCWebRideChanged.parseFrom(data);
                break;
            case 441:
                obj = LiveStreamWebMessages.SCWebBetChanged.parseFrom(data);
                break;
            case 442:
                obj = LiveStreamWebMessages.SCWebBetClosed.parseFrom(data);
                break;
            case 645:
                obj = LiveSpecialAccountConfigProto.SCLiveSpecialAccountConfigState.parseFrom(data);
                break;
        }
        return JSON.toJSONString(obj, true);
    }

    // aes接码
    private static byte[] decodePayload(byte[] payload) {
        // const h = decodeLib.codec.utf8String.toBits('PPbzKKL7NB15leYy')
        //const v = decodeLib.codec.utf8String.toBits('JRODKJiolJ9xqso0')
        //const y = decodeLib.cipher.aes
        //const m = new y(h)
        //
        //function decodePayload(t: Uint8Array) {
        //  return new Uint8Array(
        //    decodeLib.codec.arrayBuffer.fromBits(
        //      decodeLib.mode.cbc.decrypt(
        //        m,
        //        decodeLib.codec.arrayBuffer.toBits(t.buffer.slice(t.byteOffset, t.byteLength + t.byteOffset)),
        //        v,
        //        []
        //      ),
        //      !1
        //    )
        //  )
        //}
        return new byte[0];
    }
}
