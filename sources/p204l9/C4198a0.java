package p204l9;

/* renamed from: l9.a0 */
/* loaded from: classes.dex */
public final class C4198a0 extends p221m9.AbstractC4501x<p204l9.C4198a0, p204l9.C4198a0.b> implements p221m9.InterfaceC4485r0 {
    private static final p204l9.C4198a0 DEFAULT_INSTANCE = null;
    public static final int KEY_FIELD_NUMBER = 2;
    private static volatile p221m9.InterfaceC4504y0<p204l9.C4198a0> PARSER = null;
    public static final int PRIMARY_KEY_ID_FIELD_NUMBER = 1;
    private p221m9.C4505z.c<p204l9.C4198a0.c> key_;
    private int primaryKeyId_;

    /* renamed from: l9.a0$a */
    public static /* synthetic */ class a {
    }

    /* renamed from: l9.a0$b */
    public static final class b extends p221m9.AbstractC4501x.a<p204l9.C4198a0, p204l9.C4198a0.b> implements p221m9.InterfaceC4485r0 {
        public b() {
                r1 = this;
                l9.a0 r0 = p204l9.C4198a0.m9343w()
                r1.<init>(r0)
                return
        }

        public b(p204l9.C4198a0.a r1) {
                r0 = this;
                l9.a0 r1 = p204l9.C4198a0.m9343w()
                r0.<init>(r1)
                return
        }
    }

    /* renamed from: l9.a0$c */
    public static final class c extends p221m9.AbstractC4501x<p204l9.C4198a0.c, p204l9.C4198a0.c.a> implements p221m9.InterfaceC4485r0 {
        private static final p204l9.C4198a0.c DEFAULT_INSTANCE = null;
        public static final int KEY_DATA_FIELD_NUMBER = 1;
        public static final int KEY_ID_FIELD_NUMBER = 3;
        public static final int OUTPUT_PREFIX_TYPE_FIELD_NUMBER = 4;
        private static volatile p221m9.InterfaceC4504y0<p204l9.C4198a0.c> PARSER = null;
        public static final int STATUS_FIELD_NUMBER = 2;
        private p204l9.C4229w keyData_;
        private int keyId_;
        private int outputPrefixType_;
        private int status_;

        /* renamed from: l9.a0$c$a */
        public static final class a extends p221m9.AbstractC4501x.a<p204l9.C4198a0.c, p204l9.C4198a0.c.a> implements p221m9.InterfaceC4485r0 {
            public a() {
                    r1 = this;
                    l9.a0$c r0 = p204l9.C4198a0.c.m9352w()
                    r1.<init>(r0)
                    return
            }

            public a(p204l9.C4198a0.a r1) {
                    r0 = this;
                    l9.a0$c r1 = p204l9.C4198a0.c.m9352w()
                    r0.<init>(r1)
                    return
            }
        }

        static {
                l9.a0$c r0 = new l9.a0$c
                r0.<init>()
                p204l9.C4198a0.c.DEFAULT_INSTANCE = r0
                java.lang.Class<l9.a0$c> r1 = p204l9.C4198a0.c.class
                p221m9.AbstractC4501x.m10372v(r1, r0)
                return
        }

        public c() {
                r0 = this;
                r0.<init>()
                return
        }

        /* renamed from: A */
        public static void m9350A(p204l9.C4198a0.c r0, int r1) {
                r0.keyId_ = r1
                return
        }

        /* renamed from: G */
        public static p204l9.C4198a0.c.a m9351G() {
                l9.a0$c r0 = p204l9.C4198a0.c.DEFAULT_INSTANCE
                m9.x$a r0 = r0.m10373n()
                l9.a0$c$a r0 = (p204l9.C4198a0.c.a) r0
                return r0
        }

        /* renamed from: w */
        public static /* synthetic */ p204l9.C4198a0.c m9352w() {
                l9.a0$c r0 = p204l9.C4198a0.c.DEFAULT_INSTANCE
                return r0
        }

        /* renamed from: x */
        public static void m9353x(p204l9.C4198a0.c r0, p204l9.C4229w r1) {
                java.util.Objects.requireNonNull(r0)
                java.util.Objects.requireNonNull(r1)
                r0.keyData_ = r1
                return
        }

        /* renamed from: y */
        public static void m9354y(p204l9.C4198a0.c r0, p204l9.EnumC4210g0 r1) {
                java.util.Objects.requireNonNull(r0)
                int r1 = r1.mo9432d()
                r0.outputPrefixType_ = r1
                return
        }

        /* renamed from: z */
        public static void m9355z(p204l9.C4198a0.c r0, p204l9.EnumC4230x r1) {
                java.util.Objects.requireNonNull(r0)
                int r1 = r1.mo9432d()
                r0.status_ = r1
                return
        }

        /* renamed from: B */
        public p204l9.C4229w m9356B() {
                r1 = this;
                l9.w r0 = r1.keyData_
                if (r0 != 0) goto L8
                l9.w r0 = p204l9.C4229w.m9521A()
            L8:
                return r0
        }

        /* renamed from: C */
        public int m9357C() {
                r1 = this;
                int r0 = r1.keyId_
                return r0
        }

        /* renamed from: D */
        public p204l9.EnumC4210g0 m9358D() {
                r1 = this;
                int r0 = r1.outputPrefixType_
                l9.g0 r0 = p204l9.EnumC4210g0.m9431e(r0)
                if (r0 != 0) goto La
                l9.g0 r0 = p204l9.EnumC4210g0.f17366e0
            La:
                return r0
        }

        /* renamed from: E */
        public p204l9.EnumC4230x m9359E() {
                r1 = this;
                int r0 = r1.status_
                l9.x r0 = p204l9.EnumC4230x.m9531e(r0)
                if (r0 != 0) goto La
                l9.x r0 = p204l9.EnumC4230x.f17389d0
            La:
                return r0
        }

        /* renamed from: F */
        public boolean m9360F() {
                r1 = this;
                l9.w r0 = r1.keyData_
                if (r0 == 0) goto L6
                r0 = 1
                goto L7
            L6:
                r0 = 0
            L7:
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
                m9.y0<l9.a0$c> r2 = p204l9.C4198a0.c.PARSER
                if (r2 != 0) goto L2a
                java.lang.Class<l9.a0$c> r3 = p204l9.C4198a0.c.class
                monitor-enter(r3)
                m9.y0<l9.a0$c> r2 = p204l9.C4198a0.c.PARSER     // Catch: java.lang.Throwable -> L24
                if (r2 != 0) goto L26
                m9.x$b r2 = new m9.x$b     // Catch: java.lang.Throwable -> L24
                l9.a0$c r4 = p204l9.C4198a0.c.DEFAULT_INSTANCE     // Catch: java.lang.Throwable -> L24
                r2.<init>(r4)     // Catch: java.lang.Throwable -> L24
                p204l9.C4198a0.c.PARSER = r2     // Catch: java.lang.Throwable -> L24
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
                l9.a0$c r2 = p204l9.C4198a0.c.DEFAULT_INSTANCE
                return r2
            L2e:
                l9.a0$c$a r2 = new l9.a0$c$a
                r2.<init>(r4)
                return r2
            L34:
                l9.a0$c r2 = new l9.a0$c
                r2.<init>()
                return r2
            L3a:
                r2 = 4
                java.lang.Object[] r2 = new java.lang.Object[r2]
                r4 = 0
                java.lang.String r0 = "keyData_"
                r2[r4] = r0
                java.lang.String r4 = "status_"
                r2[r3] = r4
                r3 = 2
                java.lang.String r4 = "keyId_"
                r2[r3] = r4
                r3 = 3
                java.lang.String r4 = "outputPrefixType_"
                r2[r3] = r4
                java.lang.String r3 = "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\t\u0002\f\u0003\u000b\u0004\f"
                l9.a0$c r4 = p204l9.C4198a0.c.DEFAULT_INSTANCE
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
            l9.a0 r0 = new l9.a0
            r0.<init>()
            p204l9.C4198a0.DEFAULT_INSTANCE = r0
            java.lang.Class<l9.a0> r1 = p204l9.C4198a0.class
            p221m9.AbstractC4501x.m10372v(r1, r0)
            return
    }

    public C4198a0() {
            r1 = this;
            r1.<init>()
            m9.b1<java.lang.Object> r0 = p221m9.C4438b1.f18108b0
            r1.key_ = r0
            return
    }

    /* renamed from: D */
    public static p204l9.C4198a0.b m9341D() {
            l9.a0 r0 = p204l9.C4198a0.DEFAULT_INSTANCE
            m9.x$a r0 = r0.m10373n()
            l9.a0$b r0 = (p204l9.C4198a0.b) r0
            return r0
    }

    /* renamed from: E */
    public static p204l9.C4198a0 m9342E(byte[] r1, p221m9.C4478p r2) {
            l9.a0 r0 = p204l9.C4198a0.DEFAULT_INSTANCE
            m9.x r1 = p221m9.AbstractC4501x.m10370t(r0, r1, r2)
            l9.a0 r1 = (p204l9.C4198a0) r1
            return r1
    }

    /* renamed from: w */
    public static /* synthetic */ p204l9.C4198a0 m9343w() {
            l9.a0 r0 = p204l9.C4198a0.DEFAULT_INSTANCE
            return r0
    }

    /* renamed from: x */
    public static void m9344x(p204l9.C4198a0 r0, int r1) {
            r0.primaryKeyId_ = r1
            return
    }

    /* renamed from: y */
    public static void m9345y(p204l9.C4198a0 r2, p204l9.C4198a0.c r3) {
            java.util.Objects.requireNonNull(r2)
            java.util.Objects.requireNonNull(r3)
            m9.z$c<l9.a0$c> r0 = r2.key_
            boolean r0 = r0.mo9908U()
            if (r0 != 0) goto L21
            m9.z$c<l9.a0$c> r0 = r2.key_
            int r1 = r0.size()
            if (r1 != 0) goto L19
            r1 = 10
            goto L1b
        L19:
            int r1 = r1 * 2
        L1b:
            m9.z$c r0 = r0.mo9905B(r1)
            r2.key_ = r0
        L21:
            m9.z$c<l9.a0$c> r2 = r2.key_
            r2.add(r3)
            return
    }

    /* renamed from: A */
    public int m9346A() {
            r1 = this;
            m9.z$c<l9.a0$c> r0 = r1.key_
            int r0 = r0.size()
            return r0
    }

    /* renamed from: B */
    public java.util.List<p204l9.C4198a0.c> m9347B() {
            r1 = this;
            m9.z$c<l9.a0$c> r0 = r1.key_
            return r0
    }

    /* renamed from: C */
    public int m9348C() {
            r1 = this;
            int r0 = r1.primaryKeyId_
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
            m9.y0<l9.a0> r2 = p204l9.C4198a0.PARSER
            if (r2 != 0) goto L2a
            java.lang.Class<l9.a0> r3 = p204l9.C4198a0.class
            monitor-enter(r3)
            m9.y0<l9.a0> r2 = p204l9.C4198a0.PARSER     // Catch: java.lang.Throwable -> L24
            if (r2 != 0) goto L26
            m9.x$b r2 = new m9.x$b     // Catch: java.lang.Throwable -> L24
            l9.a0 r4 = p204l9.C4198a0.DEFAULT_INSTANCE     // Catch: java.lang.Throwable -> L24
            r2.<init>(r4)     // Catch: java.lang.Throwable -> L24
            p204l9.C4198a0.PARSER = r2     // Catch: java.lang.Throwable -> L24
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
            l9.a0 r2 = p204l9.C4198a0.DEFAULT_INSTANCE
            return r2
        L2e:
            l9.a0$b r2 = new l9.a0$b
            r2.<init>(r4)
            return r2
        L34:
            l9.a0 r2 = new l9.a0
            r2.<init>()
            return r2
        L3a:
            r2 = 3
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r4 = 0
            java.lang.String r0 = "primaryKeyId_"
            r2[r4] = r0
            java.lang.String r4 = "key_"
            r2[r3] = r4
            r3 = 2
            java.lang.Class<l9.a0$c> r4 = p204l9.C4198a0.c.class
            r2[r3] = r4
            java.lang.String r3 = "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u000b\u0002\u001b"
            l9.a0 r4 = p204l9.C4198a0.DEFAULT_INSTANCE
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
    public p204l9.C4198a0.c m9349z(int r2) {
            r1 = this;
            m9.z$c<l9.a0$c> r0 = r1.key_
            java.lang.Object r2 = r0.get(r2)
            l9.a0$c r2 = (p204l9.C4198a0.c) r2
            return r2
    }
}
