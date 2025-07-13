package p204l9;

@java.lang.Deprecated
/* renamed from: l9.z */
/* loaded from: classes.dex */
public final class C4232z extends p221m9.AbstractC4501x<p204l9.C4232z, p204l9.C4232z.b> implements p221m9.InterfaceC4485r0 {
    public static final int CATALOGUE_NAME_FIELD_NUMBER = 5;
    private static final p204l9.C4232z DEFAULT_INSTANCE = null;
    public static final int KEY_MANAGER_VERSION_FIELD_NUMBER = 3;
    public static final int NEW_KEY_ALLOWED_FIELD_NUMBER = 4;
    private static volatile p221m9.InterfaceC4504y0<p204l9.C4232z> PARSER = null;
    public static final int PRIMITIVE_NAME_FIELD_NUMBER = 1;
    public static final int TYPE_URL_FIELD_NUMBER = 2;
    private java.lang.String catalogueName_;
    private int keyManagerVersion_;
    private boolean newKeyAllowed_;
    private java.lang.String primitiveName_;
    private java.lang.String typeUrl_;

    /* renamed from: l9.z$a */
    public static /* synthetic */ class a {
    }

    /* renamed from: l9.z$b */
    public static final class b extends p221m9.AbstractC4501x.a<p204l9.C4232z, p204l9.C4232z.b> implements p221m9.InterfaceC4485r0 {
        public b(p204l9.C4232z.a r1) {
                r0 = this;
                l9.z r1 = p204l9.C4232z.m9541w()
                r0.<init>(r1)
                return
        }
    }

    static {
            l9.z r0 = new l9.z
            r0.<init>()
            p204l9.C4232z.DEFAULT_INSTANCE = r0
            java.lang.Class<l9.z> r1 = p204l9.C4232z.class
            p221m9.AbstractC4501x.m10372v(r1, r0)
            return
    }

    public C4232z() {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = ""
            r1.primitiveName_ = r0
            r1.typeUrl_ = r0
            r1.catalogueName_ = r0
            return
    }

    /* renamed from: w */
    public static /* synthetic */ p204l9.C4232z m9541w() {
            l9.z r0 = p204l9.C4232z.DEFAULT_INSTANCE
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
                case 0: goto L60;
                case 1: goto L5f;
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
            m9.y0<l9.z> r2 = p204l9.C4232z.PARSER
            if (r2 != 0) goto L2a
            java.lang.Class<l9.z> r3 = p204l9.C4232z.class
            monitor-enter(r3)
            m9.y0<l9.z> r2 = p204l9.C4232z.PARSER     // Catch: java.lang.Throwable -> L24
            if (r2 != 0) goto L26
            m9.x$b r2 = new m9.x$b     // Catch: java.lang.Throwable -> L24
            l9.z r4 = p204l9.C4232z.DEFAULT_INSTANCE     // Catch: java.lang.Throwable -> L24
            r2.<init>(r4)     // Catch: java.lang.Throwable -> L24
            p204l9.C4232z.PARSER = r2     // Catch: java.lang.Throwable -> L24
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
            l9.z r2 = p204l9.C4232z.DEFAULT_INSTANCE
            return r2
        L2e:
            l9.z$b r2 = new l9.z$b
            r2.<init>(r4)
            return r2
        L34:
            l9.z r2 = new l9.z
            r2.<init>()
            return r2
        L3a:
            r2 = 5
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r4 = 0
            java.lang.String r0 = "primitiveName_"
            r2[r4] = r0
            java.lang.String r4 = "typeUrl_"
            r2[r3] = r4
            r3 = 2
            java.lang.String r4 = "keyManagerVersion_"
            r2[r3] = r4
            r3 = 3
            java.lang.String r4 = "newKeyAllowed_"
            r2[r3] = r4
            r3 = 4
            java.lang.String r4 = "catalogueName_"
            r2[r3] = r4
            java.lang.String r3 = "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001\u0208\u0002\u0208\u0003\u000b\u0004\u0007\u0005\u0208"
            l9.z r4 = p204l9.C4232z.DEFAULT_INSTANCE
            m9.c1 r0 = new m9.c1
            r0.<init>(r4, r3, r2)
            return r0
        L5f:
            return r4
        L60:
            java.lang.Byte r2 = java.lang.Byte.valueOf(r3)
            return r2
    }
}
