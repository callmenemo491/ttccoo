package p204l9;

/* renamed from: l9.q */
/* loaded from: classes.dex */
public final class C4223q extends p221m9.AbstractC4501x<p204l9.C4223q, p204l9.C4223q.b> implements p221m9.InterfaceC4485r0 {
    private static final p204l9.C4223q DEFAULT_INSTANCE = null;
    private static volatile p221m9.InterfaceC4504y0<p204l9.C4223q> PARSER;

    /* renamed from: l9.q$a */
    public static /* synthetic */ class a {
    }

    /* renamed from: l9.q$b */
    public static final class b extends p221m9.AbstractC4501x.a<p204l9.C4223q, p204l9.C4223q.b> implements p221m9.InterfaceC4485r0 {
        public b(p204l9.C4223q.a r1) {
                r0 = this;
                l9.q r1 = p204l9.C4223q.m9493w()
                r0.<init>(r1)
                return
        }
    }

    static {
            l9.q r0 = new l9.q
            r0.<init>()
            p204l9.C4223q.DEFAULT_INSTANCE = r0
            java.lang.Class<l9.q> r1 = p204l9.C4223q.class
            p221m9.AbstractC4501x.m10372v(r1, r0)
            return
    }

    public C4223q() {
            r0 = this;
            r0.<init>()
            return
    }

    /* renamed from: w */
    public static /* synthetic */ p204l9.C4223q m9493w() {
            l9.q r0 = p204l9.C4223q.DEFAULT_INSTANCE
            return r0
    }

    /* renamed from: x */
    public static p204l9.C4223q m9494x(p221m9.AbstractC4454h r1, p221m9.C4478p r2) {
            l9.q r0 = p204l9.C4223q.DEFAULT_INSTANCE
            m9.x r1 = p221m9.AbstractC4501x.m10369s(r0, r1, r2)
            l9.q r1 = (p204l9.C4223q) r1
            return r1
    }

    @Override // p221m9.AbstractC4501x
    /* renamed from: o */
    public final java.lang.Object mo9340o(p221m9.AbstractC4501x.f r2, java.lang.Object r3, java.lang.Object r4) {
            r1 = this;
            int r2 = r2.ordinal()
            r3 = 0
            switch(r2) {
                case 0: goto L44;
                case 1: goto L43;
                case 2: goto L39;
                case 3: goto L33;
                case 4: goto L2d;
                case 5: goto L2a;
                case 6: goto Le;
                default: goto L8;
            }
        L8:
            java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
            r2.<init>()
            throw r2
        Le:
            m9.y0<l9.q> r2 = p204l9.C4223q.PARSER
            if (r2 != 0) goto L29
            java.lang.Class<l9.q> r3 = p204l9.C4223q.class
            monitor-enter(r3)
            m9.y0<l9.q> r2 = p204l9.C4223q.PARSER     // Catch: java.lang.Throwable -> L23
            if (r2 != 0) goto L25
            m9.x$b r2 = new m9.x$b     // Catch: java.lang.Throwable -> L23
            l9.q r4 = p204l9.C4223q.DEFAULT_INSTANCE     // Catch: java.lang.Throwable -> L23
            r2.<init>(r4)     // Catch: java.lang.Throwable -> L23
            p204l9.C4223q.PARSER = r2     // Catch: java.lang.Throwable -> L23
            goto L25
        L23:
            r2 = move-exception
            goto L27
        L25:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L23
            goto L29
        L27:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L23
            throw r2
        L29:
            return r2
        L2a:
            l9.q r2 = p204l9.C4223q.DEFAULT_INSTANCE
            return r2
        L2d:
            l9.q$b r2 = new l9.q$b
            r2.<init>(r3)
            return r2
        L33:
            l9.q r2 = new l9.q
            r2.<init>()
            return r2
        L39:
            java.lang.String r2 = "\u0000\u0000"
            l9.q r4 = p204l9.C4223q.DEFAULT_INSTANCE
            m9.c1 r0 = new m9.c1
            r0.<init>(r4, r2, r3)
            return r0
        L43:
            return r3
        L44:
            r2 = 1
            java.lang.Byte r2 = java.lang.Byte.valueOf(r2)
            return r2
    }
}
