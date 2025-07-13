package p012ab;

/* renamed from: ab.e */
/* loaded from: classes.dex */
public class C0053e {

    /* renamed from: d */
    public static final long f122d = 0;

    /* renamed from: e */
    public static final long f123e = 0;

    /* renamed from: a */
    public final p412xa.C7017j f124a;

    /* renamed from: b */
    public long f125b;

    /* renamed from: c */
    public int f126c;

    static {
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.HOURS
            r1 = 24
            long r0 = r0.toMillis(r1)
            p012ab.C0053e.f122d = r0
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.MINUTES
            r1 = 30
            long r0 = r0.toMillis(r1)
            p012ab.C0053e.f123e = r0
            return
    }

    public C0053e() {
            r1 = this;
            r1.<init>()
            xa.j r0 = p412xa.C7017j.m14169c()
            r1.f124a = r0
            return
    }

    /* renamed from: a */
    public synchronized boolean m75a() {
            r5 = this;
            monitor-enter(r5)
            int r0 = r5.f126c     // Catch: java.lang.Throwable -> L17
            if (r0 == 0) goto L14
            xa.j r0 = r5.f124a     // Catch: java.lang.Throwable -> L17
            long r0 = r0.m14170a()     // Catch: java.lang.Throwable -> L17
            long r2 = r5.f125b     // Catch: java.lang.Throwable -> L17
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 <= 0) goto L12
            goto L14
        L12:
            r0 = 0
            goto L15
        L14:
            r0 = 1
        L15:
            monitor-exit(r5)
            return r0
        L17:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
    }

    /* renamed from: b */
    public synchronized void m76b(int r7) {
            r6 = this;
            monitor-enter(r6)
            r0 = 200(0xc8, float:2.8E-43)
            r1 = 0
            r2 = 1
            if (r7 < r0) goto Lb
            r0 = 300(0x12c, float:4.2E-43)
            if (r7 < r0) goto L16
        Lb:
            r0 = 401(0x191, float:5.62E-43)
            if (r7 == r0) goto L16
            r0 = 404(0x194, float:5.66E-43)
            if (r7 != r0) goto L14
            goto L16
        L14:
            r0 = 0
            goto L17
        L16:
            r0 = 1
        L17:
            if (r0 == 0) goto L22
            monitor-enter(r6)     // Catch: java.lang.Throwable -> L6f
            r6.f126c = r1     // Catch: java.lang.Throwable -> L1f
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L6f
            monitor-exit(r6)
            return
        L1f:
            r7 = move-exception
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L6f
            throw r7     // Catch: java.lang.Throwable -> L6f
        L22:
            int r0 = r6.f126c     // Catch: java.lang.Throwable -> L6f
            int r0 = r0 + r2
            r6.f126c = r0     // Catch: java.lang.Throwable -> L6f
            monitor-enter(r6)     // Catch: java.lang.Throwable -> L6f
            r0 = 429(0x1ad, float:6.01E-43)
            if (r7 == r0) goto L34
            r0 = 500(0x1f4, float:7.0E-43)
            if (r7 < r0) goto L35
            r0 = 600(0x258, float:8.41E-43)
            if (r7 >= r0) goto L35
        L34:
            r1 = 1
        L35:
            if (r1 != 0) goto L3d
            long r0 = p012ab.C0053e.f122d     // Catch: java.lang.Throwable -> L3b
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L6f
            goto L62
        L3b:
            r7 = move-exception
            goto L6d
        L3d:
            r0 = 4611686018427387904(0x4000000000000000, double:2.0)
            int r7 = r6.f126c     // Catch: java.lang.Throwable -> L3b
            double r2 = (double) r7     // Catch: java.lang.Throwable -> L3b
            double r0 = java.lang.Math.pow(r0, r2)     // Catch: java.lang.Throwable -> L3b
            xa.j r7 = r6.f124a     // Catch: java.lang.Throwable -> L3b
            java.util.Objects.requireNonNull(r7)     // Catch: java.lang.Throwable -> L3b
            double r2 = java.lang.Math.random()     // Catch: java.lang.Throwable -> L3b
            r4 = 4652007308841189376(0x408f400000000000, double:1000.0)
            double r2 = r2 * r4
            long r2 = (long) r2     // Catch: java.lang.Throwable -> L3b
            double r2 = (double) r2     // Catch: java.lang.Throwable -> L3b
            double r0 = r0 + r2
            long r2 = p012ab.C0053e.f123e     // Catch: java.lang.Throwable -> L3b
            double r2 = (double) r2     // Catch: java.lang.Throwable -> L3b
            double r0 = java.lang.Math.min(r0, r2)     // Catch: java.lang.Throwable -> L3b
            long r0 = (long) r0
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L6f
        L62:
            xa.j r7 = r6.f124a     // Catch: java.lang.Throwable -> L6f
            long r2 = r7.m14170a()     // Catch: java.lang.Throwable -> L6f
            long r2 = r2 + r0
            r6.f125b = r2     // Catch: java.lang.Throwable -> L6f
            monitor-exit(r6)
            return
        L6d:
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L6f
            throw r7     // Catch: java.lang.Throwable -> L6f
        L6f:
            r7 = move-exception
            monitor-exit(r6)
            throw r7
    }
}
