package p213m1;

/* renamed from: m1.a */
/* loaded from: classes.dex */
public class C4315a {

    /* renamed from: e */
    public static final java.util.Map<java.lang.String, java.util.concurrent.locks.Lock> f17585e = null;

    /* renamed from: a */
    public final java.io.File f17586a;

    /* renamed from: b */
    public final java.util.concurrent.locks.Lock f17587b;

    /* renamed from: c */
    public final boolean f17588c;

    /* renamed from: d */
    public java.nio.channels.FileChannel f17589d;

    static {
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            p213m1.C4315a.f17585e = r0
            return
    }

    public C4315a(java.lang.String r3, java.io.File r4, boolean r5) {
            r2 = this;
            r2.<init>()
            java.io.File r0 = new java.io.File
            java.lang.String r1 = ".lck"
            java.lang.String r3 = p064e.C1493g.m4049a(r3, r1)
            r0.<init>(r4, r3)
            r2.f17586a = r0
            java.lang.String r3 = r0.getAbsolutePath()
            java.util.Map<java.lang.String, java.util.concurrent.locks.Lock> r4 = p213m1.C4315a.f17585e
            monitor-enter(r4)
            r0 = r4
            java.util.HashMap r0 = (java.util.HashMap) r0     // Catch: java.lang.Throwable -> L33
            java.lang.Object r0 = r0.get(r3)     // Catch: java.lang.Throwable -> L33
            java.util.concurrent.locks.Lock r0 = (java.util.concurrent.locks.Lock) r0     // Catch: java.lang.Throwable -> L33
            if (r0 != 0) goto L2d
            java.util.concurrent.locks.ReentrantLock r0 = new java.util.concurrent.locks.ReentrantLock     // Catch: java.lang.Throwable -> L33
            r0.<init>()     // Catch: java.lang.Throwable -> L33
            r1 = r4
            java.util.HashMap r1 = (java.util.HashMap) r1     // Catch: java.lang.Throwable -> L33
            r1.put(r3, r0)     // Catch: java.lang.Throwable -> L33
        L2d:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L33
            r2.f17587b = r0
            r2.f17588c = r5
            return
        L33:
            r3 = move-exception
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L33
            throw r3
    }

    /* renamed from: a */
    public void m9643a() {
            r1 = this;
            java.nio.channels.FileChannel r0 = r1.f17589d
            if (r0 == 0) goto L7
            r0.close()     // Catch: java.io.IOException -> L7
        L7:
            java.util.concurrent.locks.Lock r0 = r1.f17587b
            r0.unlock()
            return
    }
}
