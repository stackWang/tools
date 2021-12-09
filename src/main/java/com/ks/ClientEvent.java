package com.ks;

import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.WireFormatNano;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Map;

/* compiled from: kSourceFile */
public interface ClientEvent {

    /* compiled from: kSourceFile */
    public static final class ElementPackage {
        public static volatile ElementPackage[] _emptyArray;
        public int action;
        public String action2;
        public int index;
        public String name;
        public String params;
        public int status;
        public int type;
        public double value;

        @Retention(RetentionPolicy.SOURCE)
        /* compiled from: kSourceFile */
        public @interface Status {
            public static final int CHECKED = 1;
            public static final int UNCHECKED = 2;
            public static final int UNKNOWN2 = 0;
        }

        @Retention(RetentionPolicy.SOURCE)
        /* compiled from: kSourceFile */
        public @interface Type {
            public static final int BANNER = 16;
            public static final int BUBBLE = 17;
            public static final int BUTTON = 1;
            public static final int CARD = 11;
            public static final int CELL = 15;
            public static final int ICON = 3;
            public static final int IMAGE = 4;
            public static final int INPUT_BOX = 8;
            public static final int LABEL = 2;
            public static final int LINK = 6;
            public static final int MENU = 5;
            public static final int NOTIFICATION = 10;
            public static final int OPTION_BOX = 9;
            public static final int PAGE = 13;
            public static final int POPUP_WINDOW = 18;
            public static final int TAB = 7;
            public static final int UNKNOWN1 = 0;
            public static final int VIDEO = 14;
            public static final int VIEW = 12;
        }


        public ElementPackage() {
            clear();
        }

        public static ElementPackage[] emptyArray() {
            if (_emptyArray == null) {
                synchronized (InternalNano.LAZY_INIT_LOCK) {
                    if (_emptyArray == null) {
                        _emptyArray = new ElementPackage[0];
                    }
                }
            }
            return _emptyArray;
        }

        public ElementPackage clear() {
            this.type = 0;
            this.index = 0;
            this.name = "";
            this.value = 0.0d;
            this.status = 0;
            this.action = 0;
            this.action2 = "";
            this.params = "";
            return this;
        }



    }

    /* compiled from: kSourceFile */
    public static final class TaskEvent {
        public static volatile TaskEvent[] _emptyArray;
        public int action;
        public String action2;
        public AreaPackage areaPackage;
        public String contentWrapper;
        public ElementPackage elementPackage;
        public String internalStidContainerJson;
        public float ratio;
        public ElementPackage referElementPackage;
        public UrlPackage referUrlPackage;
        public ResultPackage resultPackage;
        public String sessionId;
        public int status;
        public int trigger;
        public UrlPackage urlPackage;

        @Retention(RetentionPolicy.SOURCE)
        /* compiled from: kSourceFile */
        public @interface Action {
            public static final int ACCOUNT_SECURITY_ADD_DEVICE = 38;
            public static final int ACCOUNT_SECURITY_CLOSE = 37;
            public static final int ACCOUNT_SECURITY_DELETE_DEVICE = 39;
            public static final int ACCOUNT_SECURITY_OPEN = 36;
            public static final int ACCOUNT_SECURITY_RENAME_DEVICE = 43;
            public static final int ADD_ACCOUNT = 30802;
            public static final int ADD_ACCOUNT_SUCCSESS = 30805;
            public static final int ADD_DESCRIPTION = 417;
            public static final int ADD_LOCATION = 416;
            public static final int ADD_LYRICS = 1529;
            public static final int ADD_MORE_GROUP_MEMBER = 30143;
            public static final int ADD_PICTURE = 1530;
            public static final int ADD_PPT = 1532;
            public static final int ADD_PROFILE = 823;
            public static final int ADD_SONG_NAME = 1528;
            public static final int ADD_STAR_FRIEND = 30341;
            public static final int ADD_TEXT = 1531;
            public static final int ADD_TOPIC = 1381;
            public static final int ADD_TO_COLLECTION = 1540;
            public static final int AGREE_TO_FOLLOW = 1157;
            public static final int ALBUMLD_SUBSCRIBED_MORE_CLICK = 30849;
            public static final int ALBUM_CLICK = 30836;
            public static final int ALBUM_LAUNCH = 436;
            public static final int ALBUM_SHOW = 30852;
            public static final int ALLPY_MIC_LIST_PAGE = 30194;
            public static final int ANDROID_PATCH_COMPOSITE = 1062;
            public static final int ANDROID_PATCH_LOAD = 1063;
            public static final int ANDROID_PATCH_ROLLBACK = 1064;
            public static final int ANDROID_QUERY_PATCH = 1061;
            public static final int ANNOUNCE_GUESS_RESULT = 564;
            public static final int APPLY_COURSE = 1212;
            public static final int APPLY_LIST_ACCEPT_CLICK = 30203;
            public static final int APPLY_LIST_PHOTO_CLICK = 30204;
            public static final int APPLY_MIC = 30198;
            public static final int APPLY_MIC_ENTRANCE_CLICK = 30202;
            public static final int APPSFLYER_TRACK_INSTALL = 1426;
            public static final int APP_LAUNCH_DEEPLINK = 30857;
            public static final int APP_SHORTCUT = 1459;
            public static final int ASK_QUESTION = 1142;
            public static final int ATLAS_MEMORY_REFINE = 484;
            public static final int AT_PHOTO_COMMENT = 304;
            public static final int AUDITION_MUSIC = 904;
            public static final int AUTO_CONNECT_BLE = 1183;
            public static final int AUTO_LOGIN = 1490;
            public static final int AUTO_PLAY_VIDEO = 315;
            public static final int BACK = 30406;
            public static final int BATCH_HTTP_DNS_RESOLVE_HOST = 49;
            public static final int BIND_PHONE_SUCCESS = 30315;
            public static final int BIND_PHONE_SUCCESS_LOGIN_EXCEPTION = 1879;
            public static final int BONUS_DETAILS_NEW_USER_RETENTION_TASK = 30831;
            public static final int BROADCAST_RED_PACKET_PROFILE = 30091;
            public static final int BULLET_ACCEPT = 30201;
            public static final int BUSINESS_PLATFORM_PROFILEERROR = 30970;
            public static final int BUTTON_LYRICS_CONTROL = 30745;
            public static final int CAMERA_INIT = 431;
            public static final int CAMERA_LAUNCH = 430;
            public static final int CAMERA_RESPONSE_FOR_CLICK = 429;
            public static final int CAMERA_SELECT_MUSIC = 1221;
            public static final int CANCEL_APPLY_MIC = 30199;
            public static final int CANCEL_COLLECT = 1395;
            public static final int CANCEL_COLLECT_MUSIC = 1166;
            public static final int CANCEL_COLLECT_TAG = 1380;
            public static final int CANCEL_GIVEUP_UPLOAD_PRODUCTION = 1240;
            public static final int CANCEL_HATE_PHOTO = 840;
            public static final int CANCEL_HEADTIPS = 812;
            public static final int CANCEL_INVITATION = 1194;
            public static final int CANCEL_LIKE_COMMENT = 321;
            public static final int CANCEL_LIVE_GUESS = 559;
            public static final int CANCEL_MOMENT_LIKE = 30132;
            public static final int CANCEL_MORE_DIALOG = 881;
            public static final int CANCEL_PAGE = 824;
            public static final int CANCEL_PAY = 1506;
            public static final int CANCEL_RE_LOGIN_DIALOG = 996;
            public static final int CANCEL_SELECT_SHOW_WISH_LIST = 1537;
            public static final int CANCEL_SHARE_KWAI_TOKEN = 1134;
            public static final int CANCEL_SUBSCRIBE_SERIES = 1905;
            public static final int CANCEL_UNFOLLOW_RECOMMENDATION_TIPS = 30405;
            public static final int CANCEL_UPGRADE_POPUP_WINDOW = 1123;
            public static final int CANCEL_VERTICAL_MORE = 816;
            public static final int CANCEL_VIDEO_DOWNLOAD = 1167;
            public static final int CANCEL_VIEW_IN_LIVE_QUIZ_DIALOG = 524;
            public static final int CANCEL_VOTE_DYNAMIC = 1407;
            public static final int CANCEL_WELCOME_RATING_DIALOG = 1701;
            public static final int CAST_SCREEN = 700;
            public static final int CHANGE_BROWSE_PATTERN = 30268;
            public static final int CHANGE_DUAL_SIM_CELLULAR_SIM_CARD = 1785;
            public static final int CHANGE_DUAL_SIM_SIM_CARD = 1784;
            public static final int CHANGE_ENCODE_LEVEL = 702;
            public static final int CHANGE_SINGLE_SIM_SIM_CARD = 1783;
            public static final int CHAT_TRAN_VEDIO_LIVE = 30192;
            public static final int CHECK_APP_RATING_CONDITION = 1181;
            public static final int CHECK_CONFIRM = 30884;
            public static final int CHINA_MOBILE_QUICK_LOGIN_VALIDATION = 1282;
            public static final int CHOOSE_ACCOUNT = 1350;
            public static final int CHORUS_RECORD = 483;
            public static final int CLCIK_EDIT_GIFT = 1717;
            public static final int CLEAR_CACHE = 938;
            public static final int CLEAR_CHAT = 1086;
            public static final int CLEAR_SEARCH_HISTORY = 1171;
            public static final int CLICE_LIVE_PK_END_ADVANCE_FEEDBACK = 1552;
            public static final int CLICE_LIVE_PK_END_ADVANCE_NOLONGER_MATCH = 1826;
            public static final int CLICK_ABOUT_KWAI = 1634;
            public static final int CLICK_ABOUT_LIVEMATE_BUTTON = 1496;
            public static final int CLICK_ACCEPT = 1147;
            public static final int CLICK_ACCOMPANY = 1690;
            public static final int CLICK_ACCOUNT_EXCEPTION_CANCEL = 30443;
            public static final int CLICK_ACCOUNT_EXCEPTION_LOGIN = 30442;
            public static final int CLICK_ACCOUNT_SAFETY_OPTION = 1202;
            public static final int CLICK_ACTIVE_ACCOUNT = 30834;
            public static final int CLICK_ACTIVITY_ENTRANCE = 1605;
            public static final int CLICK_ADD_BUTTON = 1473;
            public static final int CLICK_ADD_CUSTOM_STICKER = 30261;
            public static final int CLICK_ADD_FRIEND_ENTRANCE = 1174;
            public static final int CLICK_ADD_GIFT = 1714;
            public static final int CLICK_ADD_ICON = 1739;
            public static final int CLICK_ADD_PROFILE_TAG = 30103;
            public static final int CLICK_ADD_SHORTCUT_TO_DESKTOP = 1863;
            public static final int CLICK_ADD_WISH = 1713;
            public static final int CLICK_ADMIN_SETTING = 1298;
            public static final int CLICK_ADMIN_SET_ENTRANCE = 1751;
            public static final int CLICK_ADVERTISING_AGAIN = 30608;
            public static final int CLICK_AGGREGATION_NOTIFICATION = 1185;
            public static final int CLICK_ALBUM_BUTTON = 1786;
            public static final int CLICK_ALLOW_SPEAK = 1687;
            public static final int CLICK_ALL_QUESTIONS_TAB = 30473;
            public static final int CLICK_ANCHOR_AUDIENCE_CHAT_FEED_ACCEPT = 30689;
            public static final int CLICK_ANCHOR_AUDIENCE_VIDEO_CHAT_FOLLOW = 30863;
            public static final int CLICK_ANCHOR_AUDIENCE_VOICE_CHAT_FOLLOW = 30862;
            public static final int CLICK_ANCHOR_CHAT_FOLLOW = 30687;
            public static final int CLICK_ANCHOR_CHAT_INVITATION_POPUP_ACCEPT = 30683;
            public static final int CLICK_ANCHOR_CHAT_INVITATION_POPUP_NOMORE_INVITATION = 30685;
            public static final int CLICK_ANCHOR_CHAT_INVITATION_POPUP_REFUSE = 30684;
            public static final int CLICK_ANCHOR_CHAT_OPEN_TIPS = 30675;
            public static final int CLICK_ANCHOR_CHAT_RECOMMEND_LIST_INFORMATION = 30679;
            public static final int CLICK_ANCHOR_CHAT_RECOMMEND_LIST_INVITATION = 30680;
            public static final int CLICK_ANCHOR_CHAT_RECOMMEND_LIST_NOMORE_INVITATION = 30681;
            public static final int CLICK_ANCHOR_CHAT_RECOMMEND_LIST_TAB = 30678;
            public static final int CLICK_ANCHOR_CHAT_USE_TIPS = 30692;
            public static final int CLICK_ANCHOR_PK_GUIDE = 30672;
            public static final int CLICK_APPLY_CARD_AND_GET_MONEY = 1315;
            public static final int CLICK_ARRIVE = 1695;
            public static final int CLICK_ASSOCIATIVE_WORD = 1173;
            public static final int CLICK_ATMOSPHERE = 1524;
            public static final int CLICK_ATTENTIONALL_BUTTON = 30007;
            public static final int CLICK_AT_FRIEND = 1023;
            public static final int CLICK_AT_NOTIFICATION_CLUSTER = 30511;
            public static final int CLICK_AT_ORIGINAL_SOUND_AUTHOR = 1291;
            public static final int CLICK_AUDIENCE_CHAT_ACCEPTED_CANCLE = 1815;
            public static final int CLICK_AUDIENCE_CHAT_ACCEPTED_VIDEO = 1813;
            public static final int CLICK_AUDIENCE_CHAT_ACCEPTED_VOICE = 1814;
            public static final int CLICK_AUDIENCE_CHAT_INVITE_CANCLE = 1820;
            public static final int CLICK_AUDIENCE_CHAT_INVITE_VIDEO = 1818;
            public static final int CLICK_AUDIENCE_CHAT_INVITE_VOICE = 1819;
            public static final int CLICK_AUDIENCE_HEAD = 510;
            public static final int CLICK_AUDIENCE_LIST = 30042;
            public static final int CLICK_AUDIENCE_NICKNAME = 517;
            public static final int CLICK_AUTHOR_HEAD = 518;
            public static final int CLICK_AUTOBACK = 30477;
            public static final int CLICK_AUTOPLAY = 30476;
            public static final int CLICK_AUTOPLAY_CLOSE = 30575;
            public static final int CLICK_AUTOPLAY_SWITCH = 30573;
            public static final int CLICK_BACKAGE_TAB_BTN = 30973;
            public static final int CLICK_BACK_BUTTON = 30256;
            public static final int CLICK_BANNER = 850;
            public static final int CLICK_BEATS_SWITCH = 918;
            public static final int CLICK_BEAUTY = 1336;
            public static final int CLICK_BET_AMOUNT = 30366;
            public static final int CLICK_BET_AMOUNT_10 = 30291;
            public static final int CLICK_BET_AMOUNT_100 = 30292;
            public static final int CLICK_BET_AMOUNT_1000 = 30295;
            public static final int CLICK_BET_AMOUNT_200 = 30293;
            public static final int CLICK_BET_AMOUNT_500 = 30294;
            public static final int CLICK_BET_AMOUNT_ALL = 30296;
            public static final int CLICK_BET_AMOUNT_INPUT = 30289;
            public static final int CLICK_BET_AUTO_CLOSE_CONFIRM = 30339;
            public static final int CLICK_BET_CONFIRM = 30290;
            public static final int CLICK_BET_CREAT_QUESTION = 30338;
            public static final int CLICK_BET_ENTRANCE = 30285;
            public static final int CLICK_BET_INVALID = 30304;
            public static final int CLICK_BET_KUAIBEI = 30288;
            public static final int CLICK_BET_MANUAL_CLOSE = 30303;
            public static final int CLICK_BET_ONCE_MORE = 30309;
            public static final int CLICK_BET_QUESTION_DELETE = 30306;
            public static final int CLICK_BET_QUESTION_EDIT = 30307;
            public static final int CLICK_BET_QUESTION_REVIEW = 30305;
            public static final int CLICK_BET_RECORD = 30287;
            public static final int CLICK_BET_RESULT_CLOSE = 30298;
            public static final int CLICK_BET_RESULT_DETAIL = 30299;
            public static final int CLICK_BET_RESULT_PUBLISH = 30308;
            public static final int CLICK_BET_RULE = 30286;
            public static final int CLICK_BET_SET = 30301;
            public static final int CLICK_BET_STRAT = 30302;
            public static final int CLICK_BIG_LINK = 1758;
            public static final int CLICK_BILLBOARD_ICON = 31025;
            public static final int CLICK_BIND = 826;
            public static final int CLICK_BIND_IMMEDIATELY_BUTTON = 1218;
            public static final int CLICK_BIND_LATER_BUTTON = 1219;
            public static final int CLICK_BIND_MORE = 827;
            public static final int CLICK_BIND_PHONE = 30314;
            public static final int CLICK_BIRTHDAY_CONFIRM_BUTTON = 30611;
            public static final int CLICK_BLANK_CLOSE = 30807;
            public static final int CLICK_BOTTOM_BUTTON_ADMINISTRATOR = 1374;
            public static final int CLICK_BOTTOM_BUTTON_BULLETSCREEN = 1392;
            public static final int CLICK_BOTTOM_BUTTON_CLASS = 1390;
            public static final int CLICK_BOTTOM_BUTTON_CLASSFREE = 1391;
            public static final int CLICK_BOTTOM_BUTTON_DEFINITION = 1389;
            public static final int CLICK_BOTTOM_BUTTON_FLOATING_WINDOW = 1735;
            public static final int CLICK_BOTTOM_BUTTON_GUESS = 1372;
            public static final int CLICK_BOTTOM_BUTTON_MORE = 1377;
            public static final int CLICK_BOTTOM_BUTTON_PENDINGLIVE = 1732;
            public static final int CLICK_BOTTOM_BUTTON_ROTATE = 1375;
            public static final int CLICK_BOTTOM_BUTTON_SHARE = 1376;
            public static final int CLICK_BOTTOM_BUTTON_SHOP = 1373;
            public static final int CLICK_BOTTOM_BUTTON_VOTE = 31002;
            public static final int CLICK_BROWSE_RECORDS = 1626;
            public static final int CLICK_BROWSE_SETTINGS = 30610;
            public static final int CLICK_BUTTON_LIVE_BGM = 30908;
            public static final int CLICK_BUTTON_LIVE_SING = 30909;
            public static final int CLICK_BUTTON_MYBGM_IMPORT_CHECK_ALL = 30921;
            public static final int CLICK_BUTTON_MYBGM_IMPORT_CONFIRM = 30920;
            public static final int CLICK_BUTTON_MYBGM_IMPORT_LINK_CONFIRM = 30922;
            public static final int CLICK_BUTTON_MYBGM_LIKE = 30918;
            public static final int CLICK_BUTTON_PLAY_ALL_MYBGM = 30916;
            public static final int CLICK_BUTTON_PLAY_SINGLE_MYBGM = 30917;
            public static final int CLICK_BUTTON_TO_COMMENT_AREA = 30777;
            public static final int CLICK_CAMERA = 860;
            public static final int CLICK_CAMERA_AND_MAGIC = 30555;
            public static final int CLICK_CAMERA_BUTTON = 1520;
            public static final int CLICK_CAMERA_ROTATION = 1338;
            public static final int CLICK_CANCEL_SUBSCRIPTION = 1736;
            public static final int CLICK_CANCLE_HIDE_PHOTO_INFO = 30354;
            public static final int CLICK_CHANGE_AVATAR_BUTTON = 30175;
            public static final int CLICK_CHANGE_AVATAR_DIALOG = 30177;
            public static final int CLICK_CHANGE_NICKNAME_ICON = 30585;
            public static final int CLICK_CHANGE_NOW_BUTTON = 30024;
            public static final int CLICK_CHANGE_QUOTES = 30551;
            public static final int CLICK_CHAT_ENTRANCE_BAR = 1766;
            public static final int CLICK_CHAT_INVITATION_FOLLOW = 30887;
            public static final int CLICK_CHECK_CONTACT_LIST_LOG_IN = 30767;
            public static final int CLICK_CHEST = 30235;
            public static final int CLICK_CHEST_CLOSE = 30247;
            public static final int CLICK_CHEST_CLOSE_FOREVER = 30242;
            public static final int CLICK_CHEST_CLOSE_TODAY = 30241;
            public static final int CLICK_CHEST_GET = 30236;
            public static final int CLICK_CHEST_GOTOGET = 30243;
            public static final int CLICK_CHEST_GOTOGIFT = 30240;
            public static final int CLICK_CHEST_RULE = 30238;
            public static final int CLICK_CHEST_SET = 30239;
            public static final int CLICK_CLEAR_BUTTON = 1472;
            public static final int CLICK_CLEAR_EDIT_OPERATION_CANCEL = 1765;
            public static final int CLICK_CLEAR_EDIT_OPERATION_OK = 1764;
            public static final int CLICK_CLOSE_BLACKLIST = 1676;
            public static final int CLICK_CLOSE_BUTTON = 1488;
            public static final int CLICK_CLOSE_KICK = 1678;
            public static final int CLICK_CLOSE_LIVE = 30365;
            public static final int CLICK_CLOSE_MUSIC_STATION_MORELIST = 30153;
            public static final int CLICK_CLOSE_NOSPEAKING = 1674;
            public static final int CLICK_CLOSE_PROMOTE_PRODUCT = 30078;
            public static final int CLICK_CLOSE_RECOMMEND_VIDEO_ENTRY = 30666;
            public static final int CLICK_CLOSE_WINDOW_AUTO_PLAY = 30343;
            public static final int CLICK_CLOUD_MUSIC_AGGREGATION_ENTRANCE = 1778;
            public static final int CLICK_COLLECT = 1394;
            public static final int CLICK_COLLECTION_ICON = 30813;
            public static final int CLICK_COLLECTION_ITEM = 30915;
            public static final int CLICK_COLLECTION_TAB = 1542;
            public static final int CLICK_COMMENT = 858;
            public static final int CLICK_COMMENT_BUTTON = 1744;
            public static final int CLICK_COMMENT_IN_SHARE_CARD = 1564;
            public static final int CLICK_COMMENT_NOTIFICATION_CLUSTER = 30512;
            public static final int CLICK_COMMENT_QUICK_SHOW = 30578;
            public static final int CLICK_COMMENT_SEND_BUTTON = 30517;
            public static final int CLICK_CONCEPT_DISC = 1587;
            public static final int CLICK_CONFIRM_PAY_USE_COUPON = 30086;
            public static final int CLICK_CONTACTS_PERMISSION = 1647;
            public static final int CLICK_CONTACT_FRIENDS_ITEM = 30021;
            public static final int CLICK_CONTENT_AUTHORAZATION_PROTOCOL_ENTRANCE = 1878;
            public static final int CLICK_COPY_ID = 1692;
            public static final int CLICK_COUPON = 30087;
            public static final int CLICK_COUPON_ENTRANCE = 30084;
            public static final int CLICK_COURSE_ENTRANCE = 1101;
            public static final int CLICK_COURSE_LINK = 1220;
            public static final int CLICK_COURSE_LIST = 1214;
            public static final int CLICK_CREATE_NEW_SESSION = 30651;
            public static final int CLICK_CREAT_WISH = 1716;
            public static final int CLICK_CROP = 30948;
            public static final int CLICK_DATE_ASSISTANT_ENTRANCE = 1274;
            public static final int CLICK_DELETE_BUTTON = 1113;
            public static final int CLICK_DELETE_STORY = 30496;
            public static final int CLICK_DELETE_WISH = 1712;
            public static final int CLICK_DEPART = 1696;
            public static final int CLICK_DETAIL_DOWNLOAD = 30462;
            public static final int CLICK_DETAIL_POST = 30460;
            public static final int CLICK_DETAIL_SHARE = 30478;
            public static final int CLICK_DETAIL_WHATSAPPSHARE = 30461;
            public static final int CLICK_DISSOLVE = 1694;
            public static final int CLICK_DOWNLOAD = 849;
            public static final int CLICK_DOWNLOADING_PROCESS_BAR = 30075;
            public static final int CLICK_DOWNLOAD_BONJOUR = 30771;
            public static final int CLICK_DOWNLOAD_BUTTON = 30165;
            public static final int CLICK_DRAFT = 1198;
            public static final int CLICK_DYNAMIC_COMMENT = 1410;
            public static final int CLICK_DYNAMIC_HEAD = 1411;
            public static final int CLICK_DYNAMIC_MESSAGE = 1438;
            public static final int CLICK_DYNAMIC_NICKNAME = 1412;
            public static final int CLICK_DYNAMIC_POPUP = 1546;
            public static final int CLICK_DYNAMIC_TIPS = 1402;
            public static final int CLICK_DYNAMIC_TOPIC = 1409;
            public static final int CLICK_ECOMMERCE_PHOTO_ITEM_FLOAT_WINDOW = 30219;
            public static final int CLICK_ECOMMERCE_PHOTO_YELLOW_SHOPPING_TROLLEY = 30217;
            public static final int CLICK_EDIT_BUTTON = 1112;
            public static final int CLICK_EDIT_FEEDBACK = 1715;
            public static final int CLICK_EDIT_GIFT_NUMBER = 1718;
            public static final int CLICK_EFFECT_TAB = 862;
            public static final int CLICK_ELECTRONICCOMMERCE_COMMENT = 30026;
            public static final int CLICK_ELECTRONICCOMMERCE_FLOAT_WINDOW = 30029;
            public static final int CLICK_ELECTRONICCOMMERCE_KWAI_TOKEN_URL = 30041;
            public static final int CLICK_ELECTRONICCOMMERCE_SHARE_MESSAGE = 30045;
            public static final int CLICK_EMOJI = 1196;
            public static final int CLICK_ENTERPRISE_QUALIFICATION = 30792;
            public static final int CLICK_ENTER_BUTTON = 30722;
            public static final int CLICK_ENTER_GAME = 1662;
            public static final int CLICK_ENTER_KWAI = 1663;
            public static final int CLICK_EPISODE = 1907;
            public static final int CLICK_EXCHANGE = 534;
            public static final int CLICK_EXIT_BUTTON = 30727;
            public static final int CLICK_EXPERIMENT_ITEM = 1140;
            public static final int CLICK_FANS_TOP = 834;
            public static final int CLICK_FEEDBACK_BUTTON = 1277;
            public static final int CLICK_FEEDBACK_TAB = 30475;
            public static final int CLICK_FEED_RECOMMEND_POISITION = 1628;
            public static final int CLICK_FILTER = 1337;
            public static final int CLICK_FILTER_BUTTON = 1728;
            public static final int CLICK_FILTER_EFFECT_TAB = 854;
            public static final int CLICK_FIND_CONTACT_BUTTON = 30013;
            public static final int CLICK_FIND_TAB = 1609;
            public static final int CLICK_FINISH = 869;
            public static final int CLICK_FINISH_BUTTON = 30130;
            public static final int CLICK_FIRST_CLASSIFIER = 1582;
            public static final int CLICK_FIRST_INPUT_MOMENT = 1760;
            public static final int CLICK_FIRST_SENT_GIFT = 30613;
            public static final int CLICK_FLASHLIGHT = 1335;
            public static final int CLICK_FLOATING_WINDOW_SETTING = 1762;
            public static final int CLICK_FLOATING_WINDOW_SETTING_CONFIRM = 1534;
            public static final int CLICK_FOLD_COMMENT = 30889;
            public static final int CLICK_FOLLOWER = 820;
            public static final int CLICK_FOLLOWING = 821;
            public static final int CLICK_FOLLOW_ALL_BUTTON = 30122;
            public static final int CLICK_FOLLOW_BUTTON = 30071;
            public static final int CLICK_FOLLOW_FRIENDS_BUTTON = 959;
            public static final int CLICK_FOLLOW_IN_SHARE_CARD = 1561;
            public static final int CLICK_FOLLOW_LIVING_HEAD = 30430;
            public static final int CLICK_FOLLOW_LOG_IN = 30766;
            public static final int CLICK_FOLLOW_SHOOT_BUTTON = 1689;
            public static final int CLICK_FOLLOW_TAB = 1607;
            public static final int CLICK_FOLLOW_TAB_LOG_IN = 30772;
            public static final int CLICK_FOR_MORE_CREATIVITIES_ENTRANCE = 1763;
            public static final int CLICK_FREE_TO_APPLY_WANGKA = 1316;
            public static final int CLICK_FREE_TRAFFIC_AUTHENTICATION_CODE = 1917;
            public static final int CLICK_FREE_TRAFFIC_GET = 1918;
            public static final int CLICK_FREE_TRAFFIC_POPUP_CLOSE = 1920;
            public static final int CLICK_FREE_TRAFFIC_RULE = 1919;
            public static final int CLICK_FREINDS_RECORD = 30229;
            public static final int CLICK_FRIENDSSTATUS_CANCEL = 30466;
            public static final int CLICK_FRIENDSSTATUS_DELETE = 30467;
            public static final int CLICK_FRIENDSSTATUS_DOWNLOAD = 30470;
            public static final int CLICK_FRIENDSSTATUS_POST = 30468;
            public static final int CLICK_FRIENDSSTATUS_SELECT = 30465;
            public static final int CLICK_FRIENDSSTATUS_STARTNOW = 30463;
            public static final int CLICK_FRIENDSSTATUS_WHATSAPPSHARE = 30469;
            public static final int CLICK_FRIENDSTATUS = 30451;
            public static final int CLICK_FRIEND_LIST_CHECK = 30410;
            public static final int CLICK_FULL_SCREEN = 30412;
            public static final int CLICK_GAMELIVE_ACTIVITY = 31043;
            public static final int CLICK_GAMELIVE_BACK_HOMEPAGE = 31035;
            public static final int CLICK_GAMELIVE_FEATURE_TAB = 31037;
            public static final int CLICK_GAMELIVE_GAMECARD = 31017;
            public static final int CLICK_GAMELIVE_GAME_CATEGORY = 31030;
            public static final int CLICK_GAMELIVE_HERO = 31041;
            public static final int CLICK_GAMELIVE_INFORMATION_MORE = 31045;
            public static final int CLICK_GAMELIVE_LIVECARD = 31020;
            public static final int CLICK_GAMELIVE_LIVETAB = 31026;
            public static final int CLICK_GAMELIVE_MORE_HERO = 31039;
            public static final int CLICK_GAMELIVE_PHOTOCARD = 31021;
            public static final int CLICK_GAMELIVE_PHOTOTAB = 31027;
            public static final int CLICK_GAMETAG_MORE = 31014;
            public static final int CLICK_GAMEZONE_DOWNLOAD_CHANNEL = 40036;
            public static final int CLICK_GAMEZONE_EXCELLENTPOST_CARD = 30428;
            public static final int CLICK_GAMEZONE_FOLLOW_LIVING_NAME = 30432;
            public static final int CLICK_GAMEZONE_FOLLOW_MORE = 30407;
            public static final int CLICK_GAMEZONE_FOLLOW_TAB = 40033;
            public static final int CLICK_GAMEZONE_GAME_CARD = 40006;
            public static final int CLICK_GAMEZONE_GAME_CATEGORY = 40008;
            public static final int CLICK_GAMEZONE_GAME_DETAIL_BUTTON = 40010;
            public static final int CLICK_GAMEZONE_GAME_DETAIL_DOWNLOAD = 40019;
            public static final int CLICK_GAMEZONE_GAME_DETAIL_INFO_TAB = 30746;
            public static final int CLICK_GAMEZONE_GAME_DETAIL_LIVE_TAB = 40015;
            public static final int CLICK_GAMEZONE_GAME_DETAIL_REFRESH = 40017;
            public static final int CLICK_GAMEZONE_GAME_DETAIL_RESOURCE = 40029;
            public static final int CLICK_GAMEZONE_GAME_DETAIL_REVIEW_EDIT = 40018;
            public static final int CLICK_GAMEZONE_GAME_DETAIL_REVIEW_RANK = 40016;
            public static final int CLICK_GAMEZONE_GAME_DETAIL_REVIEW_TAB = 40014;
            public static final int CLICK_GAMEZONE_GAME_DETAIL_VIDEO_TAB = 30747;
            public static final int CLICK_GAMEZONE_GAME_DEVELOPER_NOTICE_UNFOLD = 30793;
            public static final int CLICK_GAMEZONE_GAME_ENTRANCE = 30357;
            public static final int CLICK_GAMEZONE_GAME_FOLLOW = 40012;
            public static final int CLICK_GAMEZONE_GAME_INTRO_EXPAND = 40011;
            public static final int CLICK_GAMEZONE_GAME_MORE = 40007;
            public static final int CLICK_GAMEZONE_GAME_REVIEW_COMMENT = 40026;
            public static final int CLICK_GAMEZONE_GAME_REVIEW_DISLIKE = 40025;
            public static final int CLICK_GAMEZONE_GAME_REVIEW_ITEM = 40023;
            public static final int CLICK_GAMEZONE_GAME_REVIEW_LIKE = 40024;
            public static final int CLICK_GAMEZONE_GAME_REVIEW_MORE = 40021;
            public static final int CLICK_GAMEZONE_GAME_REVIEW_REPORT = 40022;
            public static final int CLICK_GAMEZONE_GAME_REVIEW_USER = 40020;
            public static final int CLICK_GAMEZONE_GAME_TAB = 40034;
            public static final int CLICK_GAMEZONE_GAME_UPDATE_INFO_UNFOLD = 30794;
            public static final int CLICK_GAMEZONE_HOME_CATEGORY = 30521;
            public static final int CLICK_GAMEZONE_HOME_GAME = 30523;
            public static final int CLICK_GAMEZONE_HOME_PAGE_BUTTON = 30733;
            public static final int CLICK_GAMEZONE_HOME_RECOMMEND = 30522;
            public static final int CLICK_GAMEZONE_HOTGAME_CARD = 30352;
            public static final int CLICK_GAMEZONE_HOTSEARCH = 30528;
            public static final int CLICK_GAMEZONE_LIVESTREAM_GAME_ICON = 40038;
            public static final int CLICK_GAMEZONE_LIVE_CARD = 40041;
            public static final int CLICK_GAMEZONE_LIVE_ENTRY_BUTTON = 30729;
            public static final int CLICK_GAMEZONE_LIVE_TAB = 40031;
            public static final int CLICK_GAMEZONE_REVIEW_EDIT_BUTTON = 40028;
            public static final int CLICK_GAMEZONE_REVIEW_RATE = 30752;
            public static final int CLICK_GAMEZONE_REVIEW_RATE_DIALOG_BUTTON = 30753;
            public static final int CLICK_GAMEZONE_REVIEW_TEST_BUTTON = 40027;
            public static final int CLICK_GAMEZONE_SEARCH_ENTER = 30435;
            public static final int CLICK_GAMEZONE_START_LIVE_PUSH_BUTTON = 30730;
            public static final int CLICK_GAMEZONE_VIDEOPLAY_COMMENTFOLLOW = 30426;
            public static final int CLICK_GAMEZONE_VIDEOPLAY_LIVING = 30422;
            public static final int CLICK_GAMEZONE_VIDEOPLAY_MORE = 30420;
            public static final int CLICK_GAMEZONE_VIDEO_BULLET_BUTTON = 40039;
            public static final int CLICK_GAMEZONE_VIDEO_TAB = 40032;
            public static final int CLICK_GAMEZONE_WALLET_KSHELL_RECORD = 30695;
            public static final int CLICK_GAME_BUTTON = 1517;
            public static final int CLICK_GAME_CATEGORY_ITEM = 30725;
            public static final int CLICK_GAME_CENTER = 1538;
            public static final int CLICK_GAME_CENTER_CELL = 1649;
            public static final int CLICK_GAME_CENTER_POPUP = 30540;
            public static final int CLICK_GAME_IMAGE = 1650;
            public static final int CLICK_GAME_INPUT_CONFIRM_DIALOG = 1455;
            public static final int CLICK_GAME_LIVE = 1652;
            public static final int CLICK_GAME_PICTURE = 30427;
            public static final int CLICK_GAME_VIDEO = 30750;
            public static final int CLICK_GENDER = 870;
            public static final int CLICK_GENERAL_FRAMEWORK = 30048;
            public static final int CLICK_GETCASH_BUTTON = 30008;
            public static final int CLICK_GETMONEY_BUTTON = 30004;
            public static final int CLICK_GETMORE_BUTTON = 30006;
            public static final int CLICK_GET_COUPON = 1592;
            public static final int CLICK_GET_MONGY = 1311;
            public static final int CLICK_GET_MORE_MONEY = 1313;
            public static final int CLICK_GIFT_EFFECT = 1342;
            public static final int CLICK_GIFT_NUMBER_TOPIC = 1719;
            public static final int CLICK_GOODS_INFO = 30756;
            public static final int CLICK_GOTO_BUTTON_IN_OTHER_GUIDE_DIALOG = 1469;
            public static final int CLICK_GOTO_BUTTON_IN_SHOT_GUIDE_DIALOG = 1467;
            public static final int CLICK_GOTO_INVENTORY = 30184;
            public static final int CLICK_GO_TEST_BUTTON = 30447;
            public static final int CLICK_GROUP_CHAT_ENTRANCE_BUTTON = 457;
            public static final int CLICK_GROUP_INFOR = 1684;
            public static final int CLICK_GROUP_INVITE = 1619;
            public static final int CLICK_GROUP_NICKNAME = 1682;
            public static final int CLICK_GROUP_NMAE = 452;
            public static final int CLICK_GROUP_ONLY = 456;
            public static final int CLICK_GROUP_OPTION = 451;
            public static final int CLICK_GUESS_BUTTON = 1523;
            public static final int CLICK_GUESS_END = 1234;
            public static final int CLICK_GUESS_WORD = 1232;
            public static final int CLICK_GUESS_WORD_NOTICE = 1235;
            public static final int CLICK_GUESS_WORD_PENDANT = 1233;
            public static final int CLICK_GUESS_WORD_RESULT = 1237;
            public static final int CLICK_GUESS_WORD_SUCCESS = 1236;
            public static final int CLICK_GUIDE_BUBBLE = 32002;
            public static final int CLICK_GYML_WORD = 1868;
            public static final int CLICK_HAMBURGER_BUBBLE = 30904;
            public static final int CLICK_HEAD = 810;
            public static final int CLICK_HIDE_COMMENT_WINDOW = 30044;
            public static final int CLICK_HIGH_CLARITY_HEAD = 1569;
            public static final int CLICK_HIGH_DEFINITION_BUTTON = 1111;
            public static final int CLICK_HISTORY_COUPON = 30089;
            public static final int CLICK_HOMEPAGE = 30885;
            public static final int CLICK_HOME_TAB = 1611;
            public static final int CLICK_HOT_ACTIVITY = 1600;
            public static final int CLICK_HOT_POSITION = 1325;
            public static final int CLICK_HOT_RESORT = 1598;
            public static final int CLICK_HOT_SITE = 1603;
            public static final int CLICK_ICON_HOTTEST_TOPICS = 30062;
            public static final int CLICK_IGNORE = 30313;
            public static final int CLICK_IMAGE = 30886;
            public static final int CLICK_IMPORT_LIVE_BGM = 30913;
            public static final int CLICK_IMPORT_LIVE_BGM_EMPTY = 30912;
            public static final int CLICK_INDEX = 31012;
            public static final int CLICK_INFORM = 1177;
            public static final int CLICK_INFORM_ENTRANCE = 1566;
            public static final int CLICK_INPUT_PROMPT_AVATAR = 927;
            public static final int CLICK_INPUT_PROMPT_LIST = 928;
            public static final int CLICK_INTOWN_CONFIRM = 30937;
            public static final int CLICK_INVITATION_SEND = 30408;
            public static final int CLICK_INVITATION_SHARE = 30474;
            public static final int CLICK_INVITED_FRIEND_LIST = 1317;
            public static final int CLICK_INVITED_INCOME_FRIEND_LIST = 30033;
            public static final int CLICK_INVITED_NOINCOME_FRIEND_LIST = 30034;
            public static final int CLICK_ITEM_MANAGE = 30673;
            public static final int CLICK_I_KNOW_BUTTON = 1105;
            public static final int CLICK_I_WANT_TO_CAPTURE_TOO_BUTTON = 1290;
            public static final int CLICK_JOIN_BLACKLIST = 1681;
            public static final int CLICK_JOIN_IN_LIVE = 30580;
            public static final int CLICK_KICK = 1680;
            public static final int CLICK_KICK_OUT = 1693;
            public static final int CLICK_KUAISHAN_ENTRANCE = 489;
            public static final int CLICK_KWAICARD_CODE = 30808;
            public static final int CLICK_KWAICARD_GO = 30809;
            public static final int CLICK_KWAI_COIN_OPTION = 30009;
            public static final int CLICK_KWAI_MUSIC_STAION_PLAYER_PROFILE = 30166;
            public static final int CLICK_KWAI_MUSIC_STATION_APPLY = 30358;
            public static final int CLICK_KWAI_MUSIC_STATION_APPLY_RULE = 30360;
            public static final int CLICK_KWAI_MUSIC_STATION_AUTHOR_VIDEO_MATCH = 31000;
            public static final int CLICK_KWAI_MUSIC_STATION_AUTHOR_VIDEO_MATCH_AUTHOR_VIDEO_CARD = 30783;
            public static final int CLICK_KWAI_MUSIC_STATION_AUTHOR_VIDEO_MATCH_LIVE_BUTTON = 30782;
            public static final int CLICK_KWAI_MUSIC_STATION_AUTHOR_VIDEO_MATCH_PROFILE = 30858;
            public static final int CLICK_KWAI_MUSIC_STATION_AUTHOR_VIDEO_MATCH_RECOMMEND_CARD = 30785;
            public static final int CLICK_KWAI_MUSIC_STATION_DISLIKE = 30854;
            public static final int CLICK_KWAI_MUSIC_STATION_HELP = 30499;
            public static final int CLICK_KWAI_MUSIC_STATION_MESSAGE = 30471;
            public static final int CLICK_KWAI_MUSIC_STATION_OPEN_KWAICODE = 30605;
            public static final int CLICK_KWAI_MUSIC_STATION_PLAYER_PROFILE = 30213;
            public static final int CLICK_KWAI_MUSIC_STATION_RECORD_FAIL_RETRY = 30369;
            public static final int CLICK_KWAI_MUSIC_STATION_RECORD_VIDEO_CARD_CLOSED = 30364;
            public static final int CLICK_KWAI_MUSIC_STATION_RECORD_VIDEO_CARD_END_UPLOAD = 30363;
            public static final int CLICK_KWAI_MUSIC_STATION_RECORD_VIDEO_CARD_START = 30362;
            public static final int CLICK_KWAI_MUSIC_STATION_RECORD_VIDEO_CARD_UNUSUAL_CLOSE = 30381;
            public static final int CLICK_KWAI_MUSIC_STATION_SHARE = 30602;
            public static final int CLICK_KWAI_MUSIC_STATION_SHARE_KWAICODE = 30603;
            public static final int CLICK_KWAI_MUSIC_STATION_SHARE_KWAICODE_NEXT = 30604;
            public static final int CLICK_KWAI_MUSIC_STATION_UPLOAD_VIDEO_DOUBLE_CONFIRM = 30367;
            public static final int CLICK_KWAI_MUSIC_STATION_VIDEO_COMMENTS_CARD = 30957;
            public static final int CLICK_LABORATORY = 848;
            public static final int CLICK_LAST_HISTORY = 1422;
            public static final int CLICK_LIKE = 1275;
            public static final int CLICK_LIKE_HEAD = 30167;
            public static final int CLICK_LIKE_IN_SHARE_CARD = 1563;
            public static final int CLICK_LIKE_NOTIFICATION_CLUSTER = 30513;
            public static final int CLICK_LIVEMATE_ADVICE_BANNER = 1398;
            public static final int CLICK_LIVEMATE_ANTI_ADDITION_ALERT = 1400;
            public static final int CLICK_LIVEWISH_ALERT_CLOSE = 1711;
            public static final int CLICK_LIVEWISH_SETENTRANCE = 1709;
            public static final int CLICK_LIVE_AIRPLAY = 1511;
            public static final int CLICK_LIVE_APPLY_KWAI_MUSIC_STATION_RULE_CANCEL = 30999;
            public static final int CLICK_LIVE_APPLY_KWAI_MUSIC_STATION_RULE_CONFIRM = 30998;
            public static final int CLICK_LIVE_AUDIENCE_CHAT = 1805;
            public static final int CLICK_LIVE_AUDIENCE_CHAT_ACCEPT = 1803;
            public static final int CLICK_LIVE_AUDIENCE_CHAT_APPLY = 1808;
            public static final int CLICK_LIVE_AUDIENCE_CHAT_CANCEL = 1810;
            public static final int CLICK_LIVE_AUDIENCE_CHAT_CLOSE = 1804;
            public static final int CLICK_LIVE_AUDIENCE_CHAT_ENTRANCE = 1801;
            public static final int CLICK_LIVE_BAN_STATUS_BUTTON = 1571;
            public static final int CLICK_LIVE_BGM_PLAYER_CD = 30925;
            public static final int CLICK_LIVE_BGM_PLAYER_LIKE = 30926;
            public static final int CLICK_LIVE_BGM_PLAYER_NEXT = 30927;
            public static final int CLICK_LIVE_BGM_PLAYER_PAUSE = 30928;
            public static final int CLICK_LIVE_BGM_PLAYER_QUIT = 30929;
            public static final int CLICK_LIVE_BGM_TYPE = 30911;
            public static final int CLICK_LIVE_BLOCK_CLOSE = 1445;
            public static final int CLICK_LIVE_BLOCK_REFUSE = 1444;
            public static final int CLICK_LIVE_BLOCK_STOP_REMIND = 1443;
            public static final int CLICK_LIVE_BROADCAST = 853;
            public static final int CLICK_LIVE_FLOATING_WINDOW_ASK_DIALOG_CANCEL = 30392;
            public static final int CLICK_LIVE_FLOATING_WINDOW_ASK_DIALOG_OPEN = 30391;
            public static final int CLICK_LIVE_FLOATING_WINDOW_PERMISSION_DIALOG_CANCEL = 1781;
            public static final int CLICK_LIVE_FLOATING_WINDOW_PERMISSION_DIALOG_CONFIRM = 1780;
            public static final int CLICK_LIVE_GAME_BUTTON = 1491;
            public static final int CLICK_LIVE_GAME_TAG = 30032;
            public static final int CLICK_LIVE_INFO = 30761;
            public static final int CLICK_LIVE_KWAI_MUSIC_STATION_ICON = 30663;
            public static final int CLICK_LIVE_LESSON_SALE = 1300;
            public static final int CLICK_LIVE_MOBILE_GAME_BUTTON = 1492;
            public static final int CLICK_LIVE_MORE_AUDIENCE_CHAT = 1799;
            public static final int CLICK_LIVE_MORE_AUDIENCE_CHAT_SWITCH = 1800;
            public static final int CLICK_LIVE_MORE_PK = 1245;
            public static final int CLICK_LIVE_PK_ACQIEREMENT = 1549;
            public static final int CLICK_LIVE_PK_ANCHOR = 30163;
            public static final int CLICK_LIVE_PK_BLOCK_CLOSE = 1432;
            public static final int CLICK_LIVE_PK_BLOCK_REFUSE = 1431;
            public static final int CLICK_LIVE_PK_BLOCK_STOP_REMIND = 1433;
            public static final int CLICK_LIVE_PK_CITYWIDE = 1548;
            public static final int CLICK_LIVE_PK_CLOSE_MICROPHONE = 1554;
            public static final int CLICK_LIVE_PK_END_ONEMORE = 1268;
            public static final int CLICK_LIVE_PK_END_OUT = 1270;
            public static final int CLICK_LIVE_PK_END_RANDOM = 1269;
            public static final int CLICK_LIVE_PK_FRIEND = 1247;
            public static final int CLICK_LIVE_PK_FRIEND_BACK = 1253;
            public static final int CLICK_LIVE_PK_FRIEND_COLLECT = 1252;
            public static final int CLICK_LIVE_PK_FRIEND_INVITE = 1251;
            public static final int CLICK_LIVE_PK_FRIEND_NEVER = 1249;
            public static final int CLICK_LIVE_PK_FRIEND_OTHERS = 1256;
            public static final int CLICK_LIVE_PK_FRIEND_SURE = 1254;
            public static final int CLICK_LIVE_PK_INVITED_ACCEPT = 1258;
            public static final int CLICK_LIVE_PK_INVITED_NEVER = 1260;
            public static final int CLICK_LIVE_PK_INVITED_REFUSE = 1259;
            public static final int CLICK_LIVE_PK_LIKE_MOMENT = 1593;
            public static final int CLICK_LIVE_PK_OPEN_MICROPHONE = 1555;
            public static final int CLICK_LIVE_PK_OPPOSITE_ANCHOR = 1427;
            public static final int CLICK_LIVE_PK_OPPOSITE_FOLLOW = 30376;
            public static final int CLICK_LIVE_PK_RANDOM = 1246;
            public static final int CLICK_LIVE_PK_RANDOM_BACK = 1262;
            public static final int CLICK_LIVE_PK_RANDOM_COLLECT = 1261;
            public static final int CLICK_LIVE_PK_RANDOM_RETRY = 1264;
            public static final int CLICK_LIVE_PK_RANDOM_SURE = 1263;
            public static final int CLICK_LIVE_PK_RECORD = 1821;
            public static final int CLICK_LIVE_PK_RECORD_LIST_FOLLOW = 1823;
            public static final int CLICK_LIVE_PK_RECORD_LIST_NOLONGER_MATCH = 1824;
            public static final int CLICK_LIVE_PK_RECORD_LIST_REPORT = 1825;
            public static final int CLICK_LIVE_PK_RULE = 1248;
            public static final int CLICK_LIVE_PK_RULE_POPUP_AGREE = 1501;
            public static final int CLICK_LIVE_PK_STANDARD = 1503;
            public static final int CLICK_LIVE_PK_STOP = 1266;
            public static final int CLICK_LIVE_PK_STOP_SURE = 1296;
            public static final int CLICK_LIVE_PREVIEW_ADDCOVER = 1328;
            public static final int CLICK_LIVE_PREVIEW_ADDTITLE = 1332;
            public static final int CLICK_LIVE_PREVIEW_CHANGE_COVER = 1330;
            public static final int CLICK_LIVE_PREVIEW_HISTORY_TITLE = 1334;
            public static final int CLICK_LIVE_PROCESS = 1509;
            public static final int CLICK_LIVE_PUSH_ADD_MUSIC = 30389;
            public static final int CLICK_LIVE_REGULATION_BUTTON = 1572;
            public static final int CLICK_LIVE_SCREEN = 1510;
            public static final int CLICK_LIVE_SHOW_BUTTON = 1493;
            public static final int CLICK_LIVE_STANDARD = 1345;
            public static final int CLICK_LIVE_VOTE_BUTTON = 30841;
            public static final int CLICK_LIVE_VOTE_ENTRANCE = 30842;
            public static final int CLICK_LOAD_MORE_FRIEND = 1318;
            public static final int CLICK_LOCAL_QUICK_LOGIN = 1450;
            public static final int CLICK_LOCATION_TAG = 1755;
            public static final int CLICK_LOCK = 30043;
            public static final int CLICK_LOGIN_PASSWORD_SET_DIALOG = 1547;
            public static final int CLICK_LOGOUT_BUTTON = 1497;
            public static final int CLICK_LOG_OUT_BUTTON = 1644;
            public static final int CLICK_MAGIC = 1339;
            public static final int CLICK_MAGIC_FACE = 859;
            public static final int CLICK_MAIN_HOMEPAGE = 30225;
            public static final int CLICK_MAKEUP = 1383;
            public static final int CLICK_MANAGEMENT_BUTTON = 30724;
            public static final int CLICK_MANAGE_BUTTON = 30263;
            public static final int CLICK_MAP = 1602;
            public static final int CLICK_MASSAGE_CARD = 30558;
            public static final int CLICK_MATCH_BUTTON = 1727;
            public static final int CLICK_MAXMIZE_BUTTON = 1499;
            public static final int CLICK_MEMORY_ACTIVITY_ENTRANCE = 1873;
            public static final int CLICK_MENU = 802;
            public static final int CLICK_MERCHANT_OPEN_KWAISHOP = 30822;
            public static final int CLICK_MERCHANT_TRILATERAL_ITEM_DETAIL_COMMENT = 30875;
            public static final int CLICK_MERCHANT_TRILATERAL_ITEM_DETAIL_COMMENT_ADD = 30881;
            public static final int CLICK_MERCHANT_TRILATERAL_ITEM_DETAIL_COMMENT_LABEL = 30938;
            public static final int CLICK_MERCHANT_TRILATERAL_ITEM_DETAIL_COMMENT_PHOTO = 30879;
            public static final int CLICK_MERCHANT_TRILATERAL_ITEM_DETAIL_COMMENT_TEXT = 30883;
            public static final int CLICK_MERCHANT_TRILATERAL_ITEM_DETAIL_COMMENT_VIDEO = 30877;
            public static final int CLICK_MERCHANT_TRILATERAL_ITEM_DETAIL_ECOITEM = 30704;
            public static final int CLICK_MERCHANT_TRILATERAL_ITEM_DETAIL_PHOTO = 30600;
            public static final int CLICK_MERCHANT_TRILATERAL_ITEM_DETAIL_STORE = 30599;
            public static final int CLICK_MERCHANT_TRILATERAL_ITEM_DETAIL_TAOBAO_COMMENT = 30983;
            public static final int CLICK_MERCHANT_TRILATERAL_ITEM_DETAIL_URL = 30598;
            public static final int CLICK_MESSAGE = 809;
            public static final int CLICK_MESSAGE_BUTTON = 30046;
            public static final int CLICK_MESSAGE_HEAD = 30053;
            public static final int CLICK_MESSAGE_ICON = 1423;
            public static final int CLICK_MINIMIZE_BUTTON = 1487;
            public static final int CLICK_MIRROR = 1343;
            public static final int CLICK_MOMENT_GENERAL_ENTRANCE = 30333;
            public static final int CLICK_MOMENT_RESULT_NEXT = 30336;
            public static final int CLICK_MOMENT_RESULT_RESELECT = 30340;
            public static final int CLICK_MOMENT_SQUARE = 30064;
            public static final int CLICK_MOMENT_TAG_SELECT = 1705;
            public static final int CLICK_MORE = 837;
            public static final int CLICK_MORE_BUTTON = 30180;
            public static final int CLICK_MORE_DETAIL = 1597;
            public static final int CLICK_MORE_DIALOG_CANCEL_ITEM = 30182;
            public static final int CLICK_MORE_FANS_TOP = 835;
            public static final int CLICK_MORE_LOCAL_VIDEO = 30980;
            public static final int CLICK_MORE_MUSIC = 1094;
            public static final int CLICK_MORE_PHOTOS = 30986;
            public static final int CLICK_MORE_SEARCH_RESULT = 1767;
            public static final int CLICK_MORE_TAG = 30399;
            public static final int CLICK_MORE_TAGS = 1568;
            public static final int CLICK_MOSAIC = 30946;
            public static final int CLICK_MULTIMEDIA_BUTTON = 1521;
            public static final int CLICK_MUSIC_PANEL_FEATURE_BUTTON = 1160;
            public static final int CLICK_MUSIC_RECOMMEND_ENTRANCE = 1875;
            public static final int CLICK_MUSIC_SEARCH_LIST = 1224;
            public static final int CLICK_MUSIC_STATION = 1670;
            public static final int CLICK_MUSIC_STATION_MORELIST = 30151;
            public static final int CLICK_MUSIC_STATION_MORELIST_VIDEO = 30155;
            public static final int CLICK_MUSIC_STATION_VIDEO = 1672;
            public static final int CLICK_MUTUAL_FRIENDS_TIPS = 924;
            public static final int CLICK_MUTUAL_FRIEND_LIST = 925;
            public static final int CLICK_MUTUAL_LIKE_USERS = 922;
            public static final int CLICK_MY_FEEDBACK_TAB = 30481;
            public static final int CLICK_MY_FOLLOW = 30964;
            public static final int CLICK_MY_FOLLOW_FANS_LIST_BUTTON = 30437;
            public static final int CLICK_MY_INVENTORY2018 = 30244;
            public static final int CLICK_MY_LIKE_LIST_BUTTON = 30323;
            public static final int CLICK_MY_PUBLISH_BUTTON = 1206;
            public static final int CLICK_MY_QRCODE_BUTTON = 1787;
            public static final int CLICK_MY_QR_CODE_BUTTON = 1622;
            public static final int CLICK_MY_SHOP_ENTRANCE = 553;
            public static final int CLICK_MY_TEAM_INFO = 30386;
            public static final int CLICK_NEARBY = 30169;
            public static final int CLICK_NEARBY_USER_LIST = 30898;
            public static final int CLICK_NEGATIVE_FEEDBACKO_POPUP_WINDOW = 1169;
            public static final int CLICK_NEWS_CARD = 30693;
            public static final int CLICK_NEWS_REDPOINT = 30136;
            public static final int CLICK_NEWYEAR_BANNER = 30168;
            public static final int CLICK_NEW_DYNAMIC_HEAD = 1437;
            public static final int CLICK_NEW_USER_TASK = 1323;
            public static final int CLICK_NEXT = 825;
            public static final int CLICK_NEXT_PHOTO_FOR_PROFILE = 30452;
            public static final int CLICK_NEXT_VIDEO_BUTTON = 1829;
            public static final int CLICK_NICKNAME = 884;
            public static final int CLICK_NICKNAME_AREA = 1753;
            public static final int CLICK_NIGHT_MODE = 1632;
            public static final int CLICK_NOSPEAKING = 1679;
            public static final int CLICK_NOTIFICATION = 30515;
            public static final int CLICK_NOTIFICATION_CLUSTER = 30566;
            public static final int CLICK_NOTIFICATION_SWITCH = 30520;
            public static final int CLICK_NOTIFICATION_SWITCH_OF_STREAMER = 30526;
            public static final int CLICK_NOTIFY_NO_LONGER = 30257;
            public static final int CLICK_NOTIFY_REOPEN = 30259;
            public static final int CLICK_NOTSHOW_BUTTON = 30003;
            public static final int CLICK_NOT_OPEN_RED_PACKET_CLOSE_LIVE_CANCEL = 30379;
            public static final int CLICK_NOT_OPEN_RED_PACKET_CLOSE_LIVE_CLOSE = 30380;
            public static final int CLICK_NOT_SAVE_EDIT = 1581;
            public static final int CLICK_NO_INTEREST_POPUP_WINDOW = 1168;
            public static final int CLICK_NO_PROMPT_WEEK = 30742;
            public static final int CLICK_OPEN_BLACKLIST = 1675;
            public static final int CLICK_OPEN_CONTACT_BUTTON = 30018;
            public static final int CLICK_OPEN_FOLLOW_LIST_BUTTON = 30488;
            public static final int CLICK_OPEN_KICK = 1677;
            public static final int CLICK_OPEN_KWAILABS_KWAI_MUSIC_STATION_GUIDE = 30780;
            public static final int CLICK_OPEN_LIKE_LIST_BUTTON = 30324;
            public static final int CLICK_OPEN_LIKE_LIST_BUTTON_PROFILE = 30326;
            public static final int CLICK_OPEN_MY_FOLLOW_LIST = 30482;
            public static final int CLICK_OPEN_NOSPEAKING = 1673;
            public static final int CLICK_OPERATION_ENTRANCE = 448;
            public static final int CLICK_OPERATION_MAGIC_FACE_ENTRANCE = 422;
            public static final int CLICK_PACKET = 30126;
            public static final int CLICK_PACKET_SHARE = 30230;
            public static final int CLICK_PARENT_MODE = 30142;
            public static final int CLICK_PHONE_LOGIN = 1489;
            public static final int CLICK_PHOTO_CAPTION_AUTOFILL_BUTTON = 1911;
            public static final int CLICK_PHOTO_CARD = 30601;
            public static final int CLICK_PHOTO_COVER = 30232;
            public static final int CLICK_PHOTO_OPERATE = 30655;
            public static final int CLICK_PHOTO_PACKET = 30227;
            public static final int CLICK_PHOTO_SHARE = 30657;
            public static final int CLICK_PK_INTEREST_CUSTOM = 30209;
            public static final int CLICK_PK_INTEREST_CUSTOM_SURE = 30208;
            public static final int CLICK_PK_INTEREST_SET = 30212;
            public static final int CLICK_PLAY_AGAIN = 1724;
            public static final int CLICK_PLAY_WAY = 30554;
            public static final int CLICK_POI_ELEMENT = 1596;
            public static final int CLICK_POSHH = 1276;
            public static final int CLICK_PREVIOUS = 1515;
            public static final int CLICK_PRINCIPLES_CHECK = 30411;
            public static final int CLICK_PRIVATE_MESSEGE_SPEECH = 30278;
            public static final int CLICK_PROFILE = 512;
            public static final int CLICK_PROFILE_AGE_TAG = 30097;
            public static final int CLICK_PROFILE_CONSTELLATION_TAG = 30099;
            public static final int CLICK_PROFILE_DEFAULT_TEXT = 30113;
            public static final int CLICK_PROFILE_FILL_CARD = 30105;
            public static final int CLICK_PROFILE_FILL_ITEM = 30172;
            public static final int CLICK_PROFILE_FILL_ITEM_RESULT = 30173;
            public static final int CLICK_PROFILE_GENDER_TAG = 30109;
            public static final int CLICK_PROFILE_LOCATION_TAG = 30101;
            public static final int CLICK_PROMOTE_LIVE_BUBBLE = 1772;
            public static final int CLICK_PROMOTE_LIVE_ENTRANCE = 1770;
            public static final int CLICK_PROMOTE_LIVE_RECORD = 1774;
            public static final int CLICK_PROMOTE_PRODUCT = 30076;
            public static final int CLICK_PROMOTION_ENTRANCE = 1886;
            public static final int CLICK_PUBLISH_FANS_TOP = 30659;
            public static final int CLICK_PUBLISH_NOTE_ENTRANCE = 1458;
            public static final int CLICK_PUBLISH_NOTIFICATION_BUTTON = 1208;
            public static final int CLICK_PUBLISH_NOTIFICATION_DETAIL = 1210;
            public static final int CLICK_PUBLISH_SHUOSHUO = 30321;
            public static final int CLICK_QR_CODE_LOGIN = 1486;
            public static final int CLICK_QUICK_LOGIN = 1449;
            public static final int CLICK_QUICK_REPLY = 30051;
            public static final int CLICK_RANK_GAME = 1667;
            public static final int CLICK_RATING_POPUP_WINDOW = 1066;
            public static final int CLICK_READ_MOMENT = 30249;
            public static final int CLICK_RECALL_BUTTON = 30395;
            public static final int CLICK_RECALL_MESSAGE = 30074;
            public static final int CLICK_RECALL_RECONFIRM_BUTTON = 30396;
            public static final int CLICK_RECEIVE_MESSAGE_FAILURE = 30060;
            public static final int CLICK_RECOMMAND_STICKER = 1796;
            public static final int CLICK_RECOMMEND_CARD = 1464;
            public static final int CLICK_RECOMMEND_EMOJI = 30544;
            public static final int CLICK_RECOMMEND_INTEREST = 926;
            public static final int CLICK_RECOMMEND_LIST_ENTRANCE = 1156;
            public static final int CLICK_RECOMMEND_POST = 30149;
            public static final int CLICK_RECOMMEND_SECTION = 30147;
            public static final int CLICK_RECOMMEND_TAG = 30401;
            public static final int CLICK_RECOMMEND_VIDEO = 1640;
            public static final int CLICK_RECOMMEND_VIDEO_ENTRY = 30665;
            public static final int CLICK_RECORD = 30900;
            public static final int CLICK_RECO_USER_HEAD = 30653;
            public static final int CLICK_REDPOINT = 30234;
            public static final int CLICK_RED_PACKAT_RAIN_LIVE_PAGE_DIALOG_SHARE = 1843;
            public static final int CLICK_RED_PACKET_RAIN_END_DIALOG_LOGIN = 1874;
            public static final int CLICK_RED_PACKET_RAIN_END_DIALOG_SHARE = 1850;
            public static final int CLICK_RED_PACKET_RAIN_END_DIALOG_SPONSOR = 1869;
            public static final int CLICK_RED_PACKET_RAIN_FORCE_ROTATE = 1855;
            public static final int CLICK_RED_PACKET_RAIN_HOMEPAGE_DIALOG_CLOSE = 1834;
            public static final int CLICK_RED_PACKET_RAIN_HOMEPAGE_DIALOG_RULE = 1835;
            public static final int CLICK_RED_PACKET_RAIN_HOMEPAGE_DIALOG_SHARE = 1836;
            public static final int CLICK_RED_PACKET_RAIN_HOMEPAGE_ENTRY = 1838;
            public static final int CLICK_RED_PACKET_RAIN_LIVE_COMMENT_KOI = 1887;
            public static final int CLICK_RED_PACKET_RAIN_LIVE_PAGE_DIALOG_CLOSE = 1841;
            public static final int CLICK_RED_PACKET_RAIN_LIVE_PAGE_DIALOG_RULE = 1842;
            public static final int CLICK_RED_PACKET_RAIN_PENDANT = 1845;
            public static final int CLICK_RED_PACKET_RAIN_RED_PACKET = 1848;
            public static final int CLICK_RED_PACKET_RAIN_RULE_PAEG_BAR = 1839;
            public static final int CLICK_RED_PACKET_RAIN_SHARE_PAGE_BAR = 1853;
            public static final int CLICK_RED_PACKET_RAIN_SHARE_PAGE_FOLLOW = 1854;
            public static final int CLICK_RED_PACKET_RAIN_SHARE_PAGE_LIVE = 1852;
            public static final int CLICK_RED_PACKET_RAIN_SHARE_PAGE_RULE = 1851;
            public static final int CLICK_RED_PACK_ICON = 966;
            public static final int CLICK_REEDIT_BUTTON = 30398;
            public static final int CLICK_REFRESH = 1441;
            public static final int CLICK_REGISTER_KWAI_GET_MONEY = 1306;
            public static final int CLICK_RELATED_TAG = 1461;
            public static final int CLICK_RELATE_CONTACT_BUTTON = 30016;
            public static final int CLICK_RELATIONSHIP_LINK = 30069;
            public static final int CLICK_RELATION_FRIEND_FOLLOW_NOTIFICATION = 30107;
            public static final int CLICK_REMIND_LOGIN_FRIEND = 30035;
            public static final int CLICK_REMIND_TASK_FRIEND = 30036;
            public static final int CLICK_REN_WO_KAN_PROMOTING = 30384;
            public static final int CLICK_REPLAY_VOICE_COMMENT = 1756;
            public static final int CLICK_REPOST_IN_SHARE_CARD = 1562;
            public static final int CLICK_RESET_BUTTON = 1535;
            public static final int CLICK_RESET_PASSWORD = 30312;
            public static final int CLICK_RESET_WISH_LIST = 30127;
            public static final int CLICK_RESHOOT = 1340;
            public static final int CLICK_RETRY_BUTTON = 1195;
            public static final int CLICK_REUPLOAD_STORY_BUTTON = 30486;
            public static final int CLICK_REWARD_BUTTON = 313;
            public static final int CLICK_RICH_TEXT_TAG = 1642;
            public static final int CLICK_RULE = 30231;
            public static final int CLICK_RUSH_TO_BUY = 30319;
            public static final int CLICK_SAME_FOLLOW_TIPS = 30383;
            public static final int CLICK_SAMPLE_BUTTON = 1615;
            public static final int CLICK_SAVE = 857;
            public static final int CLICK_SAVE_BUTTON = 30726;
            public static final int CLICK_SAVE_PICTURE = 30160;
            public static final int CLICK_SCAN_QR_BUTTON = 1646;
            public static final int CLICK_SCORE_OUR_KWAI = 1636;
            public static final int CLICK_SCREEN_BUTTON = 1518;
            public static final int CLICK_SEARCH_BUTTON = 1453;
            public static final int CLICK_SEARCH_HISTORY = 1170;
            public static final int CLICK_SEARCH_TAB = 30245;
            public static final int CLICK_SELECT_DURATION = 1733;
            public static final int CLICK_SELECT_FROM_ALBUM = 30712;
            public static final int CLICK_SELECT_FROM_CAMERA = 30711;
            public static final int CLICK_SELECT_SHOW_WISH_LIST = 1536;
            public static final int CLICK_SEND_AUTHENTICATION_CODE = 1485;
            public static final int CLICK_SEND_EMOJI = 31031;
            public static final int CLICK_SEND_STORY_MESSAGE = 31032;
            public static final int CLICK_SENSITIVE = 1344;
            public static final int CLICK_SERIES_TAB = 1903;
            public static final int CLICK_SERVER_ENTRANCE = 1239;
            public static final int CLICK_SERVICE_TRAFFIC_REMIND_POPUP = 30139;
            public static final int CLICK_SETTING_BUTTON = 1494;
            public static final int CLICK_SET_HEADER_PICTURE = 30587;
            public static final int CLICK_SET_HEAD_PICTURE_GUIDE = 30596;
            public static final int CLICK_SET_STAR_FRIEND_ITEM = 30330;
            public static final int CLICK_SHARE = 1319;
            public static final int CLICK_SHARE_BOARD_ICON = 1620;
            public static final int CLICK_SHARE_CLOSEINF = 1341;
            public static final int CLICK_SHARE_COMMENT = 1794;
            public static final int CLICK_SHARE_HEAD = 1792;
            public static final int CLICK_SHARE_IDENTIFY = 1401;
            public static final int CLICK_SHARE_INTERACT_POPUP_WINDOW = 1138;
            public static final int CLICK_SHARE_PACKET = 30348;
            public static final int CLICK_SHARE_QRCODE_BUTTON = 1788;
            public static final int CLICK_SHARE_QRCODE_DIALOG = 1790;
            public static final int CLICK_SHARE_SCREEN_SHOT = 1638;
            public static final int CLICK_SHARE_VIDEOS = 30162;
            public static final int CLICK_SHOP_ENTRANCE = 554;
            public static final int CLICK_SHOWED_PHOTO = 30049;
            public static final int CLICK_SIDE_LIVE_PHOTO = 30968;
            public static final int CLICK_SINGER_PROJECT = 1557;
            public static final int CLICK_SINGLE_NOTIFICATION = 1286;
            public static final int CLICK_SKIP_BUTTON = 30723;
            public static final int CLICK_SLIDE_COMMENT = 1750;
            public static final int CLICK_STARTLIVE = 1346;
            public static final int CLICK_START_BOOKING = 1691;
            public static final int CLICK_START_MAKING = 30549;
            public static final int CLICK_STICKER_MORE_BUTTON = 30456;
            public static final int CLICK_STICKER_PACKAGE = 1729;
            public static final int CLICK_STICKY_ON_TOP = 30565;
            public static final int CLICK_STORE_ORDER = 1447;
            public static final int CLICK_STORIES_MINI = 30941;
            public static final int CLICK_STORY = 30484;
            public static final int CLICK_STORY_BANNER_COLLECTION = 31034;
            public static final int CLICK_STORY_COMMENT_INPUT = 30974;
            public static final int CLICK_STORY_COVER = 30498;
            public static final int CLICK_STRANGER_BUTTON = 1726;
            public static final int CLICK_STRONG_CONTACT_AUTHORIZATION_DIGLOG = 30186;
            public static final int CLICK_SUBMIT_BUTTON = 30448;
            public static final int CLICK_SUBSCRIBED_SERIES = 1901;
            public static final int CLICK_SUBSCRIPTION = 1723;
            public static final int CLICK_SUGGESTION_RESULT = 1176;
            public static final int CLICK_SUPER_ADMIN_SETTING = 1297;
            public static final int CLICK_TAB_ENTRANCE_DETAIL = 1775;
            public static final int CLICK_TAB_IMPORT_BGM = 30919;
            public static final int CLICK_TAG = 841;
            public static final int CLICK_TAG_RECOMMEND = 846;
            public static final int CLICK_TAG_SEARCH = 845;
            public static final int CLICK_TASK_BAR = 1828;
            public static final int CLICK_TASK_CENTER = 1624;
            public static final int CLICK_TEMPLATE_IMPORT_NEXT = 30859;
            public static final int CLICK_TEMPLATE_LYRIC = 30553;
            public static final int CLICK_TEMPLATE_MUTE = 30550;
            public static final int CLICK_TEMPLATE_NEXT = 30661;
            public static final int CLICK_TEMPLATE_TEXT_EDIT = 30552;
            public static final int CLICK_TEMPLATE_TEXT_EDIT_CPMPLETED = 30641;
            public static final int CLICK_TEMPLET_CONFIRM = 30768;
            public static final int CLICK_TEMPLET_DOUBLE_CLICK = 30769;
            public static final int CLICK_TEMPLET_ENTRANCE = 30770;
            public static final int CLICK_THANOS_SETTING_DIALOG = 30270;
            public static final int CLICK_TIME_EFFECT_TAB = 855;
            public static final int CLICK_TOP_CHAT = 1190;
            public static final int CLICK_TOP_POST_DETAIL = 1777;
            public static final int CLICK_TOTAL_LIKE_CNT = 30649;
            public static final int CLICK_TOWNSMAN_ENTRANCE = 1203;
            public static final int CLICK_TO_CANCEL = 1091;
            public static final int CLICK_TO_COMMIT_MUSIC_RECOMMEND = 1877;
            public static final int CLICK_TO_CONTINUE = 1090;
            public static final int CLICK_TO_GET_KWAI_MONEY = 1309;
            public static final int CLICK_TO_JOIN_CHORUS = 1859;
            public static final int CLICK_TO_KNOW_MORE_OR_BUY = 1354;
            public static final int CLICK_TO_LABORATORY = 1435;
            public static final int CLICK_TO_LINK = 1357;
            public static final int CLICK_TO_MY_WALLET = 1310;
            public static final int CLICK_TO_ONLINE_USER_INFO_PANEL = 1302;
            public static final int CLICK_TO_OPEN_KWAI_AND_GET_MONEY = 1308;
            public static final int CLICK_TO_PUBLISH = 30092;
            public static final int CLICK_TO_REQUEST_ACCOUNT_PERMISSION = 1165;
            public static final int CLICK_TO_REQUEST_CAMERAE_PERMISSION = 949;
            public static final int CLICK_TO_REQUEST_CONTACTS_PERMISSION = 945;
            public static final int CLICK_TO_REQUEST_LOCATION_PERMISSION = 943;
            public static final int CLICK_TO_REQUEST_MICROPHONE_PERMISSION = 950;
            public static final int CLICK_TO_REQUEST_STORAGE_PERMISSION = 947;
            public static final int CLICK_TO_REQUEST_STORAGE_PHONE_PERMISSION = 952;
            public static final int CLICK_TO_REQUEST_THIRDPARTY_PERMISSION = 1573;
            public static final int CLICK_TO_RETRY = 30932;
            public static final int CLICK_TO_SEE_FRIENDS_CAN_SEE = 1832;
            public static final int CLICK_TO_SHARE_AUTHOR_REPORT = 1897;
            public static final int CLICK_TO_SHOT = 30228;
            public static final int CLICK_TO_TOP = 30759;
            public static final int CLICK_TO_VIEW_PROFILE = 1883;
            public static final int CLICK_TRAFFIC_REMIND_CLOSE = 30138;
            public static final int CLICK_TRENDING_WORD = 1707;
            public static final int CLICK_TRIM = 30947;
            public static final int CLICK_TRUE_WITHOUT_MAKEUP = 1429;
            public static final int CLICK_TUBE_ENTRANCE = 1899;
            public static final int CLICK_UNFOLLOW_CONFIRMATION_POPUP = 30115;
            public static final int CLICK_UNFOLLOW_RECOMMENDATION_TIPS = 30404;
            public static final int CLICK_UPDATE_TIME = 31019;
            public static final int CLICK_UPGRADE_WINDOW = 1630;
            public static final int CLICK_UPLOAD_VIDEO_NOW = 1591;
            public static final int CLICK_USER_ICON = 30436;
            public static final int CLICK_USER_INFO_PANEL_HEAD = 1303;
            public static final int CLICK_USER_ITEM = 30560;
            public static final int CLICK_USER_LIVE_TIPS_BAR = 30763;
            public static final int CLICK_USER_RECOMMEND = 878;
            public static final int CLICK_USER_SEARCH_LIST = 929;
            public static final int CLICK_USER_TRAINING = 1575;
            public static final int CLICK_USE_COUPON = 1614;
            public static final int CLICK_VERTICAL_USER = 819;
            public static final int CLICK_VIDEO_BUTTON = 1353;
            public static final int CLICK_VIDEO_DEFINITION_BUTTON = 30081;
            public static final int CLICK_VIDEO_DEFINITION_DIALOG = 30083;
            public static final int CLICK_VIDEO_PAUSE = 30449;
            public static final int CLICK_VIDEO_PLAY = 30450;
            public static final int CLICK_VIDEO_REC_LOG_IN = 30765;
            public static final int CLICK_VIEW_RULE = 31018;
            public static final int CLICK_VOICE_ASSISTANT = 1697;
            public static final int CLICK_VOICE_ASSISTANT_CONFIRM = 1698;
            public static final int CLICK_VOICE_CHANGER = 1526;
            public static final int CLICK_VOICE_COMMENT_BUTTON = 1360;
            public static final int CLICK_VOICE_COMMENT_MICROPHONE = 1363;
            public static final int CLICK_VOICE_COMMENT_RESENT = 1384;
            public static final int CLICK_VOICE_REPLY = 1143;
            public static final int CLICK_VOTE = 1209;
            public static final int CLICK_VOTE_CLOSE = 30902;
            public static final int CLICK_VOTE_ENTRANCE = 30899;
            public static final int CLICK_VOTE_FOR_TA = 30267;
            public static final int CLICK_VOTE_START = 30901;
            public static final int CLICK_WATCH_STORY = 30720;
            public static final int CLICK_WHATSAPP_CONNECT = 30464;
            public static final int CLICK_WINDOW_BUTTON = 1519;
            public static final int CLICK_WINDOW_PAUSE = 30093;
            public static final int CLICK_WINDOW_PLAY = 30094;
            public static final int CLICK_WISH_LIST = 1525;
            public static final int CLICK_WISH_LIST_LAYER = 1477;
            public static final int CLICK_WISH_LIST_LAYER_GIFT = 1481;
            public static final int CLICK_WISH_LIST_LAYER_RANK_LIST = 1479;
            public static final int CLICK_WISH_LIST_PENDANT = 1475;
            public static final int CLICK_WISH_LIST_SET_ENTRANCE = 1471;
            public static final int CLICK_WITHDRAW = 30409;
            public static final int CLICK_WRITE_MOMENT = 30246;
            public static final int CLICK_WRITE_STORY_BUTTON = 30485;
            public static final int CLICK_YOU_FAILED = 526;
            public static final int CLIENT_FOLLOW_API_CLICK = 30564;
            public static final int CLLICK_SAVE_PDI = 30187;
            public static final int CLOSE_ANTI_ADDICTION_POPUP_WINDOW = 1104;
            public static final int CLOSE_BANNER = 1913;
            public static final int CLOSE_BTN = 30801;
            public static final int CLOSE_BUTTON_EXPO = 30988;
            public static final int CLOSE_CHILD_LOCK_MODEL = 30618;
            public static final int CLOSE_DYNAMIC_POPUP = 30056;
            public static final int CLOSE_ECOMMERCE_PHOTO_YELLOW_SHOPPING_TROLLEY = 30222;
            public static final int CLOSE_ELECTRONICCOMMERCE_FLOAT_WINDOW = 30090;
            public static final int CLOSE_FEED_MODEL = 1586;
            public static final int CLOSE_GAME_CENTER_POPUP = 30541;
            public static final int CLOSE_KWAI_MUSIC_STATION_VIDEO_COMMENTS = 30954;
            public static final int CLOSE_LACK_OF_BALANCE_PANEL = 1507;
            public static final int CLOSE_LIVE_CHAT = 30251;
            public static final int CLOSE_LIVE_FLOATING_WINDOW = 1578;
            public static final int CLOSE_MOMENT_GENERAL_ENTRANCE = 30337;
            public static final int CLOSE_MOMENT_PICTURE_RESULT = 30335;
            public static final int CLOSE_MOMENT_SQUARE = 30058;
            public static final int CLOSE_OPERATION_ENTRANCE = 450;
            public static final int CLOSE_OPERATION_MAGIC_FACE_ENTRANCE = 423;
            public static final int CLOSE_PREINPUT_MOMENT = 30158;
            public static final int CLOSE_RECOMMEND_CARD = 1462;
            public static final int CLOSE_RECOMMEND_FANS_VIDEO = 30990;
            public static final int CLOSE_RECOMMEND_FANS_VIDEO_TASK = 30989;
            public static final int CLOSE_UPLOAD_FAIL_DIALOG = 1069;
            public static final int COLLAPSE_COMMENT = 833;
            public static final int COLLAPSE_COMMENT_DIALOG = 326;
            public static final int COLLAPSE_DIALOG = 1002;
            public static final int COLLAPSE_GIFT_DIALOG = 998;
            public static final int COLLAPSE_SECONDARY_COMMENT = 310;
            public static final int COLLAPSE_VOTE_STICKER_DIALOG = 1870;
            public static final int COLLECT_CUSTOM_STICKER = 30455;
            public static final int COLLECT_MAGIC_FACE = 1867;
            public static final int COLLECT_MUSIC = 1044;
            public static final int COLLECT_TAG = 1379;
            public static final int COMMENT_DYNAMIC = 1405;
            public static final int COMMENT_MOMENT = 1742;
            public static final int COMMENT_PHOTO = 300;
            public static final int COMMENT_QUICK_SHOW_SWITCH = 30577;
            public static final int COMMENT_STORY = 30493;
            public static final int COMMENT_WINDOW_CLOSE_5_TIMES = 30969;
            public static final int COMMENT_WINDOW_SHOW = 30134;
            public static final int COMPLETE_VOICE_REPLY = 1144;
            public static final int COMPOSITE_PATCH = 972;
            public static final int CONFIRM = 828;
            public static final int CONFIRM_ACCEPT = 1148;
            public static final int CONFIRM_CLEAR_SEARCH_HISTORY = 1172;
            public static final int CONFIRM_LIVE_GUESS = 558;
            public static final int CONFIRM_MESSAGESHARE = 30038;
            public static final int CONFIRM_OPEN_LIKE_LIST = 30322;
            public static final int CONFIRM_PAY = 1149;
            public static final int CONFIRM_REWARD = 314;
            public static final int CONFIRM_UPGRADE_POPUP_WINDOW = 1122;
            public static final int CONFIRM_VOICE_CHANGER = 1527;
            public static final int CONFIRM_WELCOME_RATING_DIALOG = 1700;
            public static final int CONNECT_GLASSES = 1121;
            public static final int CONNECT_GLASSES_BLUETOOTH = 1287;
            public static final int CONNECT_WIFI = 1184;
            public static final int CONTACT_CUSTOMER_SERVICE = 30744;
            public static final int CONTINUE_PAY_DEPOSIT = 990;
            public static final int CONTINUE_RE_LOGIN_DIALOG = 997;
            public static final int CONTINUE_VIEW_IN_LIVE_QUIZ_DIALOG = 525;
            public static final int CONTRACT_SIGN = 30994;
            public static final int COPY_COMMENT = 312;
            public static final int COPY_HEADTIPS = 811;
            public static final int COUPON_CHECK = 30150;
            public static final int CREATE_ELECTRONICCOMMERCE_KWAI_TOKEN = 30039;
            public static final int CREATE_IMPORT = 30869;
            public static final int CREATE_QRCODE = 701;
            public static final int CREATE_RSA_KEY = 40;
            public static final int CREATE_SHOOT = 30871;
            public static final int CREATE_STATUS = 30870;
            public static final int CUT_MUSIC = 1043;
            public static final int DAIL_PHONE = 1207;
            public static final int DECODE_IMAGE = 910;
            public static final int DEFAULT_PREWORDS = 30739;
            public static final int DEFAULT_SEARCH_RECORDS = 30621;
            public static final int DELATE_APP_PACKAGE = 1036;
            public static final int DELETE_ANSWER = 1145;
            public static final int DELETE_CUSTOM_STICKER = 30453;
            public static final int DELETE_DRAFT = 1199;
            public static final int DELETE_GROUP_MEMBER = 30144;
            public static final int DELETE_MESSAGE = 909;
            public static final int DELETE_MOMENT_COMMENT = 30133;
            public static final int DELETE_MORE_PHOTO = 872;
            public static final int DELETE_MUSIC = 988;
            public static final int DELETE_ONE_HISTORY = 30741;
            public static final int DELETE_PHOTO = 1226;
            public static final int DELETE_PHOTO_COMMENT = 302;
            public static final int DELETE_QUESTION = 1146;
            public static final int DELETE_RECO_USER = 30654;
            public static final int DELETE_RESULT_LIST = 1175;
            public static final int DELETE_STORY_COMMENT = 30721;
            public static final int DISCARD_ELECTRONICCOMMERCE_COMMENT = 30027;
            public static final int DISLIKE_PHOTO = 307;
            public static final int DM_VIDEO_COMMENT = 30561;
            public static final int DM_VIDEO_GOOD = 30563;
            public static final int DM_VIDEO_MESSAGE = 30571;
            public static final int DM_VIDEO_OPEN = 30569;
            public static final int DM_VIDEO_SHARE = 30562;
            public static final int DM_VIDEO_SOUND = 30570;
            public static final int DM_VIDEO_START = 30572;
            public static final int DOUBLE_CLICK_FOLLOW_TAB = 1025;
            public static final int DOUBLE_CLICK_TO_ROAM_CITY = 806;
            public static final int DOWNLOAD_AND_PRINT_WATERMARK = 1182;
            public static final int DOWNLOAD_AND_SHARE = 1442;
            public static final int DOWNLOAD_CONTINUE = 1657;
            public static final int DOWNLOAD_HYBRID_PACKAGE = 1012;
            public static final int DOWNLOAD_PATCH = 971;
            public static final int DOWNLOAD_PAUSE = 1656;
            public static final int DOWNLOAD_SUCCESS = 1658;
            public static final int DOWNLOAD_TENCENT_MOBLIE_MANAGER = 939;
            public static final int DRAG_SEEK_BAR = 322;
            public static final int DROP_DOWN_CONTACT_LIST = 1278;
            public static final int DUET_VIDEO = 1201;
            public static final int EDIT_BEAUTY_DURATION = 405;
            public static final int EDIT_CROP = 30981;
            public static final int EDIT_NEW_FEATURE_GUIDE_POP = 477;
            public static final int EDIT_PERSONNAL_CARD_EXPO = 30966;
            public static final int EDIT_PRODUCTION_SHOW_OPERATION = 485;
            public static final int EDIT_PROFILE = 822;
            public static final int EDIT_SUBSCRIBES = 1906;
            public static final int EDIT_TRIM = 30982;
            public static final int EDIT_VIDEO_LAUNCH_TO_PHOTO_PREVIEW = 459;
            public static final int EDIT_VIDEO_LAUNCH_TO_VIDEO_PREVIEW = 458;
            public static final int EDIT_VIDEO_THUMBNAIL = 461;
            public static final int EDIT_VIDEO_VIDEO_CLIP = 462;
            public static final int EDIT_VIDEO_VIDEO_PREVIEW = 460;
            public static final int ENABLE_PRE_UPLOAD_IN_WIFI = 618;
            public static final int ENTER_ABOUT_KWAI = 1010;
            public static final int ENTER_ACCOUNT_PROTECTION = 1004;
            public static final int ENTER_CAMERA = 1231;
            public static final int ENTER_CHILD_LOCK_MODEL = 30706;
            public static final int ENTER_CHILD_LOCK_MODEL_SUPPORT = 30743;
            public static final int ENTER_CHILD_LOCK_SETTINGS = 1782;
            public static final int ENTER_COMMON_MODEL = 30616;
            public static final int ENTER_DOWNLOAD_PAGE = 1032;
            public static final int ENTER_DUET_USER_LIST = 1279;
            public static final int ENTER_E_COMMERCE_LINK = 895;
            public static final int ENTER_FANS_TOP = 1008;
            public static final int ENTER_FEEDBACK_HELP = 1009;
            public static final int ENTER_FULLSCREEN_BY_NONRESIDENT_BUTTON = 31047;
            public static final int ENTER_FULLSCREEN_BY_RESIDENT_BUTTON = 932;
            public static final int ENTER_FULL_SCREEN = 515;
            public static final int ENTER_INTO_LIVE_GUESS = 567;
            public static final int ENTER_INTO_MY_WALLET = 560;
            public static final int ENTER_LIKE_USER_LIST = 1047;
            public static final int ENTER_LIVE_BY_CLICK_LIVE_FLOATING_WINDOW = 1579;
            public static final int ENTER_LIVE_QUIZ = 520;
            public static final int ENTER_LIVE_QUIZ_SETTINGS = 519;
            public static final int ENTER_LOCAL_ALBUM_DETAIL = 896;
            public static final int ENTER_MESSAGE_DETAIL = 1003;
            public static final int ENTER_MY_WALLET = 1007;
            public static final int ENTER_NEWS = 891;
            public static final int ENTER_NEWYEAR_CAMPAIGN = 30123;
            public static final int ENTER_QRCODE_SCAN = 898;
            public static final int ENTER_RED_PACK_ACTIVITY_PAGE = 965;
            public static final int ENTER_REMINDER_PAGE = 890;
            public static final int ENTER_REQUEST_UPDATE_USER_LIST = 1294;
            public static final int ENTER_SEREACH_PAGE = 892;
            public static final int ENTER_SETTINGS = 893;
            public static final int ENTER_SHARE_USER_LIST = 1280;
            public static final int ENTER_SINGER_COLUMN = 902;
            public static final int ENTER_UGC_USER_LIST = 1281;
            public static final int ENTER_USER_LIST = 30157;
            public static final int EPISODE_CLICK = 30835;
            public static final int EPISODE_SHOW = 30845;
            public static final int ESTABLISH_MESSAGE_CONNECTION = 937;
            public static final int EVOKE_PAYMENT_FROM_APPSTORE = 936;
            public static final int EXIT_DIRECTLY = 887;
            public static final int EXIT_FULL_SCREEN = 516;
            public static final int EXIT_GROUP_CHAT = 1191;
            public static final int EXIT_STORY_DETAIL = 30495;
            public static final int EXIT_VOICE_PARTY_ROOM = 30265;
            public static final int EXPANDC_COMMENT = 832;
            public static final int EXPAND_ATLAS_VERTICAL = 316;
            public static final int EXPAND_COMMENT_DIALOG = 318;
            public static final int EXPAND_DYNAMIC = 1408;
            public static final int EXPAND_DYNAMIC_COMMENT = 1440;
            public static final int EXPAND_GIFT_COUNT_SELECT_DIALOG = 999;
            public static final int EXPAND_GIFT_DIALOG = 885;
            public static final int EXPAND_RESOLUTION_SWITCH_DIALOG = 933;
            public static final int EXPAND_SECONDARY_COMMENT = 309;
            public static final int EXPAND_VOTE_STICKER_DIALOG = 1871;
            public static final int EXPORT_DRAFT = 1200;
            public static final int FEEDBACK_LIVE_NEGATIVE = 513;
            public static final int FEED_PHOTO_COVER_LOADING_FAIL = 1085;
            public static final int FETCH_FEED_LIST = 51;
            public static final int FILL_EMAIL_ACCOUNT_BOX = 1129;
            public static final int FILTER_CLASSIFICATION_CLICK = 30897;
            public static final int FILTER_FRIENDS_OF_MUTUAL_INTERST = 994;
            public static final int FIND_SOMEONE_YOU_INTEREST = 30206;
            public static final int FINISH_ADVANCED_EDIT = 401;
            public static final int FINISH_EDITING = 445;
            public static final int FINISH_EFFECT_EDIT = 403;
            public static final int FINISH_INPUT_ADDTITLE = 1348;
            public static final int FINISH_MUSIC_EFFECT_ADJUST = 1159;
            public static final int FINISH_PREVIEW_RENDER = 402;
            public static final int FINISH_RECOMMEND_VIDEO = 30934;
            public static final int FINISH_RECORDING = 440;
            public static final int FLOAT_ICON_CLICK = 30798;
            public static final int FLOAT_ICON_SHOW = 30796;
            public static final int FOCUS_ON_SCREEN = 419;
            public static final int FOCUS_SEARCH_BOX = 987;
            public static final int FOLLOW_AND_EXIT = 886;
            public static final int FOLLOW_LIST_EXPO = 31009;
            public static final int FOLLOW_LIST_EXPO_VISITOR = 30825;
            public static final int FOLLOW_SHOOT = 1616;
            public static final int FOLLOW_SHOOT_SWITCH_FLOATING_WINDOW = 476;
            public static final int FRIENDS_LIST_CLICK_TO_ADD_NICKNAME = 30697;
            public static final int FRIEND_LIST_CLICK_TO_PROFILE = 30690;
            public static final int GAMEZONE_HERO = 30507;
            public static final int GAMEZONE_HERO_MORE = 30506;
            public static final int GAME_CENTER_POPUP = 30543;
            public static final int GAME_FEATURE_TAB = 30505;
            public static final int GENERAL_BROWSING_SETTINGS = 30594;
            public static final int GENERAL_DOWNLOAD = 30591;
            public static final int GENERAL_GLASSES = 30592;
            public static final int GENERAL_LANGUAGE = 30582;
            public static final int GENERAL_LIVE_SETTINGS = 30590;
            public static final int GENERAL_NON_DOWNLOADABLE = 30593;
            public static final int GENERAL_WATERMARK_SETTINGS = 30589;
            public static final int GET_HARDWARE_ENCODER_INFO = 704;
            public static final int GET_LIVE_COVER = 30525;
            public static final int GET_RED_PACKET_RAIN_RESULT = 1856;
            public static final int GET_RED_PACKET_RAIN_TOKEN = 1882;
            public static final int GET_RED_PACK_GRADE = 506;
            public static final int GET_RSA_PUB_KEY = 42;
            public static final int GET_SIGNATURE = 41;
            public static final int GIVEUP_UPLOAD_PRODUCTION = 1070;
            public static final int GOTO_MAP_ROAMING = 30620;
            public static final int GO_TO_3RD_PLATFORM_GOODS_DETAIL_PAGE = 555;
            public static final int GO_TO_ALBUM = 1404;
            public static final int GO_TO_ANSWER = 1141;
            public static final int GO_TO_APPSTORE = 1654;
            public static final int GO_TO_MOMENT_DETAIL = 1703;
            public static final int GO_TO_MOMENT_ENTRANCE = 1706;
            public static final int GO_TO_PASTE_KWAI_TOKEN = 1135;
            public static final int GO_TO_PHOTO_ALBUM = 1092;
            public static final int GRANT_CONTACT_PERMISSION = 1088;
            public static final int GRANT_EMAIL_PERMISSION_STATUS = 1128;
            public static final int GRANT_GOOGLE_PERMISSION_STATUS = 1130;
            public static final int GRANT_LOCAL_ALBUM_VIDEO = 1420;
            public static final int GRANT_THUMBNAIL_FIRST_FRAME = 470;
            public static final int GUESS_EXIT_MIC = 30252;
            public static final int GUEST_PROFILE_CLICK = 30197;
            public static final int GUIDE_TO_MATCH = 1356;
            public static final int GZONE_LIVE_SHIELD_BUTTON = 30668;
            public static final int GZONE_LIVE_SHIELD_GIFT_SWITCH = 30670;
            public static final int GZONE_LIVE_SHIELD_MESSAGE_SWITCH = 30669;
            public static final int HANG_LIVE_OFFLINE = 1046;
            public static final int HATE_PHOTO = 839;
            public static final int HIDE_PHOTO_INFO = 1027;
            public static final int HOME_HOT_PRELOAD_PHOTO = 30977;
            public static final int HOT_FEED_REPEAT = 30516;
            public static final int HTTP_DNS_RESOLVE_HOST = 50;
            public static final int ICONFIRM_INVITATION = 1188;
            public static final int IMPORTED_VIDEO_CLIP = 438;
            public static final int IMPORTED_VIDEO_CLIPPING = 1222;
            public static final int IMPORT_LOCAL_ALBUM_VIDEO = 439;
            public static final int IMPORT_MUSIC_FROM_PC = 873;
            public static final int IMPORT_TO_COLLECTION = 1541;
            public static final int IMPORT_VIDEO = 415;
            public static final int INFORM_PHOTO_COMMENT = 303;
            public static final int INFORM_USER = 807;
            public static final int INFORM_VIDEO = 815;
            public static final int INITIATE_GROUP_CHAT = 1186;
            public static final int INIT_METHOD_COST = 1180;
            public static final int INPUT_BOX_EXPO = 30740;
            public static final int INPUT_CONTENT = 1223;
            public static final int INPUT_NICK_NAME = 871;
            public static final int INPUT_PASSWORD = 865;
            public static final int INPUT_PHONE_NUMBER = 864;
            public static final int INPUT_SMS_AUTHENTICATION_CODE = 868;
            public static final int INSTALL_APP = 1035;
            public static final int INSTALL_CLICK = 30931;
            public static final int INSTALL_LIVEMATE = 703;
            public static final int INSTALL_SUCCESS = 1659;
            public static final int INSTALL_TENCENT_MOBLIE_MANAGER = 975;
            public static final int INVITE_FRIEND = 1152;
            public static final int INVITE_TO_DUET = 1289;
            public static final int IOS_EFFECT_PATCH = 1081;
            public static final int IOS_INJECT_PATCH = 1446;
            public static final int IOS_PARSE_PATCH = 1080;
            public static final int IOS_QUERY_PATCH = 1079;
            public static final int IOS_ROLLBACK_PATCH = 1082;
            public static final int JOIN_TOPIC = 842;
            public static final int JOIN_VIDEO_REC = 1158;
            public static final int KARAOKE_RECORD = 414;
            public static final int KID_REG_PAGE_CONFIRM = 30757;
            public static final int KNOW_NEW_USER_RETENTION_TASK = 30830;
            public static final int KUAISHAN_TEMPLATE_EDIT_OPERATION = 491;
            public static final int KUAISHAN_TEMPLATE_SELECT_OPERATION = 490;
            public static final int KWAI_MUSIC_STATION_CANCEL_FOLLOW = 30790;
            public static final int KWAI_MUSIC_STATION_CANCEL_LIKE = 30789;
            public static final int KWAI_MUSIC_STATION_FOLLOW = 30748;
            public static final int KWAI_MUSIC_STATION_LIKE = 30788;
            public static final int KWAI_MUSIC_STATION_LIVE_STREAM_NOTICE = 30698;
            public static final int KWAI_MUSIC_STATION_VIDEO_COMMENTS_LIKE = 30956;
            public static final int KWAI_MUSIC_STATION_VIDEO_COMMENTS_SEND = 30951;
            public static final int KWAI_MUSIC_STATION_VIDEO_PAUSE_PLAY = 30284;
            public static final int KWAI_MUSIC_STATION_VIDEO_PROGRESS = 30283;
            public static final int LAUNCH_APP = 1033;
            public static final int LAUNCH_FACEPP = 435;
            public static final int LAUNCH_FAIL = 1668;
            public static final int LAUNCH_GAME = 1660;
            public static final int LAUNCH_MAGIC_FACE = 433;
            public static final int LEAVE_DETAIL = 1019;
            public static final int LEAVE_PROFILE = 879;
            public static final int LEAVE_SEARCH_TAG = 1048;
            public static final int LEAVE_SEARCH_TAG_RECOMMEND_RESULT = 1087;
            public static final int LEAVE_SEARCH_TAG_SEARCH_RESULT = 1049;
            public static final int LEAVE_TAG = 1020;
            public static final int LEFT_SLIDE = 30055;
            public static final int LIKE_COMMENT = 320;
            public static final int LIKE_MOMENT = 1740;
            public static final int LIKE_PHOTO = 306;
            public static final int LIKE_SHARE_CARD = 30116;
            public static final int LISTEN_VOICE = 30281;
            public static final int LIVE_ANCHOR_GET_GIFT = 35;
            public static final int LIVE_CHAT_BETWEEN_ANCHORS = 30781;
            public static final int LIVE_CHAT_SWITCH_MUSIC_PLAY = 30253;
            public static final int LIVE_COMMENT = 20;
            public static final int LIVE_ENTER_ROOM = 18;
            public static final int LIVE_FEEDBACK_NEGATIVE = 30;
            public static final int LIVE_FEED_CONNECT = 16;
            public static final int LIVE_GET_AUDIENCES = 24;
            public static final int LIVE_GIFT_COMBO_PROTECTION_RE_ENTER = 501;
            public static final int LIVE_LIKE = 23;
            public static final int LIVE_LONG_CONNECTION = 17;
            public static final int LIVE_MODULE_SHOW = 30848;
            public static final int LIVE_PK = 1413;
            public static final int LIVE_PLAY = 13;
            public static final int LIVE_PREVIEW_CHATROOM = 30819;
            public static final int LIVE_PREVIEW_VEDIO = 30817;
            public static final int LIVE_PREVIEW_VOICE = 30818;
            public static final int LIVE_PUSH = 26;
            public static final int LIVE_QUIZ_APPOINT_DIALOG = 543;
            public static final int LIVE_QUIZ_BACK_CONFIRM_DIALOG = 544;
            public static final int LIVE_QUIZ_FAIL_DIALOG = 541;
            public static final int LIVE_QUIZ_LATE_DIALOG = 539;
            public static final int LIVE_QUIZ_LATE_WATCH_END_DIALOG = 542;
            public static final int LIVE_QUIZ_PROFILE_DIALOG = 552;
            public static final int LIVE_QUIZ_URGENT_EXCEPTION_DIALOG = 551;
            public static final int LIVE_QUIZ_WIN_DIALOG = 540;
            public static final int LIVE_RECEIVE_FEED = 19;
            public static final int LIVE_SELECT_VOICEPARTY = 30413;
            public static final int LIVE_SENT_GIFT = 11;
            public static final int LIVE_SOUND_EFFECT_AUTO_POPUP = 500;
            public static final int LIVE_STOP_WATCH = 25;
            public static final int LIVE_SWITCH_BEAUTY = 28;
            public static final int LIVE_SWITCH_CAMERA = 29;
            public static final int LIVE_SWITCH_FLASHLIGHT = 34;
            public static final int LIVE_SWITCH_ORIENTATION = 22;
            public static final int LIVE_SWITCH_PLAY_URL = 21;
            public static final int LIVE_SYS_TEST_SPEED = 12;
            public static final int LIVE_UPDATE = 14;
            public static final int LIVE_USER = 30844;
            public static final int LIVE_USER_CLICK = 30846;
            public static final int LIVE_USER_SHOW = 30847;
            public static final int LIVE_USE_SOUND_EFFECT = 27;
            public static final int LIVE_VOICE_PARTY = 1865;
            public static final int LIVE_WATCH = 15;
            public static final int LOADING_PAGE = 30214;
            public static final int LOAD_MORE_PHOTO_COMMENT = 305;
            public static final int LOAD_PATCH = 973;
            public static final int LOGIN_BUTTON_CLICK = 31028;
            public static final int LOGIN_MORE = 830;
            public static final int LOGIN_SUCCESS = 831;
            public static final int LOG_IN_NER_USER_RETENTION_TASK = 30832;
            public static final int LONG_PRESS_COMMENT = 1749;
            public static final int LONG_PRESS_EFFECT = 856;
            public static final int LONG_PRESS_MESSAGE = 30393;
            public static final int LYRIC_DISPLAY = 30866;
            public static final int MAKE_IM_MESSAGE = 30568;
            public static final int MAKE_SIMILAR_VIDEO = 30868;
            public static final int MAKE_VIDEO = 308;
            public static final int MANAGE_SEATS_LIST = 30195;
            public static final int METADATA_SEARCH = 30696;
            public static final int MODIFY_GROUP_CHAT_NAME = 1193;
            public static final int MODIFY_GUESS_BONUS = 561;
            public static final int MODIFY_PASSWORD = 829;
            public static final int MONITOR_H5_PAGE_LOADING = 1016;
            public static final int MORE_HOT_COMMENT_CLICK = 31004;
            public static final int MORE_HOT_COMMENT_EXPO = 31003;
            public static final int MORE_LOCAL_PHOTO_EXPO = 30979;
            public static final int MORE_PHOTOS_EXPO = 30978;
            public static final int MORE_TAG_EXPO = 30907;
            public static final int MORE_USER_EXPO = 30906;
            public static final int MORE_VERTICAL = 814;
            public static final int MOVE_WINDOW = 30119;
            public static final int MULTISEND_GIFT = 1001;
            public static final int MULTI_FRAME_GENERATE = 1914;
            public static final int MULTI_FRAME_UPLOAD = 1915;
            public static final int MULTI_SELECT_FRIEND = 1425;
            public static final int MUSIC_DOWNLOAD = 1858;
            public static final int MUSIC_STATION_VIDEO = 30145;
            public static final int MV_COMPOSITE = 472;
            public static final int MV_TEMPLATE_LOADING = 471;
            public static final int MYWALLET_ACTIVEITEMS = 30355;
            public static final int MY_REDPACKET_RECORD = 30224;
            public static final int NEARBTY_CLASSIFICATION_TAB_CLICK = 30891;
            public static final int NEARBY_CLASSIFICATION_TAB = 30890;
            public static final int NEARBY_KTV_CARD_CLICK = 30896;
            public static final int NEARBY_KTV_CARD_EXPO = 30893;
            public static final int NEARBY_MUSIC_STATION_CLICK = 30895;
            public static final int NEARBY_MUSIC_STATION_EXPO = 30894;
            public static final int NEGATIVE_FEEDBACK = 800;
            public static final int NEW_USER_RETENTION_DIALOG_SHOW = 30797;
            public static final int NOTIFICATION_OPEN_GUIDE_BANNER = 30205;
            public static final int NOTIFICATION_OPEN_GUIDE_BANNER_EXPOSURE = 30207;
            public static final int NOT_INSTALL_PLATFORM_TOAST = 30581;
            public static final int NOT_LOGIN = 30588;
            public static final int OBTAIN_PROCESSING_GAME = 1516;
            public static final int OFFICIAL_MESSAGE = 30872;
            public static final int OPEN_ALBUM = 1745;
            public static final int OPEN_ECOMMERCE_PHOTO_YELLOW_SHOPPING_TROLLEY = 30221;
            public static final int OPEN_FEED_MODEL = 1585;
            public static final int OPEN_KWAI_MUSIC_STATION_VIDEO_COMMENTS = 30953;
            public static final int OPEN_LIVE_PERMISSION = 1589;
            public static final int OPEN_NOTIFICATION = 941;
            public static final int OPEN_RED_PACK = 509;
            public static final int PACKET_OUTSIDEH5_CLICK = 30479;
            public static final int PACK_UP_LIVE_QUIZ_DIALOG = 522;
            public static final int PAGR_BUTTON_T1 = 31005;
            public static final int PAGR_BUTTON_T2 = 31006;
            public static final int PAGR_BUTTON_T3 = 31007;
            public static final int PAGR_BUTTON_T4 = 31008;
            public static final int PART_UPLOAD = 602;
            public static final int PATCH_APPLY = 1418;
            public static final int PATCH_DOWNLOAD = 1416;
            public static final int PAUSE_AUDITION_MUSIC = 906;
            public static final int PAUSE_PHOTO_IN_POPUP_WINDOW = 916;
            public static final int PAUSE_PLAY = 323;
            public static final int PAY_DEPOSIT = 8;
            public static final int PAY_EXCHANGE = 9;
            public static final int PAY_WITHDRAW = 10;
            public static final int PHOTO_PACKET_SHOW = 30226;
            public static final int PICK_COVER = 443;
            public static final int PICK_MUSIC = 434;
            public static final int PICK_PHOTO = 437;
            public static final int PICTURE_UPLOAD = 600;
            public static final int PLAY_GAME_VIDEO = 30423;
            public static final int PLAY_IN_SEARCH_RESULT_PRODUCTION_MODULE = 1452;
            public static final int PLAY_LIVE_BGM = 30930;
            public static final int PLAY_LIVE_MUSIC = 1866;
            public static final int PLAY_PHOTO = 805;
            public static final int PLUGIN_DOWNLOAD = 1417;
            public static final int PLUGIN_INSTALL = 1419;
            public static final int POKE_CLICK = 30691;
            public static final int POPUP_WINDOW_PLAYED_DURATION = 30118;
            public static final int POST_CLICK_CREATE_GROUP = 474;
            public static final int POST_CLICK_SHARE_VISIBLE_SCOPE_ENTRANCE = 473;
            public static final int POST_CLICK_SHOW_ALL_GROUPS = 475;
            public static final int POST_INSERT_EMOJI = 30439;
            public static final int POST_INSERT_PICTURE = 30438;
            public static final int POST_LIVE_COMMENT = 511;
            public static final int POST_PHOTO_COMMENT = 311;
            public static final int PREVIEW_EFFECT = 444;
            public static final int PREVIEW_INIT = 442;
            public static final int PREVIEW_LAUNCH = 441;
            public static final int PRE_LOAD_TIME_COUNT = 30755;
            public static final int PRIVATE_VERTICAL_MORE = 818;
            public static final int PUBLIC_VERTICAL_MORE = 817;
            public static final int PUBLISH_ATLAS = 610;
            public static final int PUBLISH_FULL_VIDEO = 421;
            public static final int PUBLISH_INIT = 447;
            public static final int PUBLISH_LAUNCH = 446;
            public static final int PUBLISH_MOMENT = 1743;
            public static final int PUBLISH_PHOTO = 48;
            public static final int PUBLISH_PIPELINE_FILE = 616;
            public static final int PULL_DOWN_TO_END = 907;
            public static final int PULL_PAYMENT_INFORMATION = 1284;
            public static final int PULL_TO_BACKLIST = 808;
            public static final int PULL_TO_BACKLIST_COMMENT = 1424;
            public static final int PULL_TO_CITY_ROAM = 1295;
            public static final int PULL_TO_REFRESH = 801;
            public static final int PULL_TO_SWITCH_PAGE = 1071;
            public static final int PULL_UP_CASHIER_DESK = 1283;
            public static final int PULL_UP_MORE = 863;
            public static final int PULL_UP_TO_END = 908;
            public static final int PURCHASE_NOW = 1100;
            public static final int PUSHSILENCE_CLICK = 30346;
            public static final int PUSHSILENCE_EXPOSURE = 30345;
            public static final int PUSH_SILENCE_BUTTON_CLICK = 30370;
            public static final int PUSH_SILENCE_END = 30372;
            public static final int PUSH_SILENCE_START = 30371;
            public static final int PYMK_FRIENDS_AUTHORIZATION = 1089;
            public static final int QRCODE_LOGIN = 45;
            public static final int QRCODE_SCAN = 44;
            public static final int QUERY_PATCH = 970;
            public static final int QUICK_OPEN = 1669;
            public static final int QUIT_GAME = 1664;
            public static final int QUIT_SEATS = 30200;
            public static final int QUIT_SYSTEM_AUTHORIZATION_PAGE = 30188;
            public static final int QUIZ_BALANCE_BIND_ACCOUNT = 550;
            public static final int QUIZ_BALANCE_CRASH_OUT_FREQUENCY_DIALOG = 548;
            public static final int QUIZ_BALANCE_CRASH_OUT_OPERATION = 549;
            public static final int QUIZ_BALANCE_CRASH_OUT_THRESHOLD_DIALOG = 547;
            public static final int QUIZ_ENTRY_INPUT_INVITE_CODE_DIALOG = 546;
            public static final int QUIZ_ENTRY_NOTIFICATION_SETTINGS_DIALOG = 545;
            public static final int QUOTES_DISPLAY = 30867;
            public static final int RANK_CUSTOM_STICKER = 30264;
            public static final int READ_ALL = 1197;
            public static final int READ_TO_THE_END = 30215;
            public static final int RECALL_MESSAGE = 30397;
            public static final int RECEIVEPUSHNOTIFY = 30619;
            public static final int RECEIVE_AWARD = 30547;
            public static final int RECEIVE_BTN = 30791;
            public static final int RECEIVE_NOTIFICATION_PUSH = 962;
            public static final int RECEIVE_VOICE_COMMENT = 1365;
            public static final int RECOGNIZE_ELECTRONICCOMMERCE_KWAI_TOKEN = 30040;
            public static final int RECOMMEND_EMOJI = 30545;
            public static final int RECOMMEND_FANS_VIDEO_CLOSE_BUTTON_CLICK = 30991;
            public static final int RECOMMEND_FANS_VIDEO_CLOSE_BUTTON_EXPO = 30987;
            public static final int RECOMMEND_INTEREST = 911;
            public static final int RECOMMEND_STAR_FRIEND_ICON = 30751;
            public static final int RECOMMEND_STAR_FRIEND_TIP = 30754;
            public static final int RECOMMEND_STICKER = 30052;
            public static final int RECORD_CHANNEL_PAYMENT_RESULT = 1285;
            public static final int RECORD_FEATURE_GUIDE_DIALOG = 412;
            public static final int RECORD_LIVE_BEAUTY_FEATURE_SETTINGS = 538;
            public static final int RECORD_LOGIN_BGM_STATUS = 1139;
            public static final int RECORD_PRODUCTION_MAKE_OPERATION = 406;
            public static final int RECORD_PRODUCTION_SHOW_OPERATION = 478;
            public static final int RECORD_VIDEO_EDIT_OPERATION = 404;
            public static final int RECORD_VOICE = 30279;
            public static final int REDUCE_SIMILAR_PHOTO = 52;
            public static final int RED_DOT_NOTIFY = 1909;
            public static final int RED_PACK_LUCKY_LIST = 508;
            public static final int REG_PAGE_KID_INPUT = 30774;
            public static final int RELATE_CONTACTS = 920;
            public static final int RELATE_QQ_FRIENDS = 919;
            public static final int REMOVE_BINDING = 1120;
            public static final int REMOVE_FANS = 1225;
            public static final int REMOVE_FROM_BLACKLIST = 1211;
            public static final int REMOVE_GROUP_MEMBERS = 1187;
            public static final int REMOVE_STAR_FRIEND = 30342;
            public static final int REPLY_PHOTO_COMMENT = 301;
            public static final int REPLY_STORY_COMMENT = 30494;
            public static final int REPORT_CUSTOM_STICKER = 30457;
            public static final int REPORT_DEGRADE_DETAIL_INFORMATION = 985;
            public static final int REPORT_LIVE_EXCEPTION_QUIT = 1037;
            public static final int REPORT_MATCH_STRANGER = 1738;
            public static final int REPORT_MOMENT_CONTENT = 30131;
            public static final int REPORT_PAY_USE_COUPON_RESULT = 30088;
            public static final int REPORT_UPLOAD_CDN_RESULT = 977;
            public static final int REPORT_USED_HYBRID_INFORMATION = 1014;
            public static final int REQUEST_ATLAS_KEY = 608;
            public static final int REQUEST_PIPELINE_UPLOAD_KEY = 614;
            public static final int REQUEST_SEGMENT_INFO = 603;
            public static final int REQUEST_UPDATE = 1293;
            public static final int REQUEST_UPLOAD_URL = 976;
            public static final int RESEND_AUTHENTICATION_CODE = 1051;
            public static final int RESERVE_GAME = 1661;
            public static final int RESET_FACTORY_DATA = 1119;
            public static final int RESET_PASSWORD_SUCCESS = 30316;
            public static final int RESET_PASSWORD_SUCCESS_LOGIN_EXCEPTION = 1880;
            public static final int RESTART_GLASSES = 1116;
            public static final int RESULT_LOGIN_REGISTER_PHONE_VERIFY_SEND = 30586;
            public static final int RESUME_PHOTO_IN_POPUP_WINDOW = 917;
            public static final int RESUME_PLAY = 324;
            public static final int RETRIEVE_ACCOUNT = 978;
            public static final int RETRIEVE_PASSWORD = 866;
            public static final int RETRY_DETECTION = 1118;
            public static final int RETRY_PARING = 1108;
            public static final int RETURN_HOME_PAGE = 1522;
            public static final int RETURN_TO_VIEW_DETAIL = 1102;
            public static final int REUPLOAD_PRODUCTION = 1068;
            public static final int REUPLOAD_VIDEO = 980;
            public static final int REVOKE_NEGATIVE_FEEDBACK = 1076;
            public static final int ROLLBACK_PATCH = 974;
            public static final int SAVE_AND_EXIT = 1457;
            public static final int SAVE_TO_DRAFT_BOX = 1456;
            public static final int SAY_HELLO = 30128;
            public static final int SBU_BUTTON_LIVEROOM = 30223;
            public static final int SCAN_RECOGNITION = 1748;
            public static final int SEARCH_CONTACTS = 913;
            public static final int SEARCH_QQ_FRIENDS = 912;
            public static final int SEARCH_RESULT_EXPO = 30888;
            public static final int SEATS_REMOVE_CLICK = 30196;
            public static final int SEGMENT_UPLOAD = 601;
            public static final int SELECT_ALL = 1126;
            public static final int SELECT_A_FRIEND = 31011;
            public static final int SELECT_A_GROUP = 31010;
            public static final int SELECT_EMOJI = 30110;
            public static final int SELECT_EPISODE = 1908;
            public static final int SELECT_GIFT = 888;
            public static final int SELECT_GIFT_COUNT = 1000;
            public static final int SELECT_LANGUAGE = 1227;
            public static final int SELECT_MESSAGESHARE_TARGET = 30037;
            public static final int SELECT_MUSIC_EFFECT = 905;
            public static final int SELECT_MUSIC_LIST = 903;
            public static final int SELECT_OTHER_AMOUNT = 1508;
            public static final int SELECT_TEMPLATE = 30635;
            public static final int SELECT_THIRD_PARTY_PLATFORM = 935;
            public static final int SEM_DOWN_BOTTOM = 30501;
            public static final int SEM_DOWN_HEAD = 30502;
            public static final int SEM_DOWN_PHOTO = 30503;
            public static final int SEM_DYMAMIC_ALL_TIME = 30943;
            public static final int SEM_DYMAMIC_BUTTON = 30736;
            public static final int SEM_DYMAMIC_LOAD_TIME = 30942;
            public static final int SEM_DYMAMIC_PHOTO = 30737;
            public static final int SEM_LOAD_ALL_TIME = 30950;
            public static final int SEM_LOAD_TIME = 30949;
            public static final int SEM_PHOTO_LIST = 30504;
            public static final int SEM_STATIC_ALL_TIME = 30945;
            public static final int SEM_STATIC_BOTTOM = 30708;
            public static final int SEM_STATIC_BUTTOM = 30734;
            public static final int SEM_STATIC_BUTTON = 30735;
            public static final int SEM_STATIC_LOAD_TIME = 30944;
            public static final int SEM_STATIC_PHOTO = 30709;
            public static final int SEND_COMMENT_EMOJI = 30117;
            public static final int SEND_COMMENT_IN_SHARE_CARD = 1565;
            public static final int SEND_CUSTOM_STICKER = 30260;
            public static final int SEND_EMOJI = 1358;
            public static final int SEND_FEEDBACK = 1124;
            public static final int SEND_GIFT = 889;
            public static final int SEND_GROUP_INFOR = 1686;
            public static final int SEND_LIVE_QUIZ_ANSWER = 530;
            public static final int SEND_LIVE_QUIZ_TO_AUDIENCE = 521;
            public static final int SEND_MESSAGE = 880;
            public static final int SEND_RECOMMEND_EMOJI = 30546;
            public static final int SEND_RED_PACK = 507;
            public static final int SEND_STICKER = 1351;
            public static final int SEND_TO_FRIENDS = 968;
            public static final int SEND_VOICE = 30280;
            public static final int SEND_VOICE_COMMENT = 1364;
            public static final int SETTING_CHILD_LOCK_MODEL = 30615;
            public static final int SETUP_CHILD_LOCK = 1074;
            public static final int SET_ALLOW_TO_USE_BACKGROUND_MUSIC_SWITCH = 1077;
            public static final int SET_CAMERA = 1514;
            public static final int SET_E_COMMERCE_LINK = 897;
            public static final int SET_GROUP_INFOR = 1685;
            public static final int SET_GROUP_NICKNAME = 1683;
            public static final int SET_KID_BUTTON = 30775;
            public static final int SET_KID_COMPLETE_BUTTON = 30776;
            public static final int SET_KWAI_ID = 877;
            public static final int SET_LIKE_PRODUCTION_STATUS = 1288;
            public static final int SET_LIVE_FEATURES = 537;
            public static final int SET_LIVE_GAME_CATEGORY = 505;
            public static final int SET_LIVE_HORIZONTAL_COVER = 504;
            public static final int SET_LIVE_TITLE = 502;
            public static final int SET_LIVE_VERTICAL_COVER = 503;
            public static final int SET_LOCAL_OPTION = 453;
            public static final int SET_MESSAGE_TO_BE_UNDISTURBED = 1189;
            public static final int SET_MULTI_GRAPH_MODE = 1011;
            public static final int SET_PHOTO_FRIENDS_CAN_SEE = 1831;
            public static final int SET_PHOTO_PRIVATE = 883;
            public static final int SET_PHOTO_PUBLIC = 882;
            public static final int SET_PHOTO_RINGTONE = 1857;
            public static final int SET_PRIVACY = 1378;
            public static final int SET_PRODUCTION_STATUS = 418;
            public static final int SET_REMARK_NAME = 993;
            public static final int SET_TAG_SWITCH = 1045;
            public static final int SET_UNDERAGE_INVISIBLE_SWITCH = 454;
            public static final int SET_USE_SOUND = 1512;
            public static final int SET_VOICE_COMMENT_SWITCH = 1361;
            public static final int SET_WHO_CAN_MEASSAGE_ME = 1005;
            public static final int SF2018_UPLOAD_FILE = 989;
            public static final int SF2018_VIDEO_STAT = 986;
            public static final int SHARE_AND_ADD_WATERMARK = 1465;
            public static final int SHARE_EXCHANGE = 536;
            public static final int SHARE_FROM_OTHER_APP = 47;
            public static final int SHARE_GAME = 1665;
            public static final int SHARE_IDENTIFY = 1414;
            public static final int SHARE_LIVE = 514;
            public static final int SHARE_LIVE_QUIZ = 535;
            public static final int SHARE_PHOTO = 33;
            public static final int SHARE_PHOTO_ENTRANCE = 1567;
            public static final int SHARE_PHOTO_EXPOSE_PLATFORM = 30576;
            public static final int SHARE_PROFILE = 847;
            public static final int SHARE_QRCODE = 46;
            public static final int SHARE_RED_PACK = 983;
            public static final int SHARE_RED_PACKET_RAIN_RESULT = 1861;
            public static final int SHARE_RED_PACKET_RAIN_RULE = 1860;
            public static final int SHARE_STICKER = 1730;
            public static final int SHARE_SUCCESS = 844;
            public static final int SHARE_TOPIC = 843;
            public static final int SHARE_TO_MSG_FRIEND = 30652;
            public static final int SHOW_ABOUT_KWAI = 1633;
            public static final int SHOW_ACCOUNT_EXCEPTION = 30310;
            public static final int SHOW_ACCOUNT_EXCEPTION_LOGIN = 30311;
            public static final int SHOW_ACTIVITY_ENTRANCE = 1606;
            public static final int SHOW_ADDICTION_PREVENTION_DIALOG = 30667;
            public static final int SHOW_ADDICTION_PREVENTION_DIALOG_SUPPORT = 30714;
            public static final int SHOW_ADDICTION_PREVENTION_DIALOG_VERIFY_IDENTITY = 30738;
            public static final int SHOW_ADD_PROFILE_TAG = 30102;
            public static final int SHOW_ADD_SHORTCUT_TO_DESKTOP_DIALOG = 1862;
            public static final int SHOW_AGGREGATION_NOTIFICATION = 1163;
            public static final int SHOW_AGGREGATION_NOTIFICATION_ICON = 30480;
            public static final int SHOW_ALBUM_BUTTON = 30066;
            public static final int SHOW_ALLOW_TO_USE_BACKGROUND_MUSIC_SWITCH = 1078;
            public static final int SHOW_ANCHOR_AUDIENCE_CHAT_FEED_ACCEPT = 30688;
            public static final int SHOW_ANCHOR_AUDIENCE_VIDEO_CHAT_FOLLOW_TIPS = 30860;
            public static final int SHOW_ANCHOR_AUDIENCE_VOICE_CHAT_FOLLOW_TIPS = 30861;
            public static final int SHOW_ANCHOR_AVATAR = 1026;
            public static final int SHOW_ANCHOR_CHAT_FOLLOW_TIPS = 30686;
            public static final int SHOW_ANCHOR_CHAT_INVITATION_POPUP = 30682;
            public static final int SHOW_ANCHOR_CHAT_OPEN_TIPS = 30674;
            public static final int SHOW_ANCHOR_CHAT_RECOMMEND_LIST = 30677;
            public static final int SHOW_ANCHOR_CHAT_USE_TIPS = 30676;
            public static final int SHOW_ANCHOR_PK_GUIDE = 30671;
            public static final int SHOW_ANTI_ADDICTION_POPUP_WINDOW = 1103;
            public static final int SHOW_AT_FRIEND = 1022;
            public static final int SHOW_AT_NOTIFICATION_CLUSTER = 30508;
            public static final int SHOW_AT_ORIGINAL_SOUND_AUTHOR = 1292;
            public static final int SHOW_AUDIENCE_CHAT_ACCEPTED_VIDEO = 1812;
            public static final int SHOW_AUDIENCE_CHAT_INVITE_VIDEO = 1817;
            public static final int SHOW_AUTHOR_AVATAR = 319;
            public static final int SHOW_AUTHOR_INTERACTION_RECEIVED = 1893;
            public static final int SHOW_AUTHOR_LIKE_TAG = 30079;
            public static final int SHOW_AUTHOR_MILESTONE = 1890;
            public static final int SHOW_AUTHOR_PLAYED_MOST_PHOTO = 1892;
            public static final int SHOW_AUTHOR_RANK_IN_FRIENDS = 1894;
            public static final int SHOW_AUTHOR_RECOMMENDED_AUTHORS = 1895;
            public static final int SHOW_AUTHOR_TRENDING_ACTIVITIES = 1896;
            public static final int SHOW_AUTHOR_WEEKLY_ACHIEVEMENT = 1891;
            public static final int SHOW_AUTO_COMMENT_FOLLOW = 30140;
            public static final int SHOW_BACKAGE_POP = 30971;
            public static final int SHOW_BACKAGE_TAB_BTN = 30972;
            public static final int SHOW_BANNER = 851;
            public static final int SHOW_BET_ENTRANCE = 30500;
            public static final int SHOW_BET_RESULT_DETAIL = 30300;
            public static final int SHOW_BE_INFORMED_AFTER_PUBLISH_TIP = 1242;
            public static final int SHOW_BIG_LINK = 1757;
            public static final int SHOW_BILLBOARD_ICON = 31024;
            public static final int SHOW_BIND_PHONE_DIALOG = 981;
            public static final int SHOW_BOTTOM_BUTTON_ADMINISTRATOR = 1368;
            public static final int SHOW_BOTTOM_BUTTON_BULLETSCREEN = 1388;
            public static final int SHOW_BOTTOM_BUTTON_CLASS = 1386;
            public static final int SHOW_BOTTOM_BUTTON_CLASSFREE = 1387;
            public static final int SHOW_BOTTOM_BUTTON_DEFINITION = 1385;
            public static final int SHOW_BOTTOM_BUTTON_FLOATING_WINDOW = 1734;
            public static final int SHOW_BOTTOM_BUTTON_GUESS = 1366;
            public static final int SHOW_BOTTOM_BUTTON_MORE = 1371;
            public static final int SHOW_BOTTOM_BUTTON_PENDINGLIVE = 1731;
            public static final int SHOW_BOTTOM_BUTTON_ROTATE = 1369;
            public static final int SHOW_BOTTOM_BUTTON_SHARE = 1370;
            public static final int SHOW_BOTTOM_BUTTON_SHOP = 1367;
            public static final int SHOW_BROWSE_RECORDS = 1625;
            public static final int SHOW_BUILT_IN_MUSIC = 410;
            public static final int SHOW_CHANGE_AVATAR_BUTTON = 30174;
            public static final int SHOW_CHANGE_AVATAR_DIALOG = 30176;
            public static final int SHOW_CHANGE_NICKNAME_ICON = 30584;
            public static final int SHOW_CHANNEL_LIVE_BGM_PANEL = 30961;
            public static final int SHOW_CHEST = 30272;
            public static final int SHOW_CHEST_CLOSE = 30274;
            public static final int SHOW_CHEST_FIRSTGET = 30276;
            public static final int SHOW_CHEST_GET = 30273;
            public static final int SHOW_CHEST_KSHELL_NOTENOUGHT = 30275;
            public static final int SHOW_CHEST_POP_UP = 30277;
            public static final int SHOW_CHILD_LOCK_CLOSE_POPUP_WINDOW = 1073;
            public static final int SHOW_CHILD_LOCK_DIALOG = 30614;
            public static final int SHOW_CHILD_LOCK_ENTRANCE = 1072;
            public static final int SHOW_CHILD_RECOGNITION_DIALOG = 30705;
            public static final int SHOW_CHILD_RECOGNITION_DIALOG_SUPPORT = 30713;
            public static final int SHOW_CLOSE_WINDOW_AUTO_PLAY = 30344;
            public static final int SHOW_COLLECTION_ICON = 30812;
            public static final int SHOW_COLLECTION_ITEM = 30914;
            public static final int SHOW_COLLECTION_TAB = 1543;
            public static final int SHOW_COLLECT_TAB = 1161;
            public static final int SHOW_COMMENT = 30020;
            public static final int SHOW_COMMENT_NOTIFICATION_CLUSTER = 30509;
            public static final int SHOW_COMMENT_PHOTO = 30141;
            public static final int SHOW_COMMENT_TAB = 30491;
            public static final int SHOW_CONCEPT_DISC = 1588;
            public static final int SHOW_CONTACT_AUTHORIZATION_DIGLOG = 30023;
            public static final int SHOW_CONTACT_FRIENDS_ITEM = 30019;
            public static final int SHOW_CONTACT_LIST = 957;
            public static final int SHOW_CONTINUE_EDIT_DIALOG = 1576;
            public static final int SHOW_COPY_ID = 30178;
            public static final int SHOW_COUPON = 30085;
            public static final int SHOW_COURSE_ENTRANCE = 1097;
            public static final int SHOW_COURSE_EVALUATION_DIALOG = 1216;
            public static final int SHOW_COURSE_REFUSE_DIALOG = 1213;
            public static final int SHOW_CREATIVITIES_TAB = 1864;
            public static final int SHOW_CURFEW_DIALOG = 30715;
            public static final int SHOW_CURFEW_DIALOG_SUPPORT = 30716;
            public static final int SHOW_CUSTOM_STICKER = 30262;
            public static final int SHOW_DATE_ASSISTANT_ENTRANCE = 1273;
            public static final int SHOW_DETAIL_MESSAGE_BUTTON = 30237;
            public static final int SHOW_DOWNLOAD_BUTTON = 30164;
            public static final int SHOW_DOWNLOAD_MANAGEMENT = 30072;
            public static final int SHOW_DOWNLOAD_NOW = 1034;
            public static final int SHOW_DYNAMIC_MESSAGE = 1439;
            public static final int SHOW_DYNAMIC_POPUP = 1545;
            public static final int SHOW_ECOMMERCE_PHOTO_ITEM_FLOAT_WINDOW = 30218;
            public static final int SHOW_ECOMMERCE_PHOTO_YELLOW_SHOPPING_TROLLEY = 30216;
            public static final int SHOW_ELECTRONICCOMMERCE_COMMENT = 30025;
            public static final int SHOW_ELECTRONICCOMMERCE_FLOAT_WINDOW = 30028;
            public static final int SHOW_ENABLE_CAMERA_MICROPHONE_GUIDE = 948;
            public static final int SHOW_ENABLE_CONTACTS_GUIDE = 944;
            public static final int SHOW_ENABLE_LOCATION_GUIDE = 942;
            public static final int SHOW_ENABLE_STORAGE_GUIDE = 946;
            public static final int SHOW_ENABLE_STORAGE_PHONE_GUIDE = 951;
            public static final int SHOW_EXSIT_REGISTER_USER = 1321;
            public static final int SHOW_FANS_COUPON_DELIVER_POPUP = 1590;
            public static final int SHOW_FANS_TOP = 836;
            public static final int SHOW_FANS_TOP_BUBBLE = 838;
            public static final int SHOW_FEED_RECOMMEND_POISITION = 1627;
            public static final int SHOW_FILTER = 407;
            public static final int SHOW_FIND_CONTACT_BUTTON = 30012;
            public static final int SHOW_FIND_CONTACT_LIST_BUTTON = 961;
            public static final int SHOW_FIND_QQ_FRIEND_LIST_BUTTON = 960;
            public static final int SHOW_FIND_TAB = 1610;
            public static final int SHOW_FINISH_BUTTON = 30129;
            public static final int SHOW_FIRST_CLASSIFIER = 1583;
            public static final int SHOW_FIRST_INPUT_MOMENT = 1759;
            public static final int SHOW_FIRST_SENT_GIFT = 30612;
            public static final int SHOW_FOLLOW_ALL_BUTTON = 30121;
            public static final int SHOW_FOLLOW_BUTTON = 30070;
            public static final int SHOW_FOLLOW_BUTTON_GUILD = 30597;
            public static final int SHOW_FOLLOW_FRIENDS_BUTTON = 958;
            public static final int SHOW_FOLLOW_IN_SHARE_CARD = 1560;
            public static final int SHOW_FOLLOW_LIVING_HEAD = 30429;
            public static final int SHOW_FOLLOW_SHOOT_BUTTON = 1688;
            public static final int SHOW_FOLLOW_TAB = 1608;
            public static final int SHOW_FREE_AUDITION = 1098;
            public static final int SHOW_FREE_AUDITION_TO_END = 1099;
            public static final int SHOW_FREE_TRAFFIC_POPUP = 1916;
            public static final int SHOW_FRIEND_LIST = 982;
            public static final int SHOW_GAMELIVE_ACTIVITY = 31044;
            public static final int SHOW_GAMELIVE_BACK_HOMEPAGE = 31036;
            public static final int SHOW_GAMELIVE_FEATURE_TAB = 31038;
            public static final int SHOW_GAMELIVE_GAMECARD = 31016;
            public static final int SHOW_GAMELIVE_GAME_CATEGORY = 31029;
            public static final int SHOW_GAMELIVE_HERO = 31042;
            public static final int SHOW_GAMELIVE_INFORMATION_MORE = 31046;
            public static final int SHOW_GAMELIVE_LIVECARD = 31022;
            public static final int SHOW_GAMELIVE_MORE_HERO = 31040;
            public static final int SHOW_GAMELIVE_PHOTOCARD = 31023;
            public static final int SHOW_GAMETAG_MORE = 31015;
            public static final int SHOW_GAMEZONE_DOWNLOAD_CHANNEL = 40035;
            public static final int SHOW_GAMEZONE_EXCELLENTPOST_CARD = 30353;
            public static final int SHOW_GAMEZONE_FOLLOW_LIVING_NAME = 30431;
            public static final int SHOW_GAMEZONE_GAMEPICTURE = 30356;
            public static final int SHOW_GAMEZONE_GAMEVIDEO = 30749;
            public static final int SHOW_GAMEZONE_GAME_BANNER = 40002;
            public static final int SHOW_GAMEZONE_GAME_CARD = 40000;
            public static final int SHOW_GAMEZONE_GAME_DETAIL_RESOURCE = 40005;
            public static final int SHOW_GAMEZONE_GAME_RECOMMEND = 40001;
            public static final int SHOW_GAMEZONE_HOME_PAGE_BUTTON = 30732;
            public static final int SHOW_GAMEZONE_HOTGAME_CARD = 30351;
            public static final int SHOW_GAMEZONE_HOTSEARCH = 30527;
            public static final int SHOW_GAMEZONE_LIVESTREAM_GAME_ICON = 40037;
            public static final int SHOW_GAMEZONE_LIVE_CARD = 40003;
            public static final int SHOW_GAMEZONE_LIVE_ENTRY_BUTTON = 30728;
            public static final int SHOW_GAMEZONE_POST = 30373;
            public static final int SHOW_GAMEZONE_REVIEW_TEST_FLOATING = 40004;
            public static final int SHOW_GAMEZONE_START_LIVE_PUSH_BUTTON = 30731;
            public static final int SHOW_GAMEZONE_VIDEOPLAY_COMMENTFOLLOW = 30425;
            public static final int SHOW_GAMEZONE_VIDEOPLAY_LIVING = 30421;
            public static final int SHOW_GAMEZONE_VIDEOPLAY_MORE = 30419;
            public static final int SHOW_GAMEZONE_VIDEO_BULLET_BUTTON = 40040;
            public static final int SHOW_GAMEZONG_FOLLOW_MORE = 30433;
            public static final int SHOW_GAME_CENTER = 1539;
            public static final int SHOW_GAME_CENTER_CELL = 1648;
            public static final int SHOW_GAME_INPUT_DIALOG = 1454;
            public static final int SHOW_GAME_LIVE = 1653;
            public static final int SHOW_GAME_RESULT = 1737;
            public static final int SHOW_GAME_VERTICAL_MODEL_NOTIFY = 1352;
            public static final int SHOW_GAME_VIDEO = 1651;
            public static final int SHOW_GET_FANS_COUPON_POPUP = 1613;
            public static final int SHOW_GET_MONEY_SUCCESSFUL_DIALOG = 1307;
            public static final int SHOW_GIFT_DIALOG = 1154;
            public static final int SHOW_GOODS_INFO = 30758;
            public static final int SHOW_GOODS_LIST = 556;
            public static final int SHOW_GOSSIP_MESSAGE = 1702;
            public static final int SHOW_GROUP_NUMBERS = 30183;
            public static final int SHOW_GROUP_ONLY = 455;
            public static final int SHOW_GUIDE_BUBBLE = 32001;
            public static final int SHOW_HAMBURGER_BUBBLE = 30905;
            public static final int SHOW_HEAD = 30171;
            public static final int SHOW_HOME_TAB = 1612;
            public static final int SHOW_HOT_ACTIVITY = 1601;
            public static final int SHOW_HOT_POSITION = 1324;
            public static final int SHOW_HOT_RESORT = 1599;
            public static final int SHOW_HOT_SITE = 1604;
            public static final int SHOW_ICON_HOTTEST_TOPICS = 30063;
            public static final int SHOW_IMPORT_TO_COLLECTION = 30816;
            public static final int SHOW_INFORMED_BUTTON = 1243;
            public static final int SHOW_INFORM_USER_BUTTON = 1244;
            public static final int SHOW_INTOWN_MESSAGE = 1396;
            public static final int SHOW_INVITE_QCODE = 1320;
            public static final int SHOW_JOIN_VIDEO_REC = 1164;
            public static final int SHOW_KUAISHAN_ENTRANCE = 488;
            public static final int SHOW_KWAICARD_SUCCESS = 30810;
            public static final int SHOW_KWAI_MUSIC_STATION_APPLY = 30374;
            public static final int SHOW_KWAI_MUSIC_STATION_APPLY_RULE = 30359;
            public static final int SHOW_KWAI_MUSIC_STATION_AUTHOR_VIDEO_MATCH_AUTHOR_VIDEO_CARD = 30784;
            public static final int SHOW_KWAI_MUSIC_STATION_AUTHOR_VIDEO_MATCH_LIVE_BUTTON = 30787;
            public static final int SHOW_KWAI_MUSIC_STATION_AUTHOR_VIDEO_MATCH_RECOMMEND_CARD = 30786;
            public static final int SHOW_KWAI_MUSIC_STATION_DISLIKE = 30853;
            public static final int SHOW_KWAI_MUSIC_STATION_FEED = 30923;
            public static final int SHOW_KWAI_MUSIC_STATION_MESSAGE = 30472;
            public static final int SHOW_KWAI_MUSIC_STATION_OPEN_KWAICODE = 30606;
            public static final int SHOW_KWAI_MUSIC_STATION_RECORD_FAIL_RETRY = 30368;
            public static final int SHOW_KWAI_MUSIC_STATION_RECORD_VIDEO_CARD = 30361;
            public static final int SHOW_KWAI_MUSIC_STATION_VIDEO_COMMENTS = 30955;
            public static final int SHOW_KWAI_TOKEN_OPEN_POPUP_WINDOW = 1132;
            public static final int SHOW_KWAI_TOKEN_SHARE_POPUP_WINDOW = 1131;
            public static final int SHOW_LACK_OF_BALANCE_PANEL = 1505;
            public static final int SHOW_LACK_OF_BALANCE_POPUP = 1504;
            public static final int SHOW_LAST_HISTORY_BAR = 1421;
            public static final int SHOW_LIKE_NOTIFICATION_CLUSTER = 30510;
            public static final int SHOW_LINK = 30050;
            public static final int SHOW_LIST_LIVE_BGM_LIKE_PANEL = 30960;
            public static final int SHOW_LIST_LIVE_BGM_MATCH_SUCCESS = 30958;
            public static final int SHOW_LIVEMATE_ADVICE_BANNER = 1397;
            public static final int SHOW_LIVEMATE_ANTI_ADDITION_ALERT = 1399;
            public static final int SHOW_LIVEWISH_ALERT = 1710;
            public static final int SHOW_LIVEWISH_SETENTRANCE = 1708;
            public static final int SHOW_LIVE_AUDIENCE_CHAT = 1806;
            public static final int SHOW_LIVE_AUDIENCE_CHAT_ACCEPTED = 1811;
            public static final int SHOW_LIVE_AUDIENCE_CHAT_APPLY = 1807;
            public static final int SHOW_LIVE_AUDIENCE_CHAT_INVITE = 1816;
            public static final int SHOW_LIVE_AUDIENCE_CHAT_LIST = 1802;
            public static final int SHOW_LIVE_AUDIENCE_CHAT_WAIT = 1809;
            public static final int SHOW_LIVE_AUDIENCE_PK = 1271;
            public static final int SHOW_LIVE_BAN_STATUS_BUTTON = 1570;
            public static final int SHOW_LIVE_BGM_PLAYER = 30924;
            public static final int SHOW_LIVE_BGM_TYPE = 30910;
            public static final int SHOW_LIVE_BLOCK = 1434;
            public static final int SHOW_LIVE_BROADCAST = 852;
            public static final int SHOW_LIVE_FLOATING_WINDOW = 1577;
            public static final int SHOW_LIVE_FLOATING_WINDOW_ASK_DIALOG = 30390;
            public static final int SHOW_LIVE_FLOATING_WINDOW_PERMISSION_DIALOG = 1779;
            public static final int SHOW_LIVE_GAME_TAG = 30031;
            public static final int SHOW_LIVE_GUESS_ENTRANCE = 566;
            public static final int SHOW_LIVE_GUESS_RESULT = 565;
            public static final int SHOW_LIVE_INFO = 30760;
            public static final int SHOW_LIVE_KWAI_MUSIC_STATION_ICON = 30662;
            public static final int SHOW_LIVE_KWAI_MUSIC_STATION_STATE = 30699;
            public static final int SHOW_LIVE_LESSON_SALE = 1299;
            public static final int SHOW_LIVE_MORE_AUDIENCE_CHAT = 1798;
            public static final int SHOW_LIVE_MORE_PK = 1272;
            public static final int SHOW_LIVE_PK_BLOCK = 1430;
            public static final int SHOW_LIVE_PK_CITYWIDE = 1550;
            public static final int SHOW_LIVE_PK_CLOSE_MICROPHONE = 1553;
            public static final int SHOW_LIVE_PK_END_ADVANCE_FEEDBACK = 1551;
            public static final int SHOW_LIVE_PK_END_ONEMORE = 1267;
            public static final int SHOW_LIVE_PK_FRIEND_INVITE = 1250;
            public static final int SHOW_LIVE_PK_FRIEND_OTHERS = 1255;
            public static final int SHOW_LIVE_PK_INVITED_ACCEPT = 1257;
            public static final int SHOW_LIVE_PK_LIKE_MOMENT = 1594;
            public static final int SHOW_LIVE_PK_OPPOSITE_FOLLOW = 30377;
            public static final int SHOW_LIVE_PK_RECORD_LIST = 1822;
            public static final int SHOW_LIVE_PK_RULE_POPUP = 1500;
            public static final int SHOW_LIVE_PK_STANDARD = 1502;
            public static final int SHOW_LIVE_PK_STOP = 1265;
            public static final int SHOW_LIVE_PREVIEW_ADDCOVER = 1327;
            public static final int SHOW_LIVE_PREVIEW_ADDTITLE = 1331;
            public static final int SHOW_LIVE_PREVIEW_CHANGE_COVER = 1329;
            public static final int SHOW_LIVE_PREVIEW_HISTORY_TITLE = 1333;
            public static final int SHOW_LIVE_PREVIEW_NEW_GUIDEPOP = 1326;
            public static final int SHOW_LIVE_PUSH_ADD_MUSIC = 30388;
            public static final int SHOW_LIVE_QUIZ_DIALOG = 531;
            public static final int SHOW_LIVE_QUIZ_ENTRANCE = 528;
            public static final int SHOW_LIVE_QUIZ_SETTINGS_ENTRANCE = 527;
            public static final int SHOW_LIVE_VOTE_ENTRANCE = 30837;
            public static final int SHOW_LIVE_VOTE_GUESS = 31001;
            public static final int SHOW_LIVE_VOTE_PANEL = 30839;
            public static final int SHOW_LIVE_VOTE_RESULT = 30840;
            public static final int SHOW_LOCATION_TAG = 1754;
            public static final int SHOW_LOGIN_BGPICTURE = 1151;
            public static final int SHOW_LOG_OUT_BUTTON = 1643;
            public static final int SHOW_LONG_PRESS_DIALOG = 30458;
            public static final int SHOW_MAGIC_FACE = 411;
            public static final int SHOW_MAGIC_FACE_COVER = 426;
            public static final int SHOW_MAGIC_FACE_ENTRANCE = 424;
            public static final int SHOW_MAKEUP = 1382;
            public static final int SHOW_MASSAGE_CARD = 30557;
            public static final int SHOW_MATCH_FRAME = 1355;
            public static final int SHOW_MEMORY_ACTIVITY_ENTRANCE = 1872;
            public static final int SHOW_MERCHANT_CERTIFICATION = 30823;
            public static final int SHOW_MERCHANT_TRILATERAL_ITEM_DETAIL_COMMENT = 30874;
            public static final int SHOW_MERCHANT_TRILATERAL_ITEM_DETAIL_COMMENT_ADD = 30880;
            public static final int SHOW_MERCHANT_TRILATERAL_ITEM_DETAIL_COMMENT_LABEL = 30939;
            public static final int SHOW_MERCHANT_TRILATERAL_ITEM_DETAIL_COMMENT_PHOTO = 30878;
            public static final int SHOW_MERCHANT_TRILATERAL_ITEM_DETAIL_COMMENT_TEXT = 30882;
            public static final int SHOW_MERCHANT_TRILATERAL_ITEM_DETAIL_COMMENT_VIDEO = 30876;
            public static final int SHOW_MERCHANT_TRILATERAL_ITEM_DETAIL_ECOITEM = 30703;
            public static final int SHOW_MERCHANT_TRILATERAL_ITEM_DETAIL_PHOTO = 30702;
            public static final int SHOW_MERCHANT_TRILATERAL_ITEM_DETAIL_STORE = 30701;
            public static final int SHOW_MERCHANT_TRILATERAL_ITEM_DETAIL_TAOBAO_COMMENT = 30984;
            public static final int SHOW_MOMENT = 30059;
            public static final int SHOW_MOMENT_COMMENT = 30030;
            public static final int SHOW_MOMENT_GENERAL_ENTRANCE = 30332;
            public static final int SHOW_MOMENT_PICTURE_RESULT = 30334;
            public static final int SHOW_MOMENT_SQUARE = 30057;
            public static final int SHOW_MOMENT_TAG_SELECT = 1704;
            public static final int SHOW_MORE_BUTTON = 30179;
            public static final int SHOW_MORE_DIALOG = 30181;
            public static final int SHOW_MORE_MUSIC = 1093;
            public static final int SHOW_MORE_SEARCH_RESULT = 1768;
            public static final int SHOW_MORE_TAGS = 30095;
            public static final int SHOW_MUSIC_CHANNELS = 1889;
            public static final int SHOW_MUSIC_COVER = 1040;
            public static final int SHOW_MUSIC_CUT = 1041;
            public static final int SHOW_MUSIC_LIST = 1162;
            public static final int SHOW_MUSIC_RECOMMEND_DIALOG = 1876;
            public static final int SHOW_MUSIC_STATION = 1671;
            public static final int SHOW_MUSIC_STATION_MORELIST = 30152;
            public static final int SHOW_MUSIC_STATION_MORELIST_VIDEO = 30154;
            public static final int SHOW_MUSIC_STATION_VIDEO = 30146;
            public static final int SHOW_MUSIC_TAB = 1095;
            public static final int SHOW_MUTUAL_FRIENDS_TIPS = 923;
            public static final int SHOW_MUTUAL_LIKE_USERS = 921;
            public static final int SHOW_MY_FOLLOW = 30965;
            public static final int SHOW_MY_LIKELIST = 30320;
            public static final int SHOW_MY_QRCODE_BUTTON = 30067;
            public static final int SHOW_MY_QR_CODE_BUTTON = 1621;
            public static final int SHOW_NEARBY = 30170;
            public static final int SHOW_NEGATIVE_FEEDBACKO_POPUP_WINDOW = 1179;
            public static final int SHOW_NEWS_CARD = 30694;
            public static final int SHOW_NEWS_HIDE_SETTINGS = 1038;
            public static final int SHOW_NEWS_REDPOINT = 30135;
            public static final int SHOW_NEWYEAR_CAMPAIGN = 30124;
            public static final int SHOW_NEW_DYNAMIC_HEAD = 1436;
            public static final int SHOW_NEW_PHOTO_INFORM_ME_TIPS = 1241;
            public static final int SHOW_NEW_USER_GUIDE_BUBBLE = 1106;
            public static final int SHOW_NEW_USER_TASK = 1322;
            public static final int SHOW_NEXT_VIDEO_BUTTON = 1830;
            public static final int SHOW_NICKNAME_AREA = 1752;
            public static final int SHOW_NIGHT_MODE = 1631;
            public static final int SHOW_NONRESIDENT_FULLSCREEN_BUTTON = 931;
            public static final int SHOW_NOTIFICATION = 30514;
            public static final int SHOW_NOTIFICATION_CLUSTER = 30567;
            public static final int SHOW_NOTIFICATION_ITEM = 30518;
            public static final int SHOW_NOTIFICATION_OPEN = 940;
            public static final int SHOW_NOTIFY_NO_LONGER = 30220;
            public static final int SHOW_NOTIFY_REOPEN = 30258;
            public static final int SHOW_NOT_OPEN_RED_PACKET_CLOSE_LIVE = 30378;
            public static final int SHOW_NO_CONTACT_FRIENDS_CARD = 30120;
            public static final int SHOW_NO_INTEREST_POPUP_WINDOW = 1178;
            public static final int SHOW_NO_OPEN_RED_PACKAGE = 1314;
            public static final int SHOW_ONLINE_USER_INFO_PANEL = 1305;
            public static final int SHOW_OPEN_CONTACT_BUTTON = 30017;
            public static final int SHOW_OPEN_FOLLOW_LIST_BUTTON = 30487;
            public static final int SHOW_OPEN_KWAILABS_KWAI_MUSIC_STATION_GUIDE = 30779;
            public static final int SHOW_OPEN_LIKE_LIST_BUTTON = 30325;
            public static final int SHOW_OPEN_RED_PACKAGE = 1312;
            public static final int SHOW_OPEN_SHOP_SUCCESS = 30824;
            public static final int SHOW_OPERATION_ENTRANCE = 449;
            public static final int SHOW_OTHER_GUIDE_DIALOG = 1468;
            public static final int SHOW_OVERLIMIT_UNKNOWN_IMPORT_DIALOG = 1483;
            public static final int SHOW_PACKET = 30125;
            public static final int SHOW_PASSWORD_SET_DIALOG = 1451;
            public static final int SHOW_PAY_DEPOSIT = 1301;
            public static final int SHOW_PHONE_BIND_GUIDE_DIALOG = 1215;
            public static final int SHOW_PHOTO = 804;
            public static final int SHOW_PHOTO_CAPTION_AUTOFILL_BUTTON = 1910;
            public static final int SHOW_PHOTO_EFFECT = 408;
            public static final int SHOW_PHOTO_IN_POPUP_WINDOW = 915;
            public static final int SHOW_PHOTO_OPERATE = 30656;
            public static final int SHOW_PHOTO_SHARE = 30658;
            public static final int SHOW_PK_BONUS_DETAIL = 30385;
            public static final int SHOW_PK_INTEREST_COMMON = 30210;
            public static final int SHOW_PK_INTEREST_SET = 30211;
            public static final int SHOW_POI_ELEMENT = 1595;
            public static final int SHOW_POI_HEAD_PIC = 30317;
            public static final int SHOW_PROFILE_AGE_TAG = 30096;
            public static final int SHOW_PROFILE_COMPLETION_PERCENT = 30583;
            public static final int SHOW_PROFILE_CONSTELLATION_TAG = 30098;
            public static final int SHOW_PROFILE_DEFAULT_TEXT = 30112;
            public static final int SHOW_PROFILE_FILL_CARD = 30104;
            public static final int SHOW_PROFILE_GENDER_TAG = 30108;
            public static final int SHOW_PROFILE_LOCATION_TAG = 30100;
            public static final int SHOW_PROFILE_VISIT_CNT = 30650;
            public static final int SHOW_PROMOTE_LIVE_BUBBLE = 1771;
            public static final int SHOW_PROMOTE_LIVE_ENTRANCE = 1769;
            public static final int SHOW_PROMOTE_LIVE_RECORD = 1773;
            public static final int SHOW_PROMOTE_PRODUCT = 30077;
            public static final int SHOW_PROMOTION_ENTRANCE = 1885;
            public static final int SHOW_PUBLISH_FANS_TOP = 30660;
            public static final int SHOW_PUSH_NOTIFICATION_GUIDE_DIALOG = 1084;
            public static final int SHOW_PUSH_NOTIFICATION_GUIDE_HEAD = 1083;
            public static final int SHOW_QQ_FRIEND_LIST = 956;
            public static final int SHOW_QUICK_LOGIN = 1448;
            public static final int SHOW_QUIT_ALERT = 1720;
            public static final int SHOW_QUIT_ALERT_BUTTON = 1721;
            public static final int SHOW_RANK_GAME = 1666;
            public static final int SHOW_RATING_POPUP_WINDOW = 1065;
            public static final int SHOW_READ_MOMENT = 30250;
            public static final int SHOW_RECALL_BUTTON = 30394;
            public static final int SHOW_RECALL_MESSAGE = 30073;
            public static final int SHOW_RECENTLY_VIEWED = 30254;
            public static final int SHOW_RECOMMAND_STICKER = 1795;
            public static final int SHOW_RECOMMEND_CARD = 1463;
            public static final int SHOW_RECOMMEND_INTEREST = 953;
            public static final int SHOW_RECOMMEND_INTEREST_USER_BUTTON = 984;
            public static final int SHOW_RECOMMEND_LIST_ENTRANCE = 1155;
            public static final int SHOW_RECOMMEND_POST = 30148;
            public static final int SHOW_RECOMMEND_TAG = 30400;
            public static final int SHOW_RECOMMEND_VIDEO = 1639;
            public static final int SHOW_RECOMMEND_VIDEO_ENTRY = 30664;
            public static final int SHOW_RECO_USER = 30255;
            public static final int SHOW_REDPOINT = 30233;
            public static final int SHOW_RED_PACKET_RAIN = 1847;
            public static final int SHOW_RED_PACKET_RAIN_COUNT_DOWN = 1846;
            public static final int SHOW_RED_PACKET_RAIN_END_DIALOG = 1849;
            public static final int SHOW_RED_PACKET_RAIN_HOMEPAGE_DIALOG = 1833;
            public static final int SHOW_RED_PACKET_RAIN_HOMEPAGE_ENTRY = 1837;
            public static final int SHOW_RED_PACKET_RAIN_LIVE_PAGE_DIALOG = 1840;
            public static final int SHOW_RED_PACKET_RAIN_PENDANT = 1844;
            public static final int SHOW_RED_PACK_ACTIVITY_BANNER = 964;
            public static final int SHOW_RELATED_TAG = 1460;
            public static final int SHOW_RELATE_CONTACT_BUTTON = 30022;
            public static final int SHOW_RELATIONSHIP_LINK = 30047;
            public static final int SHOW_RELATION_FRIEND_FOLLOW_NOTIFICATION = 30106;
            public static final int SHOW_REN_WO_KAN_PROMOTING = 30387;
            public static final int SHOW_RESIDENT_FULLSCREEN_BUTTON = 1888;
            public static final int SHOW_RESOLUTION_TOAST = 930;
            public static final int SHOW_REUPLOAD_STORY_BUTTON = 30489;
            public static final int SHOW_RE_LOGIN_DIALOG = 995;
            public static final int SHOW_RICH_TEXT_TAG = 1641;
            public static final int SHOW_RUSH_TO_BUY = 30318;
            public static final int SHOW_SAME_FOLLOW_TIPS = 30382;
            public static final int SHOW_SAVE_EDIT_DIALOG = 1580;
            public static final int SHOW_SAVE_PICTURE = 30159;
            public static final int SHOW_SCAN_QR_BUTTON = 1645;
            public static final int SHOW_SCORE_OUR_KWAI = 1635;
            public static final int SHOW_SEARCH_HISTORY = 30061;
            public static final int SHOW_SEEK_BAR = 325;
            public static final int SHOW_SELECTED_CLOUD_MUSIC = 1042;
            public static final int SHOW_SERIES = 30826;
            public static final int SHOW_SERIES_TAB = 1902;
            public static final int SHOW_SERVER_ENTRANCE = 1238;
            public static final int SHOW_SET_HEAD_PICTURE_GUIDE = 30595;
            public static final int SHOW_SHARE_BANNER = 1793;
            public static final int SHOW_SHARE_CARD = 1559;
            public static final int SHOW_SHARE_INTERACT_POPUP_WINDOW = 1133;
            public static final int SHOW_SHARE_QRCODE_BUTTON = 30068;
            public static final int SHOW_SHARE_QRCODE_DIALOG = 1789;
            public static final int SHOW_SHARE_SCREEN_SHOT = 1637;
            public static final int SHOW_SHARE_VIDEOS = 30161;
            public static final int SHOW_SHARE_WINDOW = 30054;
            public static final int SHOW_SHOP_ENTRANCE = 557;
            public static final int SHOW_SHOT_GUIDE_DIALOG = 1466;
            public static final int SHOW_SIDE_LIVE_PHOTO = 30967;
            public static final int SHOW_SIGNUP_AWARD_LABEL = 1617;
            public static final int SHOW_SIGNUP_AWARD_WINDOW = 1618;
            public static final int SHOW_SINGER_COLUMN = 901;
            public static final int SHOW_SINGER_PROJECT = 1556;
            public static final int SHOW_SINGLE_HEAD_PICTURE_DIALOG = 30710;
            public static final int SHOW_SINGLE_NOTIFICATION = 30156;
            public static final int SHOW_SKIP_BUTTON = 30010;
            public static final int SHOW_SLIDE_COMMENT = 30579;
            public static final int SHOW_STAR_FRIEND_DIALOG = 30328;
            public static final int SHOW_STAR_FRIEND_ICON = 30329;
            public static final int SHOW_STAR_FRIEND_TOAST = 30556;
            public static final int SHOW_STORIES = 30483;
            public static final int SHOW_STORIES_MINI = 30940;
            public static final int SHOW_STORY = 30607;
            public static final int SHOW_STORY_BANNER = 31033;
            public static final int SHOW_STORY_TAB = 30497;
            public static final int SHOW_STORY_VISITED = 30719;
            public static final int SHOW_STREAMER_ITEM = 30524;
            public static final int SHOW_STRONG_CONTACT_AUTHORIZATION_DIGLOG = 30185;
            public static final int SHOW_SUBSCRIBED_SERIES = 1900;
            public static final int SHOW_SUBSCRIPTION = 1722;
            public static final int SHOW_SWITCH_LANGUAGE_DIALOG = 1228;
            public static final int SHOW_TAG = 900;
            public static final int SHOW_TASK_BAR = 1827;
            public static final int SHOW_TASK_CENTER = 1623;
            public static final int SHOW_THANOS_SETTING_DIALOG = 30269;
            public static final int SHOW_THEME = 1021;
            public static final int SHOW_THIRD_PARTY_AUTHORIZATION_DIALOG = 1153;
            public static final int SHOW_TIME_EFFECT = 409;
            public static final int SHOW_TITLE_NOTICE_HINT = 1761;
            public static final int SHOW_TOP_POST_DETAIL = 1776;
            public static final int SHOW_TOTAL_LIKE_CNT = 30648;
            public static final int SHOW_TOWNSMAN_ENTRANCE = 1204;
            public static final int SHOW_TRAFFIC_REMIND_POPUP = 30137;
            public static final int SHOW_TRUE_WITHOUT_MAKEUP = 1428;
            public static final int SHOW_TUBE_ENTRANCE = 1898;
            public static final int SHOW_UNFOLLOW_CONFIRMATION_DIALOG = 30271;
            public static final int SHOW_UNFOLLOW_CONFIRMATION_POPUP = 30114;
            public static final int SHOW_UNFOLLOW_RECOMMENDATION_TIPS = 30403;
            public static final int SHOW_UNKNOWN_IMPORT_DIALOG = 1482;
            public static final int SHOW_UPGRADE_POPUP_WINDOW = 1125;
            public static final int SHOW_UPGRADE_WINDOW = 1629;
            public static final int SHOW_UPLOAD_FAIL_DIALOG = 1067;
            public static final int SHOW_USER = 899;
            public static final int SHOW_USER_INFO_PANEL_HEAD = 1304;
            public static final int SHOW_USER_ITEM = 30559;
            public static final int SHOW_USER_LIVE_TIPS_BAR = 30762;
            public static final int SHOW_USER_TRAINING = 1574;
            public static final int SHOW_VIDEO_DEFINITION_BUTTON = 30080;
            public static final int SHOW_VIDEO_DEFINITION_DIALOG = 30082;
            public static final int SHOW_VIDEO_LOADING_DIALOG = 1484;
            public static final int SHOW_VIDEO_REC = 1150;
            public static final int SHOW_VIEW_PROFILE_ENTRANCE = 1884;
            public static final int SHOW_VISITOR_TAB = 30492;
            public static final int SHOW_VOICE_COMMENT_BUTTON = 1359;
            public static final int SHOW_VOICE_COMMENT_MICROPHONE = 1362;
            public static final int SHOW_VOTE_FOR_TA = 30266;
            public static final int SHOW_VOTE_RESULT = 30903;
            public static final int SHOW_WELCOME_RATING_DIALOG = 1699;
            public static final int SHOW_WISH_LIST_LAYER = 1476;
            public static final int SHOW_WISH_LIST_LAYER_GIFT = 1480;
            public static final int SHOW_WISH_LIST_LAYER_RANK_LIST = 1478;
            public static final int SHOW_WISH_LIST_PENDANT = 1474;
            public static final int SHOW_WISH_LIST_SET_ENTRANCE = 1470;
            public static final int SHOW_WKAWARD_GUIDE_WINDOW = 30002;
            public static final int SHOW_WKAWARD_WINDOW = 30005;
            public static final int SHOW_WRITE_MOMENT = 30248;
            public static final int SHOW_YOU_FAILED = 529;
            public static final int SIDE_BAR_FOLLOWING_DURATION = 30992;
            public static final int SLIDE_GAMEZONE_GAME_RESOURCE = 40013;
            public static final int SLIP_LIVE_BROADCAST = 1558;
            public static final int SPRFES_MAIN_SHARE = 30434;
            public static final int START_CHILD_LOCK_MODEL = 30617;
            public static final int START_DETECTION = 1117;
            public static final int START_GUESS = 562;
            public static final int START_LIVE = 1533;
            public static final int START_PARING = 1107;
            public static final int START_TO_USE = 1110;
            public static final int START_WISH = 570;
            public static final int STAR_FRIEND_SETTING = 30327;
            public static final int STATUS_DETAIL_DELETE = 30459;
            public static final int STOP_GAME_VIDEO = 30424;
            public static final int STOP_GUESS = 563;
            public static final int STOP_WISH = 571;
            public static final int STORAGE_PERMISSION_AUTHIEIZEATION_EXPO = 30995;
            public static final int STORAGE_PERMISSION_AUTHORIZATION_CLICK = 30996;
            public static final int STOREUP_TOWN_DETAIL = 1584;
            public static final int STORE_DEVICE_ID = 1415;
            public static final int STORY_EDIT_PREVIEW_CLIP_VIDEO = 486;
            public static final int STORY_EDIT_PREVIEW_SHOW = 487;
            public static final int STORY_PUBLISH_ENTRANCE = 30609;
            public static final int SUBMIT_COURSE_EVALUATION = 1217;
            public static final int SUBSCRIBED_MORE_CLICK = 30843;
            public static final int SUBSCRIBE_SERIES = 1904;
            public static final int SUBTITLE_AUTO_RECOGNITION = 1912;
            public static final int SUCCESS_ACCOUNT_EXCEPTION_LOGIN = 30444;
            public static final int SWITCHOVER_VIDEO_LIVE = 30282;
            public static final int SWITCH_ACCOUNT = 30799;
            public static final int SWITCH_ACCOUNT_BUTTON = 30803;
            public static final int SWITCH_ACCOUNT_SUCCESS = 30806;
            public static final int SWITCH_CAMERA = 432;
            public static final int SWITCH_DEVICE = 1115;
            public static final int SWITCH_FEED = 813;
            public static final int SWITCH_LANGUAGE = 1229;
            public static final int SWITCH_LIGHT = 1747;
            public static final int SWITCH_MUSIC_PLAYING_MODE = 1881;
            public static final int SWITCH_NEXT_VIDEO = 30065;
            public static final int SWITCH_PHOTO = 317;
            public static final int SWITCH_RESOLUTION = 934;
            public static final int SWITCH_STORY = 30490;
            public static final int SWITCH_TAB = 803;
            public static final int SWITCH_TAB_LOG_IN = 30773;
            public static final int SWITCH_TAB_MODE = 1024;
            public static final int SWITCH_TO_MOMENT_SQUARE = 30402;
            public static final int SYNC_NTP_TIME = 894;
            public static final int SYSTEM_LOCATION = 1544;
            public static final int TAB_CLICK = 30933;
            public static final int TAB_SHOW = 30997;
            public static final int TAG_OPERATION_ENTRANCE_CLICK = 30828;
            public static final int TAG_OPERATION_ENTRANCE_EXPO = 30827;
            public static final int TAKE_PICTURE = 1017;
            public static final int TASK_FINISHED_DIALOG_NEW_USER_RETENTION_TASK = 30833;
            public static final int TEXT_DISPLAY = 30865;
            public static final int THANK_FRIENDS = 967;
            public static final int THINK_LATER_BTN = 30800;
            public static final int TIME_CHOSE_CONFIRM = 30375;
            public static final int TOGGLE_HOME_AB_TEST = 875;
            public static final int TOGGLE_SLIDING_BROWSING = 874;
            public static final int TOGGLE_WATERMARK_SWITCH = 876;
            public static final int TOP_RECOMMEND_FOLLOW_CLICK = 30952;
            public static final int TRANSCODE_AND_PUBLISH_VIDEO = 1393;
            public static final int TURN_OFF_MIC = 30191;
            public static final int UNKNOWN2 = 0;
            public static final int UNLIKE_MOMENT = 1741;
            public static final int UNLOCK_CHILD_LOCK = 1075;
            public static final int UNSELECT_ALL = 1127;
            public static final int UNZIP_HYBRID_PACKAGE = 1013;
            public static final int UPGRADE_HYBRID = 1015;
            public static final int UPGRADE_VERSION = 1114;
            public static final int UPLOAD_ATLAS = 607;
            public static final int UPLOAD_ATLAS_ELEMENT = 609;
            public static final int UPLOAD_AVATAR = 914;
            public static final int UPLOAD_COVER = 605;
            public static final int UPLOAD_CUSTOM_STICKER = 30454;
            public static final int UPLOAD_FAIL = 30548;
            public static final int UPLOAD_KARAOKE_AUDIO = 612;
            public static final int UPLOAD_KARAOKE_PHOTOS = 617;
            public static final int UPLOAD_KARAOKE_VIDEO = 611;
            public static final int UPLOAD_MAKE_FILE = 604;
            public static final int UPLOAD_MUSIC = 606;
            public static final int UPLOAD_PAID_VIDEO = 619;
            public static final int UPLOAD_PHOTO = 1746;
            public static final int UPLOAD_PIPELINE_PAYLOAD = 615;
            public static final int USER_ACCOUNT_EXPO = 30804;
            public static final int USER_BIND_PHONE = 100;
            public static final int USER_FOLLOW = 31;
            public static final int USER_LABEL = 30873;
            public static final int USER_LOCATION_APPLICATION_CLICK = 30851;
            public static final int USER_LOCATION_APPLICATION_EXPO = 30850;
            public static final int USER_LOGIN = 6;
            public static final int USER_LOGOUT = 7;
            public static final int USER_MIGRATION_CAMERA_DIALOG = 1029;
            public static final int USER_MIGRATION_NEARBY_DIALOG = 1031;
            public static final int USER_MIGRATION_RECORD_DIALOG = 1030;
            public static final int USER_MIGRATION_STARTUP_DIALOG = 1028;
            public static final int USER_SET_KWAI_ID = 101;
            public static final int USER_SIGN_UP = 5;
            public static final int USER_UN_FOLLOW = 32;
            public static final int USE_HISTORY_COVER = 1347;
            public static final int USE_KARAOKE_AS_MUSIC = 413;
            public static final int USE_MAGIC_FACE = 420;
            public static final int USE_SMS_AUTHENTICATION_CODE_LOGIN = 867;
            public static final int USE_SOUND_TRACK_AS_MUSIC = 427;
            public static final int USE_TITLE_IN_LIVE = 1349;
            public static final int USE_VOUCHER = 991;
            public static final int VEDIO_RELOAD = 31013;
            public static final int VERIFIED_SIGN = 30993;
            public static final int VERIFY_HYBRID_PACKAGE_MD5 = 1018;
            public static final int VERIFY_ID_CARD = 30707;
            public static final int VERTICAL_CHANNEL_TAB = 30574;
            public static final int VIDEO_CLIP_THUMB = 482;
            public static final int VIDEO_COVER_SELECTION = 480;
            public static final int VIDEO_COVER_SELECTION_UPLOAD = 481;
            public static final int VIDEO_DOWNLOAD = 2;
            public static final int VIDEO_PLAY = 4;
            public static final int VIDEO_PREVIEW_FINISH = 428;
            public static final int VIDEO_REC = 3;
            public static final int VIDEO_UPLOAD = 1;
            public static final int VIEW_ALL_GROUP_MEMBERS = 1192;
            public static final int VIEW_ANNOUNCEMENT = 1495;
            public static final int VIEW_AWARD_LIST = 523;
            public static final int VIEW_BLACK_LIST = 1006;
            public static final int VIEW_BONUS_BTN_NEW_USER_RETENTION = 30856;
            public static final int VIEW_CONTACT_LIST = 955;
            public static final int VIEW_EXCHANGE_AWARD = 532;
            public static final int VIEW_GAMEZONE_RESOURCE_DONE = 40030;
            public static final int VIEW_GIFT = 861;
            public static final int VIEW_GUESS_AWARD_LIST = 568;
            public static final int VIEW_KARAOKE_DETAIL = 1096;
            public static final int VIEW_LIVE_GUESS_RECORD = 569;
            public static final int VIEW_LIVE_QUIZ_RECORD = 533;
            public static final int VIEW_LOGIN_PROBLEMS = 1050;
            public static final int VIEW_MUSIC = 969;
            public static final int VIEW_NEWS_HIDE_SETTINGS = 1039;
            public static final int VIEW_NOTIFICATION_PUSH = 963;
            public static final int VIEW_OTHERS_HOW_TO_TAKE = 425;
            public static final int VIEW_QQ_FRIEND_LIST = 954;
            public static final int VIEW_SAVED_PRODUCTION = 1230;
            public static final int VIEW_SHARED_PHOTO_FROM_KWAI_TOKEN = 1136;
            public static final int VIEW_USER_WHO_SHARE_KWAI_TOKEN = 1137;
            public static final int VIEW_USE_TUTORIAL = 1109;
            public static final int VIEW_VOUCHER = 992;
            public static final int VOICEPARTY_CLICK_APPLY_AGREE = 30542;
            public static final int VOICEPARTY_CLICK_CANCEL_ROOMINTRODUCE = 30536;
            public static final int VOICEPARTY_CLICK_INPUTBAR = 30532;
            public static final int VOICEPARTY_CLICK_MIC_APPLY = 30539;
            public static final int VOICEPARTY_CLICK_ROOMINTRODUCE_INPUTBAR = 30534;
            public static final int VOICEPARTY_CLICK_SAVE_ROOMINTRODUCE = 30535;
            public static final int VOICEPARTY_CLICK_SELECT_BACKGROUND = 30538;
            public static final int VOICEPARTY_CLICK_SWITCH_BACKGROUND = 30537;
            public static final int VOICEPARTY_CLICK_TOPIC = 30531;
            public static final int VOICEPARTY_CLICK_TOPICBAR = 30530;
            public static final int VOICEPARTY_INVITE = 30414;
            public static final int VOICEPARTY_INVITE_CANCEL = 30446;
            public static final int VOICEPARTY_INVITE_MIC = 30415;
            public static final int VOICEPARTY_KTV_BEGIN = 30637;
            public static final int VOICEPARTY_KTV_CHOOSE_PANEL_SHOW = 30627;
            public static final int VOICEPARTY_KTV_CHOOSE_SONG_PANEL_TAB = 30628;
            public static final int VOICEPARTY_KTV_CHOOSE_SOOG_CLICK = 30625;
            public static final int VOICEPARTY_KTV_CHOOSE_SOOG_PANEL_SELECT = 30630;
            public static final int VOICEPARTY_KTV_CLOSE = 30626;
            public static final int VOICEPARTY_KTV_EDIT_SOOG_CONFIRM = 30636;
            public static final int VOICEPARTY_KTV_GIFT_SELECT = 30647;
            public static final int VOICEPARTY_KTV_GIFT_SELECT_PEOPLE = 30646;
            public static final int VOICEPARTY_KTV_HOT_TOPIC = 30629;
            public static final int VOICEPARTY_KTV_NATIVE_SING_CLICK = 30640;
            public static final int VOICEPARTY_KTV_OPEN_CLICK = 30623;
            public static final int VOICEPARTY_KTV_OPEN_SHOW = 30622;
            public static final int VOICEPARTY_KTV_PANEL_SHOW = 30624;
            public static final int VOICEPARTY_KTV_PAUSE = 30638;
            public static final int VOICEPARTY_KTV_SING_LIST_SHOW = 30645;
            public static final int VOICEPARTY_KTV_SING_SET_BGM_VOICE = 30644;
            public static final int VOICEPARTY_KTV_SING_SET_CLICK = 30639;
            public static final int VOICEPARTY_KTV_SING_SET_CUT = 30642;
            public static final int VOICEPARTY_KTV_SING_SET_HUMAN_VOICE = 30643;
            public static final int VOICEPARTY_KTV_SONG_LIST_DELECT = 30632;
            public static final int VOICEPARTY_KTV_SONG_LIST_DELECT_CONFIRM = 30634;
            public static final int VOICEPARTY_KTV_SONG_LIST_EDIT = 30631;
            public static final int VOICEPARTY_KTV_SONG_LIST_TOP = 30633;
            public static final int VOICEPARTY_MIC_INVITE_CHECK = 30418;
            public static final int VOICEPARTY_SET_GUEST_MIC = 30416;
            public static final int VOICEPARTY_SHOW_ROOMINTRODUCE = 30533;
            public static final int VOICEPARTY_SHOW_TOPICBAR = 30529;
            public static final int VOICEPARTY_TRAN_CHAT_ALERT = 30440;
            public static final int VOICEPARTY_TRAN_CHAT_ALERT_BUTTON = 30441;
            public static final int VOICEPARTY_TRAN_CHECK_CANCEL = 30445;
            public static final int VOICEPARTY_USER_MIC_ALERT = 30417;
            public static final int VOICE_PARTY = 30189;
            public static final int VOICE_PARTY_ANCHOR_ARYA_SEND = 30975;
            public static final int VOICE_PARTY_ANTO_CUT = 30864;
            public static final int VOICE_PARTY_BGM_DONE = 30718;
            public static final int VOICE_PARTY_CARD = 31064;
            public static final int VOICE_PARTY_CLOSE_CONFIRM_ALERT = 30811;
            public static final int VOICE_PARTY_CLOSE_CONFIRM_ALERT_CANCEL = 30815;
            public static final int VOICE_PARTY_CLOSE_CONFIRM_ALERT_TRAN = 30814;
            public static final int VOICE_PARTY_HOME_SHOW = 30190;
            public static final int VOICE_PARTY_KTV_APPLAUD = 30963;
            public static final int VOICE_PARTY_KTV_PANEL_CUT_1 = 30855;
            public static final int VOICE_PARTY_LEAVE_C = 30717;
            public static final int VOICE_PARTY_SEATS = 30193;
            public static final int VOICE_PARTY_SINGER_ARYA_RECEIVE = 30976;
            public static final int VOICE_PARTY_TEAN_VIDEO_LIVE_YES_AFFIRM = 30935;
            public static final int VOICE_PARTY_TEAN_VIDEO_LIVE_YES_CANCEL = 30936;
            public static final int VOTE_DYNAMIC = 1406;
            public static final int WATCH_NOW_NER_USER_RETENTION = 30829;
            public static final int WHOLE_UPLOAD = 613;
            public static final int WISH_LIST_PEDDANT_SHOW_ID = 30700;
            public static final int WITHDRAW_CASH = 979;
            public static final int WRITE_DYNAMIC = 1403;
        }

        @Retention(RetentionPolicy.SOURCE)
        /* compiled from: kSourceFile */
        public @interface Status {
            public static final int CANCEL = 9;
            public static final int FAIL = 8;
            public static final int FINISH = 10;
            public static final int PAUSE = 3;
            public static final int PENDING = 5;
            public static final int PROCESSING = 6;
            public static final int RESUME = 4;
            public static final int RETRY = 2;
            public static final int START = 1;
            public static final int SUCCESS = 7;
            public static final int UNKNOWN1 = 0;
        }

        @Retention(RetentionPolicy.SOURCE)
        /* compiled from: kSourceFile */
        public @interface Trigger {
            public static final int ADD_WATERMARK = 19;
            public static final int ADVANCED_EDIT = 21;
            public static final int APPLY_FOR_UNBAN = 13;
            public static final int CONFIG_CHANGED = 16;
            public static final int CONTACTS = 24;
            public static final int EDIT_EFFECT = 25;
            public static final int ENTER_H5_PAGE = 300;
            public static final int FILTER_PHOTO = 18;
            public static final int INVISIBLE_TO_CONTACT_FRIENDS = 201;
            public static final int JOIN_VIDEO = 20;
            public static final int LIVE_STREAM_AUTHENTICATE = 5;
            public static final int LIVE_STREAM_DEPOSIT = 4;
            public static final int LIVE_STREAM_EMPTY_SIZE_TIMEOUT = 2;
            public static final int LIVE_STREAM_FOLLOW_RED_PACK = 305;
            public static final int LIVE_STREAM_FREQUENT_STALLED = 7;
            public static final int LIVE_STREAM_GIFT_WHEEL = 306;
            public static final int LIVE_STREAM_RESTART_PLAY = 6;
            public static final int LIVE_STREAM_SEND_GIFT = 3;
            public static final int LIVE_STREAM_SHARE_RED_PACK = 303;
            public static final int LIVE_STREAM_STOPPED = 8;
            public static final int LIVE_STREAM_TOKEN_RED_PACK = 304;
            public static final int LIVE_STREAM_WATCH = 1;
            public static final int LIVE_STREAM_WHEEL_DECIDE = 302;
            public static final int LIVE_TAKE_COVER = 9;
            public static final int LOAD_MORE = 100;
            public static final int LOGIN = 11;
            public static final int MESSAGE = 202;
            public static final int MY_WALLET = 10;
            public static final int NETWORK_CHANGED = 15;
            public static final int PAYONNER = 204;
            public static final int PAYPAL = 203;
            public static final int PRE_MAKE_VIDEO = 22;
            public static final int PUBLISH_PHOTO1 = 23;
            public static final int RECORD_CAMERA = 17;
            public static final int RECORD_PICTURE = 27;
            public static final int RELOAD = 101;
            public static final int SEARCH = 200;
            public static final int SERVER_NOTIFICATION = 14;
            public static final int SETTING = 12;
            public static final int SIGN_UP = 26;
            public static final int SOURCE_LOADING_COMPLETED = 301;
            public static final int UNKNOWN3 = 0;
        }


        public TaskEvent() {
            clear();
        }

        public static TaskEvent[] emptyArray() {
            if (_emptyArray == null) {
                synchronized (InternalNano.LAZY_INIT_LOCK) {
                    if (_emptyArray == null) {
                        _emptyArray = new TaskEvent[0];
                    }
                }
            }
            return _emptyArray;
        }

        public TaskEvent clear() {
            this.sessionId = "";
            this.action = 0;
            this.action2 = "";
            this.status = 0;
            this.urlPackage = null;
            this.elementPackage = null;
            this.trigger = 0;
            this.resultPackage = null;
            this.referUrlPackage = null;
            this.referElementPackage = null;
            this.ratio = 0.0f;
            this.contentWrapper = "";
            this.areaPackage = null;
            this.internalStidContainerJson = "";
            return this;
        }


    }

    /* compiled from: kSourceFile */
    public static final class AreaPackage {
        public static volatile AreaPackage[] _emptyArray;
        public String name;
        public String params;

        public AreaPackage() {
            clear();
        }

        public static AreaPackage[] emptyArray() {
            if (_emptyArray == null) {
                synchronized (InternalNano.LAZY_INIT_LOCK) {
                    if (_emptyArray == null) {
                        _emptyArray = new AreaPackage[0];
                    }
                }
            }
            return _emptyArray;
        }

        public AreaPackage clear() {
            this.name = "";
            this.params = "";
            return this;
        }
    }

    /* compiled from: kSourceFile */
    public static final class ClickEvent {
        public static volatile ClickEvent[] _emptyArray;
        public AreaPackage areaPackage;
        public String contentWrapper;
        public int direction;
        public ElementPackage elementPackage;
        public String extraMessage;
        public String internalStidContainerJson;
        public ElementPackage referElementPackage;
        public UrlPackage referUrlPackage;
        public int type;
        public UrlPackage urlPackage;

        @Retention(RetentionPolicy.SOURCE)
        /* compiled from: kSourceFile */
        public @interface Direction {
            public static final int DOWN = 2;
            public static final int LEFT = 3;
            public static final int RIGHT = 4;
            public static final int UNKNOWN2 = 0;
            public static final int UP = 1;
        }

        @Retention(RetentionPolicy.SOURCE)
        /* compiled from: kSourceFile */
        public @interface Type {
            public static final int AUTO = 11;
            public static final int CLICK = 1;
            public static final int DOUBLE_CLICK = 2;
            public static final int DRAG = 6;
            public static final int LONG_PRESS = 4;
            public static final int PULL = 5;
            public static final int PULL_DOWN = 8;
            public static final int PULL_UP = 9;
            public static final int RIGHT_CLICK = 10;
            public static final int SCALE = 7;
            public static final int TRIPLE_CLICK = 3;
            public static final int UNKNOWN1 = 0;
        }

        public ClickEvent() {
            clear();
        }

        public static ClickEvent[] emptyArray() {
            if (_emptyArray == null) {
                synchronized (InternalNano.LAZY_INIT_LOCK) {
                    if (_emptyArray == null) {
                        _emptyArray = new ClickEvent[0];
                    }
                }
            }
            return _emptyArray;
        }

        public ClickEvent clear() {
            this.type = 0;
            this.direction = 0;
            this.urlPackage = null;
            this.referUrlPackage = null;
            this.elementPackage = null;
            this.referElementPackage = null;
            this.extraMessage = "";
            this.contentWrapper = "";
            this.areaPackage = null;
            this.internalStidContainerJson = "";
            return this;
        }

    }

    /* compiled from: kSourceFile */
    public static final class CustomEvent {
        public static volatile CustomEvent[] _emptyArray;
        public int biz;
        public String key;
        public String page;
        public String value;

        @Retention(RetentionPolicy.SOURCE)
        /* compiled from: kSourceFile */
        public @interface CustomEventBiz {
            public static final int AD = 6;
            public static final int ARCH_BASE = 21;
            public static final int ARCH_DATA = 1;
            public static final int ARCH_DYN = 20;
            public static final int CONSUME = 14;
            public static final int CORONA = 28;
            public static final int DESIGN = 23;
            public static final int EDGE_RECO = 22;
            public static final int ESHOP = 7;
            public static final int FANS_GROUP = 11;
            public static final int FEED_ARCH = 5;
            public static final int GAME_APP = 8;
            public static final int LIVE = 3;
            public static final int LONG_VIDEO = 16;
            public static final int MINI_PROGRAM = 25;
            public static final int MUSIC = 12;
            public static final int NEARBY = 15;
            public static final int OTHER = 0;
            public static final int PERFORMANCE = 19;
            public static final int PLC = 27;
            public static final int POI = 17;
            public static final int PRODUCE = 2;
            public static final int RADAR = 30;
            public static final int SEARCH = 4;
            public static final int SECURITY = 24;
            public static final int SERVICE = 10;
            public static final int SOCIAL = 13;
            public static final int USER_GROWTH = 9;
            public static final int VIDEOZT = 18;
            public static final int YODA = 29;
            public static final int YTECH = 26;
        }

        public CustomEvent() {
            clear();
        }

        public CustomEvent clear() {
            this.key = "";
            this.value = "";
            this.biz = 0;
            this.page = "";
            return this;
        }

        public static CustomEvent[] emptyArray() {
            if (_emptyArray == null) {
                synchronized (InternalNano.LAZY_INIT_LOCK) {
                    if (_emptyArray == null) {
                        _emptyArray = new CustomEvent[0];
                    }
                }
            }
            return _emptyArray;
        }

    }

    /* compiled from: kSourceFile */
    public static final class EventPackage {
        public static volatile EventPackage[] _emptyArray;
        public ClickEvent clickEvent;
        public CustomEvent customEvent;
        public ExceptionEvent exceptionEvent;
        public FirstLaunchEvent firstLaunchEvent;
        public FixAppEvent fixAppEvent;
        public LaunchEvent launchEvent;
        public LoginEvent loginEvent;
        public ODOTEvent odotEvent;
        public SearchEvent searchEvent;
        public ShareEvent shareEvent;
        public ShowEvent showEvent;
        public TaskEvent taskEvent;

        public EventPackage() {
            clear();
        }

        public static EventPackage[] emptyArray() {
            if (_emptyArray == null) {
                synchronized (InternalNano.LAZY_INIT_LOCK) {
                    if (_emptyArray == null) {
                        _emptyArray = new EventPackage[0];
                    }
                }
            }
            return _emptyArray;
        }

        public EventPackage clear() {
            this.launchEvent = null;
            this.showEvent = null;
            this.clickEvent = null;
            this.taskEvent = null;
            this.exceptionEvent = null;
            this.searchEvent = null;
            this.loginEvent = null;
            this.shareEvent = null;
            this.fixAppEvent = null;
            this.customEvent = null;
            this.odotEvent = null;
            this.firstLaunchEvent = null;
            return this;
        }

    }

    /* compiled from: kSourceFile */
    public static final class ExceptionEvent {
        public static volatile ExceptionEvent[] _emptyArray;
        public String androidPatchBaseVersion;
        public String androidPatchVersion;
        public ElementPackage elementpackage;
        public String extraMessage;
        public String flag;
        public String iosPatchBaseVersion;
        public String iosPatchVersion;
        public String message;
        public String page;
        public int type;
        public UrlPackage urlPackage;

        @Retention(RetentionPolicy.SOURCE)
        /* compiled from: kSourceFile */
        public @interface Type {
            public static final int ABNORMAL_EXIT = 8;
            public static final int ANR = 3;
            public static final int CRASH = 1;
            public static final int DEAD_LOOP = 14;
            public static final int ENERGY_IMPACT = 17;
            public static final int EXCEPTION = 2;
            public static final int FD_STACKS = 11;
            public static final int FLUTTER_EXCEPTION = 6;
            public static final int LONG_BLOCK = 13;
            public static final int MEMORY_MONITOR = 10;
            public static final int METRICS_DIAGNOSTIC_PAYLOAD = 16;
            public static final int NATIVE_CRASH = 4;
            public static final int NATIVE_LEAK = 9;
            public static final int OOM = 5;
            public static final int OOM_STACKS = 7;
            public static final int RETAIN_CYCLES = 18;
            public static final int SYSTEM_EXIT_STAT = 15;
            public static final int THREAD_STACKS = 12;
            public static final int UNKNOWN1 = 0;
        }

        public ExceptionEvent() {
            clear();
        }

        public static ExceptionEvent[] emptyArray() {
            if (_emptyArray == null) {
                synchronized (InternalNano.LAZY_INIT_LOCK) {
                    if (_emptyArray == null) {
                        _emptyArray = new ExceptionEvent[0];
                    }
                }
            }
            return _emptyArray;
        }

        public ExceptionEvent clear() {
            this.type = 0;
            this.message = "";
            this.urlPackage = null;
            this.flag = "";
            this.elementpackage = null;
            this.androidPatchBaseVersion = "";
            this.androidPatchVersion = "";
            this.extraMessage = "";
            this.iosPatchBaseVersion = "";
            this.iosPatchVersion = "";
            this.page = "";
            return this;
        }

    }

    /* compiled from: kSourceFile */
    public static final class ExpTagTrans {
        public static volatile ExpTagTrans[] _emptyArray;
        public String clientExpTag;
        public String serverExpTag;

        public ExpTagTrans() {
            clear();
        }

        public static ExpTagTrans[] emptyArray() {
            if (_emptyArray == null) {
                synchronized (InternalNano.LAZY_INIT_LOCK) {
                    if (_emptyArray == null) {
                        _emptyArray = new ExpTagTrans[0];
                    }
                }
            }
            return _emptyArray;
        }

        public ExpTagTrans clear() {
            this.serverExpTag = "";
            this.clientExpTag = "";
            return this;
        }

    }

    /* compiled from: kSourceFile */
    public static final class ExpTagTransList {
        public static volatile ExpTagTransList[] _emptyArray;
        public ExpTagTrans[] expTagTrans;

        public ExpTagTransList() {
            clear();
        }

        public static ExpTagTransList[] emptyArray() {
            if (_emptyArray == null) {
                synchronized (InternalNano.LAZY_INIT_LOCK) {
                    if (_emptyArray == null) {
                        _emptyArray = new ExpTagTransList[0];
                    }
                }
            }
            return _emptyArray;
        }

        public ExpTagTransList clear() {
            this.expTagTrans = ExpTagTrans.emptyArray();
            return this;
        }

    }

    /* compiled from: kSourceFile */
    public static final class FirstLaunchEvent {
        public static volatile FirstLaunchEvent[] _emptyArray;
        public int mode;
        public int reason;
        public ShareLaunchPackage shareLaunchPackage;

        @Retention(RetentionPolicy.SOURCE)
        /* compiled from: kSourceFile */
        public @interface Mode {
            public static final int COLD = 1;
            public static final int HOT = 2;
            public static final int RESUME = 3;
            public static final int UNKNOWN = 0;
        }

        @Retention(RetentionPolicy.SOURCE)
        /* compiled from: kSourceFile */
        public @interface Reason {
            public static final int LAUNCHER = 1;
            public static final int PUSH = 3;
            public static final int SHARE = 2;
            public static final int UNKNOWN1 = 0;
        }

        public FirstLaunchEvent() {
            clear();
        }

        public FirstLaunchEvent clear() {
            this.mode = 0;
            this.reason = 0;
            this.shareLaunchPackage = null;
            return this;
        }

        public static FirstLaunchEvent[] emptyArray() {
            if (_emptyArray == null) {
                synchronized (InternalNano.LAZY_INIT_LOCK) {
                    if (_emptyArray == null) {
                        _emptyArray = new FirstLaunchEvent[0];
                    }
                }
            }
            return _emptyArray;
        }

    }

    /* compiled from: kSourceFile */
    public static final class FixAppEvent {
        public static volatile FixAppEvent[] _emptyArray;
        public int action;
        public String extraMessage;
        public int status;

        @Retention(RetentionPolicy.SOURCE)
        /* compiled from: kSourceFile */
        public @interface Action {
            public static final int CLEAR_SANDBOX_BEFORE_LAUNCH = 2;
            public static final int DELETE_SPECIFIED_FILES_BEFORE_LAUNCH = 1;
            public static final int UNKNOWN1 = 0;
        }

        @Retention(RetentionPolicy.SOURCE)
        /* compiled from: kSourceFile */
        public @interface Status {
            public static final int CANCEL = 3;
            public static final int FINISH = 4;
            public static final int START = 2;
            public static final int UNKNOWN2 = 0;
            public static final int WILL_START = 1;
        }

        public FixAppEvent() {
            clear();
        }

        public FixAppEvent clear() {
            this.action = 0;
            this.status = 0;
            this.extraMessage = "";
            return this;
        }

        public static FixAppEvent[] emptyArray() {
            if (_emptyArray == null) {
                synchronized (InternalNano.LAZY_INIT_LOCK) {
                    if (_emptyArray == null) {
                        _emptyArray = new FixAppEvent[0];
                    }
                }
            }
            return _emptyArray;
        }

    }

    /* compiled from: kSourceFile */
    public static final class LaunchEvent {
        public static volatile LaunchEvent[] _emptyArray;
        public long allVisibleCost;
        public boolean cold;
        public long coldLaunchCount;
        public String detail;
        public long elementCount;
        public String extraStatInfo;
        public long fetchDataCost;
        public long frameworkCost;
        public long launchHomeActivityCost;
        public int mode;
        public boolean newLaunch;
        public String oaid;
        public long preMainCost;
        public String pushId;
        public int source;
        public long startFetchCost;
        public String target;
        public long timeCost;
        public boolean useCache;

        @Retention(RetentionPolicy.SOURCE)
        /* compiled from: kSourceFile */
        public @interface Mode {
            public static final int COLD = 1;
            public static final int HOT = 2;
            public static final int RESUME = 3;
            public static final int UNKNOWN2 = 0;
        }

        @Retention(RetentionPolicy.SOURCE)
        /* compiled from: kSourceFile */
        public @interface Source {
            public static final int APP = 5;
            public static final int LAUNCHER = 1;
            public static final int MESSAGE_LINK = 8;
            public static final int NOTIFICATION_BAR = 2;
            public static final int PUSH = 6;
            public static final int RESTORE = 7;
            public static final int UNKNOWN1 = 0;
            public static final int URI = 4;
            public static final int WEB_VIEW = 3;
        }

        public LaunchEvent() {
            clear();
        }

        public static LaunchEvent[] emptyArray() {
            if (_emptyArray == null) {
                synchronized (InternalNano.LAZY_INIT_LOCK) {
                    if (_emptyArray == null) {
                        _emptyArray = new LaunchEvent[0];
                    }
                }
            }
            return _emptyArray;
        }

        public LaunchEvent clear() {
            this.source = 0;
            this.cold = false;
            this.timeCost = 0;
            this.detail = "";
            this.target = "";
            this.frameworkCost = 0;
            this.fetchDataCost = 0;
            this.allVisibleCost = 0;
            this.elementCount = 0;
            this.useCache = false;
            this.mode = 0;
            this.launchHomeActivityCost = 0;
            this.coldLaunchCount = 0;
            this.pushId = "";
            this.startFetchCost = 0;
            this.newLaunch = false;
            this.preMainCost = 0;
            this.extraStatInfo = "";
            this.oaid = "";
            return this;
        }

    }

    /* compiled from: kSourceFile */
    public static final class LoginEvent {
        public static volatile LoginEvent[] _emptyArray;
        public int actionType;
        public String extraMessage;
        public String id;
        public int platform;
        public int source;
        public int status;
        public int stayTime;
        public int step;
        public boolean stepBack;

        @Retention(RetentionPolicy.SOURCE)
        /* compiled from: kSourceFile */
        public @interface ActionType {
            public static final int LOGIN = 1;
            public static final int SIGNUP = 2;
            public static final int UNKNOWN1 = 0;
        }

        @Retention(RetentionPolicy.SOURCE)
        /* compiled from: kSourceFile */
        public @interface Source {
            public static final int ACTIVITE_REWARD_BUTTON_LOGIN = 87;
            public static final int AUTO_TRIGGER_GOOGLE_LOGIN = 48;
            public static final int CAMERA_SELECT_MUSIC = 37;
            public static final int CONTRACTS_FOLLOWALL = 63;
            public static final int DISCOVERY_SEARCH = 44;
            public static final int DUET_TOTAL = 75;
            public static final int ENTER_PHOTO_MOIVE = 66;
            public static final int ENTER_PROFILE = 64;
            public static final int ENTER_PUBLISH_PHOTO = 80;
            public static final int ENTER_RECORD = 62;
            public static final int ENTER_VIDEO_EDIT = 65;
            public static final int FANS_LIST_FOLLOW = 20;
            public static final int FEED_DETAIL_AT_USER = 10;
            public static final int FEED_DETAIL_BLACKLIST = 17;
            public static final int FEED_DETAIL_CHANGE_FEED_VISIBILITY = 12;
            public static final int FEED_DETAIL_COMMENT_FEED = 8;
            public static final int FEED_DETAIL_COMMENT_TOTAL = 72;
            public static final int FEED_DETAIL_DELETEFEED = 13;
            public static final int FEED_DETAIL_DOWNLOAD = 73;
            public static final int FEED_DETAIL_FOLLOWUSER = 14;
            public static final int FEED_DETAIL_LIKE = 18;
            public static final int FEED_DETAIL_LOCATION_AGGREGATION = 47;
            public static final int FEED_DETAIL_REDUCE_SIMILAR_FEEDS = 15;
            public static final int FEED_DETAIL_REPLY_COMMENT = 7;
            public static final int FEED_DETAIL_REPORT_COMMENT = 9;
            public static final int FEED_DETAIL_REPORT_FEED = 11;
            public static final int FEED_DETAIL_SAVE = 68;
            public static final int FEED_DETAIL_SHARE = 16;
            public static final int FEED_DETAIL_UNLIKE = 19;
            public static final int FEED_PREVIEW_FINISH = 36;
            public static final int FORCE_LOGIN = 70;
            public static final int GEO_TOTAL = 79;
            public static final int HASHTAG_TOTAL = 76;
            public static final int HOME_FOLLOW_RECOMMEND_USER = 6;
            public static final int HOME_GUIDE_STRATEGY = 42;
            public static final int HOME_LOGIN_BUTTON = 4;
            public static final int HOME_VIEW_LIVE_FEED = 5;
            public static final int IMPORT = 1;
            public static final int KOIN_SHARE_USER = 61;
            public static final int LIKERS_LIST_FOLLOW = 21;
            public static final int LIVE_COVER_SHARE = 45;
            public static final int LIVE_SHARE = 46;
            public static final int LOCAL_ALBUM_DETAIL_SHARE = 22;
            public static final int LOCATION_AGGREGATION_SHARE = 56;
            public static final int MAGICFACE_TOTAL = 78;
            public static final int MUSIC_TOTAL = 77;
            public static final int PROFILE_BLACKLIST = 32;
            public static final int PROFILE_CHANGE_FEED_VISIBILITY = 34;
            public static final int PROFILE_DELETE_FEED = 33;
            public static final int PROFILE_FOLLOW = 26;
            public static final int PROFILE_FOLLOWER = 49;
            public static final int PROFILE_FOLLOWING = 50;
            public static final int PROFILE_LIKE = 27;
            public static final int PROFILE_REPORT = 31;
            public static final int PROFILE_REPORT_FEED = 35;
            public static final int PROFILE_SEND_MESSAGE = 24;
            public static final int PROFILE_SHARE_FEED = 29;
            public static final int PROFILE_SHARE_USER = 30;
            public static final int PROFILE_TOTAL = 74;
            public static final int PROFILE_UNLIKE = 28;
            public static final int PROFILE_VIEW_LIVE_FEED = 25;
            public static final int PUBLISH_PHOTO_AT_FRIEND = 38;
            public static final int PUBLISH_PHOTO_PUBLISH = 40;
            public static final int PUBLISH_PHOTO_REMIND_LOGIN = 41;
            public static final int PUBLISH_PHOTO_SELECT_LOCATION = 39;
            public static final int QUIZ_ENTRY_ENTER_INVITE_CODE = 55;
            public static final int QUIZ_ENTRY_ENTER_LIVE = 51;
            public static final int QUIZ_ENTRY_EXTRA_LIVES = 54;
            public static final int QUIZ_ENTRY_LASTEST_RANK = 53;
            public static final int QUIZ_ENTRY_LEADER_BOARD = 60;
            public static final int QUIZ_ENTRY_TOTAL_INCOME = 52;
            public static final int RAMADAN_ACTIVITY_LOGIN = 69;
            public static final int RECOMMEND_USERLISTFOLLOW = 23;
            public static final int RE_LOGIN = 3;
            public static final int TAG_DETAIL_SHARE = 57;
            public static final int TAG_DUET_SHARE = 71;
            public static final int TAG_MAGIC_FACE_SHARE = 59;
            public static final int TAG_MUSIC_SHARE = 58;
            public static final int TAG_SUBSCRIBE = 85;
            public static final int THREE_DIMENSION_TOUCH_SHOT = 2;
            public static final int TOP_USER_FOLLOW = 43;
            public static final int TUBE_DETAIL_FOLLOW = 86;
            public static final int TUBE_DETAIL_SUBSCRIBE = 84;
            public static final int TUBE_SERIES_SUBSCRIBES_TAB = 81;
            public static final int TUBE_SERIES_SUBSCRIBES_TAB_REFRESH = 82;
            public static final int TUBE_SUBSCRIBE = 83;
            public static final int UNKNOWN3 = 0;
            public static final int WEB_SHARE = 67;
        }

        @Retention(RetentionPolicy.SOURCE)
        /* compiled from: kSourceFile */
        public @interface Status {
            public static final int CANCEL = 3;
            public static final int FAILURE = 4;
            public static final int START = 1;
            public static final int SUCCESS = 2;
            public static final int UNKNOWN2 = 0;
        }

        @Retention(RetentionPolicy.SOURCE)
        /* compiled from: kSourceFile */
        public @interface Step {
            public static final int AUTHENTICATION_CODE = 2;
            public static final int CHOOSE_GENDER = 6;
            public static final int EMAIL_ACCOUNT = 5;
            public static final int PHONE_NUMBER = 1;
            public static final int UNKNOWN4 = 0;
            public static final int USER_NAME = 4;
            public static final int USER_PASSWORD = 3;
        }

        public LoginEvent() {
            clear();
        }

        public static LoginEvent[] emptyArray() {
            if (_emptyArray == null) {
                synchronized (InternalNano.LAZY_INIT_LOCK) {
                    if (_emptyArray == null) {
                        _emptyArray = new LoginEvent[0];
                    }
                }
            }
            return _emptyArray;
        }

        public LoginEvent clear() {
            this.actionType = 0;
            this.platform = 0;
            this.status = 0;
            this.source = 0;
            this.extraMessage = "";
            this.step = 0;
            this.stayTime = 0;
            this.stepBack = false;
            this.id = "";
            return this;
        }

    }

    /* compiled from: kSourceFile */
    public static final class ODOTEvent {
        public static volatile ODOTEvent[] _emptyArray;
        public Map<String, String> bizMap;

        public ODOTEvent() {
            clear();
        }

        public ODOTEvent clear() {
            this.bizMap = null;
            return this;
        }

        public static ODOTEvent[] emptyArray() {
            if (_emptyArray == null) {
                synchronized (InternalNano.LAZY_INIT_LOCK) {
                    if (_emptyArray == null) {
                        _emptyArray = new ODOTEvent[0];
                    }
                }
            }
            return _emptyArray;
        }

    }

    /* compiled from: kSourceFile */
    public static final class RawEventPackage {
        public static volatile RawEventPackage[] _emptyArray;
        public byte[] clickEvent;
        public byte[] customEvent;
        public byte[] exceptionEvent;
        public byte[] firstLaunchEvent;
        public byte[] fixAppEvent;
        public byte[] launchEvent;
        public byte[] loginEvent;
        public byte[] odotEvent;
        public byte[] searchEvent;
        public byte[] shareEvent;
        public byte[] showEvent;
        public byte[] taskEvent;

        public RawEventPackage() {
            clear();
        }

        public static RawEventPackage[] emptyArray() {
            if (_emptyArray == null) {
                synchronized (InternalNano.LAZY_INIT_LOCK) {
                    if (_emptyArray == null) {
                        _emptyArray = new RawEventPackage[0];
                    }
                }
            }
            return _emptyArray;
        }

        public RawEventPackage clear() {
            byte[] bArr = WireFormatNano.EMPTY_BYTES;
            this.launchEvent = bArr;
            this.showEvent = bArr;
            this.clickEvent = bArr;
            this.taskEvent = bArr;
            this.exceptionEvent = bArr;
            this.searchEvent = bArr;
            this.loginEvent = bArr;
            this.shareEvent = bArr;
            this.fixAppEvent = bArr;
            this.customEvent = bArr;
            this.odotEvent = bArr;
            this.firstLaunchEvent = bArr;
            return this;
        }

    }

    /* compiled from: kSourceFile */
    public static final class ResultPackage {
        public static volatile ResultPackage[] _emptyArray;
        public int code;
        public int domain;
        public String message;
        public String subdomain;
        public long timeCost;

        @Retention(RetentionPolicy.SOURCE)
        /* compiled from: kSourceFile */
        public @interface Domain {
            public static final int HTTP = 1;
            public static final int KINGSOFT_LIVE_PLAY = 5;
            public static final int KINGSOFT_LIVE_PUSH = 4;
            public static final int KUAISHOU = 3;
            public static final int SYSTEM = 2;
            public static final int UNKNOWN2 = 0;
        }

        public ResultPackage() {
            clear();
        }

        public static ResultPackage[] emptyArray() {
            if (_emptyArray == null) {
                synchronized (InternalNano.LAZY_INIT_LOCK) {
                    if (_emptyArray == null) {
                        _emptyArray = new ResultPackage[0];
                    }
                }
            }
            return _emptyArray;
        }

        public ResultPackage clear() {
            this.domain = 0;
            this.code = 0;
            this.message = "";
            this.timeCost = 0;
            this.subdomain = "";
            return this;
        }


    }

    /* compiled from: kSourceFile */
    public static final class SearchEvent {
        public static volatile SearchEvent[] _emptyArray;
        public String keyword;
        public int source;
        public int type;
        public UrlPackage urlPackage;

        @Retention(RetentionPolicy.SOURCE)
        /* compiled from: kSourceFile */
        public @interface Source {
            public static final int SEARCH_ASSOCIATIVE_WORD = 3;
            public static final int SEARCH_BOX = 1;
            public static final int SEARCH_GUESS = 7;
            public static final int SEARCH_HISTORY = 2;
            public static final int SEARCH_PUSH = 5;
            public static final int SEARCH_SILENT = 6;
            public static final int SEARCH_TRENDING_WORDS = 4;
            public static final int UNKONWN2 = 0;
        }

        @Retention(RetentionPolicy.SOURCE)
        /* compiled from: kSourceFile */
        public @interface Type {
            public static final int UNIVERSAL = 1;
            public static final int UNKONWN1 = 0;
            public static final int VERTICAL = 2;
        }

        public SearchEvent() {
            clear();
        }

        public static SearchEvent[] emptyArray() {
            if (_emptyArray == null) {
                synchronized (InternalNano.LAZY_INIT_LOCK) {
                    if (_emptyArray == null) {
                        _emptyArray = new SearchEvent[0];
                    }
                }
            }
            return _emptyArray;
        }

        public SearchEvent clear() {
            this.urlPackage = null;
            this.keyword = "";
            this.type = 0;
            this.source = 0;
            return this;
        }

    }

    /* compiled from: kSourceFile */
    public static final class ShareEvent {
        public static volatile ShareEvent[] _emptyArray;
        public String authorId;
        public boolean cancelStatusReliable;
        public int contentType;
        public String contentWrapper;
        public long downloadCost;
        public String expTag;
        public String expTag0;
        public String failureReason;
        public int index;
        public String photoId;
        public String photoInfo;
        public int platform;
        public long shortenUrlCost;
        public int source;
        public int status;
        public int step;
        public int type;
        public String url;
        public String urlParams;
        public long watermarkCost;

        @Retention(RetentionPolicy.SOURCE)
        /* compiled from: kSourceFile */
        public @interface ContentType {
            public static final int EXCHANGE = 7;
            public static final int H5 = 13;
            public static final int IMAGE = 3;
            public static final int INVITE_FRIENDS = 8;
            public static final int LIVE_COVER = 4;
            public static final int LIVE_QUIZ = 6;
            public static final int LIVE_QUIZ_INVITE_CODE = 11;
            public static final int LIVE_QUIZ_WINNER = 10;
            public static final int LIVE_RED_PACK_RAIN_RESULT = 15;
            public static final int LIVE_RED_PACK_RAIN_RULE = 14;
            public static final int LIVE_STREAM = 1;
            public static final int POI = 12;
            public static final int PROFILE = 5;
            public static final int TAG = 9;
            public static final int UNKNOWN3 = 0;
            public static final int VIDEO = 2;
        }

        @Retention(RetentionPolicy.SOURCE)
        /* compiled from: kSourceFile */
        public @interface Source {
            public static final int BATCH_PHOTO_SHARE = 27;
            public static final int BATCH_USER_SHARE = 26;
            public static final int BEFORE_UPLOAD_REMIND_SHARE = 13;
            public static final int DOWNLOAD_VIDEO_SHARE = 8;
            public static final int FULLSCREEN_PLAY = 14;
            public static final int HOME = 15;
            public static final int LIVE = 4;
            public static final int LIVE_ENTRY = 5;
            public static final int LIVE_PLAY = 16;
            public static final int LIVE_PUSH = 17;
            public static final int LIVE_SCREEN_SHOT = 12;
            public static final int LOCAL_ALBUM = 6;
            public static final int MUSIC_STATION = 25;
            public static final int MUSIC_TAG = 9;
            public static final int PAGE_GAMELIVE_GAMEPAGE = 29;
            public static final int PAGE_GAMELIVE_HOMEPAGE = 28;
            public static final int PERSONAL_DATA_INVENTORY = 18;
            public static final int PERSON_PROFILE = 7;
            public static final int PHOTO_DETAIL = 2;
            public static final int PHOTO_REDPACKET = 19;
            public static final int PIC_SHARE = 20;
            public static final int PUBLISH = 1;
            public static final int SINGLE_FEED_PHOTO_DETAIL_SHARE = 11;
            public static final int SINGLE_FEED_SHARE = 10;
            public static final int SPRFES_MAIN = 21;
            public static final int SPRFES_MAIN_INVITATION = 22;
            public static final int STATUS_DETAIL_SHARE = 24;
            public static final int STATUS_LIST_SHARE = 23;
            public static final int UNKNOWN1 = 0;
            public static final int UPLOAD_FINISH_REMIND_SHARE = 3;
        }

        @Retention(RetentionPolicy.SOURCE)
        /* compiled from: kSourceFile */
        public @interface Status {
            public static final int CANCEL = 3;
            public static final int FAILURE = 4;
            public static final int START = 1;
            public static final int SUCCESS = 2;
            public static final int UNKNOWN2 = 0;
        }

        @Retention(RetentionPolicy.SOURCE)
        /* compiled from: kSourceFile */
        public @interface Step {
            public static final int ADD_WATERMARK = 3;
            public static final int CACHE = 5;
            public static final int CALL_UP_THIRD_PARTY_SDK = 7;
            public static final int DOWNLOAD = 2;
            public static final int FALLBACK_DOWNLOAD = 6;
            public static final int SHORTEN_URL = 1;
            public static final int THUMB_IMAGE = 4;
            public static final int UNKNOWN4 = 0;
        }

        @Retention(RetentionPolicy.SOURCE)
        /* compiled from: kSourceFile */
        public @interface Type {
            public static final int CARD = 4;
            public static final int DOWNLOAD_SHARE = 5;
            public static final int IMAGE_SHARE = 6;
            public static final int LINK = 3;
            public static final int MESSAGE = 7;
            public static final int SMALL_APP = 1;
            public static final int TOKEN = 2;
            public static final int UNKNOWN5 = 0;
        }

        public ShareEvent() {
            clear();
        }

        public static ShareEvent[] emptyArray() {
            if (_emptyArray == null) {
                synchronized (InternalNano.LAZY_INIT_LOCK) {
                    if (_emptyArray == null) {
                        _emptyArray = new ShareEvent[0];
                    }
                }
            }
            return _emptyArray;
        }

        public ShareEvent clear() {
            this.source = 0;
            this.status = 0;
            this.contentType = 0;
            this.platform = 0;
            this.authorId = "";
            this.photoId = "";
            this.expTag = "";
            this.url = "";
            this.failureReason = "";
            this.expTag0 = "";
            this.photoInfo = "";
            this.urlParams = "";
            this.cancelStatusReliable = false;
            this.index = 0;
            this.step = 0;
            this.shortenUrlCost = 0;
            this.watermarkCost = 0;
            this.downloadCost = 0;
            this.type = 0;
            this.contentWrapper = "";
            return this;
        }

    }

    /* compiled from: kSourceFile */
    public static final class ShareLaunchPackage {
        public static volatile ShareLaunchPackage[] _emptyArray;
        public String extraInfo;
        public String shareId;
        public String token;

        public ShareLaunchPackage() {
            clear();
        }

        public static ShareLaunchPackage[] emptyArray() {
            if (_emptyArray == null) {
                synchronized (InternalNano.LAZY_INIT_LOCK) {
                    if (_emptyArray == null) {
                        _emptyArray = new ShareLaunchPackage[0];
                    }
                }
            }
            return _emptyArray;
        }

        public ShareLaunchPackage clear() {
            this.shareId = "";
            this.token = "";
            this.extraInfo = "";
            return this;
        }

    }

    /* compiled from: kSourceFile */
    public static final class ShowEvent {
        public static volatile ShowEvent[] _emptyArray;
        public int action;
        public AreaPackage areaPackage;
        public String contentWrapper;
        public ElementPackage elementPackage;
        public String internalStidContainerJson;
        public int pageShowSeq;
        public ElementPackage referElementPackage;
        public UrlPackage referUrlPackage;
        public int showType;
        public int status;
        public long stayLength;
        public int subAction;
        public long timeCost;
        public int type;
        public UrlPackage urlPackage;

        @Retention(RetentionPolicy.SOURCE)
        /* compiled from: kSourceFile */
        public @interface Action {
            public static final int ENTER = 1;
            public static final int LEAVE = 2;
            public static final int RESUME = 3;
            public static final int UNKNOWN1 = 0;
        }

        @Retention(RetentionPolicy.SOURCE)
        /* compiled from: kSourceFile */
        public @interface ShowType {
            public static final int BACK_CLICK = 4;
            public static final int CLICK = 1;
            public static final int CLICK_HOME = 8;
            public static final int CLICK_SYS_BACK = 9;
            public static final int CLICK_UPLEFT_ICON = 10;
            public static final int COLD_LAUNCH = 11;
            public static final int DOWN_PULL = 7;
            public static final int DOWN_SLIDE = 6;
            public static final int LEFT_PULL = 2;
            public static final int RIGHT_PULL = 3;
            public static final int UNKNOWN4 = 0;
            public static final int UP_SLIDE = 5;
        }

        @Retention(RetentionPolicy.SOURCE)
        /* compiled from: kSourceFile */
        public @interface Status {
            public static final int FAIL = 2;
            public static final int SUCCESS = 1;
            public static final int UNKNOWN3 = 0;
        }

        @Retention(RetentionPolicy.SOURCE)
        /* compiled from: kSourceFile */
        public @interface SubAction {
            public static final int PAGE_ENTER = 1;
            public static final int PAGE_LEAVE = 2;
            public static final int PAGE_PAUSE = 4;
            public static final int PAGE_RESUME = 3;
            public static final int UNKNOWN5 = 0;
        }

        @Retention(RetentionPolicy.SOURCE)
        /* compiled from: kSourceFile */
        public @interface Type {
            public static final int BANNER = 5;
            public static final int BUBBLE = 7;
            public static final int BUTTON = 6;
            public static final int DIALOG = 4;
            public static final int ITEM = 3;
            public static final int LIVE = 9;
            public static final int PAGE = 1;
            public static final int POPUP_WINDOW = 10;
            public static final int SUB_PAGE = 2;
            public static final int UNKNOWN2 = 0;
            public static final int VIDEO = 8;
        }

        public ShowEvent() {
            clear();
        }

        public static ShowEvent[] emptyArray() {
            if (_emptyArray == null) {
                synchronized (InternalNano.LAZY_INIT_LOCK) {
                    if (_emptyArray == null) {
                        _emptyArray = new ShowEvent[0];
                    }
                }
            }
            return _emptyArray;
        }

        public ShowEvent clear() {
            this.action = 0;
            this.urlPackage = null;
            this.referUrlPackage = null;
            this.type = 0;
            this.status = 0;
            this.timeCost = 0;
            this.stayLength = 0;
            this.elementPackage = null;
            this.referElementPackage = null;
            this.showType = 0;
            this.subAction = 0;
            this.pageShowSeq = 0;
            this.contentWrapper = "";
            this.areaPackage = null;
            this.internalStidContainerJson = "";
            return this;
        }
    }

    /* compiled from: kSourceFile */
    public static final class UrlPackage {
        public static volatile UrlPackage[] _emptyArray;
        public int category;
        public String entryPageId;
        public String entryPageSource;
        public ExpTagTransList expTagList;
        public String identity;
        public int page;
        public String page2;
        public int pageSeq;
        public int pageType;
        public String params;
        public String subPages;
        public String topPage;
        public String userRouteTrace;

        @Retention(RetentionPolicy.SOURCE)
        /* compiled from: kSourceFile */
        public @interface Category {
            public static final int ADS = 7;
            public static final int APP = 1;
            public static final int HOME = 2;
            public static final int IMAGE = 9;
            public static final int LIVE_STREAM = 5;
            public static final int PAY = 6;
            public static final int SEARCH = 8;
            public static final int UNKNOWN1 = 0;
            public static final int USER = 3;
            public static final int VIDEO = 4;
        }

        @Retention(RetentionPolicy.SOURCE)
        /* compiled from: kSourceFile */
        public @interface Page {
            public static final int ABOUT_KWAI_PAGE = 266;
            public static final int ACCESS_GUIDE_POP = 30281;
            public static final int ACCOUNT_ACTIVE = 30156;
            public static final int ACCOUNT_ACTIVE_PAGE = 32162;
            public static final int ACCOUNT_APPEAL_BIND_PHONE_PAGE = 204;
            public static final int ACCOUNT_APPEAL_REAL_PERSON_VERIFICATION_PAGE = 233;
            public static final int ACCOUNT_APPEAL_REAL_PERSON_VERIFICATION_UNLOGGED_IN_PAGE = 234;
            public static final int ACCOUNT_APPEAL_REGISTER_INFO_PAGE = 205;
            public static final int ACCOUNT_APPEAL_SLIDE_VERIFICATION_PAGE = 203;
            public static final int ACCOUNT_APPEAL_USE_INFO_PAGE = 206;
            public static final int ACCOUNT_CONFIRM_PAGE = 30007;
            public static final int ACCOUNT_EXCEPTION = 30066;
            public static final int ACCOUNT_EXCEPTION_LOGIN = 30064;
            public static final int ACCOUNT_PROTECTION = 90;
            public static final int ACCOUNT_RECOVERY = 76;
            public static final int ACCOUNT_SAFETY = 157;
            public static final int ACTIVITY_CENTER = 30167;
            public static final int ADD_FOLLOW_PEOPLE_PAGE = 30025;
            public static final int ADD_FRIEND = 143;
            public static final int ADD_PUBLIC_GROUP_ADMINISTRATOR = 32103;
            public static final int ADD_STICKER = 30394;
            public static final int ADD_TOPIC = 158;
            public static final int ADVANCED_EDIT = 26;
            public static final int AGE_COLLECTION_PAGE = 30127;
            public static final int AGGREGATION_USER_LIST = 142;
            public static final int ALLOW_CAMERA_ACCESS_PAGE = 277;
            public static final int ANSWER_DETAIL = 135;
            public static final int APP_COMMON = 32135;
            public static final int APP_GENERAL = 89;
            public static final int AT_NOTIFICATION_CLUSTER = 30097;
            public static final int AUTHENTICATION_CODE = 32081;
            public static final int AUTHORIZED_IPHONE_QUICK_LOGIN = 230;
            public static final int AUTHOR_WEEKLY_REPORT = 316;
            public static final int AUTHOR_WEEKLY_REPORT_PHASE_TWO = 32022;
            public static final int AUTO_ORDER_PAGE = 30304;
            public static final int BABYFACE_EDIT_AVATAR_PAGE = 32099;
            public static final int BABYFACE_GENERATE_AVATAR_PAGE = 32090;
            public static final int BABYFACE_HOME_PAGE = 32087;
            public static final int BABYFACE_OPEN_SHARE_LINK_PAGE = 32091;
            public static final int BABYFACE_PICTURE_CONFIRM_PAGE = 32088;
            public static final int BABYFACE_RESULT_PAGE = 32089;
            public static final int BABYFACE_SAVE_AVATAR_PAGE = 32100;
            public static final int BINDING_PHONE_NUMBER_PROCESS = 32072;
            public static final int BIND_MOBILE_ACTIVE_PAGE = 32160;
            public static final int BLACK_LIST = 211;
            public static final int BROWSE_SETTINGS = 30060;
            public static final int BROWSING_HISTORY_PAGE = 32046;
            public static final int BUSINESS_APPLY = 30202;
            public static final int BUSINESS_APPLY_FINISH = 30259;
            public static final int BUSINESS_APPLY_INTRO = 30203;
            public static final int BUSINESS_APPLY_PERSONAL = 30204;
            public static final int BUSINESS_APPLY_PROFILE = 30255;
            public static final int BUSINESS_APPLY_SETINFO = 30256;
            public static final int BUSINESS_APPLY_SETPHOTO = 30257;
            public static final int BUSINESS_APPLY_SETQUOTE = 30258;
            public static final int BUSINESS_APPLY_SETTING = 30205;
            public static final int BUSINESS_BRAND_ACTIVITY = 30217;
            public static final int BUSINESS_CAR_BRANDDETAIL = 30405;
            public static final int BUSINESS_CAR_BRANDLIST = 30404;
            public static final int BUSINESS_CAR_FRONTPAGE = 30403;
            public static final int BUSINESS_CAR_GUIDE = 30406;
            public static final int BUSINESS_FANSTOP_APPLY_PLATECO = 30367;
            public static final int BUSINESS_FANSTOP_AUDIT_REFUSE = 30318;
            public static final int BUSINESS_FANSTOP_AUTO_FRONTPAGE = 30266;
            public static final int BUSINESS_FANSTOP_AUTO_NOPHOTO = 30267;
            public static final int BUSINESS_FANSTOP_AUTO_ORDER = 30268;
            public static final int BUSINESS_FANSTOP_CHECKOUT = 30269;
            public static final int BUSINESS_FANSTOP_CHOOSE_AUTHOR = 30366;
            public static final int BUSINESS_FANSTOP_CHOOSE_PHOTO = 30315;
            public static final int BUSINESS_FANSTOP_FRONTPAGE = 30313;
            public static final int BUSINESS_FANSTOP_OHTER_METHOD = 30365;
            public static final int BUSINESS_FANSTOP_ORDERDETAIL = 30271;
            public static final int BUSINESS_FANSTOP_ORDERLIST = 30270;
            public static final int BUSINESS_FANSTOP_PAY_ORDER = 30368;
            public static final int BUSINESS_FANSTOP_PAY_RESULT = 30369;
            public static final int BUSINESS_FANSTOP_PHOTOLIST = 30272;
            public static final int BUSINESS_FANSTOP_PLATECO_RECOMMEND = 30314;
            public static final int BUSINESS_FANSTOP_QUICK_PROMOTION_CHOOSEN = 30364;
            public static final int BUSINESS_FANSTOP_REVIEW = 30273;
            public static final int BUSINESS_FANSTOP_SUBMIT_INFO = 30317;
            public static final int BUSINESS_FANSTOP_SUBMIT_ORDER = 30316;
            public static final int BUSINESS_KOL_INCOME_FRONTPAGE = 30339;
            public static final int BUSINESS_KOL_INCOME_LIST = 30340;
            public static final int BUSINESS_LIVE_FANSTOP_PROMOTION_DETAIL = 30412;
            public static final int BUSINESS_LIVE_FANSTOP_PROMOTION_ORDER_DETAIL = 30414;
            public static final int BUSINESS_LIVE_FANSTOP_PROMOTION_ORDER_LIST = 30413;
            public static final int BUSINESS_LIVE_FANSTOP_SUBMIT_ORDER = 30411;
            public static final int BUSINESS_PHOTO_SETTOP = 30212;
            public static final int BUSINESS_PLATFORM_APPLY = 30208;
            public static final int BUSINESS_PLATFORM_APPLY_SUBMIT_INFO = 30286;
            public static final int BUSINESS_PLATFORM_APPLY_VERIFY = 30285;
            public static final int BUSINESS_PLATFORM_APPLY_VERIFYING = 30287;
            public static final int BUSINESS_PLATFORM_APPLY_VERIFY_RESULT = 30408;
            public static final int BUSINESS_PLATFORM_BUSINESS_CLASS = 30407;
            public static final int BUSINESS_PLATFORM_CATEGORY = 30247;
            public static final int BUSINESS_PLATFORM_CLOSE_GUIDE = 30288;
            public static final int BUSINESS_PLATFORM_COUPON = 30323;
            public static final int BUSINESS_PLATFORM_COUPON_CHECK = 30325;
            public static final int BUSINESS_PLATFORM_COUPON_CHECK_DETAIL = 30354;
            public static final int BUSINESS_PLATFORM_COUPON_CHECK_MANAGE = 30353;
            public static final int BUSINESS_PLATFORM_COUPON_DETAIL = 30356;
            public static final int BUSINESS_PLATFORM_COUPON_PREVIEW = 30330;
            public static final int BUSINESS_PLATFORM_CREATE_COUPON = 30324;
            public static final int BUSINESS_PLATFORM_CREATE_COUPON_P_BREAK = 30415;
            public static final int BUSINESS_PLATFORM_CREATE_COUPON_THIRD = 30352;
            public static final int BUSINESS_PLATFORM_CREATE_COUPON_TYPE = 30351;
            public static final int BUSINESS_PLATFORM_EOA = 30334;
            public static final int BUSINESS_PLATFORM_E_INVOICE = 30409;
            public static final int BUSINESS_PLATFORM_E_INVOICE_RESULT = 30410;
            public static final int BUSINESS_PLATFORM_FANSTOP = 30246;
            public static final int BUSINESS_PLATFORM_FUNCTION = 30335;
            public static final int BUSINESS_PLATFORM_NAVIGATION = 30312;
            public static final int BUSINESS_PLATFORM_POI = 30291;
            public static final int BUSINESS_PLATFORM_POI_SEARCH = 30289;
            public static final int BUSINESS_PLATFORM_POI_SEARCH_SUG = 30290;
            public static final int BUSINESS_PLATFORM_TELE_APPLY = 30209;
            public static final int BUSINESS_PLATFORM_VERIFY_CHARGE = 30341;
            public static final int BUSINESS_POI = 30347;
            public static final int BUSINESS_POI_CLAIM = 30346;
            public static final int BUSINESS_POI_MANAGE = 30348;
            public static final int BUSINESS_PROFILE = 30177;
            public static final int BUSINESS_PROFILE_ATPHOTO_SET = 30302;
            public static final int BUSINESS_PROFILE_SETPHONE = 30262;
            public static final int BUSINESS_PROFILE_SETPHONE_CODE = 30263;
            public static final int CAMERA_ALLOWANCE_POPUP = 30250;
            public static final int CANCEL_ACCOUNT_IMPORTANT_NOTE = 32128;
            public static final int CANCEL_ACCOUNT_REQUIREMENTS = 32127;
            public static final int CANCEL_ACCOUNT_REVIEW_ONGOING_PAGE = 32129;
            public static final int CANCEL_ACCOUNT_REVIEW_STATUS_PAGE = 32131;
            public static final int CANCEL_ACCOUNT_REVIEW_SUCCESS_PAGE = 32130;
            public static final int CARRIERS_NEWUSER = 30201;
            public static final int CASH_0 = 30310;
            public static final int CHALLENGE_FAILED = 32126;
            public static final int CHANGE_KWAI_COIN = 30005;
            public static final int CHANGE_LANGUAGE_PAGE = 30301;
            public static final int CHANGE_PHONE_NUMBER = 30023;
            public static final int CHANNEL = 30078;
            public static final int CHANNEL_SELECTED_PAGE = 32096;
            public static final int CHANNEL_SUBSCRIBED = 30159;
            public static final int CHECK_IN_RECORD_PAGE = 32154;
            public static final int CHECK_IN_THEME_PAGE = 32152;
            public static final int CHEST_PACKET = 30052;
            public static final int CHEST_PACKET_CLOSE = 30055;
            public static final int CHEST_PACKET_FIRSTGET = 30053;
            public static final int CHEST_PACKET_KSHELL = 30054;
            public static final int CHILD_LOCK_PASSWORD_CONFIRM = 107;
            public static final int CHILD_LOCK_PASSWORD_SETTINGS = 106;
            public static final int CHILD_LOCK_PASSWORD_VERIFY = 108;
            public static final int CHILD_LOCK_SETTINGS = 105;
            public static final int CHOOSE_ACCOUNT_LOGIN_PAGE = 201;
            public static final int CHOOSE_ACCOUNT_RESET_PAGE = 202;
            public static final int CHOOSE_EXPERTLY_PAGE = 30145;
            public static final int CHOOSE_RESET_ACCOUNT_PAGE = 218;
            public static final int CITY_EXPLOR_PAGE = 261;
            public static final int CITY_ROAM = 23;
            public static final int CLEAR_CACHE = 65;
            public static final int CLICK_CUSTOMER_SERVICE_ICON = 30296;
            public static final int CLICK_KWAI_MUSIC_STATION_AUTHOR_VIDEO_MATCH = 30181;
            public static final int CLICK_LIVE_FLOAT_WINDOW_EXIT = 30298;
            public static final int CLICK_LIVE_FLOAT_WINDOW_RETURN = 30297;
            public static final int CLICK_NOTIFICATION_SWITCH_OF_STREAMER = 30106;
            public static final int CLICK_PK_INTEREST_SET = 30043;
            public static final int CLIENT_GAME_CENTER_HOMEPAGE = 30282;
            public static final int CLOSE_LIVE_FLOAT_WINDOW_AUTO = 30299;
            public static final int CLOUD_MUSIC = 50;
            public static final int CLOUD_MUSIC_AGGREGATION_PAGE = 299;
            public static final int CLOUD_MUSIC_CHANNELS = 32149;
            public static final int COMMENT_BOX_DETAIL_PAGE = 30102;
            public static final int COMMENT_NOTIFICATION_CLUSTER = 30098;
            public static final int COUPON = 30018;
            public static final int COUPON_RECEIVE = 30024;
            public static final int CREATE_NEW_CHAT = 30190;
            public static final int CREATE_NEW_SESSION = 228;
            public static final int CREATE_POST = 30161;
            public static final int CREATIVITY_TEMPLATE = 327;
            public static final int CUSTOM_STICKER_MANAGE_PAGE = 30056;
            public static final int CUTTING_COMPOSE_PAGE = 30378;
            public static final int CUTTING_EDIT_PAGE = 30399;
            public static final int CUTTING_PICTURE_PICKER = 30377;
            public static final int CUTTING_PUBLISH_PAGE = 30379;
            public static final int CUTTING_TEMPLATE_PICKER = 30376;
            public static final int DATA_META_HOMEPAGE = 30132;
            public static final int DDZ_WEBSITE = 30402;
            public static final int DEPOSIT = 8;
            public static final int DEPOSIT_LIST = 11;
            public static final int DETAIL = 7;
            public static final int DETAIL_TAG_PAGE = 326;
            public static final int DETAIL_THEME_PAGE = 32153;
            public static final int DISCOVERY = 48;
            public static final int DOWNLOAD_MANAGEMENT = 100;
            public static final int DRAFT_DETAIL = 154;
            public static final int DUET_INVITE_FRIEND = 184;
            public static final int DUET_USER_LIST = 181;
            public static final int DYNAMIC_PIC_DETAIL_PAGE = 221;
            public static final int DYNAMIC_PIC_IMPORT_PAGE = 225;
            public static final int DYNAMIC_PIC_SELECT_PAGE = 224;
            public static final int DYNAMIC_PIC_SHOT_PAGE = 223;
            public static final int DYNAMIC_TOPIC_PAGE = 226;
            public static final int DYNMAIC_PUBLISH_PAGE = 222;
            public static final int EDIT_CROP = 30179;
            public static final int EDIT_EFFECT = 37;
            public static final int EDIT_FOLLOWER_LIST = 87;
            public static final int EDIT_PERSONAL_DESCRIPTION = 30129;
            public static final int EDIT_PREVIEW = 29;
            public static final int EDIT_PUBLIC_GROUP_INFO = 32036;
            public static final int EDIT_TEXT = 30264;
            public static final int EDIT_VIDEO_LENGTH = 30393;
            public static final int EMAIL_LOGIN_PAGE = 32070;
            public static final int EXCHANGE = 10;
            public static final int EXCHANGE_AWARD = 88;
            public static final int FANS_TOP_HOMEPAGE = 30126;
            public static final int FEATURED_LIVE_SQUARE_AGGREGATE_PAGE = 32166;
            public static final int FEATURED_PAGE = 32066;
            public static final int FEEDBACK_AND_HELP = 176;
            public static final int FEEDBACK_DETAIL = 178;
            public static final int FEEDBACK_HELP = 30087;
            public static final int FEEDBACK_QUESTION = 180;
            public static final int FEEDBACK_QUESTION_DETAIL = 179;
            public static final int FEEDBACK_QUESTION_H5 = 32062;
            public static final int FEEDBACK_SECONDARY_CATEGORY = 177;
            public static final int FEED_DETAIL = 32144;
            public static final int FILL_IN_PERSONAL_INFORMATION = 111;
            public static final int FILL_IN_PERSONAL_INFORMATION_V2 = 32071;
            public static final int FIND = 3;
            public static final int FIND_CONTACT_LIST = 70;
            public static final int FIND_FRIENDS = 66;
            public static final int FIND_NEARBY_PEOPLE = 302;
            public static final int FIND_QQ_FRIEND_LIST = 69;
            public static final int FIND_STRANGER_PAGE = 290;
            public static final int FIND_VERTICAL_CHANNEL_PAGE = 32006;
            public static final int FIND_VERTICAL_PAGE = 32063;
            public static final int FLOWER_REWARD_LIST_PAGE = 32047;
            public static final int FLUTTER_GAME_DETAIL_PAGE = 30338;
            public static final int FOLLLOW_SHOOT_PAGE = 282;
            public static final int FOLLOW = 2;
            public static final int FOLLOWER_LIST = 86;
            public static final int FOLLOWING_LIST = 155;
            public static final int FOLLOW_AND_GET_MONEY_PAGE = 193;
            public static final int FOLLOW_GUIDE = 59;
            public static final int FOLLOW_LIST_GAME = 30382;
            public static final int FOLLOW_LIVE = 32165;
            public static final int FOLLOW_USER_DYNAMIC_PAGE = 252;
            public static final int FORCE_LOGIN_PAGE = 30120;
            public static final int FORCE_LOGIN_PAGE_V2 = 32076;
            public static final int FORCE_SIGNUP_LOGIN = 32068;
            public static final int FREQUENTLY_VISITED_AUTHOR = 32098;
            public static final int FRIENDS_LIKE_TO_WATCH_PAGE = 236;
            public static final int FRIENDS_LIST = 30131;
            public static final int FRIENDS_LIST_ADD_NICKNAME = 30133;
            public static final int FRIENDS_PHOTO = 32013;
            public static final int FRIENDS_STATUS = 30086;
            public static final int FRIEND_HAPPAY_BIRTHDAY = 32012;
            public static final int GAMELIVE_TODAY_SEE_MAINPAGE = 30358;
            public static final int GAMELIVE_TODAY_SEE_PLAYPAGE = 30359;
            public static final int GAMELIVE_WONDER_SHOW_MAINPAGE = 30374;
            public static final int GAMELIVE_WONDER_SHOW_PLAYPAGE = 30398;
            public static final int GAMEZONE_FOLLOW_LIVING = 30101;
            public static final int GAMEZONE_FOLLOW_VIDEO = 30095;
            public static final int GAMEZONE_GAME_DETAIL = 50010;
            public static final int GAMEZONE_GAME_ELEMENT = 30096;
            public static final int GAMEZONE_LIVE_PUSH_HOME_PAGE = 30138;
            public static final int GAME_CENTER_CILENT = 30274;
            public static final int GAME_CENTER_DOWNLOAD_MANAGER = 30357;
            public static final int GAME_CENTER_POPUP = 30109;
            public static final int GAME_CENTER_SHARE_GAME_PAGE = 30384;
            public static final int GAME_CENTER_VIDEO_REC = 30277;
            public static final int GAME_CENTER_VIDEO_REC_FEED = 30279;
            public static final int GAME_CENTER_VIDEO_REC_FEED_HOT = 30451;
            public static final int GAME_CENTER_VIDEO_REC_FEED_NEW = 30449;
            public static final int GAME_CENTER_VIDEO_REC_VIDEO = 30284;
            public static final int GAME_CENTER_WIFI_AUTOMATIC_DOWNLOAD = 30322;
            public static final int GAME_DETAIL_INFO = 30140;
            public static final int GAME_DETAIL_LIVE = 50006;
            public static final int GAME_DETAIL_REVIEW = 50005;
            public static final int GAME_DETAIL_VIDEO = 30141;
            public static final int GAME_LIVE_CATEGORY = 50002;
            public static final int GAME_POST_PAGE = 30071;
            public static final int GAME_PROMOTION_ALL_RECORDS = 30373;
            public static final int GAME_PROMOTION_DETAILS = 30371;
            public static final int GAME_PROMOTION_MY_REWARDS = 30372;
            public static final int GAME_PROMOTION_PLAN = 30370;
            public static final int GAME_PROMOTION_SHARE_PAGE = 30383;
            public static final int GAME_REVIEW_EDIT = 50007;
            public static final int GENERAL_CONTACTS_PERMISSSION = 271;
            public static final int GENERAL_PAGE = 30119;
            public static final int GET_MONEY_SUCCESSFUL_PAGE = 192;
            public static final int GIFT_CENTER_PAGE = 30292;
            public static final int GLASSES_OPERATION_REPORT = 126;
            public static final int GLASSES_PARING = 127;
            public static final int GLASSES_PICTURE_PREVIEW = 129;
            public static final int GLASSES_RECORD_CAMERA = 124;
            public static final int GLASSES_SETTINGS = 125;
            public static final int GLASSES_VIDEO_PREVIEW = 128;
            public static final int GLASS_GUIDE_PAGE = 208;
            public static final int GROUP_CHAT_INVITATION_CONFIRMATION = 153;
            public static final int GROUP_CHAT_LIST = 148;
            public static final int GROUP_CHAT_MANAGEMENT = 151;
            public static final int GROUP_CHAT_MESSAGE_DETAIL = 150;
            public static final int GROUP_CHAT_NAME_MODIFICATION = 152;
            public static final int GROUP_CHAT_REMOVE_MERBERS = 149;
            public static final int GROUP_CHAT_SELECT_FRIENDS = 147;
            public static final int GROUP_INFOR_PAGE = 279;
            public static final int GROUP_INVITE_PAGE = 255;
            public static final int GROUP_MEMBER_PROFILE = 32132;
            public static final int GROUP_NICKNAME_PAGE = 278;
            public static final int GROUP_NUMBERS_PAGE = 30036;
            public static final int GROUP_ONLY = 159;
            public static final int GUOQING_GOLDCOINS = 30390;
            public static final int H5_ANSWER_DETAIL = 138;
            public static final int H5_ARTICLE_DETAIL = 32133;
            public static final int H5_COMMON = 32147;
            public static final int H5_COURSE_AUDIT = 170;
            public static final int H5_COURSE_DETAIL = 168;
            public static final int H5_COURSE_INFORMATION_SUBMIT = 171;
            public static final int H5_COURSE_LIST = 169;
            public static final int H5_FLOWER_DETAIL = 32032;
            public static final int H5_FLOWER_RULE_PAGE = 32033;
            public static final int H5_FLOWER_TASK_CENTER = 32031;
            public static final int H5_FREEE_DATA_SERVICE_PAGE = 194;
            public static final int H5_GAME_CENTER_DOWNLOAD_MANAGER = 30220;
            public static final int H5_GAME_CENTER_HALF_SCREEN_DETAIL = 30280;
            public static final int H5_GAME_CENTER_HOMEPAGE = 274;
            public static final int H5_GAME_CENTER_LIVE = 30174;
            public static final int H5_GAME_CENTER_ORDER = 30175;
            public static final int H5_GAME_CENTER_VIDEO_REC = 30254;
            public static final int H5_GAME_HOMEPAGE = 272;
            public static final int H5_GAME_RESULT = 291;
            public static final int H5_GAM_CENTER_DETAIL_PAGE = 275;
            public static final int H5_GET_MONEY_PAGE = 190;
            public static final int H5_HALF_SCREEN_DETAILS_PAGE = 30278;
            public static final int H5_HOMETOWN_INTRO_PAGE = 162;
            public static final int H5_HOMETOWN_LIFE_INFO_PAGE = 30248;
            public static final int H5_HOMETOWN_LIFE_TAB_DETAIL = 30218;
            public static final int H5_HOMETOWN_MY_PUBLISH_LIST = 165;
            public static final int H5_HOMETOWN_NOTIFICATION_DETAIL = 163;
            public static final int H5_HOMETOWN_PAY_TOUCH_DETAIL_PAGE = 30300;
            public static final int H5_HOMETOWN_PRIVACYCHANGE_PAGE = 30207;
            public static final int H5_HOMETOWN_PRIVACY_PAGE = 30206;
            public static final int H5_HOMETOWN_PROFILE_PAGE = 212;
            public static final int H5_HOMETOWN_QUALIFICATIONCHECK_PAGE = 30157;
            public static final int H5_HOMETOWN_QUALIFICATIONOK_PAGE = 30158;
            public static final int H5_HOMETOWN_QUALIFICATION_PAGE = 30148;
            public static final int H5_HOMETOWN_SERVICE_PAGE = 160;
            public static final int H5_HOMETOWN_TAB_DETAIL = 164;
            public static final int H5_IMAGE_OUTSIDE_SHARE = 188;
            public static final int H5_INFORM = 144;
            public static final int H5_INVITE_FRIEND_PAGE = 195;
            public static final int H5_INVITE_FRIEND_REGISTER_PAGE = 196;
            public static final int H5_KUAIYING_FORM = 30345;
            public static final int H5_KY_RUN_DETAIL = 30321;
            public static final int H5_LIVEMATE_ADVICE_PAGE = 217;
            public static final int H5_LIVE_OUTSIDE_SHARE = 120;
            public static final int H5_LOAD_FAIL_PAGE = 191;
            public static final int H5_MY_QUESTION = 136;
            public static final int H5_PHOTO_OUTSIDE_SHARE = 123;
            public static final int H5_PK_ACTIVITY_PAGE = 30057;
            public static final int H5_PK_BONUS_DETAIL_PAGE = 30074;
            public static final int H5_PK_END_PAGE = 30059;
            public static final int H5_PK_OUTER_INVITE_PAGE = 30058;
            public static final int H5_PROFILE_OUTSIDE_SHARE = 121;
            public static final int H5_PUBLISH_NOTIFICATION_PAGE = 166;
            public static final int H5_PUBLISH_NOTIFICATION_SUCCESS_PAGE = 167;
            public static final int H5_PULL_TO_KWAI_PAGE = 220;
            public static final int H5_QUESTION_AND_ANSWER = 134;
            public static final int H5_QUESTION_DETAIL = 139;
            public static final int H5_REGISTER_KWAI_GET_MONEY_PAGE = 189;
            public static final int H5_SELECT_HOMETOWN_PAGE = 161;
            public static final int H5_SHARE_OUTSIDE = 118;
            public static final int H5_SHARE_PEOPLE_LIST_PAGE = 30028;
            public static final int H5_SHARE_VIDEOS_PAGE = 30033;
            public static final int H5_TAG_OUTSIDE_SHARE = 122;
            public static final int H5_UG_DSP_3_FLOOR = 258;
            public static final int H5_UG_DSP_AFD_BAIDUAPP_COPY = 284;
            public static final int H5_UG_DSP_SUSPEND = 257;
            public static final int H5_UG_DSP_VEDIO = 287;
            public static final int H5_UNKNOW = 328;
            public static final int HALF_SCREEN_DETAILS_PAGE = 30261;
            public static final int HAPPAY_BIRTHDAY = 32011;
            public static final int HELP_QUESTION_DETAIL = 30090;
            public static final int HIS_PUBLIC_GROUP_DISPLAY = 32050;
            public static final int HOME_TAB = 30225;
            public static final int HOME_TAB_FOLLOWED_GAME = 50003;
            public static final int HOME_TAB_GAME = 50004;
            public static final int HOME_TAB_LIVE = 50001;
            public static final int HOT = 1;
            public static final int HOTEST_PHOTO_RANKING = 32108;
            public static final int HOTEST_PHOTO_RANKING_RULE = 32109;
            public static final int HOTSEARCH_LANDING_PAGE = 32145;
            public static final int HOTSEARCH_LANDING_PAGE_H5 = 32150;
            public static final int HOT_POSITION_PAGE = 198;
            public static final int HOT_TAG_LIST = 146;
            public static final int IDENTITY_INFO_UPLOAD_PAGE = 207;
            public static final int IMAGE_CLIPPING = 270;
            public static final int IMAGE_EDIT = 260;
            public static final int IMAGE_SHOW_PAGE = 30062;
            public static final int IMPORTED_VIDEO_CLIPPING = 114;
            public static final int IMPORT_LIKE_LIST_PAGE = 251;
            public static final int IMPORT_VIDEOS_PAGE = 30031;
            public static final int IM_CHAT_MESSAGE_DETAIL = 32097;
            public static final int INFORM_USER_LIST = 174;
            public static final int INPUT_AUTHENTICATION_CODE_IN_BINDING_PROCESS = 98;
            public static final int INPUT_AUTHENTICATION_CODE_IN_LOGIN_PROCESS = 253;
            public static final int INPUT_AUTHENTICATION_CODE_IN_SIGNUP_PROCESS = 104;
            public static final int INPUT_AUTHENTICATION_CODE_OPTIMIZED_PAGE = 32020;
            public static final int INPUT_PASSWORD_IN_LOGIN_PROCESS = 103;
            public static final int INPUT_PHONE_NUMBER_IN_BINDING_PROCESS = 97;
            public static final int INPUT_PHONE_NUMBER_IN_LOGIN_PROCESS = 102;
            public static final int INPUT_PHONE_NUMBER_LOGIN_OPTIMIZED_PAGE = 32019;
            public static final int INTELLIGENT_ALBUM_LIST_PAGE = 32016;
            public static final int INTELLIGENT_ALBUM_PRODUCE_PAGE = 32024;
            public static final int INTERESTED_PEOPLE_PAGE = 276;
            public static final int INTEREST_GUIDE_PAGE = 32121;
            public static final int INVITE_CODE = 30308;
            public static final int INVITE_FRIEND = 130;
            public static final int INVITE_QRCODE = 30360;
            public static final int IPHONE_QUICK_LOGIN = 229;
            public static final int IPHONE_QUICK_LOGIN_OR_SIGN_UP = 32074;
            public static final int JIMU_RESERVATION = 30361;
            public static final int JONI_RECORD_CAMERA = 141;
            public static final int KARAOKE_TAG = 119;
            public static final int KCARD_SONGLIULIANG = 30223;
            public static final int KID_SET_REG_PAGE = 30144;
            public static final int KMOJI_EDIT = 310;
            public static final int KOIN_CONTACT_LIST = 132;
            public static final int KOIN_VK_FRIEND_LIST = 131;
            public static final int KTV_PAGE = 30164;
            public static final int KUAISHAN_EDIT_TEMPLATE = 324;
            public static final int KUAISHAN_SELECT_TEMPLATE = 323;
            public static final int KWAICARD_COIN = 30152;
            public static final int KWAI_CAR = 32125;
            public static final int KWAI_INSIDE_H5_PAGE = 30391;
            public static final int KWAI_LABORATORY = 41;
            public static final int KWAI_MUSIC_STATION = 30022;
            public static final int KWAI_MUSIC_STATION_ABNORMAL = 30039;
            public static final int KWAI_MUSIC_STATION_AUTHOR_VIDEO_MATCH = 30147;
            public static final int KWAI_MUSIC_STATION_DETAIL = 30142;
            public static final int KWAI_MUSIC_STATION_VIDEO_PROGRESS = 30063;
            public static final int KWAI_OUTSIDE_H5_PAGE = 30392;
            public static final int LAB_ITEM_DETAIL_PAGE = 264;
            public static final int LARGE_SCREEN_BROWSE_SETTING = 32123;
            public static final int LIKE_NOTIFICATION_CLUSTER = 30099;
            public static final int LIKE_USER_LIST = 101;
            public static final int LIVEMATE_GAME_TYPE_PAGE = 231;
            public static final int LIVEMATE_HOME_PAGE = 214;
            public static final int LIVEMATE_LIVE_PAGE = 216;
            public static final int LIVEMATE_LOGIN_PAGE = 213;
            public static final int LIVEMATE_PREPARE_PAGE = 215;
            public static final int LIVETOOL_RESULTS_PAGE = 30320;
            public static final int LIVETOOL_VIDEOS_COLLECTION_PAGE = 30319;
            public static final int LIVE_ADMIN_OPERATE_RECORD_PAGE = 32080;
            public static final int LIVE_ADMIN_SET = 294;
            public static final int LIVE_ANCHOR = 39;
            public static final int LIVE_ENDED_HOST_SIDE = 30124;
            public static final int LIVE_MUSIC = 82;
            public static final int LIVE_MUSIC_STATION_AGGREGATE_PAGE = 32101;
            public static final int LIVE_NOTIFICATION_SETTING = 292;
            public static final int LIVE_PLAYBACK = 30294;
            public static final int LIVE_PREVIEW = 199;
            public static final int LIVE_PUSH = 12;
            public static final int LIVE_PUSH_CLOSED = 16;
            public static final int LIVE_QUIZ = 91;
            public static final int LIVE_QUIZ_ENTRY = 92;
            public static final int LIVE_QUIZ_HELP = 94;
            public static final int LIVE_QUIZ_LEADER_BOARD = 93;
            public static final int LIVE_QUIZ_WITHDRAW = 95;
            public static final int LIVE_SETTINGS = 304;
            public static final int LIVE_SHOOT_PAGE = 200;
            public static final int LIVE_SQUARE = 30333;
            public static final int LIVE_TAKE_COVER = 14;
            public static final int LIVE_WATCH = 13;
            public static final int LIVE_WATCH_TIPS = 47;
            public static final int LOCAL_ALBUM_DETAIL = 68;
            public static final int LOCAL_ALBUM_DETAIL_PREVIEW = 117;
            public static final int LOCAL_MUSIC = 40;
            public static final int LOCAL_SELECT_PHOTO = 30226;
            public static final int LOCAL_VIDEO_SELECT = 30401;
            public static final int LOGIN = 54;
            public static final int LOGIN_CONFIRM_GUIDE_PAGE = 32017;
            public static final int LOGIN_CONFIRM_PAGE = 32018;
            public static final int LOGIN_EDIT_PROFILE = 30122;
            public static final int LOGIN_OR_SIGNUP = 32078;
            public static final int LOGIN_PAGE_NEW = 30230;
            public static final int LOGIN_PHOTO_DETAIL = 303;
            public static final int LOGIN_RETRIEVE_PASSWORD = 172;
            public static final int LOGIN_RETRIEVE_PASSWORD_V2 = 32114;
            public static final int LOGISTICS_SCANNING_PAGE = 293;
            public static final int LONG_VIDEO_EDIT = 116;
            public static final int LOVE_COUNTRY_EDIT_AVATAR_PAGE = 32139;
            public static final int LOVE_COUNTRY_HOME_PAGE = 32136;
            public static final int LOVE_COUNTRY_OPEN_SHARE_LINK_PAGE = 32141;
            public static final int LOVE_COUNTRY_PICTURE_CONFIRM_PAGE = 32137;
            public static final int LOVE_COUNTRY_RESULT_PAGE = 32138;
            public static final int LOVE_COUNTRY_SAVE_AVATAR_PAGE = 32140;
            public static final int MAIN_ADDRESSBOOK = 32085;
            public static final int MAIN_GUIDE = 32084;
            public static final int MAIN_INVITATION = 32082;
            public static final int MAIN_RULES = 32083;
            public static final int MAKE_PRODUCTION = 75;
            public static final int MEMORY_ACTIVITY_PREVIEW = 314;
            public static final int MENU = 46;
            public static final int MENU_LIVE_SQUARE_AGGREGATE_PAGE = 32167;
            public static final int MERCHANT_BUYER_INDEX = 30153;
            public static final int MERCHANT_ITEM_DETAIL = 30275;
            public static final int MERCHANT_OPEN_KWAISHOP_GUIDE = 30154;
            public static final int MERCHANT_SELLER_INDEX = 30107;
            public static final int MERCHANT_TRILATERAL_ITEM_DETAIL = 30123;
            public static final int MERCHANT_WECHAT_SELL = 30249;
            public static final int MESSAGE = 28;
            public static final int MESSAGE_DETAIL = 58;
            public static final int MESSAGE_SEARCH = 300;
            public static final int MESSAGE_USER_VIEW = 110;
            public static final int MIC_ALLOWANCE_POPUP = 30251;
            public static final int MISS_FRIENDS_PHOTO = 32014;
            public static final int MODIFY_PUBLIC_GROUP_INFO = 32039;
            public static final int MOMENTS = 30452;
            public static final int MOMENT_ALBUM = 30070;
            public static final int MOMENT_DETAIL = 32048;
            public static final int MOMENT_LOCATION_PAGE = 283;
            public static final int MOMENT_LOCATION_SELECT = 30076;
            public static final int MOMENT_SQUARE = 30008;
            public static final int MONEY_MAIN = 30306;
            public static final int MONEY_OUTSIDE_H5 = 30307;
            public static final int MORE_CREATIVITIES_PAGE = 298;
            public static final int MORE_FRIEND_LIST = 77;
            public static final int MULTI_PHOTO_PICKER = 313;
            public static final int MUSIC_BILLBOARD = 30182;
            public static final int MUSIC_BOX = 30183;
            public static final int MUSIC_CHANNEL_LIST = 175;
            public static final int MUSIC_CLIPS = 51;
            public static final int MUSIC_EFFECT = 53;
            public static final int MUSIC_STATION_KWAI_VOICE_AUDITION_PAGE = 32155;
            public static final int MUSIC_STATION_KWAI_VOICE_DRAW_PRIZE_PAGE = 32157;
            public static final int MUSIC_STATION_KWAI_VOICE_OUT_SITE_PAGE = 32156;
            public static final int MUSIC_STATION_KWAI_VOICE_PRIZED_SONG_PAGE = 32163;
            public static final int MUSIC_STATION_PAGE = 30165;
            public static final int MUSIC_STATION_PERSONAL_PAGE = 32028;
            public static final int MUTUAL_FRIENDS = 62;
            public static final int MUTUAL_VOTE_DYNAMIC_PAGE = 219;
            public static final int MV_EDIT_PREVIEW = 269;
            public static final int MV_LIBRARY = 30381;
            public static final int MV_TEMPLATE_PICKER = 268;
            public static final int MY_CLOUD = 307;
            public static final int MY_CLOUD_DETAIL = 309;
            public static final int MY_CLOUD_SELECT = 308;
            public static final int MY_COLLECT = 209;
            public static final int MY_GIFT_PAGE = 30293;
            public static final int MY_INCOME = 30309;
            public static final int MY_LIKE_PAGE = 30061;
            public static final int MY_PROFILE = 30210;
            public static final int MY_QRCODE = 19;
            public static final int MY_SHOP = 99;
            public static final int MY_WALLET = 84;
            public static final int NEAEBY_ROAM_POI_MAP_PAGE = 32079;
            public static final int NEAEBY_ROAM_SEARCH_PAGE = 32065;
            public static final int NEARBY = 15;
            public static final int NEARBY_CITY = 32158;
            public static final int NEARBY_HOT_SITE_PAGE = 262;
            public static final int NEARBY_LIVE = 30163;
            public static final int NEARBY_MOMENT = 30040;
            public static final int NEARBY_PUBLIC_GROUP = 32159;
            public static final int NEARBY_RECOMMEND_LIST = 156;
            public static final int NEARBY_USER = 30166;
            public static final int NEARBY_VOICE_PARTY_PREVIEW = 32005;
            public static final int NEBULA_H5_BACKUP = 30386;
            public static final int NEBULA_LIVE = 30400;
            public static final int NEBULA_OTHER_GUIDE_PAGE = 239;
            public static final int NEBULA_SHOT_GUIDE_PAGE = 238;
            public static final int NEBULA_WHOLE_SITUATION = 30362;
            public static final int NEWS = 56;
            public static final int NEWYEAR_PAGE2019 = 30034;
            public static final int NEW_TAG_PAGE = 185;
            public static final int NEW_USER_GUIDE = 78;
            public static final int NEW_USER_RETENTION_TASK = 30149;
            public static final int NEW_USER_RETENTION_TASK_PAGE = 30155;
            public static final int NEW_USER_TASK_PAGE = 197;
            public static final int NOTE_CHALLENGE_ACTIVITY = 30336;
            public static final int NOTE_CHALLENGE_ACTIVITY_OUTSIDE = 30337;
            public static final int NOTE_GIAO_H5 = 30342;
            public static final int NOTE_GIAO_H5_RESULT = 30344;
            public static final int NOTE_GIAO_H5_SUBMIT = 30343;
            public static final int NOTIFICATION = 30240;
            public static final int NOTIFICATIONS = 57;
            public static final int NOTIFICATION_BOARD = 30017;
            public static final int NOTIFICATION_CLUSTER = 30117;
            public static final int NOTIFICATION_SETTING = 64;
            public static final int NOT_LOGGED_SEARCH_PAGE = 30139;
            public static final int NOT_MANDATORY_LOGIN_PAGE = 30130;
            public static final int NO_PERMISSION_WINDOW = 22;
            public static final int OASIS = 30387;
            public static final int OASIS_INVITE = 30388;
            public static final int OFFICIAL_NOTICE = 30162;
            public static final int ONLINE_SELECT_PHOTO = 30227;
            public static final int OPEN_SCREEN_GAME_PAGE = 273;
            public static final int OP_PHOTO_PRODUCE_WLDH_V1 = 32044;
            public static final int ORDER_BY_INTIMACY_MESSAGE = 301;
            public static final int OTHER_PERSON_AVATAR_PAGE = 30075;
            public static final int OVERSEA_LITE_NEW_HOME = 109;
            public static final int PAGE_GAMEZONE_FOLLOW_LIVE = 30079;
            public static final int PAGE_GAMEZONE_HOME_GAME = 30103;
            public static final int PAGE_GAMEZONE_SEARCH = 30108;
            public static final int PAGE_GAMEZONE_VIDEO = 30081;
            public static final int PAGE_INTEREST_GUIDE = 30136;
            public static final int PAGE_INTEREST_MANAGEMENT = 30137;
            public static final int PAGE_LIKE_DM_USER_LIST = 30116;
            public static final int PAGE_LIVE_BGM_IMPORT_EXPLAIN = 30176;
            public static final int PAGE_NOTIFICATION_SETTINGS = 30104;
            public static final int PAGE_SHOW_T1 = 30186;
            public static final int PAGE_SHOW_T2 = 30187;
            public static final int PAGE_SHOW_T3 = 30188;
            public static final int PAGE_SHOW_T4 = 30189;
            public static final int PAGE_START_LIVE_NOTIFICATION_MANAGEMENT = 30105;
            public static final int PAGE_TEST = 30085;
            public static final int PAGE_TEST_1 = 30184;
            public static final int PAGE_TEST_2 = 30185;
            public static final int PASSWORD_STRENGTH = 33;
            public static final int PC_LIVEMATE_CAMERA_SETTING_PAGE = 250;
            public static final int PC_LIVEMATE_CATEGORY_PAGE = 248;
            public static final int PC_LIVEMATE_COMMENT_FLOATING_WINDOW_PAGE = 247;
            public static final int PC_LIVEMATE_GAME_SOURCE_PAGE = 245;
            public static final int PC_LIVEMATE_GUIDE_DETAIL_PAGE = 244;
            public static final int PC_LIVEMATE_GUIDE_PAGE = 243;
            public static final int PC_LIVEMATE_LOGIN_PAGE = 242;
            public static final int PC_LIVEMATE_MAIN_PAGE = 246;
            public static final int PC_LIVEMATE_WISH_SETTING_PAGE = 249;
            public static final int PERSONALIZATION = 55;
            public static final int PERSONAL_DATA_INVENTORY = 30035;
            public static final int PERSONAL_DATA_RESULT = 30044;
            public static final int PERSONAL_HEAD_SETTINGS_PAGE = 265;
            public static final int PERSONAL_INVENTORY = 30037;
            public static final int PERSONAL_PROFILE_EDIT = 42;
            public static final int PHONE_LOGIN_NEW = 30222;
            public static final int PHONE_NUMBER_LOGIN_PAGE = 32069;
            public static final int PHONE_ONE_KEY_LOGIN_OPTIMIZED_PAGE = 32021;
            public static final int PHOTO_EDIT = 30228;
            public static final int PHOTO_PACKET_END = 30050;
            public static final int PHOTO_PACKET_ERRO = 30051;
            public static final int PHOTO_PACKET_GET = 30042;
            public static final int PHOTO_PACKET_H5 = 30046;
            public static final int PHOTO_PACKET_NONE = 30048;
            public static final int PHOTO_PACKET_OBTAINED = 30049;
            public static final int PHOTO_PACKET_SHARE = 30041;
            public static final int PHOTO_PACKET_START = 30047;
            public static final int PHOTO_PICKER = 17;
            public static final int PHOTO_PREVIEW = 187;
            public static final int PHOTO_PREVIEW_CROP = 30178;
            public static final int PHOTO_PUBLISH = 30229;
            public static final int PHOTP_PACKET_RECORD = 30045;
            public static final int PICTURE_TAKE = 96;
            public static final int POPUP_WINDOW_PLAYED_DURATION = 30020;
            public static final int POSSIBLE_INTERESTED_USER_PAGE = 237;
            public static final int POSTER_EDIT = 30224;
            public static final int PRIVACY_SETTING = 45;
            public static final int PRODUCE_K_SONG_V7 = 32061;
            public static final int PROFILE = 4;
            public static final int PROFILE_DOWNLOAD_TAB = 30241;
            public static final int PROFILE_EDIT_TOP = 30213;
            public static final int PROFILE_KID_SET_PAGE = 30146;
            public static final int PROFILE_TAB_POST = 30082;
            public static final int PUBLIC_GROUP_APPLICATION_PROCESS = 32042;
            public static final int PUBLIC_GROUP_APPLICATION_REJECT = 32043;
            public static final int PUBLIC_GROUP_CHAT_MESSAGE_DETAIL = 32037;
            public static final int PUBLIC_GROUP_DISPLAY_MANAGEMENT = 32049;
            public static final int PUBLIC_GROUP_GUIDE = 32034;
            public static final int PUBLIC_GROUP_INFO_H5 = 32029;
            public static final int PUBLIC_GROUP_MANAGEMENT = 32038;
            public static final int PUBLIC_GROUP_MANAGEMENT_ADMIN = 32040;
            public static final int PUBLIC_GROUP_PROFILE = 32041;
            public static final int PUBLIC_GROUP_TAG = 32035;
            public static final int PUBLIC_GROUP_UPDATE_KWAI_H5 = 32030;
            public static final int PURE_PHONE_QUICK_LOGIN = 232;
            public static final int PUSHSILENCE = 30072;
            public static final int PYMK_LIVE_LIST = 32004;
            public static final int QRCODE_LOGIN = 18;
            public static final int QRCODE_SCAN = 20;
            public static final int QUESTION_DETAIL = 137;
            public static final int QUESTION_SECONDARY_CATEGORY = 30088;
            public static final int QUESTION_TERTIARY_CATEGORY = 30089;
            public static final int QUICK_LOGIN_PAGE = 32073;
            public static final int REC = 6;
            public static final int RECEIVE_COINS_MOBILE = 30389;
            public static final int RECENT_SAME_FRAME_RANKING = 32111;
            public static final int RECENT_SOUND_TRACK_RANKING = 32110;
            public static final int RECOMMEND_FOLLOW_LIST = 61;
            public static final int RECOMMEND_INTEREST_LIST = 71;
            public static final int RECORD_CAMERA = 60;
            public static final int RECORD_KARAOKE = 113;
            public static final int RECO_LIVE_SQUARE_AGGREGATE_PAGE = 32124;
            public static final int RED_PACKET = 30305;
            public static final int RED_PACKET_RAIN_RULE_PAGE = 311;
            public static final int RED_PACKET_RAIN_SHARE_PAGE = 312;
            public static final int RED_PACK_ACTIVITY = 72;
            public static final int RED_PACK_DETAIL = 73;
            public static final int REMOVE_PUBLIC_GROUP_ADMINISTRATOR = 32104;
            public static final int REQUEST_UPDATE_USER_LIST = 186;
            public static final int RESET_PASSWORD_PAGE = 30245;
            public static final int REWARD_HISTORY = 67;
            public static final int SAME_FOLLOW_LIST = 30073;
            public static final int SAVE_TO_LOCAL_GUIDE = 30260;
            public static final int SCAN_QR_CODE_PAGE = 263;
            public static final int SCREEN_SHOT_PAGE = 267;
            public static final int SEARCH_CONTACTS_PAGE = 280;
            public static final int SEARCH_HISTORY_PAGE = 32095;
            public static final int SEARCH_PAGE = 210;
            public static final int SEARCH_RECOMMEND_HOT_TAG_PAGE = 32009;
            public static final int SEARCH_RECOMMEND_PAGE = 32007;
            public static final int SEARCH_RECOMMEND_PYMK_PAGE = 32008;
            public static final int SEARCH_SUGGESTION_PAGE = 32094;
            public static final int SEARCH_TAG = 25;
            public static final int SEARCH_TAG_GAME = 50009;
            public static final int SEARCH_TAG_LIVE = 50008;
            public static final int SEARCH_USER = 24;
            public static final int SELECT_A_GROUP = 30192;
            public static final int SELECT_FOLLOWER_SESSION = 30125;
            public static final int SELECT_FRIENDS = 74;
            public static final int SELECT_GROUP_NUMBERS = 30191;
            public static final int SELECT_KARAOKE = 112;
            public static final int SELECT_KARAOKE_CLASSIFY = 306;
            public static final int SEM_DOWN_PAGE = 30093;
            public static final int SEM_STATIC_PAGE = 30135;
            public static final int SEND_MESSAGE_TO_EXISTED_PAGE = 227;
            public static final int SETTINGS = 5;
            public static final int SETTINGS_LANGUAGE = 173;
            public static final int SET_FOLLOW_AUTO_RESPOND = 32023;
            public static final int SET_ICON_NAME_PAGE = 281;
            public static final int SET_NEW_PASSWORD_PAGE = 30199;
            public static final int SET_NEW_PASSWORD_PAGE_V2 = 32077;
            public static final int SET_PASSWORD = 32075;
            public static final int SET_PUBLIC_GROUP_ADMINISTRATOR = 32102;
            public static final int SET_PUBLIC_GROUP_JOIN_FILTER = 32122;
            public static final int SET_PUBLIC_GROUP_JOIN_MODE = 32105;
            public static final int SET_PUBLIC_GROUP_NOTICE = 32113;
            public static final int SF2018_ACTIVITY_END = 85;
            public static final int SF2018_EDIT_PREVIEW = 80;
            public static final int SF2018_PRODUCTION_PREVIEW = 81;
            public static final int SF2018_RECORD_CAMERA = 79;
            public static final int SHARE_COMMENT_PAGE = 30243;
            public static final int SHARE_ELECTRONICCOMMERCE_PAGE = 30006;
            public static final int SHARE_GROUP_PAGE = 254;
            public static final int SHARE_HELP_TO_TOP_H5 = 32146;
            public static final int SHARE_HELP_TO_TOP_PHONE_H5 = 32148;
            public static final int SHARE_LOVE_COUNTRY = 32142;
            public static final int SHARE_PAGE = 32086;
            public static final int SHARE_PEOPLE_EDIT_PAGE = 30027;
            public static final int SHARE_PEOPLE_LIST_PAGE = 30026;
            public static final int SHARE_PUBLIC_GROUP = 32045;
            public static final int SHARE_TOPIC_PAGE = 30032;
            public static final int SHARE_TO_MESSAGE = 30219;
            public static final int SHARE_USER_LIST = 182;
            public static final int SHARE_USER_LIST_FOLLOW_PAGE = 30029;
            public static final int SHARE_VIDEO_PLAY_PAGE = 30242;
            public static final int SHARE_VISIBLE_SCOPE = 297;
            public static final int SHOOT_TEMPLATE_LOAD_FAIL_PAGE = 32060;
            public static final int SHOW_CITY_SITE = 30030;
            public static final int SHOW_CLOSE_CAMERA_HINT_WHEN_FRAME_LOSS_IN_LIVE = 235;
            public static final int SHOW_CUSTOMER_SERVICE_ICON = 30295;
            public static final int SHOW_KWAI_MUSIC_STAION_ABNORMAL = 30038;
            public static final int SHOW_LIVE_PERMISSION = 305;
            public static final int SHOW_MERCHANT_ITEM_DETAIL_ERROR = 30276;
            public static final int SHOW_PAGE_GAMELIVE_GAMEPAGE = 30194;
            public static final int SHOW_PAGE_GAMELIVE_GAME_CATEROGY = 30195;
            public static final int SHOW_PAGE_GAMELIVE_HERO_CHOOSE = 30197;
            public static final int SHOW_PAGE_GAMELIVE_HOMEPAGE = 30193;
            public static final int SHOW_PAGE_GAMELIVE_INFORMATION = 30196;
            public static final int SHOW_PAGE_LIVE_BGM_IMPORT_PANEL = 30172;
            public static final int SHOW_PAGE_LIVE_BGM_IMPORT_SUCCESS = 30173;
            public static final int SHOW_PAGE_LIVE_BGM_LIKE_PANEL = 30171;
            public static final int SHOW_PAGE_LIVE_BGM_PANEL = 30170;
            public static final int SIGNUP = 30;
            public static final int SIGNUP_DIALOG = 35;
            public static final int SIGNUP_LOGIN_DONE = 36;
            public static final int SIGNUP_PHONE = 31;
            public static final int SIGNUP_PYMK_FRIENDS_AUTHORIZATION = 115;
            public static final int SIGNUP_VERIFICATION = 32;
            public static final int SILENT_USER_H5 = 30363;
            public static final int SILENT_USER_POPUP = 30385;
            public static final int SINGLE_FEED_DETAIL = 286;
            public static final int SINGLE_FEED_OPERATION_TAB = 285;
            public static final int SITE_LOGIN_PAGE = 30121;
            public static final int SOCIAL_GAME_FAIL_H5 = 32112;
            public static final int SOCIAL_GAME_HOME_H5 = 32106;
            public static final int SOCIAL_GAME_OFFSITE_H5 = 32107;
            public static final int SOCIAL_GAME_TASK_H5 = 32051;
            public static final int SONG_LIST = 52;
            public static final int SONG_RANK_LIST = 140;
            public static final int SPLASH_PAGE = 32143;
            public static final int SPRFES_MAIN_H5 = 30084;
            public static final int SPRINGFESTIVAL_REDENVELOPE_COLLECT = 30068;
            public static final int SPRING_INVITATION_PAGE = 30080;
            public static final int STATUS_DETAIL = 295;
            public static final int STATUS_LIST = 296;
            public static final int STATUS_TEMPLATE = 30111;
            public static final int STATUS_TEMPLATE_EDIT = 30112;
            public static final int STATUS_TEMPLATE_IMPORT = 30160;
            public static final int STATUS_TEMPLATE_TEXT_EDIT = 30113;
            public static final int STICKER_PACKAGE_PAGE = 288;
            public static final int STICKER_PAGE = 289;
            public static final int STICKER_SEARCH = 30395;
            public static final int STICKER_TEXT_PREVIEW_PAGE = 30396;
            public static final int STORAGE_ALLOWANCE_POPUP = 30252;
            public static final int STORY_CLIPPING = 321;
            public static final int STORY_DETAIL = 30091;
            public static final int STORY_EDIT = 30092;
            public static final int STORY_EDIT_PREVIEW = 322;
            public static final int STORY_ENTRENCE_PAGE = 32002;
            public static final int STORY_HISTORY = 30198;
            public static final int STORY_MIDDLE_PAGE = 32015;
            public static final int STORY_PURE_TEXT_EDIT_PAGE = 32003;
            public static final int STORY_RECORD = 320;
            public static final int SUGGESTION_PAGE = 32092;
            public static final int SUMMARY_TAG_PAGE = 325;
            public static final int SWITCH_OR_ADD_ACCOUNT = 30151;
            public static final int TAB_NOTIFICATION_MASSAGE = 30115;
            public static final int TAB_POST_MASSAGE = 30114;
            public static final int TAG = 27;
            public static final int TAG_CAPTION_EDIT_PAGE = 256;
            public static final int TEMPLATE_TEXT_EDIT = 30128;
            public static final int TEXT_TIMELINE = 30265;
            public static final int THANOS_FIND = 30168;
            public static final int THANOS_HOT = 30169;
            public static final int THANOS_LIVE_SQUARE_AGGREGATE_PAGE = 32151;
            public static final int THEME_SWITCH = 315;
            public static final int THIRD_PARTY_ASK_KS_AUTHORIZATION = 32134;
            public static final int THIRD_PARTY_AUTHORIZATION = 34;
            public static final int THIRD_PARTY_SHARE = 38;
            public static final int TOPICCIRCLE = 30328;
            public static final int TOPICCIRCLE_SQUAREDANCE = 30329;
            public static final int TOP_PHOTOS = 32010;
            public static final int TOP_USER = 49;
            public static final int TRENDING_PAGE = 32093;
            public static final int TUBE = 317;
            public static final int TUBE_BILLBOARD = 30211;
            public static final int TUBE_CHANNEL_PAGE = 30303;
            public static final int TUBE_DETAIL = 319;
            public static final int TUBE_DETAIL_RECO = 30326;
            public static final int TUBE_PHOTOS_ALBUM = 30221;
            public static final int TUBE_SEARCH_PAGE = 30283;
            public static final int TUBE_SUBSCRIBES = 318;
            public static final int UGC_USER_LIST = 183;
            public static final int UNBIND_MOBILE_ACTIVE_PAGE = 32161;
            public static final int UNFOLLOW_RECOMMENDATIONS = 30077;
            public static final int UNIFIED_SIGNUP_LOGIN = 32067;
            public static final int UNKNOWN2 = 0;
            public static final int UPGRADE_WINDOW = 21;
            public static final int USER_TAG_SEARCH = 145;
            public static final int USER_TAG_SEARCH_LV2 = 32115;
            public static final int VERIFY_CODE_RESET_PASSWORD = 30244;
            public static final int VERIFY_ID_CARD = 30134;
            public static final int VERTICAL_CHANNEL_PAGE = 30118;
            public static final int VIDEO_ATLAS_EDIT = 63;
            public static final int VIDEO_COVER_PICKING = 133;
            public static final int VIDEO_EDIT = 259;
            public static final int VIDEO_EDIT_PAGE = 30397;
            public static final int VIDEO_PLAY_DETAIL = 30180;
            public static final int VIDEO_POST = 43;
            public static final int VISITED_FOLLOWING_PAGE = 30143;
            public static final int VOICE_PARTY_AGGREGATION_KTV = 30215;
            public static final int VOICE_PARTY_AGGREGATION_NEARBY = 30214;
            public static final int VOICE_PARTY_AGGREGATION_TOPIC = 30216;
            public static final int VOICE_PARTY_RECOMMEND = 30200;
            public static final int WATCH_VIDEO_ACTIVITE_PAGE = 32025;
            public static final int WATCH_VIDEO_ACTIVITE_REWARD_PAGE = 32026;
            public static final int WATERMARK_SETTING = 44;
            public static final int WEB_SEARCH_MORE_PUBLIC_GROUP_RESULT = 32064;
            public static final int WEB_VIDEO_UPLODA = 30110;
            public static final int WEEKLY_REPORT_FANS_GROWTH = 30013;
            public static final int WEEKLY_REPORT_INTERACTIVE_RANKING = 30012;
            public static final int WEEKLY_REPORT_LIVE_NEW_FEATURE = 30015;
            public static final int WEEKLY_REPORT_LIVE_NEW_STAR = 30016;
            public static final int WEEKLY_REPORT_LIVE_TIME_LENGTH = 30010;
            public static final int WEEKLY_REPORT_RECEIVE_INTERACTION = 30011;
            public static final int WEEKLY_REPORT_THANK_FANS = 30014;
            public static final int WEEKLY_REPORT_WATCH_AMOUNT = 30009;
            public static final int WISH_EDIT_PAGE = 240;
            public static final int WISH_LIST_PAGE = 241;
            public static final int WITHDAW_REWARD_PAGE = 32027;
            public static final int WITHDRAW = 9;
            public static final int WITHDRAW_RECORD = 83;
            public static final int WKAWARD_ATTENTION_PAGE = 30004;
            public static final int YD_BOOK_LIST = 30239;
            public static final int YD_CATEGORY_PAGE = 30232;
            public static final int YD_DETAILS_PAGE = 30234;
            public static final int YD_LEADERBOARD = 30238;
            public static final int YD_LIKE_PAGE = 30233;
            public static final int YD_READING_HISTORY = 30237;
            public static final int YD_READING_PAGE = 30236;
            public static final int YD_RECOMMEND_PAGE = 30231;
            public static final int YD_SEARCH_PAGE = 30235;
            public static final int ZHONGQIU_ACTIVITY = 30327;
        }

        @Retention(RetentionPolicy.SOURCE)
        /* compiled from: kSourceFile */
        public @interface PageType {
            public static final int H5 = 2;
            public static final int MINA = 3;
            public static final int NATIVE = 1;
            public static final int UNKNOWN_PAGE_TYPE = 0;
        }

        @Retention(RetentionPolicy.SOURCE)
        /* compiled from: kSourceFile */
        public @interface SubPage {
            public static final int PROFILE_COLLECTION = 5;
            public static final int PROFILE_MY_LIKE = 4;
            public static final int PROFILE_PRIVATE_PHOTO = 2;
            public static final int PROFILE_PUBLIC_PHOTO = 1;
            public static final int PROFILE_PYMK = 6;
            public static final int PROFILE_SHUOSHUO = 3;
            public static final int UNKNOWN3 = 0;
        }

        public UrlPackage() {
            clear();
        }

        public static UrlPackage[] emptyArray() {
            if (_emptyArray == null) {
                synchronized (InternalNano.LAZY_INIT_LOCK) {
                    if (_emptyArray == null) {
                        _emptyArray = new UrlPackage[0];
                    }
                }
            }
            return _emptyArray;
        }

        public UrlPackage clear() {
            this.category = 0;
            this.page = 0;
            this.subPages = "";
            this.params = "";
            this.identity = "";
            this.pageSeq = 0;
            this.entryPageId = "";
            this.entryPageSource = "";
            this.expTagList = null;
            this.pageType = 0;
            this.page2 = "";
            this.topPage = "";
            this.userRouteTrace = "";
            return this;
        }

    }
}
