package p204l9;

/* renamed from: l9.f0 */
/* loaded from: classes.dex */
public final class C4208f0 extends p221m9.AbstractC4501x<p204l9.C4208f0, p204l9.C4208f0.b> implements p221m9.InterfaceC4485r0 {
    private static final p204l9.C4208f0 DEFAULT_INSTANCE = null;
    public static final int DEK_TEMPLATE_FIELD_NUMBER = 2;
    public static final int KEK_URI_FIELD_NUMBER = 1;
    private static volatile p221m9.InterfaceC4504y0<p204l9.C4208f0> PARSER;
    private p204l9.C4231y dekTemplate_;
    private java.lang.String kekUri_;

    /* renamed from: l9.f0$a */
    public static /* synthetic */ class a {
    }

    /* renamed from: l9.f0$b */
    public static final class b extends p221m9.AbstractC4501x.a<p204l9.C4208f0, p204l9.C4208f0.b> implements p221m9.InterfaceC4485r0 {
        public b(p204l9.C4208f0.a r1) {
                r0 = this;
                l9.f0 r1 = p204l9.C4208f0.m9422w()
                r0.<init>(r1)
                return
        }
    }

    static {
            l9.f0 r0 = new l9.f0
            r0.<init>()
            p204l9.C4208f0.DEFAULT_INSTANCE = r0
            java.lang.Class<l9.f0> r1 = p204l9.C4208f0.class
            p221m9.AbstractC4501x.m10372v(r1, r0)
            return
    }

    public C4208f0() {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = ""
            r1.kekUri_ = r0
            return
    }

    /* renamed from: A */
    public static p204l9.C4208f0 m9421A(p221m9.AbstractC4454h r1, p221m9.C4478p r2) {
            l9.f0 r0 = p204l9.C4208f0.DEFAULT_INSTANCE
            m9.x r1 = p221m9.AbstractC4501x.m10369s(r0, r1, r2)
            l9.f0 r1 = (p204l9.C4208f0) r1
            return r1
    }

    /* renamed from: w */
    public static /* synthetic */ p204l9.C4208f0 m9422w() {
            l9.f0 r0 = p204l9.C4208f0.DEFAULT_INSTANCE
            return r0
    }

    /* renamed from: x */
    public static p204l9.C4208f0 m9423x() {
            l9.f0 r0 = p204l9.C4208f0.DEFAULT_INSTANCE
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
                case 0: goto L51;
                case 1: goto L50;
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
            m9.y0<l9.f0> r2 = p204l9.C4208f0.PARSER
            if (r2 != 0) goto L2a
            java.lang.Class<l9.f0> r3 = p204l9.C4208f0.class
            monitor-enter(r3)
            m9.y0<l9.f0> r2 = p204l9.C4208f0.PARSER     // Catch: java.lang.Throwable -> L24
            if (r2 != 0) goto L26
            m9.x$b r2 = new m9.x$b     // Catch: java.lang.Throwable -> L24
            l9.f0 r4 = p204l9.C4208f0.DEFAULT_INSTANCE     // Catch: java.lang.Throwable -> L24
            r2.<init>(r4)     // Catch: java.lang.Throwable -> L24
            p204l9.C4208f0.PARSER = r2     // Catch: java.lang.Throwable -> L24
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
            l9.f0 r2 = p204l9.C4208f0.DEFAULT_INSTANCE
            return r2
        L2e:
            l9.f0$b r2 = new l9.f0$b
            r2.<init>(r4)
            return r2
        L34:
            l9.f0 r2 = new l9.f0
            r2.<init>()
            return r2
        L3a:
            r2 = 2
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r4 = 0
            java.lang.String r0 = "kekUri_"
            r2[r4] = r0
            java.lang.String r4 = "dekTemplate_"
            r2[r3] = r4
            java.lang.String r3 = "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0208\u0002\t"
            l9.f0 r4 = p204l9.C4208f0.DEFAULT_INSTANCE
            m9.c1 r0 = new m9.c1
            r0.<init>(r4, r3, r2)
            return r0
        L50:
            return r4
        L51:
            java.lang.Byte r2 = java.lang.Byte.valueOf(r3)
            return r2
    }

    /* renamed from: y */
    public p204l9.C4231y m9424y() {
            r1 = this;
            l9.y r0 = r1.dekTemplate_
            if (r0 != 0) goto L8
            l9.y r0 = p204l9.C4231y.m9532A()
        L8:
            return r0
    }

    /* renamed from: z */
    public java.lang.String m9425z() {
            r1 = this;
            java.lang.String r0 = r1.kekUri_
            return r0
    }
}
