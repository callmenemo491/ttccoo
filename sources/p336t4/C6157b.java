package p336t4;

/* renamed from: t4.b */
/* loaded from: classes.dex */
public final class C6157b {

    /* renamed from: a */
    public static final byte[] f23751a = null;

    /* renamed from: t4.b$a */
    public interface a {
        /* renamed from: a */
        int mo12707a();

        /* renamed from: b */
        int mo12708b();

        /* renamed from: c */
        int mo12709c();
    }

    /* renamed from: t4.b$b */
    public static final class b {

        /* renamed from: a */
        public final p336t4.C6168m[] f23752a;

        /* renamed from: b */
        public p088f4.C2003e0 f23753b;

        /* renamed from: c */
        public int f23754c;

        /* renamed from: d */
        public int f23755d;

        public b(int r1) {
                r0 = this;
                r0.<init>()
                t4.m[] r1 = new p336t4.C6168m[r1]
                r0.f23752a = r1
                r1 = 0
                r0.f23755d = r1
                return
        }
    }

    /* renamed from: t4.b$c */
    public static final class c implements p336t4.C6157b.a {

        /* renamed from: a */
        public final int f23756a;

        /* renamed from: b */
        public final int f23757b;

        /* renamed from: c */
        public final p371v5.C6571u f23758c;

        public c(p336t4.AbstractC6156a.b r5, p088f4.C2003e0 r6) {
                r4 = this;
                r4.<init>()
                v5.u r5 = r5.f23750b
                r4.f23758c = r5
                r0 = 12
                r5.m13396F(r0)
                int r0 = r5.m13421x()
                java.lang.String r1 = r6.f8896j0
                java.lang.String r2 = "audio/raw"
                boolean r1 = r2.equals(r1)
                if (r1 == 0) goto L38
                int r1 = r6.f8911y0
                int r6 = r6.f8909w0
                int r6 = p371v5.C6552b0.m13326s(r1, r6)
                if (r0 == 0) goto L28
                int r1 = r0 % r6
                if (r1 == 0) goto L38
            L28:
                r1 = 88
                java.lang.String r2 = "Audio sample size mismatch. stsd sample size: "
                java.lang.String r3 = ", stsz sample size: "
                java.lang.String r0 = p304r4.C5785f.m12134a(r1, r2, r6, r3, r0)
                java.lang.String r1 = "AtomParsers"
                android.util.Log.w(r1, r0)
                r0 = r6
            L38:
                if (r0 != 0) goto L3b
                r0 = -1
            L3b:
                r4.f23756a = r0
                int r5 = r5.m13421x()
                r4.f23757b = r5
                return
        }

        @Override // p336t4.C6157b.a
        /* renamed from: a */
        public int mo12707a() {
                r1 = this;
                int r0 = r1.f23756a
                return r0
        }

        @Override // p336t4.C6157b.a
        /* renamed from: b */
        public int mo12708b() {
                r1 = this;
                int r0 = r1.f23757b
                return r0
        }

        @Override // p336t4.C6157b.a
        /* renamed from: c */
        public int mo12709c() {
                r2 = this;
                int r0 = r2.f23756a
                r1 = -1
                if (r0 != r1) goto Lb
                v5.u r0 = r2.f23758c
                int r0 = r0.m13421x()
            Lb:
                return r0
        }
    }

    /* renamed from: t4.b$d */
    public static final class d implements p336t4.C6157b.a {

        /* renamed from: a */
        public final p371v5.C6571u f23759a;

        /* renamed from: b */
        public final int f23760b;

        /* renamed from: c */
        public final int f23761c;

        /* renamed from: d */
        public int f23762d;

        /* renamed from: e */
        public int f23763e;

        public d(p336t4.AbstractC6156a.b r2) {
                r1 = this;
                r1.<init>()
                v5.u r2 = r2.f23750b
                r1.f23759a = r2
                r0 = 12
                r2.m13396F(r0)
                int r0 = r2.m13421x()
                r0 = r0 & 255(0xff, float:3.57E-43)
                r1.f23761c = r0
                int r2 = r2.m13421x()
                r1.f23760b = r2
                return
        }

        @Override // p336t4.C6157b.a
        /* renamed from: a */
        public int mo12707a() {
                r1 = this;
                r0 = -1
                return r0
        }

        @Override // p336t4.C6157b.a
        /* renamed from: b */
        public int mo12708b() {
                r1 = this;
                int r0 = r1.f23760b
                return r0
        }

        @Override // p336t4.C6157b.a
        /* renamed from: c */
        public int mo12709c() {
                r2 = this;
                int r0 = r2.f23761c
                r1 = 8
                if (r0 != r1) goto Ld
                v5.u r0 = r2.f23759a
                int r0 = r0.m13418u()
                return r0
            Ld:
                r1 = 16
                if (r0 != r1) goto L18
                v5.u r0 = r2.f23759a
                int r0 = r0.m13423z()
                return r0
            L18:
                int r0 = r2.f23762d
                int r1 = r0 + 1
                r2.f23762d = r1
                int r0 = r0 % 2
                if (r0 != 0) goto L2f
                v5.u r0 = r2.f23759a
                int r0 = r0.m13418u()
                r2.f23763e = r0
                r0 = r0 & 240(0xf0, float:3.36E-43)
                int r0 = r0 >> 4
                return r0
            L2f:
                int r0 = r2.f23763e
                r0 = r0 & 15
                return r0
        }
    }

    static {
            java.lang.String r0 = "OpusHead"
            byte[] r0 = p371v5.C6552b0.m13329v(r0)
            p336t4.C6157b.f23751a = r0
            return
    }

    /* renamed from: a */
    public static android.util.Pair<java.lang.String, byte[]> m12702a(p371v5.C6571u r5, int r6) {
            int r6 = r6 + 8
            int r6 = r6 + 4
            r5.m13396F(r6)
            r6 = 1
            r5.m13397G(r6)
            m12703b(r5)
            r0 = 2
            r5.m13397G(r0)
            int r1 = r5.m13418u()
            r2 = r1 & 128(0x80, float:1.8E-43)
            if (r2 == 0) goto L1d
            r5.m13397G(r0)
        L1d:
            r2 = r1 & 64
            if (r2 == 0) goto L28
            int r2 = r5.m13423z()
            r5.m13397G(r2)
        L28:
            r1 = r1 & 32
            if (r1 == 0) goto L2f
            r5.m13397G(r0)
        L2f:
            r5.m13397G(r6)
            m12703b(r5)
            int r0 = r5.m13418u()
            java.lang.String r0 = p371v5.C6567q.m13374d(r0)
            java.lang.String r1 = "audio/mpeg"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L76
            java.lang.String r1 = "audio/vnd.dts"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L76
            java.lang.String r1 = "audio/vnd.dts.hd"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L56
            goto L76
        L56:
            r1 = 12
            r5.m13397G(r1)
            r5.m13397G(r6)
            int r6 = m12703b(r5)
            byte[] r1 = new byte[r6]
            r2 = 0
            byte[] r3 = r5.f25710a
            int r4 = r5.f25711b
            java.lang.System.arraycopy(r3, r4, r1, r2, r6)
            int r2 = r5.f25711b
            int r2 = r2 + r6
            r5.f25711b = r2
            android.util.Pair r5 = android.util.Pair.create(r0, r1)
            return r5
        L76:
            r5 = 0
            android.util.Pair r5 = android.util.Pair.create(r0, r5)
            return r5
    }

    /* renamed from: b */
    public static int m12703b(p371v5.C6571u r3) {
            int r0 = r3.m13418u()
            r1 = r0 & 127(0x7f, float:1.78E-43)
        L6:
            r2 = 128(0x80, float:1.8E-43)
            r0 = r0 & r2
            if (r0 != r2) goto L15
            int r0 = r3.m13418u()
            int r1 = r1 << 7
            r2 = r0 & 127(0x7f, float:1.78E-43)
            r1 = r1 | r2
            goto L6
        L15:
            return r1
    }

    /* renamed from: c */
    public static android.util.Pair<java.lang.Integer, p336t4.C6168m> m12704c(p371v5.C6571u r17, int r18, int r19) {
            r0 = r17
            int r1 = r0.f25711b
        L4:
            int r2 = r1 - r18
            r4 = r19
            if (r2 >= r4) goto L12a
            r0.m13396F(r1)
            int r2 = r17.m13403f()
            r5 = 1
            r6 = 0
            if (r2 <= 0) goto L17
            r7 = 1
            goto L18
        L17:
            r7 = 0
        L18:
            java.lang.String r8 = "childAtomSize must be positive"
            p216m4.C4367l.m9807a(r7, r8)
            int r7 = r17.m13403f()
            r8 = 1936289382(0x73696e66, float:1.8494329E31)
            if (r7 != r8) goto L127
            int r7 = r1 + 8
            r8 = -1
            r9 = -1
            r10 = 0
            r11 = 0
            r15 = 0
        L2d:
            int r12 = r7 - r1
            r13 = 4
            if (r12 >= r2) goto L61
            r0.m13396F(r7)
            int r12 = r17.m13403f()
            int r14 = r17.m13403f()
            r3 = 1718775137(0x66726d61, float:2.862076E23)
            if (r14 != r3) goto L4b
            int r3 = r17.m13403f()
            java.lang.Integer r15 = java.lang.Integer.valueOf(r3)
            goto L5f
        L4b:
            r3 = 1935894637(0x7363686d, float:1.8017111E31)
            if (r14 != r3) goto L58
            r0.m13397G(r13)
            java.lang.String r11 = r0.m13415r(r13)
            goto L5f
        L58:
            r3 = 1935894633(0x73636869, float:1.8017106E31)
            if (r14 != r3) goto L5f
            r9 = r7
            r10 = r12
        L5f:
            int r7 = r7 + r12
            goto L2d
        L61:
            java.lang.String r3 = "cenc"
            boolean r3 = r3.equals(r11)
            if (r3 != 0) goto L85
            java.lang.String r3 = "cbc1"
            boolean r3 = r3.equals(r11)
            if (r3 != 0) goto L85
            java.lang.String r3 = "cens"
            boolean r3 = r3.equals(r11)
            if (r3 != 0) goto L85
            java.lang.String r3 = "cbcs"
            boolean r3 = r3.equals(r11)
            if (r3 == 0) goto L82
            goto L85
        L82:
            r3 = 0
            goto L124
        L85:
            if (r15 == 0) goto L89
            r3 = 1
            goto L8a
        L89:
            r3 = 0
        L8a:
            java.lang.String r7 = "frma atom is mandatory"
            p216m4.C4367l.m9807a(r3, r7)
            if (r9 == r8) goto L93
            r3 = 1
            goto L94
        L93:
            r3 = 0
        L94:
            java.lang.String r7 = "schi atom is mandatory"
            p216m4.C4367l.m9807a(r3, r7)
            int r3 = r9 + 8
        L9b:
            int r7 = r3 - r9
            if (r7 >= r10) goto L112
            r0.m13396F(r3)
            int r7 = r17.m13403f()
            int r8 = r17.m13403f()
            r12 = 1952804451(0x74656e63, float:7.270965E31)
            if (r8 != r12) goto L10e
            int r3 = r17.m13403f()
            int r3 = r3 >> 24
            r3 = r3 & 255(0xff, float:3.57E-43)
            r0.m13397G(r5)
            if (r3 != 0) goto Lc2
            r0.m13397G(r5)
            r3 = 0
            r14 = 0
            goto Lcc
        Lc2:
            int r3 = r17.m13418u()
            r7 = r3 & 240(0xf0, float:3.36E-43)
            int r7 = r7 >> r13
            r3 = r3 & 15
            r14 = r7
        Lcc:
            int r7 = r17.m13418u()
            if (r7 != r5) goto Ld4
            r10 = 1
            goto Ld5
        Ld4:
            r10 = 0
        Ld5:
            int r12 = r17.m13418u()
            r7 = 16
            byte[] r13 = new byte[r7]
            byte[] r8 = r0.f25710a
            int r9 = r0.f25711b
            java.lang.System.arraycopy(r8, r9, r13, r6, r7)
            int r8 = r0.f25711b
            int r8 = r8 + r7
            r0.f25711b = r8
            if (r10 == 0) goto L102
            if (r12 != 0) goto L102
            int r7 = r17.m13418u()
            byte[] r8 = new byte[r7]
            byte[] r9 = r0.f25710a
            int r5 = r0.f25711b
            java.lang.System.arraycopy(r9, r5, r8, r6, r7)
            int r5 = r0.f25711b
            int r5 = r5 + r7
            r0.f25711b = r5
            r16 = r8
            goto L104
        L102:
            r16 = 0
        L104:
            t4.m r5 = new t4.m
            r9 = r5
            r8 = r15
            r15 = r3
            r9.<init>(r10, r11, r12, r13, r14, r15, r16)
            r3 = r5
            goto L114
        L10e:
            r8 = r15
            int r3 = r3 + r7
            r5 = 1
            goto L9b
        L112:
            r8 = r15
            r3 = 0
        L114:
            if (r3 == 0) goto L118
            r5 = 1
            goto L119
        L118:
            r5 = 0
        L119:
            java.lang.String r6 = "tenc atom is mandatory"
            p216m4.C4367l.m9807a(r5, r6)
            int r5 = p371v5.C6552b0.f25624a
            android.util.Pair r3 = android.util.Pair.create(r8, r3)
        L124:
            if (r3 == 0) goto L127
            return r3
        L127:
            int r1 = r1 + r2
            goto L4
        L12a:
            r1 = 0
            return r1
    }

    /* renamed from: d */
    public static p336t4.C6157b.b m12705d(p371v5.C6571u r42, int r43, int r44, java.lang.String r45, p162j4.C3399d r46, boolean r47) {
            r0 = r42
            r1 = r43
            r2 = r45
            r3 = r46
            r4 = 12
            r0.m13396F(r4)
            int r4 = r42.m13403f()
            t4.b$b r5 = new t4.b$b
            r5.<init>(r4)
            r6 = 0
        L17:
            if (r6 >= r4) goto La71
            int r7 = r0.f25711b
            int r8 = r42.m13403f()
            if (r8 <= 0) goto L23
            r9 = 1
            goto L24
        L23:
            r9 = 0
        L24:
            java.lang.String r10 = "childAtomSize must be positive"
            p216m4.C4367l.m9807a(r9, r10)
            int r9 = r42.m13403f()
            r11 = 1635148593(0x61766331, float:2.840654E20)
            r12 = 1211250227(0x48323633, float:182488.8)
            r13 = 1831958048(0x6d317620, float:3.4326032E27)
            r14 = 1701733238(0x656e6376, float:7.035987E22)
            if (r9 == r11) goto L685
            r11 = 1635148595(0x61766333, float:2.8406544E20)
            if (r9 == r11) goto L685
            if (r9 == r14) goto L685
            if (r9 == r13) goto L685
            r11 = 1836070006(0x6d703476, float:4.646239E27)
            if (r9 == r11) goto L685
            r11 = 1752589105(0x68766331, float:4.6541277E24)
            if (r9 == r11) goto L685
            r11 = 1751479857(0x68657631, float:4.3344087E24)
            if (r9 == r11) goto L685
            r11 = 1932670515(0x73323633, float:1.4119387E31)
            if (r9 == r11) goto L685
            if (r9 == r12) goto L685
            r11 = 1987063864(0x76703038, float:1.21789965E33)
            if (r9 == r11) goto L685
            r11 = 1987063865(0x76703039, float:1.2178997E33)
            if (r9 == r11) goto L685
            r11 = 1635135537(0x61763031, float:2.8383572E20)
            if (r9 == r11) goto L685
            r11 = 1685479798(0x64766176, float:1.8179687E22)
            if (r9 == r11) goto L685
            r11 = 1685479729(0x64766131, float:1.817961E22)
            if (r9 == r11) goto L685
            r11 = 1685481573(0x64766865, float:1.8181686E22)
            if (r9 == r11) goto L685
            r11 = 1685481521(0x64766831, float:1.8181627E22)
            if (r9 != r11) goto L7f
            goto L685
        L7f:
            r11 = 1836069985(0x6d703461, float:4.6462328E27)
            r12 = 1701733217(0x656e6361, float:7.0359778E22)
            r13 = 1634492771(0x616c6163, float:2.7252807E20)
            if (r9 == r11) goto L1d5
            if (r9 == r12) goto L1d5
            r11 = 1633889587(0x61632d33, float:2.6191674E20)
            if (r9 == r11) goto L1d5
            r11 = 1700998451(0x65632d33, float:6.7050686E22)
            if (r9 == r11) goto L1d5
            r11 = 1633889588(0x61632d34, float:2.6191676E20)
            if (r9 == r11) goto L1d5
            r11 = 1835823201(0x6d6c7061, float:4.573395E27)
            if (r9 == r11) goto L1d5
            r11 = 1685353315(0x64747363, float:1.803728E22)
            if (r9 == r11) goto L1d5
            r11 = 1685353317(0x64747365, float:1.8037282E22)
            if (r9 == r11) goto L1d5
            r11 = 1685353320(0x64747368, float:1.8037286E22)
            if (r9 == r11) goto L1d5
            r11 = 1685353324(0x6474736c, float:1.803729E22)
            if (r9 == r11) goto L1d5
            r11 = 1685353336(0x64747378, float:1.8037304E22)
            if (r9 == r11) goto L1d5
            r11 = 1935764850(0x73616d72, float:1.7860208E31)
            if (r9 == r11) goto L1d5
            r11 = 1935767394(0x73617762, float:1.7863284E31)
            if (r9 == r11) goto L1d5
            r11 = 1819304813(0x6c70636d, float:1.1624469E27)
            if (r9 == r11) goto L1d5
            r11 = 1936684916(0x736f7774, float:1.89725E31)
            if (r9 == r11) goto L1d5
            r11 = 1953984371(0x74776f73, float:7.841539E31)
            if (r9 == r11) goto L1d5
            r11 = 778924082(0x2e6d7032, float:5.398721E-11)
            if (r9 == r11) goto L1d5
            r11 = 778924083(0x2e6d7033, float:5.3987214E-11)
            if (r9 == r11) goto L1d5
            r11 = 1835557169(0x6d686131, float:4.4948762E27)
            if (r9 == r11) goto L1d5
            r11 = 1835560241(0x6d686d31, float:4.495783E27)
            if (r9 == r11) goto L1d5
            if (r9 == r13) goto L1d5
            r11 = 1634492791(0x616c6177, float:2.7252842E20)
            if (r9 == r11) goto L1d5
            r11 = 1970037111(0x756c6177, float:2.9964816E32)
            if (r9 == r11) goto L1d5
            r11 = 1332770163(0x4f707573, float:4.034229E9)
            if (r9 == r11) goto L1d5
            r11 = 1716281667(0x664c6143, float:2.4128923E23)
            if (r9 != r11) goto Lfe
            goto L1d5
        Lfe:
            r10 = 1414810956(0x54544d4c, float:3.6473196E12)
            if (r9 == r10) goto L15c
            r10 = 1954034535(0x74783367, float:7.865797E31)
            if (r9 == r10) goto L15c
            r10 = 2004251764(0x77767474, float:4.998699E33)
            if (r9 == r10) goto L15c
            r10 = 1937010800(0x73747070, float:1.9366469E31)
            if (r9 == r10) goto L15c
            r10 = 1664495672(0x63363038, float:3.360782E21)
            if (r9 != r10) goto L118
            goto L15c
        L118:
            r10 = 1835365492(0x6d657474, float:4.4383032E27)
            if (r9 != r10) goto L144
            int r10 = r7 + 8
            int r10 = r10 + 8
            r0.m13396F(r10)
            r10 = 1835365492(0x6d657474, float:4.4383032E27)
            if (r9 != r10) goto L1c2
            r42.m13412o()
            java.lang.String r9 = r42.m13412o()
            if (r9 == 0) goto L1c2
            f4.e0$b r10 = new f4.e0$b
            r10.<init>()
            r10.m5194b(r1)
            r10.f8927k = r9
            f4.e0 r9 = r10.m5193a()
            r5.f23753b = r9
            goto L1c2
        L144:
            r10 = 1667329389(0x63616d6d, float:4.1584024E21)
            if (r9 != r10) goto L1c2
            f4.e0$b r9 = new f4.e0$b
            r9.<init>()
            r9.m5194b(r1)
            java.lang.String r10 = "application/x-camera-motion"
            r9.f8927k = r10
            f4.e0 r9 = r9.m5193a()
            r5.f23753b = r9
            goto L1c2
        L15c:
            int r10 = r7 + 8
            int r10 = r10 + 8
            r0.m13396F(r10)
            r10 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r12 = 1414810956(0x54544d4c, float:3.6473196E12)
            java.lang.String r13 = "application/ttml+xml"
            if (r9 != r12) goto L170
            goto L1aa
        L170:
            r12 = 1954034535(0x74783367, float:7.865797E31)
            if (r9 != r12) goto L18f
            int r9 = r8 + (-8)
            int r9 = r9 + (-8)
            byte[] r12 = new byte[r9]
            byte[] r13 = r0.f25710a
            int r14 = r0.f25711b
            r15 = 0
            java.lang.System.arraycopy(r13, r14, r12, r15, r9)
            int r13 = r0.f25711b
            int r13 = r13 + r9
            r0.f25711b = r13
            b9.n r9 = p026b9.AbstractC0714n.m2306D(r12)
            java.lang.String r12 = "application/x-quicktime-tx3g"
            goto L1ac
        L18f:
            r12 = 2004251764(0x77767474, float:4.998699E33)
            if (r9 != r12) goto L197
            java.lang.String r13 = "application/x-mp4-vtt"
            goto L1aa
        L197:
            r12 = 1937010800(0x73747070, float:1.9366469E31)
            if (r9 != r12) goto L1a0
            r9 = 0
            r10 = r9
            goto L1aa
        L1a0:
            r12 = 1664495672(0x63363038, float:3.360782E21)
            if (r9 != r12) goto L1cf
            r9 = 1
            r5.f23755d = r9
            java.lang.String r13 = "application/x-mp4-cea-608"
        L1aa:
            r9 = 0
            r12 = r13
        L1ac:
            f4.e0$b r13 = new f4.e0$b
            r13.<init>()
            r13.m5194b(r1)
            r13.f8927k = r12
            r13.f8919c = r2
            r13.f8931o = r10
            r13.f8929m = r9
            f4.e0 r9 = r13.m5193a()
            r5.f23753b = r9
        L1c2:
            r16 = r4
            r3 = r5
            r17 = r6
            r30 = r7
            r31 = r8
            r4 = r44
            goto La61
        L1cf:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>()
            throw r0
        L1d5:
            int r11 = r7 + 8
            r12 = 8
            int r11 = r11 + r12
            r0.m13396F(r11)
            r11 = 6
            if (r47 == 0) goto L1e8
            int r12 = r42.m13423z()
            r0.m13397G(r11)
            goto L1ec
        L1e8:
            r0.m13397G(r12)
            r12 = 0
        L1ec:
            r11 = 20
            if (r12 == 0) goto L21e
            r13 = 1
            if (r12 != r13) goto L1f4
            goto L21e
        L1f4:
            r13 = 2
            if (r12 != r13) goto L214
            r12 = 16
            r0.m13397G(r12)
            long r12 = r42.m13411n()
            double r12 = java.lang.Double.longBitsToDouble(r12)
            long r12 = java.lang.Math.round(r12)
            int r13 = (int) r12
            int r12 = r42.m13421x()
            r0.m13397G(r11)
            r11 = 0
            r16 = r4
            goto L256
        L214:
            r16 = r4
            r17 = r6
            r22 = r7
            r23 = r8
            goto L67c
        L21e:
            int r11 = r42.m13423z()
            r13 = 6
            r0.m13397G(r13)
            byte[] r13 = r0.f25710a
            int r14 = r0.f25711b
            int r15 = r14 + 1
            r0.f25711b = r15
            r14 = r13[r14]
            r14 = r14 & 255(0xff, float:3.57E-43)
            int r14 = r14 << 8
            r16 = r4
            int r4 = r15 + 1
            r0.f25711b = r4
            r13 = r13[r15]
            r13 = r13 & 255(0xff, float:3.57E-43)
            r13 = r13 | r14
            int r4 = r4 + 2
            r0.f25711b = r4
            int r4 = r4 + (-4)
            r0.m13396F(r4)
            int r4 = r42.m13403f()
            r14 = 1
            if (r12 != r14) goto L254
            r12 = 16
            r0.m13397G(r12)
        L254:
            r12 = r11
            r11 = r4
        L256:
            int r4 = r0.f25711b
            r14 = 1701733217(0x656e6361, float:7.0359778E22)
            if (r9 != r14) goto L28b
            android.util.Pair r14 = m12704c(r0, r7, r8)
            if (r14 == 0) goto L286
            java.lang.Object r9 = r14.first
            java.lang.Integer r9 = (java.lang.Integer) r9
            int r9 = r9.intValue()
            if (r3 != 0) goto L26f
            r15 = 0
            goto L279
        L26f:
            java.lang.Object r15 = r14.second
            t4.m r15 = (p336t4.C6168m) r15
            java.lang.String r15 = r15.f23871b
            j4.d r15 = r3.m7821a(r15)
        L279:
            r17 = r9
            t4.m[] r9 = r5.f23752a
            java.lang.Object r14 = r14.second
            t4.m r14 = (p336t4.C6168m) r14
            r9[r6] = r14
            r9 = r17
            goto L287
        L286:
            r15 = r3
        L287:
            r0.m13396F(r4)
            goto L28c
        L28b:
            r15 = r3
        L28c:
            java.lang.String r14 = "audio/ac4"
            java.lang.String r18 = "audio/eac3"
            r19 = r4
            java.lang.String r4 = "audio/ac3"
            java.lang.String r20 = "audio/raw"
            r21 = r12
            r12 = 1633889587(0x61632d33, float:2.6191674E20)
            if (r9 != r12) goto L2a1
            r20 = r4
            goto L359
        L2a1:
            r12 = 1700998451(0x65632d33, float:6.7050686E22)
            if (r9 != r12) goto L2aa
            r20 = r18
            goto L359
        L2aa:
            r12 = 1633889588(0x61632d34, float:2.6191676E20)
            if (r9 != r12) goto L2b3
            r20 = r14
            goto L359
        L2b3:
            r12 = 1685353315(0x64747363, float:1.803728E22)
            if (r9 != r12) goto L2be
            java.lang.String r9 = "audio/vnd.dts"
        L2ba:
            r20 = r9
            goto L359
        L2be:
            r12 = 1685353320(0x64747368, float:1.8037286E22)
            if (r9 == r12) goto L355
            r12 = 1685353324(0x6474736c, float:1.803729E22)
            if (r9 != r12) goto L2ca
            goto L355
        L2ca:
            r12 = 1685353317(0x64747365, float:1.8037282E22)
            if (r9 != r12) goto L2d2
            java.lang.String r9 = "audio/vnd.dts.hd;profile=lbr"
            goto L2ba
        L2d2:
            r12 = 1685353336(0x64747378, float:1.8037304E22)
            if (r9 != r12) goto L2da
            java.lang.String r9 = "audio/vnd.dts.uhd;profile=p2"
            goto L2ba
        L2da:
            r12 = 1935764850(0x73616d72, float:1.7860208E31)
            if (r9 != r12) goto L2e2
            java.lang.String r9 = "audio/3gpp"
            goto L2ba
        L2e2:
            r12 = 1935767394(0x73617762, float:1.7863284E31)
            if (r9 != r12) goto L2ea
            java.lang.String r9 = "audio/amr-wb"
            goto L2ba
        L2ea:
            r12 = 1819304813(0x6c70636d, float:1.1624469E27)
            if (r9 == r12) goto L353
            r12 = 1936684916(0x736f7774, float:1.89725E31)
            if (r9 != r12) goto L2f6
            goto L353
        L2f6:
            r12 = 1953984371(0x74776f73, float:7.841539E31)
            if (r9 != r12) goto L2fe
            r9 = 268435456(0x10000000, float:2.524355E-29)
            goto L35a
        L2fe:
            r12 = 778924082(0x2e6d7032, float:5.398721E-11)
            if (r9 == r12) goto L34f
            r12 = 778924083(0x2e6d7033, float:5.3987214E-11)
            if (r9 != r12) goto L309
            goto L34f
        L309:
            r12 = 1835557169(0x6d686131, float:4.4948762E27)
            if (r9 != r12) goto L311
            java.lang.String r9 = "audio/mha1"
            goto L2ba
        L311:
            r12 = 1835560241(0x6d686d31, float:4.495783E27)
            if (r9 != r12) goto L319
            java.lang.String r9 = "audio/mhm1"
            goto L2ba
        L319:
            r12 = 1634492771(0x616c6163, float:2.7252807E20)
            if (r9 != r12) goto L321
            java.lang.String r9 = "audio/alac"
            goto L2ba
        L321:
            r12 = 1634492791(0x616c6177, float:2.7252842E20)
            if (r9 != r12) goto L329
            java.lang.String r9 = "audio/g711-alaw"
            goto L2ba
        L329:
            r12 = 1970037111(0x756c6177, float:2.9964816E32)
            if (r9 != r12) goto L331
            java.lang.String r9 = "audio/g711-mlaw"
            goto L2ba
        L331:
            r12 = 1332770163(0x4f707573, float:4.034229E9)
            if (r9 != r12) goto L339
            java.lang.String r9 = "audio/opus"
            goto L2ba
        L339:
            r12 = 1716281667(0x664c6143, float:2.4128923E23)
            if (r9 != r12) goto L342
            java.lang.String r9 = "audio/flac"
            goto L2ba
        L342:
            r12 = 1835823201(0x6d6c7061, float:4.573395E27)
            if (r9 != r12) goto L34b
            java.lang.String r9 = "audio/true-hd"
            goto L2ba
        L34b:
            r9 = -1
            r20 = 0
            goto L35a
        L34f:
            java.lang.String r9 = "audio/mpeg"
            goto L2ba
        L353:
            r9 = 2
            goto L35a
        L355:
            java.lang.String r9 = "audio/vnd.dts.hd"
            goto L2ba
        L359:
            r9 = -1
        L35a:
            r12 = 0
            r17 = 0
            r3 = r13
            r13 = r21
            r21 = r17
            r17 = r6
            r40 = r20
            r20 = r9
            r9 = r40
            r41 = r19
            r19 = r12
            r12 = r41
        L370:
            int r6 = r12 - r7
            if (r6 >= r8) goto L64d
            r0.m13396F(r12)
            int r6 = r42.m13403f()
            if (r6 <= 0) goto L383
            r22 = 1
            r23 = r8
            r8 = 1
            goto L388
        L383:
            r22 = 0
            r23 = r8
            r8 = 0
        L388:
            p216m4.C4367l.m9807a(r8, r10)
            int r8 = r42.m13403f()
            r22 = r7
            r7 = 1835557187(0x6d686143, float:4.4948815E27)
            if (r8 != r7) goto L3bd
            int r7 = r6 + (-13)
            byte[] r8 = new byte[r7]
            r24 = r10
            int r10 = r12 + 13
            r0.m13396F(r10)
            byte[] r10 = r0.f25710a
            r25 = r6
            int r6 = r0.f25711b
            r26 = r3
            r3 = 0
            java.lang.System.arraycopy(r10, r6, r8, r3, r7)
            int r3 = r0.f25711b
            int r3 = r3 + r7
            r0.f25711b = r3
            b9.n r3 = p026b9.AbstractC0714n.m2306D(r8)
            r6 = r3
            r3 = r26
        L3b9:
            r26 = r4
            goto L5ba
        L3bd:
            r26 = r3
            r25 = r6
            r24 = r10
            r3 = 1702061171(0x65736473, float:7.183675E22)
            if (r8 == r3) goto L5c4
            if (r47 == 0) goto L3d8
            r3 = 2002876005(0x77617665, float:4.5729223E33)
            if (r8 != r3) goto L3d8
            r3 = 1702061171(0x65736473, float:7.183675E22)
            r6 = r26
            r26 = r4
            goto L5cb
        L3d8:
            r3 = 1684103987(0x64616333, float:1.6630662E22)
            if (r8 != r3) goto L41b
            int r3 = r12 + 8
            r0.m13396F(r3)
            java.lang.String r3 = java.lang.Integer.toString(r43)
            int r6 = r42.m13418u()
            r6 = r6 & 192(0xc0, float:2.69E-43)
            int r6 = r6 >> 6
            int[] r7 = p121h4.C2457b.f10960b
            r6 = r7[r6]
            int r7 = r42.m13418u()
            int[] r8 = p121h4.C2457b.f10962d
            r10 = r7 & 56
            int r10 = r10 >> 3
            r8 = r8[r10]
            r7 = r7 & 4
            if (r7 == 0) goto L404
            int r8 = r8 + 1
        L404:
            f4.e0$b r7 = new f4.e0$b
            r7.<init>()
            r7.f8917a = r3
            r7.f8927k = r4
            r7.f8940x = r8
            r7.f8941y = r6
            r7.f8930n = r15
            r7.f8919c = r2
            f4.e0 r3 = r7.m5193a()
            goto L4c1
        L41b:
            r3 = 1684366131(0x64656333, float:1.692581E22)
            if (r8 != r3) goto L488
            int r3 = r12 + 8
            r0.m13396F(r3)
            java.lang.String r3 = java.lang.Integer.toString(r43)
            r6 = 2
            r0.m13397G(r6)
            int r6 = r42.m13418u()
            r6 = r6 & 192(0xc0, float:2.69E-43)
            int r6 = r6 >> 6
            int[] r7 = p121h4.C2457b.f10960b
            r6 = r7[r6]
            int r7 = r42.m13418u()
            int[] r8 = p121h4.C2457b.f10962d
            r10 = r7 & 14
            int r10 = r10 >> 1
            r8 = r8[r10]
            r7 = r7 & 1
            if (r7 == 0) goto L44b
            int r8 = r8 + 1
        L44b:
            int r7 = r42.m13418u()
            r7 = r7 & 30
            int r7 = r7 >> 1
            if (r7 <= 0) goto L45f
            int r7 = r42.m13418u()
            r7 = r7 & 2
            if (r7 == 0) goto L45f
            int r8 = r8 + 2
        L45f:
            int r7 = r42.m13398a()
            if (r7 <= 0) goto L470
            int r7 = r42.m13418u()
            r7 = r7 & 1
            if (r7 == 0) goto L470
            java.lang.String r7 = "audio/eac3-joc"
            goto L472
        L470:
            r7 = r18
        L472:
            f4.e0$b r10 = new f4.e0$b
            r10.<init>()
            r10.f8917a = r3
            r10.f8927k = r7
            r10.f8940x = r8
            r10.f8941y = r6
            r10.f8930n = r15
            r10.f8919c = r2
            f4.e0 r3 = r10.m5193a()
            goto L4c1
        L488:
            r3 = 1684103988(0x64616334, float:1.6630663E22)
            if (r8 != r3) goto L4c9
            int r3 = r12 + 8
            r0.m13396F(r3)
            java.lang.String r3 = java.lang.Integer.toString(r43)
            r6 = 1
            r0.m13397G(r6)
            int r7 = r42.m13418u()
            r7 = r7 & 32
            int r7 = r7 >> 5
            if (r7 != r6) goto L4a8
            r6 = 48000(0xbb80, float:6.7262E-41)
            goto L4ab
        L4a8:
            r6 = 44100(0xac44, float:6.1797E-41)
        L4ab:
            f4.e0$b r7 = new f4.e0$b
            r7.<init>()
            r7.f8917a = r3
            r7.f8927k = r14
            r3 = 2
            r7.f8940x = r3
            r7.f8941y = r6
            r7.f8930n = r15
            r7.f8919c = r2
            f4.e0 r3 = r7.m5193a()
        L4c1:
            r5.f23753b = r3
            r6 = r26
        L4c5:
            r26 = r4
            goto L5b7
        L4c9:
            r3 = 1684892784(0x646d6c70, float:1.7518768E22)
            if (r8 != r3) goto L4e0
            if (r11 <= 0) goto L4d6
            r13 = 2
            r3 = r11
            r6 = r19
            goto L3b9
        L4d6:
            r0 = 60
            java.lang.String r1 = "Invalid sample rate for Dolby TrueHD MLP stream: "
            r2 = 0
            f4.s0 r0 = p216m4.C4357c0.m9780a(r0, r1, r11, r2)
            throw r0
        L4e0:
            r3 = 1684305011(0x64647473, float:1.6856995E22)
            if (r8 != r3) goto L500
            f4.e0$b r3 = new f4.e0$b
            r3.<init>()
            r3.m5194b(r1)
            r3.f8927k = r9
            r3.f8940x = r13
            r6 = r26
            r3.f8941y = r6
            r3.f8930n = r15
            r3.f8919c = r2
            f4.e0 r3 = r3.m5193a()
            r5.f23753b = r3
            goto L4c5
        L500:
            r6 = r26
            r3 = 1682927731(0x644f7073, float:1.5306315E22)
            if (r8 != r3) goto L525
            int r3 = r25 + (-8)
            byte[] r7 = p336t4.C6157b.f23751a
            int r8 = r7.length
            int r8 = r8 + r3
            byte[] r8 = java.util.Arrays.copyOf(r7, r8)
            int r10 = r12 + 8
            r0.m13396F(r10)
            int r7 = r7.length
            r0.m13402e(r8, r7, r3)
            java.util.List r3 = p064e.C1487a.m4024b(r8)
            r40 = r6
            r6 = r3
            r3 = r40
            goto L3b9
        L525:
            r3 = 1684425825(0x64664c61, float:1.6993019E22)
            if (r8 != r3) goto L562
            int r3 = r25 + (-12)
            int r7 = r3 + 4
            byte[] r7 = new byte[r7]
            r8 = 102(0x66, float:1.43E-43)
            r10 = 0
            r7[r10] = r8
            r8 = 76
            r10 = 1
            r7[r10] = r8
            r8 = 97
            r10 = 2
            r7[r10] = r8
            r8 = 67
            r10 = 3
            r7[r10] = r8
            int r8 = r12 + 12
            r0.m13396F(r8)
            byte[] r8 = r0.f25710a
            int r10 = r0.f25711b
            r26 = r4
            r4 = 4
            java.lang.System.arraycopy(r8, r10, r7, r4, r3)
            int r4 = r0.f25711b
            int r4 = r4 + r3
            r0.f25711b = r4
            b9.n r3 = p026b9.AbstractC0714n.m2306D(r7)
        L55c:
            r40 = r6
            r6 = r3
            r3 = r40
            goto L5ba
        L562:
            r26 = r4
            r3 = 1634492771(0x616c6163, float:2.7252807E20)
            if (r8 != r3) goto L5b7
            int r6 = r25 + (-12)
            byte[] r3 = new byte[r6]
            int r4 = r12 + 12
            r0.m13396F(r4)
            byte[] r4 = r0.f25710a
            int r7 = r0.f25711b
            r8 = 0
            java.lang.System.arraycopy(r4, r7, r3, r8, r6)
            int r4 = r0.f25711b
            int r4 = r4 + r6
            r0.f25711b = r4
            v5.u r4 = new v5.u
            r4.<init>(r3)
            r6 = 9
            r4.m13396F(r6)
            int r6 = r4.m13418u()
            r7 = 20
            r4.m13396F(r7)
            int r4 = r4.m13421x()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            android.util.Pair r4 = android.util.Pair.create(r4, r6)
            java.lang.Object r6 = r4.first
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r6 = r6.intValue()
            java.lang.Object r4 = r4.second
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r13 = r4.intValue()
            b9.n r3 = p026b9.AbstractC0714n.m2306D(r3)
            goto L55c
        L5b7:
            r3 = r6
            r6 = r19
        L5ba:
            r19 = r6
            r10 = r24
            r7 = r25
            r24 = r11
            goto L642
        L5c4:
            r6 = r26
            r26 = r4
            r3 = 1702061171(0x65736473, float:7.183675E22)
        L5cb:
            if (r8 != r3) goto L5d7
            r3 = -1
            r3 = r12
            r10 = r24
            r7 = r25
            r4 = -1
            r24 = r11
            goto L615
        L5d7:
            int r3 = r0.f25711b
            r4 = 0
            if (r3 < r12) goto L5de
            r7 = 1
            goto L5df
        L5de:
            r7 = 0
        L5df:
            p216m4.C4367l.m9807a(r7, r4)
        L5e2:
            int r4 = r3 - r12
            r7 = r25
            if (r4 >= r7) goto L60d
            r0.m13396F(r3)
            int r4 = r42.m13403f()
            if (r4 <= 0) goto L5f3
            r8 = 1
            goto L5f4
        L5f3:
            r8 = 0
        L5f4:
            r10 = r24
            p216m4.C4367l.m9807a(r8, r10)
            int r8 = r42.m13403f()
            r24 = r11
            r11 = 1702061171(0x65736473, float:7.183675E22)
            if (r8 != r11) goto L605
            goto L614
        L605:
            int r3 = r3 + r4
            r25 = r7
            r11 = r24
            r24 = r10
            goto L5e2
        L60d:
            r10 = r24
            r24 = r11
            r3 = -1
            r4 = -1
            r3 = -1
        L614:
            r4 = -1
        L615:
            if (r3 == r4) goto L641
            android.util.Pair r3 = m12702a(r0, r3)
            java.lang.Object r4 = r3.first
            java.lang.String r4 = (java.lang.String) r4
            java.lang.Object r3 = r3.second
            byte[] r3 = (byte[]) r3
            if (r3 == 0) goto L640
            java.lang.String r8 = "audio/mp4a-latm"
            boolean r8 = r8.equals(r4)
            if (r8 == 0) goto L63a
            h4.a$b r6 = p121h4.C2455a.m6236c(r3)
            int r8 = r6.f10956a
            int r13 = r6.f10957b
            java.lang.String r6 = r6.f10958c
            r21 = r6
            r6 = r8
        L63a:
            b9.n r3 = p026b9.AbstractC0714n.m2306D(r3)
            r19 = r3
        L640:
            r9 = r4
        L641:
            r3 = r6
        L642:
            int r12 = r12 + r7
            r7 = r22
            r8 = r23
            r11 = r24
            r4 = r26
            goto L370
        L64d:
            r6 = r3
            r22 = r7
            r23 = r8
            f4.e0 r3 = r5.f23753b
            if (r3 != 0) goto L67c
            if (r9 == 0) goto L67c
            f4.e0$b r3 = new f4.e0$b
            r3.<init>()
            r3.m5194b(r1)
            r3.f8927k = r9
            r4 = r21
            r3.f8924h = r4
            r3.f8940x = r13
            r3.f8941y = r6
            r9 = r20
            r3.f8942z = r9
            r12 = r19
            r3.f8929m = r12
            r3.f8930n = r15
            r3.f8919c = r2
            f4.e0 r3 = r3.m5193a()
            r5.f23753b = r3
        L67c:
            r4 = r44
            r3 = r5
            r30 = r22
            r31 = r23
            goto La61
        L685:
            r16 = r4
            r17 = r6
            r22 = r7
            r23 = r8
            int r7 = r22 + 8
            int r7 = r7 + 8
            r0.m13396F(r7)
            r3 = 16
            r0.m13397G(r3)
            int r3 = r42.m13423z()
            int r4 = r42.m13423z()
            r6 = 50
            r0.m13397G(r6)
            int r6 = r0.f25711b
            if (r9 != r14) goto L6dc
            r7 = r22
            r8 = r23
            android.util.Pair r11 = m12704c(r0, r7, r8)
            if (r11 == 0) goto L6d5
            java.lang.Object r9 = r11.first
            java.lang.Integer r9 = (java.lang.Integer) r9
            int r9 = r9.intValue()
            r12 = r46
            if (r12 != 0) goto L6c2
            r14 = 0
            goto L6cc
        L6c2:
            java.lang.Object r14 = r11.second
            t4.m r14 = (p336t4.C6168m) r14
            java.lang.String r14 = r14.f23871b
            j4.d r14 = r12.m7821a(r14)
        L6cc:
            t4.m[] r15 = r5.f23752a
            java.lang.Object r11 = r11.second
            t4.m r11 = (p336t4.C6168m) r11
            r15[r17] = r11
            goto L6d8
        L6d5:
            r12 = r46
            r14 = r12
        L6d8:
            r0.m13396F(r6)
            goto L6e3
        L6dc:
            r12 = r46
            r7 = r22
            r8 = r23
            r14 = r12
        L6e3:
            java.lang.String r11 = "video/3gpp"
            if (r9 != r13) goto L6ea
            java.lang.String r13 = "video/mpeg"
            goto L6f2
        L6ea:
            r13 = 1211250227(0x48323633, float:182488.8)
            if (r9 != r13) goto L6f1
            r13 = r11
            goto L6f2
        L6f1:
            r13 = 0
        L6f2:
            r15 = 1065353216(0x3f800000, float:1.0)
            r18 = 0
            r19 = 0
            r20 = -1
            r21 = 0
            r22 = -1
            r23 = -1
            r24 = -1
            r25 = 0
            r26 = 0
            r2 = r18
            r20 = r26
            r12 = -1
            r27 = -1
            r28 = -1
            r29 = -1
            r18 = r11
            r11 = r19
            r19 = r14
        L717:
            int r14 = r6 - r7
            if (r14 >= r8) goto L9f4
            r0.m13396F(r6)
            int r14 = r0.f25711b
            r22 = r12
            int r12 = r42.m13403f()
            r23 = r2
            if (r12 != 0) goto L73b
            int r2 = r0.f25711b
            int r2 = r2 - r7
            if (r2 != r8) goto L73b
            r39 = r3
            r34 = r4
            r32 = r5
            r30 = r7
            r31 = r8
            goto La02
        L73b:
            if (r12 <= 0) goto L73f
            r2 = 1
            goto L740
        L73f:
            r2 = 0
        L740:
            p216m4.C4367l.m9807a(r2, r10)
            int r2 = r42.m13403f()
            r24 = r10
            r10 = 1635148611(0x61766343, float:2.8406573E20)
            if (r2 != r10) goto L770
            if (r13 != 0) goto L752
            r2 = 1
            goto L753
        L752:
            r2 = 0
        L753:
            r10 = 0
            p216m4.C4367l.m9807a(r2, r10)
            int r14 = r14 + 8
            r0.m13396F(r14)
            w5.a r2 = p387w5.C6798a.m13827b(r42)
            java.util.List<byte[]> r10 = r2.f26396a
            int r11 = r2.f26397b
            r5.f23754c = r11
            if (r25 != 0) goto L76a
            float r15 = r2.f26400e
        L76a:
            java.lang.String r2 = r2.f26401f
            java.lang.String r11 = "video/avc"
        L76e:
            r14 = r10
            goto L7c1
        L770:
            r10 = 1752589123(0x68766343, float:4.6541328E24)
            if (r2 != r10) goto L796
            if (r13 != 0) goto L779
            r2 = 1
            goto L77a
        L779:
            r2 = 0
        L77a:
            r10 = 0
            p216m4.C4367l.m9807a(r2, r10)
            int r14 = r14 + 8
            r0.m13396F(r14)
            w5.f r2 = p387w5.C6803f.m13845a(r42)
            java.util.List<byte[]> r10 = r2.f26435a
            int r11 = r2.f26436b
            r5.f23754c = r11
            if (r25 != 0) goto L791
            float r15 = r2.f26437c
        L791:
            java.lang.String r2 = r2.f26438d
            java.lang.String r11 = "video/hevc"
            goto L76e
        L796:
            r10 = 1685480259(0x64766343, float:1.8180206E22)
            if (r2 == r10) goto L9be
            r10 = 1685485123(0x64767643, float:1.8185683E22)
            if (r2 != r10) goto L7a2
            goto L9be
        L7a2:
            r10 = 1987076931(0x76706343, float:1.21891066E33)
            if (r2 != r10) goto L7c4
            if (r13 != 0) goto L7ab
            r2 = 1
            goto L7ac
        L7ab:
            r2 = 0
        L7ac:
            r10 = 0
            p216m4.C4367l.m9807a(r2, r10)
            r2 = 1987063864(0x76703038, float:1.21789965E33)
            if (r9 != r2) goto L7b8
            java.lang.String r2 = "video/x-vnd.on2.vp8"
            goto L7ba
        L7b8:
            java.lang.String r2 = "video/x-vnd.on2.vp9"
        L7ba:
            r14 = r20
            r40 = r11
            r11 = r2
            r2 = r40
        L7c1:
            r13 = r11
            r11 = r2
            goto L801
        L7c4:
            r10 = 1635135811(0x61763143, float:2.8384055E20)
            if (r2 != r10) goto L7d5
            if (r13 != 0) goto L7cd
            r2 = 1
            goto L7ce
        L7cd:
            r2 = 0
        L7ce:
            r10 = 0
            p216m4.C4367l.m9807a(r2, r10)
            java.lang.String r13 = "video/av01"
            goto L7ff
        L7d5:
            r10 = 1668050025(0x636c6c69, float:4.3612434E21)
            r26 = 25
            if (r2 != r10) goto L80f
            if (r21 != 0) goto L7e8
            java.nio.ByteBuffer r2 = java.nio.ByteBuffer.allocate(r26)
            java.nio.ByteOrder r10 = java.nio.ByteOrder.LITTLE_ENDIAN
            java.nio.ByteBuffer r21 = r2.order(r10)
        L7e8:
            r2 = r21
            r10 = 21
            r2.position(r10)
            short r10 = r42.m13414q()
            r2.putShort(r10)
            short r10 = r42.m13414q()
            r2.putShort(r10)
            r21 = r2
        L7ff:
            r14 = r20
        L801:
            r39 = r3
            r34 = r4
            r32 = r5
            r30 = r7
            r31 = r8
            r26 = r9
            goto L88a
        L80f:
            r10 = 1835295606(0x6d646376, float:4.4176764E27)
            if (r2 != r10) goto L890
            if (r21 != 0) goto L820
            java.nio.ByteBuffer r2 = java.nio.ByteBuffer.allocate(r26)
            java.nio.ByteOrder r10 = java.nio.ByteOrder.LITTLE_ENDIAN
            java.nio.ByteBuffer r21 = r2.order(r10)
        L820:
            r2 = r21
            short r10 = r42.m13414q()
            short r14 = r42.m13414q()
            r26 = r9
            short r9 = r42.m13414q()
            r30 = r7
            short r7 = r42.m13414q()
            r31 = r8
            short r8 = r42.m13414q()
            r32 = r5
            short r5 = r42.m13414q()
            r33 = r15
            short r15 = r42.m13414q()
            r34 = r4
            short r4 = r42.m13414q()
            long r35 = r42.m13419v()
            long r37 = r42.m13419v()
            r39 = r3
            r3 = 1
            r2.position(r3)
            r2.putShort(r8)
            r2.putShort(r5)
            r2.putShort(r10)
            r2.putShort(r14)
            r2.putShort(r9)
            r2.putShort(r7)
            r2.putShort(r15)
            r2.putShort(r4)
            r3 = 10000(0x2710, double:4.9407E-320)
            long r7 = r35 / r3
            int r5 = (int) r7
            short r5 = (short) r5
            r2.putShort(r5)
            long r3 = r37 / r3
            int r4 = (int) r3
            short r3 = (short) r4
            r2.putShort(r3)
            r21 = r2
            r14 = r20
            r15 = r33
        L88a:
            r20 = r14
            r2 = r23
            goto L9e1
        L890:
            r39 = r3
            r34 = r4
            r32 = r5
            r30 = r7
            r31 = r8
            r26 = r9
            r33 = r15
            r3 = 1681012275(0x64323633, float:1.3149704E22)
            if (r2 != r3) goto L8b0
            r2 = 0
            if (r13 != 0) goto L8a8
            r3 = 1
            goto L8a9
        L8a8:
            r3 = 0
        L8a9:
            p216m4.C4367l.m9807a(r3, r2)
            r13 = r18
            goto L9d9
        L8b0:
            r3 = 0
            r4 = 1702061171(0x65736473, float:7.183675E22)
            if (r2 != r4) goto L8d3
            if (r13 != 0) goto L8ba
            r2 = 1
            goto L8bb
        L8ba:
            r2 = 0
        L8bb:
            p216m4.C4367l.m9807a(r2, r3)
            android.util.Pair r2 = m12702a(r0, r14)
            java.lang.Object r3 = r2.first
            r13 = r3
            java.lang.String r13 = (java.lang.String) r13
            java.lang.Object r2 = r2.second
            byte[] r2 = (byte[]) r2
            if (r2 == 0) goto L9d9
            b9.n r14 = p026b9.AbstractC0714n.m2306D(r2)
            goto L9db
        L8d3:
            r4 = 1885434736(0x70617370, float:2.7909473E29)
            if (r2 != r4) goto L8f0
            int r14 = r14 + 8
            r0.m13396F(r14)
            int r2 = r42.m13421x()
            int r3 = r42.m13421x()
            float r2 = (float) r2
            float r3 = (float) r3
            float r2 = r2 / r3
            r3 = 1
            r15 = r2
            r2 = r23
            r25 = 1
            goto L9e1
        L8f0:
            r4 = 1937126244(0x73763364, float:1.9506033E31)
            if (r2 != r4) goto L91a
            int r2 = r14 + 8
        L8f7:
            int r4 = r2 - r14
            if (r4 >= r12) goto L915
            r0.m13396F(r2)
            int r4 = r42.m13403f()
            int r5 = r42.m13403f()
            r7 = 1886547818(0x70726f6a, float:3.0012025E29)
            if (r5 != r7) goto L913
            byte[] r3 = r0.f25710a
            int r4 = r4 + r2
            byte[] r2 = java.util.Arrays.copyOfRange(r3, r2, r4)
            goto L916
        L913:
            int r2 = r2 + r4
            goto L8f7
        L915:
            r2 = r3
        L916:
            r14 = r20
            goto L9dd
        L91a:
            r3 = 1936995172(0x73743364, float:1.9347576E31)
            if (r2 != r3) goto L95d
            int r2 = r42.m13418u()
            r3 = 3
            r0.m13397G(r3)
            if (r2 != 0) goto L9d9
            int r2 = r42.m13418u()
            r4 = 1
            if (r2 == 0) goto L954
            if (r2 == r4) goto L94b
            r4 = 2
            if (r2 == r4) goto L942
            if (r2 == r3) goto L939
            goto L9d9
        L939:
            r2 = 3
            r14 = r20
            r2 = r23
            r22 = 3
            goto L9dd
        L942:
            r2 = 2
            r14 = r20
            r2 = r23
            r22 = 2
            goto L9dd
        L94b:
            r2 = 1
            r14 = r20
            r2 = r23
            r22 = 1
            goto L9dd
        L954:
            r2 = 0
            r14 = r20
            r2 = r23
            r22 = 0
            goto L9dd
        L95d:
            r3 = 1668246642(0x636f6c72, float:4.4165861E21)
            if (r2 != r3) goto L9d9
            int r2 = r42.m13403f()
            r3 = 1852009592(0x6e636c78, float:1.7596057E28)
            if (r2 == r3) goto L991
            r3 = 1852009571(0x6e636c63, float:1.7596032E28)
            if (r2 != r3) goto L971
            goto L991
        L971:
            java.lang.String r3 = "Unsupported color type: "
            java.lang.String r2 = p336t4.AbstractC6156a.m12699a(r2)
            java.lang.String r2 = java.lang.String.valueOf(r2)
            int r4 = r2.length()
            if (r4 == 0) goto L986
            java.lang.String r2 = r3.concat(r2)
            goto L98b
        L986:
            java.lang.String r2 = new java.lang.String
            r2.<init>(r3)
        L98b:
            java.lang.String r3 = "AtomParsers"
            android.util.Log.w(r3, r2)
            goto L9d9
        L991:
            int r2 = r42.m13423z()
            int r3 = r42.m13423z()
            r4 = 2
            r0.m13397G(r4)
            r4 = 19
            if (r12 != r4) goto L9ab
            int r4 = r42.m13418u()
            r4 = r4 & 128(0x80, float:1.8E-43)
            if (r4 == 0) goto L9ab
            r4 = 1
            goto L9ac
        L9ab:
            r4 = 0
        L9ac:
            int r29 = p387w5.C6799b.m13828a(r2)
            if (r4 == 0) goto L9b6
            r2 = 1
            r28 = 1
            goto L9b9
        L9b6:
            r2 = 2
            r28 = 2
        L9b9:
            int r27 = p387w5.C6799b.m13829b(r3)
            goto L9d9
        L9be:
            r39 = r3
            r34 = r4
            r32 = r5
            r30 = r7
            r31 = r8
            r26 = r9
            r33 = r15
            w5.c r2 = p387w5.C6800c.m13831c(r42)
            if (r2 == 0) goto L9d9
            java.lang.Object r2 = r2.f26411d
            r11 = r2
            java.lang.String r11 = (java.lang.String) r11
            java.lang.String r13 = "video/dolby-vision"
        L9d9:
            r14 = r20
        L9db:
            r2 = r23
        L9dd:
            r20 = r14
            r15 = r33
        L9e1:
            int r6 = r6 + r12
            r12 = r22
            r10 = r24
            r9 = r26
            r7 = r30
            r8 = r31
            r5 = r32
            r4 = r34
            r3 = r39
            goto L717
        L9f4:
            r23 = r2
            r39 = r3
            r34 = r4
            r32 = r5
            r30 = r7
            r31 = r8
            r22 = r12
        La02:
            r33 = r15
            r2 = 0
            if (r13 != 0) goto La0c
            r4 = r44
            r3 = r32
            goto La61
        La0c:
            f4.e0$b r3 = new f4.e0$b
            r3.<init>()
            r3.m5194b(r1)
            r3.f8927k = r13
            r3.f8924h = r11
            r4 = r39
            r3.f8932p = r4
            r4 = r34
            r3.f8933q = r4
            r15 = r33
            r3.f8936t = r15
            r4 = r44
            r3.f8935s = r4
            r5 = r23
            r3.f8937u = r5
            r5 = r22
            r3.f8938v = r5
            r5 = r20
            r3.f8929m = r5
            r12 = r19
            r3.f8930n = r12
            r5 = -1
            r6 = r29
            if (r6 != r5) goto La48
            r7 = r28
            r8 = r27
            if (r7 != r5) goto La4c
            if (r8 != r5) goto La4c
            if (r21 == 0) goto La59
            goto La4c
        La48:
            r8 = r27
            r7 = r28
        La4c:
            w5.b r5 = new w5.b
            if (r21 == 0) goto La54
            byte[] r2 = r21.array()
        La54:
            r5.<init>(r6, r7, r8, r2)
            r3.f8939w = r5
        La59:
            f4.e0 r2 = r3.m5193a()
            r3 = r32
            r3.f23753b = r2
        La61:
            int r7 = r30 + r31
            r0.m13396F(r7)
            int r6 = r17 + 1
            r2 = r45
            r5 = r3
            r4 = r16
            r3 = r46
            goto L17
        La71:
            r3 = r5
            return r3
    }

    /* renamed from: e */
    public static java.util.List<p336t4.C6170o> m12706e(p336t4.AbstractC6156a.a r46, p216m4.C4374s r47, long r48, p162j4.C3399d r50, boolean r51, boolean r52, p010a9.InterfaceC0036d<p336t4.C6167l, p336t4.C6167l> r53) {
            r0 = r46
            r1 = r47
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r4 = 0
        La:
            java.util.List<t4.a$a> r5 = r0.f23749d
            int r5 = r5.size()
            if (r4 >= r5) goto L900
            java.util.List<t4.a$a> r5 = r0.f23749d
            java.lang.Object r5 = r5.get(r4)
            t4.a$a r5 = (p336t4.AbstractC6156a.a) r5
            int r6 = r5.f23746a
            r7 = 1953653099(0x7472616b, float:7.681346E31)
            if (r6 == r7) goto L26
            r0 = r2
            r38 = r4
            goto L8ef
        L26:
            r6 = 1836476516(0x6d766864, float:4.7662196E27)
            t4.a$b r6 = r0.m12701c(r6)
            java.util.Objects.requireNonNull(r6)
            r7 = 1835297121(0x6d646961, float:4.4181236E27)
            t4.a$a r8 = r5.m12700b(r7)
            java.util.Objects.requireNonNull(r8)
            r9 = 1751411826(0x68646c72, float:4.3148E24)
            t4.a$b r9 = r8.m12701c(r9)
            java.util.Objects.requireNonNull(r9)
            v5.u r9 = r9.f23750b
            r10 = 16
            r9.m13396F(r10)
            int r9 = r9.m13403f()
            r11 = 1936684398(0x736f756e, float:1.8971874E31)
            r14 = -1
            if (r9 != r11) goto L57
            r9 = 1
            goto L7d
        L57:
            r11 = 1986618469(0x76696465, float:1.1834389E33)
            if (r9 != r11) goto L5e
            r9 = 2
            goto L7d
        L5e:
            r11 = 1952807028(0x74657874, float:7.272211E31)
            if (r9 == r11) goto L7c
            r11 = 1935832172(0x7362746c, float:1.7941596E31)
            if (r9 == r11) goto L7c
            r11 = 1937072756(0x73756274, float:1.944137E31)
            if (r9 == r11) goto L7c
            r11 = 1668047728(0x636c6370, float:4.3605968E21)
            if (r9 != r11) goto L73
            goto L7c
        L73:
            r11 = 1835365473(0x6d657461, float:4.4382975E27)
            if (r9 != r11) goto L7a
            r9 = 5
            goto L7d
        L7a:
            r9 = -1
            goto L7d
        L7c:
            r9 = 3
        L7d:
            r7 = 4
            if (r9 != r14) goto L86
            r39 = r2
            r38 = r4
            goto L290
        L86:
            r15 = 1953196132(0x746b6864, float:7.46037E31)
            t4.a$b r15 = r5.m12701c(r15)
            java.util.Objects.requireNonNull(r15)
            v5.u r15 = r15.f23750b
            r11 = 8
            r15.m13396F(r11)
            int r17 = r15.m13403f()
            int r3 = r17 >> 24
            r3 = r3 & 255(0xff, float:3.57E-43)
            if (r3 != 0) goto La2
            goto La4
        La2:
            r11 = 16
        La4:
            r15.m13397G(r11)
            int r11 = r15.m13403f()
            r15.m13397G(r7)
            int r7 = r15.f25711b
            if (r3 != 0) goto Lb4
            r10 = 4
            goto Lb6
        Lb4:
            r10 = 8
        Lb6:
            r12 = 0
        Lb7:
            if (r12 >= r10) goto Lc6
            byte[] r13 = r15.f25710a
            int r19 = r7 + r12
            r13 = r13[r19]
            if (r13 == r14) goto Lc3
            r7 = 0
            goto Lc7
        Lc3:
            int r12 = r12 + 1
            goto Lb7
        Lc6:
            r7 = 1
        Lc7:
            if (r7 == 0) goto Lcd
            r15.m13397G(r10)
            goto Lde
        Lcd:
            if (r3 != 0) goto Ld4
            long r19 = r15.m13419v()
            goto Ld8
        Ld4:
            long r19 = r15.m13422y()
        Ld8:
            r21 = 0
            int r3 = (r19 > r21 ? 1 : (r19 == r21 ? 0 : -1))
            if (r3 != 0) goto Le6
        Lde:
            r3 = 16
            r19 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            goto Le8
        Le6:
            r3 = 16
        Le8:
            r15.m13397G(r3)
            int r7 = r15.m13403f()
            int r10 = r15.m13403f()
            r3 = 4
            r15.m13397G(r3)
            int r3 = r15.m13403f()
            int r15 = r15.m13403f()
            r14 = 65536(0x10000, float:9.1835E-41)
            r12 = -65536(0xffffffffffff0000, float:NaN)
            if (r7 != 0) goto L10e
            if (r10 != r14) goto L10e
            if (r3 != r12) goto L10e
            if (r15 != 0) goto L10e
            r3 = 90
            goto L125
        L10e:
            if (r7 != 0) goto L119
            if (r10 != r12) goto L119
            if (r3 != r14) goto L119
            if (r15 != 0) goto L119
            r3 = 270(0x10e, float:3.78E-43)
            goto L125
        L119:
            if (r7 != r12) goto L124
            if (r10 != 0) goto L124
            if (r3 != 0) goto L124
            if (r15 != r12) goto L124
            r3 = 180(0xb4, float:2.52E-43)
            goto L125
        L124:
            r3 = 0
        L125:
            r12 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r7 = (r48 > r12 ? 1 : (r48 == r12 ? 0 : -1))
            if (r7 != 0) goto L12f
            goto L131
        L12f:
            r19 = r48
        L131:
            v5.u r6 = r6.f23750b
            r7 = 8
            r6.m13396F(r7)
            int r7 = r6.m13403f()
            int r7 = r7 >> 24
            r7 = r7 & 255(0xff, float:3.57E-43)
            if (r7 != 0) goto L145
            r7 = 8
            goto L147
        L145:
            r7 = 16
        L147:
            r6.m13397G(r7)
            long r6 = r6.m13419v()
            r12 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r10 = (r19 > r12 ? 1 : (r19 == r12 ? 0 : -1))
            if (r10 != 0) goto L158
            goto L163
        L158:
            r23 = 1000000(0xf4240, double:4.940656E-318)
            r21 = r19
            r25 = r6
            long r12 = p371v5.C6552b0.m13301E(r21, r23, r25)
        L163:
            r10 = 1835626086(0x6d696e66, float:4.515217E27)
            t4.a$a r14 = r8.m12700b(r10)
            java.util.Objects.requireNonNull(r14)
            r10 = 1937007212(0x7374626c, float:1.9362132E31)
            t4.a$a r14 = r14.m12700b(r10)
            java.util.Objects.requireNonNull(r14)
            r10 = 1835296868(0x6d646864, float:4.418049E27)
            t4.a$b r8 = r8.m12701c(r10)
            java.util.Objects.requireNonNull(r8)
            v5.u r8 = r8.f23750b
            r10 = 8
            r8.m13396F(r10)
            int r10 = r8.m13403f()
            int r10 = r10 >> 24
            r10 = r10 & 255(0xff, float:3.57E-43)
            if (r10 != 0) goto L195
            r15 = 8
            goto L197
        L195:
            r15 = 16
        L197:
            r8.m13397G(r15)
            long r18 = r8.m13419v()
            if (r10 != 0) goto L1a2
            r10 = 4
            goto L1a4
        L1a2:
            r10 = 8
        L1a4:
            r8.m13397G(r10)
            int r8 = r8.m13423z()
            int r10 = r8 >> 10
            r10 = r10 & 31
            int r10 = r10 + 96
            char r10 = (char) r10
            int r15 = r8 >> 5
            r15 = r15 & 31
            int r15 = r15 + 96
            char r15 = (char) r15
            r8 = r8 & 31
            int r8 = r8 + 96
            char r8 = (char) r8
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r38 = r4
            r4 = 3
            r0.<init>(r4)
            r0.append(r10)
            r0.append(r15)
            r0.append(r8)
            java.lang.String r0 = r0.toString()
            java.lang.Long r4 = java.lang.Long.valueOf(r18)
            android.util.Pair r0 = android.util.Pair.create(r4, r0)
            r4 = 1937011556(0x73747364, float:1.9367383E31)
            t4.a$b r4 = r14.m12701c(r4)
            java.util.Objects.requireNonNull(r4)
            v5.u r4 = r4.f23750b
            java.lang.Object r8 = r0.second
            r21 = r8
            java.lang.String r21 = (java.lang.String) r21
            r18 = r4
            r19 = r11
            r20 = r3
            r22 = r50
            r23 = r52
            t4.b$b r3 = m12705d(r18, r19, r20, r21, r22, r23)
            if (r51 != 0) goto L284
            r4 = 1701082227(0x65647473, float:6.742798E22)
            t4.a$a r4 = r5.m12700b(r4)
            if (r4 == 0) goto L284
            r8 = 1701606260(0x656c7374, float:6.9788014E22)
            t4.a$b r4 = r4.m12701c(r8)
            if (r4 != 0) goto L215
            r39 = r2
            r23 = r12
            r2 = 0
            goto L275
        L215:
            v5.u r4 = r4.f23750b
            r8 = 8
            r4.m13396F(r8)
            int r8 = r4.m13403f()
            int r8 = r8 >> 24
            r8 = r8 & 255(0xff, float:3.57E-43)
            int r10 = r4.m13421x()
            long[] r14 = new long[r10]
            long[] r15 = new long[r10]
            r39 = r2
            r2 = 0
        L22f:
            if (r2 >= r10) goto L26f
            r16 = r10
            r10 = 1
            if (r8 != r10) goto L23b
            long r17 = r4.m13422y()
            goto L23f
        L23b:
            long r17 = r4.m13419v()
        L23f:
            r14[r2] = r17
            if (r8 != r10) goto L24a
            long r17 = r4.m13411n()
            r23 = r12
            goto L253
        L24a:
            int r10 = r4.m13403f()
            r23 = r12
            long r12 = (long) r10
            r17 = r12
        L253:
            r15[r2] = r17
            short r10 = r4.m13414q()
            r12 = 1
            if (r10 != r12) goto L267
            r10 = 2
            r4.m13397G(r10)
            int r2 = r2 + 1
            r10 = r16
            r12 = r23
            goto L22f
        L267:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Unsupported media rate."
            r0.<init>(r1)
            throw r0
        L26f:
            r23 = r12
            android.util.Pair r2 = android.util.Pair.create(r14, r15)
        L275:
            if (r2 == 0) goto L288
            java.lang.Object r4 = r2.first
            long[] r4 = (long[]) r4
            java.lang.Object r2 = r2.second
            long[] r2 = (long[]) r2
            r30 = r2
            r29 = r4
            goto L28c
        L284:
            r39 = r2
            r23 = r12
        L288:
            r29 = 0
            r30 = 0
        L28c:
            f4.e0 r2 = r3.f23753b
            if (r2 != 0) goto L294
        L290:
            r0 = r53
            r2 = 0
            goto L2bb
        L294:
            t4.l r2 = new t4.l
            java.lang.Object r0 = r0.first
            java.lang.Long r0 = (java.lang.Long) r0
            long r19 = r0.longValue()
            f4.e0 r0 = r3.f23753b
            int r4 = r3.f23755d
            t4.m[] r8 = r3.f23752a
            int r3 = r3.f23754c
            r16 = r2
            r17 = r11
            r18 = r9
            r21 = r6
            r25 = r0
            r26 = r4
            r27 = r8
            r28 = r3
            r16.<init>(r17, r18, r19, r21, r23, r25, r26, r27, r28, r29, r30)
            r0 = r53
        L2bb:
            java.lang.Object r2 = r0.apply(r2)
            r7 = r2
            t4.l r7 = (p336t4.C6167l) r7
            if (r7 != 0) goto L2c8
            r0 = r39
            goto L8ef
        L2c8:
            r2 = 1835297121(0x6d646961, float:4.4181236E27)
            t4.a$a r2 = r5.m12700b(r2)
            java.util.Objects.requireNonNull(r2)
            r3 = 1835626086(0x6d696e66, float:4.515217E27)
            t4.a$a r2 = r2.m12700b(r3)
            java.util.Objects.requireNonNull(r2)
            r3 = 1937007212(0x7374626c, float:1.9362132E31)
            t4.a$a r2 = r2.m12700b(r3)
            java.util.Objects.requireNonNull(r2)
            r3 = 1937011578(0x7374737a, float:1.936741E31)
            t4.a$b r3 = r2.m12701c(r3)
            if (r3 == 0) goto L2f7
            t4.b$c r4 = new t4.b$c
            f4.e0 r5 = r7.f23864f
            r4.<init>(r3, r5)
            goto L305
        L2f7:
            r3 = 1937013298(0x73747a32, float:1.9369489E31)
            t4.a$b r3 = r2.m12701c(r3)
            if (r3 == 0) goto L8f8
            t4.b$d r4 = new t4.b$d
            r4.<init>(r3)
        L305:
            int r3 = r4.mo12708b()
            if (r3 != 0) goto L321
            t4.o r2 = new t4.o
            r3 = 0
            long[] r8 = new long[r3]
            int[] r9 = new int[r3]
            r10 = 0
            long[] r11 = new long[r3]
            int[] r12 = new int[r3]
            r13 = 0
            r6 = r2
            r6.<init>(r7, r8, r9, r10, r11, r12, r13)
        L31d:
            r0 = r39
            goto L8ec
        L321:
            r5 = 1937007471(0x7374636f, float:1.9362445E31)
            t4.a$b r5 = r2.m12701c(r5)
            if (r5 != 0) goto L336
            r5 = 1668232756(0x636f3634, float:4.4126776E21)
            t4.a$b r5 = r2.m12701c(r5)
            java.util.Objects.requireNonNull(r5)
            r6 = 1
            goto L337
        L336:
            r6 = 0
        L337:
            v5.u r5 = r5.f23750b
            r8 = 1937011555(0x73747363, float:1.9367382E31)
            t4.a$b r8 = r2.m12701c(r8)
            java.util.Objects.requireNonNull(r8)
            v5.u r8 = r8.f23750b
            r9 = 1937011827(0x73747473, float:1.9367711E31)
            t4.a$b r9 = r2.m12701c(r9)
            java.util.Objects.requireNonNull(r9)
            v5.u r9 = r9.f23750b
            r10 = 1937011571(0x73747373, float:1.9367401E31)
            t4.a$b r10 = r2.m12701c(r10)
            if (r10 == 0) goto L35d
            v5.u r10 = r10.f23750b
            goto L35e
        L35d:
            r10 = 0
        L35e:
            r11 = 1668576371(0x63747473, float:4.5093966E21)
            t4.a$b r2 = r2.m12701c(r11)
            if (r2 == 0) goto L36a
            v5.u r2 = r2.f23750b
            goto L36b
        L36a:
            r2 = 0
        L36b:
            r11 = 12
            r5.m13396F(r11)
            int r12 = r5.m13421x()
            r8.m13396F(r11)
            int r13 = r8.m13421x()
            int r14 = r8.m13403f()
            r15 = 1
            if (r14 != r15) goto L384
            r14 = 1
            goto L385
        L384:
            r14 = 0
        L385:
            java.lang.String r15 = "first_chunk must be 1"
            p216m4.C4367l.m9807a(r14, r15)
            r9.m13396F(r11)
            int r14 = r9.m13421x()
            r15 = 1
            int r14 = r14 - r15
            int r15 = r9.m13421x()
            int r0 = r9.m13421x()
            if (r2 == 0) goto L3a5
            r2.m13396F(r11)
            int r16 = r2.m13421x()
            goto L3a7
        L3a5:
            r16 = 0
        L3a7:
            if (r10 == 0) goto L3c2
            r10.m13396F(r11)
            int r11 = r10.m13421x()
            if (r11 <= 0) goto L3be
            int r17 = r10.m13421x()
            r18 = r10
            r10 = -1
            int r37 = r17 + (-1)
            r17 = r37
            goto L3c8
        L3be:
            r10 = -1
            r18 = 0
            goto L3c6
        L3c2:
            r18 = r10
            r10 = -1
            r11 = 0
        L3c6:
            r17 = -1
        L3c8:
            int r10 = r4.mo12707a()
            r19 = r13
            f4.e0 r13 = r7.f23864f
            java.lang.String r13 = r13.f8896j0
            r20 = r15
            r15 = -1
            if (r10 == r15) goto L3f7
            java.lang.String r15 = "audio/raw"
            boolean r15 = r15.equals(r13)
            if (r15 != 0) goto L3ef
            java.lang.String r15 = "audio/g711-mlaw"
            boolean r15 = r15.equals(r13)
            if (r15 != 0) goto L3ef
            java.lang.String r15 = "audio/g711-alaw"
            boolean r13 = r15.equals(r13)
            if (r13 == 0) goto L3f7
        L3ef:
            if (r14 != 0) goto L3f7
            if (r16 != 0) goto L3f7
            if (r11 != 0) goto L3f7
            r13 = 1
            goto L3f8
        L3f7:
            r13 = 0
        L3f8:
            if (r13 == 0) goto L4b9
            long[] r2 = new long[r12]
            int[] r4 = new int[r12]
            r13 = r19
            r9 = 0
            r14 = 0
            r16 = -1
            r17 = 1
            r18 = 0
        L409:
            int r11 = r16 + 1
            if (r11 != r12) goto L410
            r16 = 0
            goto L43c
        L410:
            if (r6 == 0) goto L417
            long r14 = r5.m13422y()
            goto L41b
        L417:
            long r14 = r5.m13419v()
        L41b:
            if (r11 != r9) goto L436
            int r9 = r8.m13421x()
            r16 = r9
            r9 = 4
            r8.m13397G(r9)
            int r13 = r13 + (-1)
            if (r13 <= 0) goto L434
            int r9 = r8.m13421x()
            r17 = -1
            int r9 = r9 + (-1)
            goto L438
        L434:
            r9 = -1
            goto L438
        L436:
            r16 = r18
        L438:
            r18 = r16
            r16 = 1
        L43c:
            if (r16 == 0) goto L447
            r2[r11] = r14
            r4[r11] = r18
            r16 = r11
            r17 = 1
            goto L409
        L447:
            long r5 = (long) r0
            r0 = 8192(0x2000, float:1.148E-41)
            int r0 = r0 / r10
            r8 = 0
            r9 = 0
        L44d:
            if (r8 >= r12) goto L459
            r11 = r4[r8]
            int r11 = p371v5.C6552b0.m13313f(r11, r0)
            int r9 = r9 + r11
            int r8 = r8 + 1
            goto L44d
        L459:
            long[] r8 = new long[r9]
            int[] r11 = new int[r9]
            long[] r13 = new long[r9]
            int[] r9 = new int[r9]
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
        L467:
            if (r14 >= r12) goto L4b0
            r18 = r4[r14]
            r19 = r2[r14]
            r21 = r19
            r20 = r4
            r4 = r18
            r18 = r2
            r2 = r17
        L477:
            if (r4 <= 0) goto L4a3
            int r17 = java.lang.Math.min(r0, r4)
            r8[r16] = r21
            int r19 = r10 * r17
            r11[r16] = r19
            r19 = r0
            r0 = r11[r16]
            int r2 = java.lang.Math.max(r2, r0)
            long r0 = (long) r15
            long r0 = r0 * r5
            r13[r16] = r0
            r0 = 1
            r9[r16] = r0
            r0 = r11[r16]
            long r0 = (long) r0
            long r21 = r21 + r0
            int r15 = r15 + r17
            int r4 = r4 - r17
            int r16 = r16 + 1
            r1 = r47
            r0 = r19
            goto L477
        L4a3:
            r19 = r0
            int r14 = r14 + 1
            r1 = r47
            r17 = r2
            r2 = r18
            r4 = r20
            goto L467
        L4b0:
            long r0 = (long) r15
            long r5 = r5 * r0
            r2 = r9
            r0 = r11
            r1 = r13
            r9 = r7
            goto L65a
        L4b9:
            long[] r1 = new long[r3]
            int[] r10 = new int[r3]
            long[] r13 = new long[r3]
            int[] r15 = new int[r3]
            r31 = r0
            r21 = r9
            r22 = r14
            r9 = r17
            r25 = r20
            r23 = 0
            r24 = 0
            r26 = 0
            r27 = 0
            r29 = 0
            r35 = 0
            r40 = 0
            r41 = 0
            r17 = r7
            r14 = r11
            r20 = r16
            r7 = 0
            r11 = 0
            r16 = -1
        L4e4:
            java.lang.String r0 = "AtomParsers"
            if (r11 >= r3) goto L5cb
            r42 = r3
            r3 = r23
            r23 = 1
        L4ee:
            if (r24 != 0) goto L530
            r33 = r14
            int r14 = r16 + 1
            if (r14 != r12) goto L4fb
            r23 = 0
            r37 = -1
            goto L525
        L4fb:
            if (r6 == 0) goto L502
            long r35 = r5.m13422y()
            goto L506
        L502:
            long r35 = r5.m13419v()
        L506:
            if (r14 != r3) goto L521
            int r26 = r8.m13421x()
            r3 = 4
            r8.m13397G(r3)
            int r19 = r19 + (-1)
            if (r19 <= 0) goto L51d
            int r3 = r8.m13421x()
            r37 = -1
            int r3 = r3 + (-1)
            goto L523
        L51d:
            r37 = -1
            r3 = -1
            goto L523
        L521:
            r37 = -1
        L523:
            r23 = 1
        L525:
            r16 = r14
            if (r23 == 0) goto L534
            r24 = r26
            r14 = r33
            r29 = r35
            goto L4ee
        L530:
            r33 = r14
            r37 = -1
        L534:
            if (r23 != 0) goto L54e
            java.lang.String r3 = "Unexpected end of chunk data"
            android.util.Log.w(r0, r3)
            long[] r1 = java.util.Arrays.copyOf(r1, r11)
            int[] r10 = java.util.Arrays.copyOf(r10, r11)
            long[] r13 = java.util.Arrays.copyOf(r13, r11)
            int[] r15 = java.util.Arrays.copyOf(r15, r11)
            r3 = r11
            goto L5d0
        L54e:
            if (r2 == 0) goto L561
        L550:
            if (r41 != 0) goto L55f
            if (r20 <= 0) goto L55f
            int r41 = r2.m13421x()
            int r40 = r2.m13403f()
            int r20 = r20 + (-1)
            goto L550
        L55f:
            int r41 = r41 + (-1)
        L561:
            r0 = r40
            r1[r11] = r29
            int r14 = r4.mo12709c()
            r10[r11] = r14
            r14 = r10[r11]
            if (r14 <= r7) goto L571
            r7 = r10[r11]
        L571:
            r23 = r3
            r14 = r4
            long r3 = (long) r0
            long r3 = r27 + r3
            r13[r11] = r3
            if (r18 != 0) goto L57d
            r3 = 1
            goto L57e
        L57d:
            r3 = 0
        L57e:
            r15[r11] = r3
            if (r11 != r9) goto L599
            r3 = 1
            r15[r11] = r3
            int r4 = r33 + (-1)
            if (r4 <= 0) goto L591
            java.util.Objects.requireNonNull(r18)
            int r9 = r18.m13421x()
            int r9 = r9 - r3
        L591:
            r33 = r4
            r3 = r31
            r31 = r0
            r4 = r1
            goto L59e
        L599:
            r4 = r1
            r3 = r31
            r31 = r0
        L59e:
            long r0 = (long) r3
            long r27 = r27 + r0
            int r25 = r25 + (-1)
            if (r25 != 0) goto L5b4
            if (r22 <= 0) goto L5b4
            int r0 = r21.m13421x()
            int r1 = r21.m13403f()
            int r22 = r22 + (-1)
            r25 = r0
            goto L5b5
        L5b4:
            r1 = r3
        L5b5:
            r0 = r10[r11]
            r3 = r1
            long r0 = (long) r0
            long r29 = r29 + r0
            int r24 = r24 + (-1)
            int r11 = r11 + 1
            r1 = r4
            r4 = r14
            r40 = r31
            r14 = r33
            r31 = r3
            r3 = r42
            goto L4e4
        L5cb:
            r4 = r1
            r42 = r3
            r33 = r14
        L5d0:
            r4 = r24
            r5 = r40
            long r5 = (long) r5
            long r5 = r27 + r5
            if (r2 == 0) goto L5e9
        L5d9:
            if (r20 <= 0) goto L5e9
            int r8 = r2.m13421x()
            if (r8 == 0) goto L5e3
            r2 = 0
            goto L5ea
        L5e3:
            r2.m13403f()
            int r20 = r20 + (-1)
            goto L5d9
        L5e9:
            r2 = 1
        L5ea:
            if (r33 != 0) goto L5fc
            if (r25 != 0) goto L5fc
            if (r4 != 0) goto L5fc
            if (r22 != 0) goto L5fc
            r8 = r41
            if (r8 != 0) goto L5fe
            if (r2 != 0) goto L5f9
            goto L5fe
        L5f9:
            r9 = r17
            goto L654
        L5fc:
            r8 = r41
        L5fe:
            r9 = r17
            int r11 = r9.f23859a
            if (r2 != 0) goto L607
            java.lang.String r2 = ", ctts invalid"
            goto L609
        L607:
            java.lang.String r2 = ""
        L609:
            int r12 = r2.length()
            int r12 = r12 + 262
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>(r12)
            java.lang.String r12 = "Inconsistent stbl box for track "
            r14.append(r12)
            r14.append(r11)
            java.lang.String r11 = ": remainingSynchronizationSamples "
            r14.append(r11)
            r11 = r33
            r14.append(r11)
            java.lang.String r11 = ", remainingSamplesAtTimestampDelta "
            r14.append(r11)
            r11 = r25
            r14.append(r11)
            java.lang.String r11 = ", remainingSamplesInChunk "
            r14.append(r11)
            r14.append(r4)
            java.lang.String r4 = ", remainingTimestampDeltaChanges "
            r14.append(r4)
            r4 = r22
            r14.append(r4)
            java.lang.String r4 = ", remainingSamplesAtTimestampOffset "
            r14.append(r4)
            r14.append(r8)
            r14.append(r2)
            java.lang.String r2 = r14.toString()
            android.util.Log.w(r0, r2)
        L654:
            r8 = r1
            r17 = r7
            r0 = r10
            r1 = r13
            r2 = r15
        L65a:
            long r14 = r9.f23861c
            r12 = 1000000(0xf4240, double:4.940656E-318)
            r10 = r5
            long r13 = p371v5.C6552b0.m13301E(r10, r12, r14)
            long[] r4 = r9.f23866h
            r10 = 1000000(0xf4240, double:4.940656E-318)
            if (r4 != 0) goto L67f
            long r3 = r9.f23861c
            p371v5.C6552b0.m13302F(r1, r10, r3)
            t4.o r3 = new t4.o
            r6 = r3
            r7 = r9
            r9 = r0
            r10 = r17
            r11 = r1
            r12 = r2
            r6.<init>(r7, r8, r9, r10, r11, r12, r13)
            r2 = r3
            goto L31d
        L67f:
            int r4 = r4.length
            r7 = 1
            if (r4 != r7) goto L734
            int r4 = r9.f23860b
            if (r4 != r7) goto L734
            int r4 = r1.length
            r7 = 2
            if (r4 < r7) goto L734
            long[] r4 = r9.f23867i
            java.util.Objects.requireNonNull(r4)
            r7 = 0
            r12 = r4[r7]
            long[] r4 = r9.f23866h
            r18 = r4[r7]
            long r14 = r9.f23861c
            long r10 = r9.f23862d
            r20 = r14
            r22 = r10
            long r10 = p371v5.C6552b0.m13301E(r18, r20, r22)
            long r10 = r10 + r12
            int r4 = r1.length
            r14 = 1
            int r4 = r4 - r14
            r14 = 4
            int r15 = p371v5.C6552b0.m13315h(r14, r7, r4)
            r16 = r3
            int r3 = r1.length
            int r3 = r3 - r14
            int r3 = p371v5.C6552b0.m13315h(r3, r7, r4)
            r18 = r1[r7]
            int r4 = (r18 > r12 ? 1 : (r18 == r12 ? 0 : -1))
            if (r4 > 0) goto L6cc
            r14 = r1[r15]
            int r4 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r4 >= 0) goto L6cc
            r3 = r1[r3]
            int r7 = (r3 > r10 ? 1 : (r3 == r10 ? 0 : -1))
            if (r7 >= 0) goto L6cc
            int r3 = (r10 > r5 ? 1 : (r10 == r5 ? 0 : -1))
            if (r3 > 0) goto L6cc
            r3 = 1
            goto L6cd
        L6cc:
            r3 = 0
        L6cd:
            if (r3 == 0) goto L736
            long r18 = r5 - r10
            r3 = 0
            r10 = r1[r3]
            long r40 = r12 - r10
            f4.e0 r3 = r9.f23864f
            int r3 = r3.f8910x0
            long r3 = (long) r3
            long r10 = r9.f23861c
            r42 = r3
            r44 = r10
            long r3 = p371v5.C6552b0.m13301E(r40, r42, r44)
            f4.e0 r7 = r9.f23864f
            int r7 = r7.f8910x0
            long r10 = (long) r7
            long r12 = r9.f23861c
            r20 = r10
            r22 = r12
            long r10 = p371v5.C6552b0.m13301E(r18, r20, r22)
            r12 = 0
            int r7 = (r3 > r12 ? 1 : (r3 == r12 ? 0 : -1))
            if (r7 != 0) goto L6fe
            int r7 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r7 == 0) goto L736
        L6fe:
            r12 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r7 = (r3 > r12 ? 1 : (r3 == r12 ? 0 : -1))
            if (r7 > 0) goto L736
            int r7 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r7 > 0) goto L736
            int r4 = (int) r3
            r3 = r47
            r3.f17927a = r4
            int r4 = (int) r10
            r3.f17928b = r4
            long r4 = r9.f23861c
            r6 = 1000000(0xf4240, double:4.940656E-318)
            p371v5.C6552b0.m13302F(r1, r6, r4)
            long[] r4 = r9.f23866h
            r5 = 0
            r10 = r4[r5]
            r12 = 1000000(0xf4240, double:4.940656E-318)
            long r14 = r9.f23862d
            long r13 = p371v5.C6552b0.m13301E(r10, r12, r14)
            t4.o r4 = new t4.o
            r6 = r4
            r7 = r9
            r9 = r0
            r10 = r17
            r11 = r1
            r12 = r2
            r6.<init>(r7, r8, r9, r10, r11, r12, r13)
            goto L77f
        L734:
            r16 = r3
        L736:
            r3 = r47
            long[] r4 = r9.f23866h
            int r7 = r4.length
            r10 = 1
            if (r7 != r10) goto L782
            r7 = 0
            r10 = r4[r7]
            r12 = 0
            int r14 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r14 != 0) goto L782
            long[] r4 = r9.f23867i
            java.util.Objects.requireNonNull(r4)
            r10 = r4[r7]
            r4 = 0
        L74f:
            int r7 = r1.length
            if (r4 >= r7) goto L766
            r12 = r1[r4]
            long r18 = r12 - r10
            r20 = 1000000(0xf4240, double:4.940656E-318)
            long r12 = r9.f23861c
            r22 = r12
            long r12 = p371v5.C6552b0.m13301E(r18, r20, r22)
            r1[r4] = r12
            int r4 = r4 + 1
            goto L74f
        L766:
            long r18 = r5 - r10
            r20 = 1000000(0xf4240, double:4.940656E-318)
            long r4 = r9.f23861c
            r22 = r4
            long r13 = p371v5.C6552b0.m13301E(r18, r20, r22)
            t4.o r4 = new t4.o
            r6 = r4
            r7 = r9
            r9 = r0
            r10 = r17
            r11 = r1
            r12 = r2
            r6.<init>(r7, r8, r9, r10, r11, r12, r13)
        L77f:
            r2 = r4
            goto L31d
        L782:
            int r5 = r9.f23860b
            r6 = 1
            if (r5 != r6) goto L789
            r10 = 1
            goto L78a
        L789:
            r10 = 0
        L78a:
            int r5 = r4.length
            int[] r5 = new int[r5]
            int r4 = r4.length
            int[] r4 = new int[r4]
            long[] r6 = r9.f23867i
            java.util.Objects.requireNonNull(r6)
            r7 = 0
            r11 = 0
            r12 = 0
            r13 = 0
        L799:
            long[] r14 = r9.f23866h
            int r15 = r14.length
            if (r7 >= r15) goto L803
            r15 = r11
            r18 = r12
            r11 = r6[r7]
            r19 = -1
            int r21 = (r11 > r19 ? 1 : (r11 == r19 ? 0 : -1))
            if (r21 == 0) goto L7f2
            r22 = r14[r7]
            r19 = r15
            long r14 = r9.f23861c
            r20 = r2
            long r2 = r9.f23862d
            r24 = r14
            r26 = r2
            long r2 = p371v5.C6552b0.m13301E(r22, r24, r26)
            r14 = 1
            int r15 = p371v5.C6552b0.m13312e(r1, r11, r14, r14)
            r5[r7] = r15
            long r11 = r11 + r2
            r2 = 0
            int r3 = p371v5.C6552b0.m13309b(r1, r11, r10, r2)
            r4[r7] = r3
        L7ca:
            r3 = r5[r7]
            r11 = r4[r7]
            if (r3 >= r11) goto L7dd
            r3 = r5[r7]
            r3 = r20[r3]
            r3 = r3 & r14
            if (r3 != 0) goto L7dd
            r3 = r5[r7]
            int r3 = r3 + r14
            r5[r7] = r3
            goto L7ca
        L7dd:
            r3 = r4[r7]
            r11 = r5[r7]
            int r3 = r3 - r11
            int r3 = r3 + r18
            r11 = r5[r7]
            if (r13 == r11) goto L7ea
            r11 = 1
            goto L7eb
        L7ea:
            r11 = 0
        L7eb:
            r11 = r19 | r11
            r12 = r4[r7]
            r13 = r12
            r12 = r3
            goto L7fc
        L7f2:
            r20 = r2
            r19 = r15
            r2 = 0
            r14 = 1
            r12 = r18
            r11 = r19
        L7fc:
            int r7 = r7 + 1
            r3 = r47
            r2 = r20
            goto L799
        L803:
            r20 = r2
            r19 = r11
            r3 = r16
            r2 = 0
            r14 = 1
            if (r12 == r3) goto L80f
            r15 = 1
            goto L810
        L80f:
            r15 = 0
        L810:
            r3 = r19 | r15
            if (r3 == 0) goto L818
            long[] r6 = new long[r12]
            r10 = r6
            goto L819
        L818:
            r10 = r8
        L819:
            if (r3 == 0) goto L81f
            int[] r6 = new int[r12]
            r11 = r6
            goto L820
        L81f:
            r11 = r0
        L820:
            if (r3 == 0) goto L824
            r17 = 0
        L824:
            if (r3 == 0) goto L82a
            int[] r6 = new int[r12]
            r13 = r6
            goto L82c
        L82a:
            r13 = r20
        L82c:
            long[] r12 = new long[r12]
            r6 = 0
            r7 = 0
            r14 = 0
        L832:
            long[] r2 = r9.f23866h
            int r2 = r2.length
            if (r6 >= r2) goto L8c9
            long[] r2 = r9.f23867i
            r18 = r2[r6]
            r2 = r5[r6]
            r16 = r5
            r5 = r4[r6]
            r27 = r4
            if (r3 == 0) goto L855
            int r4 = r5 - r2
            java.lang.System.arraycopy(r8, r2, r10, r7, r4)
            java.lang.System.arraycopy(r0, r2, r11, r7, r4)
            r28 = r8
            r8 = r20
            java.lang.System.arraycopy(r8, r2, r13, r7, r4)
            goto L859
        L855:
            r28 = r8
            r8 = r20
        L859:
            r4 = r17
        L85b:
            if (r2 >= r5) goto L8a5
            r23 = 1000000(0xf4240, double:4.940656E-318)
            r29 = r5
            r20 = r6
            long r5 = r9.f23862d
            r21 = r14
            r25 = r5
            long r5 = p371v5.C6552b0.m13301E(r21, r23, r25)
            r21 = r1[r2]
            r30 = r13
            r23 = r14
            long r13 = r21 - r18
            r15 = r0
            r21 = r1
            r0 = 0
            long r31 = java.lang.Math.max(r0, r13)
            r33 = 1000000(0xf4240, double:4.940656E-318)
            long r13 = r9.f23861c
            r35 = r13
            long r13 = p371v5.C6552b0.m13301E(r31, r33, r35)
            long r5 = r5 + r13
            r12[r7] = r5
            if (r3 == 0) goto L895
            r5 = r11[r7]
            if (r5 <= r4) goto L895
            r4 = r15[r2]
        L895:
            int r7 = r7 + 1
            int r2 = r2 + 1
            r0 = r15
            r6 = r20
            r1 = r21
            r14 = r23
            r5 = r29
            r13 = r30
            goto L85b
        L8a5:
            r21 = r1
            r20 = r6
            r30 = r13
            r23 = r14
            r15 = r0
            r0 = 0
            long[] r2 = r9.f23866h
            r5 = r2[r20]
            long r5 = r23 + r5
            int r2 = r20 + 1
            r17 = r4
            r20 = r8
            r0 = r15
            r1 = r21
            r4 = r27
            r8 = r28
            r14 = r5
            r5 = r16
            r6 = r2
            goto L832
        L8c9:
            r30 = r13
            r23 = r14
            r0 = 1000000(0xf4240, double:4.940656E-318)
            long r2 = r9.f23862d
            r21 = r23
            r23 = r0
            r25 = r2
            long r13 = p371v5.C6552b0.m13301E(r21, r23, r25)
            t4.o r2 = new t4.o
            r6 = r2
            r7 = r9
            r8 = r10
            r9 = r11
            r10 = r17
            r11 = r12
            r12 = r30
            r6.<init>(r7, r8, r9, r10, r11, r12, r13)
            goto L31d
        L8ec:
            r0.add(r2)
        L8ef:
            int r4 = r38 + 1
            r1 = r47
            r2 = r0
            r0 = r46
            goto La
        L8f8:
            java.lang.String r0 = "Track has no sample table size information"
            r1 = 0
            f4.s0 r0 = p088f4.C2044s0.m5407a(r0, r1)
            throw r0
        L900:
            r0 = r2
            return r0
    }
}
