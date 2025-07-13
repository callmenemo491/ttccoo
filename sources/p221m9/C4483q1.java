package p221m9;

/* renamed from: m9.q1 */
/* loaded from: classes.dex */
public final class C4483q1 {

    /* renamed from: a */
    public static final java.util.logging.Logger f18210a = null;

    /* renamed from: b */
    public static final sun.misc.Unsafe f18211b = null;

    /* renamed from: c */
    public static final java.lang.Class<?> f18212c = null;

    /* renamed from: d */
    public static final boolean f18213d = false;

    /* renamed from: e */
    public static final boolean f18214e = false;

    /* renamed from: f */
    public static final p221m9.C4483q1.e f18215f = null;

    /* renamed from: g */
    public static final boolean f18216g = false;

    /* renamed from: h */
    public static final boolean f18217h = false;

    /* renamed from: i */
    public static final long f18218i = 0;

    /* renamed from: j */
    public static final boolean f18219j = false;

    /* renamed from: m9.q1$a */
    public class a implements java.security.PrivilegedExceptionAction<sun.misc.Unsafe> {
        public a() {
                r0 = this;
                r0.<init>()
                return
        }

        /* renamed from: a */
        public sun.misc.Unsafe m10261a() {
                r7 = this;
                java.lang.Class<sun.misc.Unsafe> r0 = sun.misc.Unsafe.class
                java.lang.reflect.Field[] r1 = r0.getDeclaredFields()
                int r2 = r1.length
                r3 = 0
            L8:
                r4 = 0
                if (r3 >= r2) goto L25
                r5 = r1[r3]
                r6 = 1
                r5.setAccessible(r6)
                java.lang.Object r4 = r5.get(r4)
                boolean r5 = r0.isInstance(r4)
                if (r5 == 0) goto L22
                java.lang.Object r0 = r0.cast(r4)
                sun.misc.Unsafe r0 = (sun.misc.Unsafe) r0
                return r0
            L22:
                int r3 = r3 + 1
                goto L8
            L25:
                return r4
        }

        @Override // java.security.PrivilegedExceptionAction
        public /* bridge */ /* synthetic */ sun.misc.Unsafe run() {
                r1 = this;
                sun.misc.Unsafe r0 = r1.m10261a()
                return r0
        }
    }

    /* renamed from: m9.q1$b */
    public static final class b extends p221m9.C4483q1.e {
        public b(sun.misc.Unsafe r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // p221m9.C4483q1.e
        /* renamed from: c */
        public boolean mo10262c(java.lang.Object r4, long r5) {
                r3 = this;
                boolean r0 = p221m9.C4483q1.f18219j
                r1 = 0
                r2 = 1
                if (r0 == 0) goto Le
                byte r4 = p221m9.C4483q1.m10244h(r4, r5)
                if (r4 == 0) goto Ld
                r1 = 1
            Ld:
                return r1
            Le:
                byte r4 = p221m9.C4483q1.m10245i(r4, r5)
                if (r4 == 0) goto L15
                r1 = 1
            L15:
                return r1
        }

        @Override // p221m9.C4483q1.e
        /* renamed from: d */
        public byte mo10263d(java.lang.Object r2, long r3) {
                r1 = this;
                boolean r0 = p221m9.C4483q1.f18219j
                if (r0 == 0) goto L9
                byte r2 = p221m9.C4483q1.m10244h(r2, r3)
                return r2
            L9:
                byte r2 = p221m9.C4483q1.m10245i(r2, r3)
                return r2
        }

        @Override // p221m9.C4483q1.e
        /* renamed from: e */
        public double mo10264e(java.lang.Object r1, long r2) {
                r0 = this;
                long r1 = r0.m10273h(r1, r2)
                double r1 = java.lang.Double.longBitsToDouble(r1)
                return r1
        }

        @Override // p221m9.C4483q1.e
        /* renamed from: f */
        public float mo10265f(java.lang.Object r1, long r2) {
                r0 = this;
                int r1 = r0.m10272g(r1, r2)
                float r1 = java.lang.Float.intBitsToFloat(r1)
                return r1
        }

        @Override // p221m9.C4483q1.e
        /* renamed from: k */
        public void mo10266k(java.lang.Object r2, long r3, boolean r5) {
                r1 = this;
                boolean r0 = p221m9.C4483q1.f18219j
                if (r0 == 0) goto L9
                byte r5 = (byte) r5
                p221m9.C4483q1.m10254r(r2, r3, r5)
                goto Ld
            L9:
                byte r5 = (byte) r5
                p221m9.C4483q1.m10255s(r2, r3, r5)
            Ld:
                return
        }

        @Override // p221m9.C4483q1.e
        /* renamed from: l */
        public void mo10267l(java.lang.Object r2, long r3, byte r5) {
                r1 = this;
                boolean r0 = p221m9.C4483q1.f18219j
                if (r0 == 0) goto L8
                p221m9.C4483q1.m10254r(r2, r3, r5)
                goto Lb
            L8:
                p221m9.C4483q1.m10255s(r2, r3, r5)
            Lb:
                return
        }

        @Override // p221m9.C4483q1.e
        /* renamed from: m */
        public void mo10268m(java.lang.Object r7, long r8, double r10) {
                r6 = this;
                long r4 = java.lang.Double.doubleToLongBits(r10)
                r0 = r6
                r1 = r7
                r2 = r8
                r0.m10277p(r1, r2, r4)
                return
        }

        @Override // p221m9.C4483q1.e
        /* renamed from: n */
        public void mo10269n(java.lang.Object r1, long r2, float r4) {
                r0 = this;
                int r4 = java.lang.Float.floatToIntBits(r4)
                r0.m10276o(r1, r2, r4)
                return
        }
    }

    /* renamed from: m9.q1$c */
    public static final class c extends p221m9.C4483q1.e {
        public c(sun.misc.Unsafe r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // p221m9.C4483q1.e
        /* renamed from: c */
        public boolean mo10262c(java.lang.Object r4, long r5) {
                r3 = this;
                boolean r0 = p221m9.C4483q1.f18219j
                r1 = 0
                r2 = 1
                if (r0 == 0) goto Le
                byte r4 = p221m9.C4483q1.m10244h(r4, r5)
                if (r4 == 0) goto Ld
                r1 = 1
            Ld:
                return r1
            Le:
                byte r4 = p221m9.C4483q1.m10245i(r4, r5)
                if (r4 == 0) goto L15
                r1 = 1
            L15:
                return r1
        }

        @Override // p221m9.C4483q1.e
        /* renamed from: d */
        public byte mo10263d(java.lang.Object r2, long r3) {
                r1 = this;
                boolean r0 = p221m9.C4483q1.f18219j
                if (r0 == 0) goto L9
                byte r2 = p221m9.C4483q1.m10244h(r2, r3)
                return r2
            L9:
                byte r2 = p221m9.C4483q1.m10245i(r2, r3)
                return r2
        }

        @Override // p221m9.C4483q1.e
        /* renamed from: e */
        public double mo10264e(java.lang.Object r1, long r2) {
                r0 = this;
                long r1 = r0.m10273h(r1, r2)
                double r1 = java.lang.Double.longBitsToDouble(r1)
                return r1
        }

        @Override // p221m9.C4483q1.e
        /* renamed from: f */
        public float mo10265f(java.lang.Object r1, long r2) {
                r0 = this;
                int r1 = r0.m10272g(r1, r2)
                float r1 = java.lang.Float.intBitsToFloat(r1)
                return r1
        }

        @Override // p221m9.C4483q1.e
        /* renamed from: k */
        public void mo10266k(java.lang.Object r2, long r3, boolean r5) {
                r1 = this;
                boolean r0 = p221m9.C4483q1.f18219j
                if (r0 == 0) goto L9
                byte r5 = (byte) r5
                p221m9.C4483q1.m10254r(r2, r3, r5)
                goto Ld
            L9:
                byte r5 = (byte) r5
                p221m9.C4483q1.m10255s(r2, r3, r5)
            Ld:
                return
        }

        @Override // p221m9.C4483q1.e
        /* renamed from: l */
        public void mo10267l(java.lang.Object r2, long r3, byte r5) {
                r1 = this;
                boolean r0 = p221m9.C4483q1.f18219j
                if (r0 == 0) goto L8
                p221m9.C4483q1.m10254r(r2, r3, r5)
                goto Lb
            L8:
                p221m9.C4483q1.m10255s(r2, r3, r5)
            Lb:
                return
        }

        @Override // p221m9.C4483q1.e
        /* renamed from: m */
        public void mo10268m(java.lang.Object r7, long r8, double r10) {
                r6 = this;
                long r4 = java.lang.Double.doubleToLongBits(r10)
                r0 = r6
                r1 = r7
                r2 = r8
                r0.m10277p(r1, r2, r4)
                return
        }

        @Override // p221m9.C4483q1.e
        /* renamed from: n */
        public void mo10269n(java.lang.Object r1, long r2, float r4) {
                r0 = this;
                int r4 = java.lang.Float.floatToIntBits(r4)
                r0.m10276o(r1, r2, r4)
                return
        }
    }

    /* renamed from: m9.q1$d */
    public static final class d extends p221m9.C4483q1.e {
        public d(sun.misc.Unsafe r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // p221m9.C4483q1.e
        /* renamed from: c */
        public boolean mo10262c(java.lang.Object r2, long r3) {
                r1 = this;
                sun.misc.Unsafe r0 = r1.f18220a
                boolean r2 = r0.getBoolean(r2, r3)
                return r2
        }

        @Override // p221m9.C4483q1.e
        /* renamed from: d */
        public byte mo10263d(java.lang.Object r2, long r3) {
                r1 = this;
                sun.misc.Unsafe r0 = r1.f18220a
                byte r2 = r0.getByte(r2, r3)
                return r2
        }

        @Override // p221m9.C4483q1.e
        /* renamed from: e */
        public double mo10264e(java.lang.Object r2, long r3) {
                r1 = this;
                sun.misc.Unsafe r0 = r1.f18220a
                double r2 = r0.getDouble(r2, r3)
                return r2
        }

        @Override // p221m9.C4483q1.e
        /* renamed from: f */
        public float mo10265f(java.lang.Object r2, long r3) {
                r1 = this;
                sun.misc.Unsafe r0 = r1.f18220a
                float r2 = r0.getFloat(r2, r3)
                return r2
        }

        @Override // p221m9.C4483q1.e
        /* renamed from: k */
        public void mo10266k(java.lang.Object r2, long r3, boolean r5) {
                r1 = this;
                sun.misc.Unsafe r0 = r1.f18220a
                r0.putBoolean(r2, r3, r5)
                return
        }

        @Override // p221m9.C4483q1.e
        /* renamed from: l */
        public void mo10267l(java.lang.Object r2, long r3, byte r5) {
                r1 = this;
                sun.misc.Unsafe r0 = r1.f18220a
                r0.putByte(r2, r3, r5)
                return
        }

        @Override // p221m9.C4483q1.e
        /* renamed from: m */
        public void mo10268m(java.lang.Object r7, long r8, double r10) {
                r6 = this;
                sun.misc.Unsafe r0 = r6.f18220a
                r1 = r7
                r2 = r8
                r4 = r10
                r0.putDouble(r1, r2, r4)
                return
        }

        @Override // p221m9.C4483q1.e
        /* renamed from: n */
        public void mo10269n(java.lang.Object r2, long r3, float r5) {
                r1 = this;
                sun.misc.Unsafe r0 = r1.f18220a
                r0.putFloat(r2, r3, r5)
                return
        }
    }

    /* renamed from: m9.q1$e */
    public static abstract class e {

        /* renamed from: a */
        public sun.misc.Unsafe f18220a;

        public e(sun.misc.Unsafe r1) {
                r0 = this;
                r0.<init>()
                r0.f18220a = r1
                return
        }

        /* renamed from: a */
        public final int m10270a(java.lang.Class<?> r2) {
                r1 = this;
                sun.misc.Unsafe r0 = r1.f18220a
                int r2 = r0.arrayBaseOffset(r2)
                return r2
        }

        /* renamed from: b */
        public final int m10271b(java.lang.Class<?> r2) {
                r1 = this;
                sun.misc.Unsafe r0 = r1.f18220a
                int r2 = r0.arrayIndexScale(r2)
                return r2
        }

        /* renamed from: c */
        public abstract boolean mo10262c(java.lang.Object r1, long r2);

        /* renamed from: d */
        public abstract byte mo10263d(java.lang.Object r1, long r2);

        /* renamed from: e */
        public abstract double mo10264e(java.lang.Object r1, long r2);

        /* renamed from: f */
        public abstract float mo10265f(java.lang.Object r1, long r2);

        /* renamed from: g */
        public final int m10272g(java.lang.Object r2, long r3) {
                r1 = this;
                sun.misc.Unsafe r0 = r1.f18220a
                int r2 = r0.getInt(r2, r3)
                return r2
        }

        /* renamed from: h */
        public final long m10273h(java.lang.Object r2, long r3) {
                r1 = this;
                sun.misc.Unsafe r0 = r1.f18220a
                long r2 = r0.getLong(r2, r3)
                return r2
        }

        /* renamed from: i */
        public final java.lang.Object m10274i(java.lang.Object r2, long r3) {
                r1 = this;
                sun.misc.Unsafe r0 = r1.f18220a
                java.lang.Object r2 = r0.getObject(r2, r3)
                return r2
        }

        /* renamed from: j */
        public final long m10275j(java.lang.reflect.Field r3) {
                r2 = this;
                sun.misc.Unsafe r0 = r2.f18220a
                long r0 = r0.objectFieldOffset(r3)
                return r0
        }

        /* renamed from: k */
        public abstract void mo10266k(java.lang.Object r1, long r2, boolean r4);

        /* renamed from: l */
        public abstract void mo10267l(java.lang.Object r1, long r2, byte r4);

        /* renamed from: m */
        public abstract void mo10268m(java.lang.Object r1, long r2, double r4);

        /* renamed from: n */
        public abstract void mo10269n(java.lang.Object r1, long r2, float r4);

        /* renamed from: o */
        public final void m10276o(java.lang.Object r2, long r3, int r5) {
                r1 = this;
                sun.misc.Unsafe r0 = r1.f18220a
                r0.putInt(r2, r3, r5)
                return
        }

        /* renamed from: p */
        public final void m10277p(java.lang.Object r7, long r8, long r10) {
                r6 = this;
                sun.misc.Unsafe r0 = r6.f18220a
                r1 = r7
                r2 = r8
                r4 = r10
                r0.putLong(r1, r2, r4)
                return
        }

        /* renamed from: q */
        public final void m10278q(java.lang.Object r2, long r3, java.lang.Object r5) {
                r1 = this;
                sun.misc.Unsafe r0 = r1.f18220a
                r0.putObject(r2, r3, r5)
                return
        }
    }

    static {
            java.lang.Class<java.lang.Object[]> r1 = java.lang.Object[].class
            java.lang.Class<double[]> r2 = double[].class
            java.lang.Class<float[]> r3 = float[].class
            java.lang.Class<long[]> r4 = long[].class
            java.lang.Class<int[]> r5 = int[].class
            java.lang.Class<boolean[]> r6 = boolean[].class
            java.lang.Class<java.lang.Object> r7 = java.lang.Object.class
            java.lang.Class<m9.q1> r0 = p221m9.C4483q1.class
            java.lang.String r0 = r0.getName()
            java.util.logging.Logger r0 = java.util.logging.Logger.getLogger(r0)
            p221m9.C4483q1.f18210a = r0
            sun.misc.Unsafe r0 = m10251o()
            p221m9.C4483q1.f18211b = r0
            java.lang.Class<?> r8 = p221m9.C4442d.f18118a
            p221m9.C4483q1.f18212c = r8
            java.lang.Class r8 = java.lang.Long.TYPE
            boolean r9 = m10241e(r8)
            p221m9.C4483q1.f18213d = r9
            java.lang.Class r10 = java.lang.Integer.TYPE
            boolean r11 = m10241e(r10)
            p221m9.C4483q1.f18214e = r11
            r12 = 0
            if (r0 != 0) goto L38
            goto L53
        L38:
            boolean r13 = p221m9.C4442d.m9915a()
            if (r13 == 0) goto L4e
            if (r9 == 0) goto L46
            m9.q1$c r12 = new m9.q1$c
            r12.<init>(r0)
            goto L53
        L46:
            if (r11 == 0) goto L53
            m9.q1$b r12 = new m9.q1$b
            r12.<init>(r0)
            goto L53
        L4e:
            m9.q1$d r12 = new m9.q1$d
            r12.<init>(r0)
        L53:
            p221m9.C4483q1.f18215f = r12
            java.lang.String r9 = "copyMemory"
            java.lang.String r12 = "putLong"
            java.lang.String r13 = "putInt"
            java.lang.String r14 = "getInt"
            java.lang.String r15 = "putByte"
            java.lang.String r11 = "getByte"
            r16 = r1
            java.lang.String r1 = "platform method missing - proto runtime falling back to safer methods: "
            r17 = r2
            java.lang.String r2 = "objectFieldOffset"
            r18 = r3
            java.lang.String r3 = "getLong"
            r19 = r4
            r4 = 1
            r20 = 0
            if (r0 != 0) goto L7b
            r21 = r5
        L76:
            r23 = r6
        L78:
            r0 = 0
            goto L125
        L7b:
            java.lang.Class r0 = r0.getClass()     // Catch: java.lang.Throwable -> L108
            r21 = r5
            java.lang.Class[] r5 = new java.lang.Class[r4]     // Catch: java.lang.Throwable -> L106
            java.lang.Class<java.lang.reflect.Field> r22 = java.lang.reflect.Field.class
            r5[r20] = r22     // Catch: java.lang.Throwable -> L106
            r0.getMethod(r2, r5)     // Catch: java.lang.Throwable -> L106
            r5 = 2
            java.lang.Class[] r4 = new java.lang.Class[r5]     // Catch: java.lang.Throwable -> L106
            r4[r20] = r7     // Catch: java.lang.Throwable -> L106
            r5 = 1
            r4[r5] = r8     // Catch: java.lang.Throwable -> L106
            r0.getMethod(r3, r4)     // Catch: java.lang.Throwable -> L106
            java.lang.reflect.Field r4 = m10240d()     // Catch: java.lang.Throwable -> L106
            if (r4 != 0) goto L9c
            goto L76
        L9c:
            boolean r4 = p221m9.C4442d.m9915a()     // Catch: java.lang.Throwable -> L106
            if (r4 == 0) goto La7
            r23 = r6
        La4:
            r0 = 1
            goto L125
        La7:
            r4 = 1
            java.lang.Class[] r5 = new java.lang.Class[r4]     // Catch: java.lang.Throwable -> L106
            r5[r20] = r8     // Catch: java.lang.Throwable -> L106
            r0.getMethod(r11, r5)     // Catch: java.lang.Throwable -> L106
            r4 = 2
            java.lang.Class[] r5 = new java.lang.Class[r4]     // Catch: java.lang.Throwable -> L106
            r5[r20] = r8     // Catch: java.lang.Throwable -> L106
            java.lang.Class r4 = java.lang.Byte.TYPE     // Catch: java.lang.Throwable -> L106
            r23 = r6
            r6 = 1
            r5[r6] = r4     // Catch: java.lang.Throwable -> L104
            r0.getMethod(r15, r5)     // Catch: java.lang.Throwable -> L104
            java.lang.Class[] r4 = new java.lang.Class[r6]     // Catch: java.lang.Throwable -> L104
            r4[r20] = r8     // Catch: java.lang.Throwable -> L104
            r0.getMethod(r14, r4)     // Catch: java.lang.Throwable -> L104
            r4 = 2
            java.lang.Class[] r5 = new java.lang.Class[r4]     // Catch: java.lang.Throwable -> L104
            r5[r20] = r8     // Catch: java.lang.Throwable -> L104
            r4 = 1
            r5[r4] = r10     // Catch: java.lang.Throwable -> L104
            r0.getMethod(r13, r5)     // Catch: java.lang.Throwable -> L104
            java.lang.Class[] r5 = new java.lang.Class[r4]     // Catch: java.lang.Throwable -> L104
            r5[r20] = r8     // Catch: java.lang.Throwable -> L104
            r0.getMethod(r3, r5)     // Catch: java.lang.Throwable -> L104
            r4 = 2
            java.lang.Class[] r5 = new java.lang.Class[r4]     // Catch: java.lang.Throwable -> L104
            r5[r20] = r8     // Catch: java.lang.Throwable -> L104
            r4 = 1
            r5[r4] = r8     // Catch: java.lang.Throwable -> L104
            r0.getMethod(r12, r5)     // Catch: java.lang.Throwable -> L104
            r5 = 3
            java.lang.Class[] r6 = new java.lang.Class[r5]     // Catch: java.lang.Throwable -> L104
            r6[r20] = r8     // Catch: java.lang.Throwable -> L104
            r6[r4] = r8     // Catch: java.lang.Throwable -> L104
            r4 = 2
            r6[r4] = r8     // Catch: java.lang.Throwable -> L104
            r0.getMethod(r9, r6)     // Catch: java.lang.Throwable -> L104
            r4 = 5
            java.lang.Class[] r4 = new java.lang.Class[r4]     // Catch: java.lang.Throwable -> L104
            r4[r20] = r7     // Catch: java.lang.Throwable -> L104
            r5 = 1
            r4[r5] = r8     // Catch: java.lang.Throwable -> L104
            r5 = 2
            r4[r5] = r7     // Catch: java.lang.Throwable -> L104
            r5 = 3
            r4[r5] = r8     // Catch: java.lang.Throwable -> L104
            r5 = 4
            r4[r5] = r8     // Catch: java.lang.Throwable -> L104
            r0.getMethod(r9, r4)     // Catch: java.lang.Throwable -> L104
            goto La4
        L104:
            r0 = move-exception
            goto L10d
        L106:
            r0 = move-exception
            goto L10b
        L108:
            r0 = move-exception
            r21 = r5
        L10b:
            r23 = r6
        L10d:
            java.util.logging.Logger r4 = p221m9.C4483q1.f18210a
            java.util.logging.Level r5 = java.util.logging.Level.WARNING
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r1)
            r6.append(r0)
            java.lang.String r0 = r6.toString()
            r4.log(r5, r0)
            goto L78
        L125:
            p221m9.C4483q1.f18216g = r0
            sun.misc.Unsafe r0 = p221m9.C4483q1.f18211b
            if (r0 != 0) goto L130
            r5 = 1
        L12c:
            r22 = 0
            goto L23a
        L130:
            java.lang.Class r0 = r0.getClass()     // Catch: java.lang.Throwable -> L220
            r4 = 1
            java.lang.Class[] r5 = new java.lang.Class[r4]     // Catch: java.lang.Throwable -> L220
            java.lang.Class<java.lang.reflect.Field> r6 = java.lang.reflect.Field.class
            r5[r20] = r6     // Catch: java.lang.Throwable -> L220
            r0.getMethod(r2, r5)     // Catch: java.lang.Throwable -> L220
            java.lang.String r2 = "arrayBaseOffset"
            java.lang.Class[] r5 = new java.lang.Class[r4]     // Catch: java.lang.Throwable -> L220
            java.lang.Class<java.lang.Class> r6 = java.lang.Class.class
            r5[r20] = r6     // Catch: java.lang.Throwable -> L220
            r0.getMethod(r2, r5)     // Catch: java.lang.Throwable -> L220
            java.lang.String r2 = "arrayIndexScale"
            java.lang.Class[] r5 = new java.lang.Class[r4]     // Catch: java.lang.Throwable -> L220
            java.lang.Class<java.lang.Class> r4 = java.lang.Class.class
            r5[r20] = r4     // Catch: java.lang.Throwable -> L220
            r0.getMethod(r2, r5)     // Catch: java.lang.Throwable -> L220
            r2 = 2
            java.lang.Class[] r4 = new java.lang.Class[r2]     // Catch: java.lang.Throwable -> L220
            r4[r20] = r7     // Catch: java.lang.Throwable -> L220
            java.lang.Class r2 = java.lang.Long.TYPE     // Catch: java.lang.Throwable -> L220
            r5 = 1
            r4[r5] = r2     // Catch: java.lang.Throwable -> L21e
            r0.getMethod(r14, r4)     // Catch: java.lang.Throwable -> L21e
            r4 = 3
            java.lang.Class[] r6 = new java.lang.Class[r4]     // Catch: java.lang.Throwable -> L21e
            r6[r20] = r7     // Catch: java.lang.Throwable -> L21e
            r6[r5] = r2     // Catch: java.lang.Throwable -> L21e
            java.lang.Class r4 = java.lang.Integer.TYPE     // Catch: java.lang.Throwable -> L220
            r5 = 2
            r6[r5] = r4     // Catch: java.lang.Throwable -> L220
            r0.getMethod(r13, r6)     // Catch: java.lang.Throwable -> L220
            java.lang.Class[] r4 = new java.lang.Class[r5]     // Catch: java.lang.Throwable -> L220
            r4[r20] = r7     // Catch: java.lang.Throwable -> L220
            r5 = 1
            r4[r5] = r2     // Catch: java.lang.Throwable -> L21e
            r0.getMethod(r3, r4)     // Catch: java.lang.Throwable -> L21e
            r3 = 3
            java.lang.Class[] r4 = new java.lang.Class[r3]     // Catch: java.lang.Throwable -> L21e
            r4[r20] = r7     // Catch: java.lang.Throwable -> L21e
            r4[r5] = r2     // Catch: java.lang.Throwable -> L21e
            r3 = 2
            r4[r3] = r2     // Catch: java.lang.Throwable -> L220
            r0.getMethod(r12, r4)     // Catch: java.lang.Throwable -> L220
            java.lang.String r4 = "getObject"
            java.lang.Class[] r5 = new java.lang.Class[r3]     // Catch: java.lang.Throwable -> L220
            r5[r20] = r7     // Catch: java.lang.Throwable -> L220
            r3 = 1
            r5[r3] = r2     // Catch: java.lang.Throwable -> L220
            r0.getMethod(r4, r5)     // Catch: java.lang.Throwable -> L220
            java.lang.String r4 = "putObject"
            r5 = 3
            java.lang.Class[] r6 = new java.lang.Class[r5]     // Catch: java.lang.Throwable -> L220
            r6[r20] = r7     // Catch: java.lang.Throwable -> L220
            r6[r3] = r2     // Catch: java.lang.Throwable -> L220
            r3 = 2
            r6[r3] = r7     // Catch: java.lang.Throwable -> L220
            r0.getMethod(r4, r6)     // Catch: java.lang.Throwable -> L220
            boolean r4 = p221m9.C4442d.m9915a()     // Catch: java.lang.Throwable -> L220
            if (r4 == 0) goto L1ad
            r5 = 1
        L1a9:
            r22 = 1
            goto L23a
        L1ad:
            java.lang.Class[] r4 = new java.lang.Class[r3]     // Catch: java.lang.Throwable -> L220
            r4[r20] = r7     // Catch: java.lang.Throwable -> L220
            r3 = 1
            r4[r3] = r2     // Catch: java.lang.Throwable -> L220
            r0.getMethod(r11, r4)     // Catch: java.lang.Throwable -> L220
            r4 = 3
            java.lang.Class[] r5 = new java.lang.Class[r4]     // Catch: java.lang.Throwable -> L220
            r5[r20] = r7     // Catch: java.lang.Throwable -> L220
            r5[r3] = r2     // Catch: java.lang.Throwable -> L220
            java.lang.Class r3 = java.lang.Byte.TYPE     // Catch: java.lang.Throwable -> L220
            r4 = 2
            r5[r4] = r3     // Catch: java.lang.Throwable -> L220
            r0.getMethod(r15, r5)     // Catch: java.lang.Throwable -> L220
            java.lang.String r3 = "getBoolean"
            java.lang.Class[] r5 = new java.lang.Class[r4]     // Catch: java.lang.Throwable -> L220
            r5[r20] = r7     // Catch: java.lang.Throwable -> L220
            r4 = 1
            r5[r4] = r2     // Catch: java.lang.Throwable -> L220
            r0.getMethod(r3, r5)     // Catch: java.lang.Throwable -> L220
            java.lang.String r3 = "putBoolean"
            r5 = 3
            java.lang.Class[] r6 = new java.lang.Class[r5]     // Catch: java.lang.Throwable -> L220
            r6[r20] = r7     // Catch: java.lang.Throwable -> L220
            r6[r4] = r2     // Catch: java.lang.Throwable -> L220
            java.lang.Class r4 = java.lang.Boolean.TYPE     // Catch: java.lang.Throwable -> L220
            r5 = 2
            r6[r5] = r4     // Catch: java.lang.Throwable -> L220
            r0.getMethod(r3, r6)     // Catch: java.lang.Throwable -> L220
            java.lang.String r3 = "getFloat"
            java.lang.Class[] r4 = new java.lang.Class[r5]     // Catch: java.lang.Throwable -> L220
            r4[r20] = r7     // Catch: java.lang.Throwable -> L220
            r5 = 1
            r4[r5] = r2     // Catch: java.lang.Throwable -> L21e
            r0.getMethod(r3, r4)     // Catch: java.lang.Throwable -> L21e
            java.lang.String r3 = "putFloat"
            r4 = 3
            java.lang.Class[] r6 = new java.lang.Class[r4]     // Catch: java.lang.Throwable -> L21e
            r6[r20] = r7     // Catch: java.lang.Throwable -> L21e
            r6[r5] = r2     // Catch: java.lang.Throwable -> L21e
            java.lang.Class r4 = java.lang.Float.TYPE     // Catch: java.lang.Throwable -> L220
            r5 = 2
            r6[r5] = r4     // Catch: java.lang.Throwable -> L220
            r0.getMethod(r3, r6)     // Catch: java.lang.Throwable -> L220
            java.lang.String r3 = "getDouble"
            java.lang.Class[] r4 = new java.lang.Class[r5]     // Catch: java.lang.Throwable -> L220
            r4[r20] = r7     // Catch: java.lang.Throwable -> L220
            r5 = 1
            r4[r5] = r2     // Catch: java.lang.Throwable -> L21e
            r0.getMethod(r3, r4)     // Catch: java.lang.Throwable -> L21e
            java.lang.String r3 = "putDouble"
            r4 = 3
            java.lang.Class[] r4 = new java.lang.Class[r4]     // Catch: java.lang.Throwable -> L21e
            r4[r20] = r7     // Catch: java.lang.Throwable -> L21e
            r4[r5] = r2     // Catch: java.lang.Throwable -> L21e
            java.lang.Class r2 = java.lang.Double.TYPE     // Catch: java.lang.Throwable -> L21e
            r6 = 2
            r4[r6] = r2     // Catch: java.lang.Throwable -> L21e
            r0.getMethod(r3, r4)     // Catch: java.lang.Throwable -> L21e
            goto L1a9
        L21e:
            r0 = move-exception
            goto L222
        L220:
            r0 = move-exception
            r5 = 1
        L222:
            java.util.logging.Logger r2 = p221m9.C4483q1.f18210a
            java.util.logging.Level r3 = java.util.logging.Level.WARNING
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r1)
            r4.append(r0)
            java.lang.String r0 = r4.toString()
            r2.log(r3, r0)
            goto L12c
        L23a:
            p221m9.C4483q1.f18217h = r22
            java.lang.Class<byte[]> r0 = byte[].class
            int r0 = m10238b(r0)
            long r0 = (long) r0
            p221m9.C4483q1.f18218i = r0
            m10238b(r23)
            m10239c(r23)
            m10238b(r21)
            m10239c(r21)
            m10238b(r19)
            m10239c(r19)
            m10238b(r18)
            m10239c(r18)
            m10238b(r17)
            m10239c(r17)
            m10238b(r16)
            m10239c(r16)
            java.lang.reflect.Field r0 = m10240d()
            if (r0 == 0) goto L277
            m9.q1$e r1 = p221m9.C4483q1.f18215f
            if (r1 != 0) goto L274
            goto L277
        L274:
            r1.m10275j(r0)
        L277:
            java.nio.ByteOrder r0 = java.nio.ByteOrder.nativeOrder()
            java.nio.ByteOrder r1 = java.nio.ByteOrder.BIG_ENDIAN
            if (r0 != r1) goto L281
            r4 = 1
            goto L282
        L281:
            r4 = 0
        L282:
            p221m9.C4483q1.f18219j = r4
            return
    }

    public C4483q1() {
            r0 = this;
            r0.<init>()
            return
    }

    /* renamed from: a */
    public static <T> T m10237a(java.lang.Class<T> r1) {
            sun.misc.Unsafe r0 = p221m9.C4483q1.f18211b     // Catch: java.lang.InstantiationException -> L7
            java.lang.Object r1 = r0.allocateInstance(r1)     // Catch: java.lang.InstantiationException -> L7
            return r1
        L7:
            r1 = move-exception
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
    }

    /* renamed from: b */
    public static int m10238b(java.lang.Class<?> r1) {
            boolean r0 = p221m9.C4483q1.f18217h
            if (r0 == 0) goto Lb
            m9.q1$e r0 = p221m9.C4483q1.f18215f
            int r1 = r0.m10270a(r1)
            goto Lc
        Lb:
            r1 = -1
        Lc:
            return r1
    }

    /* renamed from: c */
    public static int m10239c(java.lang.Class<?> r1) {
            boolean r0 = p221m9.C4483q1.f18217h
            if (r0 == 0) goto Lb
            m9.q1$e r0 = p221m9.C4483q1.f18215f
            int r1 = r0.m10271b(r1)
            goto Lc
        Lb:
            r1 = -1
        Lc:
            return r1
    }

    /* renamed from: d */
    public static java.lang.reflect.Field m10240d() {
            boolean r0 = p221m9.C4442d.m9915a()
            r1 = 0
            if (r0 == 0) goto L14
            java.lang.Class<java.nio.Buffer> r0 = java.nio.Buffer.class
            java.lang.String r2 = "effectiveDirectAddress"
            java.lang.reflect.Field r0 = r0.getDeclaredField(r2)     // Catch: java.lang.Throwable -> L10
            goto L11
        L10:
            r0 = r1
        L11:
            if (r0 == 0) goto L14
            return r0
        L14:
            java.lang.Class<java.nio.Buffer> r0 = java.nio.Buffer.class
            java.lang.String r2 = "address"
            java.lang.reflect.Field r0 = r0.getDeclaredField(r2)     // Catch: java.lang.Throwable -> L1d
            goto L1e
        L1d:
            r0 = r1
        L1e:
            if (r0 == 0) goto L29
            java.lang.Class r2 = r0.getType()
            java.lang.Class r3 = java.lang.Long.TYPE
            if (r2 != r3) goto L29
            r1 = r0
        L29:
            return r1
    }

    /* renamed from: e */
    public static boolean m10241e(java.lang.Class<?> r10) {
            java.lang.Class<byte[]> r0 = byte[].class
            boolean r1 = p221m9.C4442d.m9915a()
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            java.lang.Class<?> r1 = p221m9.C4483q1.f18212c     // Catch: java.lang.Throwable -> L7b
            java.lang.String r3 = "peekLong"
            r4 = 2
            java.lang.Class[] r5 = new java.lang.Class[r4]     // Catch: java.lang.Throwable -> L7b
            r5[r2] = r10     // Catch: java.lang.Throwable -> L7b
            java.lang.Class r6 = java.lang.Boolean.TYPE     // Catch: java.lang.Throwable -> L7b
            r7 = 1
            r5[r7] = r6     // Catch: java.lang.Throwable -> L7b
            r1.getMethod(r3, r5)     // Catch: java.lang.Throwable -> L7b
            java.lang.String r3 = "pokeLong"
            r5 = 3
            java.lang.Class[] r8 = new java.lang.Class[r5]     // Catch: java.lang.Throwable -> L7b
            r8[r2] = r10     // Catch: java.lang.Throwable -> L7b
            java.lang.Class r9 = java.lang.Long.TYPE     // Catch: java.lang.Throwable -> L7b
            r8[r7] = r9     // Catch: java.lang.Throwable -> L7b
            r8[r4] = r6     // Catch: java.lang.Throwable -> L7b
            r1.getMethod(r3, r8)     // Catch: java.lang.Throwable -> L7b
            java.lang.String r3 = "pokeInt"
            java.lang.Class[] r8 = new java.lang.Class[r5]     // Catch: java.lang.Throwable -> L7b
            r8[r2] = r10     // Catch: java.lang.Throwable -> L7b
            java.lang.Class r9 = java.lang.Integer.TYPE     // Catch: java.lang.Throwable -> L7b
            r8[r7] = r9     // Catch: java.lang.Throwable -> L7b
            r8[r4] = r6     // Catch: java.lang.Throwable -> L7b
            r1.getMethod(r3, r8)     // Catch: java.lang.Throwable -> L7b
            java.lang.String r3 = "peekInt"
            java.lang.Class[] r8 = new java.lang.Class[r4]     // Catch: java.lang.Throwable -> L7b
            r8[r2] = r10     // Catch: java.lang.Throwable -> L7b
            r8[r7] = r6     // Catch: java.lang.Throwable -> L7b
            r1.getMethod(r3, r8)     // Catch: java.lang.Throwable -> L7b
            java.lang.String r3 = "pokeByte"
            java.lang.Class[] r6 = new java.lang.Class[r4]     // Catch: java.lang.Throwable -> L7b
            r6[r2] = r10     // Catch: java.lang.Throwable -> L7b
            java.lang.Class r8 = java.lang.Byte.TYPE     // Catch: java.lang.Throwable -> L7b
            r6[r7] = r8     // Catch: java.lang.Throwable -> L7b
            r1.getMethod(r3, r6)     // Catch: java.lang.Throwable -> L7b
            java.lang.String r3 = "peekByte"
            java.lang.Class[] r6 = new java.lang.Class[r7]     // Catch: java.lang.Throwable -> L7b
            r6[r2] = r10     // Catch: java.lang.Throwable -> L7b
            r1.getMethod(r3, r6)     // Catch: java.lang.Throwable -> L7b
            java.lang.String r3 = "pokeByteArray"
            r6 = 4
            java.lang.Class[] r8 = new java.lang.Class[r6]     // Catch: java.lang.Throwable -> L7b
            r8[r2] = r10     // Catch: java.lang.Throwable -> L7b
            r8[r7] = r0     // Catch: java.lang.Throwable -> L7b
            r8[r4] = r9     // Catch: java.lang.Throwable -> L7b
            r8[r5] = r9     // Catch: java.lang.Throwable -> L7b
            r1.getMethod(r3, r8)     // Catch: java.lang.Throwable -> L7b
            java.lang.String r3 = "peekByteArray"
            java.lang.Class[] r6 = new java.lang.Class[r6]     // Catch: java.lang.Throwable -> L7b
            r6[r2] = r10     // Catch: java.lang.Throwable -> L7b
            r6[r7] = r0     // Catch: java.lang.Throwable -> L7b
            r6[r4] = r9     // Catch: java.lang.Throwable -> L7b
            r6[r5] = r9     // Catch: java.lang.Throwable -> L7b
            r1.getMethod(r3, r6)     // Catch: java.lang.Throwable -> L7b
            return r7
        L7b:
            return r2
    }

    /* renamed from: f */
    public static boolean m10242f(java.lang.Object r1, long r2) {
            m9.q1$e r0 = p221m9.C4483q1.f18215f
            boolean r1 = r0.mo10262c(r1, r2)
            return r1
    }

    /* renamed from: g */
    public static byte m10243g(byte[] r3, long r4) {
            m9.q1$e r0 = p221m9.C4483q1.f18215f
            long r1 = p221m9.C4483q1.f18218i
            long r1 = r1 + r4
            byte r3 = r0.mo10263d(r3, r1)
            return r3
    }

    /* renamed from: h */
    public static byte m10244h(java.lang.Object r2, long r3) {
            r0 = -4
            long r0 = r0 & r3
            int r2 = m10248l(r2, r0)
            long r3 = ~r3
            r0 = 3
            long r3 = r3 & r0
            r0 = 3
            long r3 = r3 << r0
            int r4 = (int) r3
            int r2 = r2 >>> r4
            r2 = r2 & 255(0xff, float:3.57E-43)
            byte r2 = (byte) r2
            return r2
    }

    /* renamed from: i */
    public static byte m10245i(java.lang.Object r2, long r3) {
            r0 = -4
            long r0 = r0 & r3
            int r2 = m10248l(r2, r0)
            r0 = 3
            long r3 = r3 & r0
            r0 = 3
            long r3 = r3 << r0
            int r4 = (int) r3
            int r2 = r2 >>> r4
            r2 = r2 & 255(0xff, float:3.57E-43)
            byte r2 = (byte) r2
            return r2
    }

    /* renamed from: j */
    public static double m10246j(java.lang.Object r1, long r2) {
            m9.q1$e r0 = p221m9.C4483q1.f18215f
            double r1 = r0.mo10264e(r1, r2)
            return r1
    }

    /* renamed from: k */
    public static float m10247k(java.lang.Object r1, long r2) {
            m9.q1$e r0 = p221m9.C4483q1.f18215f
            float r1 = r0.mo10265f(r1, r2)
            return r1
    }

    /* renamed from: l */
    public static int m10248l(java.lang.Object r1, long r2) {
            m9.q1$e r0 = p221m9.C4483q1.f18215f
            int r1 = r0.m10272g(r1, r2)
            return r1
    }

    /* renamed from: m */
    public static long m10249m(java.lang.Object r1, long r2) {
            m9.q1$e r0 = p221m9.C4483q1.f18215f
            long r1 = r0.m10273h(r1, r2)
            return r1
    }

    /* renamed from: n */
    public static java.lang.Object m10250n(java.lang.Object r1, long r2) {
            m9.q1$e r0 = p221m9.C4483q1.f18215f
            java.lang.Object r1 = r0.m10274i(r1, r2)
            return r1
    }

    /* renamed from: o */
    public static sun.misc.Unsafe m10251o() {
            m9.q1$a r0 = new m9.q1$a     // Catch: java.lang.Throwable -> Lc
            r0.<init>()     // Catch: java.lang.Throwable -> Lc
            java.lang.Object r0 = java.security.AccessController.doPrivileged(r0)     // Catch: java.lang.Throwable -> Lc
            sun.misc.Unsafe r0 = (sun.misc.Unsafe) r0     // Catch: java.lang.Throwable -> Lc
            goto Ld
        Lc:
            r0 = 0
        Ld:
            return r0
    }

    /* renamed from: p */
    public static void m10252p(java.lang.Object r1, long r2, boolean r4) {
            m9.q1$e r0 = p221m9.C4483q1.f18215f
            r0.mo10266k(r1, r2, r4)
            return
    }

    /* renamed from: q */
    public static void m10253q(byte[] r3, long r4, byte r6) {
            m9.q1$e r0 = p221m9.C4483q1.f18215f
            long r1 = p221m9.C4483q1.f18218i
            long r1 = r1 + r4
            r0.mo10267l(r3, r1, r6)
            return
    }

    /* renamed from: r */
    public static void m10254r(java.lang.Object r4, long r5, byte r7) {
            r0 = -4
            long r0 = r0 & r5
            int r2 = m10248l(r4, r0)
            int r6 = (int) r5
            int r5 = ~r6
            r5 = r5 & 3
            int r5 = r5 << 3
            r6 = 255(0xff, float:3.57E-43)
            int r3 = r6 << r5
            int r3 = ~r3
            r2 = r2 & r3
            r6 = r6 & r7
            int r5 = r6 << r5
            r5 = r5 | r2
            m9.q1$e r6 = p221m9.C4483q1.f18215f
            r6.m10276o(r4, r0, r5)
            return
    }

    /* renamed from: s */
    public static void m10255s(java.lang.Object r4, long r5, byte r7) {
            r0 = -4
            long r0 = r0 & r5
            int r2 = m10248l(r4, r0)
            int r6 = (int) r5
            r5 = r6 & 3
            int r5 = r5 << 3
            r6 = 255(0xff, float:3.57E-43)
            int r3 = r6 << r5
            int r3 = ~r3
            r2 = r2 & r3
            r6 = r6 & r7
            int r5 = r6 << r5
            r5 = r5 | r2
            m9.q1$e r6 = p221m9.C4483q1.f18215f
            r6.m10276o(r4, r0, r5)
            return
    }

    /* renamed from: t */
    public static void m10256t(java.lang.Object r6, long r7, double r9) {
            m9.q1$e r0 = p221m9.C4483q1.f18215f
            r1 = r6
            r2 = r7
            r4 = r9
            r0.mo10268m(r1, r2, r4)
            return
    }

    /* renamed from: u */
    public static void m10257u(java.lang.Object r1, long r2, float r4) {
            m9.q1$e r0 = p221m9.C4483q1.f18215f
            r0.mo10269n(r1, r2, r4)
            return
    }

    /* renamed from: v */
    public static void m10258v(java.lang.Object r1, long r2, int r4) {
            m9.q1$e r0 = p221m9.C4483q1.f18215f
            r0.m10276o(r1, r2, r4)
            return
    }

    /* renamed from: w */
    public static void m10259w(java.lang.Object r6, long r7, long r9) {
            m9.q1$e r0 = p221m9.C4483q1.f18215f
            r1 = r6
            r2 = r7
            r4 = r9
            r0.m10277p(r1, r2, r4)
            return
    }

    /* renamed from: x */
    public static void m10260x(java.lang.Object r1, long r2, java.lang.Object r4) {
            m9.q1$e r0 = p221m9.C4483q1.f18215f
            r0.m10278q(r1, r2, r4)
            return
    }
}
