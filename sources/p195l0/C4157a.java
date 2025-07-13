package p195l0;

/* renamed from: l0.a */
/* loaded from: classes.dex */
public final class C4157a {

    /* renamed from: d */
    public static final p195l0.InterfaceC4159c f17216d = null;

    /* renamed from: e */
    public static final java.lang.String f17217e = null;

    /* renamed from: f */
    public static final java.lang.String f17218f = null;

    /* renamed from: g */
    public static final p195l0.C4157a f17219g = null;

    /* renamed from: h */
    public static final p195l0.C4157a f17220h = null;

    /* renamed from: a */
    public final boolean f17221a;

    /* renamed from: b */
    public final int f17222b;

    /* renamed from: c */
    public final p195l0.InterfaceC4159c f17223c;

    /* renamed from: l0.a$a */
    public static class a {

        /* renamed from: e */
        public static final byte[] f17224e = null;

        /* renamed from: a */
        public final java.lang.CharSequence f17225a;

        /* renamed from: b */
        public final int f17226b;

        /* renamed from: c */
        public int f17227c;

        /* renamed from: d */
        public char f17228d;

        static {
                r0 = 1792(0x700, float:2.511E-42)
                byte[] r1 = new byte[r0]
                p195l0.C4157a.a.f17224e = r1
                r1 = 0
            L7:
                if (r1 >= r0) goto L14
                byte[] r2 = p195l0.C4157a.a.f17224e
                byte r3 = java.lang.Character.getDirectionality(r1)
                r2[r1] = r3
                int r1 = r1 + 1
                goto L7
            L14:
                return
        }

        public a(java.lang.CharSequence r1, boolean r2) {
                r0 = this;
                r0.<init>()
                r0.f17225a = r1
                int r1 = r1.length()
                r0.f17226b = r1
                return
        }

        /* renamed from: a */
        public byte m9217a() {
                r3 = this;
                java.lang.CharSequence r0 = r3.f17225a
                int r1 = r3.f17227c
                int r1 = r1 + (-1)
                char r0 = r0.charAt(r1)
                r3.f17228d = r0
                boolean r0 = java.lang.Character.isLowSurrogate(r0)
                if (r0 == 0) goto L28
                java.lang.CharSequence r0 = r3.f17225a
                int r1 = r3.f17227c
                int r0 = java.lang.Character.codePointBefore(r0, r1)
                int r1 = r3.f17227c
                int r2 = java.lang.Character.charCount(r0)
                int r1 = r1 - r2
                r3.f17227c = r1
                byte r0 = java.lang.Character.getDirectionality(r0)
                return r0
            L28:
                int r0 = r3.f17227c
                int r0 = r0 + (-1)
                r3.f17227c = r0
                char r0 = r3.f17228d
                r1 = 1792(0x700, float:2.511E-42)
                if (r0 >= r1) goto L39
                byte[] r1 = p195l0.C4157a.a.f17224e
                r0 = r1[r0]
                goto L3d
            L39:
                byte r0 = java.lang.Character.getDirectionality(r0)
            L3d:
                return r0
        }
    }

    static {
            l0.c r0 = p195l0.C4160d.f17235c
            p195l0.C4157a.f17216d = r0
            r1 = 8206(0x200e, float:1.1499E-41)
            java.lang.String r1 = java.lang.Character.toString(r1)
            p195l0.C4157a.f17217e = r1
            r1 = 8207(0x200f, float:1.15E-41)
            java.lang.String r1 = java.lang.Character.toString(r1)
            p195l0.C4157a.f17218f = r1
            l0.a r1 = new l0.a
            r2 = 0
            r3 = 2
            r1.<init>(r2, r3, r0)
            p195l0.C4157a.f17219g = r1
            l0.a r1 = new l0.a
            r2 = 1
            r1.<init>(r2, r3, r0)
            p195l0.C4157a.f17220h = r1
            return
    }

    public C4157a(boolean r1, int r2, p195l0.InterfaceC4159c r3) {
            r0 = this;
            r0.<init>()
            r0.f17221a = r1
            r0.f17222b = r2
            r0.f17223c = r3
            return
    }

    /* renamed from: a */
    public static int m9213a(java.lang.CharSequence r9) {
            l0.a$a r0 = new l0.a$a
            r1 = 0
            r0.<init>(r9, r1)
            r0.f17227c = r1
            r9 = -1
            r2 = 1
            r3 = 0
            r4 = 0
            r5 = 0
        Ld:
            int r6 = r0.f17227c
            int r7 = r0.f17226b
            if (r6 >= r7) goto L70
            if (r3 != 0) goto L70
            java.lang.CharSequence r7 = r0.f17225a
            char r6 = r7.charAt(r6)
            r0.f17228d = r6
            boolean r6 = java.lang.Character.isHighSurrogate(r6)
            if (r6 == 0) goto L39
            java.lang.CharSequence r6 = r0.f17225a
            int r7 = r0.f17227c
            int r6 = java.lang.Character.codePointAt(r6, r7)
            int r7 = r0.f17227c
            int r8 = java.lang.Character.charCount(r6)
            int r8 = r8 + r7
            r0.f17227c = r8
            byte r6 = java.lang.Character.getDirectionality(r6)
            goto L4d
        L39:
            int r6 = r0.f17227c
            int r6 = r6 + r2
            r0.f17227c = r6
            char r6 = r0.f17228d
            r7 = 1792(0x700, float:2.511E-42)
            if (r6 >= r7) goto L49
            byte[] r7 = p195l0.C4157a.a.f17224e
            r6 = r7[r6]
            goto L4d
        L49:
            byte r6 = java.lang.Character.getDirectionality(r6)
        L4d:
            if (r6 == 0) goto L6b
            if (r6 == r2) goto L68
            r7 = 2
            if (r6 == r7) goto L68
            r7 = 9
            if (r6 == r7) goto Ld
            switch(r6) {
                case 14: goto L64;
                case 15: goto L64;
                case 16: goto L60;
                case 17: goto L60;
                case 18: goto L5c;
                default: goto L5b;
            }
        L5b:
            goto L6e
        L5c:
            int r5 = r5 + (-1)
            r4 = 0
            goto Ld
        L60:
            int r5 = r5 + 1
            r4 = 1
            goto Ld
        L64:
            int r5 = r5 + 1
            r4 = -1
            goto Ld
        L68:
            if (r5 != 0) goto L6e
            goto L88
        L6b:
            if (r5 != 0) goto L6e
            goto L8c
        L6e:
            r3 = r5
            goto Ld
        L70:
            if (r3 != 0) goto L73
            goto L91
        L73:
            if (r4 == 0) goto L77
            r1 = r4
            goto L91
        L77:
            int r4 = r0.f17227c
            if (r4 <= 0) goto L91
            byte r4 = r0.m9217a()
            switch(r4) {
                case 14: goto L8a;
                case 15: goto L8a;
                case 16: goto L86;
                case 17: goto L86;
                case 18: goto L83;
                default: goto L82;
            }
        L82:
            goto L77
        L83:
            int r5 = r5 + 1
            goto L77
        L86:
            if (r3 != r5) goto L8e
        L88:
            r1 = 1
            goto L91
        L8a:
            if (r3 != r5) goto L8e
        L8c:
            r1 = -1
            goto L91
        L8e:
            int r5 = r5 + (-1)
            goto L77
        L91:
            return r1
    }

    /* renamed from: b */
    public static int m9214b(java.lang.CharSequence r6) {
            l0.a$a r0 = new l0.a$a
            r1 = 0
            r0.<init>(r6, r1)
            int r6 = r0.f17226b
            r0.f17227c = r6
            r6 = 0
            r2 = 0
        Lc:
            int r3 = r0.f17227c
            r4 = 1
            if (r3 <= 0) goto L41
            byte r3 = r0.m9217a()
            if (r3 == 0) goto L39
            if (r3 == r4) goto L32
            r5 = 2
            if (r3 == r5) goto L32
            r5 = 9
            if (r3 == r5) goto Lc
            switch(r3) {
                case 14: goto L2c;
                case 15: goto L2c;
                case 16: goto L29;
                case 17: goto L29;
                case 18: goto L26;
                default: goto L23;
            }
        L23:
            if (r2 != 0) goto Lc
            goto L3f
        L26:
            int r6 = r6 + 1
            goto Lc
        L29:
            if (r2 != r6) goto L2f
            goto L34
        L2c:
            if (r2 != r6) goto L2f
            goto L3b
        L2f:
            int r6 = r6 + (-1)
            goto Lc
        L32:
            if (r6 != 0) goto L36
        L34:
            r1 = 1
            goto L41
        L36:
            if (r2 != 0) goto Lc
            goto L3f
        L39:
            if (r6 != 0) goto L3d
        L3b:
            r1 = -1
            goto L41
        L3d:
            if (r2 != 0) goto Lc
        L3f:
            r2 = r6
            goto Lc
        L41:
            return r1
    }

    /* renamed from: c */
    public static p195l0.C4157a m9215c() {
            java.util.Locale r0 = java.util.Locale.getDefault()
            int r1 = p195l0.C4161e.f17240a
            int r0 = android.text.TextUtils.getLayoutDirectionFromLocale(r0)
            r1 = 1
            if (r0 != r1) goto Le
            goto Lf
        Le:
            r1 = 0
        Lf:
            l0.c r0 = p195l0.C4157a.f17216d
            l0.c r2 = p195l0.C4157a.f17216d
            if (r0 != r2) goto L1d
            if (r1 == 0) goto L1a
            l0.a r0 = p195l0.C4157a.f17220h
            goto L24
        L1a:
            l0.a r0 = p195l0.C4157a.f17219g
            goto L24
        L1d:
            l0.a r2 = new l0.a
            r3 = 2
            r2.<init>(r1, r3, r0)
            r0 = r2
        L24:
            return r0
    }

    /* renamed from: d */
    public java.lang.CharSequence m9216d(java.lang.CharSequence r8, p195l0.InterfaceC4159c r9, boolean r10) {
            r7 = this;
            if (r8 != 0) goto L4
            r8 = 0
            return r8
        L4:
            int r0 = r8.length()
            l0.d$c r9 = (p195l0.C4160d.c) r9
            r1 = 0
            boolean r9 = r9.m9221b(r8, r1, r0)
            android.text.SpannableStringBuilder r0 = new android.text.SpannableStringBuilder
            r0.<init>()
            int r2 = r7.f17222b
            r2 = r2 & 2
            r3 = 1
            if (r2 == 0) goto L1d
            r2 = 1
            goto L1e
        L1d:
            r2 = 0
        L1e:
            r4 = -1
            java.lang.String r5 = ""
            if (r2 == 0) goto L58
            if (r10 == 0) goto L58
            if (r9 == 0) goto L2a
            l0.c r2 = p195l0.C4160d.f17234b
            goto L2c
        L2a:
            l0.c r2 = p195l0.C4160d.f17233a
        L2c:
            int r6 = r8.length()
            l0.d$c r2 = (p195l0.C4160d.c) r2
            boolean r2 = r2.m9221b(r8, r1, r6)
            boolean r6 = r7.f17221a
            if (r6 != 0) goto L45
            if (r2 != 0) goto L42
            int r6 = m9213a(r8)
            if (r6 != r3) goto L45
        L42:
            java.lang.String r2 = p195l0.C4157a.f17217e
            goto L55
        L45:
            boolean r6 = r7.f17221a
            if (r6 == 0) goto L54
            if (r2 == 0) goto L51
            int r2 = m9213a(r8)
            if (r2 != r4) goto L54
        L51:
            java.lang.String r2 = p195l0.C4157a.f17218f
            goto L55
        L54:
            r2 = r5
        L55:
            r0.append(r2)
        L58:
            boolean r2 = r7.f17221a
            if (r9 == r2) goto L6f
            if (r9 == 0) goto L61
            r2 = 8235(0x202b, float:1.154E-41)
            goto L63
        L61:
            r2 = 8234(0x202a, float:1.1538E-41)
        L63:
            r0.append(r2)
            r0.append(r8)
            r2 = 8236(0x202c, float:1.1541E-41)
            r0.append(r2)
            goto L72
        L6f:
            r0.append(r8)
        L72:
            if (r10 == 0) goto La5
            if (r9 == 0) goto L79
            l0.c r9 = p195l0.C4160d.f17234b
            goto L7b
        L79:
            l0.c r9 = p195l0.C4160d.f17233a
        L7b:
            int r10 = r8.length()
            l0.d$c r9 = (p195l0.C4160d.c) r9
            boolean r9 = r9.m9221b(r8, r1, r10)
            boolean r10 = r7.f17221a
            if (r10 != 0) goto L94
            if (r9 != 0) goto L91
            int r10 = m9214b(r8)
            if (r10 != r3) goto L94
        L91:
            java.lang.String r5 = p195l0.C4157a.f17217e
            goto La2
        L94:
            boolean r10 = r7.f17221a
            if (r10 == 0) goto La2
            if (r9 == 0) goto La0
            int r8 = m9214b(r8)
            if (r8 != r4) goto La2
        La0:
            java.lang.String r5 = p195l0.C4157a.f17218f
        La2:
            r0.append(r5)
        La5:
            return r0
    }
}
