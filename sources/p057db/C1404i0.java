package p057db;

/* renamed from: db.i0 */
/* loaded from: classes.dex */
public final class C1404i0 {

    /* renamed from: a */
    public static final long f7060a = 0;

    /* renamed from: b */
    public static final java.lang.Object f7061b = null;

    /* renamed from: c */
    public static p307r7.C5798a f7062c;

    static {
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.MINUTES
            r1 = 1
            long r0 = r0.toMillis(r1)
            p057db.C1404i0.f7060a = r0
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            p057db.C1404i0.f7061b = r0
            return
    }

    /* renamed from: a */
    public static android.content.ComponentName m3931a(android.content.Context r4, android.content.Intent r5) {
            java.lang.Object r0 = p057db.C1404i0.f7061b
            monitor-enter(r0)
            r7.a r1 = p057db.C1404i0.f7062c     // Catch: java.lang.Throwable -> L38
            r2 = 1
            if (r1 != 0) goto L18
            r7.a r1 = new r7.a     // Catch: java.lang.Throwable -> L38
            java.lang.String r3 = "wake:com.google.firebase.iid.WakeLockHolder"
            r1.<init>(r4, r2, r3)     // Catch: java.lang.Throwable -> L38
            p057db.C1404i0.f7062c = r1     // Catch: java.lang.Throwable -> L38
            android.os.PowerManager$WakeLock r3 = r1.f22484b     // Catch: java.lang.Throwable -> L38
            r3.setReferenceCounted(r2)     // Catch: java.lang.Throwable -> L38
            r1.f22488f = r2     // Catch: java.lang.Throwable -> L38
        L18:
            java.lang.String r1 = "com.google.firebase.iid.WakeLockHolder.wakefulintent"
            r3 = 0
            boolean r1 = r5.getBooleanExtra(r1, r3)     // Catch: java.lang.Throwable -> L38
            java.lang.String r3 = "com.google.firebase.iid.WakeLockHolder.wakefulintent"
            r5.putExtra(r3, r2)     // Catch: java.lang.Throwable -> L38
            android.content.ComponentName r4 = r4.startService(r5)     // Catch: java.lang.Throwable -> L38
            if (r4 != 0) goto L2d
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L38
            r4 = 0
            return r4
        L2d:
            if (r1 != 0) goto L36
            r7.a r5 = p057db.C1404i0.f7062c     // Catch: java.lang.Throwable -> L38
            long r1 = p057db.C1404i0.f7060a     // Catch: java.lang.Throwable -> L38
            r5.m12165a(r1)     // Catch: java.lang.Throwable -> L38
        L36:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L38
            return r4
        L38:
            r4 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L38
            throw r4
    }
}
