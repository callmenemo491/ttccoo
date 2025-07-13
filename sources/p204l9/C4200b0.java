package p204l9;

/* renamed from: l9.b0 */
/* loaded from: classes.dex */
public final class C4200b0 extends p221m9.AbstractC4501x<p204l9.C4200b0, p204l9.C4200b0.b> implements p221m9.InterfaceC4485r0 {
    private static final p204l9.C4200b0 DEFAULT_INSTANCE = null;
    public static final int KEY_INFO_FIELD_NUMBER = 2;
    private static volatile p221m9.InterfaceC4504y0<p204l9.C4200b0> PARSER = null;
    public static final int PRIMARY_KEY_ID_FIELD_NUMBER = 1;
    private p221m9.C4505z.c<p204l9.C4200b0.c> keyInfo_;
    private int primaryKeyId_;

    /* renamed from: l9.b0$a */
    public static /* synthetic */ class a {
    }

    /* renamed from: l9.b0$b */
    public static final class b extends p221m9.AbstractC4501x.a<p204l9.C4200b0, p204l9.C4200b0.b> implements p221m9.InterfaceC4485r0 {
        public b() {
                r1 = this;
                l9.b0 r0 = p204l9.C4200b0.m9366w()
                r1.<init>(r0)
                return
        }

        public b(p204l9.C4200b0.a r1) {
                r0 = this;
                l9.b0 r1 = p204l9.C4200b0.m9366w()
                r0.<init>(r1)
                return
        }
    }

    /* renamed from: l9.b0$c */
    public static final class c extends p221m9.AbstractC4501x<p204l9.C4200b0.c, p204l9.C4200b0.c.a> implements p221m9.InterfaceC4485r0 {
        private static final p204l9.C4200b0.c DEFAULT_INSTANCE = null;
        public static final int KEY_ID_FIELD_NUMBER = 3;
        public static final int OUTPUT_PREFIX_TYPE_FIELD_NUMBER = 4;
        private static volatile p221m9.InterfaceC4504y0<p204l9.C4200b0.c> PARSER = null;
        public static final int STATUS_FIELD_NUMBER = 2;
        public static final int TYPE_URL_FIELD_NUMBER = 1;
        private int keyId_;
        private int outputPrefixType_;
        private int status_;
        private java.lang.String typeUrl_;

        /* renamed from: l9.b0$c$a */
        public static final class a extends p221m9.AbstractC4501x.a<p204l9.C4200b0.c, p204l9.C4200b0.c.a> implements p221m9.InterfaceC4485r0 {
            public a() {
                    r1 = this;
                    l9.b0$c r0 = p204l9.C4200b0.c.m9372w()
                    r1.<init>(r0)
                    return
            }

            public a(p204l9.C4200b0.a r1) {
                    r0 = this;
                    l9.b0$c r1 = p204l9.C4200b0.c.m9372w()
                    r0.<init>(r1)
                    return
            }
        }

        static {
                l9.b0$c r0 = new l9.b0$c
                r0.<init>()
                p204l9.C4200b0.c.DEFAULT_INSTANCE = r0
                java.lang.Class<l9.b0$c> r1 = p204l9.C4200b0.c.class
                p221m9.AbstractC4501x.m10372v(r1, r0)
                return
        }

        public c() {
                r1 = this;
                r1.<init>()
                java.lang.String r0 = ""
                r1.typeUrl_ = r0
                return
        }

        /* renamed from: A */
        public static void m9370A(p204l9.C4200b0.c r0, int r1) {
                r0.keyId_ = r1
                return
        }

        /* renamed from: C */
        public static p204l9.C4200b0.c.a m9371C() {
                l9.b0$c r0 = p204l9.C4200b0.c.DEFAULT_INSTANCE
                m9.x$a r0 = r0.m10373n()
                l9.b0$c$a r0 = (p204l9.C4200b0.c.a) r0
                return r0
        }

        /* renamed from: w */
        public static /* synthetic */ p204l9.C4200b0.c m9372w() {
                l9.b0$c r0 = p204l9.C4200b0.c.DEFAULT_INSTANCE
                return r0
        }

        /* renamed from: x */
        public static void m9373x(p204l9.C4200b0.c r0, java.lang.String r1) {
                java.util.Objects.requireNonNull(r0)
                java.util.Objects.requireNonNull(r1)
                r0.typeUrl_ = r1
                return
        }

        /* renamed from: y */
        public static void m9374y(p204l9.C4200b0.c r0, p204l9.EnumC4210g0 r1) {
                java.util.Objects.requireNonNull(r0)
                int r1 = r1.mo9432d()
                r0.outputPrefixType_ = r1
                return
        }

        /* renamed from: z */
        public static void m9375z(p204l9.C4200b0.c r0, p204l9.EnumC4230x r1) {
                java.util.Objects.requireNonNull(r0)
                int r1 = r1.mo9432d()
                r0.status_ = r1
                return
        }

        /* renamed from: B */
        public int m9376B() {
                r1 = this;
                int r0 = r1.keyId_
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
                    case 0: goto L5b;
                    case 1: goto L5a;
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
                m9.y0<l9.b0$c> r2 = p204l9.C4200b0.c.PARSER
                if (r2 != 0) goto L2a
                java.lang.Class<l9.b0$c> r3 = p204l9.C4200b0.c.class
                monitor-enter(r3)
                m9.y0<l9.b0$c> r2 = p204l9.C4200b0.c.PARSER     // Catch: java.lang.Throwable -> L24
                if (r2 != 0) goto L26
                m9.x$b r2 = new m9.x$b     // Catch: java.lang.Throwable -> L24
                l9.b0$c r4 = p204l9.C4200b0.c.DEFAULT_INSTANCE     // Catch: java.lang.Throwable -> L24
                r2.<init>(r4)     // Catch: java.lang.Throwable -> L24
                p204l9.C4200b0.c.PARSER = r2     // Catch: java.lang.Throwable -> L24
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
                l9.b0$c r2 = p204l9.C4200b0.c.DEFAULT_INSTANCE
                return r2
            L2e:
                l9.b0$c$a r2 = new l9.b0$c$a
                r2.<init>(r4)
                return r2
            L34:
                l9.b0$c r2 = new l9.b0$c
                r2.<init>()
                return r2
            L3a:
                r2 = 4
                java.lang.Object[] r2 = new java.lang.Object[r2]
                r4 = 0
                java.lang.String r0 = "typeUrl_"
                r2[r4] = r0
                java.lang.String r4 = "status_"
                r2[r3] = r4
                r3 = 2
                java.lang.String r4 = "keyId_"
                r2[r3] = r4
                r3 = 3
                java.lang.String r4 = "outputPrefixType_"
                r2[r3] = r4
                java.lang.String r3 = "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u0208\u0002\f\u0003\u000b\u0004\f"
                l9.b0$c r4 = p204l9.C4200b0.c.DEFAULT_INSTANCE
                m9.c1 r0 = new m9.c1
                r0.<init>(r4, r3, r2)
                return r0
            L5a:
                return r4
            L5b:
                java.lang.Byte r2 = java.lang.Byte.valueOf(r3)
                return r2
        }
    }

    static {
            l9.b0 r0 = new l9.b0
            r0.<init>()
            p204l9.C4200b0.DEFAULT_INSTANCE = r0
            java.lang.Class<l9.b0> r1 = p204l9.C4200b0.class
            p221m9.AbstractC4501x.m10372v(r1, r0)
            return
    }

    public C4200b0() {
            r1 = this;
            r1.<init>()
            m9.b1<java.lang.Object> r0 = p221m9.C4438b1.f18108b0
            r1.keyInfo_ = r0
            return
    }

    /* renamed from: A */
    public static p204l9.C4200b0.b m9365A() {
            l9.b0 r0 = p204l9.C4200b0.DEFAULT_INSTANCE
            m9.x$a r0 = r0.m10373n()
            l9.b0$b r0 = (p204l9.C4200b0.b) r0
            return r0
    }

    /* renamed from: w */
    public static /* synthetic */ p204l9.C4200b0 m9366w() {
            l9.b0 r0 = p204l9.C4200b0.DEFAULT_INSTANCE
            return r0
    }

    /* renamed from: x */
    public static void m9367x(p204l9.C4200b0 r0, int r1) {
            r0.primaryKeyId_ = r1
            return
    }

    /* renamed from: y */
    public static void m9368y(p204l9.C4200b0 r2, p204l9.C4200b0.c r3) {
            java.util.Objects.requireNonNull(r2)
            java.util.Objects.requireNonNull(r3)
            m9.z$c<l9.b0$c> r0 = r2.keyInfo_
            boolean r0 = r0.mo9908U()
            if (r0 != 0) goto L21
            m9.z$c<l9.b0$c> r0 = r2.keyInfo_
            int r1 = r0.size()
            if (r1 != 0) goto L19
            r1 = 10
            goto L1b
        L19:
            int r1 = r1 * 2
        L1b:
            m9.z$c r0 = r0.mo9905B(r1)
            r2.keyInfo_ = r0
        L21:
            m9.z$c<l9.b0$c> r2 = r2.keyInfo_
            r2.add(r3)
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
            m9.y0<l9.b0> r2 = p204l9.C4200b0.PARSER
            if (r2 != 0) goto L2a
            java.lang.Class<l9.b0> r3 = p204l9.C4200b0.class
            monitor-enter(r3)
            m9.y0<l9.b0> r2 = p204l9.C4200b0.PARSER     // Catch: java.lang.Throwable -> L24
            if (r2 != 0) goto L26
            m9.x$b r2 = new m9.x$b     // Catch: java.lang.Throwable -> L24
            l9.b0 r4 = p204l9.C4200b0.DEFAULT_INSTANCE     // Catch: java.lang.Throwable -> L24
            r2.<init>(r4)     // Catch: java.lang.Throwable -> L24
            p204l9.C4200b0.PARSER = r2     // Catch: java.lang.Throwable -> L24
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
            l9.b0 r2 = p204l9.C4200b0.DEFAULT_INSTANCE
            return r2
        L2e:
            l9.b0$b r2 = new l9.b0$b
            r2.<init>(r4)
            return r2
        L34:
            l9.b0 r2 = new l9.b0
            r2.<init>()
            return r2
        L3a:
            r2 = 3
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r4 = 0
            java.lang.String r0 = "primaryKeyId_"
            r2[r4] = r0
            java.lang.String r4 = "keyInfo_"
            r2[r3] = r4
            r3 = 2
            java.lang.Class<l9.b0$c> r4 = p204l9.C4200b0.c.class
            r2[r3] = r4
            java.lang.String r3 = "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u000b\u0002\u001b"
            l9.b0 r4 = p204l9.C4200b0.DEFAULT_INSTANCE
            m9.c1 r0 = new m9.c1
            r0.<init>(r4, r3, r2)
            return r0
        L55:
            return r4
        L56:
            java.lang.Byte r2 = java.lang.Byte.valueOf(r3)
            return r2
    }

    /* renamed from: z */
    public p204l9.C4200b0.c m9369z(int r2) {
            r1 = this;
            m9.z$c<l9.b0$c> r0 = r1.keyInfo_
            java.lang.Object r2 = r0.get(r2)
            l9.b0$c r2 = (p204l9.C4200b0.c) r2
            return r2
    }
}
