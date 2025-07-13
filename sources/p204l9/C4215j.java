package p204l9;

/* renamed from: l9.j */
/* loaded from: classes.dex */
public final class C4215j extends p221m9.AbstractC4501x<p204l9.C4215j, p204l9.C4215j.b> implements p221m9.InterfaceC4485r0 {
    private static final p204l9.C4215j DEFAULT_INSTANCE = null;
    public static final int KEY_SIZE_FIELD_NUMBER = 2;
    public static final int PARAMS_FIELD_NUMBER = 1;
    private static volatile p221m9.InterfaceC4504y0<p204l9.C4215j> PARSER;
    private int keySize_;
    private p204l9.C4217k params_;

    /* renamed from: l9.j$a */
    public static /* synthetic */ class a {
    }

    /* renamed from: l9.j$b */
    public static final class b extends p221m9.AbstractC4501x.a<p204l9.C4215j, p204l9.C4215j.b> implements p221m9.InterfaceC4485r0 {
        public b(p204l9.C4215j.a r1) {
                r0 = this;
                l9.j r1 = p204l9.C4215j.m9453w()
                r0.<init>(r1)
                return
        }
    }

    static {
            l9.j r0 = new l9.j
            r0.<init>()
            p204l9.C4215j.DEFAULT_INSTANCE = r0
            java.lang.Class<l9.j> r1 = p204l9.C4215j.class
            p221m9.AbstractC4501x.m10372v(r1, r0)
            return
    }

    public C4215j() {
            r0 = this;
            r0.<init>()
            return
    }

    /* renamed from: w */
    public static /* synthetic */ p204l9.C4215j m9453w() {
            l9.j r0 = p204l9.C4215j.DEFAULT_INSTANCE
            return r0
    }

    /* renamed from: z */
    public static p204l9.C4215j m9454z(p221m9.AbstractC4454h r1, p221m9.C4478p r2) {
            l9.j r0 = p204l9.C4215j.DEFAULT_INSTANCE
            m9.x r1 = p221m9.AbstractC4501x.m10369s(r0, r1, r2)
            l9.j r1 = (p204l9.C4215j) r1
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
            m9.y0<l9.j> r2 = p204l9.C4215j.PARSER
            if (r2 != 0) goto L2a
            java.lang.Class<l9.j> r3 = p204l9.C4215j.class
            monitor-enter(r3)
            m9.y0<l9.j> r2 = p204l9.C4215j.PARSER     // Catch: java.lang.Throwable -> L24
            if (r2 != 0) goto L26
            m9.x$b r2 = new m9.x$b     // Catch: java.lang.Throwable -> L24
            l9.j r4 = p204l9.C4215j.DEFAULT_INSTANCE     // Catch: java.lang.Throwable -> L24
            r2.<init>(r4)     // Catch: java.lang.Throwable -> L24
            p204l9.C4215j.PARSER = r2     // Catch: java.lang.Throwable -> L24
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
            l9.j r2 = p204l9.C4215j.DEFAULT_INSTANCE
            return r2
        L2e:
            l9.j$b r2 = new l9.j$b
            r2.<init>(r4)
            return r2
        L34:
            l9.j r2 = new l9.j
            r2.<init>()
            return r2
        L3a:
            r2 = 2
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r4 = 0
            java.lang.String r0 = "params_"
            r2[r4] = r0
            java.lang.String r4 = "keySize_"
            r2[r3] = r4
            java.lang.String r3 = "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\u000b"
            l9.j r4 = p204l9.C4215j.DEFAULT_INSTANCE
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
    public int m9455x() {
            r1 = this;
            int r0 = r1.keySize_
            return r0
    }

    /* renamed from: y */
    public p204l9.C4217k m9456y() {
            r1 = this;
            l9.k r0 = r1.params_
            if (r0 != 0) goto L8
            l9.k r0 = p204l9.C4217k.m9460x()
        L8:
            return r0
    }
}
