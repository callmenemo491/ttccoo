package p204l9;

/* renamed from: l9.r */
/* loaded from: classes.dex */
public final class C4224r extends p221m9.AbstractC4501x<p204l9.C4224r, p204l9.C4224r.b> implements p221m9.InterfaceC4485r0 {
    private static final p204l9.C4224r DEFAULT_INSTANCE = null;
    public static final int ENCRYPTED_KEYSET_FIELD_NUMBER = 2;
    public static final int KEYSET_INFO_FIELD_NUMBER = 3;
    private static volatile p221m9.InterfaceC4504y0<p204l9.C4224r> PARSER;
    private p221m9.AbstractC4454h encryptedKeyset_;
    private p204l9.C4200b0 keysetInfo_;

    /* renamed from: l9.r$a */
    public static /* synthetic */ class a {
    }

    /* renamed from: l9.r$b */
    public static final class b extends p221m9.AbstractC4501x.a<p204l9.C4224r, p204l9.C4224r.b> implements p221m9.InterfaceC4485r0 {
        public b() {
                r1 = this;
                l9.r r0 = p204l9.C4224r.m9497w()
                r1.<init>(r0)
                return
        }

        public b(p204l9.C4224r.a r1) {
                r0 = this;
                l9.r r1 = p204l9.C4224r.m9497w()
                r0.<init>(r1)
                return
        }
    }

    static {
            l9.r r0 = new l9.r
            r0.<init>()
            p204l9.C4224r.DEFAULT_INSTANCE = r0
            java.lang.Class<l9.r> r1 = p204l9.C4224r.class
            p221m9.AbstractC4501x.m10372v(r1, r0)
            return
    }

    public C4224r() {
            r1 = this;
            r1.<init>()
            m9.h r0 = p221m9.AbstractC4454h.f18139Z
            r1.encryptedKeyset_ = r0
            return
    }

    /* renamed from: A */
    public static p204l9.C4224r.b m9495A() {
            l9.r r0 = p204l9.C4224r.DEFAULT_INSTANCE
            m9.x$a r0 = r0.m10373n()
            l9.r$b r0 = (p204l9.C4224r.b) r0
            return r0
    }

    /* renamed from: B */
    public static p204l9.C4224r m9496B(byte[] r1, p221m9.C4478p r2) {
            l9.r r0 = p204l9.C4224r.DEFAULT_INSTANCE
            m9.x r1 = p221m9.AbstractC4501x.m10370t(r0, r1, r2)
            l9.r r1 = (p204l9.C4224r) r1
            return r1
    }

    /* renamed from: w */
    public static /* synthetic */ p204l9.C4224r m9497w() {
            l9.r r0 = p204l9.C4224r.DEFAULT_INSTANCE
            return r0
    }

    /* renamed from: x */
    public static void m9498x(p204l9.C4224r r0, p221m9.AbstractC4454h r1) {
            java.util.Objects.requireNonNull(r0)
            java.util.Objects.requireNonNull(r1)
            r0.encryptedKeyset_ = r1
            return
    }

    /* renamed from: y */
    public static void m9499y(p204l9.C4224r r0, p204l9.C4200b0 r1) {
            java.util.Objects.requireNonNull(r0)
            java.util.Objects.requireNonNull(r1)
            r0.keysetInfo_ = r1
            return
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
            m9.y0<l9.r> r2 = p204l9.C4224r.PARSER
            if (r2 != 0) goto L2a
            java.lang.Class<l9.r> r3 = p204l9.C4224r.class
            monitor-enter(r3)
            m9.y0<l9.r> r2 = p204l9.C4224r.PARSER     // Catch: java.lang.Throwable -> L24
            if (r2 != 0) goto L26
            m9.x$b r2 = new m9.x$b     // Catch: java.lang.Throwable -> L24
            l9.r r4 = p204l9.C4224r.DEFAULT_INSTANCE     // Catch: java.lang.Throwable -> L24
            r2.<init>(r4)     // Catch: java.lang.Throwable -> L24
            p204l9.C4224r.PARSER = r2     // Catch: java.lang.Throwable -> L24
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
            l9.r r2 = p204l9.C4224r.DEFAULT_INSTANCE
            return r2
        L2e:
            l9.r$b r2 = new l9.r$b
            r2.<init>(r4)
            return r2
        L34:
            l9.r r2 = new l9.r
            r2.<init>()
            return r2
        L3a:
            r2 = 2
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r4 = 0
            java.lang.String r0 = "encryptedKeyset_"
            r2[r4] = r0
            java.lang.String r4 = "keysetInfo_"
            r2[r3] = r4
            java.lang.String r3 = "\u0000\u0002\u0000\u0000\u0002\u0003\u0002\u0000\u0000\u0000\u0002\n\u0003\t"
            l9.r r4 = p204l9.C4224r.DEFAULT_INSTANCE
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
    public p221m9.AbstractC4454h m9500z() {
            r1 = this;
            m9.h r0 = r1.encryptedKeyset_
            return r0
    }
}
