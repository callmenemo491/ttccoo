package ad;

/* renamed from: ad.g */
/* loaded from: classes.dex */
public class C0064g {

    /* renamed from: e */
    public static ad.C0064g f197e;

    /* renamed from: a */
    public android.os.Handler f198a;

    /* renamed from: b */
    public android.os.HandlerThread f199b;

    /* renamed from: c */
    public int f200c;

    /* renamed from: d */
    public final java.lang.Object f201d;

    public C0064g() {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.f200c = r0
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            r1.f201d = r0
            return
    }

    /* renamed from: a */
    public final void m102a() {
            r3 = this;
            java.lang.Object r0 = r3.f201d
            monitor-enter(r0)
            android.os.Handler r1 = r3.f198a     // Catch: java.lang.Throwable -> L2f
            if (r1 != 0) goto L2d
            int r1 = r3.f200c     // Catch: java.lang.Throwable -> L2f
            if (r1 <= 0) goto L25
            android.os.HandlerThread r1 = new android.os.HandlerThread     // Catch: java.lang.Throwable -> L2f
            java.lang.String r2 = "CameraThread"
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L2f
            r3.f199b = r1     // Catch: java.lang.Throwable -> L2f
            r1.start()     // Catch: java.lang.Throwable -> L2f
            android.os.Handler r1 = new android.os.Handler     // Catch: java.lang.Throwable -> L2f
            android.os.HandlerThread r2 = r3.f199b     // Catch: java.lang.Throwable -> L2f
            android.os.Looper r2 = r2.getLooper()     // Catch: java.lang.Throwable -> L2f
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L2f
            r3.f198a = r1     // Catch: java.lang.Throwable -> L2f
            goto L2d
        L25:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L2f
            java.lang.String r2 = "CameraThread is not open"
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L2f
            throw r1     // Catch: java.lang.Throwable -> L2f
        L2d:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L2f
            return
        L2f:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L2f
            throw r1
    }

    /* renamed from: b */
    public void m103b(java.lang.Runnable r3) {
            r2 = this;
            java.lang.Object r0 = r2.f201d
            monitor-enter(r0)
            r2.m102a()     // Catch: java.lang.Throwable -> Ld
            android.os.Handler r1 = r2.f198a     // Catch: java.lang.Throwable -> Ld
            r1.post(r3)     // Catch: java.lang.Throwable -> Ld
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Ld
            return
        Ld:
            r3 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Ld
            throw r3
    }
}
