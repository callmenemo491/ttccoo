package p204l9;

/* renamed from: l9.y */
/* loaded from: classes.dex */
public final class C4231y extends p221m9.AbstractC4501x<p204l9.C4231y, p204l9.C4231y.b> implements p221m9.InterfaceC4485r0 {
    private static final p204l9.C4231y DEFAULT_INSTANCE = null;
    public static final int OUTPUT_PREFIX_TYPE_FIELD_NUMBER = 3;
    private static volatile p221m9.InterfaceC4504y0<p204l9.C4231y> PARSER = null;
    public static final int TYPE_URL_FIELD_NUMBER = 1;
    public static final int VALUE_FIELD_NUMBER = 2;
    private int outputPrefixType_;
    private java.lang.String typeUrl_;
    private p221m9.AbstractC4454h value_;

    /* renamed from: l9.y$a */
    public static /* synthetic */ class a {
    }

    /* renamed from: l9.y$b */
    public static final class b extends p221m9.AbstractC4501x.a<p204l9.C4231y, p204l9.C4231y.b> implements p221m9.InterfaceC4485r0 {
        public b() {
                r1 = this;
                l9.y r0 = p204l9.C4231y.m9534w()
                r1.<init>(r0)
                return
        }

        public b(p204l9.C4231y.a r1) {
                r0 = this;
                l9.y r1 = p204l9.C4231y.m9534w()
                r0.<init>(r1)
                return
        }
    }

    static {
            l9.y r0 = new l9.y
            r0.<init>()
            p204l9.C4231y.DEFAULT_INSTANCE = r0
            java.lang.Class<l9.y> r1 = p204l9.C4231y.class
            p221m9.AbstractC4501x.m10372v(r1, r0)
            return
    }

    public C4231y() {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = ""
            r1.typeUrl_ = r0
            m9.h r0 = p221m9.AbstractC4454h.f18139Z
            r1.value_ = r0
            return
    }

    /* renamed from: A */
    public static p204l9.C4231y m9532A() {
            l9.y r0 = p204l9.C4231y.DEFAULT_INSTANCE
            return r0
    }

    /* renamed from: E */
    public static p204l9.C4231y.b m9533E() {
            l9.y r0 = p204l9.C4231y.DEFAULT_INSTANCE
            m9.x$a r0 = r0.m10373n()
            l9.y$b r0 = (p204l9.C4231y.b) r0
            return r0
    }

    /* renamed from: w */
    public static /* synthetic */ p204l9.C4231y m9534w() {
            l9.y r0 = p204l9.C4231y.DEFAULT_INSTANCE
            return r0
    }

    /* renamed from: x */
    public static void m9535x(p204l9.C4231y r0, java.lang.String r1) {
            java.util.Objects.requireNonNull(r0)
            java.util.Objects.requireNonNull(r1)
            r0.typeUrl_ = r1
            return
    }

    /* renamed from: y */
    public static void m9536y(p204l9.C4231y r0, p221m9.AbstractC4454h r1) {
            java.util.Objects.requireNonNull(r0)
            java.util.Objects.requireNonNull(r1)
            r0.value_ = r1
            return
    }

    /* renamed from: z */
    public static void m9537z(p204l9.C4231y r0, p204l9.EnumC4210g0 r1) {
            java.util.Objects.requireNonNull(r0)
            int r1 = r1.mo9432d()
            r0.outputPrefixType_ = r1
            return
    }

    /* renamed from: B */
    public p204l9.EnumC4210g0 m9538B() {
            r1 = this;
            int r0 = r1.outputPrefixType_
            l9.g0 r0 = p204l9.EnumC4210g0.m9431e(r0)
            if (r0 != 0) goto La
            l9.g0 r0 = p204l9.EnumC4210g0.f17366e0
        La:
            return r0
    }

    /* renamed from: C */
    public java.lang.String m9539C() {
            r1 = this;
            java.lang.String r0 = r1.typeUrl_
            return r0
    }

    /* renamed from: D */
    public p221m9.AbstractC4454h m9540D() {
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
            m9.y0<l9.y> r2 = p204l9.C4231y.PARSER
            if (r2 != 0) goto L2a
            java.lang.Class<l9.y> r3 = p204l9.C4231y.class
            monitor-enter(r3)
            m9.y0<l9.y> r2 = p204l9.C4231y.PARSER     // Catch: java.lang.Throwable -> L24
            if (r2 != 0) goto L26
            m9.x$b r2 = new m9.x$b     // Catch: java.lang.Throwable -> L24
            l9.y r4 = p204l9.C4231y.DEFAULT_INSTANCE     // Catch: java.lang.Throwable -> L24
            r2.<init>(r4)     // Catch: java.lang.Throwable -> L24
            p204l9.C4231y.PARSER = r2     // Catch: java.lang.Throwable -> L24
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
            l9.y r2 = p204l9.C4231y.DEFAULT_INSTANCE
            return r2
        L2e:
            l9.y$b r2 = new l9.y$b
            r2.<init>(r4)
            return r2
        L34:
            l9.y r2 = new l9.y
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
            java.lang.String r4 = "outputPrefixType_"
            r2[r3] = r4
            java.lang.String r3 = "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u0208\u0002\n\u0003\f"
            l9.y r4 = p204l9.C4231y.DEFAULT_INSTANCE
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
