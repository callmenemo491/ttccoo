package p204l9;

/* renamed from: l9.e */
/* loaded from: classes.dex */
public final class C4205e extends p221m9.AbstractC4501x<p204l9.C4205e, p204l9.C4205e.b> implements p221m9.InterfaceC4485r0 {
    public static final int AES_CTR_KEY_FORMAT_FIELD_NUMBER = 1;
    private static final p204l9.C4205e DEFAULT_INSTANCE = null;
    public static final int HMAC_KEY_FORMAT_FIELD_NUMBER = 2;
    private static volatile p221m9.InterfaceC4504y0<p204l9.C4205e> PARSER;
    private p204l9.C4209g aesCtrKeyFormat_;
    private p204l9.C4227u hmacKeyFormat_;

    /* renamed from: l9.e$a */
    public static /* synthetic */ class a {
    }

    /* renamed from: l9.e$b */
    public static final class b extends p221m9.AbstractC4501x.a<p204l9.C4205e, p204l9.C4205e.b> implements p221m9.InterfaceC4485r0 {
        public b(p204l9.C4205e.a r1) {
                r0 = this;
                l9.e r1 = p204l9.C4205e.m9400w()
                r0.<init>(r1)
                return
        }
    }

    static {
            l9.e r0 = new l9.e
            r0.<init>()
            p204l9.C4205e.DEFAULT_INSTANCE = r0
            java.lang.Class<l9.e> r1 = p204l9.C4205e.class
            p221m9.AbstractC4501x.m10372v(r1, r0)
            return
    }

    public C4205e() {
            r0 = this;
            r0.<init>()
            return
    }

    /* renamed from: w */
    public static /* synthetic */ p204l9.C4205e m9400w() {
            l9.e r0 = p204l9.C4205e.DEFAULT_INSTANCE
            return r0
    }

    /* renamed from: z */
    public static p204l9.C4205e m9401z(p221m9.AbstractC4454h r1, p221m9.C4478p r2) {
            l9.e r0 = p204l9.C4205e.DEFAULT_INSTANCE
            m9.x r1 = p221m9.AbstractC4501x.m10369s(r0, r1, r2)
            l9.e r1 = (p204l9.C4205e) r1
            return r1
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
            m9.y0<l9.e> r2 = p204l9.C4205e.PARSER
            if (r2 != 0) goto L2a
            java.lang.Class<l9.e> r3 = p204l9.C4205e.class
            monitor-enter(r3)
            m9.y0<l9.e> r2 = p204l9.C4205e.PARSER     // Catch: java.lang.Throwable -> L24
            if (r2 != 0) goto L26
            m9.x$b r2 = new m9.x$b     // Catch: java.lang.Throwable -> L24
            l9.e r4 = p204l9.C4205e.DEFAULT_INSTANCE     // Catch: java.lang.Throwable -> L24
            r2.<init>(r4)     // Catch: java.lang.Throwable -> L24
            p204l9.C4205e.PARSER = r2     // Catch: java.lang.Throwable -> L24
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
            l9.e r2 = p204l9.C4205e.DEFAULT_INSTANCE
            return r2
        L2e:
            l9.e$b r2 = new l9.e$b
            r2.<init>(r4)
            return r2
        L34:
            l9.e r2 = new l9.e
            r2.<init>()
            return r2
        L3a:
            r2 = 2
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r4 = 0
            java.lang.String r0 = "aesCtrKeyFormat_"
            r2[r4] = r0
            java.lang.String r4 = "hmacKeyFormat_"
            r2[r3] = r4
            java.lang.String r3 = "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\t"
            l9.e r4 = p204l9.C4205e.DEFAULT_INSTANCE
            m9.c1 r0 = new m9.c1
            r0.<init>(r4, r3, r2)
            return r0
        L50:
            return r4
        L51:
            java.lang.Byte r2 = java.lang.Byte.valueOf(r3)
            return r2
    }

    /* renamed from: x */
    public p204l9.C4209g m9402x() {
            r1 = this;
            l9.g r0 = r1.aesCtrKeyFormat_
            if (r0 != 0) goto L8
            l9.g r0 = p204l9.C4209g.m9428x()
        L8:
            return r0
    }

    /* renamed from: y */
    public p204l9.C4227u m9403y() {
            r1 = this;
            l9.u r0 = r1.hmacKeyFormat_
            if (r0 != 0) goto L8
            l9.u r0 = p204l9.C4227u.m9514x()
        L8:
            return r0
    }
}
