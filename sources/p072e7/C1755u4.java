package p072e7;

/* renamed from: e7.u4 */
/* loaded from: classes.dex */
public final class C1755u4 extends p072e7.AbstractC1677m4 {

    /* renamed from: a */
    public static final sun.misc.Unsafe f7800a = null;

    /* renamed from: b */
    public static final long f7801b = 0;

    /* renamed from: c */
    public static final long f7802c = 0;

    /* renamed from: d */
    public static final long f7803d = 0;

    /* renamed from: e */
    public static final long f7804e = 0;

    /* renamed from: f */
    public static final long f7805f = 0;

    /* renamed from: e7.u4$a */
    public class a implements java.security.PrivilegedExceptionAction<sun.misc.Unsafe> {
        public a() {
                r0 = this;
                r0.<init>()
                return
        }

        /* renamed from: a */
        public static final sun.misc.Unsafe m4453a() {
                java.lang.Class<sun.misc.Unsafe> r0 = sun.misc.Unsafe.class
                java.lang.reflect.Field[] r1 = r0.getDeclaredFields()
                int r2 = r1.length
                r3 = 0
            L8:
                if (r3 >= r2) goto L25
                r4 = r1[r3]
                r5 = 1
                r4.setAccessible(r5)
                r5 = 0
                java.lang.Object r4 = r4.get(r5)
                boolean r5 = r0.isInstance(r4)
                if (r5 == 0) goto L22
                java.lang.Object r0 = r0.cast(r4)
                sun.misc.Unsafe r0 = (sun.misc.Unsafe) r0
                return r0
            L22:
                int r3 = r3 + 1
                goto L8
            L25:
                java.lang.NoSuchFieldError r0 = new java.lang.NoSuchFieldError
                java.lang.String r1 = "the Unsafe"
                r0.<init>(r1)
                throw r0
        }

        @Override // java.security.PrivilegedExceptionAction
        public final /* bridge */ /* synthetic */ sun.misc.Unsafe run() {
                r1 = this;
                sun.misc.Unsafe r0 = m4453a()
                return r0
        }
    }

    static {
            java.lang.Class<e7.v4> r0 = p072e7.C1764v4.class
            sun.misc.Unsafe r1 = sun.misc.Unsafe.getUnsafe()     // Catch: java.lang.SecurityException -> L7
            goto L12
        L7:
            e7.u4$a r1 = new e7.u4$a     // Catch: java.security.PrivilegedActionException -> L63
            r1.<init>()     // Catch: java.security.PrivilegedActionException -> L63
            java.lang.Object r1 = java.security.AccessController.doPrivileged(r1)     // Catch: java.security.PrivilegedActionException -> L63
            sun.misc.Unsafe r1 = (sun.misc.Unsafe) r1     // Catch: java.security.PrivilegedActionException -> L63
        L12:
            java.lang.Class<e7.w4> r2 = p072e7.AbstractC1773w4.class
            java.lang.String r3 = "a0"
            java.lang.reflect.Field r3 = r2.getDeclaredField(r3)     // Catch: java.lang.Exception -> L53
            long r3 = r1.objectFieldOffset(r3)     // Catch: java.lang.Exception -> L53
            p072e7.C1755u4.f7802c = r3     // Catch: java.lang.Exception -> L53
            java.lang.String r3 = "Z"
            java.lang.reflect.Field r3 = r2.getDeclaredField(r3)     // Catch: java.lang.Exception -> L53
            long r3 = r1.objectFieldOffset(r3)     // Catch: java.lang.Exception -> L53
            p072e7.C1755u4.f7801b = r3     // Catch: java.lang.Exception -> L53
            java.lang.String r3 = "Y"
            java.lang.reflect.Field r2 = r2.getDeclaredField(r3)     // Catch: java.lang.Exception -> L53
            long r2 = r1.objectFieldOffset(r2)     // Catch: java.lang.Exception -> L53
            p072e7.C1755u4.f7803d = r2     // Catch: java.lang.Exception -> L53
            java.lang.String r2 = "a"
            java.lang.reflect.Field r2 = r0.getDeclaredField(r2)     // Catch: java.lang.Exception -> L53
            long r2 = r1.objectFieldOffset(r2)     // Catch: java.lang.Exception -> L53
            p072e7.C1755u4.f7804e = r2     // Catch: java.lang.Exception -> L53
            java.lang.String r2 = "b"
            java.lang.reflect.Field r0 = r0.getDeclaredField(r2)     // Catch: java.lang.Exception -> L53
            long r2 = r1.objectFieldOffset(r0)     // Catch: java.lang.Exception -> L53
            p072e7.C1755u4.f7805f = r2     // Catch: java.lang.Exception -> L53
            p072e7.C1755u4.f7800a = r1     // Catch: java.lang.Exception -> L53
            return
        L53:
            r0 = move-exception
            java.lang.Object r1 = p072e7.C1682n.f7693a
            boolean r1 = r0 instanceof java.lang.RuntimeException
            if (r1 != 0) goto L60
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            r1.<init>(r0)
            throw r1
        L60:
            java.lang.RuntimeException r0 = (java.lang.RuntimeException) r0
            throw r0
        L63:
            r0 = move-exception
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            java.lang.Throwable r0 = r0.getCause()
            java.lang.String r2 = "Could not initialize intrinsics"
            r1.<init>(r2, r0)
            throw r1
    }

    public /* synthetic */ C1755u4() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // p072e7.AbstractC1677m4
    /* renamed from: a */
    public final void mo4335a(p072e7.C1764v4 r4, p072e7.C1764v4 r5) {
            r3 = this;
            sun.misc.Unsafe r0 = p072e7.C1755u4.f7800a
            long r1 = p072e7.C1755u4.f7805f
            r0.putObject(r4, r1, r5)
            return
    }

    @Override // p072e7.AbstractC1677m4
    /* renamed from: b */
    public final void mo4336b(p072e7.C1764v4 r4, java.lang.Thread r5) {
            r3 = this;
            sun.misc.Unsafe r0 = p072e7.C1755u4.f7800a
            long r1 = p072e7.C1755u4.f7804e
            r0.putObject(r4, r1, r5)
            return
    }

    @Override // p072e7.AbstractC1677m4
    /* renamed from: c */
    public final boolean mo4337c(p072e7.AbstractC1773w4<?> r7, p072e7.C1707p4 r8, p072e7.C1707p4 r9) {
            r6 = this;
            sun.misc.Unsafe r0 = p072e7.C1755u4.f7800a
            long r2 = p072e7.C1755u4.f7801b
            r1 = r7
            r4 = r8
            r5 = r9
            boolean r7 = r0.compareAndSwapObject(r1, r2, r4, r5)
            return r7
    }

    @Override // p072e7.AbstractC1677m4
    /* renamed from: d */
    public final boolean mo4338d(p072e7.AbstractC1773w4<?> r7, java.lang.Object r8, java.lang.Object r9) {
            r6 = this;
            sun.misc.Unsafe r0 = p072e7.C1755u4.f7800a
            long r2 = p072e7.C1755u4.f7803d
            r1 = r7
            r4 = r8
            r5 = r9
            boolean r7 = r0.compareAndSwapObject(r1, r2, r4, r5)
            return r7
    }

    @Override // p072e7.AbstractC1677m4
    /* renamed from: e */
    public final boolean mo4339e(p072e7.AbstractC1773w4<?> r7, p072e7.C1764v4 r8, p072e7.C1764v4 r9) {
            r6 = this;
            sun.misc.Unsafe r0 = p072e7.C1755u4.f7800a
            long r2 = p072e7.C1755u4.f7802c
            r1 = r7
            r4 = r8
            r5 = r9
            boolean r7 = r0.compareAndSwapObject(r1, r2, r4, r5)
            return r7
    }
}
