package p204l9;

/* renamed from: l9.c */
/* loaded from: classes.dex */
public final class C4201c extends p221m9.AbstractC4501x<p204l9.C4201c, p204l9.C4201c.b> implements p221m9.InterfaceC4485r0 {
    private static final p204l9.C4201c DEFAULT_INSTANCE = null;
    private static volatile p221m9.InterfaceC4504y0<p204l9.C4201c> PARSER = null;
    public static final int TAG_SIZE_FIELD_NUMBER = 1;
    private int tagSize_;

    /* renamed from: l9.c$a */
    public static /* synthetic */ class a {
    }

    /* renamed from: l9.c$b */
    public static final class b extends p221m9.AbstractC4501x.a<p204l9.C4201c, p204l9.C4201c.b> implements p221m9.InterfaceC4485r0 {
        public b(p204l9.C4201c.a r1) {
                r0 = this;
                l9.c r1 = p204l9.C4201c.m9377w()
                r0.<init>(r1)
                return
        }
    }

    static {
            l9.c r0 = new l9.c
            r0.<init>()
            p204l9.C4201c.DEFAULT_INSTANCE = r0
            java.lang.Class<l9.c> r1 = p204l9.C4201c.class
            p221m9.AbstractC4501x.m10372v(r1, r0)
            return
    }

    public C4201c() {
            r0 = this;
            r0.<init>()
            return
    }

    /* renamed from: w */
    public static /* synthetic */ p204l9.C4201c m9377w() {
            l9.c r0 = p204l9.C4201c.DEFAULT_INSTANCE
            return r0
    }

    /* renamed from: x */
    public static p204l9.C4201c m9378x() {
            l9.c r0 = p204l9.C4201c.DEFAULT_INSTANCE
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
            m9.y0<l9.c> r2 = p204l9.C4201c.PARSER
            if (r2 != 0) goto L2a
            java.lang.Class<l9.c> r3 = p204l9.C4201c.class
            monitor-enter(r3)
            m9.y0<l9.c> r2 = p204l9.C4201c.PARSER     // Catch: java.lang.Throwable -> L24
            if (r2 != 0) goto L26
            m9.x$b r2 = new m9.x$b     // Catch: java.lang.Throwable -> L24
            l9.c r4 = p204l9.C4201c.DEFAULT_INSTANCE     // Catch: java.lang.Throwable -> L24
            r2.<init>(r4)     // Catch: java.lang.Throwable -> L24
            p204l9.C4201c.PARSER = r2     // Catch: java.lang.Throwable -> L24
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
            l9.c r2 = p204l9.C4201c.DEFAULT_INSTANCE
            return r2
        L2e:
            l9.c$b r2 = new l9.c$b
            r2.<init>(r4)
            return r2
        L34:
            l9.c r2 = new l9.c
            r2.<init>()
            return r2
        L3a:
            java.lang.Object[] r2 = new java.lang.Object[r3]
            r3 = 0
            java.lang.String r4 = "tagSize_"
            r2[r3] = r4
            java.lang.String r3 = "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b"
            l9.c r4 = p204l9.C4201c.DEFAULT_INSTANCE
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
    public int m9379y() {
            r1 = this;
            int r0 = r1.tagSize_
            return r0
    }
}
