package p204l9;

@java.lang.Deprecated
/* renamed from: l9.h0 */
/* loaded from: classes.dex */
public final class C4212h0 extends p221m9.AbstractC4501x<p204l9.C4212h0, p204l9.C4212h0.b> implements p221m9.InterfaceC4485r0 {
    public static final int CONFIG_NAME_FIELD_NUMBER = 1;
    private static final p204l9.C4212h0 DEFAULT_INSTANCE = null;
    public static final int ENTRY_FIELD_NUMBER = 2;
    private static volatile p221m9.InterfaceC4504y0<p204l9.C4212h0> PARSER;
    private java.lang.String configName_;
    private p221m9.C4505z.c<p204l9.C4232z> entry_;

    /* renamed from: l9.h0$a */
    public static /* synthetic */ class a {
    }

    /* renamed from: l9.h0$b */
    public static final class b extends p221m9.AbstractC4501x.a<p204l9.C4212h0, p204l9.C4212h0.b> implements p221m9.InterfaceC4485r0 {
        public b(p204l9.C4212h0.a r1) {
                r0 = this;
                l9.h0 r1 = p204l9.C4212h0.m9436w()
                r0.<init>(r1)
                return
        }
    }

    static {
            l9.h0 r0 = new l9.h0
            r0.<init>()
            p204l9.C4212h0.DEFAULT_INSTANCE = r0
            java.lang.Class<l9.h0> r1 = p204l9.C4212h0.class
            p221m9.AbstractC4501x.m10372v(r1, r0)
            return
    }

    public C4212h0() {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = ""
            r1.configName_ = r0
            m9.b1<java.lang.Object> r0 = p221m9.C4438b1.f18108b0
            r1.entry_ = r0
            return
    }

    /* renamed from: w */
    public static /* synthetic */ p204l9.C4212h0 m9436w() {
            l9.h0 r0 = p204l9.C4212h0.DEFAULT_INSTANCE
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
            m9.y0<l9.h0> r2 = p204l9.C4212h0.PARSER
            if (r2 != 0) goto L2a
            java.lang.Class<l9.h0> r3 = p204l9.C4212h0.class
            monitor-enter(r3)
            m9.y0<l9.h0> r2 = p204l9.C4212h0.PARSER     // Catch: java.lang.Throwable -> L24
            if (r2 != 0) goto L26
            m9.x$b r2 = new m9.x$b     // Catch: java.lang.Throwable -> L24
            l9.h0 r4 = p204l9.C4212h0.DEFAULT_INSTANCE     // Catch: java.lang.Throwable -> L24
            r2.<init>(r4)     // Catch: java.lang.Throwable -> L24
            p204l9.C4212h0.PARSER = r2     // Catch: java.lang.Throwable -> L24
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
            l9.h0 r2 = p204l9.C4212h0.DEFAULT_INSTANCE
            return r2
        L2e:
            l9.h0$b r2 = new l9.h0$b
            r2.<init>(r4)
            return r2
        L34:
            l9.h0 r2 = new l9.h0
            r2.<init>()
            return r2
        L3a:
            r2 = 3
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r4 = 0
            java.lang.String r0 = "configName_"
            r2[r4] = r0
            java.lang.String r4 = "entry_"
            r2[r3] = r4
            r3 = 2
            java.lang.Class<l9.z> r4 = p204l9.C4232z.class
            r2[r3] = r4
            java.lang.String r3 = "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u0208\u0002\u001b"
            l9.h0 r4 = p204l9.C4212h0.DEFAULT_INSTANCE
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
