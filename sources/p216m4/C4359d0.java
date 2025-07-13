package p216m4;

/* renamed from: m4.d0 */
/* loaded from: classes.dex */
public final class C4359d0 {

    /* renamed from: m4.d0$a */
    public static final class a {

        /* renamed from: a */
        public final java.lang.String[] f17880a;

        public a(java.lang.String r1, java.lang.String[] r2, int r3) {
                r0 = this;
                r0.<init>()
                r0.f17880a = r2
                return
        }
    }

    /* renamed from: m4.d0$b */
    public static final class b {

        /* renamed from: a */
        public final boolean f17881a;

        public b(boolean r1, int r2, int r3, int r4) {
                r0 = this;
                r0.<init>()
                r0.f17881a = r1
                return
        }
    }

    /* renamed from: m4.d0$c */
    public static final class c {

        /* renamed from: a */
        public final int f17882a;

        /* renamed from: b */
        public final int f17883b;

        /* renamed from: c */
        public final int f17884c;

        /* renamed from: d */
        public final int f17885d;

        /* renamed from: e */
        public final int f17886e;

        /* renamed from: f */
        public final int f17887f;

        /* renamed from: g */
        public final byte[] f17888g;

        public c(int r1, int r2, int r3, int r4, int r5, int r6, int r7, int r8, boolean r9, byte[] r10) {
                r0 = this;
                r0.<init>()
                r0.f17882a = r2
                r0.f17883b = r3
                r0.f17884c = r4
                r0.f17885d = r5
                r0.f17886e = r7
                r0.f17887f = r8
                r0.f17888g = r10
                return
        }
    }

    /* renamed from: a */
    public static int m9781a(int r1) {
            r0 = 0
        L1:
            if (r1 <= 0) goto L8
            int r0 = r0 + 1
            int r1 = r1 >>> 1
            goto L1
        L8:
            return r0
    }

    /* renamed from: b */
    public static p216m4.C4359d0.a m9782b(p371v5.C6571u r8, boolean r9, boolean r10) {
            r0 = 0
            if (r9 == 0) goto L7
            r9 = 3
            m9783c(r9, r8, r0)
        L7:
            long r1 = r8.m13408k()
            int r9 = (int) r1
            java.lang.String r9 = r8.m13415r(r9)
            int r1 = r9.length()
            int r1 = r1 + 11
            long r2 = r8.m13408k()
            int r4 = (int) r2
            java.lang.String[] r4 = new java.lang.String[r4]
            int r1 = r1 + 4
        L1f:
            long r5 = (long) r0
            int r7 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r7 >= 0) goto L3b
            long r5 = r8.m13408k()
            int r6 = (int) r5
            int r1 = r1 + 4
            java.lang.String r5 = r8.m13415r(r6)
            r4[r0] = r5
            r5 = r4[r0]
            int r5 = r5.length()
            int r1 = r1 + r5
            int r0 = r0 + 1
            goto L1f
        L3b:
            if (r10 == 0) goto L4e
            int r8 = r8.m13418u()
            r8 = r8 & 1
            if (r8 == 0) goto L46
            goto L4e
        L46:
            r8 = 0
            java.lang.String r9 = "framing bit expected to be set"
            f4.s0 r8 = p088f4.C2044s0.m5407a(r9, r8)
            throw r8
        L4e:
            int r1 = r1 + 1
            m4.d0$a r8 = new m4.d0$a
            r8.<init>(r9, r4, r1)
            return r8
    }

    /* renamed from: c */
    public static boolean m9783c(int r4, p371v5.C6571u r5, boolean r6) {
            int r0 = r5.m13398a()
            r1 = 0
            r2 = 0
            r3 = 7
            if (r0 >= r3) goto L19
            if (r6 == 0) goto Lc
            return r1
        Lc:
            int r4 = r5.m13398a()
            r5 = 29
            java.lang.String r6 = "too short header: "
            f4.s0 r4 = p216m4.C4357c0.m9780a(r5, r6, r4, r2)
            throw r4
        L19:
            int r0 = r5.m13418u()
            if (r0 == r4) goto L41
            if (r6 == 0) goto L22
            return r1
        L22:
            java.lang.String r5 = "expected header type "
            java.lang.String r4 = java.lang.Integer.toHexString(r4)
            java.lang.String r4 = java.lang.String.valueOf(r4)
            int r6 = r4.length()
            if (r6 == 0) goto L37
            java.lang.String r4 = r5.concat(r4)
            goto L3c
        L37:
            java.lang.String r4 = new java.lang.String
            r4.<init>(r5)
        L3c:
            f4.s0 r4 = p088f4.C2044s0.m5407a(r4, r2)
            throw r4
        L41:
            int r4 = r5.m13418u()
            r0 = 118(0x76, float:1.65E-43)
            if (r4 != r0) goto L74
            int r4 = r5.m13418u()
            r0 = 111(0x6f, float:1.56E-43)
            if (r4 != r0) goto L74
            int r4 = r5.m13418u()
            r0 = 114(0x72, float:1.6E-43)
            if (r4 != r0) goto L74
            int r4 = r5.m13418u()
            r0 = 98
            if (r4 != r0) goto L74
            int r4 = r5.m13418u()
            r0 = 105(0x69, float:1.47E-43)
            if (r4 != r0) goto L74
            int r4 = r5.m13418u()
            r5 = 115(0x73, float:1.61E-43)
            if (r4 == r5) goto L72
            goto L74
        L72:
            r4 = 1
            return r4
        L74:
            if (r6 == 0) goto L77
            return r1
        L77:
            java.lang.String r4 = "expected characters 'vorbis'"
            f4.s0 r4 = p088f4.C2044s0.m5407a(r4, r2)
            throw r4
    }
}
