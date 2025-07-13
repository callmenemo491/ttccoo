package p371v5;

/* renamed from: v5.q */
/* loaded from: classes.dex */
public final class C6567q {

    /* renamed from: a */
    public static final java.util.ArrayList<p371v5.C6567q.a> f25670a = null;

    /* renamed from: b */
    public static final java.util.regex.Pattern f25671b = null;

    /* renamed from: v5.q$a */
    public static final class a {
    }

    /* renamed from: v5.q$b */
    public static final class b {

        /* renamed from: a */
        public final int f25672a;

        /* renamed from: b */
        public final int f25673b;

        public b(int r1, int r2) {
                r0 = this;
                r0.<init>()
                r0.f25672a = r1
                r0.f25673b = r2
                return
        }

        /* renamed from: a */
        public int m13381a() {
                r2 = this;
                int r0 = r2.f25673b
                r1 = 2
                if (r0 == r1) goto L29
                r1 = 5
                if (r0 == r1) goto L26
                r1 = 29
                if (r0 == r1) goto L23
                r1 = 42
                if (r0 == r1) goto L20
                r1 = 22
                if (r0 == r1) goto L1d
                r1 = 23
                if (r0 == r1) goto L1a
                r0 = 0
                return r0
            L1a:
                r0 = 15
                return r0
            L1d:
                r0 = 1073741824(0x40000000, float:2.0)
                return r0
            L20:
                r0 = 16
                return r0
            L23:
                r0 = 12
                return r0
            L26:
                r0 = 11
                return r0
            L29:
                r0 = 10
                return r0
        }
    }

    static {
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            p371v5.C6567q.f25670a = r0
            java.lang.String r0 = "^mp4a\\.([a-zA-Z0-9]{2})(?:\\.([0-9]{1,2}))?$"
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
            p371v5.C6567q.f25671b = r0
            return
    }

    /* renamed from: a */
    public static boolean m13371a(java.lang.String r4, java.lang.String r5) {
            r0 = 0
            if (r4 != 0) goto L4
            return r0
        L4:
            r1 = -1
            int r2 = r4.hashCode()
            r3 = 1
            switch(r2) {
                case -2123537834: goto L86;
                case -432837260: goto L7b;
                case -432837259: goto L70;
                case -53558318: goto L65;
                case 187078296: goto L5a;
                case 187094639: goto L4f;
                case 1504578661: goto L44;
                case 1504619009: goto L39;
                case 1504831518: goto L2b;
                case 1903231877: goto L1d;
                case 1903589369: goto Lf;
                default: goto Ld;
            }
        Ld:
            goto L90
        Lf:
            java.lang.String r2 = "audio/g711-mlaw"
            boolean r4 = r4.equals(r2)
            if (r4 != 0) goto L19
            goto L90
        L19:
            r1 = 10
            goto L90
        L1d:
            java.lang.String r2 = "audio/g711-alaw"
            boolean r4 = r4.equals(r2)
            if (r4 != 0) goto L27
            goto L90
        L27:
            r1 = 9
            goto L90
        L2b:
            java.lang.String r2 = "audio/mpeg"
            boolean r4 = r4.equals(r2)
            if (r4 != 0) goto L35
            goto L90
        L35:
            r1 = 8
            goto L90
        L39:
            java.lang.String r2 = "audio/flac"
            boolean r4 = r4.equals(r2)
            if (r4 != 0) goto L42
            goto L90
        L42:
            r1 = 7
            goto L90
        L44:
            java.lang.String r2 = "audio/eac3"
            boolean r4 = r4.equals(r2)
            if (r4 != 0) goto L4d
            goto L90
        L4d:
            r1 = 6
            goto L90
        L4f:
            java.lang.String r2 = "audio/raw"
            boolean r4 = r4.equals(r2)
            if (r4 != 0) goto L58
            goto L90
        L58:
            r1 = 5
            goto L90
        L5a:
            java.lang.String r2 = "audio/ac3"
            boolean r4 = r4.equals(r2)
            if (r4 != 0) goto L63
            goto L90
        L63:
            r1 = 4
            goto L90
        L65:
            java.lang.String r2 = "audio/mp4a-latm"
            boolean r4 = r4.equals(r2)
            if (r4 != 0) goto L6e
            goto L90
        L6e:
            r1 = 3
            goto L90
        L70:
            java.lang.String r2 = "audio/mpeg-L2"
            boolean r4 = r4.equals(r2)
            if (r4 != 0) goto L79
            goto L90
        L79:
            r1 = 2
            goto L90
        L7b:
            java.lang.String r2 = "audio/mpeg-L1"
            boolean r4 = r4.equals(r2)
            if (r4 != 0) goto L84
            goto L90
        L84:
            r1 = 1
            goto L90
        L86:
            java.lang.String r2 = "audio/eac3-joc"
            boolean r4 = r4.equals(r2)
            if (r4 != 0) goto L8f
            goto L90
        L8f:
            r1 = 0
        L90:
            switch(r1) {
                case 0: goto Laa;
                case 1: goto Laa;
                case 2: goto Laa;
                case 3: goto L94;
                case 4: goto Laa;
                case 5: goto Laa;
                case 6: goto Laa;
                case 7: goto Laa;
                case 8: goto Laa;
                case 9: goto Laa;
                case 10: goto Laa;
                default: goto L93;
            }
        L93:
            return r0
        L94:
            if (r5 != 0) goto L97
            return r0
        L97:
            v5.q$b r4 = m13375e(r5)
            if (r4 != 0) goto L9e
            return r0
        L9e:
            int r4 = r4.m13381a()
            if (r4 == 0) goto La9
            r5 = 16
            if (r4 == r5) goto La9
            r0 = 1
        La9:
            return r0
        Laa:
            return r3
    }

    /* renamed from: b */
    public static int m13372b(java.lang.String r7, java.lang.String r8) {
            int r0 = r7.hashCode()
            r1 = 0
            r2 = 5
            r3 = 6
            r4 = 7
            r5 = 8
            r6 = -1
            switch(r0) {
                case -2123537834: goto L6b;
                case -1095064472: goto L60;
                case -53558318: goto L55;
                case 187078296: goto L4a;
                case 187078297: goto L3f;
                case 1504578661: goto L34;
                case 1504831518: goto L29;
                case 1505942594: goto L1e;
                case 1556697186: goto L10;
                default: goto Le;
            }
        Le:
            goto L75
        L10:
            java.lang.String r0 = "audio/true-hd"
            boolean r7 = r7.equals(r0)
            if (r7 != 0) goto L1a
            goto L75
        L1a:
            r6 = 8
            goto L75
        L1e:
            java.lang.String r0 = "audio/vnd.dts.hd"
            boolean r7 = r7.equals(r0)
            if (r7 != 0) goto L27
            goto L75
        L27:
            r6 = 7
            goto L75
        L29:
            java.lang.String r0 = "audio/mpeg"
            boolean r7 = r7.equals(r0)
            if (r7 != 0) goto L32
            goto L75
        L32:
            r6 = 6
            goto L75
        L34:
            java.lang.String r0 = "audio/eac3"
            boolean r7 = r7.equals(r0)
            if (r7 != 0) goto L3d
            goto L75
        L3d:
            r6 = 5
            goto L75
        L3f:
            java.lang.String r0 = "audio/ac4"
            boolean r7 = r7.equals(r0)
            if (r7 != 0) goto L48
            goto L75
        L48:
            r6 = 4
            goto L75
        L4a:
            java.lang.String r0 = "audio/ac3"
            boolean r7 = r7.equals(r0)
            if (r7 != 0) goto L53
            goto L75
        L53:
            r6 = 3
            goto L75
        L55:
            java.lang.String r0 = "audio/mp4a-latm"
            boolean r7 = r7.equals(r0)
            if (r7 != 0) goto L5e
            goto L75
        L5e:
            r6 = 2
            goto L75
        L60:
            java.lang.String r0 = "audio/vnd.dts"
            boolean r7 = r7.equals(r0)
            if (r7 != 0) goto L69
            goto L75
        L69:
            r6 = 1
            goto L75
        L6b:
            java.lang.String r0 = "audio/eac3-joc"
            boolean r7 = r7.equals(r0)
            if (r7 != 0) goto L74
            goto L75
        L74:
            r6 = 0
        L75:
            switch(r6) {
                case 0: goto L95;
                case 1: goto L94;
                case 2: goto L85;
                case 3: goto L84;
                case 4: goto L81;
                case 5: goto L80;
                case 6: goto L7d;
                case 7: goto L7c;
                case 8: goto L79;
                default: goto L78;
            }
        L78:
            return r1
        L79:
            r7 = 14
            return r7
        L7c:
            return r5
        L7d:
            r7 = 9
            return r7
        L80:
            return r3
        L81:
            r7 = 17
            return r7
        L84:
            return r2
        L85:
            if (r8 != 0) goto L88
            return r1
        L88:
            v5.q$b r7 = m13375e(r8)
            if (r7 != 0) goto L8f
            return r1
        L8f:
            int r7 = r7.m13381a()
            return r7
        L94:
            return r4
        L95:
            r7 = 18
            return r7
    }

    /* renamed from: c */
    public static java.lang.String m13373c(java.lang.String r4) {
            r0 = 0
            if (r4 != 0) goto L4
            return r0
        L4:
            java.lang.String r4 = r4.trim()
            java.lang.String r4 = p185k7.C3836i.m8629n(r4)
            java.lang.String r1 = "avc1"
            boolean r1 = r4.startsWith(r1)
            if (r1 != 0) goto L1b9
            java.lang.String r1 = "avc3"
            boolean r1 = r4.startsWith(r1)
            if (r1 == 0) goto L1e
            goto L1b9
        L1e:
            java.lang.String r1 = "hev1"
            boolean r1 = r4.startsWith(r1)
            if (r1 != 0) goto L1b6
            java.lang.String r1 = "hvc1"
            boolean r1 = r4.startsWith(r1)
            if (r1 == 0) goto L30
            goto L1b6
        L30:
            java.lang.String r1 = "dvav"
            boolean r1 = r4.startsWith(r1)
            if (r1 != 0) goto L1b3
            java.lang.String r1 = "dva1"
            boolean r1 = r4.startsWith(r1)
            if (r1 != 0) goto L1b3
            java.lang.String r1 = "dvhe"
            boolean r1 = r4.startsWith(r1)
            if (r1 != 0) goto L1b3
            java.lang.String r1 = "dvh1"
            boolean r1 = r4.startsWith(r1)
            if (r1 == 0) goto L52
            goto L1b3
        L52:
            java.lang.String r1 = "av01"
            boolean r1 = r4.startsWith(r1)
            if (r1 == 0) goto L5d
            java.lang.String r4 = "video/av01"
            return r4
        L5d:
            java.lang.String r1 = "vp9"
            boolean r1 = r4.startsWith(r1)
            if (r1 != 0) goto L1b0
            java.lang.String r1 = "vp09"
            boolean r1 = r4.startsWith(r1)
            if (r1 == 0) goto L6f
            goto L1b0
        L6f:
            java.lang.String r1 = "vp8"
            boolean r1 = r4.startsWith(r1)
            if (r1 != 0) goto L1ad
            java.lang.String r1 = "vp08"
            boolean r1 = r4.startsWith(r1)
            if (r1 == 0) goto L81
            goto L1ad
        L81:
            java.lang.String r1 = "mp4a"
            boolean r1 = r4.startsWith(r1)
            if (r1 == 0) goto La2
            java.lang.String r1 = "mp4a."
            boolean r1 = r4.startsWith(r1)
            if (r1 == 0) goto L9d
            v5.q$b r4 = m13375e(r4)
            if (r4 == 0) goto L9d
            int r4 = r4.f25672a
            java.lang.String r0 = m13374d(r4)
        L9d:
            if (r0 != 0) goto La1
            java.lang.String r0 = "audio/mp4a-latm"
        La1:
            return r0
        La2:
            java.lang.String r1 = "mha1"
            boolean r1 = r4.startsWith(r1)
            if (r1 == 0) goto Lad
            java.lang.String r4 = "audio/mha1"
            return r4
        Lad:
            java.lang.String r1 = "mhm1"
            boolean r1 = r4.startsWith(r1)
            if (r1 == 0) goto Lb8
            java.lang.String r4 = "audio/mhm1"
            return r4
        Lb8:
            java.lang.String r1 = "ac-3"
            boolean r1 = r4.startsWith(r1)
            if (r1 != 0) goto L1aa
            java.lang.String r1 = "dac3"
            boolean r1 = r4.startsWith(r1)
            if (r1 == 0) goto Lca
            goto L1aa
        Lca:
            java.lang.String r1 = "ec-3"
            boolean r1 = r4.startsWith(r1)
            if (r1 != 0) goto L1a7
            java.lang.String r1 = "dec3"
            boolean r1 = r4.startsWith(r1)
            if (r1 == 0) goto Ldc
            goto L1a7
        Ldc:
            java.lang.String r1 = "ec+3"
            boolean r1 = r4.startsWith(r1)
            if (r1 == 0) goto Le7
            java.lang.String r4 = "audio/eac3-joc"
            return r4
        Le7:
            java.lang.String r1 = "ac-4"
            boolean r1 = r4.startsWith(r1)
            if (r1 != 0) goto L1a4
            java.lang.String r1 = "dac4"
            boolean r1 = r4.startsWith(r1)
            if (r1 == 0) goto Lf9
            goto L1a4
        Lf9:
            java.lang.String r1 = "dtsc"
            boolean r1 = r4.startsWith(r1)
            if (r1 == 0) goto L104
            java.lang.String r4 = "audio/vnd.dts"
            return r4
        L104:
            java.lang.String r1 = "dtse"
            boolean r1 = r4.startsWith(r1)
            if (r1 == 0) goto L10f
            java.lang.String r4 = "audio/vnd.dts.hd;profile=lbr"
            return r4
        L10f:
            java.lang.String r1 = "dtsh"
            boolean r1 = r4.startsWith(r1)
            if (r1 != 0) goto L1a1
            java.lang.String r1 = "dtsl"
            boolean r1 = r4.startsWith(r1)
            if (r1 == 0) goto L121
            goto L1a1
        L121:
            java.lang.String r1 = "dtsx"
            boolean r1 = r4.startsWith(r1)
            if (r1 == 0) goto L12c
            java.lang.String r4 = "audio/vnd.dts.uhd;profile=p2"
            return r4
        L12c:
            java.lang.String r1 = "opus"
            boolean r1 = r4.startsWith(r1)
            if (r1 == 0) goto L137
            java.lang.String r4 = "audio/opus"
            return r4
        L137:
            java.lang.String r1 = "vorbis"
            boolean r1 = r4.startsWith(r1)
            if (r1 == 0) goto L142
            java.lang.String r4 = "audio/vorbis"
            return r4
        L142:
            java.lang.String r1 = "flac"
            boolean r1 = r4.startsWith(r1)
            if (r1 == 0) goto L14d
            java.lang.String r4 = "audio/flac"
            return r4
        L14d:
            java.lang.String r1 = "stpp"
            boolean r1 = r4.startsWith(r1)
            if (r1 == 0) goto L158
            java.lang.String r4 = "application/ttml+xml"
            return r4
        L158:
            java.lang.String r1 = "wvtt"
            boolean r1 = r4.startsWith(r1)
            if (r1 == 0) goto L163
            java.lang.String r4 = "text/vtt"
            return r4
        L163:
            java.lang.String r1 = "cea708"
            boolean r1 = r4.contains(r1)
            if (r1 == 0) goto L16e
            java.lang.String r4 = "application/cea-708"
            return r4
        L16e:
            java.lang.String r1 = "eia608"
            boolean r1 = r4.contains(r1)
            if (r1 != 0) goto L19e
            java.lang.String r1 = "cea608"
            boolean r1 = r4.contains(r1)
            if (r1 == 0) goto L17f
            goto L19e
        L17f:
            java.util.ArrayList<v5.q$a> r1 = p371v5.C6567q.f25670a
            int r1 = r1.size()
            r2 = 0
        L186:
            if (r2 >= r1) goto L19d
            java.util.ArrayList<v5.q$a> r3 = p371v5.C6567q.f25670a
            java.lang.Object r3 = r3.get(r2)
            v5.q$a r3 = (p371v5.C6567q.a) r3
            java.util.Objects.requireNonNull(r3)
            boolean r3 = r4.startsWith(r0)
            if (r3 == 0) goto L19a
            goto L19d
        L19a:
            int r2 = r2 + 1
            goto L186
        L19d:
            return r0
        L19e:
            java.lang.String r4 = "application/cea-608"
            return r4
        L1a1:
            java.lang.String r4 = "audio/vnd.dts.hd"
            return r4
        L1a4:
            java.lang.String r4 = "audio/ac4"
            return r4
        L1a7:
            java.lang.String r4 = "audio/eac3"
            return r4
        L1aa:
            java.lang.String r4 = "audio/ac3"
            return r4
        L1ad:
            java.lang.String r4 = "video/x-vnd.on2.vp8"
            return r4
        L1b0:
            java.lang.String r4 = "video/x-vnd.on2.vp9"
            return r4
        L1b3:
            java.lang.String r4 = "video/dolby-vision"
            return r4
        L1b6:
            java.lang.String r4 = "video/hevc"
            return r4
        L1b9:
            java.lang.String r4 = "video/avc"
            return r4
    }

    /* renamed from: d */
    public static java.lang.String m13374d(int r1) {
            r0 = 32
            if (r1 == r0) goto L52
            r0 = 33
            if (r1 == r0) goto L4f
            r0 = 35
            if (r1 == r0) goto L4c
            r0 = 64
            if (r1 == r0) goto L49
            r0 = 163(0xa3, float:2.28E-43)
            if (r1 == r0) goto L46
            r0 = 177(0xb1, float:2.48E-43)
            if (r1 == r0) goto L43
            r0 = 165(0xa5, float:2.31E-43)
            if (r1 == r0) goto L40
            r0 = 166(0xa6, float:2.33E-43)
            if (r1 == r0) goto L3d
            switch(r1) {
                case 96: goto L3a;
                case 97: goto L3a;
                case 98: goto L3a;
                case 99: goto L3a;
                case 100: goto L3a;
                case 101: goto L3a;
                case 102: goto L49;
                case 103: goto L49;
                case 104: goto L49;
                case 105: goto L37;
                case 106: goto L34;
                case 107: goto L37;
                default: goto L23;
            }
        L23:
            switch(r1) {
                case 169: goto L31;
                case 170: goto L2e;
                case 171: goto L2e;
                case 172: goto L31;
                case 173: goto L2b;
                case 174: goto L28;
                default: goto L26;
            }
        L26:
            r1 = 0
            return r1
        L28:
            java.lang.String r1 = "audio/ac4"
            return r1
        L2b:
            java.lang.String r1 = "audio/opus"
            return r1
        L2e:
            java.lang.String r1 = "audio/vnd.dts.hd"
            return r1
        L31:
            java.lang.String r1 = "audio/vnd.dts"
            return r1
        L34:
            java.lang.String r1 = "video/mpeg"
            return r1
        L37:
            java.lang.String r1 = "audio/mpeg"
            return r1
        L3a:
            java.lang.String r1 = "video/mpeg2"
            return r1
        L3d:
            java.lang.String r1 = "audio/eac3"
            return r1
        L40:
            java.lang.String r1 = "audio/ac3"
            return r1
        L43:
            java.lang.String r1 = "video/x-vnd.on2.vp9"
            return r1
        L46:
            java.lang.String r1 = "video/wvc1"
            return r1
        L49:
            java.lang.String r1 = "audio/mp4a-latm"
            return r1
        L4c:
            java.lang.String r1 = "video/hevc"
            return r1
        L4f:
            java.lang.String r1 = "video/avc"
            return r1
        L52:
            java.lang.String r1 = "video/mp4v-es"
            return r1
    }

    /* renamed from: e */
    public static p371v5.C6567q.b m13375e(java.lang.String r4) {
            java.util.regex.Pattern r0 = p371v5.C6567q.f25671b
            java.util.regex.Matcher r4 = r0.matcher(r4)
            boolean r0 = r4.matches()
            r1 = 0
            if (r0 != 0) goto Le
            return r1
        Le:
            r0 = 1
            java.lang.String r0 = r4.group(r0)
            java.util.Objects.requireNonNull(r0)
            r2 = 2
            java.lang.String r4 = r4.group(r2)
            r2 = 0
            r3 = 16
            int r0 = java.lang.Integer.parseInt(r0, r3)     // Catch: java.lang.NumberFormatException -> L2e
            if (r4 == 0) goto L28
            int r2 = java.lang.Integer.parseInt(r4)     // Catch: java.lang.NumberFormatException -> L2e
        L28:
            v5.q$b r4 = new v5.q$b
            r4.<init>(r0, r2)
            return r4
        L2e:
            return r1
    }

    /* renamed from: f */
    public static java.lang.String m13376f(java.lang.String r3) {
            r0 = 0
            if (r3 != 0) goto L4
            return r0
        L4:
            r1 = 47
            int r1 = r3.indexOf(r1)
            r2 = -1
            if (r1 != r2) goto Le
            return r0
        Le:
            r0 = 0
            java.lang.String r3 = r3.substring(r0, r1)
            return r3
    }

    /* renamed from: g */
    public static int m13377g(java.lang.String r5) {
            boolean r0 = android.text.TextUtils.isEmpty(r5)
            r1 = -1
            if (r0 == 0) goto L8
            return r1
        L8:
            boolean r0 = m13378h(r5)
            if (r0 == 0) goto L10
            r5 = 1
            return r5
        L10:
            boolean r0 = m13380j(r5)
            if (r0 == 0) goto L18
            r5 = 2
            return r5
        L18:
            boolean r0 = m13379i(r5)
            if (r0 == 0) goto L20
            r5 = 3
            return r5
        L20:
            java.lang.String r0 = m13376f(r5)
            java.lang.String r2 = "image"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L2e
            r5 = 4
            return r5
        L2e:
            java.lang.String r0 = "application/id3"
            boolean r0 = r0.equals(r5)
            if (r0 != 0) goto L73
            java.lang.String r0 = "application/x-emsg"
            boolean r0 = r0.equals(r5)
            if (r0 != 0) goto L73
            java.lang.String r0 = "application/x-scte35"
            boolean r0 = r0.equals(r5)
            if (r0 == 0) goto L47
            goto L73
        L47:
            java.lang.String r0 = "application/x-camera-motion"
            boolean r0 = r0.equals(r5)
            if (r0 == 0) goto L51
            r5 = 6
            return r5
        L51:
            java.util.ArrayList<v5.q$a> r0 = p371v5.C6567q.f25670a
            int r0 = r0.size()
            r2 = 0
            r3 = 0
        L59:
            if (r3 >= r0) goto L72
            java.util.ArrayList<v5.q$a> r4 = p371v5.C6567q.f25670a
            java.lang.Object r4 = r4.get(r3)
            v5.q$a r4 = (p371v5.C6567q.a) r4
            java.util.Objects.requireNonNull(r4)
            r4 = 0
            boolean r4 = r5.equals(r4)
            if (r4 == 0) goto L6f
            r1 = 0
            goto L72
        L6f:
            int r3 = r3 + 1
            goto L59
        L72:
            return r1
        L73:
            r5 = 5
            return r5
    }

    /* renamed from: h */
    public static boolean m13378h(java.lang.String r1) {
            java.lang.String r1 = m13376f(r1)
            java.lang.String r0 = "audio"
            boolean r1 = r0.equals(r1)
            return r1
    }

    /* renamed from: i */
    public static boolean m13379i(java.lang.String r2) {
            java.lang.String r0 = m13376f(r2)
            java.lang.String r1 = "text"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L67
            java.lang.String r0 = "application/cea-608"
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L67
            java.lang.String r0 = "application/cea-708"
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L67
            java.lang.String r0 = "application/x-mp4-cea-608"
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L67
            java.lang.String r0 = "application/x-subrip"
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L67
            java.lang.String r0 = "application/ttml+xml"
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L67
            java.lang.String r0 = "application/x-quicktime-tx3g"
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L67
            java.lang.String r0 = "application/x-mp4-vtt"
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L67
            java.lang.String r0 = "application/x-rawcc"
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L67
            java.lang.String r0 = "application/vobsub"
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L67
            java.lang.String r0 = "application/pgs"
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L67
            java.lang.String r0 = "application/dvbsubs"
            boolean r2 = r0.equals(r2)
            if (r2 == 0) goto L65
            goto L67
        L65:
            r2 = 0
            goto L68
        L67:
            r2 = 1
        L68:
            return r2
    }

    /* renamed from: j */
    public static boolean m13380j(java.lang.String r1) {
            java.lang.String r1 = m13376f(r1)
            java.lang.String r0 = "video"
            boolean r1 = r0.equals(r1)
            return r1
    }
}
