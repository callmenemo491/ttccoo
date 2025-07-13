package p406x4;

@android.annotation.SuppressLint({"InlinedApi"})
/* renamed from: x4.r */
/* loaded from: classes.dex */
public final class C6944r {

    /* renamed from: a */
    public static final java.util.regex.Pattern f27104a = null;

    /* renamed from: b */
    public static final java.util.HashMap<p406x4.C6944r.b, java.util.List<p406x4.C6939m>> f27105b = null;

    /* renamed from: c */
    public static int f27106c;

    /* renamed from: x4.r$a */
    public static /* synthetic */ class a {
    }

    /* renamed from: x4.r$b */
    public static final class b {

        /* renamed from: a */
        public final java.lang.String f27107a;

        /* renamed from: b */
        public final boolean f27108b;

        /* renamed from: c */
        public final boolean f27109c;

        public b(java.lang.String r1, boolean r2, boolean r3) {
                r0 = this;
                r0.<init>()
                r0.f27107a = r1
                r0.f27108b = r2
                r0.f27109c = r3
                return
        }

        public boolean equals(java.lang.Object r5) {
                r4 = this;
                r0 = 1
                if (r4 != r5) goto L4
                return r0
            L4:
                r1 = 0
                if (r5 == 0) goto L2b
                java.lang.Class r2 = r5.getClass()
                java.lang.Class<x4.r$b> r3 = p406x4.C6944r.b.class
                if (r2 == r3) goto L10
                goto L2b
            L10:
                x4.r$b r5 = (p406x4.C6944r.b) r5
                java.lang.String r2 = r4.f27107a
                java.lang.String r3 = r5.f27107a
                boolean r2 = android.text.TextUtils.equals(r2, r3)
                if (r2 == 0) goto L29
                boolean r2 = r4.f27108b
                boolean r3 = r5.f27108b
                if (r2 != r3) goto L29
                boolean r2 = r4.f27109c
                boolean r5 = r5.f27109c
                if (r2 != r5) goto L29
                goto L2a
            L29:
                r0 = 0
            L2a:
                return r0
            L2b:
                return r1
        }

        public int hashCode() {
                r3 = this;
                java.lang.String r0 = r3.f27107a
                r1 = 31
                r2 = 31
                int r0 = p213m1.C4319e.m9651a(r0, r1, r2)
                boolean r1 = r3.f27108b
                r2 = 1231(0x4cf, float:1.725E-42)
                if (r1 == 0) goto L13
                r1 = 1231(0x4cf, float:1.725E-42)
                goto L15
            L13:
                r1 = 1237(0x4d5, float:1.733E-42)
            L15:
                int r0 = r0 + r1
                int r0 = r0 * 31
                boolean r1 = r3.f27109c
                if (r1 == 0) goto L1d
                goto L1f
            L1d:
                r2 = 1237(0x4d5, float:1.733E-42)
            L1f:
                int r0 = r0 + r2
                return r0
        }
    }

    /* renamed from: x4.r$c */
    public static class c extends java.lang.Exception {
        public c(java.lang.Throwable r1, p406x4.C6944r.a r2) {
                r0 = this;
                java.lang.String r2 = "Failed to query underlying media codecs"
                r0.<init>(r2, r1)
                return
        }
    }

    /* renamed from: x4.r$d */
    public interface d {
        /* renamed from: a */
        android.media.MediaCodecInfo mo14106a(int r1);

        /* renamed from: b */
        boolean mo14107b(java.lang.String r1, java.lang.String r2, android.media.MediaCodecInfo.CodecCapabilities r3);

        /* renamed from: c */
        int mo14108c();

        /* renamed from: d */
        boolean mo14109d(java.lang.String r1, java.lang.String r2, android.media.MediaCodecInfo.CodecCapabilities r3);

        /* renamed from: e */
        boolean mo14110e();
    }

    /* renamed from: x4.r$e */
    public static final class e implements p406x4.C6944r.d {
        public e(p406x4.C6944r.a r1) {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // p406x4.C6944r.d
        /* renamed from: a */
        public android.media.MediaCodecInfo mo14106a(int r1) {
                r0 = this;
                android.media.MediaCodecInfo r1 = android.media.MediaCodecList.getCodecInfoAt(r1)
                return r1
        }

        @Override // p406x4.C6944r.d
        /* renamed from: b */
        public boolean mo14107b(java.lang.String r1, java.lang.String r2, android.media.MediaCodecInfo.CodecCapabilities r3) {
                r0 = this;
                r1 = 0
                return r1
        }

        @Override // p406x4.C6944r.d
        /* renamed from: c */
        public int mo14108c() {
                r1 = this;
                int r0 = android.media.MediaCodecList.getCodecCount()
                return r0
        }

        @Override // p406x4.C6944r.d
        /* renamed from: d */
        public boolean mo14109d(java.lang.String r1, java.lang.String r2, android.media.MediaCodecInfo.CodecCapabilities r3) {
                r0 = this;
                java.lang.String r3 = "secure-playback"
                boolean r1 = r3.equals(r1)
                if (r1 == 0) goto L12
                java.lang.String r1 = "video/avc"
                boolean r1 = r1.equals(r2)
                if (r1 == 0) goto L12
                r1 = 1
                goto L13
            L12:
                r1 = 0
            L13:
                return r1
        }

        @Override // p406x4.C6944r.d
        /* renamed from: e */
        public boolean mo14110e() {
                r1 = this;
                r0 = 0
                return r0
        }
    }

    /* renamed from: x4.r$f */
    public static final class f implements p406x4.C6944r.d {

        /* renamed from: a */
        public final int f27110a;

        /* renamed from: b */
        public android.media.MediaCodecInfo[] f27111b;

        public f(boolean r1, boolean r2) {
                r0 = this;
                r0.<init>()
                if (r1 != 0) goto La
                if (r2 == 0) goto L8
                goto La
            L8:
                r1 = 0
                goto Lb
            La:
                r1 = 1
            Lb:
                r0.f27110a = r1
                return
        }

        @Override // p406x4.C6944r.d
        /* renamed from: a */
        public android.media.MediaCodecInfo mo14106a(int r3) {
                r2 = this;
                android.media.MediaCodecInfo[] r0 = r2.f27111b
                if (r0 != 0) goto L11
                android.media.MediaCodecList r0 = new android.media.MediaCodecList
                int r1 = r2.f27110a
                r0.<init>(r1)
                android.media.MediaCodecInfo[] r0 = r0.getCodecInfos()
                r2.f27111b = r0
            L11:
                android.media.MediaCodecInfo[] r0 = r2.f27111b
                r3 = r0[r3]
                return r3
        }

        @Override // p406x4.C6944r.d
        /* renamed from: b */
        public boolean mo14107b(java.lang.String r1, java.lang.String r2, android.media.MediaCodecInfo.CodecCapabilities r3) {
                r0 = this;
                boolean r1 = r3.isFeatureRequired(r1)
                return r1
        }

        @Override // p406x4.C6944r.d
        /* renamed from: c */
        public int mo14108c() {
                r2 = this;
                android.media.MediaCodecInfo[] r0 = r2.f27111b
                if (r0 != 0) goto L11
                android.media.MediaCodecList r0 = new android.media.MediaCodecList
                int r1 = r2.f27110a
                r0.<init>(r1)
                android.media.MediaCodecInfo[] r0 = r0.getCodecInfos()
                r2.f27111b = r0
            L11:
                android.media.MediaCodecInfo[] r0 = r2.f27111b
                int r0 = r0.length
                return r0
        }

        @Override // p406x4.C6944r.d
        /* renamed from: d */
        public boolean mo14109d(java.lang.String r1, java.lang.String r2, android.media.MediaCodecInfo.CodecCapabilities r3) {
                r0 = this;
                boolean r1 = r3.isFeatureSupported(r1)
                return r1
        }

        @Override // p406x4.C6944r.d
        /* renamed from: e */
        public boolean mo14110e() {
                r1 = this;
                r0 = 1
                return r0
        }
    }

    /* renamed from: x4.r$g */
    public interface g<T> {
        /* renamed from: i */
        int mo2150i(T r1);
    }

    static {
            java.lang.String r0 = "^\\D?(\\d+)$"
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
            p406x4.C6944r.f27104a = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            p406x4.C6944r.f27105b = r0
            r0 = -1
            p406x4.C6944r.f27106c = r0
            return
    }

    /* renamed from: a */
    public static void m14096a(java.lang.String r11, java.util.List<p406x4.C6939m> r12) {
            java.lang.String r0 = "audio/raw"
            boolean r11 = r0.equals(r11)
            r0 = 1
            r1 = 0
            if (r11 == 0) goto L48
            int r11 = p371v5.C6552b0.f25624a
            r2 = 26
            if (r11 >= r2) goto L43
            java.lang.String r11 = p371v5.C6552b0.f25625b
            java.lang.String r2 = "R9"
            boolean r11 = r11.equals(r2)
            if (r11 == 0) goto L43
            int r11 = r12.size()
            if (r11 != r0) goto L43
            java.lang.Object r11 = r12.get(r1)
            x4.m r11 = (p406x4.C6939m) r11
            java.lang.String r11 = r11.f27019a
            java.lang.String r2 = "OMX.MTK.AUDIO.DECODER.RAW"
            boolean r11 = r11.equals(r2)
            if (r11 == 0) goto L43
            r5 = 0
            r6 = 0
            r7 = 1
            r8 = 0
            r9 = 0
            r10 = 0
            java.lang.String r2 = "OMX.google.raw.decoder"
            java.lang.String r3 = "audio/raw"
            java.lang.String r4 = "audio/raw"
            x4.m r11 = p406x4.C6939m.m14064i(r2, r3, r4, r5, r6, r7, r8, r9, r10)
            r12.add(r11)
        L43:
            androidx.room.a r11 = androidx.room.C0618a.f3660j0
            m14105j(r12, r11)
        L48:
            int r11 = p371v5.C6552b0.f25624a
            r2 = 21
            if (r11 >= r2) goto L79
            int r2 = r12.size()
            if (r2 <= r0) goto L79
            java.lang.Object r2 = r12.get(r1)
            x4.m r2 = (p406x4.C6939m) r2
            java.lang.String r2 = r2.f27019a
            java.lang.String r3 = "OMX.SEC.mp3.dec"
            boolean r3 = r3.equals(r2)
            if (r3 != 0) goto L74
            java.lang.String r3 = "OMX.SEC.MP3.Decoder"
            boolean r3 = r3.equals(r2)
            if (r3 != 0) goto L74
            java.lang.String r3 = "OMX.brcm.audio.mp3.decoder"
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L79
        L74:
            k1.d r2 = p179k1.C3646d.f16123l0
            m14105j(r12, r2)
        L79:
            r2 = 32
            if (r11 >= r2) goto L9c
            int r11 = r12.size()
            if (r11 <= r0) goto L9c
            java.lang.Object r11 = r12.get(r1)
            x4.m r11 = (p406x4.C6939m) r11
            java.lang.String r11 = r11.f27019a
            java.lang.String r0 = "OMX.qti.audio.decoder.flac"
            boolean r11 = r0.equals(r11)
            if (r11 == 0) goto L9c
            java.lang.Object r11 = r12.remove(r1)
            x4.m r11 = (p406x4.C6939m) r11
            r12.add(r11)
        L9c:
            return
    }

    /* renamed from: b */
    public static java.lang.String m14097b(android.media.MediaCodecInfo r4, java.lang.String r5, java.lang.String r6) {
            java.lang.String[] r4 = r4.getSupportedTypes()
            int r0 = r4.length
            r1 = 0
        L6:
            if (r1 >= r0) goto L14
            r2 = r4[r1]
            boolean r3 = r2.equalsIgnoreCase(r6)
            if (r3 == 0) goto L11
            return r2
        L11:
            int r1 = r1 + 1
            goto L6
        L14:
            java.lang.String r4 = "video/dolby-vision"
            boolean r4 = r6.equals(r4)
            if (r4 == 0) goto L3a
            java.lang.String r4 = "OMX.MS.HEVCDV.Decoder"
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L27
            java.lang.String r4 = "video/hevcdv"
            return r4
        L27:
            java.lang.String r4 = "OMX.RTK.video.decoder"
            boolean r4 = r4.equals(r5)
            if (r4 != 0) goto L37
            java.lang.String r4 = "OMX.realtek.video.decoder.tunneled"
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L60
        L37:
            java.lang.String r4 = "video/dv_hevc"
            return r4
        L3a:
            java.lang.String r4 = "audio/alac"
            boolean r4 = r6.equals(r4)
            if (r4 == 0) goto L4d
            java.lang.String r4 = "OMX.lge.alac.decoder"
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L4d
            java.lang.String r4 = "audio/x-lg-alac"
            return r4
        L4d:
            java.lang.String r4 = "audio/flac"
            boolean r4 = r6.equals(r4)
            if (r4 == 0) goto L60
            java.lang.String r4 = "OMX.lge.flac.decoder"
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L60
            java.lang.String r4 = "audio/x-lg-flac"
            return r4
        L60:
            r4 = 0
            return r4
    }

    /* renamed from: c */
    public static android.util.Pair<java.lang.Integer, java.lang.Integer> m14098c(p088f4.C2003e0 r18) {
            r0 = r18
            java.lang.String r1 = r0.f8893g0
            r2 = 0
            if (r1 != 0) goto L8
            return r2
        L8:
            java.lang.String r3 = "\\."
            java.lang.String[] r1 = r1.split(r3)
            java.lang.String r3 = r0.f8896j0
            java.lang.String r4 = "video/dolby-vision"
            boolean r3 = r4.equals(r3)
            java.lang.String r4 = "MediaCodecUtil"
            r5 = 3
            r6 = 8
            r7 = 4
            r8 = 2
            r9 = 1
            if (r3 == 0) goto L21b
            java.lang.String r0 = r0.f8893g0
            int r3 = r1.length
            java.lang.String r10 = "Ignoring malformed Dolby Vision codec string: "
            if (r3 >= r5) goto L38
            java.lang.String r0 = java.lang.String.valueOf(r0)
            int r1 = r0.length()
            if (r1 == 0) goto L32
            goto L50
        L32:
            java.lang.String r0 = new java.lang.String
            r0.<init>(r10)
            goto L5a
        L38:
            java.util.regex.Pattern r3 = p406x4.C6944r.f27104a
            r5 = r1[r9]
            java.util.regex.Matcher r3 = r3.matcher(r5)
            boolean r5 = r3.matches()
            if (r5 != 0) goto L5f
            java.lang.String r0 = java.lang.String.valueOf(r0)
            int r1 = r0.length()
            if (r1 == 0) goto L55
        L50:
            java.lang.String r0 = r10.concat(r0)
            goto L5a
        L55:
            java.lang.String r0 = new java.lang.String
            r0.<init>(r10)
        L5a:
            android.util.Log.w(r4, r0)
            goto L21a
        L5f:
            java.lang.String r0 = r3.group(r9)
            java.lang.String r2 = "09"
            java.lang.String r3 = "08"
            java.lang.String r5 = "07"
            java.lang.String r10 = "06"
            java.lang.String r11 = "05"
            java.lang.String r12 = "04"
            java.lang.String r13 = "03"
            java.lang.String r14 = "02"
            java.lang.String r15 = "01"
            if (r0 != 0) goto L79
            goto L10c
        L79:
            int r16 = r0.hashCode()
            switch(r16) {
                case 1536: goto Ld5;
                case 1537: goto Lce;
                case 1538: goto Lc5;
                case 1539: goto Lbc;
                case 1540: goto Lb3;
                case 1541: goto Laa;
                case 1542: goto La1;
                case 1543: goto L98;
                case 1544: goto L8e;
                case 1545: goto L82;
                default: goto L80;
            }
        L80:
            goto Le0
        L82:
            boolean r9 = r0.equals(r2)
            if (r9 != 0) goto L8a
            goto Le0
        L8a:
            r9 = 9
            goto Le1
        L8e:
            boolean r9 = r0.equals(r3)
            if (r9 != 0) goto L95
            goto Le0
        L95:
            r9 = 8
            goto Le1
        L98:
            boolean r9 = r0.equals(r5)
            if (r9 != 0) goto L9f
            goto Le0
        L9f:
            r9 = 7
            goto Le1
        La1:
            boolean r9 = r0.equals(r10)
            if (r9 != 0) goto La8
            goto Le0
        La8:
            r9 = 6
            goto Le1
        Laa:
            boolean r9 = r0.equals(r11)
            if (r9 != 0) goto Lb1
            goto Le0
        Lb1:
            r9 = 5
            goto Le1
        Lb3:
            boolean r9 = r0.equals(r12)
            if (r9 != 0) goto Lba
            goto Le0
        Lba:
            r9 = 4
            goto Le1
        Lbc:
            boolean r9 = r0.equals(r13)
            if (r9 != 0) goto Lc3
            goto Le0
        Lc3:
            r9 = 3
            goto Le1
        Lc5:
            boolean r9 = r0.equals(r14)
            if (r9 != 0) goto Lcc
            goto Le0
        Lcc:
            r9 = 2
            goto Le1
        Lce:
            boolean r16 = r0.equals(r15)
            if (r16 != 0) goto Le1
            goto Le0
        Ld5:
            java.lang.String r9 = "00"
            boolean r9 = r0.equals(r9)
            if (r9 != 0) goto Lde
            goto Le0
        Lde:
            r9 = 0
            goto Le1
        Le0:
            r9 = -1
        Le1:
            switch(r9) {
                case 0: goto L106;
                case 1: goto L101;
                case 2: goto Lfc;
                case 3: goto Lf7;
                case 4: goto Lf4;
                case 5: goto Lf1;
                case 6: goto Lee;
                case 7: goto Leb;
                case 8: goto Le8;
                case 9: goto Le5;
                default: goto Le4;
            }
        Le4:
            goto L10c
        Le5:
            r9 = 512(0x200, float:7.17E-43)
            goto L107
        Le8:
            r9 = 256(0x100, float:3.59E-43)
            goto L107
        Leb:
            r9 = 128(0x80, float:1.8E-43)
            goto L107
        Lee:
            r9 = 64
            goto L107
        Lf1:
            r9 = 32
            goto L107
        Lf4:
            r9 = 16
            goto L107
        Lf7:
            java.lang.Integer r9 = java.lang.Integer.valueOf(r6)
            goto L10d
        Lfc:
            java.lang.Integer r9 = java.lang.Integer.valueOf(r7)
            goto L10d
        L101:
            java.lang.Integer r9 = java.lang.Integer.valueOf(r8)
            goto L10d
        L106:
            r9 = 1
        L107:
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            goto L10d
        L10c:
            r9 = 0
        L10d:
            if (r9 != 0) goto L124
            java.lang.String r1 = "Unknown Dolby Vision profile string: "
            java.lang.String r0 = java.lang.String.valueOf(r0)
            int r2 = r0.length()
            if (r2 == 0) goto L11d
            goto L206
        L11d:
            java.lang.String r0 = new java.lang.String
            r0.<init>(r1)
            goto L210
        L124:
            r0 = r1[r8]
            if (r0 != 0) goto L12a
            goto L1f7
        L12a:
            int r1 = r0.hashCode()
            switch(r1) {
                case 1537: goto L189;
                case 1538: goto L180;
                case 1539: goto L177;
                case 1540: goto L16e;
                case 1541: goto L163;
                case 1542: goto L158;
                case 1543: goto L14d;
                case 1544: goto L142;
                case 1545: goto L136;
                default: goto L131;
            }
        L131:
            switch(r1) {
                case 1567: goto L1b6;
                case 1568: goto L1aa;
                case 1569: goto L19e;
                case 1570: goto L192;
                default: goto L134;
            }
        L134:
            goto L1c2
        L136:
            boolean r1 = r0.equals(r2)
            if (r1 != 0) goto L13e
            goto L1c2
        L13e:
            r1 = 8
            goto L1c3
        L142:
            boolean r1 = r0.equals(r3)
            if (r1 != 0) goto L14a
            goto L1c2
        L14a:
            r1 = 7
            goto L1c3
        L14d:
            boolean r1 = r0.equals(r5)
            if (r1 != 0) goto L155
            goto L1c2
        L155:
            r1 = 6
            goto L1c3
        L158:
            boolean r1 = r0.equals(r10)
            if (r1 != 0) goto L160
            goto L1c2
        L160:
            r1 = 5
            goto L1c3
        L163:
            boolean r1 = r0.equals(r11)
            if (r1 != 0) goto L16b
            goto L1c2
        L16b:
            r1 = 4
            goto L1c3
        L16e:
            boolean r1 = r0.equals(r12)
            if (r1 != 0) goto L175
            goto L1c2
        L175:
            r1 = 3
            goto L1c3
        L177:
            boolean r1 = r0.equals(r13)
            if (r1 != 0) goto L17e
            goto L1c2
        L17e:
            r1 = 2
            goto L1c3
        L180:
            boolean r1 = r0.equals(r14)
            if (r1 != 0) goto L187
            goto L1c2
        L187:
            r1 = 1
            goto L1c3
        L189:
            boolean r1 = r0.equals(r15)
            if (r1 != 0) goto L190
            goto L1c2
        L190:
            r1 = 0
            goto L1c3
        L192:
            java.lang.String r1 = "13"
            boolean r1 = r0.equals(r1)
            if (r1 != 0) goto L19b
            goto L1c2
        L19b:
            r1 = 12
            goto L1c3
        L19e:
            java.lang.String r1 = "12"
            boolean r1 = r0.equals(r1)
            if (r1 != 0) goto L1a7
            goto L1c2
        L1a7:
            r1 = 11
            goto L1c3
        L1aa:
            java.lang.String r1 = "11"
            boolean r1 = r0.equals(r1)
            if (r1 != 0) goto L1b3
            goto L1c2
        L1b3:
            r1 = 10
            goto L1c3
        L1b6:
            java.lang.String r1 = "10"
            boolean r1 = r0.equals(r1)
            if (r1 != 0) goto L1bf
            goto L1c2
        L1bf:
            r1 = 9
            goto L1c3
        L1c2:
            r1 = -1
        L1c3:
            switch(r1) {
                case 0: goto L1f1;
                case 1: goto L1ec;
                case 2: goto L1e7;
                case 3: goto L1e2;
                case 4: goto L1df;
                case 5: goto L1dc;
                case 6: goto L1d9;
                case 7: goto L1d6;
                case 8: goto L1d3;
                case 9: goto L1d0;
                case 10: goto L1cd;
                case 11: goto L1ca;
                case 12: goto L1c7;
                default: goto L1c6;
            }
        L1c6:
            goto L1f7
        L1c7:
            r1 = 4096(0x1000, float:5.74E-42)
            goto L1f2
        L1ca:
            r1 = 2048(0x800, float:2.87E-42)
            goto L1f2
        L1cd:
            r1 = 1024(0x400, float:1.435E-42)
            goto L1f2
        L1d0:
            r1 = 512(0x200, float:7.17E-43)
            goto L1f2
        L1d3:
            r1 = 256(0x100, float:3.59E-43)
            goto L1f2
        L1d6:
            r1 = 128(0x80, float:1.8E-43)
            goto L1f2
        L1d9:
            r1 = 64
            goto L1f2
        L1dc:
            r1 = 32
            goto L1f2
        L1df:
            r1 = 16
            goto L1f2
        L1e2:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r6)
            goto L1f8
        L1e7:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r7)
            goto L1f8
        L1ec:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r8)
            goto L1f8
        L1f1:
            r1 = 1
        L1f2:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            goto L1f8
        L1f7:
            r1 = 0
        L1f8:
            if (r1 != 0) goto L215
            java.lang.String r1 = "Unknown Dolby Vision level string: "
            java.lang.String r0 = java.lang.String.valueOf(r0)
            int r2 = r0.length()
            if (r2 == 0) goto L20b
        L206:
            java.lang.String r0 = r1.concat(r0)
            goto L210
        L20b:
            java.lang.String r0 = new java.lang.String
            r0.<init>(r1)
        L210:
            android.util.Log.w(r4, r0)
            r2 = 0
            goto L21a
        L215:
            android.util.Pair r2 = new android.util.Pair
            r2.<init>(r9, r1)
        L21a:
            return r2
        L21b:
            r2 = 0
            r2 = r1[r2]
            java.util.Objects.requireNonNull(r2)
            int r3 = r2.hashCode()
            switch(r3) {
                case 3004662: goto L26b;
                case 3006243: goto L260;
                case 3006244: goto L255;
                case 3199032: goto L24a;
                case 3214780: goto L23f;
                case 3356560: goto L234;
                case 3624515: goto L229;
                default: goto L228;
            }
        L228:
            goto L276
        L229:
            java.lang.String r3 = "vp09"
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L232
            goto L276
        L232:
            r2 = 6
            goto L277
        L234:
            java.lang.String r3 = "mp4a"
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L23d
            goto L276
        L23d:
            r2 = 5
            goto L277
        L23f:
            java.lang.String r3 = "hvc1"
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L248
            goto L276
        L248:
            r2 = 4
            goto L277
        L24a:
            java.lang.String r3 = "hev1"
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L253
            goto L276
        L253:
            r2 = 3
            goto L277
        L255:
            java.lang.String r3 = "avc2"
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L25e
            goto L276
        L25e:
            r2 = 2
            goto L277
        L260:
            java.lang.String r3 = "avc1"
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L269
            goto L276
        L269:
            r2 = 1
            goto L277
        L26b:
            java.lang.String r3 = "av01"
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L274
            goto L276
        L274:
            r2 = 0
            goto L277
        L276:
            r2 = -1
        L277:
            switch(r2) {
                case 0: goto L78d;
                case 1: goto L65d;
                case 2: goto L65d;
                case 3: goto L403;
                case 4: goto L403;
                case 5: goto L353;
                case 6: goto L27c;
                default: goto L27a;
            }
        L27a:
            r0 = 0
            return r0
        L27c:
            r2 = 0
            java.lang.String r0 = r0.f8893g0
            int r3 = r1.length
            java.lang.String r5 = "Ignoring malformed VP9 codec string: "
            r6 = 3
            if (r3 >= r6) goto L298
            java.lang.String r0 = java.lang.String.valueOf(r0)
            int r1 = r0.length()
            if (r1 == 0) goto L291
            goto L345
        L291:
            java.lang.String r0 = new java.lang.String
            r0.<init>(r5)
            goto L34f
        L298:
            r3 = 1
            r6 = r1[r3]     // Catch: java.lang.NumberFormatException -> L33a
            int r6 = java.lang.Integer.parseInt(r6)     // Catch: java.lang.NumberFormatException -> L33a
            r1 = r1[r8]     // Catch: java.lang.NumberFormatException -> L33a
            int r0 = java.lang.Integer.parseInt(r1)     // Catch: java.lang.NumberFormatException -> L33a
            if (r6 == 0) goto L2b7
            if (r6 == r3) goto L2b5
            if (r6 == r8) goto L2b3
            r1 = 3
            if (r6 == r1) goto L2b0
            r1 = -1
            goto L2b8
        L2b0:
            r1 = 8
            goto L2b8
        L2b3:
            r1 = 4
            goto L2b8
        L2b5:
            r1 = 2
            goto L2b8
        L2b7:
            r1 = 1
        L2b8:
            r3 = -1
            if (r1 != r3) goto L2c5
            r0 = 32
            java.lang.String r1 = "Unknown VP9 profile: "
            java.lang.String r0 = p064e.C1490d.m4039a(r0, r1, r6)
            goto L34f
        L2c5:
            r3 = 30
            r5 = 10
            if (r0 == r5) goto L321
            r5 = 11
            if (r0 == r5) goto L31e
            r5 = 20
            if (r0 == r5) goto L31b
            r5 = 21
            if (r0 == r5) goto L317
            if (r0 == r3) goto L313
            r5 = 31
            if (r0 == r5) goto L30f
            r5 = 40
            if (r0 == r5) goto L30b
            r5 = 41
            if (r0 == r5) goto L307
            r5 = 50
            if (r0 == r5) goto L303
            r5 = 51
            if (r0 == r5) goto L2ff
            switch(r0) {
                case 60: goto L2fb;
                case 61: goto L2f7;
                case 62: goto L2f3;
                default: goto L2f0;
            }
        L2f0:
            r6 = -1
            r5 = -1
            goto L323
        L2f3:
            r5 = 8192(0x2000, float:1.148E-41)
            r6 = -1
            goto L323
        L2f7:
            r6 = -1
            r5 = 4096(0x1000, float:5.74E-42)
            goto L323
        L2fb:
            r6 = -1
            r5 = 2048(0x800, float:2.87E-42)
            goto L323
        L2ff:
            r6 = -1
            r5 = 512(0x200, float:7.17E-43)
            goto L323
        L303:
            r6 = -1
            r5 = 256(0x100, float:3.59E-43)
            goto L323
        L307:
            r6 = -1
            r5 = 128(0x80, float:1.8E-43)
            goto L323
        L30b:
            r6 = -1
            r5 = 64
            goto L323
        L30f:
            r6 = -1
            r5 = 32
            goto L323
        L313:
            r6 = -1
            r5 = 16
            goto L323
        L317:
            r6 = -1
            r5 = 8
            goto L323
        L31b:
            r6 = -1
            r5 = 4
            goto L323
        L31e:
            r6 = -1
            r5 = 2
            goto L323
        L321:
            r6 = -1
            r5 = 1
        L323:
            if (r5 != r6) goto L32c
            java.lang.String r1 = "Unknown VP9 level: "
            java.lang.String r0 = p064e.C1490d.m4039a(r3, r1, r0)
            goto L34f
        L32c:
            android.util.Pair r2 = new android.util.Pair
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r5)
            r2.<init>(r0, r1)
            goto L352
        L33a:
            java.lang.String r0 = java.lang.String.valueOf(r0)
            int r1 = r0.length()
            if (r1 == 0) goto L34a
        L345:
            java.lang.String r0 = r5.concat(r0)
            goto L34f
        L34a:
            java.lang.String r0 = new java.lang.String
            r0.<init>(r5)
        L34f:
            android.util.Log.w(r4, r0)
        L352:
            return r2
        L353:
            r2 = 0
            java.lang.String r0 = r0.f8893g0
            int r3 = r1.length
            java.lang.String r5 = "Ignoring malformed MP4A codec string: "
            r6 = 3
            if (r3 == r6) goto L36f
            java.lang.String r0 = java.lang.String.valueOf(r0)
            int r1 = r0.length()
            if (r1 == 0) goto L368
            goto L3f5
        L368:
            java.lang.String r0 = new java.lang.String
            r0.<init>(r5)
            goto L3ff
        L36f:
            r3 = 1
            r3 = r1[r3]     // Catch: java.lang.NumberFormatException -> L3ea
            r6 = 16
            int r3 = java.lang.Integer.parseInt(r3, r6)     // Catch: java.lang.NumberFormatException -> L3ea
            java.lang.String r3 = p371v5.C6567q.m13374d(r3)     // Catch: java.lang.NumberFormatException -> L3ea
            java.lang.String r6 = "audio/mp4a-latm"
            boolean r3 = r6.equals(r3)     // Catch: java.lang.NumberFormatException -> L3ea
            if (r3 == 0) goto L402
            r1 = r1[r8]     // Catch: java.lang.NumberFormatException -> L3ea
            int r1 = java.lang.Integer.parseInt(r1)     // Catch: java.lang.NumberFormatException -> L3ea
            r3 = 17
            if (r1 == r3) goto L3d3
            r3 = 20
            if (r1 == r3) goto L3ce
            r3 = 23
            if (r1 == r3) goto L3c9
            r3 = 29
            if (r1 == r3) goto L3c4
            r3 = 39
            if (r1 == r3) goto L3bf
            r3 = 42
            if (r1 == r3) goto L3ba
            switch(r1) {
                case 1: goto L3b7;
                case 2: goto L3b4;
                case 3: goto L3b1;
                case 4: goto L3ae;
                case 5: goto L3ab;
                case 6: goto L3a8;
                default: goto L3a5;
            }     // Catch: java.lang.NumberFormatException -> L3ea
        L3a5:
            r1 = -1
            r3 = -1
            goto L3d8
        L3a8:
            r1 = -1
            r3 = 6
            goto L3d8
        L3ab:
            r1 = -1
            r3 = 5
            goto L3d8
        L3ae:
            r1 = -1
            r3 = 4
            goto L3d8
        L3b1:
            r1 = -1
            r3 = 3
            goto L3d8
        L3b4:
            r1 = -1
            r3 = 2
            goto L3d8
        L3b7:
            r1 = -1
            r3 = 1
            goto L3d8
        L3ba:
            r1 = 42
            r3 = 42
            goto L3d7
        L3bf:
            r1 = 39
            r3 = 39
            goto L3d7
        L3c4:
            r1 = 29
            r3 = 29
            goto L3d7
        L3c9:
            r1 = 23
            r3 = 23
            goto L3d7
        L3ce:
            r1 = 20
            r3 = 20
            goto L3d7
        L3d3:
            r1 = 17
            r3 = 17
        L3d7:
            r1 = -1
        L3d8:
            if (r3 == r1) goto L402
            android.util.Pair r1 = new android.util.Pair     // Catch: java.lang.NumberFormatException -> L3ea
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch: java.lang.NumberFormatException -> L3ea
            r6 = 0
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch: java.lang.NumberFormatException -> L3ea
            r1.<init>(r3, r6)     // Catch: java.lang.NumberFormatException -> L3ea
            r2 = r1
            goto L402
        L3ea:
            java.lang.String r0 = java.lang.String.valueOf(r0)
            int r1 = r0.length()
            if (r1 == 0) goto L3fa
        L3f5:
            java.lang.String r0 = r5.concat(r0)
            goto L3ff
        L3fa:
            java.lang.String r0 = new java.lang.String
            r0.<init>(r5)
        L3ff:
            android.util.Log.w(r4, r0)
        L402:
            return r2
        L403:
            r2 = 0
            java.lang.String r0 = r0.f8893g0
            int r3 = r1.length
            java.lang.String r5 = "Ignoring malformed HEVC codec string: "
            if (r3 >= r7) goto L41d
            java.lang.String r0 = java.lang.String.valueOf(r0)
            int r1 = r0.length()
            if (r1 == 0) goto L416
            goto L436
        L416:
            java.lang.String r0 = new java.lang.String
            r0.<init>(r5)
            goto L659
        L41d:
            java.util.regex.Pattern r3 = p406x4.C6944r.f27104a
            r9 = 1
            r9 = r1[r9]
            java.util.regex.Matcher r3 = r3.matcher(r9)
            boolean r9 = r3.matches()
            if (r9 != 0) goto L443
            java.lang.String r0 = java.lang.String.valueOf(r0)
            int r1 = r0.length()
            if (r1 == 0) goto L43c
        L436:
            java.lang.String r0 = r5.concat(r0)
            goto L659
        L43c:
            java.lang.String r0 = new java.lang.String
            r0.<init>(r5)
            goto L659
        L443:
            r0 = 1
            java.lang.String r0 = r3.group(r0)
            java.lang.String r3 = "1"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L452
            r0 = 1
            goto L45b
        L452:
            java.lang.String r3 = "2"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L63e
            r0 = 2
        L45b:
            r3 = 3
            r1 = r1[r3]
            if (r1 != 0) goto L462
            goto L61d
        L462:
            int r3 = r1.hashCode()
            switch(r3) {
                case 70821: goto L5b4;
                case 70914: goto L5a9;
                case 70917: goto L59e;
                case 71007: goto L593;
                case 71010: goto L588;
                case 74665: goto L57d;
                case 74758: goto L572;
                case 74761: goto L567;
                case 74851: goto L559;
                case 74854: goto L54b;
                case 2193639: goto L53d;
                case 2193642: goto L52f;
                case 2193732: goto L521;
                case 2193735: goto L513;
                case 2193738: goto L505;
                case 2193825: goto L4f7;
                case 2193828: goto L4e9;
                case 2193831: goto L4db;
                case 2312803: goto L4cd;
                case 2312806: goto L4bf;
                case 2312896: goto L4b1;
                case 2312899: goto L4a3;
                case 2312902: goto L495;
                case 2312989: goto L487;
                case 2312992: goto L479;
                case 2312995: goto L46b;
                default: goto L469;
            }
        L469:
            goto L5bf
        L46b:
            java.lang.String r3 = "L186"
            boolean r3 = r1.equals(r3)
            if (r3 != 0) goto L475
            goto L5bf
        L475:
            r3 = 25
            goto L5c0
        L479:
            java.lang.String r3 = "L183"
            boolean r3 = r1.equals(r3)
            if (r3 != 0) goto L483
            goto L5bf
        L483:
            r3 = 24
            goto L5c0
        L487:
            java.lang.String r3 = "L180"
            boolean r3 = r1.equals(r3)
            if (r3 != 0) goto L491
            goto L5bf
        L491:
            r3 = 23
            goto L5c0
        L495:
            java.lang.String r3 = "L156"
            boolean r3 = r1.equals(r3)
            if (r3 != 0) goto L49f
            goto L5bf
        L49f:
            r3 = 22
            goto L5c0
        L4a3:
            java.lang.String r3 = "L153"
            boolean r3 = r1.equals(r3)
            if (r3 != 0) goto L4ad
            goto L5bf
        L4ad:
            r3 = 21
            goto L5c0
        L4b1:
            java.lang.String r3 = "L150"
            boolean r3 = r1.equals(r3)
            if (r3 != 0) goto L4bb
            goto L5bf
        L4bb:
            r3 = 20
            goto L5c0
        L4bf:
            java.lang.String r3 = "L123"
            boolean r3 = r1.equals(r3)
            if (r3 != 0) goto L4c9
            goto L5bf
        L4c9:
            r3 = 19
            goto L5c0
        L4cd:
            java.lang.String r3 = "L120"
            boolean r3 = r1.equals(r3)
            if (r3 != 0) goto L4d7
            goto L5bf
        L4d7:
            r3 = 18
            goto L5c0
        L4db:
            java.lang.String r3 = "H186"
            boolean r3 = r1.equals(r3)
            if (r3 != 0) goto L4e5
            goto L5bf
        L4e5:
            r3 = 17
            goto L5c0
        L4e9:
            java.lang.String r3 = "H183"
            boolean r3 = r1.equals(r3)
            if (r3 != 0) goto L4f3
            goto L5bf
        L4f3:
            r3 = 16
            goto L5c0
        L4f7:
            java.lang.String r3 = "H180"
            boolean r3 = r1.equals(r3)
            if (r3 != 0) goto L501
            goto L5bf
        L501:
            r3 = 15
            goto L5c0
        L505:
            java.lang.String r3 = "H156"
            boolean r3 = r1.equals(r3)
            if (r3 != 0) goto L50f
            goto L5bf
        L50f:
            r3 = 14
            goto L5c0
        L513:
            java.lang.String r3 = "H153"
            boolean r3 = r1.equals(r3)
            if (r3 != 0) goto L51d
            goto L5bf
        L51d:
            r3 = 13
            goto L5c0
        L521:
            java.lang.String r3 = "H150"
            boolean r3 = r1.equals(r3)
            if (r3 != 0) goto L52b
            goto L5bf
        L52b:
            r3 = 12
            goto L5c0
        L52f:
            java.lang.String r3 = "H123"
            boolean r3 = r1.equals(r3)
            if (r3 != 0) goto L539
            goto L5bf
        L539:
            r3 = 11
            goto L5c0
        L53d:
            java.lang.String r3 = "H120"
            boolean r3 = r1.equals(r3)
            if (r3 != 0) goto L547
            goto L5bf
        L547:
            r3 = 10
            goto L5c0
        L54b:
            java.lang.String r3 = "L93"
            boolean r3 = r1.equals(r3)
            if (r3 != 0) goto L555
            goto L5bf
        L555:
            r3 = 9
            goto L5c0
        L559:
            java.lang.String r3 = "L90"
            boolean r3 = r1.equals(r3)
            if (r3 != 0) goto L563
            goto L5bf
        L563:
            r3 = 8
            goto L5c0
        L567:
            java.lang.String r3 = "L63"
            boolean r3 = r1.equals(r3)
            if (r3 != 0) goto L570
            goto L5bf
        L570:
            r3 = 7
            goto L5c0
        L572:
            java.lang.String r3 = "L60"
            boolean r3 = r1.equals(r3)
            if (r3 != 0) goto L57b
            goto L5bf
        L57b:
            r3 = 6
            goto L5c0
        L57d:
            java.lang.String r3 = "L30"
            boolean r3 = r1.equals(r3)
            if (r3 != 0) goto L586
            goto L5bf
        L586:
            r3 = 5
            goto L5c0
        L588:
            java.lang.String r3 = "H93"
            boolean r3 = r1.equals(r3)
            if (r3 != 0) goto L591
            goto L5bf
        L591:
            r3 = 4
            goto L5c0
        L593:
            java.lang.String r3 = "H90"
            boolean r3 = r1.equals(r3)
            if (r3 != 0) goto L59c
            goto L5bf
        L59c:
            r3 = 3
            goto L5c0
        L59e:
            java.lang.String r3 = "H63"
            boolean r3 = r1.equals(r3)
            if (r3 != 0) goto L5a7
            goto L5bf
        L5a7:
            r3 = 2
            goto L5c0
        L5a9:
            java.lang.String r3 = "H60"
            boolean r3 = r1.equals(r3)
            if (r3 != 0) goto L5b2
            goto L5bf
        L5b2:
            r3 = 1
            goto L5c0
        L5b4:
            java.lang.String r3 = "H30"
            boolean r3 = r1.equals(r3)
            if (r3 != 0) goto L5bd
            goto L5bf
        L5bd:
            r3 = 0
            goto L5c0
        L5bf:
            r3 = -1
        L5c0:
            switch(r3) {
                case 0: goto L618;
                case 1: goto L613;
                case 2: goto L60c;
                case 3: goto L609;
                case 4: goto L606;
                case 5: goto L604;
                case 6: goto L5ff;
                case 7: goto L5fc;
                case 8: goto L5f9;
                case 9: goto L5f6;
                case 10: goto L5f3;
                case 11: goto L5f0;
                case 12: goto L5ec;
                case 13: goto L5e9;
                case 14: goto L5e6;
                case 15: goto L5e3;
                case 16: goto L5e0;
                case 17: goto L5dd;
                case 18: goto L5da;
                case 19: goto L5d7;
                case 20: goto L5d4;
                case 21: goto L5d1;
                case 22: goto L5ce;
                case 23: goto L5cb;
                case 24: goto L5c8;
                case 25: goto L5c5;
                default: goto L5c3;
            }
        L5c3:
            goto L61d
        L5c5:
            r3 = 16777216(0x1000000, float:2.3509887E-38)
            goto L60e
        L5c8:
            r3 = 4194304(0x400000, float:5.877472E-39)
            goto L60e
        L5cb:
            r3 = 1048576(0x100000, float:1.469368E-39)
            goto L60e
        L5ce:
            r3 = 262144(0x40000, float:3.67342E-40)
            goto L60e
        L5d1:
            r3 = 65536(0x10000, float:9.1835E-41)
            goto L60e
        L5d4:
            r3 = 16384(0x4000, float:2.2959E-41)
            goto L60e
        L5d7:
            r3 = 4096(0x1000, float:5.74E-42)
            goto L60e
        L5da:
            r3 = 1024(0x400, float:1.435E-42)
            goto L60e
        L5dd:
            r3 = 33554432(0x2000000, float:9.403955E-38)
            goto L60e
        L5e0:
            r3 = 8388608(0x800000, float:1.1754944E-38)
            goto L60e
        L5e3:
            r3 = 2097152(0x200000, float:2.938736E-39)
            goto L60e
        L5e6:
            r3 = 524288(0x80000, float:7.34684E-40)
            goto L60e
        L5e9:
            r3 = 131072(0x20000, float:1.83671E-40)
            goto L60e
        L5ec:
            r3 = 32768(0x8000, float:4.5918E-41)
            goto L60e
        L5f0:
            r3 = 8192(0x2000, float:1.148E-41)
            goto L60e
        L5f3:
            r3 = 2048(0x800, float:2.87E-42)
            goto L60e
        L5f6:
            r3 = 256(0x100, float:3.59E-43)
            goto L60e
        L5f9:
            r3 = 64
            goto L60e
        L5fc:
            r3 = 16
            goto L60e
        L5ff:
            java.lang.Integer r3 = java.lang.Integer.valueOf(r7)
            goto L61e
        L604:
            r3 = 1
            goto L60e
        L606:
            r3 = 512(0x200, float:7.17E-43)
            goto L60e
        L609:
            r3 = 128(0x80, float:1.8E-43)
            goto L60e
        L60c:
            r3 = 32
        L60e:
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            goto L61e
        L613:
            java.lang.Integer r3 = java.lang.Integer.valueOf(r6)
            goto L61e
        L618:
            java.lang.Integer r3 = java.lang.Integer.valueOf(r8)
            goto L61e
        L61d:
            r3 = r2
        L61e:
            if (r3 != 0) goto L634
            java.lang.String r0 = "Unknown HEVC level string: "
            java.lang.String r1 = java.lang.String.valueOf(r1)
            int r3 = r1.length()
            if (r3 == 0) goto L62d
            goto L64f
        L62d:
            java.lang.String r1 = new java.lang.String
            r1.<init>(r0)
            r0 = r1
            goto L659
        L634:
            android.util.Pair r2 = new android.util.Pair
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2.<init>(r0, r3)
            goto L65c
        L63e:
            java.lang.String r1 = "Unknown HEVC profile string: "
            java.lang.String r0 = java.lang.String.valueOf(r0)
            int r3 = r0.length()
            if (r3 == 0) goto L654
            r17 = r1
            r1 = r0
            r0 = r17
        L64f:
            java.lang.String r0 = r0.concat(r1)
            goto L659
        L654:
            java.lang.String r0 = new java.lang.String
            r0.<init>(r1)
        L659:
            android.util.Log.w(r4, r0)
        L65c:
            return r2
        L65d:
            r2 = 0
            java.lang.String r0 = r0.f8893g0
            int r3 = r1.length
            java.lang.String r5 = "Ignoring malformed AVC codec string: "
            if (r3 >= r8) goto L678
            java.lang.String r0 = java.lang.String.valueOf(r0)
            int r1 = r0.length()
            if (r1 == 0) goto L671
            goto L77f
        L671:
            java.lang.String r0 = new java.lang.String
            r0.<init>(r5)
            goto L789
        L678:
            r3 = 1
            r6 = r1[r3]     // Catch: java.lang.NumberFormatException -> L774
            int r6 = r6.length()     // Catch: java.lang.NumberFormatException -> L774
            r9 = 6
            if (r6 != r9) goto L69a
            r6 = r1[r3]     // Catch: java.lang.NumberFormatException -> L774
            r9 = 0
            java.lang.String r6 = r6.substring(r9, r8)     // Catch: java.lang.NumberFormatException -> L774
            r9 = 16
            int r6 = java.lang.Integer.parseInt(r6, r9)     // Catch: java.lang.NumberFormatException -> L774
            r1 = r1[r3]     // Catch: java.lang.NumberFormatException -> L774
            java.lang.String r1 = r1.substring(r7)     // Catch: java.lang.NumberFormatException -> L774
            int r0 = java.lang.Integer.parseInt(r1, r9)     // Catch: java.lang.NumberFormatException -> L774
            goto L6ab
        L69a:
            int r3 = r1.length     // Catch: java.lang.NumberFormatException -> L774
            r6 = 3
            if (r3 < r6) goto L75c
            r3 = 1
            r3 = r1[r3]     // Catch: java.lang.NumberFormatException -> L774
            int r6 = java.lang.Integer.parseInt(r3)     // Catch: java.lang.NumberFormatException -> L774
            r1 = r1[r8]     // Catch: java.lang.NumberFormatException -> L774
            int r0 = java.lang.Integer.parseInt(r1)     // Catch: java.lang.NumberFormatException -> L774
        L6ab:
            r1 = 66
            if (r6 == r1) goto L6df
            r1 = 77
            if (r6 == r1) goto L6dd
            r1 = 88
            if (r6 == r1) goto L6da
            r1 = 100
            if (r6 == r1) goto L6d6
            r1 = 110(0x6e, float:1.54E-43)
            if (r6 == r1) goto L6d2
            r1 = 122(0x7a, float:1.71E-43)
            if (r6 == r1) goto L6ce
            r1 = 244(0xf4, float:3.42E-43)
            if (r6 == r1) goto L6ca
            r1 = -1
            r8 = -1
            goto L6e1
        L6ca:
            r1 = -1
            r8 = 64
            goto L6e1
        L6ce:
            r1 = -1
            r8 = 32
            goto L6e1
        L6d2:
            r1 = -1
            r8 = 16
            goto L6e1
        L6d6:
            r1 = -1
            r8 = 8
            goto L6e1
        L6da:
            r1 = -1
            r8 = 4
            goto L6e1
        L6dd:
            r1 = -1
            goto L6e1
        L6df:
            r1 = -1
            r8 = 1
        L6e1:
            if (r8 != r1) goto L6ed
            r0 = 32
            java.lang.String r1 = "Unknown AVC profile: "
            java.lang.String r0 = p064e.C1490d.m4039a(r0, r1, r6)
            goto L789
        L6ed:
            switch(r0) {
                case 10: goto L70a;
                case 11: goto L707;
                case 12: goto L703;
                case 13: goto L6ff;
                default: goto L6f0;
            }
        L6f0:
            switch(r0) {
                case 20: goto L715;
                case 21: goto L711;
                case 22: goto L70d;
                default: goto L6f3;
            }
        L6f3:
            switch(r0) {
                case 30: goto L721;
                case 31: goto L71d;
                case 32: goto L719;
                default: goto L6f6;
            }
        L6f6:
            switch(r0) {
                case 40: goto L72e;
                case 41: goto L72a;
                case 42: goto L725;
                default: goto L6f9;
            }
        L6f9:
            switch(r0) {
                case 50: goto L73e;
                case 51: goto L737;
                case 52: goto L732;
                default: goto L6fc;
            }
        L6fc:
            r1 = -1
            r3 = -1
            goto L743
        L6ff:
            r1 = -1
            r3 = 16
            goto L743
        L703:
            r1 = -1
            r3 = 8
            goto L743
        L707:
            r1 = -1
            r3 = 4
            goto L743
        L70a:
            r1 = -1
            r3 = 1
            goto L743
        L70d:
            r1 = -1
            r3 = 128(0x80, float:1.8E-43)
            goto L743
        L711:
            r1 = -1
            r3 = 64
            goto L743
        L715:
            r1 = -1
            r3 = 32
            goto L743
        L719:
            r1 = -1
            r3 = 1024(0x400, float:1.435E-42)
            goto L743
        L71d:
            r1 = -1
            r3 = 512(0x200, float:7.17E-43)
            goto L743
        L721:
            r1 = -1
            r3 = 256(0x100, float:3.59E-43)
            goto L743
        L725:
            r1 = 8192(0x2000, float:1.148E-41)
            r3 = 8192(0x2000, float:1.148E-41)
            goto L742
        L72a:
            r1 = -1
            r3 = 4096(0x1000, float:5.74E-42)
            goto L743
        L72e:
            r1 = -1
            r3 = 2048(0x800, float:2.87E-42)
            goto L743
        L732:
            r1 = 65536(0x10000, float:9.1835E-41)
            r3 = 65536(0x10000, float:9.1835E-41)
            goto L742
        L737:
            r1 = 32768(0x8000, float:4.5918E-41)
            r3 = 32768(0x8000, float:4.5918E-41)
            goto L742
        L73e:
            r1 = 16384(0x4000, float:2.2959E-41)
            r3 = 16384(0x4000, float:2.2959E-41)
        L742:
            r1 = -1
        L743:
            if (r3 != r1) goto L74e
            r1 = 30
            java.lang.String r3 = "Unknown AVC level: "
            java.lang.String r0 = p064e.C1490d.m4039a(r1, r3, r0)
            goto L789
        L74e:
            android.util.Pair r2 = new android.util.Pair
            java.lang.Integer r0 = java.lang.Integer.valueOf(r8)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r3)
            r2.<init>(r0, r1)
            goto L78c
        L75c:
            java.lang.String r1 = java.lang.String.valueOf(r0)     // Catch: java.lang.NumberFormatException -> L774
            int r3 = r1.length()     // Catch: java.lang.NumberFormatException -> L774
            if (r3 == 0) goto L76b
            java.lang.String r1 = r5.concat(r1)     // Catch: java.lang.NumberFormatException -> L774
            goto L770
        L76b:
            java.lang.String r1 = new java.lang.String     // Catch: java.lang.NumberFormatException -> L774
            r1.<init>(r5)     // Catch: java.lang.NumberFormatException -> L774
        L770:
            android.util.Log.w(r4, r1)     // Catch: java.lang.NumberFormatException -> L774
            goto L78c
        L774:
            java.lang.String r0 = java.lang.String.valueOf(r0)
            int r1 = r0.length()
            if (r1 == 0) goto L784
        L77f:
            java.lang.String r0 = r5.concat(r0)
            goto L789
        L784:
            java.lang.String r0 = new java.lang.String
            r0.<init>(r5)
        L789:
            android.util.Log.w(r4, r0)
        L78c:
            return r2
        L78d:
            r2 = 0
            java.lang.String r3 = r0.f8893g0
            w5.b r0 = r0.f8908v0
            int r5 = r1.length
            java.lang.String r9 = "Ignoring malformed AV1 codec string: "
            if (r5 >= r7) goto L7aa
            java.lang.String r0 = java.lang.String.valueOf(r3)
            int r1 = r0.length()
            if (r1 == 0) goto L7a3
            goto L872
        L7a3:
            java.lang.String r0 = new java.lang.String
            r0.<init>(r9)
            goto L87c
        L7aa:
            r5 = 1
            r7 = r1[r5]     // Catch: java.lang.NumberFormatException -> L867
            int r7 = java.lang.Integer.parseInt(r7)     // Catch: java.lang.NumberFormatException -> L867
            r10 = r1[r8]     // Catch: java.lang.NumberFormatException -> L867
            r11 = 0
            java.lang.String r8 = r10.substring(r11, r8)     // Catch: java.lang.NumberFormatException -> L867
            int r8 = java.lang.Integer.parseInt(r8)     // Catch: java.lang.NumberFormatException -> L867
            r10 = 3
            r1 = r1[r10]     // Catch: java.lang.NumberFormatException -> L867
            int r1 = java.lang.Integer.parseInt(r1)     // Catch: java.lang.NumberFormatException -> L867
            if (r7 == 0) goto L7cf
            r0 = 32
            java.lang.String r1 = "Unknown AV1 profile: "
            java.lang.String r0 = p064e.C1490d.m4039a(r0, r1, r7)
            goto L87c
        L7cf:
            if (r1 == r6) goto L7df
            r3 = 10
            if (r1 == r3) goto L7df
            r0 = 34
            java.lang.String r3 = "Unknown AV1 bit depth: "
            java.lang.String r0 = p064e.C1490d.m4039a(r0, r3, r1)
            goto L87c
        L7df:
            if (r1 != r6) goto L7e3
            r0 = 1
            goto L7f5
        L7e3:
            if (r0 == 0) goto L7f4
            byte[] r1 = r0.f26406b0
            if (r1 != 0) goto L7f1
            int r0 = r0.f26405a0
            r1 = 7
            if (r0 == r1) goto L7f1
            r1 = 6
            if (r0 != r1) goto L7f4
        L7f1:
            r0 = 4096(0x1000, float:5.74E-42)
            goto L7f5
        L7f4:
            r0 = 2
        L7f5:
            switch(r8) {
                case 0: goto L84c;
                case 1: goto L849;
                case 2: goto L846;
                case 3: goto L842;
                case 4: goto L83e;
                case 5: goto L83a;
                case 6: goto L836;
                case 7: goto L832;
                case 8: goto L82e;
                case 9: goto L82a;
                case 10: goto L826;
                case 11: goto L822;
                case 12: goto L81e;
                case 13: goto L81b;
                case 14: goto L818;
                case 15: goto L814;
                case 16: goto L811;
                case 17: goto L80e;
                case 18: goto L80b;
                case 19: goto L808;
                case 20: goto L805;
                case 21: goto L802;
                case 22: goto L7ff;
                case 23: goto L7fc;
                default: goto L7f8;
            }
        L7f8:
            r1 = -1
            r3 = -1
            goto L84e
        L7fc:
            r5 = 8388608(0x800000, float:1.1754944E-38)
            goto L84c
        L7ff:
            r5 = 4194304(0x400000, float:5.877472E-39)
            goto L84c
        L802:
            r5 = 2097152(0x200000, float:2.938736E-39)
            goto L84c
        L805:
            r5 = 1048576(0x100000, float:1.469368E-39)
            goto L84c
        L808:
            r5 = 524288(0x80000, float:7.34684E-40)
            goto L84c
        L80b:
            r5 = 262144(0x40000, float:3.67342E-40)
            goto L84c
        L80e:
            r5 = 131072(0x20000, float:1.83671E-40)
            goto L84c
        L811:
            r5 = 65536(0x10000, float:9.1835E-41)
            goto L84c
        L814:
            r5 = 32768(0x8000, float:4.5918E-41)
            goto L84c
        L818:
            r5 = 16384(0x4000, float:2.2959E-41)
            goto L84c
        L81b:
            r5 = 8192(0x2000, float:1.148E-41)
            goto L84c
        L81e:
            r1 = -1
            r3 = 4096(0x1000, float:5.74E-42)
            goto L84e
        L822:
            r1 = -1
            r3 = 2048(0x800, float:2.87E-42)
            goto L84e
        L826:
            r1 = -1
            r3 = 1024(0x400, float:1.435E-42)
            goto L84e
        L82a:
            r1 = -1
            r3 = 512(0x200, float:7.17E-43)
            goto L84e
        L82e:
            r1 = -1
            r3 = 256(0x100, float:3.59E-43)
            goto L84e
        L832:
            r1 = -1
            r3 = 128(0x80, float:1.8E-43)
            goto L84e
        L836:
            r1 = -1
            r3 = 64
            goto L84e
        L83a:
            r1 = -1
            r3 = 32
            goto L84e
        L83e:
            r1 = -1
            r3 = 16
            goto L84e
        L842:
            r1 = -1
            r3 = 8
            goto L84e
        L846:
            r1 = -1
            r3 = 4
            goto L84e
        L849:
            r1 = -1
            r3 = 2
            goto L84e
        L84c:
            r1 = -1
            r3 = r5
        L84e:
            if (r3 != r1) goto L859
            r0 = 30
            java.lang.String r1 = "Unknown AV1 level: "
            java.lang.String r0 = p064e.C1490d.m4039a(r0, r1, r8)
            goto L87c
        L859:
            android.util.Pair r2 = new android.util.Pair
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r3)
            r2.<init>(r0, r1)
            goto L87f
        L867:
            java.lang.String r0 = java.lang.String.valueOf(r3)
            int r1 = r0.length()
            if (r1 == 0) goto L877
        L872:
            java.lang.String r0 = r9.concat(r0)
            goto L87c
        L877:
            java.lang.String r0 = new java.lang.String
            r0.<init>(r9)
        L87c:
            android.util.Log.w(r4, r0)
        L87f:
            return r2
    }

    /* renamed from: d */
    public static p406x4.C6939m m14099d(java.lang.String r0, boolean r1, boolean r2) {
            java.util.List r0 = m14100e(r0, r1, r2)
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto Lc
            r0 = 0
            goto L13
        Lc:
            r1 = 0
            java.lang.Object r0 = r0.get(r1)
            x4.m r0 = (p406x4.C6939m) r0
        L13:
            return r0
    }

    /* renamed from: e */
    public static synchronized java.util.List<p406x4.C6939m> m14100e(java.lang.String r7, boolean r8, boolean r9) {
            java.lang.Class<x4.r> r0 = p406x4.C6944r.class
            monitor-enter(r0)
            x4.r$b r1 = new x4.r$b     // Catch: java.lang.Throwable -> L8d
            r1.<init>(r7, r8, r9)     // Catch: java.lang.Throwable -> L8d
            java.util.HashMap<x4.r$b, java.util.List<x4.m>> r2 = p406x4.C6944r.f27105b     // Catch: java.lang.Throwable -> L8d
            java.lang.Object r3 = r2.get(r1)     // Catch: java.lang.Throwable -> L8d
            java.util.List r3 = (java.util.List) r3     // Catch: java.lang.Throwable -> L8d
            if (r3 == 0) goto L14
            monitor-exit(r0)
            return r3
        L14:
            int r3 = p371v5.C6552b0.f25624a     // Catch: java.lang.Throwable -> L8d
            r4 = 0
            r5 = 21
            if (r3 < r5) goto L21
            x4.r$f r6 = new x4.r$f     // Catch: java.lang.Throwable -> L8d
            r6.<init>(r8, r9)     // Catch: java.lang.Throwable -> L8d
            goto L26
        L21:
            x4.r$e r6 = new x4.r$e     // Catch: java.lang.Throwable -> L8d
            r6.<init>(r4)     // Catch: java.lang.Throwable -> L8d
        L26:
            java.util.ArrayList r9 = m14101f(r1, r6)     // Catch: java.lang.Throwable -> L8d
            if (r8 == 0) goto L81
            boolean r8 = r9.isEmpty()     // Catch: java.lang.Throwable -> L8d
            if (r8 == 0) goto L81
            if (r5 > r3) goto L81
            r8 = 23
            if (r3 > r8) goto L81
            x4.r$e r8 = new x4.r$e     // Catch: java.lang.Throwable -> L8d
            r8.<init>(r4)     // Catch: java.lang.Throwable -> L8d
            java.util.ArrayList r9 = m14101f(r1, r8)     // Catch: java.lang.Throwable -> L8d
            boolean r8 = r9.isEmpty()     // Catch: java.lang.Throwable -> L8d
            if (r8 != 0) goto L81
            java.lang.String r8 = "MediaCodecUtil"
            r3 = 0
            java.lang.Object r3 = r9.get(r3)     // Catch: java.lang.Throwable -> L8d
            x4.m r3 = (p406x4.C6939m) r3     // Catch: java.lang.Throwable -> L8d
            java.lang.String r3 = r3.f27019a     // Catch: java.lang.Throwable -> L8d
            java.lang.String r4 = java.lang.String.valueOf(r7)     // Catch: java.lang.Throwable -> L8d
            int r4 = r4.length()     // Catch: java.lang.Throwable -> L8d
            int r4 = r4 + 63
            java.lang.String r5 = java.lang.String.valueOf(r3)     // Catch: java.lang.Throwable -> L8d
            int r5 = r5.length()     // Catch: java.lang.Throwable -> L8d
            int r4 = r4 + r5
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L8d
            r5.<init>(r4)     // Catch: java.lang.Throwable -> L8d
            java.lang.String r4 = "MediaCodecList API didn't list secure decoder for: "
            r5.append(r4)     // Catch: java.lang.Throwable -> L8d
            r5.append(r7)     // Catch: java.lang.Throwable -> L8d
            java.lang.String r4 = ". Assuming: "
            r5.append(r4)     // Catch: java.lang.Throwable -> L8d
            r5.append(r3)     // Catch: java.lang.Throwable -> L8d
            java.lang.String r3 = r5.toString()     // Catch: java.lang.Throwable -> L8d
            android.util.Log.w(r8, r3)     // Catch: java.lang.Throwable -> L8d
        L81:
            m14096a(r7, r9)     // Catch: java.lang.Throwable -> L8d
            java.util.List r7 = java.util.Collections.unmodifiableList(r9)     // Catch: java.lang.Throwable -> L8d
            r2.put(r1, r7)     // Catch: java.lang.Throwable -> L8d
            monitor-exit(r0)
            return r7
        L8d:
            r7 = move-exception
            monitor-exit(r0)
            throw r7
    }

    /* renamed from: f */
    public static java.util.ArrayList<p406x4.C6939m> m14101f(p406x4.C6944r.b r25, p406x4.C6944r.d r26) {
            r1 = r25
            r2 = r26
            java.lang.String r3 = "secure-playback"
            java.lang.String r4 = "tunneled-playback"
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch: java.lang.Exception -> L195
            r5.<init>()     // Catch: java.lang.Exception -> L195
            java.lang.String r15 = r1.f27107a     // Catch: java.lang.Exception -> L195
            int r14 = r26.mo14108c()     // Catch: java.lang.Exception -> L195
            boolean r13 = r26.mo14110e()     // Catch: java.lang.Exception -> L195
            r16 = 0
            r12 = 0
        L1a:
            if (r12 >= r14) goto L194
            android.media.MediaCodecInfo r0 = r2.mo14106a(r12)     // Catch: java.lang.Exception -> L195
            int r6 = p371v5.C6552b0.f25624a     // Catch: java.lang.Exception -> L195
            r7 = 29
            if (r6 < r7) goto L2e
            boolean r9 = r0.isAlias()     // Catch: java.lang.Exception -> L195
            if (r9 == 0) goto L2e
            r9 = 1
            goto L2f
        L2e:
            r9 = 0
        L2f:
            if (r9 == 0) goto L32
            goto L6d
        L32:
            java.lang.String r11 = r0.getName()     // Catch: java.lang.Exception -> L195
            boolean r9 = m14102g(r0, r11, r13, r15)     // Catch: java.lang.Exception -> L195
            if (r9 != 0) goto L3d
            goto L6d
        L3d:
            java.lang.String r10 = m14097b(r0, r11, r15)     // Catch: java.lang.Exception -> L195
            if (r10 != 0) goto L44
            goto L6d
        L44:
            android.media.MediaCodecInfo$CodecCapabilities r9 = r0.getCapabilitiesForType(r10)     // Catch: java.lang.Exception -> L119
            boolean r17 = r2.mo14109d(r4, r10, r9)     // Catch: java.lang.Exception -> L119
            boolean r18 = r2.mo14107b(r4, r10, r9)     // Catch: java.lang.Exception -> L119
            boolean r8 = r1.f27109c     // Catch: java.lang.Exception -> L119
            if (r8 != 0) goto L56
            if (r18 != 0) goto L6d
        L56:
            if (r8 == 0) goto L5b
            if (r17 != 0) goto L5b
            goto L6d
        L5b:
            boolean r8 = r2.mo14109d(r3, r10, r9)     // Catch: java.lang.Exception -> L119
            boolean r17 = r2.mo14107b(r3, r10, r9)     // Catch: java.lang.Exception -> L119
            boolean r7 = r1.f27108b     // Catch: java.lang.Exception -> L119
            if (r7 != 0) goto L69
            if (r17 != 0) goto L6d
        L69:
            if (r7 == 0) goto L75
            if (r8 != 0) goto L75
        L6d:
            r23 = r12
            r24 = r13
            r17 = r14
            goto L157
        L75:
            r7 = 29
            if (r6 < r7) goto L82
            boolean r7 = r0.isHardwareAccelerated()     // Catch: java.lang.Exception -> L119
            r19 = r7
            r17 = 1
            goto L8c
        L82:
            boolean r7 = m14103h(r0)     // Catch: java.lang.Exception -> L119
            r17 = 1
            r7 = r7 ^ 1
            r19 = r7
        L8c:
            boolean r20 = m14103h(r0)     // Catch: java.lang.Exception -> L119
            r7 = 29
            if (r6 < r7) goto L99
            boolean r0 = r0.isVendor()     // Catch: java.lang.Exception -> L119
            goto Lbe
        L99:
            java.lang.String r0 = r0.getName()     // Catch: java.lang.Exception -> L119
            java.lang.String r0 = p185k7.C3836i.m8629n(r0)     // Catch: java.lang.Exception -> L119
            java.lang.String r6 = "omx.google."
            boolean r6 = r0.startsWith(r6)     // Catch: java.lang.Exception -> L119
            if (r6 != 0) goto Lba
            java.lang.String r6 = "c2.android."
            boolean r6 = r0.startsWith(r6)     // Catch: java.lang.Exception -> L119
            if (r6 != 0) goto Lba
            java.lang.String r6 = "c2.google."
            boolean r0 = r0.startsWith(r6)     // Catch: java.lang.Exception -> L119
            if (r0 != 0) goto Lba
            goto Lbc
        Lba:
            r17 = 0
        Lbc:
            r0 = r17
        Lbe:
            if (r13 == 0) goto Lc4
            boolean r6 = r1.f27108b     // Catch: java.lang.Exception -> L119
            if (r6 == r8) goto Lca
        Lc4:
            if (r13 != 0) goto Led
            boolean r6 = r1.f27108b     // Catch: java.lang.Exception -> L119
            if (r6 != 0) goto Led
        Lca:
            r17 = 0
            r18 = 0
            r6 = r11
            r7 = r15
            r8 = r10
            r21 = r10
            r10 = r19
            r22 = r11
            r11 = r20
            r23 = r12
            r12 = r0
            r24 = r13
            r13 = r17
            r17 = r14
            r14 = r18
            x4.m r0 = p406x4.C6939m.m14064i(r6, r7, r8, r9, r10, r11, r12, r13, r14)     // Catch: java.lang.Exception -> L117
            r5.add(r0)     // Catch: java.lang.Exception -> L117
            goto L157
        Led:
            r21 = r10
            r22 = r11
            r23 = r12
            r24 = r13
            r17 = r14
            if (r24 != 0) goto L157
            if (r8 == 0) goto L157
            java.lang.String r6 = java.lang.String.valueOf(r22)     // Catch: java.lang.Exception -> L117
            java.lang.String r7 = ".secure"
            java.lang.String r6 = r6.concat(r7)     // Catch: java.lang.Exception -> L117
            r13 = 0
            r14 = 1
            r7 = r15
            r8 = r21
            r10 = r19
            r11 = r20
            r12 = r0
            x4.m r0 = p406x4.C6939m.m14064i(r6, r7, r8, r9, r10, r11, r12, r13, r14)     // Catch: java.lang.Exception -> L117
            r5.add(r0)     // Catch: java.lang.Exception -> L117
            return r5
        L117:
            r0 = move-exception
            goto L124
        L119:
            r0 = move-exception
            r21 = r10
            r22 = r11
            r23 = r12
            r24 = r13
            r17 = r14
        L124:
            int r6 = p371v5.C6552b0.f25624a     // Catch: java.lang.Exception -> L195
            r7 = 23
            java.lang.String r8 = "MediaCodecUtil"
            if (r6 > r7) goto L15f
            boolean r6 = r5.isEmpty()     // Catch: java.lang.Exception -> L195
            if (r6 != 0) goto L15f
            java.lang.String r0 = java.lang.String.valueOf(r22)     // Catch: java.lang.Exception -> L195
            int r0 = r0.length()     // Catch: java.lang.Exception -> L195
            int r0 = r0 + 46
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L195
            r6.<init>(r0)     // Catch: java.lang.Exception -> L195
            java.lang.String r0 = "Skipping codec "
            r6.append(r0)     // Catch: java.lang.Exception -> L195
            r7 = r22
            r6.append(r7)     // Catch: java.lang.Exception -> L195
            java.lang.String r0 = " (failed to query capabilities)"
            r6.append(r0)     // Catch: java.lang.Exception -> L195
            java.lang.String r0 = r6.toString()     // Catch: java.lang.Exception -> L195
            android.util.Log.e(r8, r0)     // Catch: java.lang.Exception -> L195
        L157:
            int r12 = r23 + 1
            r14 = r17
            r13 = r24
            goto L1a
        L15f:
            r7 = r22
            java.lang.String r1 = java.lang.String.valueOf(r7)     // Catch: java.lang.Exception -> L195
            int r1 = r1.length()     // Catch: java.lang.Exception -> L195
            int r1 = r1 + 25
            int r2 = r21.length()     // Catch: java.lang.Exception -> L195
            int r1 = r1 + r2
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L195
            r2.<init>(r1)     // Catch: java.lang.Exception -> L195
            java.lang.String r1 = "Failed to query codec "
            r2.append(r1)     // Catch: java.lang.Exception -> L195
            r2.append(r7)     // Catch: java.lang.Exception -> L195
            java.lang.String r1 = " ("
            r2.append(r1)     // Catch: java.lang.Exception -> L195
            r1 = r21
            r2.append(r1)     // Catch: java.lang.Exception -> L195
            java.lang.String r1 = ")"
            r2.append(r1)     // Catch: java.lang.Exception -> L195
            java.lang.String r1 = r2.toString()     // Catch: java.lang.Exception -> L195
            android.util.Log.e(r8, r1)     // Catch: java.lang.Exception -> L195
            throw r0     // Catch: java.lang.Exception -> L195
        L194:
            return r5
        L195:
            r0 = move-exception
            x4.r$c r1 = new x4.r$c
            r2 = 0
            r1.<init>(r0, r2)
            throw r1
    }

    /* renamed from: g */
    public static boolean m14102g(android.media.MediaCodecInfo r4, java.lang.String r5, boolean r6, java.lang.String r7) {
            boolean r4 = r4.isEncoder()
            r0 = 0
            if (r4 != 0) goto L1d5
            if (r6 != 0) goto L13
            java.lang.String r4 = ".secure"
            boolean r4 = r5.endsWith(r4)
            if (r4 == 0) goto L13
            goto L1d5
        L13:
            int r4 = p371v5.C6552b0.f25624a
            r6 = 21
            if (r4 >= r6) goto L4a
            java.lang.String r6 = "CIPAACDecoder"
            boolean r6 = r6.equals(r5)
            if (r6 != 0) goto L49
            java.lang.String r6 = "CIPMP3Decoder"
            boolean r6 = r6.equals(r5)
            if (r6 != 0) goto L49
            java.lang.String r6 = "CIPVorbisDecoder"
            boolean r6 = r6.equals(r5)
            if (r6 != 0) goto L49
            java.lang.String r6 = "CIPAMRNBDecoder"
            boolean r6 = r6.equals(r5)
            if (r6 != 0) goto L49
            java.lang.String r6 = "AACDecoder"
            boolean r6 = r6.equals(r5)
            if (r6 != 0) goto L49
            java.lang.String r6 = "MP3Decoder"
            boolean r6 = r6.equals(r5)
            if (r6 == 0) goto L4a
        L49:
            return r0
        L4a:
            r6 = 18
            if (r4 >= r6) goto L73
            java.lang.String r6 = "OMX.MTK.AUDIO.DECODER.AAC"
            boolean r6 = r6.equals(r5)
            if (r6 == 0) goto L73
            java.lang.String r6 = p371v5.C6552b0.f25625b
            java.lang.String r1 = "a70"
            boolean r1 = r1.equals(r6)
            if (r1 != 0) goto L72
            java.lang.String r1 = p371v5.C6552b0.f25626c
            java.lang.String r2 = "Xiaomi"
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L73
            java.lang.String r1 = "HM"
            boolean r6 = r6.startsWith(r1)
            if (r6 == 0) goto L73
        L72:
            return r0
        L73:
            r6 = 16
            if (r4 != r6) goto Le2
            java.lang.String r1 = "OMX.qcom.audio.decoder.mp3"
            boolean r1 = r1.equals(r5)
            if (r1 == 0) goto Le2
            java.lang.String r1 = p371v5.C6552b0.f25625b
            java.lang.String r2 = "dlxu"
            boolean r2 = r2.equals(r1)
            if (r2 != 0) goto Le1
            java.lang.String r2 = "protou"
            boolean r2 = r2.equals(r1)
            if (r2 != 0) goto Le1
            java.lang.String r2 = "ville"
            boolean r2 = r2.equals(r1)
            if (r2 != 0) goto Le1
            java.lang.String r2 = "villeplus"
            boolean r2 = r2.equals(r1)
            if (r2 != 0) goto Le1
            java.lang.String r2 = "villec2"
            boolean r2 = r2.equals(r1)
            if (r2 != 0) goto Le1
            java.lang.String r2 = "gee"
            boolean r2 = r1.startsWith(r2)
            if (r2 != 0) goto Le1
            java.lang.String r2 = "C6602"
            boolean r2 = r2.equals(r1)
            if (r2 != 0) goto Le1
            java.lang.String r2 = "C6603"
            boolean r2 = r2.equals(r1)
            if (r2 != 0) goto Le1
            java.lang.String r2 = "C6606"
            boolean r2 = r2.equals(r1)
            if (r2 != 0) goto Le1
            java.lang.String r2 = "C6616"
            boolean r2 = r2.equals(r1)
            if (r2 != 0) goto Le1
            java.lang.String r2 = "L36h"
            boolean r2 = r2.equals(r1)
            if (r2 != 0) goto Le1
            java.lang.String r2 = "SO-02E"
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto Le2
        Le1:
            return r0
        Le2:
            if (r4 != r6) goto L10f
            java.lang.String r6 = "OMX.qcom.audio.decoder.aac"
            boolean r6 = r6.equals(r5)
            if (r6 == 0) goto L10f
            java.lang.String r6 = p371v5.C6552b0.f25625b
            java.lang.String r1 = "C1504"
            boolean r1 = r1.equals(r6)
            if (r1 != 0) goto L10e
            java.lang.String r1 = "C1505"
            boolean r1 = r1.equals(r6)
            if (r1 != 0) goto L10e
            java.lang.String r1 = "C1604"
            boolean r1 = r1.equals(r6)
            if (r1 != 0) goto L10e
            java.lang.String r1 = "C1605"
            boolean r6 = r1.equals(r6)
            if (r6 == 0) goto L10f
        L10e:
            return r0
        L10f:
            r6 = 24
            java.lang.String r1 = "samsung"
            if (r4 >= r6) goto L170
            java.lang.String r6 = "OMX.SEC.aac.dec"
            boolean r6 = r6.equals(r5)
            if (r6 != 0) goto L125
            java.lang.String r6 = "OMX.Exynos.AAC.Decoder"
            boolean r6 = r6.equals(r5)
            if (r6 == 0) goto L170
        L125:
            java.lang.String r6 = p371v5.C6552b0.f25626c
            boolean r6 = r1.equals(r6)
            if (r6 == 0) goto L170
            java.lang.String r6 = p371v5.C6552b0.f25625b
            java.lang.String r2 = "zeroflte"
            boolean r2 = r6.startsWith(r2)
            if (r2 != 0) goto L16f
            java.lang.String r2 = "zerolte"
            boolean r2 = r6.startsWith(r2)
            if (r2 != 0) goto L16f
            java.lang.String r2 = "zenlte"
            boolean r2 = r6.startsWith(r2)
            if (r2 != 0) goto L16f
            java.lang.String r2 = "SC-05G"
            boolean r2 = r2.equals(r6)
            if (r2 != 0) goto L16f
            java.lang.String r2 = "marinelteatt"
            boolean r2 = r2.equals(r6)
            if (r2 != 0) goto L16f
            java.lang.String r2 = "404SC"
            boolean r2 = r2.equals(r6)
            if (r2 != 0) goto L16f
            java.lang.String r2 = "SC-04G"
            boolean r2 = r2.equals(r6)
            if (r2 != 0) goto L16f
            java.lang.String r2 = "SCV31"
            boolean r6 = r2.equals(r6)
            if (r6 == 0) goto L170
        L16f:
            return r0
        L170:
            java.lang.String r6 = "jflte"
            r2 = 19
            if (r4 > r2) goto L1af
            java.lang.String r3 = "OMX.SEC.vp8.dec"
            boolean r3 = r3.equals(r5)
            if (r3 == 0) goto L1af
            java.lang.String r3 = p371v5.C6552b0.f25626c
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L1af
            java.lang.String r1 = p371v5.C6552b0.f25625b
            java.lang.String r3 = "d2"
            boolean r3 = r1.startsWith(r3)
            if (r3 != 0) goto L1ae
            java.lang.String r3 = "serrano"
            boolean r3 = r1.startsWith(r3)
            if (r3 != 0) goto L1ae
            boolean r3 = r1.startsWith(r6)
            if (r3 != 0) goto L1ae
            java.lang.String r3 = "santos"
            boolean r3 = r1.startsWith(r3)
            if (r3 != 0) goto L1ae
            java.lang.String r3 = "t0"
            boolean r1 = r1.startsWith(r3)
            if (r1 == 0) goto L1af
        L1ae:
            return r0
        L1af:
            if (r4 > r2) goto L1c2
            java.lang.String r4 = p371v5.C6552b0.f25625b
            boolean r4 = r4.startsWith(r6)
            if (r4 == 0) goto L1c2
            java.lang.String r4 = "OMX.qcom.video.decoder.vp8"
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L1c2
            return r0
        L1c2:
            java.lang.String r4 = "audio/eac3-joc"
            boolean r4 = r4.equals(r7)
            if (r4 == 0) goto L1d3
            java.lang.String r4 = "OMX.MTK.AUDIO.DECODER.DSPAC3"
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L1d3
            return r0
        L1d3:
            r4 = 1
            return r4
        L1d5:
            return r0
    }

    /* renamed from: h */
    public static boolean m14103h(android.media.MediaCodecInfo r2) {
            int r0 = p371v5.C6552b0.f25624a
            r1 = 29
            if (r0 < r1) goto Lb
            boolean r2 = r2.isSoftwareOnly()
            return r2
        Lb:
            java.lang.String r2 = r2.getName()
            java.lang.String r2 = p185k7.C3836i.m8629n(r2)
            java.lang.String r0 = "arc."
            boolean r0 = r2.startsWith(r0)
            r1 = 0
            if (r0 == 0) goto L1d
            return r1
        L1d:
            java.lang.String r0 = "omx.google."
            boolean r0 = r2.startsWith(r0)
            if (r0 != 0) goto L65
            java.lang.String r0 = "omx.ffmpeg."
            boolean r0 = r2.startsWith(r0)
            if (r0 != 0) goto L65
            java.lang.String r0 = "omx.sec."
            boolean r0 = r2.startsWith(r0)
            if (r0 == 0) goto L3d
            java.lang.String r0 = ".sw."
            boolean r0 = r2.contains(r0)
            if (r0 != 0) goto L65
        L3d:
            java.lang.String r0 = "omx.qcom.video.decoder.hevcswvdec"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L65
            java.lang.String r0 = "c2.android."
            boolean r0 = r2.startsWith(r0)
            if (r0 != 0) goto L65
            java.lang.String r0 = "c2.google."
            boolean r0 = r2.startsWith(r0)
            if (r0 != 0) goto L65
            java.lang.String r0 = "omx."
            boolean r0 = r2.startsWith(r0)
            if (r0 != 0) goto L66
            java.lang.String r0 = "c2."
            boolean r2 = r2.startsWith(r0)
            if (r2 != 0) goto L66
        L65:
            r1 = 1
        L66:
            return r1
    }

    /* renamed from: i */
    public static int m14104i() {
            int r0 = p406x4.C6944r.f27106c
            r1 = -1
            if (r0 != r1) goto L64
            java.lang.String r0 = "video/avc"
            r2 = 0
            x4.m r0 = m14099d(r0, r2, r2)
            if (r0 == 0) goto L62
            android.media.MediaCodecInfo$CodecProfileLevel[] r0 = r0.m14066d()
            int r3 = r0.length
            r4 = 0
        L14:
            if (r2 >= r3) goto L51
            r5 = r0[r2]
            int r5 = r5.level
            r6 = 1
            if (r5 == r6) goto L48
            r6 = 2
            if (r5 == r6) goto L48
            switch(r5) {
                case 8: goto L44;
                case 16: goto L44;
                case 32: goto L44;
                case 64: goto L40;
                case 128: goto L3c;
                case 256: goto L3c;
                case 512: goto L38;
                case 1024: goto L35;
                case 2048: goto L32;
                case 4096: goto L32;
                case 8192: goto L2f;
                case 16384: goto L2b;
                case 32768: goto L28;
                case 65536: goto L28;
                case 131072: goto L25;
                case 262144: goto L25;
                case 524288: goto L25;
                default: goto L23;
            }
        L23:
            r5 = -1
            goto L4a
        L25:
            r5 = 35651584(0x2200000, float:1.1754944E-37)
            goto L4a
        L28:
            r5 = 9437184(0x900000, float:1.3224311E-38)
            goto L4a
        L2b:
            r5 = 5652480(0x564000, float:7.920812E-39)
            goto L4a
        L2f:
            r5 = 2228224(0x220000, float:3.122407E-39)
            goto L4a
        L32:
            r5 = 2097152(0x200000, float:2.938736E-39)
            goto L4a
        L35:
            r5 = 1310720(0x140000, float:1.83671E-39)
            goto L4a
        L38:
            r5 = 921600(0xe1000, float:1.291437E-39)
            goto L4a
        L3c:
            r5 = 414720(0x65400, float:5.81146E-40)
            goto L4a
        L40:
            r5 = 202752(0x31800, float:2.84116E-40)
            goto L4a
        L44:
            r5 = 101376(0x18c00, float:1.42058E-40)
            goto L4a
        L48:
            r5 = 25344(0x6300, float:3.5515E-41)
        L4a:
            int r4 = java.lang.Math.max(r5, r4)
            int r2 = r2 + 1
            goto L14
        L51:
            int r0 = p371v5.C6552b0.f25624a
            r1 = 21
            if (r0 < r1) goto L5b
            r0 = 345600(0x54600, float:4.84289E-40)
            goto L5e
        L5b:
            r0 = 172800(0x2a300, float:2.42144E-40)
        L5e:
            int r2 = java.lang.Math.max(r4, r0)
        L62:
            p406x4.C6944r.f27106c = r2
        L64:
            int r0 = p406x4.C6944r.f27106c
            return r0
    }

    /* renamed from: j */
    public static <T> void m14105j(java.util.List<T> r1, p406x4.C6944r.g<T> r2) {
            x4.q r0 = new x4.q
            r0.<init>(r2)
            java.util.Collections.sort(r1, r0)
            return
    }
}
