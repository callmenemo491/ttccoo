package p406x4;

/* renamed from: x4.m */
/* loaded from: classes.dex */
public final class C6939m {

    /* renamed from: a */
    public final java.lang.String f27019a;

    /* renamed from: b */
    public final java.lang.String f27020b;

    /* renamed from: c */
    public final java.lang.String f27021c;

    /* renamed from: d */
    public final android.media.MediaCodecInfo.CodecCapabilities f27022d;

    /* renamed from: e */
    public final boolean f27023e;

    /* renamed from: f */
    public final boolean f27024f;

    /* renamed from: g */
    public final boolean f27025g;

    public C6939m(java.lang.String r1, java.lang.String r2, java.lang.String r3, android.media.MediaCodecInfo.CodecCapabilities r4, boolean r5, boolean r6, boolean r7, boolean r8, boolean r9, boolean r10) {
            r0 = this;
            r0.<init>()
            java.util.Objects.requireNonNull(r1)
            r0.f27019a = r1
            r0.f27020b = r2
            r0.f27021c = r3
            r0.f27022d = r4
            r0.f27023e = r8
            r0.f27024f = r10
            boolean r1 = p371v5.C6567q.m13380j(r2)
            r0.f27025g = r1
            return
    }

    /* renamed from: a */
    public static android.graphics.Point m14062a(android.media.MediaCodecInfo.VideoCapabilities r2, int r3, int r4) {
            int r0 = r2.getWidthAlignment()
            int r2 = r2.getHeightAlignment()
            android.graphics.Point r1 = new android.graphics.Point
            int r3 = p371v5.C6552b0.m13313f(r3, r0)
            int r3 = r3 * r0
            int r4 = p371v5.C6552b0.m13313f(r4, r2)
            int r4 = r4 * r2
            r1.<init>(r3, r4)
            return r1
    }

    /* renamed from: b */
    public static boolean m14063b(android.media.MediaCodecInfo.VideoCapabilities r3, int r4, int r5, double r6) {
            android.graphics.Point r4 = m14062a(r3, r4, r5)
            int r5 = r4.x
            int r4 = r4.y
            r0 = -4616189618054758400(0xbff0000000000000, double:-1.0)
            int r2 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r2 == 0) goto L1e
            r0 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            int r2 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r2 >= 0) goto L15
            goto L1e
        L15:
            double r6 = java.lang.Math.floor(r6)
            boolean r3 = r3.areSizeAndRateSupported(r5, r4, r6)
            return r3
        L1e:
            boolean r3 = r3.isSizeSupported(r5, r4)
            return r3
    }

    /* renamed from: i */
    public static p406x4.C6939m m14064i(java.lang.String r12, java.lang.String r13, java.lang.String r14, android.media.MediaCodecInfo.CodecCapabilities r15, boolean r16, boolean r17, boolean r18, boolean r19, boolean r20) {
            r1 = r12
            r4 = r15
            x4.m r11 = new x4.m
            r0 = 1
            r2 = 0
            if (r19 != 0) goto L4a
            if (r4 == 0) goto L4a
            int r3 = p371v5.C6552b0.f25624a
            r5 = 19
            if (r3 < r5) goto L1a
            java.lang.String r5 = "adaptive-playback"
            boolean r5 = r15.isFeatureSupported(r5)
            if (r5 == 0) goto L1a
            r5 = 1
            goto L1b
        L1a:
            r5 = 0
        L1b:
            if (r5 == 0) goto L4a
            r5 = 22
            if (r3 > r5) goto L45
            java.lang.String r3 = p371v5.C6552b0.f25627d
            java.lang.String r5 = "ODROID-XU3"
            boolean r5 = r5.equals(r3)
            if (r5 != 0) goto L33
            java.lang.String r5 = "Nexus 10"
            boolean r3 = r5.equals(r3)
            if (r3 == 0) goto L45
        L33:
            java.lang.String r3 = "OMX.Exynos.AVC.Decoder"
            boolean r3 = r3.equals(r12)
            if (r3 != 0) goto L43
            java.lang.String r3 = "OMX.Exynos.AVC.Decoder.secure"
            boolean r3 = r3.equals(r12)
            if (r3 == 0) goto L45
        L43:
            r3 = 1
            goto L46
        L45:
            r3 = 0
        L46:
            if (r3 != 0) goto L4a
            r8 = 1
            goto L4b
        L4a:
            r8 = 0
        L4b:
            r3 = 21
            if (r4 == 0) goto L62
            int r5 = p371v5.C6552b0.f25624a
            if (r5 < r3) goto L5d
            java.lang.String r5 = "tunneled-playback"
            boolean r5 = r15.isFeatureSupported(r5)
            if (r5 == 0) goto L5d
            r5 = 1
            goto L5e
        L5d:
            r5 = 0
        L5e:
            if (r5 == 0) goto L62
            r9 = 1
            goto L63
        L62:
            r9 = 0
        L63:
            if (r20 != 0) goto L7b
            if (r4 == 0) goto L79
            int r5 = p371v5.C6552b0.f25624a
            if (r5 < r3) goto L75
            java.lang.String r3 = "secure-playback"
            boolean r3 = r15.isFeatureSupported(r3)
            if (r3 == 0) goto L75
            r3 = 1
            goto L76
        L75:
            r3 = 0
        L76:
            if (r3 == 0) goto L79
            goto L7b
        L79:
            r10 = 0
            goto L7c
        L7b:
            r10 = 1
        L7c:
            r0 = r11
            r1 = r12
            r2 = r13
            r3 = r14
            r4 = r15
            r5 = r16
            r6 = r17
            r7 = r18
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            return r11
    }

    /* renamed from: c */
    public p142i4.C3075i m14065c(p088f4.C2003e0 r14, p088f4.C2003e0 r15) {
            r13 = this;
            java.lang.String r0 = r14.f8896j0
            java.lang.String r1 = r15.f8896j0
            boolean r0 = p371v5.C6552b0.m13308a(r0, r1)
            r1 = 0
            if (r0 != 0) goto Le
            r0 = 8
            goto Lf
        Le:
            r0 = 0
        Lf:
            boolean r2 = r13.f27025g
            if (r2 == 0) goto L74
            int r2 = r14.f8904r0
            int r3 = r15.f8904r0
            if (r2 == r3) goto L1b
            r0 = r0 | 1024(0x400, float:1.435E-42)
        L1b:
            boolean r2 = r13.f27023e
            if (r2 != 0) goto L2d
            int r2 = r14.f8901o0
            int r3 = r15.f8901o0
            if (r2 != r3) goto L2b
            int r2 = r14.f8902p0
            int r3 = r15.f8902p0
            if (r2 == r3) goto L2d
        L2b:
            r0 = r0 | 512(0x200, float:7.17E-43)
        L2d:
            w5.b r2 = r14.f8908v0
            w5.b r3 = r15.f8908v0
            boolean r2 = p371v5.C6552b0.m13308a(r2, r3)
            if (r2 != 0) goto L39
            r0 = r0 | 2048(0x800, float:2.87E-42)
        L39:
            java.lang.String r2 = r13.f27019a
            java.lang.String r3 = p371v5.C6552b0.f25627d
            java.lang.String r4 = "SM-T230"
            boolean r3 = r3.startsWith(r4)
            if (r3 == 0) goto L4e
            java.lang.String r3 = "OMX.MARVELL.VIDEO.HW.CODA7542DECODER"
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L4e
            r1 = 1
        L4e:
            if (r1 == 0) goto L58
            boolean r1 = r14.m5192c(r15)
            if (r1 != 0) goto L58
            r0 = r0 | 2
        L58:
            if (r0 != 0) goto L71
            i4.i r0 = new i4.i
            java.lang.String r2 = r13.f27019a
            boolean r1 = r14.m5192c(r15)
            if (r1 == 0) goto L67
            r1 = 3
            r5 = 3
            goto L69
        L67:
            r1 = 2
            r5 = 2
        L69:
            r6 = 0
            r1 = r0
            r3 = r14
            r4 = r15
            r1.<init>(r2, r3, r4, r5, r6)
            return r0
        L71:
            r12 = r0
            goto Lea
        L74:
            int r1 = r14.f8909w0
            int r2 = r15.f8909w0
            if (r1 == r2) goto L7c
            r0 = r0 | 4096(0x1000, float:5.74E-42)
        L7c:
            int r1 = r14.f8910x0
            int r2 = r15.f8910x0
            if (r1 == r2) goto L84
            r0 = r0 | 8192(0x2000, float:1.148E-41)
        L84:
            int r1 = r14.f8911y0
            int r2 = r15.f8911y0
            if (r1 == r2) goto L8c
            r0 = r0 | 16384(0x4000, float:2.2959E-41)
        L8c:
            if (r0 != 0) goto Lc7
            java.lang.String r1 = r13.f27020b
            java.lang.String r2 = "audio/mp4a-latm"
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto Lc7
            android.util.Pair r1 = p406x4.C6944r.m14098c(r14)
            android.util.Pair r2 = p406x4.C6944r.m14098c(r15)
            if (r1 == 0) goto Lc7
            if (r2 == 0) goto Lc7
            java.lang.Object r1 = r1.first
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            java.lang.Object r2 = r2.first
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r3 = 42
            if (r1 != r3) goto Lc7
            if (r2 != r3) goto Lc7
            i4.i r0 = new i4.i
            java.lang.String r5 = r13.f27019a
            r8 = 3
            r9 = 0
            r4 = r0
            r6 = r14
            r7 = r15
            r4.<init>(r5, r6, r7, r8, r9)
            return r0
        Lc7:
            boolean r1 = r14.m5192c(r15)
            if (r1 != 0) goto Lcf
            r0 = r0 | 32
        Lcf:
            java.lang.String r1 = r13.f27020b
            java.lang.String r2 = "audio/opus"
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto Ldb
            r0 = r0 | 2
        Ldb:
            if (r0 != 0) goto L71
            i4.i r0 = new i4.i
            java.lang.String r2 = r13.f27019a
            r5 = 1
            r6 = 0
            r1 = r0
            r3 = r14
            r4 = r15
            r1.<init>(r2, r3, r4, r5, r6)
            return r0
        Lea:
            i4.i r0 = new i4.i
            java.lang.String r8 = r13.f27019a
            r11 = 0
            r7 = r0
            r9 = r14
            r10 = r15
            r7.<init>(r8, r9, r10, r11, r12)
            return r0
    }

    /* renamed from: d */
    public android.media.MediaCodecInfo.CodecProfileLevel[] m14066d() {
            r1 = this;
            android.media.MediaCodecInfo$CodecCapabilities r0 = r1.f27022d
            if (r0 == 0) goto L8
            android.media.MediaCodecInfo$CodecProfileLevel[] r0 = r0.profileLevels
            if (r0 != 0) goto Lb
        L8:
            r0 = 0
            android.media.MediaCodecInfo$CodecProfileLevel[] r0 = new android.media.MediaCodecInfo.CodecProfileLevel[r0]
        Lb:
            return r0
    }

    /* renamed from: e */
    public boolean m14067e(p088f4.C2003e0 r12) {
            r11 = this;
            java.lang.String r0 = r12.f8893g0
            r1 = 16
            r2 = 0
            r3 = 1
            if (r0 == 0) goto L120
            java.lang.String r4 = r11.f27020b
            if (r4 != 0) goto Le
            goto L120
        Le:
            java.lang.String r0 = p371v5.C6567q.m13373c(r0)
            if (r0 != 0) goto L16
            goto L120
        L16:
            java.lang.String r4 = r11.f27020b
            boolean r4 = r4.equals(r0)
            if (r4 != 0) goto L34
            java.lang.String r4 = r12.f8893g0
            r5 = 13
            int r5 = p064e.C1489c.m4038a(r4, r5)
            int r6 = r0.length()
            int r6 = r6 + r5
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>(r6)
            java.lang.String r6 = "codec.mime "
            goto L109
        L34:
            android.util.Pair r4 = p406x4.C6944r.m14098c(r12)
            if (r4 != 0) goto L3c
            goto L120
        L3c:
            java.lang.Object r5 = r4.first
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            java.lang.Object r4 = r4.second
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            boolean r6 = r11.f27025g
            if (r6 != 0) goto L56
            r6 = 42
            if (r5 == r6) goto L56
            goto L120
        L56:
            android.media.MediaCodecInfo$CodecProfileLevel[] r6 = r11.m14066d()
            int r7 = p371v5.C6552b0.f25624a
            r8 = 23
            if (r7 > r8) goto Le3
            java.lang.String r7 = r11.f27020b
            java.lang.String r8 = "video/x-vnd.on2.vp9"
            boolean r7 = r8.equals(r7)
            if (r7 == 0) goto Le3
            int r7 = r6.length
            if (r7 != 0) goto Le3
            android.media.MediaCodecInfo$CodecCapabilities r6 = r11.f27022d
            if (r6 == 0) goto L86
            android.media.MediaCodecInfo$VideoCapabilities r6 = r6.getVideoCapabilities()
            if (r6 == 0) goto L86
            android.util.Range r6 = r6.getBitrateRange()
            java.lang.Comparable r6 = r6.getUpper()
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r6 = r6.intValue()
            goto L87
        L86:
            r6 = 0
        L87:
            r7 = 180000000(0xaba9500, float:1.7967196E-32)
            if (r6 < r7) goto L8f
            r6 = 1024(0x400, float:1.435E-42)
            goto Ld6
        L8f:
            r7 = 120000000(0x7270e00, float:1.2567798E-34)
            if (r6 < r7) goto L97
            r6 = 512(0x200, float:7.17E-43)
            goto Ld6
        L97:
            r7 = 60000000(0x3938700, float:8.670878E-37)
            if (r6 < r7) goto L9f
            r6 = 256(0x100, float:3.59E-43)
            goto Ld6
        L9f:
            r7 = 30000000(0x1c9c380, float:7.411627E-38)
            if (r6 < r7) goto La7
            r6 = 128(0x80, float:1.8E-43)
            goto Ld6
        La7:
            r7 = 18000000(0x112a880, float:2.6936858E-38)
            if (r6 < r7) goto Laf
            r6 = 64
            goto Ld6
        Laf:
            r7 = 12000000(0xb71b00, float:1.6815582E-38)
            if (r6 < r7) goto Lb7
            r6 = 32
            goto Ld6
        Lb7:
            r7 = 7200000(0x6ddd00, float:1.0089349E-38)
            if (r6 < r7) goto Lbf
            r6 = 16
            goto Ld6
        Lbf:
            r7 = 3600000(0x36ee80, float:5.044674E-39)
            if (r6 < r7) goto Lc7
            r6 = 8
            goto Ld6
        Lc7:
            r7 = 1800000(0x1b7740, float:2.522337E-39)
            if (r6 < r7) goto Lce
            r6 = 4
            goto Ld6
        Lce:
            r7 = 800000(0xc3500, float:1.121039E-39)
            if (r6 < r7) goto Ld5
            r6 = 2
            goto Ld6
        Ld5:
            r6 = 1
        Ld6:
            android.media.MediaCodecInfo$CodecProfileLevel r7 = new android.media.MediaCodecInfo$CodecProfileLevel
            r7.<init>()
            r7.profile = r3
            r7.level = r6
            android.media.MediaCodecInfo$CodecProfileLevel[] r6 = new android.media.MediaCodecInfo.CodecProfileLevel[r3]
            r6[r2] = r7
        Le3:
            int r7 = r6.length
            r8 = 0
        Le5:
            if (r8 >= r7) goto Lf5
            r9 = r6[r8]
            int r10 = r9.profile
            if (r10 != r5) goto Lf2
            int r9 = r9.level
            if (r9 < r4) goto Lf2
            goto L120
        Lf2:
            int r8 = r8 + 1
            goto Le5
        Lf5:
            java.lang.String r4 = r12.f8893g0
            r5 = 22
            int r5 = p064e.C1489c.m4038a(r4, r5)
            int r6 = r0.length()
            int r6 = r6 + r5
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>(r6)
            java.lang.String r6 = "codec.profileLevel, "
        L109:
            r5.append(r6)
            r5.append(r4)
            java.lang.String r4 = ", "
            r5.append(r4)
            r5.append(r0)
            java.lang.String r0 = r5.toString()
            r11.m14070h(r0)
            r0 = 0
            goto L121
        L120:
            r0 = 1
        L121:
            if (r0 != 0) goto L124
            return r2
        L124:
            boolean r0 = r11.f27025g
            r4 = 21
            if (r0 == 0) goto L15d
            int r0 = r12.f8901o0
            if (r0 <= 0) goto L15c
            int r1 = r12.f8902p0
            if (r1 > 0) goto L133
            goto L15c
        L133:
            int r3 = p371v5.C6552b0.f25624a
            if (r3 < r4) goto L13f
            float r12 = r12.f8903q0
            double r2 = (double) r12
            boolean r12 = r11.m14069g(r0, r1, r2)
            return r12
        L13f:
            int r0 = r0 * r1
            int r1 = p406x4.C6944r.m14104i()
            if (r0 > r1) goto L148
            r2 = 1
        L148:
            if (r2 != 0) goto L15b
            int r0 = r12.f8901o0
            int r12 = r12.f8902p0
            r1 = 40
            java.lang.String r3 = "legacyFrameSize, "
            java.lang.String r4 = "x"
            java.lang.String r12 = p304r4.C5785f.m12134a(r1, r3, r0, r4, r12)
            r11.m14070h(r12)
        L15b:
            return r2
        L15c:
            return r3
        L15d:
            int r0 = p371v5.C6552b0.f25624a
            if (r0 < r4) goto L266
            int r4 = r12.f8910x0
            r5 = -1
            if (r4 == r5) goto L18c
            android.media.MediaCodecInfo$CodecCapabilities r6 = r11.f27022d
            if (r6 != 0) goto L16d
            java.lang.String r4 = "sampleRate.caps"
            goto L184
        L16d:
            android.media.MediaCodecInfo$AudioCapabilities r6 = r6.getAudioCapabilities()
            if (r6 != 0) goto L176
            java.lang.String r4 = "sampleRate.aCaps"
            goto L184
        L176:
            boolean r6 = r6.isSampleRateSupported(r4)
            if (r6 != 0) goto L189
            r6 = 31
            java.lang.String r7 = "sampleRate.support, "
            java.lang.String r4 = p064e.C1490d.m4039a(r6, r7, r4)
        L184:
            r11.m14070h(r4)
            r4 = 0
            goto L18a
        L189:
            r4 = 1
        L18a:
            if (r4 == 0) goto L267
        L18c:
            int r12 = r12.f8909w0
            if (r12 == r5) goto L266
            android.media.MediaCodecInfo$CodecCapabilities r4 = r11.f27022d
            if (r4 != 0) goto L198
            java.lang.String r12 = "channelCount.caps"
            goto L25e
        L198:
            android.media.MediaCodecInfo$AudioCapabilities r4 = r4.getAudioCapabilities()
            if (r4 != 0) goto L1a2
            java.lang.String r12 = "channelCount.aCaps"
            goto L25e
        L1a2:
            java.lang.String r5 = r11.f27019a
            java.lang.String r6 = r11.f27020b
            int r4 = r4.getMaxInputChannelCount()
            if (r4 > r3) goto L254
            r3 = 26
            if (r0 < r3) goto L1b4
            if (r4 <= 0) goto L1b4
            goto L254
        L1b4:
            java.lang.String r0 = "audio/mpeg"
            boolean r0 = r0.equals(r6)
            if (r0 != 0) goto L254
            java.lang.String r0 = "audio/3gpp"
            boolean r0 = r0.equals(r6)
            if (r0 != 0) goto L254
            java.lang.String r0 = "audio/amr-wb"
            boolean r0 = r0.equals(r6)
            if (r0 != 0) goto L254
            java.lang.String r0 = "audio/mp4a-latm"
            boolean r0 = r0.equals(r6)
            if (r0 != 0) goto L254
            java.lang.String r0 = "audio/vorbis"
            boolean r0 = r0.equals(r6)
            if (r0 != 0) goto L254
            java.lang.String r0 = "audio/opus"
            boolean r0 = r0.equals(r6)
            if (r0 != 0) goto L254
            java.lang.String r0 = "audio/raw"
            boolean r0 = r0.equals(r6)
            if (r0 != 0) goto L254
            java.lang.String r0 = "audio/flac"
            boolean r0 = r0.equals(r6)
            if (r0 != 0) goto L254
            java.lang.String r0 = "audio/g711-alaw"
            boolean r0 = r0.equals(r6)
            if (r0 != 0) goto L254
            java.lang.String r0 = "audio/g711-mlaw"
            boolean r0 = r0.equals(r6)
            if (r0 != 0) goto L254
            java.lang.String r0 = "audio/gsm"
            boolean r0 = r0.equals(r6)
            if (r0 == 0) goto L20d
            goto L254
        L20d:
            java.lang.String r0 = "audio/ac3"
            boolean r0 = r0.equals(r6)
            if (r0 == 0) goto L217
            r1 = 6
            goto L222
        L217:
            java.lang.String r0 = "audio/eac3"
            boolean r0 = r0.equals(r6)
            if (r0 == 0) goto L220
            goto L222
        L220:
            r1 = 30
        L222:
            r0 = 59
            int r0 = p064e.C1489c.m4038a(r5, r0)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r0)
            java.lang.String r0 = "AssumedMaxChannelAdjustment: "
            r3.append(r0)
            r3.append(r5)
            java.lang.String r0 = ", ["
            r3.append(r0)
            r3.append(r4)
            java.lang.String r0 = " to "
            r3.append(r0)
            r3.append(r1)
            java.lang.String r0 = "]"
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            java.lang.String r3 = "MediaCodecInfo"
            android.util.Log.w(r3, r0)
            r4 = r1
        L254:
            if (r4 >= r12) goto L263
            r0 = 33
            java.lang.String r1 = "channelCount.support, "
            java.lang.String r12 = p064e.C1490d.m4039a(r0, r1, r12)
        L25e:
            r11.m14070h(r12)
            r12 = 0
            goto L264
        L263:
            r12 = 1
        L264:
            if (r12 == 0) goto L267
        L266:
            r2 = 1
        L267:
            return r2
    }

    /* renamed from: f */
    public boolean m14068f(p088f4.C2003e0 r2) {
            r1 = this;
            boolean r0 = r1.f27025g
            if (r0 == 0) goto L7
            boolean r2 = r1.f27023e
            return r2
        L7:
            android.util.Pair r2 = p406x4.C6944r.m14098c(r2)
            if (r2 == 0) goto L1b
            java.lang.Object r2 = r2.first
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r0 = 42
            if (r2 != r0) goto L1b
            r2 = 1
            goto L1c
        L1b:
            r2 = 0
        L1c:
            return r2
    }

    /* renamed from: g */
    public boolean m14069g(int r8, int r9, double r10) {
            r7 = this;
            android.media.MediaCodecInfo$CodecCapabilities r0 = r7.f27022d
            r1 = 0
            if (r0 != 0) goto L9
            java.lang.String r8 = "sizeAndRate.caps"
            goto Lae
        L9:
            android.media.MediaCodecInfo$VideoCapabilities r0 = r0.getVideoCapabilities()
            if (r0 != 0) goto L13
            java.lang.String r8 = "sizeAndRate.vCaps"
            goto Lae
        L13:
            boolean r2 = m14063b(r0, r8, r9, r10)
            r3 = 1
            if (r2 != 0) goto Lb2
            r2 = 69
            java.lang.String r4 = "x"
            if (r8 >= r9) goto L91
            java.lang.String r5 = r7.f27019a
            java.lang.String r6 = "OMX.MTK.VIDEO.DECODER.HEVC"
            boolean r5 = r6.equals(r5)
            if (r5 == 0) goto L36
            java.lang.String r5 = p371v5.C6552b0.f25625b
            java.lang.String r6 = "mcv5a"
            boolean r5 = r6.equals(r5)
            if (r5 == 0) goto L36
            r5 = 0
            goto L37
        L36:
            r5 = 1
        L37:
            if (r5 == 0) goto L91
            boolean r0 = m14063b(r0, r9, r8, r10)
            if (r0 != 0) goto L40
            goto L91
        L40:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r2)
            java.lang.String r1 = "sizeAndRate.rotated, "
            r0.append(r1)
            r0.append(r8)
            r0.append(r4)
            r0.append(r9)
            r0.append(r4)
            r0.append(r10)
            java.lang.String r8 = r0.toString()
            java.lang.String r9 = r7.f27019a
            java.lang.String r10 = r7.f27020b
            java.lang.String r11 = p371v5.C6552b0.f25628e
            r0 = 25
            int r0 = p064e.C1489c.m4038a(r8, r0)
            int r0 = p064e.C1489c.m4038a(r9, r0)
            int r0 = p064e.C1489c.m4038a(r10, r0)
            int r0 = p064e.C1489c.m4038a(r11, r0)
            java.lang.String r1 = "AssumedSupport ["
            java.lang.String r2 = "] ["
            java.lang.StringBuilder r8 = p064e.C1491e.m4040a(r0, r1, r8, r2, r9)
            java.lang.String r9 = ", "
            p179k1.C3661s.m8090a(r8, r9, r10, r2, r11)
            java.lang.String r9 = "]"
            r8.append(r9)
            java.lang.String r8 = r8.toString()
            java.lang.String r9 = "MediaCodecInfo"
            android.util.Log.d(r9, r8)
            goto Lb2
        L91:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r2)
            java.lang.String r2 = "sizeAndRate.support, "
            r0.append(r2)
            r0.append(r8)
            r0.append(r4)
            r0.append(r9)
            r0.append(r4)
            r0.append(r10)
            java.lang.String r8 = r0.toString()
        Lae:
            r7.m14070h(r8)
            return r1
        Lb2:
            return r3
    }

    /* renamed from: h */
    public final void m14070h(java.lang.String r7) {
            r6 = this;
            java.lang.String r0 = r6.f27019a
            java.lang.String r1 = r6.f27020b
            java.lang.String r2 = p371v5.C6552b0.f25628e
            r3 = 20
            int r3 = p064e.C1489c.m4038a(r7, r3)
            int r3 = p064e.C1489c.m4038a(r0, r3)
            int r3 = p064e.C1489c.m4038a(r1, r3)
            int r3 = p064e.C1489c.m4038a(r2, r3)
            java.lang.String r4 = "NoSupport ["
            java.lang.String r5 = "] ["
            java.lang.StringBuilder r7 = p064e.C1491e.m4040a(r3, r4, r7, r5, r0)
            java.lang.String r0 = ", "
            p179k1.C3661s.m8090a(r7, r0, r1, r5, r2)
            java.lang.String r0 = "]"
            r7.append(r0)
            java.lang.String r7 = r7.toString()
            java.lang.String r0 = "MediaCodecInfo"
            android.util.Log.d(r0, r7)
            return
    }

    public java.lang.String toString() {
            r1 = this;
            java.lang.String r0 = r1.f27019a
            return r0
    }
}
