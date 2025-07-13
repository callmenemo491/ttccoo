package p163j5;

/* renamed from: j5.a */
/* loaded from: classes.dex */
public final class C3422a extends p163j5.AbstractC3425d {

    /* renamed from: A */
    public static final int[] f14772A = null;

    /* renamed from: B */
    public static final int[] f14773B = null;

    /* renamed from: C */
    public static final int[] f14774C = null;

    /* renamed from: D */
    public static final int[] f14775D = null;

    /* renamed from: E */
    public static final int[] f14776E = null;

    /* renamed from: F */
    public static final boolean[] f14777F = null;

    /* renamed from: y */
    public static final int[] f14778y = null;

    /* renamed from: z */
    public static final int[] f14779z = null;

    /* renamed from: g */
    public final p371v5.C6571u f14780g;

    /* renamed from: h */
    public final int f14781h;

    /* renamed from: i */
    public final int f14782i;

    /* renamed from: j */
    public final int f14783j;

    /* renamed from: k */
    public final long f14784k;

    /* renamed from: l */
    public final java.util.ArrayList<p163j5.C3422a.a> f14785l;

    /* renamed from: m */
    public p163j5.C3422a.a f14786m;

    /* renamed from: n */
    public java.util.List<p143i5.C3077a> f14787n;

    /* renamed from: o */
    public java.util.List<p143i5.C3077a> f14788o;

    /* renamed from: p */
    public int f14789p;

    /* renamed from: q */
    public int f14790q;

    /* renamed from: r */
    public boolean f14791r;

    /* renamed from: s */
    public boolean f14792s;

    /* renamed from: t */
    public byte f14793t;

    /* renamed from: u */
    public byte f14794u;

    /* renamed from: v */
    public int f14795v;

    /* renamed from: w */
    public boolean f14796w;

    /* renamed from: x */
    public long f14797x;

    /* renamed from: j5.a$a */
    public static final class a {

        /* renamed from: a */
        public final java.util.List<p163j5.C3422a.a.C7397a> f14798a;

        /* renamed from: b */
        public final java.util.List<android.text.SpannableString> f14799b;

        /* renamed from: c */
        public final java.lang.StringBuilder f14800c;

        /* renamed from: d */
        public int f14801d;

        /* renamed from: e */
        public int f14802e;

        /* renamed from: f */
        public int f14803f;

        /* renamed from: g */
        public int f14804g;

        /* renamed from: h */
        public int f14805h;

        /* renamed from: j5.a$a$a, reason: collision with other inner class name */
        public static class C7397a {

            /* renamed from: a */
            public final int f14806a;

            /* renamed from: b */
            public final boolean f14807b;

            /* renamed from: c */
            public int f14808c;

            public C7397a(int r1, boolean r2, int r3) {
                    r0 = this;
                    r0.<init>()
                    r0.f14806a = r1
                    r0.f14807b = r2
                    r0.f14808c = r3
                    return
            }
        }

        public a(int r2, int r3) {
                r1 = this;
                r1.<init>()
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                r1.f14798a = r0
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                r1.f14799b = r0
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                r1.f14800c = r0
                r1.m7870f(r2)
                r1.f14805h = r3
                return
        }

        /* renamed from: a */
        public void m7865a(char r3) {
                r2 = this;
                java.lang.StringBuilder r0 = r2.f14800c
                int r0 = r0.length()
                r1 = 32
                if (r0 >= r1) goto Lf
                java.lang.StringBuilder r0 = r2.f14800c
                r0.append(r3)
            Lf:
                return
        }

        /* renamed from: b */
        public void m7866b() {
                r4 = this;
                java.lang.StringBuilder r0 = r4.f14800c
                int r0 = r0.length()
                if (r0 <= 0) goto L2c
                java.lang.StringBuilder r1 = r4.f14800c
                int r2 = r0 + (-1)
                r1.delete(r2, r0)
                java.util.List<j5.a$a$a> r1 = r4.f14798a
                int r1 = r1.size()
                int r1 = r1 + (-1)
            L17:
                if (r1 < 0) goto L2c
                java.util.List<j5.a$a$a> r2 = r4.f14798a
                java.lang.Object r2 = r2.get(r1)
                j5.a$a$a r2 = (p163j5.C3422a.a.C7397a) r2
                int r3 = r2.f14808c
                if (r3 != r0) goto L2c
                int r3 = r3 + (-1)
                r2.f14808c = r3
                int r1 = r1 + (-1)
                goto L17
            L2c:
                return
        }

        /* renamed from: c */
        public p143i5.C3077a m7867c(int r23) {
                r22 = this;
                r0 = r22
                int r1 = r0.f14802e
                int r2 = r0.f14803f
                int r1 = r1 + r2
                int r2 = 32 - r1
                android.text.SpannableStringBuilder r4 = new android.text.SpannableStringBuilder
                r4.<init>()
                r3 = 0
                r5 = 0
            L10:
                java.util.List<android.text.SpannableString> r6 = r0.f14799b
                int r6 = r6.size()
                if (r5 >= r6) goto L38
                java.util.List<android.text.SpannableString> r6 = r0.f14799b
                java.lang.Object r6 = r6.get(r5)
                java.lang.CharSequence r6 = (java.lang.CharSequence) r6
                int r7 = p371v5.C6552b0.f25624a
                int r7 = r6.length()
                if (r7 > r2) goto L29
                goto L2d
            L29:
                java.lang.CharSequence r6 = r6.subSequence(r3, r2)
            L2d:
                r4.append(r6)
                r6 = 10
                r4.append(r6)
                int r5 = r5 + 1
                goto L10
            L38:
                android.text.SpannableString r5 = r22.m7868d()
                int r6 = p371v5.C6552b0.f25624a
                int r6 = r5.length()
                if (r6 > r2) goto L45
                goto L49
            L45:
                java.lang.CharSequence r5 = r5.subSequence(r3, r2)
            L49:
                r4.append(r5)
                int r5 = r4.length()
                if (r5 != 0) goto L54
                r1 = 0
                return r1
            L54:
                int r5 = r4.length()
                int r2 = r2 - r5
                int r5 = r1 - r2
                r6 = -2147483648(0xffffffff80000000, float:-0.0)
                r7 = 2
                r8 = 1
                r9 = r23
                if (r9 == r6) goto L65
                r12 = r9
                goto L7d
            L65:
                int r6 = r0.f14804g
                if (r6 != r7) goto L74
                int r6 = java.lang.Math.abs(r5)
                r9 = 3
                if (r6 < r9) goto L72
                if (r2 >= 0) goto L74
            L72:
                r12 = 1
                goto L7d
            L74:
                int r6 = r0.f14804g
                if (r6 != r7) goto L7c
                if (r5 <= 0) goto L7c
                r12 = 2
                goto L7d
            L7c:
                r12 = 0
            L7d:
                if (r12 == r8) goto L93
                r3 = 1036831949(0x3dcccccd, float:0.1)
                r5 = 1061997773(0x3f4ccccd, float:0.8)
                r6 = 1107296256(0x42000000, float:32.0)
                if (r12 == r7) goto L8a
                goto L8c
            L8a:
                int r1 = 32 - r2
            L8c:
                float r1 = (float) r1
                float r1 = r1 / r6
                float r1 = r1 * r5
                float r1 = r1 + r3
                r11 = r1
                goto L97
            L93:
                r1 = 1056964608(0x3f000000, float:0.5)
                r11 = 1056964608(0x3f000000, float:0.5)
            L97:
                int r1 = r0.f14801d
                r2 = 7
                if (r1 <= r2) goto La1
                int r1 = r1 + (-15)
                int r1 = r1 + (-2)
                goto La9
            La1:
                int r2 = r0.f14804g
                if (r2 != r8) goto La9
                int r2 = r0.f14805h
                int r2 = r2 - r8
                int r1 = r1 - r2
            La9:
                r20 = 0
                r6 = 0
                r7 = r6
                r16 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
                r14 = r16
                r15 = r16
                r10 = -2147483648(0xffffffff80000000, float:-0.0)
                r13 = r10
                r19 = r10
                r17 = 0
                r18 = -16777216(0xffffffffff000000, float:-1.7014118E38)
                android.text.Layout$Alignment r5 = android.text.Layout.Alignment.ALIGN_NORMAL
                float r8 = (float) r1
                r9 = 1
                i5.a r1 = new i5.a
                r3 = r1
                r21 = 0
                r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
                return r1
        }

        /* renamed from: d */
        public final android.text.SpannableString m7868d() {
                r16 = this;
                r0 = r16
                android.text.SpannableStringBuilder r1 = new android.text.SpannableStringBuilder
                java.lang.StringBuilder r2 = r0.f14800c
                r1.<init>(r2)
                int r2 = r1.length()
                r4 = -1
                r5 = 0
                r6 = -1
                r7 = -1
                r8 = 0
                r9 = -1
                r10 = 0
                r11 = -1
            L15:
                java.util.List<j5.a$a$a> r12 = r0.f14798a
                int r12 = r12.size()
                r13 = 33
                if (r5 >= r12) goto L8f
                java.util.List<j5.a$a$a> r12 = r0.f14798a
                java.lang.Object r12 = r12.get(r5)
                j5.a$a$a r12 = (p163j5.C3422a.a.C7397a) r12
                boolean r15 = r12.f14807b
                int r3 = r12.f14806a
                r14 = 8
                if (r3 == r14) goto L3d
                r10 = 7
                if (r3 != r10) goto L34
                r14 = 1
                goto L35
            L34:
                r14 = 0
            L35:
                if (r3 != r10) goto L38
                goto L3c
            L38:
                int[] r10 = p163j5.C3422a.f14772A
                r11 = r10[r3]
            L3c:
                r10 = r14
            L3d:
                int r3 = r12.f14808c
                int r5 = r5 + 1
                java.util.List<j5.a$a$a> r12 = r0.f14798a
                int r12 = r12.size()
                if (r5 >= r12) goto L54
                java.util.List<j5.a$a$a> r12 = r0.f14798a
                java.lang.Object r12 = r12.get(r5)
                j5.a$a$a r12 = (p163j5.C3422a.a.C7397a) r12
                int r12 = r12.f14808c
                goto L55
            L54:
                r12 = r2
            L55:
                if (r3 != r12) goto L58
                goto L15
            L58:
                if (r6 == r4) goto L66
                if (r15 != 0) goto L66
                android.text.style.UnderlineSpan r12 = new android.text.style.UnderlineSpan
                r12.<init>()
                r1.setSpan(r12, r6, r3, r13)
                r6 = -1
                goto L6b
            L66:
                if (r6 != r4) goto L6b
                if (r15 == 0) goto L6b
                r6 = r3
            L6b:
                if (r7 == r4) goto L7a
                if (r10 != 0) goto L7a
                android.text.style.StyleSpan r12 = new android.text.style.StyleSpan
                r14 = 2
                r12.<init>(r14)
                r1.setSpan(r12, r7, r3, r13)
                r7 = -1
                goto L7f
            L7a:
                if (r7 != r4) goto L7f
                if (r10 == 0) goto L7f
                r7 = r3
            L7f:
                if (r11 == r9) goto L15
                if (r9 != r4) goto L84
                goto L8c
            L84:
                android.text.style.ForegroundColorSpan r12 = new android.text.style.ForegroundColorSpan
                r12.<init>(r9)
                r1.setSpan(r12, r8, r3, r13)
            L8c:
                r8 = r3
                r9 = r11
                goto L15
            L8f:
                if (r6 == r4) goto L9b
                if (r6 == r2) goto L9b
                android.text.style.UnderlineSpan r3 = new android.text.style.UnderlineSpan
                r3.<init>()
                r1.setSpan(r3, r6, r2, r13)
            L9b:
                if (r7 == r4) goto La8
                if (r7 == r2) goto La8
                android.text.style.StyleSpan r3 = new android.text.style.StyleSpan
                r5 = 2
                r3.<init>(r5)
                r1.setSpan(r3, r7, r2, r13)
            La8:
                if (r8 == r2) goto Lb5
                if (r9 != r4) goto Lad
                goto Lb5
            Lad:
                android.text.style.ForegroundColorSpan r3 = new android.text.style.ForegroundColorSpan
                r3.<init>(r9)
                r1.setSpan(r3, r8, r2, r13)
            Lb5:
                android.text.SpannableString r2 = new android.text.SpannableString
                r2.<init>(r1)
                return r2
        }

        /* renamed from: e */
        public boolean m7869e() {
                r1 = this;
                java.util.List<j5.a$a$a> r0 = r1.f14798a
                boolean r0 = r0.isEmpty()
                if (r0 == 0) goto L1a
                java.util.List<android.text.SpannableString> r0 = r1.f14799b
                boolean r0 = r0.isEmpty()
                if (r0 == 0) goto L1a
                java.lang.StringBuilder r0 = r1.f14800c
                int r0 = r0.length()
                if (r0 != 0) goto L1a
                r0 = 1
                goto L1b
            L1a:
                r0 = 0
            L1b:
                return r0
        }

        /* renamed from: f */
        public void m7870f(int r2) {
                r1 = this;
                r1.f14804g = r2
                java.util.List<j5.a$a$a> r2 = r1.f14798a
                r2.clear()
                java.util.List<android.text.SpannableString> r2 = r1.f14799b
                r2.clear()
                java.lang.StringBuilder r2 = r1.f14800c
                r0 = 0
                r2.setLength(r0)
                r2 = 15
                r1.f14801d = r2
                r1.f14802e = r0
                r1.f14803f = r0
                return
        }
    }

    static {
            r0 = 8
            int[] r1 = new int[r0]
            r1 = {x0044: FILL_ARRAY_DATA , data: [11, 1, 3, 12, 14, 5, 7, 9} // fill-array
            p163j5.C3422a.f14778y = r1
            int[] r0 = new int[r0]
            r0 = {x0058: FILL_ARRAY_DATA , data: [0, 4, 8, 12, 16, 20, 24, 28} // fill-array
            p163j5.C3422a.f14779z = r0
            r0 = 7
            int[] r0 = new int[r0]
            r0 = {x006c: FILL_ARRAY_DATA , data: [-1, -16711936, -16776961, -16711681, -65536, -256, -65281} // fill-array
            p163j5.C3422a.f14772A = r0
            r0 = 96
            int[] r0 = new int[r0]
            r0 = {x007e: FILL_ARRAY_DATA , data: [32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 225, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 233, 93, 237, 243, 250, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 231, 247, 209, 241, 9632} // fill-array
            p163j5.C3422a.f14773B = r0
            r0 = 16
            int[] r0 = new int[r0]
            r0 = {x0142: FILL_ARRAY_DATA , data: [174, 176, 189, 191, 8482, 162, 163, 9834, 224, 32, 232, 226, 234, 238, 244, 251} // fill-array
            p163j5.C3422a.f14774C = r0
            r0 = 32
            int[] r1 = new int[r0]
            r1 = {x0166: FILL_ARRAY_DATA , data: [193, 201, 211, 218, 220, 252, 8216, 161, 42, 39, 8212, 169, 8480, 8226, 8220, 8221, 192, 194, 199, 200, 202, 203, 235, 206, 207, 239, 212, 217, 249, 219, 171, 187} // fill-array
            p163j5.C3422a.f14775D = r1
            int[] r0 = new int[r0]
            r0 = {x01aa: FILL_ARRAY_DATA , data: [195, 227, 205, 204, 236, 210, 242, 213, 245, 123, 125, 92, 94, 95, 124, 126, 196, 228, 214, 246, 223, 165, 164, 9474, 197, 229, 216, 248, 9484, 9488, 9492, 9496} // fill-array
            p163j5.C3422a.f14776E = r0
            r0 = 256(0x100, float:3.59E-43)
            boolean[] r0 = new boolean[r0]
            r0 = {x01ee: FILL_ARRAY_DATA , data: [0, 1, 1, 0, 1, 0, 0, 1, 1, 0, 0, 1, 0, 1, 1, 0, 1, 0, 0, 1, 0, 1, 1, 0, 0, 1, 1, 0, 1, 0, 0, 1, 1, 0, 0, 1, 0, 1, 1, 0, 0, 1, 1, 0, 1, 0, 0, 1, 0, 1, 1, 0, 1, 0, 0, 1, 1, 0, 0, 1, 0, 1, 1, 0, 1, 0, 0, 1, 0, 1, 1, 0, 0, 1, 1, 0, 1, 0, 0, 1, 0, 1, 1, 0, 1, 0, 0, 1, 1, 0, 0, 1, 0, 1, 1, 0, 0, 1, 1, 0, 1, 0, 0, 1, 1, 0, 0, 1, 0, 1, 1, 0, 1, 0, 0, 1, 0, 1, 1, 0, 0, 1, 1, 0, 1, 0, 0, 1, 1, 0, 0, 1, 0, 1, 1, 0, 0, 1, 1, 0, 1, 0, 0, 1, 0, 1, 1, 0, 1, 0, 0, 1, 1, 0, 0, 1, 0, 1, 1, 0, 0, 1, 1, 0, 1, 0, 0, 1, 1, 0, 0, 1, 0, 1, 1, 0, 1, 0, 0, 1, 0, 1, 1, 0, 0, 1, 1, 0, 1, 0, 0, 1, 0, 1, 1, 0, 1, 0, 0, 1, 1, 0, 0, 1, 0, 1, 1, 0, 1, 0, 0, 1, 0, 1, 1, 0, 0, 1, 1, 0, 1, 0, 0, 1, 1, 0, 0, 1, 0, 1, 1, 0, 0, 1, 1, 0, 1, 0, 0, 1, 0, 1, 1, 0, 1, 0, 0, 1, 1, 0, 0, 1, 0, 1, 1, 0} // fill-array
            p163j5.C3422a.f14777F = r0
            return
    }

    public C3422a(java.lang.String r8, int r9, long r10) {
            r7 = this;
            r7.<init>()
            v5.u r0 = new v5.u
            r0.<init>()
            r7.f14780g = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r7.f14785l = r0
            j5.a$a r0 = new j5.a$a
            r1 = 0
            r2 = 4
            r0.<init>(r1, r2)
            r7.f14786m = r0
            r7.f14795v = r1
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r5 = 0
            int r0 = (r10 > r5 ? 1 : (r10 == r5 ? 0 : -1))
            if (r0 <= 0) goto L2c
            r5 = 1000(0x3e8, double:4.94E-321)
            long r10 = r10 * r5
            goto L2d
        L2c:
            r10 = r3
        L2d:
            r7.f14784k = r10
            java.lang.String r10 = "application/x-mp4-cea-608"
            boolean r8 = r10.equals(r8)
            r10 = 3
            r11 = 2
            if (r8 == 0) goto L3b
            r8 = 2
            goto L3c
        L3b:
            r8 = 3
        L3c:
            r7.f14781h = r8
            r8 = 1
            if (r9 == r8) goto L5a
            if (r9 == r11) goto L57
            if (r9 == r10) goto L52
            if (r9 == r2) goto L4f
            java.lang.String r9 = "Cea608Decoder"
            java.lang.String r10 = "Invalid channel. Defaulting to CC1."
            android.util.Log.w(r9, r10)
            goto L5a
        L4f:
            r7.f14783j = r8
            goto L54
        L52:
            r7.f14783j = r1
        L54:
            r7.f14782i = r8
            goto L5e
        L57:
            r7.f14783j = r8
            goto L5c
        L5a:
            r7.f14783j = r1
        L5c:
            r7.f14782i = r1
        L5e:
            r7.m7863l(r1)
            r7.m7862k()
            r7.f14796w = r8
            r7.f14797x = r3
            return
    }

    @Override // p163j5.AbstractC3425d, p142i4.InterfaceC3070d
    /* renamed from: c */
    public /* bridge */ /* synthetic */ p143i5.AbstractC3087k mo7520c() {
            r1 = this;
            i5.k r0 = r1.mo7859g()
            return r0
    }

    @Override // p163j5.AbstractC3425d
    /* renamed from: e */
    public p143i5.InterfaceC3082f mo7857e() {
            r3 = this;
            java.util.List<i5.a> r0 = r3.f14787n
            r3.f14788o = r0
            j5.e r1 = new j5.e
            java.util.Objects.requireNonNull(r0)
            r2 = 0
            r1.<init>(r0, r2)
            return r1
    }

    @Override // p163j5.AbstractC3425d
    /* renamed from: f */
    public void mo7858f(p143i5.C3086j r14) {
            r13 = this;
            java.nio.ByteBuffer r14 = r14.f12358a0
            java.util.Objects.requireNonNull(r14)
            v5.u r0 = r13.f14780g
            byte[] r1 = r14.array()
            int r14 = r14.limit()
            r0.m13394D(r1, r14)
            r14 = 0
            r0 = 1
            r1 = 0
        L15:
            v5.u r2 = r13.f14780g
            int r2 = r2.m13398a()
            int r3 = r13.f14781h
            r4 = 3
            if (r2 < r3) goto L2a6
            r2 = 2
            if (r3 != r2) goto L25
            r3 = -4
            goto L2c
        L25:
            v5.u r3 = r13.f14780g
            int r3 = r3.m13418u()
            byte r3 = (byte) r3
        L2c:
            v5.u r5 = r13.f14780g
            int r5 = r5.m13418u()
            v5.u r6 = r13.f14780g
            int r6 = r6.m13418u()
            r7 = r3 & 2
            if (r7 == 0) goto L3d
            goto L15
        L3d:
            r7 = r3 & 1
            int r8 = r13.f14782i
            if (r7 == r8) goto L44
            goto L15
        L44:
            r7 = r5 & 127(0x7f, float:1.78E-43)
            byte r7 = (byte) r7
            r8 = r6 & 127(0x7f, float:1.78E-43)
            byte r8 = (byte) r8
            if (r7 != 0) goto L4f
            if (r8 != 0) goto L4f
            goto L15
        L4f:
            boolean r9 = r13.f14791r
            r3 = r3 & 4
            r10 = 4
            if (r3 != r10) goto L62
            boolean[] r3 = p163j5.C3422a.f14777F
            boolean r5 = r3[r5]
            if (r5 == 0) goto L62
            boolean r3 = r3[r6]
            if (r3 == 0) goto L62
            r3 = 1
            goto L63
        L62:
            r3 = 0
        L63:
            r13.f14791r = r3
            r5 = 16
            if (r3 == 0) goto L89
            r6 = r7 & 240(0xf0, float:3.36E-43)
            if (r6 != r5) goto L6f
            r6 = 1
            goto L70
        L6f:
            r6 = 0
        L70:
            if (r6 == 0) goto L89
            boolean r6 = r13.f14792s
            if (r6 == 0) goto L82
            byte r6 = r13.f14793t
            if (r6 != r7) goto L82
            byte r6 = r13.f14794u
            if (r6 != r8) goto L82
            r13.f14792s = r14
            r6 = 1
            goto L8c
        L82:
            r13.f14792s = r0
            r13.f14793t = r7
            r13.f14794u = r8
            goto L8b
        L89:
            r13.f14792s = r14
        L8b:
            r6 = 0
        L8c:
            if (r6 == 0) goto L8f
            goto L15
        L8f:
            if (r3 != 0) goto L98
            if (r9 == 0) goto L15
            r13.m7862k()
            goto L2a3
        L98:
            if (r0 > r7) goto La0
            r3 = 15
            if (r7 > r3) goto La0
            r3 = 1
            goto La1
        La0:
            r3 = 0
        La1:
            r6 = 20
            r9 = 32
            if (r3 == 0) goto La8
            goto Lbe
        La8:
            r3 = r7 & 247(0xf7, float:3.46E-43)
            if (r3 != r6) goto Lae
            r3 = 1
            goto Laf
        Lae:
            r3 = 0
        Laf:
            if (r3 == 0) goto Lc3
            if (r8 == r9) goto Lc1
            r3 = 47
            if (r8 == r3) goto Lc1
            switch(r8) {
                case 37: goto Lc1;
                case 38: goto Lc1;
                case 39: goto Lc1;
                default: goto Lba;
            }
        Lba:
            switch(r8) {
                case 41: goto Lc1;
                case 42: goto Lbe;
                case 43: goto Lbe;
                default: goto Lbd;
            }
        Lbd:
            goto Lc3
        Lbe:
            r13.f14796w = r14
            goto Lc3
        Lc1:
            r13.f14796w = r0
        Lc3:
            boolean r3 = r13.f14796w
            if (r3 != 0) goto Lc9
            goto L15
        Lc9:
            r3 = r7 & 224(0xe0, float:3.14E-43)
            if (r3 != 0) goto Lcf
            r11 = 1
            goto Ld0
        Lcf:
            r11 = 0
        Ld0:
            if (r11 == 0) goto Ld7
            int r11 = r7 >> 3
            r11 = r11 & r0
            r13.f14795v = r11
        Ld7:
            int r11 = r13.f14795v
            int r12 = r13.f14783j
            if (r11 != r12) goto Ldf
            r11 = 1
            goto Le0
        Ldf:
            r11 = 0
        Le0:
            if (r11 != 0) goto Le4
            goto L15
        Le4:
            if (r3 != 0) goto Le8
            r1 = 1
            goto Le9
        Le8:
            r1 = 0
        Le9:
            if (r1 == 0) goto L285
            r1 = r7 & 247(0xf7, float:3.46E-43)
            r3 = 17
            if (r1 != r3) goto Lf9
            r11 = r8 & 240(0xf0, float:3.36E-43)
            r12 = 48
            if (r11 != r12) goto Lf9
            r11 = 1
            goto Lfa
        Lf9:
            r11 = 0
        Lfa:
            if (r11 == 0) goto L106
            j5.a$a r1 = r13.f14786m
            r2 = r8 & 15
            int[] r3 = p163j5.C3422a.f14774C
            r2 = r3[r2]
            goto L29f
        L106:
            r11 = r7 & 246(0xf6, float:3.45E-43)
            r12 = 18
            if (r11 != r12) goto L112
            r12 = r8 & 224(0xe0, float:3.14E-43)
            if (r12 != r9) goto L112
            r12 = 1
            goto L113
        L112:
            r12 = 0
        L113:
            if (r12 == 0) goto L130
            j5.a$a r1 = r13.f14786m
            r1.m7866b()
            j5.a$a r1 = r13.f14786m
            r2 = r7 & 1
            if (r2 != 0) goto L128
            r2 = r8 & 31
            int[] r3 = p163j5.C3422a.f14775D
            r2 = r3[r2]
            goto L29f
        L128:
            r2 = r8 & 31
            int[] r3 = p163j5.C3422a.f14776E
            r2 = r3[r2]
            goto L29f
        L130:
            if (r1 != r3) goto L138
            r3 = r8 & 240(0xf0, float:3.36E-43)
            if (r3 != r9) goto L138
            r3 = 1
            goto L139
        L138:
            r3 = 0
        L139:
            if (r3 == 0) goto L15f
            j5.a$a r1 = r13.f14786m
            r1.m7865a(r9)
            r1 = r8 & 1
            if (r1 != r0) goto L146
            r1 = 1
            goto L147
        L146:
            r1 = 0
        L147:
            int r2 = r8 >> 1
            r2 = r2 & 7
            j5.a$a r3 = r13.f14786m
            java.util.List<j5.a$a$a> r4 = r3.f14798a
            j5.a$a$a r5 = new j5.a$a$a
            java.lang.StringBuilder r3 = r3.f14800c
            int r3 = r3.length()
            r5.<init>(r2, r1, r3)
            r4.add(r5)
            goto L2a3
        L15f:
            r3 = r7 & 240(0xf0, float:3.36E-43)
            if (r3 != r5) goto L16b
            r3 = r8 & 192(0xc0, float:2.69E-43)
            r12 = 64
            if (r3 != r12) goto L16b
            r3 = 1
            goto L16c
        L16b:
            r3 = 0
        L16c:
            if (r3 == 0) goto L1d9
            int[] r1 = p163j5.C3422a.f14778y
            r2 = r7 & 7
            r1 = r1[r2]
            r2 = r8 & 32
            if (r2 == 0) goto L17a
            r2 = 1
            goto L17b
        L17a:
            r2 = 0
        L17b:
            if (r2 == 0) goto L17f
            int r1 = r1 + 1
        L17f:
            j5.a$a r2 = r13.f14786m
            int r3 = r2.f14801d
            if (r1 == r3) goto L1a3
            int r3 = r13.f14789p
            if (r3 == r0) goto L19f
            boolean r2 = r2.m7869e()
            if (r2 != 0) goto L19f
            j5.a$a r2 = new j5.a$a
            int r3 = r13.f14789p
            int r4 = r13.f14790q
            r2.<init>(r3, r4)
            r13.f14786m = r2
            java.util.ArrayList<j5.a$a> r3 = r13.f14785l
            r3.add(r2)
        L19f:
            j5.a$a r2 = r13.f14786m
            r2.f14801d = r1
        L1a3:
            r1 = r8 & 16
            if (r1 != r5) goto L1a9
            r1 = 1
            goto L1aa
        L1a9:
            r1 = 0
        L1aa:
            r2 = r8 & 1
            if (r2 != r0) goto L1b0
            r2 = 1
            goto L1b1
        L1b0:
            r2 = 0
        L1b1:
            int r3 = r8 >> 1
            r3 = r3 & 7
            j5.a$a r4 = r13.f14786m
            if (r1 == 0) goto L1bc
            r5 = 8
            goto L1bd
        L1bc:
            r5 = r3
        L1bd:
            java.util.List<j5.a$a$a> r6 = r4.f14798a
            j5.a$a$a r7 = new j5.a$a$a
            java.lang.StringBuilder r4 = r4.f14800c
            int r4 = r4.length()
            r7.<init>(r5, r2, r4)
            r6.add(r7)
            if (r1 == 0) goto L2a3
            j5.a$a r1 = r13.f14786m
            int[] r2 = p163j5.C3422a.f14779z
            r2 = r2[r3]
            r1.f14802e = r2
            goto L2a3
        L1d9:
            r3 = 23
            r5 = 33
            if (r1 != r3) goto L1e7
            if (r8 < r5) goto L1e7
            r1 = 35
            if (r8 > r1) goto L1e7
            r1 = 1
            goto L1e8
        L1e7:
            r1 = 0
        L1e8:
            if (r1 == 0) goto L1f2
            j5.a$a r1 = r13.f14786m
            int r8 = r8 + (-32)
            r1.f14803f = r8
            goto L2a3
        L1f2:
            if (r11 != r6) goto L1fa
            r1 = r8 & 240(0xf0, float:3.36E-43)
            if (r1 != r9) goto L1fa
            r1 = 1
            goto L1fb
        L1fa:
            r1 = 0
        L1fb:
            if (r1 == 0) goto L2a3
            if (r8 == r9) goto L281
            r1 = 41
            if (r8 == r1) goto L27d
            switch(r8) {
                case 37: goto L21c;
                case 38: goto L214;
                case 39: goto L20c;
                default: goto L206;
            }
        L206:
            int r1 = r13.f14789p
            if (r1 != 0) goto L224
            goto L2a3
        L20c:
            r13.m7863l(r0)
            r13.m7864m(r10)
            goto L2a3
        L214:
            r13.m7863l(r0)
            r13.m7864m(r4)
            goto L2a3
        L21c:
            r13.m7863l(r0)
            r13.m7864m(r2)
            goto L2a3
        L224:
            if (r8 == r5) goto L277
            switch(r8) {
                case 44: goto L267;
                case 45: goto L232;
                case 46: goto L273;
                case 47: goto L22b;
                default: goto L229;
            }
        L229:
            goto L2a3
        L22b:
            java.util.List r1 = r13.m7861j()
            r13.f14787n = r1
            goto L273
        L232:
            if (r1 != r0) goto L2a3
            j5.a$a r1 = r13.f14786m
            boolean r1 = r1.m7869e()
            if (r1 != 0) goto L2a3
            j5.a$a r1 = r13.f14786m
            java.util.List<android.text.SpannableString> r2 = r1.f14799b
            android.text.SpannableString r3 = r1.m7868d()
            r2.add(r3)
            java.lang.StringBuilder r2 = r1.f14800c
            r2.setLength(r14)
            java.util.List<j5.a$a$a> r2 = r1.f14798a
            r2.clear()
            int r2 = r1.f14805h
            int r3 = r1.f14801d
            int r2 = java.lang.Math.min(r2, r3)
        L259:
            java.util.List<android.text.SpannableString> r3 = r1.f14799b
            int r3 = r3.size()
            if (r3 < r2) goto L2a3
            java.util.List<android.text.SpannableString> r3 = r1.f14799b
            r3.remove(r14)
            goto L259
        L267:
            java.util.List r1 = java.util.Collections.emptyList()
            r13.f14787n = r1
            int r1 = r13.f14789p
            if (r1 == r0) goto L273
            if (r1 != r4) goto L2a3
        L273:
            r13.m7862k()
            goto L2a3
        L277:
            j5.a$a r1 = r13.f14786m
            r1.m7866b()
            goto L2a3
        L27d:
            r13.m7863l(r4)
            goto L2a3
        L281:
            r13.m7863l(r2)
            goto L2a3
        L285:
            j5.a$a r1 = r13.f14786m
            r2 = r7 & 127(0x7f, float:1.78E-43)
            int r2 = r2 + (-32)
            int[] r3 = p163j5.C3422a.f14773B
            r2 = r3[r2]
            char r2 = (char) r2
            r1.m7865a(r2)
            r1 = r8 & 224(0xe0, float:3.14E-43)
            if (r1 == 0) goto L2a3
            j5.a$a r1 = r13.f14786m
            r2 = r8 & 127(0x7f, float:1.78E-43)
            int r2 = r2 + (-32)
            r2 = r3[r2]
        L29f:
            char r2 = (char) r2
            r1.m7865a(r2)
        L2a3:
            r1 = 1
            goto L15
        L2a6:
            if (r1 == 0) goto L2b8
            int r14 = r13.f14789p
            if (r14 == r0) goto L2ae
            if (r14 != r4) goto L2b8
        L2ae:
            java.util.List r14 = r13.m7861j()
            r13.f14787n = r14
            long r0 = r13.f14866e
            r13.f14797x = r0
        L2b8:
            return
    }

    @Override // p163j5.AbstractC3425d, p142i4.InterfaceC3070d
    public void flush() {
            r2 = this;
            super.flush()
            r0 = 0
            r2.f14787n = r0
            r2.f14788o = r0
            r0 = 0
            r2.m7863l(r0)
            r1 = 4
            r2.m7864m(r1)
            r2.m7862k()
            r2.f14791r = r0
            r2.f14792s = r0
            r2.f14793t = r0
            r2.f14794u = r0
            r2.f14795v = r0
            r0 = 1
            r2.f14796w = r0
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r2.f14797x = r0
            return
    }

    @Override // p163j5.AbstractC3425d
    /* renamed from: g */
    public p143i5.AbstractC3087k mo7859g() {
            r11 = this;
            i5.k r0 = super.mo7859g()
            if (r0 == 0) goto L7
            return r0
        L7:
            long r0 = r11.f14784k
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r4 = 0
            int r5 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r5 == 0) goto L23
            long r5 = r11.f14797x
            int r7 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r7 != 0) goto L1a
            goto L23
        L1a:
            long r7 = r11.f14866e
            long r7 = r7 - r5
            int r5 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r5 < 0) goto L23
            r0 = 1
            goto L24
        L23:
            r0 = 0
        L24:
            if (r0 == 0) goto L4e
            java.util.ArrayDeque<i5.k> r0 = r11.f14863b
            java.lang.Object r0 = r0.pollFirst()
            i5.k r0 = (p143i5.AbstractC3087k) r0
            if (r0 == 0) goto L4e
            java.util.List r1 = java.util.Collections.emptyList()
            r11.f14787n = r1
            r11.f14797x = r2
            r11.f14788o = r1
            j5.e r8 = new j5.e
            java.util.Objects.requireNonNull(r1)
            r8.<init>(r1, r4)
            long r6 = r11.f14866e
            r9 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r5 = r0
            r5.m7543v(r6, r8, r9)
            return r0
        L4e:
            r0 = 0
            return r0
    }

    @Override // p163j5.AbstractC3425d
    /* renamed from: h */
    public boolean mo7860h() {
            r2 = this;
            java.util.List<i5.a> r0 = r2.f14787n
            java.util.List<i5.a> r1 = r2.f14788o
            if (r0 == r1) goto L8
            r0 = 1
            goto L9
        L8:
            r0 = 0
        L9:
            return r0
    }

    /* renamed from: j */
    public final java.util.List<p143i5.C3077a> m7861j() {
            r7 = this;
            java.util.ArrayList<j5.a$a> r0 = r7.f14785l
            int r0 = r0.size()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>(r0)
            r2 = 0
            r3 = 2
            r4 = 0
        Le:
            if (r4 >= r0) goto L2c
            java.util.ArrayList<j5.a$a> r5 = r7.f14785l
            java.lang.Object r5 = r5.get(r4)
            j5.a$a r5 = (p163j5.C3422a.a) r5
            r6 = -2147483648(0xffffffff80000000, float:-0.0)
            i5.a r5 = r5.m7867c(r6)
            r1.add(r5)
            if (r5 == 0) goto L29
            int r5 = r5.f12394g0
            int r3 = java.lang.Math.min(r3, r5)
        L29:
            int r4 = r4 + 1
            goto Le
        L2c:
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>(r0)
        L31:
            if (r2 >= r0) goto L54
            java.lang.Object r5 = r1.get(r2)
            i5.a r5 = (p143i5.C3077a) r5
            if (r5 == 0) goto L51
            int r6 = r5.f12394g0
            if (r6 == r3) goto L4e
            java.util.ArrayList<j5.a$a> r5 = r7.f14785l
            java.lang.Object r5 = r5.get(r2)
            j5.a$a r5 = (p163j5.C3422a.a) r5
            i5.a r5 = r5.m7867c(r3)
            java.util.Objects.requireNonNull(r5)
        L4e:
            r4.add(r5)
        L51:
            int r2 = r2 + 1
            goto L31
        L54:
            return r4
    }

    /* renamed from: k */
    public final void m7862k() {
            r2 = this;
            j5.a$a r0 = r2.f14786m
            int r1 = r2.f14789p
            r0.m7870f(r1)
            java.util.ArrayList<j5.a$a> r0 = r2.f14785l
            r0.clear()
            java.util.ArrayList<j5.a$a> r0 = r2.f14785l
            j5.a$a r1 = r2.f14786m
            r0.add(r1)
            return
    }

    /* renamed from: l */
    public final void m7863l(int r3) {
            r2 = this;
            int r0 = r2.f14789p
            if (r0 != r3) goto L5
            return
        L5:
            r2.f14789p = r3
            r1 = 3
            if (r3 != r1) goto L21
            r0 = 0
        Lb:
            java.util.ArrayList<j5.a$a> r1 = r2.f14785l
            int r1 = r1.size()
            if (r0 >= r1) goto L20
            java.util.ArrayList<j5.a$a> r1 = r2.f14785l
            java.lang.Object r1 = r1.get(r0)
            j5.a$a r1 = (p163j5.C3422a.a) r1
            r1.f14804g = r3
            int r0 = r0 + 1
            goto Lb
        L20:
            return
        L21:
            r2.m7862k()
            if (r0 == r1) goto L2b
            r0 = 1
            if (r3 == r0) goto L2b
            if (r3 != 0) goto L31
        L2b:
            java.util.List r3 = java.util.Collections.emptyList()
            r2.f14787n = r3
        L31:
            return
    }

    /* renamed from: m */
    public final void m7864m(int r2) {
            r1 = this;
            r1.f14790q = r2
            j5.a$a r0 = r1.f14786m
            r0.f14805h = r2
            return
    }

    @Override // p163j5.AbstractC3425d, p142i4.InterfaceC3070d
    public void release() {
            r0 = this;
            return
    }
}
