package p371v5;

@android.annotation.SuppressLint({"InlinedApi"})
/* renamed from: v5.t */
/* loaded from: classes.dex */
public final class C6570t {
    /* renamed from: a */
    public static int m13389a(java.util.Map<java.lang.String, java.util.List<java.lang.String>> r17) {
            java.lang.String r0 = "Content-Type"
            r1 = r17
            java.lang.Object r0 = r1.get(r0)
            java.util.List r0 = (java.util.List) r0
            r1 = 0
            if (r0 == 0) goto L1b
            boolean r2 = r0.isEmpty()
            if (r2 == 0) goto L14
            goto L1b
        L14:
            java.lang.Object r0 = r0.get(r1)
            java.lang.String r0 = (java.lang.String) r0
            goto L1c
        L1b:
            r0 = 0
        L1c:
            r6 = 7
            r7 = 8
            r8 = 9
            r9 = 10
            r10 = 11
            r11 = 12
            r12 = 13
            r13 = 14
            r14 = -1
            r15 = 1
            if (r0 != 0) goto L32
        L2f:
            r1 = -1
            goto L1dd
        L32:
            java.util.ArrayList<v5.q$a> r16 = p371v5.C6567q.f25670a
            int r1 = r0.hashCode()
            r2 = -1007807498(0xffffffffc3ee13f6, float:-476.15594)
            r3 = 2
            if (r1 == r2) goto L5f
            r2 = -586683234(0xffffffffdd07ec9e, float:-6.1214856E17)
            if (r1 == r2) goto L54
            r2 = 187090231(0xb26c537, float:3.2118805E-32)
            if (r1 == r2) goto L49
            goto L67
        L49:
            java.lang.String r1 = "audio/mp3"
            boolean r1 = r0.equals(r1)
            if (r1 != 0) goto L52
            goto L67
        L52:
            r1 = 2
            goto L6a
        L54:
            java.lang.String r1 = "audio/x-wav"
            boolean r1 = r0.equals(r1)
            if (r1 != 0) goto L5d
            goto L67
        L5d:
            r1 = 1
            goto L6a
        L5f:
            java.lang.String r1 = "audio/x-flac"
            boolean r1 = r0.equals(r1)
            if (r1 != 0) goto L69
        L67:
            r1 = -1
            goto L6a
        L69:
            r1 = 0
        L6a:
            java.lang.String r2 = "audio/mpeg"
            java.lang.String r4 = "audio/wav"
            java.lang.String r5 = "audio/flac"
            if (r1 == 0) goto L7b
            if (r1 == r15) goto L79
            if (r1 == r3) goto L77
            goto L7c
        L77:
            r0 = r2
            goto L7c
        L79:
            r0 = r4
            goto L7c
        L7b:
            r0 = r5
        L7c:
            int r1 = r0.hashCode()
            switch(r1) {
                case -2123537834: goto L1aa;
                case -1662384011: goto L19f;
                case -1662384007: goto L196;
                case -1662095187: goto L18b;
                case -1606874997: goto L180;
                case -1487394660: goto L175;
                case -1248337486: goto L16a;
                case -1004728940: goto L15f;
                case -387023398: goto L151;
                case -43467528: goto L143;
                case 13915911: goto L135;
                case 187078296: goto L127;
                case 187078297: goto L119;
                case 187078669: goto L10b;
                case 187090232: goto Lfd;
                case 187091926: goto Lef;
                case 187099443: goto Le3;
                case 1331848029: goto Ld5;
                case 1503095341: goto Lc7;
                case 1504578661: goto Lb9;
                case 1504619009: goto Lad;
                case 1504831518: goto La1;
                case 1505118770: goto L93;
                case 2039520277: goto L85;
                default: goto L83;
            }
        L83:
            goto L1b5
        L85:
            java.lang.String r1 = "video/x-matroska"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L8f
            goto L1b5
        L8f:
            r3 = 23
            goto L1b6
        L93:
            java.lang.String r1 = "audio/webm"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L9d
            goto L1b5
        L9d:
            r3 = 22
            goto L1b6
        La1:
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto La9
            goto L1b5
        La9:
            r3 = 21
            goto L1b6
        Lad:
            boolean r0 = r0.equals(r5)
            if (r0 != 0) goto Lb5
            goto L1b5
        Lb5:
            r3 = 20
            goto L1b6
        Lb9:
            java.lang.String r1 = "audio/eac3"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto Lc3
            goto L1b5
        Lc3:
            r3 = 19
            goto L1b6
        Lc7:
            java.lang.String r1 = "audio/3gpp"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto Ld1
            goto L1b5
        Ld1:
            r3 = 18
            goto L1b6
        Ld5:
            java.lang.String r1 = "video/mp4"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto Ldf
            goto L1b5
        Ldf:
            r3 = 17
            goto L1b6
        Le3:
            boolean r0 = r0.equals(r4)
            if (r0 != 0) goto Leb
            goto L1b5
        Leb:
            r3 = 16
            goto L1b6
        Lef:
            java.lang.String r1 = "audio/ogg"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto Lf9
            goto L1b5
        Lf9:
            r3 = 15
            goto L1b6
        Lfd:
            java.lang.String r1 = "audio/mp4"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L107
            goto L1b5
        L107:
            r3 = 14
            goto L1b6
        L10b:
            java.lang.String r1 = "audio/amr"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L115
            goto L1b5
        L115:
            r3 = 13
            goto L1b6
        L119:
            java.lang.String r1 = "audio/ac4"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L123
            goto L1b5
        L123:
            r3 = 12
            goto L1b6
        L127:
            java.lang.String r1 = "audio/ac3"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L131
            goto L1b5
        L131:
            r3 = 11
            goto L1b6
        L135:
            java.lang.String r1 = "video/x-flv"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L13f
            goto L1b5
        L13f:
            r3 = 10
            goto L1b6
        L143:
            java.lang.String r1 = "application/webm"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L14d
            goto L1b5
        L14d:
            r3 = 9
            goto L1b6
        L151:
            java.lang.String r1 = "audio/x-matroska"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L15b
            goto L1b5
        L15b:
            r3 = 8
            goto L1b6
        L15f:
            java.lang.String r1 = "text/vtt"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L168
            goto L1b5
        L168:
            r3 = 7
            goto L1b6
        L16a:
            java.lang.String r1 = "application/mp4"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L173
            goto L1b5
        L173:
            r3 = 6
            goto L1b6
        L175:
            java.lang.String r1 = "image/jpeg"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L17e
            goto L1b5
        L17e:
            r3 = 5
            goto L1b6
        L180:
            java.lang.String r1 = "audio/amr-wb"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L189
            goto L1b5
        L189:
            r3 = 4
            goto L1b6
        L18b:
            java.lang.String r1 = "video/webm"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L194
            goto L1b5
        L194:
            r3 = 3
            goto L1b6
        L196:
            java.lang.String r1 = "video/mp2t"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L1b6
            goto L1b5
        L19f:
            java.lang.String r1 = "video/mp2p"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L1a8
            goto L1b5
        L1a8:
            r3 = 1
            goto L1b6
        L1aa:
            java.lang.String r1 = "audio/eac3-joc"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L1b3
            goto L1b5
        L1b3:
            r3 = 0
            goto L1b6
        L1b5:
            r3 = -1
        L1b6:
            switch(r3) {
                case 0: goto L1dc;
                case 1: goto L1d9;
                case 2: goto L1d6;
                case 3: goto L1d4;
                case 4: goto L1d2;
                case 5: goto L1cf;
                case 6: goto L1cc;
                case 7: goto L1c9;
                case 8: goto L1d4;
                case 9: goto L1d4;
                case 10: goto L1c7;
                case 11: goto L1dc;
                case 12: goto L1c5;
                case 13: goto L1d2;
                case 14: goto L1cc;
                case 15: goto L1c2;
                case 16: goto L1bf;
                case 17: goto L1cc;
                case 18: goto L1d2;
                case 19: goto L1dc;
                case 20: goto L1bd;
                case 21: goto L1bb;
                case 22: goto L1d4;
                case 23: goto L1d4;
                default: goto L1b9;
            }
        L1b9:
            goto L2f
        L1bb:
            r1 = 7
            goto L1dd
        L1bd:
            r1 = 4
            goto L1dd
        L1bf:
            r1 = 12
            goto L1dd
        L1c2:
            r1 = 9
            goto L1dd
        L1c5:
            r1 = 1
            goto L1dd
        L1c7:
            r1 = 5
            goto L1dd
        L1c9:
            r1 = 13
            goto L1dd
        L1cc:
            r1 = 8
            goto L1dd
        L1cf:
            r1 = 14
            goto L1dd
        L1d2:
            r1 = 3
            goto L1dd
        L1d4:
            r1 = 6
            goto L1dd
        L1d6:
            r1 = 11
            goto L1dd
        L1d9:
            r1 = 10
            goto L1dd
        L1dc:
            r1 = 0
        L1dd:
            return r1
    }

    /* renamed from: b */
    public static int m13390b(android.net.Uri r6) {
            java.lang.String r6 = r6.getLastPathSegment()
            r0 = -1
            if (r6 != 0) goto L8
            return r0
        L8:
            java.lang.String r1 = ".ac3"
            boolean r1 = r6.endsWith(r1)
            if (r1 != 0) goto L13d
            java.lang.String r1 = ".ec3"
            boolean r1 = r6.endsWith(r1)
            if (r1 == 0) goto L1a
            goto L13d
        L1a:
            java.lang.String r1 = ".ac4"
            boolean r1 = r6.endsWith(r1)
            if (r1 == 0) goto L24
            r6 = 1
            return r6
        L24:
            java.lang.String r1 = ".adts"
            boolean r1 = r6.endsWith(r1)
            if (r1 != 0) goto L13b
            java.lang.String r1 = ".aac"
            boolean r1 = r6.endsWith(r1)
            if (r1 == 0) goto L36
            goto L13b
        L36:
            java.lang.String r1 = ".amr"
            boolean r1 = r6.endsWith(r1)
            if (r1 == 0) goto L40
            r6 = 3
            return r6
        L40:
            java.lang.String r1 = ".flac"
            boolean r1 = r6.endsWith(r1)
            r2 = 4
            if (r1 == 0) goto L4a
            return r2
        L4a:
            java.lang.String r1 = ".flv"
            boolean r1 = r6.endsWith(r1)
            r3 = 5
            if (r1 == 0) goto L54
            return r3
        L54:
            int r1 = r6.length()
            int r1 = r1 - r2
            java.lang.String r4 = ".mk"
            boolean r1 = r6.startsWith(r4, r1)
            if (r1 != 0) goto L139
            java.lang.String r1 = ".webm"
            boolean r1 = r6.endsWith(r1)
            if (r1 == 0) goto L6b
            goto L139
        L6b:
            java.lang.String r1 = ".mp3"
            boolean r1 = r6.endsWith(r1)
            if (r1 == 0) goto L75
            r6 = 7
            return r6
        L75:
            java.lang.String r1 = ".mp4"
            boolean r4 = r6.endsWith(r1)
            if (r4 != 0) goto L136
            int r4 = r6.length()
            int r4 = r4 - r2
            java.lang.String r5 = ".m4"
            boolean r4 = r6.startsWith(r5, r4)
            if (r4 != 0) goto L136
            int r4 = r6.length()
            int r4 = r4 - r3
            boolean r1 = r6.startsWith(r1, r4)
            if (r1 != 0) goto L136
            int r1 = r6.length()
            int r1 = r1 - r3
            java.lang.String r3 = ".cmf"
            boolean r1 = r6.startsWith(r3, r1)
            if (r1 == 0) goto La4
            goto L136
        La4:
            int r1 = r6.length()
            int r1 = r1 - r2
            java.lang.String r3 = ".og"
            boolean r1 = r6.startsWith(r3, r1)
            if (r1 != 0) goto L133
            java.lang.String r1 = ".opus"
            boolean r1 = r6.endsWith(r1)
            if (r1 == 0) goto Lbb
            goto L133
        Lbb:
            java.lang.String r1 = ".ps"
            boolean r1 = r6.endsWith(r1)
            if (r1 != 0) goto L130
            java.lang.String r1 = ".mpeg"
            boolean r1 = r6.endsWith(r1)
            if (r1 != 0) goto L130
            java.lang.String r1 = ".mpg"
            boolean r1 = r6.endsWith(r1)
            if (r1 != 0) goto L130
            java.lang.String r1 = ".m2p"
            boolean r1 = r6.endsWith(r1)
            if (r1 == 0) goto Ldc
            goto L130
        Ldc:
            java.lang.String r1 = ".ts"
            boolean r3 = r6.endsWith(r1)
            if (r3 != 0) goto L12d
            int r3 = r6.length()
            int r3 = r3 - r2
            boolean r1 = r6.startsWith(r1, r3)
            if (r1 == 0) goto Lf0
            goto L12d
        Lf0:
            java.lang.String r1 = ".wav"
            boolean r1 = r6.endsWith(r1)
            if (r1 != 0) goto L12a
            java.lang.String r1 = ".wave"
            boolean r1 = r6.endsWith(r1)
            if (r1 == 0) goto L101
            goto L12a
        L101:
            java.lang.String r1 = ".vtt"
            boolean r1 = r6.endsWith(r1)
            if (r1 != 0) goto L127
            java.lang.String r1 = ".webvtt"
            boolean r1 = r6.endsWith(r1)
            if (r1 == 0) goto L112
            goto L127
        L112:
            java.lang.String r1 = ".jpg"
            boolean r1 = r6.endsWith(r1)
            if (r1 != 0) goto L124
            java.lang.String r1 = ".jpeg"
            boolean r6 = r6.endsWith(r1)
            if (r6 == 0) goto L123
            goto L124
        L123:
            return r0
        L124:
            r6 = 14
            return r6
        L127:
            r6 = 13
            return r6
        L12a:
            r6 = 12
            return r6
        L12d:
            r6 = 11
            return r6
        L130:
            r6 = 10
            return r6
        L133:
            r6 = 9
            return r6
        L136:
            r6 = 8
            return r6
        L139:
            r6 = 6
            return r6
        L13b:
            r6 = 2
            return r6
        L13d:
            r6 = 0
            return r6
    }
}
