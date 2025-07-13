package p057db;

/* renamed from: db.l */
/* loaded from: classes.dex */
public class C1409l {

    /* renamed from: b */
    public static final java.lang.Object f7068b = null;

    /* renamed from: c */
    public static p057db.ServiceConnectionC1412m0 f7069c;

    /* renamed from: a */
    public final android.content.Context f7070a;

    static {
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            p057db.C1409l.f7068b = r0
            return
    }

    public C1409l(android.content.Context r1) {
            r0 = this;
            r0.<init>()
            r0.f7070a = r1
            return
    }

    /* renamed from: a */
    public static p327s7.AbstractC5985i<java.lang.Integer> m3932a(android.content.Context r6, android.content.Intent r7) {
            java.lang.String r0 = "FirebaseMessaging"
            r1 = 3
            boolean r0 = android.util.Log.isLoggable(r0, r1)
            if (r0 == 0) goto L10
            java.lang.String r0 = "FirebaseMessaging"
            java.lang.String r2 = "Binding to service"
            android.util.Log.d(r0, r2)
        L10:
            java.lang.String r0 = "com.google.firebase.MESSAGING_EVENT"
            java.lang.Object r2 = p057db.C1409l.f7068b
            monitor-enter(r2)
            db.m0 r3 = p057db.C1409l.f7069c     // Catch: java.lang.Throwable -> L78
            if (r3 != 0) goto L20
            db.m0 r3 = new db.m0     // Catch: java.lang.Throwable -> L78
            r3.<init>(r6, r0)     // Catch: java.lang.Throwable -> L78
            p057db.C1409l.f7069c = r3     // Catch: java.lang.Throwable -> L78
        L20:
            db.m0 r6 = p057db.C1409l.f7069c     // Catch: java.lang.Throwable -> L78
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L78
            monitor-enter(r6)
            java.lang.String r0 = "FirebaseMessaging"
            boolean r0 = android.util.Log.isLoggable(r0, r1)     // Catch: java.lang.Throwable -> L75
            if (r0 == 0) goto L33
            java.lang.String r0 = "FirebaseMessaging"
            java.lang.String r1 = "new intent queued in the bind-strategy delivery"
            android.util.Log.d(r0, r1)     // Catch: java.lang.Throwable -> L75
        L33:
            db.m0$a r0 = new db.m0$a     // Catch: java.lang.Throwable -> L75
            r0.<init>(r7)     // Catch: java.lang.Throwable -> L75
            java.util.concurrent.ScheduledExecutorService r7 = r6.f7075a0     // Catch: java.lang.Throwable -> L75
            f6.i r1 = new f6.i     // Catch: java.lang.Throwable -> L75
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L75
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch: java.lang.Throwable -> L75
            r3 = 9000(0x2328, double:4.4466E-320)
            java.util.concurrent.ScheduledFuture r1 = r7.schedule(r1, r3, r2)     // Catch: java.lang.Throwable -> L75
            s7.j<java.lang.Void> r2 = r0.f7080b     // Catch: java.lang.Throwable -> L75
            s7.q<TResult> r2 = r2.f23075a     // Catch: java.lang.Throwable -> L75
            db.k0 r3 = new db.k0     // Catch: java.lang.Throwable -> L75
            r3.<init>(r1)     // Catch: java.lang.Throwable -> L75
            z2.n r1 = r2.f23097b     // Catch: java.lang.Throwable -> L75
            s7.n r4 = new s7.n     // Catch: java.lang.Throwable -> L75
            int r5 = p327s7.C5994r.f23102a     // Catch: java.lang.Throwable -> L75
            r4.<init>(r7, r3)     // Catch: java.lang.Throwable -> L75
            r1.m14310g(r4)     // Catch: java.lang.Throwable -> L75
            r2.m12476u()     // Catch: java.lang.Throwable -> L75
            java.util.Queue<db.m0$a> r7 = r6.f7076b0     // Catch: java.lang.Throwable -> L75
            r7.add(r0)     // Catch: java.lang.Throwable -> L75
            r6.m3936b()     // Catch: java.lang.Throwable -> L75
            s7.j<java.lang.Void> r7 = r0.f7080b     // Catch: java.lang.Throwable -> L75
            s7.q<TResult> r7 = r7.f23075a     // Catch: java.lang.Throwable -> L75
            monitor-exit(r6)
            java.util.concurrent.Executor r6 = p057db.ExecutorC1401h.f7048Y
            s7.a r0 = p057db.C1403i.f7059Y
            s7.i r6 = r7.mo12447e(r6, r0)
            return r6
        L75:
            r7 = move-exception
            monitor-exit(r6)
            throw r7
        L78:
            r6 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L78
            throw r6
    }

    /* renamed from: b */
    public p327s7.AbstractC5985i<java.lang.Integer> m3933b(android.content.Intent r5) {
            r4 = this;
            java.lang.String r0 = "gcm.rawData64"
            java.lang.String r1 = r5.getStringExtra(r0)
            r2 = 0
            if (r1 == 0) goto L15
            byte[] r1 = android.util.Base64.decode(r1, r2)
            java.lang.String r3 = "rawData"
            r5.putExtra(r3, r1)
            r5.removeExtra(r0)
        L15:
            android.content.Context r0 = r4.f7070a
            boolean r1 = p353u6.C6345h.m12995a()
            if (r1 == 0) goto L28
            android.content.pm.ApplicationInfo r1 = r0.getApplicationInfo()
            int r1 = r1.targetSdkVersion
            r3 = 26
            if (r1 < r3) goto L28
            r2 = 1
        L28:
            int r1 = r5.getFlags()
            r3 = 268435456(0x10000000, float:2.524355E-29)
            r1 = r1 & r3
            if (r2 == 0) goto L38
            if (r1 != 0) goto L38
            s7.i r5 = m3932a(r0, r5)
            goto L4c
        L38:
            java.util.concurrent.Executor r1 = p057db.ExecutorC1399g.f7036Y
            o7.j4 r2 = new o7.j4
            r2.<init>(r0, r5)
            s7.i r2 = p327s7.C5988l.m12462c(r1, r2)
            androidx.appcompat.widget.x r3 = new androidx.appcompat.widget.x
            r3.<init>(r0, r5)
            s7.i r5 = r2.mo12449g(r1, r3)
        L4c:
            return r5
    }
}
