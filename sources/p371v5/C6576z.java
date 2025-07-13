package p371v5;

/* renamed from: v5.z */
/* loaded from: classes.dex */
public final class C6576z {

    /* renamed from: a */
    public long f25726a;

    /* renamed from: b */
    public long f25727b;

    /* renamed from: c */
    public long f25728c;

    /* renamed from: d */
    public final java.lang.ThreadLocal<java.lang.Long> f25729d;

    public C6576z(long r2) {
            r1 = this;
            r1.<init>()
            java.lang.ThreadLocal r0 = new java.lang.ThreadLocal
            r0.<init>()
            r1.f25729d = r0
            r1.m13447e(r2)
            return
    }

    /* renamed from: a */
    public synchronized long m13443a(long r6) {
            r5 = this;
            monitor-enter(r5)
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r2 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r2 != 0) goto Lc
            monitor-exit(r5)
            return r0
        Lc:
            long r2 = r5.f25727b     // Catch: java.lang.Throwable -> L39
            int r4 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r4 != 0) goto L32
            long r0 = r5.f25726a     // Catch: java.lang.Throwable -> L39
            r2 = 9223372036854775806(0x7ffffffffffffffe, double:NaN)
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L2c
            java.lang.ThreadLocal<java.lang.Long> r0 = r5.f25729d     // Catch: java.lang.Throwable -> L39
            java.lang.Object r0 = r0.get()     // Catch: java.lang.Throwable -> L39
            java.lang.Long r0 = (java.lang.Long) r0     // Catch: java.lang.Throwable -> L39
            java.util.Objects.requireNonNull(r0)     // Catch: java.lang.Throwable -> L39
            long r0 = r0.longValue()     // Catch: java.lang.Throwable -> L39
        L2c:
            long r0 = r0 - r6
            r5.f25727b = r0     // Catch: java.lang.Throwable -> L39
            r5.notifyAll()     // Catch: java.lang.Throwable -> L39
        L32:
            r5.f25728c = r6     // Catch: java.lang.Throwable -> L39
            long r0 = r5.f25727b     // Catch: java.lang.Throwable -> L39
            long r6 = r6 + r0
            monitor-exit(r5)
            return r6
        L39:
            r6 = move-exception
            monitor-exit(r5)
            throw r6
    }

    /* renamed from: b */
    public synchronized long m13444b(long r13) {
            r12 = this;
            monitor-enter(r12)
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r2 = (r13 > r0 ? 1 : (r13 == r0 ? 0 : -1))
            if (r2 != 0) goto Lc
            monitor-exit(r12)
            return r0
        Lc:
            long r2 = r12.f25728c     // Catch: java.lang.Throwable -> L4d
            r4 = 90000(0x15f90, double:4.4466E-319)
            r6 = 1000000(0xf4240, double:4.940656E-318)
            int r8 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r8 == 0) goto L44
            long r2 = r2 * r4
            long r2 = r2 / r6
            r0 = 4294967296(0x100000000, double:2.121995791E-314)
            long r0 = r0 + r2
            r8 = 8589934592(0x200000000, double:4.243991582E-314)
            long r0 = r0 / r8
            r10 = 1
            long r10 = r0 - r10
            long r10 = r10 * r8
            long r10 = r10 + r13
            long r0 = r0 * r8
            long r0 = r0 + r13
            long r13 = r10 - r2
            long r13 = java.lang.Math.abs(r13)     // Catch: java.lang.Throwable -> L4d
            long r2 = r0 - r2
            long r2 = java.lang.Math.abs(r2)     // Catch: java.lang.Throwable -> L4d
            int r8 = (r13 > r2 ? 1 : (r13 == r2 ? 0 : -1))
            if (r8 >= 0) goto L43
            r13 = r10
            goto L44
        L43:
            r13 = r0
        L44:
            long r13 = r13 * r6
            long r13 = r13 / r4
            long r13 = r12.m13443a(r13)     // Catch: java.lang.Throwable -> L4d
            monitor-exit(r12)
            return r13
        L4d:
            r13 = move-exception
            monitor-exit(r12)
            throw r13
    }

    /* renamed from: c */
    public synchronized long m13445c() {
            r5 = this;
            monitor-enter(r5)
            long r0 = r5.f25726a     // Catch: java.lang.Throwable -> L1c
            r2 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto L15
            r2 = 9223372036854775806(0x7ffffffffffffffe, double:NaN)
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L1a
        L15:
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
        L1a:
            monitor-exit(r5)
            return r0
        L1c:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
    }

    /* renamed from: d */
    public synchronized long m13446d() {
            r2 = this;
            monitor-enter(r2)
            long r0 = r2.f25727b     // Catch: java.lang.Throwable -> L5
            monitor-exit(r2)
            return r0
        L5:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
    }

    /* renamed from: e */
    public synchronized void m13447e(long r6) {
            r5 = this;
            monitor-enter(r5)
            r5.f25726a = r6     // Catch: java.lang.Throwable -> L1b
            r0 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r4 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r4 != 0) goto L14
            r6 = 0
            goto L15
        L14:
            r6 = r2
        L15:
            r5.f25727b = r6     // Catch: java.lang.Throwable -> L1b
            r5.f25728c = r2     // Catch: java.lang.Throwable -> L1b
            monitor-exit(r5)
            return
        L1b:
            r6 = move-exception
            monitor-exit(r5)
            throw r6
    }
}
