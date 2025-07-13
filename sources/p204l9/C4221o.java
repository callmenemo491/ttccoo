package p204l9;

/* renamed from: l9.o */
/* loaded from: classes.dex */
public final class C4221o extends p221m9.AbstractC4501x<p204l9.C4221o, p204l9.C4221o.b> implements p221m9.InterfaceC4485r0 {
    private static final p204l9.C4221o DEFAULT_INSTANCE = null;
    public static final int KEY_SIZE_FIELD_NUMBER = 1;
    private static volatile p221m9.InterfaceC4504y0<p204l9.C4221o> PARSER;
    private int keySize_;

    /* renamed from: l9.o$a */
    public static /* synthetic */ class a {
    }

    /* renamed from: l9.o$b */
    public static final class b extends p221m9.AbstractC4501x.a<p204l9.C4221o, p204l9.C4221o.b> implements p221m9.InterfaceC4485r0 {
        public b() {
                r1 = this;
                l9.o r0 = p204l9.C4221o.m9482w()
                r1.<init>(r0)
                return
        }

        public b(p204l9.C4221o.a r1) {
                r0 = this;
                l9.o r1 = p204l9.C4221o.m9482w()
                r0.<init>(r1)
                return
        }
    }

    static {
            l9.o r0 = new l9.o
            r0.<init>()
            p204l9.C4221o.DEFAULT_INSTANCE = r0
            java.lang.Class<l9.o> r1 = p204l9.C4221o.class
            p221m9.AbstractC4501x.m10372v(r1, r0)
            return
    }

    public C4221o() {
            r0 = this;
            r0.<init>()
            return
    }

    /* renamed from: A */
    public static p204l9.C4221o m9481A(p221m9.AbstractC4454h r1, p221m9.C4478p r2) {
            l9.o r0 = p204l9.C4221o.DEFAULT_INSTANCE
            m9.x r1 = p221m9.AbstractC4501x.m10369s(r0, r1, r2)
            l9.o r1 = (p204l9.C4221o) r1
            return r1
    }

    /* renamed from: w */
    public static /* synthetic */ p204l9.C4221o m9482w() {
            l9.o r0 = p204l9.C4221o.DEFAULT_INSTANCE
            return r0
    }

    /* renamed from: x */
    public static void m9483x(p204l9.C4221o r0, int r1) {
            r0.keySize_ = r1
            return
    }

    /* renamed from: z */
    public static p204l9.C4221o.b m9484z() {
            l9.o r0 = p204l9.C4221o.DEFAULT_INSTANCE
            m9.x$a r0 = r0.m10373n()
            l9.o$b r0 = (p204l9.C4221o.b) r0
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
                case 0: goto L4c;
                case 1: goto L4b;
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
            m9.y0<l9.o> r2 = p204l9.C4221o.PARSER
            if (r2 != 0) goto L2a
            java.lang.Class<l9.o> r3 = p204l9.C4221o.class
            monitor-enter(r3)
            m9.y0<l9.o> r2 = p204l9.C4221o.PARSER     // Catch: java.lang.Throwable -> L24
            if (r2 != 0) goto L26
            m9.x$b r2 = new m9.x$b     // Catch: java.lang.Throwable -> L24
            l9.o r4 = p204l9.C4221o.DEFAULT_INSTANCE     // Catch: java.lang.Throwable -> L24
            r2.<init>(r4)     // Catch: java.lang.Throwable -> L24
            p204l9.C4221o.PARSER = r2     // Catch: java.lang.Throwable -> L24
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
            l9.o r2 = p204l9.C4221o.DEFAULT_INSTANCE
            return r2
        L2e:
            l9.o$b r2 = new l9.o$b
            r2.<init>(r4)
            return r2
        L34:
            l9.o r2 = new l9.o
            r2.<init>()
            return r2
        L3a:
            java.lang.Object[] r2 = new java.lang.Object[r3]
            r3 = 0
            java.lang.String r4 = "keySize_"
            r2[r3] = r4
            java.lang.String r3 = "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b"
            l9.o r4 = p204l9.C4221o.DEFAULT_INSTANCE
            m9.c1 r0 = new m9.c1
            r0.<init>(r4, r3, r2)
            return r0
        L4b:
            return r4
        L4c:
            java.lang.Byte r2 = java.lang.Byte.valueOf(r3)
            return r2
    }

    /* renamed from: y */
    public int m9485y() {
            r1 = this;
            int r0 = r1.keySize_
            return r0
    }
}
