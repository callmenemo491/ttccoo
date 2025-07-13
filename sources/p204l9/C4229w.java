package p204l9;

/* renamed from: l9.w */
/* loaded from: classes.dex */
public final class C4229w extends p221m9.AbstractC4501x<p204l9.C4229w, p204l9.C4229w.b> implements p221m9.InterfaceC4485r0 {
    private static final p204l9.C4229w DEFAULT_INSTANCE = null;
    public static final int KEY_MATERIAL_TYPE_FIELD_NUMBER = 3;
    private static volatile p221m9.InterfaceC4504y0<p204l9.C4229w> PARSER = null;
    public static final int TYPE_URL_FIELD_NUMBER = 1;
    public static final int VALUE_FIELD_NUMBER = 2;
    private int keyMaterialType_;
    private java.lang.String typeUrl_;
    private p221m9.AbstractC4454h value_;

    /* renamed from: l9.w$a */
    public static /* synthetic */ class a {
    }

    /* renamed from: l9.w$b */
    public static final class b extends p221m9.AbstractC4501x.a<p204l9.C4229w, p204l9.C4229w.b> implements p221m9.InterfaceC4485r0 {
        public b() {
                r1 = this;
                l9.w r0 = p204l9.C4229w.m9523w()
                r1.<init>(r0)
                return
        }

        public b(p204l9.C4229w.a r1) {
                r0 = this;
                l9.w r1 = p204l9.C4229w.m9523w()
                r0.<init>(r1)
                return
        }
    }

    /* renamed from: l9.w$c */
    public enum c extends java.lang.Enum<p204l9.C4229w.c> implements p221m9.C4505z.a {

        /* renamed from: Z */
        public static final p204l9.C4229w.c f17377Z = null;

        /* renamed from: a0 */
        public static final p204l9.C4229w.c f17378a0 = null;

        /* renamed from: b0 */
        public static final p204l9.C4229w.c f17379b0 = null;

        /* renamed from: c0 */
        public static final p204l9.C4229w.c f17380c0 = null;

        /* renamed from: d0 */
        public static final p204l9.C4229w.c f17381d0 = null;

        /* renamed from: e0 */
        public static final p204l9.C4229w.c f17382e0 = null;

        /* renamed from: f0 */
        public static final /* synthetic */ p204l9.C4229w.c[] f17383f0 = null;

        /* renamed from: Y */
        public final int f17384Y;

        static {
                l9.w$c r0 = new l9.w$c
                java.lang.String r1 = "UNKNOWN_KEYMATERIAL"
                r2 = 0
                r0.<init>(r1, r2, r2)
                p204l9.C4229w.c.f17377Z = r0
                l9.w$c r1 = new l9.w$c
                java.lang.String r3 = "SYMMETRIC"
                r4 = 1
                r1.<init>(r3, r4, r4)
                p204l9.C4229w.c.f17378a0 = r1
                l9.w$c r3 = new l9.w$c
                java.lang.String r5 = "ASYMMETRIC_PRIVATE"
                r6 = 2
                r3.<init>(r5, r6, r6)
                p204l9.C4229w.c.f17379b0 = r3
                l9.w$c r5 = new l9.w$c
                java.lang.String r7 = "ASYMMETRIC_PUBLIC"
                r8 = 3
                r5.<init>(r7, r8, r8)
                p204l9.C4229w.c.f17380c0 = r5
                l9.w$c r7 = new l9.w$c
                java.lang.String r9 = "REMOTE"
                r10 = 4
                r7.<init>(r9, r10, r10)
                p204l9.C4229w.c.f17381d0 = r7
                l9.w$c r9 = new l9.w$c
                java.lang.String r11 = "UNRECOGNIZED"
                r12 = 5
                r13 = -1
                r9.<init>(r11, r12, r13)
                p204l9.C4229w.c.f17382e0 = r9
                r11 = 6
                l9.w$c[] r11 = new p204l9.C4229w.c[r11]
                r11[r2] = r0
                r11[r4] = r1
                r11[r6] = r3
                r11[r8] = r5
                r11[r10] = r7
                r11[r12] = r9
                p204l9.C4229w.c.f17383f0 = r11
                return
        }

        c(java.lang.String r1, int r2, int r3) {
                r0 = this;
                r0.<init>(r1, r2)
                r0.f17384Y = r3
                return
        }

        /* renamed from: e */
        public static p204l9.C4229w.c m9530e(int r1) {
                if (r1 == 0) goto L1c
                r0 = 1
                if (r1 == r0) goto L19
                r0 = 2
                if (r1 == r0) goto L16
                r0 = 3
                if (r1 == r0) goto L13
                r0 = 4
                if (r1 == r0) goto L10
                r1 = 0
                return r1
            L10:
                l9.w$c r1 = p204l9.C4229w.c.f17381d0
                return r1
            L13:
                l9.w$c r1 = p204l9.C4229w.c.f17380c0
                return r1
            L16:
                l9.w$c r1 = p204l9.C4229w.c.f17379b0
                return r1
            L19:
                l9.w$c r1 = p204l9.C4229w.c.f17378a0
                return r1
            L1c:
                l9.w$c r1 = p204l9.C4229w.c.f17377Z
                return r1
        }

        public static p204l9.C4229w.c valueOf(java.lang.String r1) {
                java.lang.Class<l9.w$c> r0 = p204l9.C4229w.c.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                l9.w$c r1 = (p204l9.C4229w.c) r1
                return r1
        }

        public static p204l9.C4229w.c[] values() {
                l9.w$c[] r0 = p204l9.C4229w.c.f17383f0
                java.lang.Object r0 = r0.clone()
                l9.w$c[] r0 = (p204l9.C4229w.c[]) r0
                return r0
        }

        @Override // p221m9.C4505z.a
        /* renamed from: d */
        public final int mo9432d() {
                r2 = this;
                l9.w$c r0 = p204l9.C4229w.c.f17382e0
                if (r2 == r0) goto L7
                int r0 = r2.f17384Y
                return r0
            L7:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.String r1 = "Can't get the number of an unknown enum value."
                r0.<init>(r1)
                throw r0
        }
    }

    static {
            l9.w r0 = new l9.w
            r0.<init>()
            p204l9.C4229w.DEFAULT_INSTANCE = r0
            java.lang.Class<l9.w> r1 = p204l9.C4229w.class
            p221m9.AbstractC4501x.m10372v(r1, r0)
            return
    }

    public C4229w() {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = ""
            r1.typeUrl_ = r0
            m9.h r0 = p221m9.AbstractC4454h.f18139Z
            r1.value_ = r0
            return
    }

    /* renamed from: A */
    public static p204l9.C4229w m9521A() {
            l9.w r0 = p204l9.C4229w.DEFAULT_INSTANCE
            return r0
    }

    /* renamed from: E */
    public static p204l9.C4229w.b m9522E() {
            l9.w r0 = p204l9.C4229w.DEFAULT_INSTANCE
            m9.x$a r0 = r0.m10373n()
            l9.w$b r0 = (p204l9.C4229w.b) r0
            return r0
    }

    /* renamed from: w */
    public static /* synthetic */ p204l9.C4229w m9523w() {
            l9.w r0 = p204l9.C4229w.DEFAULT_INSTANCE
            return r0
    }

    /* renamed from: x */
    public static void m9524x(p204l9.C4229w r0, java.lang.String r1) {
            java.util.Objects.requireNonNull(r0)
            java.util.Objects.requireNonNull(r1)
            r0.typeUrl_ = r1
            return
    }

    /* renamed from: y */
    public static void m9525y(p204l9.C4229w r0, p221m9.AbstractC4454h r1) {
            java.util.Objects.requireNonNull(r0)
            java.util.Objects.requireNonNull(r1)
            r0.value_ = r1
            return
    }

    /* renamed from: z */
    public static void m9526z(p204l9.C4229w r0, p204l9.C4229w.c r1) {
            java.util.Objects.requireNonNull(r0)
            int r1 = r1.mo9432d()
            r0.keyMaterialType_ = r1
            return
    }

    /* renamed from: B */
    public p204l9.C4229w.c m9527B() {
            r1 = this;
            int r0 = r1.keyMaterialType_
            l9.w$c r0 = p204l9.C4229w.c.m9530e(r0)
            if (r0 != 0) goto La
            l9.w$c r0 = p204l9.C4229w.c.f17382e0
        La:
            return r0
    }

    /* renamed from: C */
    public java.lang.String m9528C() {
            r1 = this;
            java.lang.String r0 = r1.typeUrl_
            return r0
    }

    /* renamed from: D */
    public p221m9.AbstractC4454h m9529D() {
            r1 = this;
            m9.h r0 = r1.value_
            return r0
    }

    @Override // p221m9.AbstractC4501x
    /* renamed from: o */
    public final java.lang.Object mo9340o(p221m9.AbstractC4501x.f r2, java.lang.Object r3, java.lang.Object r4) {
            r1 = this;
            int r2 = r2.ordinal()
            r3 = 1
            r4 = 0
            switch(r2) {
                case 0: goto L56;
                case 1: goto L55;
                case 2: goto L3a;
                case 3: goto L34;
                case 4: goto L2e;
                case 5: goto L2b;
                case 6: goto Lf;
                default: goto L9;
            }
        L9:
            java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
            r2.<init>()
            throw r2
        Lf:
            m9.y0<l9.w> r2 = p204l9.C4229w.PARSER
            if (r2 != 0) goto L2a
            java.lang.Class<l9.w> r3 = p204l9.C4229w.class
            monitor-enter(r3)
            m9.y0<l9.w> r2 = p204l9.C4229w.PARSER     // Catch: java.lang.Throwable -> L24
            if (r2 != 0) goto L26
            m9.x$b r2 = new m9.x$b     // Catch: java.lang.Throwable -> L24
            l9.w r4 = p204l9.C4229w.DEFAULT_INSTANCE     // Catch: java.lang.Throwable -> L24
            r2.<init>(r4)     // Catch: java.lang.Throwable -> L24
            p204l9.C4229w.PARSER = r2     // Catch: java.lang.Throwable -> L24
            goto L26
        L24:
            r2 = move-exception
            goto L28
        L26:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L24
            goto L2a
        L28:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L24
            throw r2
        L2a:
            return r2
        L2b:
            l9.w r2 = p204l9.C4229w.DEFAULT_INSTANCE
            return r2
        L2e:
            l9.w$b r2 = new l9.w$b
            r2.<init>(r4)
            return r2
        L34:
            l9.w r2 = new l9.w
            r2.<init>()
            return r2
        L3a:
            r2 = 3
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r4 = 0
            java.lang.String r0 = "typeUrl_"
            r2[r4] = r0
            java.lang.String r4 = "value_"
            r2[r3] = r4
            r3 = 2
            java.lang.String r4 = "keyMaterialType_"
            r2[r3] = r4
            java.lang.String r3 = "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u0208\u0002\n\u0003\f"
            l9.w r4 = p204l9.C4229w.DEFAULT_INSTANCE
            m9.c1 r0 = new m9.c1
            r0.<init>(r4, r3, r2)
            return r0
        L55:
            return r4
        L56:
            java.lang.Byte r2 = java.lang.Byte.valueOf(r3)
            return r2
    }
}
