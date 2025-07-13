package p204l9;

/* renamed from: l9.p */
/* loaded from: classes.dex */
public final class C4222p extends p221m9.AbstractC4501x<p204l9.C4222p, p204l9.C4222p.b> implements p221m9.InterfaceC4485r0 {
    private static final p204l9.C4222p DEFAULT_INSTANCE = null;
    public static final int KEY_VALUE_FIELD_NUMBER = 2;
    private static volatile p221m9.InterfaceC4504y0<p204l9.C4222p> PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 1;
    private p221m9.AbstractC4454h keyValue_;
    private int version_;

    /* renamed from: l9.p$a */
    public static /* synthetic */ class a {
    }

    /* renamed from: l9.p$b */
    public static final class b extends p221m9.AbstractC4501x.a<p204l9.C4222p, p204l9.C4222p.b> implements p221m9.InterfaceC4485r0 {
        public b() {
                r1 = this;
                l9.p r0 = p204l9.C4222p.m9488w()
                r1.<init>(r0)
                return
        }

        public b(p204l9.C4222p.a r1) {
                r0 = this;
                l9.p r1 = p204l9.C4222p.m9488w()
                r0.<init>(r1)
                return
        }
    }

    static {
            l9.p r0 = new l9.p
            r0.<init>()
            p204l9.C4222p.DEFAULT_INSTANCE = r0
            java.lang.Class<l9.p> r1 = p204l9.C4222p.class
            p221m9.AbstractC4501x.m10372v(r1, r0)
            return
    }

    public C4222p() {
            r1 = this;
            r1.<init>()
            m9.h r0 = p221m9.AbstractC4454h.f18139Z
            r1.keyValue_ = r0
            return
    }

    /* renamed from: B */
    public static p204l9.C4222p.b m9486B() {
            l9.p r0 = p204l9.C4222p.DEFAULT_INSTANCE
            m9.x$a r0 = r0.m10373n()
            l9.p$b r0 = (p204l9.C4222p.b) r0
            return r0
    }

    /* renamed from: C */
    public static p204l9.C4222p m9487C(p221m9.AbstractC4454h r1, p221m9.C4478p r2) {
            l9.p r0 = p204l9.C4222p.DEFAULT_INSTANCE
            m9.x r1 = p221m9.AbstractC4501x.m10369s(r0, r1, r2)
            l9.p r1 = (p204l9.C4222p) r1
            return r1
    }

    /* renamed from: w */
    public static /* synthetic */ p204l9.C4222p m9488w() {
            l9.p r0 = p204l9.C4222p.DEFAULT_INSTANCE
            return r0
    }

    /* renamed from: x */
    public static void m9489x(p204l9.C4222p r0, int r1) {
            r0.version_ = r1
            return
    }

    /* renamed from: y */
    public static void m9490y(p204l9.C4222p r0, p221m9.AbstractC4454h r1) {
            java.util.Objects.requireNonNull(r0)
            java.util.Objects.requireNonNull(r1)
            r0.keyValue_ = r1
            return
    }

    /* renamed from: A */
    public int m9491A() {
            r1 = this;
            int r0 = r1.version_
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
            m9.y0<l9.p> r2 = p204l9.C4222p.PARSER
            if (r2 != 0) goto L2a
            java.lang.Class<l9.p> r3 = p204l9.C4222p.class
            monitor-enter(r3)
            m9.y0<l9.p> r2 = p204l9.C4222p.PARSER     // Catch: java.lang.Throwable -> L24
            if (r2 != 0) goto L26
            m9.x$b r2 = new m9.x$b     // Catch: java.lang.Throwable -> L24
            l9.p r4 = p204l9.C4222p.DEFAULT_INSTANCE     // Catch: java.lang.Throwable -> L24
            r2.<init>(r4)     // Catch: java.lang.Throwable -> L24
            p204l9.C4222p.PARSER = r2     // Catch: java.lang.Throwable -> L24
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
            l9.p r2 = p204l9.C4222p.DEFAULT_INSTANCE
            return r2
        L2e:
            l9.p$b r2 = new l9.p$b
            r2.<init>(r4)
            return r2
        L34:
            l9.p r2 = new l9.p
            r2.<init>()
            return r2
        L3a:
            r2 = 2
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r4 = 0
            java.lang.String r0 = "version_"
            r2[r4] = r0
            java.lang.String r4 = "keyValue_"
            r2[r3] = r4
            java.lang.String r3 = "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\n"
            l9.p r4 = p204l9.C4222p.DEFAULT_INSTANCE
            m9.c1 r0 = new m9.c1
            r0.<init>(r4, r3, r2)
            return r0
        L50:
            return r4
        L51:
            java.lang.Byte r2 = java.lang.Byte.valueOf(r3)
            return r2
    }

    /* renamed from: z */
    public p221m9.AbstractC4454h m9492z() {
            r1 = this;
            m9.h r0 = r1.keyValue_
            return r0
    }
}
