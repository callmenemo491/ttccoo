package p074e9;

/* renamed from: e9.a */
/* loaded from: classes.dex */
public class C1805a {
    /* renamed from: A */
    public static <T> java.lang.Class<T> m4513A(java.lang.Class<T> r1) {
            java.lang.Class r0 = java.lang.Integer.TYPE
            if (r1 != r0) goto L7
            java.lang.Class<java.lang.Integer> r1 = java.lang.Integer.class
            return r1
        L7:
            java.lang.Class r0 = java.lang.Float.TYPE
            if (r1 != r0) goto Le
            java.lang.Class<java.lang.Float> r1 = java.lang.Float.class
            return r1
        Le:
            java.lang.Class r0 = java.lang.Byte.TYPE
            if (r1 != r0) goto L15
            java.lang.Class<java.lang.Byte> r1 = java.lang.Byte.class
            return r1
        L15:
            java.lang.Class r0 = java.lang.Double.TYPE
            if (r1 != r0) goto L1c
            java.lang.Class<java.lang.Double> r1 = java.lang.Double.class
            return r1
        L1c:
            java.lang.Class r0 = java.lang.Long.TYPE
            if (r1 != r0) goto L23
            java.lang.Class<java.lang.Long> r1 = java.lang.Long.class
            return r1
        L23:
            java.lang.Class r0 = java.lang.Character.TYPE
            if (r1 != r0) goto L2a
            java.lang.Class<java.lang.Character> r1 = java.lang.Character.class
            return r1
        L2a:
            java.lang.Class r0 = java.lang.Boolean.TYPE
            if (r1 != r0) goto L31
            java.lang.Class<java.lang.Boolean> r1 = java.lang.Boolean.class
            return r1
        L31:
            java.lang.Class r0 = java.lang.Short.TYPE
            if (r1 != r0) goto L38
            java.lang.Class<java.lang.Short> r1 = java.lang.Short.class
            return r1
        L38:
            java.lang.Class r0 = java.lang.Void.TYPE
            if (r1 != r0) goto L3e
            java.lang.Class<java.lang.Void> r1 = java.lang.Void.class
        L3e:
            return r1
    }

    /* renamed from: B */
    public static com.google.android.gms.common.api.Status m4514B(java.lang.String r4) {
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            r1 = 0
            if (r0 != 0) goto L4b
            r0 = 2
            java.lang.String r2 = ":"
            java.lang.String[] r4 = r4.split(r2, r0)
            r0 = 0
            r2 = r4[r0]
            java.lang.String r2 = r2.trim()
            r4[r0] = r2
            int r2 = r4.length
            r3 = 1
            if (r2 <= r3) goto L25
            r2 = r4[r3]
            if (r2 == 0) goto L25
            java.lang.String r2 = r2.trim()
            r4[r3] = r2
        L25:
            java.util.List r4 = java.util.Arrays.asList(r4)
            int r2 = r4.size()
            if (r2 <= r3) goto L40
            java.lang.Object r0 = r4.get(r0)
            java.lang.String r0 = (java.lang.String) r0
            java.lang.Object r4 = r4.get(r3)
            java.lang.String r4 = (java.lang.String) r4
            com.google.android.gms.common.api.Status r4 = m4515C(r0, r4)
            return r4
        L40:
            java.lang.Object r4 = r4.get(r0)
            java.lang.String r4 = (java.lang.String) r4
            com.google.android.gms.common.api.Status r4 = m4515C(r4, r1)
            return r4
        L4b:
            com.google.android.gms.common.api.Status r4 = new com.google.android.gms.common.api.Status
            r0 = 17499(0x445b, float:2.4521E-41)
            r4.<init>(r0, r1)
            return r4
    }

    /* renamed from: C */
    public static com.google.android.gms.common.api.Status m4515C(java.lang.String r5, java.lang.String r6) {
            int r0 = r5.hashCode()
            switch(r0) {
                case -2130504259: goto L31d;
                case -2065866930: goto L312;
                case -2014808264: goto L307;
                case -2005236790: goto L2fc;
                case -2001169389: goto L2f2;
                case -1944433728: goto L2e7;
                case -1800638118: goto L2dc;
                case -1774756919: goto L2d1;
                case -1587614300: goto L2c6;
                case -1583894766: goto L2ba;
                case -1458751677: goto L2ae;
                case -1421414571: goto L2a2;
                case -1345867105: goto L296;
                case -1340100504: goto L28a;
                case -1232010689: goto L27e;
                case -1202691903: goto L272;
                case -1112393964: goto L267;
                case -1063710844: goto L25b;
                case -974503964: goto L24f;
                case -863830559: goto L243;
                case -828507413: goto L238;
                case -749743758: goto L22c;
                case -736207500: goto L220;
                case -646022241: goto L214;
                case -595928767: goto L208;
                case -333672188: goto L1fc;
                case -294485423: goto L1f0;
                case -217128228: goto L1e4;
                case -122667194: goto L1d8;
                case -75433118: goto L1cc;
                case -40686718: goto L1c0;
                case 15352275: goto L1b4;
                case 210308040: goto L1a8;
                case 269327773: goto L19c;
                case 278802867: goto L190;
                case 408411681: goto L184;
                case 423563023: goto L178;
                case 483847807: goto L16c;
                case 491979549: goto L160;
                case 492072102: goto L154;
                case 542728406: goto L148;
                case 582457886: goto L13c;
                case 605031096: goto L130;
                case 745638750: goto L124;
                case 786916712: goto L118;
                case 799258561: goto L10c;
                case 819646646: goto L101;
                case 844240628: goto Lf5;
                case 886186878: goto Le9;
                case 895302372: goto Ldd;
                case 922685102: goto Ld1;
                case 989000548: goto Lc5;
                case 1034932393: goto Lba;
                case 1072360691: goto Laf;
                case 1094975491: goto La3;
                case 1107081238: goto L97;
                case 1141576252: goto L8b;
                case 1199811910: goto L7f;
                case 1226505451: goto L73;
                case 1388786705: goto L68;
                case 1433767024: goto L5d;
                case 1442968770: goto L51;
                case 1494923453: goto L45;
                case 1497901284: goto L39;
                case 1803454477: goto L2d;
                case 1898790704: goto L21;
                case 2063209097: goto L15;
                case 2082564316: goto L9;
                default: goto L7;
            }
        L7:
            goto L328
        L9:
            java.lang.String r0 = "UNSUPPORTED_TENANT_OPERATION"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L328
            r0 = 49
            goto L329
        L15:
            java.lang.String r0 = "EMAIL_CHANGE_NEEDS_VERIFICATION"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L328
            r0 = 63
            goto L329
        L21:
            java.lang.String r0 = "MISSING_SESSION_INFO"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L328
            r0 = 35
            goto L329
        L2d:
            java.lang.String r0 = "MISSING_CONTINUE_URI"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L328
            r0 = 44
            goto L329
        L39:
            java.lang.String r0 = "TOO_MANY_ATTEMPTS_TRY_LATER"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L328
            r0 = 21
            goto L329
        L45:
            java.lang.String r0 = "INVALID_APP_CREDENTIAL"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L328
            r0 = 19
            goto L329
        L51:
            java.lang.String r0 = "INVALID_PHONE_NUMBER"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L328
            r0 = 32
            goto L329
        L5d:
            java.lang.String r0 = "USER_DISABLED"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L328
            r0 = 5
            goto L329
        L68:
            java.lang.String r0 = "INVALID_IDENTIFIER"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L328
            r0 = 6
            goto L329
        L73:
            java.lang.String r0 = "FEDERATED_USER_ID_ALREADY_LINKED"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L328
            r0 = 12
            goto L329
        L7f:
            java.lang.String r0 = "MISSING_CODE"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L328
            r0 = 33
            goto L329
        L8b:
            java.lang.String r0 = "SESSION_EXPIRED"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L328
            r0 = 38
            goto L329
        L97:
            java.lang.String r0 = "<<Network Error>>"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L328
            r0 = 15
            goto L329
        La3:
            java.lang.String r0 = "INVALID_PASSWORD"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L328
            r0 = 11
            goto L329
        Laf:
            java.lang.String r0 = "INVALID_CUSTOM_TOKEN"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L328
            r0 = 2
            goto L329
        Lba:
            java.lang.String r0 = "INVALID_PENDING_TOKEN"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L328
            r0 = 3
            goto L329
        Lc5:
            java.lang.String r0 = "RESET_PASSWORD_EXCEED_LIMIT"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L328
            r0 = 22
            goto L329
        Ld1:
            java.lang.String r0 = "INVALID_MESSAGE_PAYLOAD"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L328
            r0 = 26
            goto L329
        Ldd:
            java.lang.String r0 = "MISSING_CLIENT_IDENTIFIER"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L328
            r0 = 65
            goto L329
        Le9:
            java.lang.String r0 = "REQUIRES_SECOND_FACTOR_AUTH"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L328
            r0 = 53
            goto L329
        Lf5:
            java.lang.String r0 = "WEB_CONTEXT_CANCELED"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L328
            r0 = 48
            goto L329
        L101:
            java.lang.String r0 = "CREDENTIAL_MISMATCH"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L328
            r0 = 1
            goto L329
        L10c:
            java.lang.String r0 = "INVALID_PROVIDER_ID"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L328
            r0 = 46
            goto L329
        L118:
            java.lang.String r0 = "INVALID_VERIFICATION_PROOF"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L328
            r0 = 37
            goto L329
        L124:
            java.lang.String r0 = "INVALID_MFA_PENDING_CREDENTIAL"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L328
            r0 = 56
            goto L329
        L130:
            java.lang.String r0 = "REJECTED_CREDENTIAL"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L328
            r0 = 52
            goto L329
        L13c:
            java.lang.String r0 = "UNVERIFIED_EMAIL"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L328
            r0 = 59
            goto L329
        L148:
            java.lang.String r0 = "PASSWORD_LOGIN_DISABLED"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L328
            r0 = 18
            goto L329
        L154:
            java.lang.String r0 = "WEB_STORAGE_UNSUPPORTED"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L328
            r0 = 43
            goto L329
        L160:
            java.lang.String r0 = "INVALID_ID_TOKEN"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L328
            r0 = 13
            goto L329
        L16c:
            java.lang.String r0 = "EMAIL_EXISTS"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L328
            r0 = 10
            goto L329
        L178:
            java.lang.String r0 = "MISSING_MFA_PENDING_CREDENTIAL"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L328
            r0 = 54
            goto L329
        L184:
            java.lang.String r0 = "INVALID_DYNAMIC_LINK_DOMAIN"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L328
            r0 = 51
            goto L329
        L190:
            java.lang.String r0 = "MISSING_PHONE_NUMBER"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L328
            r0 = 31
            goto L329
        L19c:
            java.lang.String r0 = "INVALID_SENDER"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L328
            r0 = 27
            goto L329
        L1a8:
            java.lang.String r0 = "UNSUPPORTED_FIRST_FACTOR"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L328
            r0 = 62
            goto L329
        L1b4:
            java.lang.String r0 = "EMAIL_NOT_FOUND"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L328
            r0 = 8
            goto L329
        L1c0:
            java.lang.String r0 = "WEAK_PASSWORD"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L328
            r0 = 16
            goto L329
        L1cc:
            java.lang.String r0 = "USER_NOT_FOUND"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L328
            r0 = 9
            goto L329
        L1d8:
            java.lang.String r0 = "MISSING_MFA_ENROLLMENT_ID"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L328
            r0 = 55
            goto L329
        L1e4:
            java.lang.String r0 = "SECOND_FACTOR_LIMIT_EXCEEDED"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L328
            r0 = 61
            goto L329
        L1f0:
            java.lang.String r0 = "WEB_INTERNAL_ERROR"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L328
            r0 = 42
            goto L329
        L1fc:
            java.lang.String r0 = "OPERATION_NOT_ALLOWED"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L328
            r0 = 17
            goto L329
        L208:
            java.lang.String r0 = "TIMEOUT"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L328
            r0 = 14
            goto L329
        L214:
            java.lang.String r0 = "CREDENTIAL_TOO_OLD_LOGIN_AGAIN"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L328
            r0 = 20
            goto L329
        L220:
            java.lang.String r0 = "MISSING_PASSWORD"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L328
            r0 = 30
            goto L329
        L22c:
            java.lang.String r0 = "MFA_ENROLLMENT_NOT_FOUND"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L328
            r0 = 57
            goto L329
        L238:
            java.lang.String r0 = "NO_SUCH_PROVIDER"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L328
            r0 = 0
            goto L329
        L243:
            java.lang.String r0 = "INVALID_CERT_HASH"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L328
            r0 = 40
            goto L329
        L24f:
            java.lang.String r0 = "MISSING_OR_INVALID_NONCE"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L328
            r0 = 66
            goto L329
        L25b:
            java.lang.String r0 = "ADMIN_ONLY_OPERATION"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L328
            r0 = 58
            goto L329
        L267:
            java.lang.String r0 = "INVALID_EMAIL"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L328
            r0 = 7
            goto L329
        L272:
            java.lang.String r0 = "SECOND_FACTOR_EXISTS"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L328
            r0 = 60
            goto L329
        L27e:
            java.lang.String r0 = "INVALID_SESSION_INFO"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L328
            r0 = 36
            goto L329
        L28a:
            java.lang.String r0 = "INVALID_TENANT_ID"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L328
            r0 = 50
            goto L329
        L296:
            java.lang.String r0 = "TOKEN_EXPIRED"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L328
            r0 = 23
            goto L329
        L2a2:
            java.lang.String r0 = "INVALID_CODE"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L328
            r0 = 34
            goto L329
        L2ae:
            java.lang.String r0 = "MISSING_EMAIL"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L328
            r0 = 29
            goto L329
        L2ba:
            java.lang.String r0 = "INVALID_OOB_CODE"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L328
            r0 = 24
            goto L329
        L2c6:
            java.lang.String r0 = "EXPIRED_OOB_CODE"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L328
            r0 = 25
            goto L329
        L2d1:
            java.lang.String r0 = "WEB_NETWORK_REQUEST_FAILED"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L328
            r0 = 41
            goto L329
        L2dc:
            java.lang.String r0 = "QUOTA_EXCEEDED"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L328
            r0 = 39
            goto L329
        L2e7:
            java.lang.String r0 = "DYNAMIC_LINK_NOT_ACTIVATED"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L328
            r0 = 45
            goto L329
        L2f2:
            java.lang.String r0 = "INVALID_IDP_RESPONSE"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L328
            r0 = 4
            goto L329
        L2fc:
            java.lang.String r0 = "INTERNAL_SUCCESS_SIGN_OUT"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L328
            r0 = 64
            goto L329
        L307:
            java.lang.String r0 = "WEB_CONTEXT_ALREADY_PRESENTED"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L328
            r0 = 47
            goto L329
        L312:
            java.lang.String r0 = "INVALID_RECIPIENT_EMAIL"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L328
            r0 = 28
            goto L329
        L31d:
            java.lang.String r0 = "USER_CANCELLED"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L328
            r0 = 67
            goto L329
        L328:
            r0 = -1
        L329:
            r1 = 17499(0x445b, float:2.4521E-41)
            switch(r0) {
                case 0: goto L40d;
                case 1: goto L40a;
                case 2: goto L407;
                case 3: goto L404;
                case 4: goto L404;
                case 5: goto L401;
                case 6: goto L3fe;
                case 7: goto L3fe;
                case 8: goto L3fb;
                case 9: goto L3fb;
                case 10: goto L3f8;
                case 11: goto L3f5;
                case 12: goto L3f2;
                case 13: goto L3ef;
                case 14: goto L3ec;
                case 15: goto L3ec;
                case 16: goto L3e9;
                case 17: goto L3e6;
                case 18: goto L3e6;
                case 19: goto L3e3;
                case 20: goto L3e0;
                case 21: goto L3dd;
                case 22: goto L3dd;
                case 23: goto L3da;
                case 24: goto L3d7;
                case 25: goto L3d4;
                case 26: goto L3d1;
                case 27: goto L3ce;
                case 28: goto L3cb;
                case 29: goto L3c8;
                case 30: goto L3c5;
                case 31: goto L3c2;
                case 32: goto L3be;
                case 33: goto L3ba;
                case 34: goto L3b6;
                case 35: goto L3b2;
                case 36: goto L3ae;
                case 37: goto L3aa;
                case 38: goto L3a6;
                case 39: goto L3a2;
                case 40: goto L39e;
                case 41: goto L39a;
                case 42: goto L396;
                case 43: goto L392;
                case 44: goto L38e;
                case 45: goto L38a;
                case 46: goto L386;
                case 47: goto L382;
                case 48: goto L37e;
                case 49: goto L37a;
                case 50: goto L376;
                case 51: goto L372;
                case 52: goto L36e;
                case 53: goto L36a;
                case 54: goto L366;
                case 55: goto L362;
                case 56: goto L35e;
                case 57: goto L35a;
                case 58: goto L356;
                case 59: goto L352;
                case 60: goto L34e;
                case 61: goto L34a;
                case 62: goto L346;
                case 63: goto L342;
                case 64: goto L33e;
                case 65: goto L33a;
                case 66: goto L336;
                case 67: goto L332;
                default: goto L32e;
            }
        L32e:
            r0 = 17499(0x445b, float:2.4521E-41)
            goto L40f
        L332:
            r0 = 18001(0x4651, float:2.5225E-41)
            goto L40f
        L336:
            r0 = 17094(0x42c6, float:2.3954E-41)
            goto L40f
        L33a:
            r0 = 17093(0x42c5, float:2.3952E-41)
            goto L40f
        L33e:
            r0 = 17091(0x42c3, float:2.395E-41)
            goto L40f
        L342:
            r0 = 17090(0x42c2, float:2.3948E-41)
            goto L40f
        L346:
            r0 = 17089(0x42c1, float:2.3947E-41)
            goto L40f
        L34a:
            r0 = 17088(0x42c0, float:2.3945E-41)
            goto L40f
        L34e:
            r0 = 17087(0x42bf, float:2.3944E-41)
            goto L40f
        L352:
            r0 = 17086(0x42be, float:2.3943E-41)
            goto L40f
        L356:
            r0 = 17085(0x42bd, float:2.3941E-41)
            goto L40f
        L35a:
            r0 = 17084(0x42bc, float:2.394E-41)
            goto L40f
        L35e:
            r0 = 17083(0x42bb, float:2.3938E-41)
            goto L40f
        L362:
            r0 = 17082(0x42ba, float:2.3937E-41)
            goto L40f
        L366:
            r0 = 17081(0x42b9, float:2.3936E-41)
            goto L40f
        L36a:
            r0 = 17078(0x42b6, float:2.3931E-41)
            goto L40f
        L36e:
            r0 = 17075(0x42b3, float:2.3927E-41)
            goto L40f
        L372:
            r0 = 17074(0x42b2, float:2.3926E-41)
            goto L40f
        L376:
            r0 = 17079(0x42b7, float:2.3933E-41)
            goto L40f
        L37a:
            r0 = 17073(0x42b1, float:2.3924E-41)
            goto L40f
        L37e:
            r0 = 17058(0x42a2, float:2.3903E-41)
            goto L40f
        L382:
            r0 = 17057(0x42a1, float:2.3902E-41)
            goto L40f
        L386:
            r0 = 17071(0x42af, float:2.3922E-41)
            goto L40f
        L38a:
            r0 = 17068(0x42ac, float:2.3917E-41)
            goto L40f
        L38e:
            r0 = 17040(0x4290, float:2.3878E-41)
            goto L40f
        L392:
            r0 = 17065(0x42a9, float:2.3913E-41)
            goto L40f
        L396:
            r0 = 17062(0x42a6, float:2.3909E-41)
            goto L40f
        L39a:
            r0 = 17061(0x42a5, float:2.3908E-41)
            goto L40f
        L39e:
            r0 = 17064(0x42a8, float:2.3912E-41)
            goto L40f
        L3a2:
            r0 = 17052(0x429c, float:2.3895E-41)
            goto L40f
        L3a6:
            r0 = 17051(0x429b, float:2.3894E-41)
            goto L40f
        L3aa:
            r0 = 17049(0x4299, float:2.3891E-41)
            goto L40f
        L3ae:
            r0 = 17046(0x4296, float:2.3887E-41)
            goto L40f
        L3b2:
            r0 = 17045(0x4295, float:2.3885E-41)
            goto L40f
        L3b6:
            r0 = 17044(0x4294, float:2.3884E-41)
            goto L40f
        L3ba:
            r0 = 17043(0x4293, float:2.3882E-41)
            goto L40f
        L3be:
            r0 = 17042(0x4292, float:2.3881E-41)
            goto L40f
        L3c2:
            r0 = 17041(0x4291, float:2.388E-41)
            goto L40f
        L3c5:
            r0 = 17035(0x428b, float:2.3871E-41)
            goto L40f
        L3c8:
            r0 = 17034(0x428a, float:2.387E-41)
            goto L40f
        L3cb:
            r0 = 17033(0x4289, float:2.3868E-41)
            goto L40f
        L3ce:
            r0 = 17032(0x4288, float:2.3867E-41)
            goto L40f
        L3d1:
            r0 = 17031(0x4287, float:2.3866E-41)
            goto L40f
        L3d4:
            r0 = 17029(0x4285, float:2.3863E-41)
            goto L40f
        L3d7:
            r0 = 17030(0x4286, float:2.3864E-41)
            goto L40f
        L3da:
            r0 = 17021(0x427d, float:2.3852E-41)
            goto L40f
        L3dd:
            r0 = 17010(0x4272, float:2.3836E-41)
            goto L40f
        L3e0:
            r0 = 17014(0x4276, float:2.3842E-41)
            goto L40f
        L3e3:
            r0 = 17028(0x4284, float:2.3861E-41)
            goto L40f
        L3e6:
            r0 = 17006(0x426e, float:2.383E-41)
            goto L40f
        L3e9:
            r0 = 17026(0x4282, float:2.3859E-41)
            goto L40f
        L3ec:
            r0 = 17020(0x427c, float:2.385E-41)
            goto L40f
        L3ef:
            r0 = 17017(0x4279, float:2.3846E-41)
            goto L40f
        L3f2:
            r0 = 17025(0x4281, float:2.3857E-41)
            goto L40f
        L3f5:
            r0 = 17009(0x4271, float:2.3835E-41)
            goto L40f
        L3f8:
            r0 = 17007(0x426f, float:2.3832E-41)
            goto L40f
        L3fb:
            r0 = 17011(0x4273, float:2.3837E-41)
            goto L40f
        L3fe:
            r0 = 17008(0x4270, float:2.3833E-41)
            goto L40f
        L401:
            r0 = 17005(0x426d, float:2.3829E-41)
            goto L40f
        L404:
            r0 = 17004(0x426c, float:2.3828E-41)
            goto L40f
        L407:
            r0 = 17000(0x4268, float:2.3822E-41)
            goto L40f
        L40a:
            r0 = 17002(0x426a, float:2.3825E-41)
            goto L40f
        L40d:
            r0 = 17016(0x4278, float:2.3844E-41)
        L40f:
            if (r0 != r1) goto L435
            if (r6 == 0) goto L42f
            com.google.android.gms.common.api.Status r0 = new com.google.android.gms.common.api.Status
            int r2 = r5.length()
            int r3 = r6.length()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            int r2 = r2 + 1
            int r2 = r2 + r3
            r4.<init>(r2)
            java.lang.String r2 = ":"
            java.lang.String r5 = p083f.C1932s.m4774a(r4, r5, r2, r6)
            r0.<init>(r1, r5)
            return r0
        L42f:
            com.google.android.gms.common.api.Status r6 = new com.google.android.gms.common.api.Status
            r6.<init>(r1, r5)
            return r6
        L435:
            com.google.android.gms.common.api.Status r5 = new com.google.android.gms.common.api.Status
            r5.<init>(r0, r6)
            return r5
    }

    /* renamed from: a */
    public static final <T> java.lang.Object m4516a(java.util.Collection<? extends p379vh.InterfaceC6698f0<? extends T>> r6, p101fh.InterfaceC2172d<? super java.util.List<? extends T>> r7) {
            boolean r0 = r6.isEmpty()
            if (r0 == 0) goto L9
            dh.k r6 = p062dh.C1475k.f7237Y
            return r6
        L9:
            vh.c r0 = new vh.c
            r1 = 0
            vh.f0[] r2 = new p379vh.InterfaceC6698f0[r1]
            java.lang.Object[] r6 = r6.toArray(r2)
            java.lang.String r2 = "null cannot be cast to non-null type kotlin.Array<T>"
            java.util.Objects.requireNonNull(r6, r2)
            vh.f0[] r6 = (p379vh.InterfaceC6698f0[]) r6
            r0.<init>(r6)
            vh.i r2 = new vh.i
            fh.d r7 = gh.C2390b.m6127q(r7)
            r3 = 1
            r2.<init>(r7, r3)
            r2.m13634x()
            int r6 = r6.length
            vh.c$a[] r7 = new p379vh.C6688c.a[r6]
            r3 = 0
        L2d:
            if (r3 >= r6) goto L46
            kotlinx.coroutines.Deferred<T>[] r4 = r0.f25960a
            r4 = r4[r3]
            r4.start()
            vh.c$a r5 = new vh.c$a
            r5.<init>(r0, r2)
            vh.m0 r4 = r4.mo13555n(r5)
            r5.f25962d0 = r4
            r7[r3] = r5
            int r3 = r3 + 1
            goto L2d
        L46:
            vh.c$b r3 = new vh.c$b
            r3.<init>(r0, r7)
        L4b:
            if (r1 >= r6) goto L55
            r0 = r7[r1]
            r0.m13558s(r3)
            int r1 = r1 + 1
            goto L4b
        L55:
            boolean r6 = r2.m13636z()
            if (r6 == 0) goto L5f
            r3.m13560c()
            goto L62
        L5f:
            r2.mo13609d(r3)
        L62:
            java.lang.Object r6 = r2.m13633w()
            return r6
    }

    /* renamed from: b */
    public static final java.lang.Integer m4517b(int r1) {
            java.lang.Integer r0 = new java.lang.Integer
            r0.<init>(r1)
            return r0
    }

    /* renamed from: c */
    public static byte[] m4518c(byte[] r2) {
            int r0 = r2.length
            r1 = 16
            if (r0 >= r1) goto Lf
            byte[] r0 = java.util.Arrays.copyOf(r2, r1)
            int r2 = r2.length
            r1 = -128(0xffffffffffffff80, float:NaN)
            r0[r2] = r1
            return r0
        Lf:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "x must be smaller than a block."
            r2.<init>(r0)
            throw r2
    }

    /* renamed from: d */
    public static byte[] m4519d(byte[]... r7) {
            int r0 = r7.length
            r1 = 0
            r2 = 0
            r3 = 0
        L4:
            if (r2 >= r0) goto Ld
            r4 = r7[r2]
            int r4 = r4.length
            int r3 = r3 + r4
            int r2 = r2 + 1
            goto L4
        Ld:
            byte[] r0 = new byte[r3]
            int r2 = r7.length
            r3 = 0
            r4 = 0
        L12:
            if (r3 >= r2) goto L1f
            r5 = r7[r3]
            int r6 = r5.length
            java.lang.System.arraycopy(r5, r1, r0, r4, r6)
            int r5 = r5.length
            int r4 = r4 + r5
            int r3 = r3 + 1
            goto L12
        L1f:
            return r0
    }

    /* renamed from: e */
    public static final java.lang.Object m4520e(java.lang.Throwable r1) {
            java.lang.String r0 = "exception"
            p214m2.C4339q.m9706k(r1, r0)
            ch.f$a r0 = new ch.f$a
            r0.<init>(r1)
            return r0
    }

    /* renamed from: f */
    public static byte[] m4521f(byte[] r6) {
            int r0 = r6.length
            r1 = 16
            if (r0 != r1) goto L38
            byte[] r0 = new byte[r1]
            r2 = 0
            r3 = 0
        L9:
            r4 = 15
            if (r3 >= r1) goto L2a
            r5 = r6[r3]
            int r5 = r5 << 1
            r5 = r5 & 254(0xfe, float:3.56E-43)
            byte r5 = (byte) r5
            r0[r3] = r5
            if (r3 >= r4) goto L27
            r4 = r0[r3]
            int r5 = r3 + 1
            r5 = r6[r5]
            int r5 = r5 >> 7
            r5 = r5 & 1
            byte r5 = (byte) r5
            r4 = r4 | r5
            byte r4 = (byte) r4
            r0[r3] = r4
        L27:
            int r3 = r3 + 1
            goto L9
        L2a:
            r1 = r0[r4]
            r6 = r6[r2]
            int r6 = r6 >> 7
            r6 = r6 & 135(0x87, float:1.89E-43)
            byte r6 = (byte) r6
            r6 = r6 ^ r1
            byte r6 = (byte) r6
            r0[r4] = r6
            return r0
        L38:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "value must be a block."
            r6.<init>(r0)
            throw r6
    }

    /* renamed from: g */
    public static byte[] m4522g(java.lang.String r6) {
            int r0 = r6.length()
            int r0 = r0 % 2
            if (r0 != 0) goto L40
            int r0 = r6.length()
            int r0 = r0 / 2
            byte[] r1 = new byte[r0]
            r2 = 0
        L11:
            if (r2 >= r0) goto L3f
            int r3 = r2 * 2
            char r4 = r6.charAt(r3)
            r5 = 16
            int r4 = java.lang.Character.digit(r4, r5)
            int r3 = r3 + 1
            char r3 = r6.charAt(r3)
            int r3 = java.lang.Character.digit(r3, r5)
            r5 = -1
            if (r4 == r5) goto L37
            if (r3 == r5) goto L37
            int r4 = r4 * 16
            int r4 = r4 + r3
            byte r3 = (byte) r4
            r1[r2] = r3
            int r2 = r2 + 1
            goto L11
        L37:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "input is not hexadecimal"
            r6.<init>(r0)
            throw r6
        L3f:
            return r1
        L40:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Expected a string of even length"
            r6.<init>(r0)
            throw r6
    }

    /* renamed from: h */
    public static final java.lang.Object m4523h(long r3, p101fh.InterfaceC2172d<? super ch.C0985l> r5) {
            r0 = 0
            int r2 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r2 > 0) goto L9
            ch.l r3 = ch.C0985l.f5061a
            return r3
        L9:
            vh.i r0 = new vh.i
            fh.d r5 = gh.C2390b.m6127q(r5)
            r1 = 1
            r0.<init>(r5, r1)
            r0.m13634x()
            r1 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            int r5 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r5 >= 0) goto L38
            fh.g r5 = r0.f25998c0
            int r1 = p101fh.InterfaceC2173e.f9915a
            fh.e$a r1 = p101fh.InterfaceC2173e.a.f9916Y
            fh.g$a r5 = r5.get(r1)
            boolean r1 = r5 instanceof p379vh.InterfaceC6704h0
            if (r1 == 0) goto L30
            vh.h0 r5 = (p379vh.InterfaceC6704h0) r5
            goto L31
        L30:
            r5 = 0
        L31:
            if (r5 != 0) goto L35
            vh.h0 r5 = p379vh.C6695e0.f25971a
        L35:
            r5.mo13615b0(r3, r0)
        L38:
            java.lang.Object r3 = r0.m13633w()
            gh.a r4 = gh.EnumC2389a.f10764Y
            if (r3 != r4) goto L41
            return r3
        L41:
            ch.l r3 = ch.C0985l.f5061a
            return r3
    }

    /* renamed from: i */
    public static java.lang.String m4524i(byte[] r6) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            int r1 = r6.length
            int r1 = r1 * 2
            r0.<init>(r1)
            int r1 = r6.length
            r2 = 0
        La:
            if (r2 >= r1) goto L27
            r3 = r6[r2]
            r3 = r3 & 255(0xff, float:3.57E-43)
            int r4 = r3 / 16
            java.lang.String r5 = "0123456789abcdef"
            char r4 = r5.charAt(r4)
            r0.append(r4)
            int r3 = r3 % 16
            char r3 = r5.charAt(r3)
            r0.append(r3)
            int r2 = r2 + 1
            goto La
        L27:
            java.lang.String r6 = r0.toString()
            return r6
    }

    /* renamed from: j */
    public static final p127ha.C2995b m4525j(gb.C2313c r8, java.lang.String r9) {
            java.lang.String r0 = "$this$get"
            p214m2.C4339q.m9707l(r8, r0)
            hb.f r8 = r8.f10541g
            hb.c r0 = r8.f12112c
            hb.d r0 = p128hb.C3001f.m7374a(r0)
            r1 = 0
            if (r0 != 0) goto L11
            goto L18
        L11:
            org.json.JSONObject r0 = r0.f12101b     // Catch: org.json.JSONException -> L18
            java.lang.String r0 = r0.getString(r9)     // Catch: org.json.JSONException -> L18
            goto L19
        L18:
            r0 = r1
        L19:
            r2 = 2
            if (r0 == 0) goto L4f
            hb.c r1 = r8.f12112c
            hb.d r1 = p128hb.C3001f.m7374a(r1)
            if (r1 != 0) goto L25
            goto L46
        L25:
            java.util.Set<u6.b<java.lang.String, hb.d>> r3 = r8.f12110a
            monitor-enter(r3)
            java.util.Set<u6.b<java.lang.String, hb.d>> r4 = r8.f12110a     // Catch: java.lang.Throwable -> L4c
            java.util.Iterator r4 = r4.iterator()     // Catch: java.lang.Throwable -> L4c
        L2e:
            boolean r5 = r4.hasNext()     // Catch: java.lang.Throwable -> L4c
            if (r5 == 0) goto L45
            java.lang.Object r5 = r4.next()     // Catch: java.lang.Throwable -> L4c
            u6.b r5 = (p353u6.InterfaceC6339b) r5     // Catch: java.lang.Throwable -> L4c
            java.util.concurrent.Executor r6 = r8.f12111b     // Catch: java.lang.Throwable -> L4c
            f4.n0 r7 = new f4.n0     // Catch: java.lang.Throwable -> L4c
            r7.<init>(r5, r9, r1)     // Catch: java.lang.Throwable -> L4c
            r6.execute(r7)     // Catch: java.lang.Throwable -> L4c
            goto L2e
        L45:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L4c
        L46:
            ha.b r8 = new ha.b
            r8.<init>(r0, r2)
            goto L85
        L4c:
            r8 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L4c
            throw r8
        L4f:
            hb.c r8 = r8.f12113d
            hb.d r8 = p128hb.C3001f.m7374a(r8)
            if (r8 != 0) goto L58
            goto L60
        L58:
            org.json.JSONObject r8 = r8.f12101b     // Catch: org.json.JSONException -> L5f
            java.lang.String r1 = r8.getString(r9)     // Catch: org.json.JSONException -> L5f
            goto L60
        L5f:
        L60:
            r8 = 1
            if (r1 == 0) goto L6a
            ha.b r9 = new ha.b
            r9.<init>(r1, r8)
            r8 = r9
            goto L85
        L6a:
            java.lang.String r0 = "FirebaseRemoteConfigValue"
            java.lang.Object[] r1 = new java.lang.Object[r2]
            r2 = 0
            r1[r2] = r0
            r1[r8] = r9
            java.lang.String r8 = "No value of type '%s' exists for parameter key '%s'."
            java.lang.String r8 = java.lang.String.format(r8, r1)
            java.lang.String r9 = "FirebaseRemoteConfig"
            android.util.Log.w(r9, r8)
            ha.b r8 = new ha.b
            java.lang.String r9 = ""
            r8.<init>(r9, r2)
        L85:
            return r8
    }

    /* renamed from: k */
    public static final java.lang.String m4526k(java.lang.String r3) {
            if (r3 != 0) goto L4
            r3 = 0
            return r3
        L4:
            r0 = 0
            r1 = 2
            java.lang.String r2 = "http"
            boolean r0 = p362uh.C6463i.m13061R(r3, r2, r0, r1)
            if (r0 == 0) goto Lf
            return r3
        Lf:
            boolean r0 = p362uh.C6463i.m13054K(r3)
            if (r0 == 0) goto L18
            java.lang.String r3 = ""
            goto L1e
        L18:
            java.lang.String r0 = "https://cdn.tacocrypto.io/default/resize:fit:400:400:0/plain/"
            java.lang.String r3 = p064e.C1493g.m4049a(r0, r3)
        L1e:
            return r3
    }

    /* renamed from: l */
    public static final <T> int m4527l(java.util.List<? extends T> r0) {
            int r0 = r0.size()
            int r0 = r0 + (-1)
            return r0
    }

    /* renamed from: m */
    public static final <T> java.util.List<T> m4528m(T r1) {
            java.util.List r1 = java.util.Collections.singletonList(r1)
            java.lang.String r0 = "singletonList(element)"
            p214m2.C4339q.m9705j(r1, r0)
            return r1
    }

    /* renamed from: n */
    public static final <T> java.util.List<T> m4529n(T... r1) {
            java.lang.String r0 = "elements"
            p214m2.C4339q.m9706k(r1, r0)
            int r0 = r1.length
            if (r0 <= 0) goto Ld
            java.util.List r1 = p062dh.C1468d.m3982D(r1)
            goto Lf
        Ld:
            dh.k r1 = p062dh.C1475k.f7237Y
        Lf:
            return r1
    }

    /* renamed from: o */
    public static final <T> java.util.List<T> m4530o(T... r4) {
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            int r1 = r4.length
            r2 = 0
        L7:
            if (r2 >= r1) goto L13
            r3 = r4[r2]
            if (r3 == 0) goto L10
            r0.add(r3)
        L10:
            int r2 = r2 + 1
            goto L7
        L13:
            return r0
    }

    /* renamed from: p */
    public static final int m4531p(int r0, int r1) {
            int r0 = r0 % r1
            if (r0 < 0) goto L4
            goto L5
        L4:
            int r0 = r0 + r1
        L5:
            return r0
    }

    /* renamed from: q */
    public static final long m4532q(long r3, long r5) {
            long r3 = r3 % r5
            r0 = 0
            int r2 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r2 < 0) goto L8
            goto L9
        L8:
            long r3 = r3 + r5
        L9:
            return r3
    }

    /* renamed from: r */
    public static final <T> java.util.List<T> m4533r(T... r3) {
            java.lang.String r0 = "elements"
            p214m2.C4339q.m9706k(r3, r0)
            int r0 = r3.length
            if (r0 != 0) goto Le
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            goto L1a
        Le:
            java.util.ArrayList r0 = new java.util.ArrayList
            dh.c r1 = new dh.c
            r2 = 1
            r1.<init>(r3, r2)
            r0.<init>(r1)
            r3 = r0
        L1a:
            return r3
    }

    /* renamed from: s */
    public static final <T> java.util.List<T> m4534s(java.util.List<? extends T> r2) {
            int r0 = r2.size()
            if (r0 == 0) goto L14
            r1 = 1
            if (r0 == r1) goto La
            goto L16
        La:
            r0 = 0
            java.lang.Object r2 = r2.get(r0)
            java.util.List r2 = m4528m(r2)
            goto L16
        L14:
            dh.k r2 = p062dh.C1475k.f7237Y
        L16:
            return r2
    }

    /* renamed from: t */
    public static final long m4535t(java.lang.String r4, long r5, long r7, long r9) {
            java.lang.String r0 = m4536u(r4)
            if (r0 != 0) goto L7
            goto L22
        L7:
            java.lang.Long r5 = p362uh.C6462h.m13050G(r0)
            r6 = 39
            java.lang.String r1 = "System property '"
            if (r5 == 0) goto L57
            long r2 = r5.longValue()
            r5 = 0
            int r0 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r0 > 0) goto L1f
            int r0 = (r2 > r9 ? 1 : (r2 == r9 ? 0 : -1))
            if (r0 > 0) goto L1f
            r5 = 1
        L1f:
            if (r5 == 0) goto L23
            r5 = r2
        L22:
            return r5
        L23:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r1)
            r5.append(r4)
            java.lang.String r4 = "' should be in range "
            r5.append(r4)
            r5.append(r7)
            java.lang.String r4 = ".."
            r5.append(r4)
            r5.append(r9)
            java.lang.String r4 = ", but is '"
            r5.append(r4)
            r5.append(r2)
            r5.append(r6)
            java.lang.String r4 = r5.toString()
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r4 = r4.toString()
            r5.<init>(r4)
            throw r5
        L57:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r1)
            r5.append(r4)
            java.lang.String r4 = "' has unrecognized value '"
            r5.append(r4)
            r5.append(r0)
            r5.append(r6)
            java.lang.String r4 = r5.toString()
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r4 = r4.toString()
            r5.<init>(r4)
            throw r5
    }

    /* renamed from: u */
    public static final java.lang.String m4536u(java.lang.String r1) {
            int r0 = p459zh.C7351q.f28110a
            java.lang.String r1 = java.lang.System.getProperty(r1)     // Catch: java.lang.SecurityException -> L7
            goto L8
        L7:
            r1 = 0
        L8:
            return r1
    }

    /* renamed from: v */
    public static int m4537v(java.lang.String r7, int r8, int r9, int r10, int r11, java.lang.Object r12) {
            r12 = r11 & 4
            if (r12 == 0) goto L5
            r9 = 1
        L5:
            r11 = r11 & 8
            if (r11 == 0) goto Lc
            r10 = 2147483647(0x7fffffff, float:NaN)
        Lc:
            long r1 = (long) r8
            long r3 = (long) r9
            long r5 = (long) r10
            r0 = r7
            long r7 = m4535t(r0, r1, r3, r5)
            int r8 = (int) r7
            return r8
    }

    /* renamed from: w */
    public static /* synthetic */ long m4538w(java.lang.String r7, long r8, long r10, long r12, int r14, java.lang.Object r15) {
            r15 = r14 & 4
            if (r15 == 0) goto L6
            r10 = 1
        L6:
            r3 = r10
            r10 = r14 & 8
            if (r10 == 0) goto L10
            r12 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
        L10:
            r5 = r12
            r0 = r7
            r1 = r8
            long r7 = m4535t(r0, r1, r3, r5)
            return r7
    }

    /* renamed from: x */
    public static final void m4539x() {
            java.lang.ArithmeticException r0 = new java.lang.ArithmeticException
            java.lang.String r1 = "Index overflow has happened."
            r0.<init>(r1)
            throw r0
    }

    /* renamed from: y */
    public static final void m4540y(java.lang.Object r1) {
            boolean r0 = r1 instanceof ch.C0979f.a
            if (r0 != 0) goto L5
            return
        L5:
            ch.f$a r1 = (ch.C0979f.a) r1
            java.lang.Throwable r1 = r1.f5053Y
            throw r1
    }

    /* renamed from: z */
    public static final one.block.eosiojavarpcprovider.error.EosioJavaRpcProviderCallError m4541z(int r1, java.lang.Throwable r2) {
            if (r2 == 0) goto L17
            if (r1 > 0) goto L5
            goto L17
        L5:
            boolean r0 = r2 instanceof one.block.eosiojavarpcprovider.error.EosioJavaRpcProviderCallError
            if (r0 == 0) goto Lc
            one.block.eosiojavarpcprovider.error.EosioJavaRpcProviderCallError r2 = (one.block.eosiojavarpcprovider.error.EosioJavaRpcProviderCallError) r2
            return r2
        Lc:
            int r1 = r1 + (-1)
            java.lang.Throwable r2 = r2.getCause()
            one.block.eosiojavarpcprovider.error.EosioJavaRpcProviderCallError r1 = m4541z(r1, r2)
            return r1
        L17:
            r1 = 0
            return r1
    }
}
