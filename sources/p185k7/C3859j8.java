package p185k7;

/* renamed from: k7.j8 */
/* loaded from: classes.dex */
public final class C3859j8 {

    /* renamed from: a */
    public static final sun.misc.Unsafe f16706a = null;

    /* renamed from: b */
    public static final java.lang.Class<?> f16707b = null;

    /* renamed from: c */
    public static final p072e7.AbstractC1641i8 f16708c = null;

    /* renamed from: d */
    public static final boolean f16709d = false;

    /* renamed from: e */
    public static final boolean f16710e = false;

    /* renamed from: f */
    public static final long f16711f = 0;

    /* renamed from: g */
    public static final boolean f16712g = false;

    static {
            java.lang.Class<java.lang.Object[]> r0 = java.lang.Object[].class
            java.lang.Class<double[]> r1 = double[].class
            java.lang.Class<float[]> r2 = float[].class
            java.lang.Class<long[]> r3 = long[].class
            java.lang.Class<int[]> r4 = int[].class
            java.lang.Class<boolean[]> r5 = boolean[].class
            java.lang.Class<java.lang.Object> r6 = java.lang.Object.class
            sun.misc.Unsafe r7 = m8737k()
            p185k7.C3859j8.f16706a = r7
            java.lang.Class r8 = p185k7.C3744b5.m8225a()
            p185k7.C3859j8.f16707b = r8
            java.lang.Class r8 = java.lang.Long.TYPE
            boolean r9 = m8743q(r8)
            java.lang.Class r10 = java.lang.Integer.TYPE
            boolean r10 = m8743q(r10)
            if (r7 != 0) goto L29
            goto L39
        L29:
            if (r9 == 0) goto L31
            k7.i8 r9 = new k7.i8
            r9.<init>(r7)
            goto L3a
        L31:
            if (r10 == 0) goto L39
            k7.h8 r9 = new k7.h8
            r9.<init>(r7)
            goto L3a
        L39:
            r9 = 0
        L3a:
            p185k7.C3859j8.f16708c = r9
            java.lang.String r7 = "getLong"
            java.lang.String r10 = "objectFieldOffset"
            r11 = 2
            r12 = 1
            r13 = 0
            if (r9 != 0) goto L46
            goto L6e
        L46:
            sun.misc.Unsafe r9 = r9.f7654b
            if (r9 != 0) goto L4b
            goto L6e
        L4b:
            java.lang.Class r9 = r9.getClass()     // Catch: java.lang.Throwable -> L6a
            java.lang.Class[] r14 = new java.lang.Class[r12]     // Catch: java.lang.Throwable -> L6a
            java.lang.Class<java.lang.reflect.Field> r15 = java.lang.reflect.Field.class
            r14[r13] = r15     // Catch: java.lang.Throwable -> L6a
            r9.getMethod(r10, r14)     // Catch: java.lang.Throwable -> L6a
            java.lang.Class[] r14 = new java.lang.Class[r11]     // Catch: java.lang.Throwable -> L6a
            r14[r13] = r6     // Catch: java.lang.Throwable -> L6a
            r14[r12] = r8     // Catch: java.lang.Throwable -> L6a
            r9.getMethod(r7, r14)     // Catch: java.lang.Throwable -> L6a
            java.lang.reflect.Field r8 = m8728b()     // Catch: java.lang.Throwable -> L6a
            if (r8 != 0) goto L68
            goto L6e
        L68:
            r8 = 1
            goto L6f
        L6a:
            r8 = move-exception
            m8738l(r8)
        L6e:
            r8 = 0
        L6f:
            p185k7.C3859j8.f16709d = r8
            e7.i8 r8 = p185k7.C3859j8.f16708c
            if (r8 != 0) goto L77
            goto Lf0
        L77:
            sun.misc.Unsafe r8 = r8.f7654b
            if (r8 != 0) goto L7c
            goto Lf0
        L7c:
            java.lang.Class r8 = r8.getClass()     // Catch: java.lang.Throwable -> Lec
            java.lang.Class[] r9 = new java.lang.Class[r12]     // Catch: java.lang.Throwable -> Lec
            java.lang.Class<java.lang.reflect.Field> r14 = java.lang.reflect.Field.class
            r9[r13] = r14     // Catch: java.lang.Throwable -> Lec
            r8.getMethod(r10, r9)     // Catch: java.lang.Throwable -> Lec
            java.lang.Class[] r9 = new java.lang.Class[r12]     // Catch: java.lang.Throwable -> Lec
            java.lang.Class<java.lang.Class> r10 = java.lang.Class.class
            r9[r13] = r10     // Catch: java.lang.Throwable -> Lec
            java.lang.String r10 = "arrayBaseOffset"
            r8.getMethod(r10, r9)     // Catch: java.lang.Throwable -> Lec
            java.lang.Class[] r9 = new java.lang.Class[r12]     // Catch: java.lang.Throwable -> Lec
            java.lang.Class<java.lang.Class> r10 = java.lang.Class.class
            r9[r13] = r10     // Catch: java.lang.Throwable -> Lec
            java.lang.String r10 = "arrayIndexScale"
            r8.getMethod(r10, r9)     // Catch: java.lang.Throwable -> Lec
            java.lang.Class[] r9 = new java.lang.Class[r11]     // Catch: java.lang.Throwable -> Lec
            r9[r13] = r6     // Catch: java.lang.Throwable -> Lec
            java.lang.Class r10 = java.lang.Long.TYPE     // Catch: java.lang.Throwable -> Lec
            r9[r12] = r10     // Catch: java.lang.Throwable -> Lec
            java.lang.String r14 = "getInt"
            r8.getMethod(r14, r9)     // Catch: java.lang.Throwable -> Lec
            r9 = 3
            java.lang.Class[] r14 = new java.lang.Class[r9]     // Catch: java.lang.Throwable -> Lec
            r14[r13] = r6     // Catch: java.lang.Throwable -> Lec
            r14[r12] = r10     // Catch: java.lang.Throwable -> Lec
            java.lang.Class r15 = java.lang.Integer.TYPE     // Catch: java.lang.Throwable -> Lec
            r14[r11] = r15     // Catch: java.lang.Throwable -> Lec
            java.lang.String r15 = "putInt"
            r8.getMethod(r15, r14)     // Catch: java.lang.Throwable -> Lec
            java.lang.Class[] r14 = new java.lang.Class[r11]     // Catch: java.lang.Throwable -> Lec
            r14[r13] = r6     // Catch: java.lang.Throwable -> Lec
            r14[r12] = r10     // Catch: java.lang.Throwable -> Lec
            r8.getMethod(r7, r14)     // Catch: java.lang.Throwable -> Lec
            java.lang.Class[] r7 = new java.lang.Class[r9]     // Catch: java.lang.Throwable -> Lec
            r7[r13] = r6     // Catch: java.lang.Throwable -> Lec
            r7[r12] = r10     // Catch: java.lang.Throwable -> Lec
            r7[r11] = r10     // Catch: java.lang.Throwable -> Lec
            java.lang.String r14 = "putLong"
            r8.getMethod(r14, r7)     // Catch: java.lang.Throwable -> Lec
            java.lang.Class[] r7 = new java.lang.Class[r11]     // Catch: java.lang.Throwable -> Lec
            r7[r13] = r6     // Catch: java.lang.Throwable -> Lec
            r7[r12] = r10     // Catch: java.lang.Throwable -> Lec
            java.lang.String r14 = "getObject"
            r8.getMethod(r14, r7)     // Catch: java.lang.Throwable -> Lec
            java.lang.Class[] r7 = new java.lang.Class[r9]     // Catch: java.lang.Throwable -> Lec
            r7[r13] = r6     // Catch: java.lang.Throwable -> Lec
            r7[r12] = r10     // Catch: java.lang.Throwable -> Lec
            r7[r11] = r6     // Catch: java.lang.Throwable -> Lec
            java.lang.String r6 = "putObject"
            r8.getMethod(r6, r7)     // Catch: java.lang.Throwable -> Lec
            r6 = 1
            goto Lf1
        Lec:
            r6 = move-exception
            m8738l(r6)
        Lf0:
            r6 = 0
        Lf1:
            p185k7.C3859j8.f16710e = r6
            java.lang.Class<byte[]> r6 = byte[].class
            int r6 = m8745s(r6)
            long r6 = (long) r6
            p185k7.C3859j8.f16711f = r6
            m8745s(r5)
            m8727a(r5)
            m8745s(r4)
            m8727a(r4)
            m8745s(r3)
            m8727a(r3)
            m8745s(r2)
            m8727a(r2)
            m8745s(r1)
            m8727a(r1)
            m8745s(r0)
            m8727a(r0)
            java.lang.reflect.Field r0 = m8728b()
            if (r0 == 0) goto L12d
            e7.i8 r1 = p185k7.C3859j8.f16708c
            if (r1 == 0) goto L12d
            r1.m4269x(r0)
        L12d:
            java.nio.ByteOrder r0 = java.nio.ByteOrder.nativeOrder()
            java.nio.ByteOrder r1 = java.nio.ByteOrder.BIG_ENDIAN
            if (r0 != r1) goto L136
            goto L137
        L136:
            r12 = 0
        L137:
            p185k7.C3859j8.f16712g = r12
            return
    }

    public C3859j8() {
            r0 = this;
            r0.<init>()
            return
    }

    /* renamed from: a */
    public static int m8727a(java.lang.Class<?> r1) {
            boolean r0 = p185k7.C3859j8.f16710e
            if (r0 == 0) goto Lb
            e7.i8 r0 = p185k7.C3859j8.f16708c
            int r1 = r0.m4266l(r1)
            return r1
        Lb:
            r1 = -1
            return r1
    }

    /* renamed from: b */
    public static java.lang.reflect.Field m8728b() {
            int r0 = p185k7.C3744b5.f16532a
            java.lang.Class<java.nio.Buffer> r0 = java.nio.Buffer.class
            java.lang.String r1 = "effectiveDirectAddress"
            r2 = 0
            java.lang.reflect.Field r0 = r0.getDeclaredField(r1)     // Catch: java.lang.Throwable -> Lc
            goto Ld
        Lc:
            r0 = r2
        Ld:
            if (r0 != 0) goto L25
            java.lang.Class<java.nio.Buffer> r0 = java.nio.Buffer.class
            java.lang.String r1 = "address"
            java.lang.reflect.Field r0 = r0.getDeclaredField(r1)     // Catch: java.lang.Throwable -> L18
            goto L19
        L18:
            r0 = r2
        L19:
            if (r0 == 0) goto L24
            java.lang.Class r1 = r0.getType()
            java.lang.Class r3 = java.lang.Long.TYPE
            if (r1 != r3) goto L24
            return r0
        L24:
            return r2
        L25:
            return r0
    }

    /* renamed from: c */
    public static void m8729c(java.lang.Object r5, long r6, byte r8) {
            r0 = -4
            long r0 = r0 & r6
            e7.i8 r2 = p185k7.C3859j8.f16708c
            int r3 = r2.m4267p(r5, r0)
            int r7 = (int) r6
            int r6 = ~r7
            r6 = r6 & 3
            int r6 = r6 << 3
            r7 = 255(0xff, float:3.57E-43)
            int r4 = r7 << r6
            int r4 = ~r4
            r3 = r3 & r4
            r7 = r7 & r8
            int r6 = r7 << r6
            r6 = r6 | r3
            r2.m4262F(r5, r0, r6)
            return
    }

    /* renamed from: d */
    public static void m8730d(java.lang.Object r5, long r6, byte r8) {
            r0 = -4
            long r0 = r0 & r6
            e7.i8 r2 = p185k7.C3859j8.f16708c
            int r3 = r2.m4267p(r5, r0)
            int r7 = (int) r6
            r6 = r7 & 3
            int r6 = r6 << 3
            r7 = 255(0xff, float:3.57E-43)
            int r4 = r7 << r6
            int r4 = ~r4
            r3 = r3 & r4
            r7 = r7 & r8
            int r6 = r7 << r6
            r6 = r6 | r3
            r2.m4262F(r5, r0, r6)
            return
    }

    /* renamed from: e */
    public static double m8731e(java.lang.Object r1, long r2) {
            e7.i8 r0 = p185k7.C3859j8.f16708c
            double r1 = r0.mo4203a(r1, r2)
            return r1
    }

    /* renamed from: f */
    public static float m8732f(java.lang.Object r1, long r2) {
            e7.i8 r0 = p185k7.C3859j8.f16708c
            float r1 = r0.mo4204b(r1, r2)
            return r1
    }

    /* renamed from: g */
    public static int m8733g(java.lang.Object r1, long r2) {
            e7.i8 r0 = p185k7.C3859j8.f16708c
            int r1 = r0.m4267p(r1, r2)
            return r1
    }

    /* renamed from: h */
    public static long m8734h(java.lang.Object r1, long r2) {
            e7.i8 r0 = p185k7.C3859j8.f16708c
            long r1 = r0.m4268t(r1, r2)
            return r1
    }

    /* renamed from: i */
    public static <T> T m8735i(java.lang.Class<T> r1) {
            sun.misc.Unsafe r0 = p185k7.C3859j8.f16706a     // Catch: java.lang.InstantiationException -> L7
            java.lang.Object r1 = r0.allocateInstance(r1)     // Catch: java.lang.InstantiationException -> L7
            return r1
        L7:
            r1 = move-exception
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
    }

    /* renamed from: j */
    public static java.lang.Object m8736j(java.lang.Object r1, long r2) {
            e7.i8 r0 = p185k7.C3859j8.f16708c
            java.lang.Object r1 = r0.m4261B(r1, r2)
            return r1
    }

    /* renamed from: k */
    public static sun.misc.Unsafe m8737k() {
            k7.g8 r0 = new k7.g8     // Catch: java.lang.Throwable -> Lc
            r0.<init>()     // Catch: java.lang.Throwable -> Lc
            java.lang.Object r0 = java.security.AccessController.doPrivileged(r0)     // Catch: java.lang.Throwable -> Lc
            sun.misc.Unsafe r0 = (sun.misc.Unsafe) r0     // Catch: java.lang.Throwable -> Lc
            goto Ld
        Lc:
            r0 = 0
        Ld:
            return r0
    }

    /* renamed from: l */
    public static /* bridge */ /* synthetic */ void m8738l(java.lang.Throwable r4) {
            java.lang.Class<k7.j8> r0 = p185k7.C3859j8.class
            java.lang.String r0 = r0.getName()
            java.util.logging.Logger r0 = java.util.logging.Logger.getLogger(r0)
            java.util.logging.Level r1 = java.util.logging.Level.WARNING
            java.lang.String r4 = java.lang.String.valueOf(r4)
            int r2 = r4.length()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            int r2 = r2 + 71
            r3.<init>(r2)
            java.lang.String r2 = "platform method missing - proto runtime falling back to safer methods: "
            java.lang.String r4 = p346u.C6269n.m12888a(r3, r2, r4)
            java.lang.String r2 = "com.google.protobuf.UnsafeUtil"
            java.lang.String r3 = "logMissingMethod"
            r0.logp(r1, r2, r3, r4)
            return
    }

    /* renamed from: m */
    public static void m8739m(java.lang.Object r6, long r7, double r9) {
            e7.i8 r0 = p185k7.C3859j8.f16708c
            r1 = r6
            r2 = r7
            r4 = r9
            r0.mo4207e(r1, r2, r4)
            return
    }

    /* renamed from: n */
    public static void m8740n(java.lang.Object r6, long r7, long r9) {
            e7.i8 r0 = p185k7.C3859j8.f16708c
            r1 = r6
            r2 = r7
            r4 = r9
            r0.m4263J(r1, r2, r4)
            return
    }

    /* renamed from: o */
    public static /* bridge */ /* synthetic */ boolean m8741o(java.lang.Object r3, long r4) {
            e7.i8 r0 = p185k7.C3859j8.f16708c
            r1 = -4
            long r1 = r1 & r4
            int r3 = r0.m4267p(r3, r1)
            long r4 = ~r4
            r0 = 3
            long r4 = r4 & r0
            r0 = 3
            long r4 = r4 << r0
            int r5 = (int) r4
            int r3 = r3 >>> r5
            r3 = r3 & 255(0xff, float:3.57E-43)
            byte r3 = (byte) r3
            if (r3 == 0) goto L18
            r3 = 1
            return r3
        L18:
            r3 = 0
            return r3
    }

    /* renamed from: p */
    public static /* bridge */ /* synthetic */ boolean m8742p(java.lang.Object r3, long r4) {
            e7.i8 r0 = p185k7.C3859j8.f16708c
            r1 = -4
            long r1 = r1 & r4
            int r3 = r0.m4267p(r3, r1)
            r0 = 3
            long r4 = r4 & r0
            r0 = 3
            long r4 = r4 << r0
            int r5 = (int) r4
            int r3 = r3 >>> r5
            r3 = r3 & 255(0xff, float:3.57E-43)
            byte r3 = (byte) r3
            if (r3 == 0) goto L17
            r3 = 1
            return r3
        L17:
            r3 = 0
            return r3
    }

    /* renamed from: q */
    public static boolean m8743q(java.lang.Class<?> r10) {
            java.lang.Class<byte[]> r0 = byte[].class
            int r1 = p185k7.C3744b5.f16532a
            r1 = 0
            java.lang.Class<?> r2 = p185k7.C3859j8.f16707b     // Catch: java.lang.Throwable -> L76
            r3 = 2
            java.lang.Class[] r4 = new java.lang.Class[r3]     // Catch: java.lang.Throwable -> L76
            r4[r1] = r10     // Catch: java.lang.Throwable -> L76
            java.lang.Class r5 = java.lang.Boolean.TYPE     // Catch: java.lang.Throwable -> L76
            r6 = 1
            r4[r6] = r5     // Catch: java.lang.Throwable -> L76
            java.lang.String r7 = "peekLong"
            r2.getMethod(r7, r4)     // Catch: java.lang.Throwable -> L76
            r4 = 3
            java.lang.Class[] r7 = new java.lang.Class[r4]     // Catch: java.lang.Throwable -> L76
            r7[r1] = r10     // Catch: java.lang.Throwable -> L76
            java.lang.Class r8 = java.lang.Long.TYPE     // Catch: java.lang.Throwable -> L76
            r7[r6] = r8     // Catch: java.lang.Throwable -> L76
            r7[r3] = r5     // Catch: java.lang.Throwable -> L76
            java.lang.String r8 = "pokeLong"
            r2.getMethod(r8, r7)     // Catch: java.lang.Throwable -> L76
            java.lang.Class[] r7 = new java.lang.Class[r4]     // Catch: java.lang.Throwable -> L76
            r7[r1] = r10     // Catch: java.lang.Throwable -> L76
            java.lang.Class r8 = java.lang.Integer.TYPE     // Catch: java.lang.Throwable -> L76
            r7[r6] = r8     // Catch: java.lang.Throwable -> L76
            r7[r3] = r5     // Catch: java.lang.Throwable -> L76
            java.lang.String r9 = "pokeInt"
            r2.getMethod(r9, r7)     // Catch: java.lang.Throwable -> L76
            java.lang.Class[] r7 = new java.lang.Class[r3]     // Catch: java.lang.Throwable -> L76
            r7[r1] = r10     // Catch: java.lang.Throwable -> L76
            r7[r6] = r5     // Catch: java.lang.Throwable -> L76
            java.lang.String r5 = "peekInt"
            r2.getMethod(r5, r7)     // Catch: java.lang.Throwable -> L76
            java.lang.Class[] r5 = new java.lang.Class[r3]     // Catch: java.lang.Throwable -> L76
            r5[r1] = r10     // Catch: java.lang.Throwable -> L76
            java.lang.Class r7 = java.lang.Byte.TYPE     // Catch: java.lang.Throwable -> L76
            r5[r6] = r7     // Catch: java.lang.Throwable -> L76
            java.lang.String r7 = "pokeByte"
            r2.getMethod(r7, r5)     // Catch: java.lang.Throwable -> L76
            java.lang.Class[] r5 = new java.lang.Class[r6]     // Catch: java.lang.Throwable -> L76
            r5[r1] = r10     // Catch: java.lang.Throwable -> L76
            java.lang.String r7 = "peekByte"
            r2.getMethod(r7, r5)     // Catch: java.lang.Throwable -> L76
            r5 = 4
            java.lang.Class[] r7 = new java.lang.Class[r5]     // Catch: java.lang.Throwable -> L76
            r7[r1] = r10     // Catch: java.lang.Throwable -> L76
            r7[r6] = r0     // Catch: java.lang.Throwable -> L76
            r7[r3] = r8     // Catch: java.lang.Throwable -> L76
            r7[r4] = r8     // Catch: java.lang.Throwable -> L76
            java.lang.String r9 = "pokeByteArray"
            r2.getMethod(r9, r7)     // Catch: java.lang.Throwable -> L76
            java.lang.Class[] r5 = new java.lang.Class[r5]     // Catch: java.lang.Throwable -> L76
            r5[r1] = r10     // Catch: java.lang.Throwable -> L76
            r5[r6] = r0     // Catch: java.lang.Throwable -> L76
            r5[r3] = r8     // Catch: java.lang.Throwable -> L76
            r5[r4] = r8     // Catch: java.lang.Throwable -> L76
            java.lang.String r10 = "peekByteArray"
            r2.getMethod(r10, r5)     // Catch: java.lang.Throwable -> L76
            return r6
        L76:
            return r1
    }

    /* renamed from: r */
    public static boolean m8744r(java.lang.Object r1, long r2) {
            e7.i8 r0 = p185k7.C3859j8.f16708c
            boolean r1 = r0.mo4209g(r1, r2)
            return r1
    }

    /* renamed from: s */
    public static int m8745s(java.lang.Class<?> r1) {
            boolean r0 = p185k7.C3859j8.f16710e
            if (r0 == 0) goto Lb
            e7.i8 r0 = p185k7.C3859j8.f16708c
            int r1 = r0.m4265h(r1)
            return r1
        Lb:
            r1 = -1
            return r1
    }
}
