package p057db;

@android.annotation.SuppressLint({"UnwrappedWakefulBroadcastReceiver"})
/* renamed from: db.f */
/* loaded from: classes.dex */
public abstract class AbstractServiceC1397f extends android.app.Service {

    /* renamed from: Y */
    public final java.util.concurrent.ExecutorService f7024Y;

    /* renamed from: Z */
    public android.os.Binder f7025Z;

    /* renamed from: a0 */
    public final java.lang.Object f7026a0;

    /* renamed from: b0 */
    public int f7027b0;

    /* renamed from: c0 */
    public int f7028c0;

    /* renamed from: db.f$a */
    public class a implements p057db.BinderC1410l0.a {

        /* renamed from: a */
        public final /* synthetic */ p057db.AbstractServiceC1397f f7029a;

        public a(p057db.AbstractServiceC1397f r1) {
                r0 = this;
                r0.f7029a = r1
                r0.<init>()
                return
        }
    }

    public AbstractServiceC1397f() {
            r9 = this;
            r9.<init>()
            v6.a r7 = new v6.a
            java.lang.String r0 = "Firebase-Messaging-Intent-Handle"
            r7.<init>(r0)
            java.util.concurrent.ThreadPoolExecutor r8 = new java.util.concurrent.ThreadPoolExecutor
            java.util.concurrent.TimeUnit r5 = java.util.concurrent.TimeUnit.SECONDS
            java.util.concurrent.LinkedBlockingQueue r6 = new java.util.concurrent.LinkedBlockingQueue
            r6.<init>()
            r1 = 1
            r2 = 1
            r3 = 60
            r0 = r8
            r0.<init>(r1, r2, r3, r5, r6, r7)
            r0 = 1
            r8.allowCoreThreadTimeOut(r0)
            java.util.concurrent.ExecutorService r0 = java.util.concurrent.Executors.unconfigurableExecutorService(r8)
            r9.f7024Y = r0
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            r9.f7026a0 = r0
            r0 = 0
            r9.f7028c0 = r0
            return
    }

    /* renamed from: a */
    public final void m3917a(android.content.Intent r4) {
            r3 = this;
            if (r4 == 0) goto L21
            java.lang.Object r0 = p057db.C1404i0.f7061b
            monitor-enter(r0)
            r7.a r1 = p057db.C1404i0.f7062c     // Catch: java.lang.Throwable -> L1e
            if (r1 == 0) goto L1c
            java.lang.String r1 = "com.google.firebase.iid.WakeLockHolder.wakefulintent"
            r2 = 0
            boolean r1 = r4.getBooleanExtra(r1, r2)     // Catch: java.lang.Throwable -> L1e
            if (r1 == 0) goto L1c
            java.lang.String r1 = "com.google.firebase.iid.WakeLockHolder.wakefulintent"
            r4.putExtra(r1, r2)     // Catch: java.lang.Throwable -> L1e
            r7.a r4 = p057db.C1404i0.f7062c     // Catch: java.lang.Throwable -> L1e
            r4.m12166b()     // Catch: java.lang.Throwable -> L1e
        L1c:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1e
            goto L21
        L1e:
            r4 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1e
            throw r4
        L21:
            java.lang.Object r4 = r3.f7026a0
            monitor-enter(r4)
            int r0 = r3.f7028c0     // Catch: java.lang.Throwable -> L32
            int r0 = r0 + (-1)
            r3.f7028c0 = r0     // Catch: java.lang.Throwable -> L32
            if (r0 != 0) goto L34
            int r0 = r3.f7027b0     // Catch: java.lang.Throwable -> L32
            r3.stopSelfResult(r0)     // Catch: java.lang.Throwable -> L32
            goto L34
        L32:
            r0 = move-exception
            goto L36
        L34:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L32
            return
        L36:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L32
            throw r0
    }

    /* renamed from: b */
    public abstract void mo3666b(android.content.Intent r1);

    @Override // android.app.Service
    public final synchronized android.os.IBinder onBind(android.content.Intent r2) {
            r1 = this;
            monitor-enter(r1)
            java.lang.String r2 = "EnhancedIntentService"
            r0 = 3
            boolean r2 = android.util.Log.isLoggable(r2, r0)     // Catch: java.lang.Throwable -> L25
            if (r2 == 0) goto L11
            java.lang.String r2 = "EnhancedIntentService"
            java.lang.String r0 = "Service received bind request"
            android.util.Log.d(r2, r0)     // Catch: java.lang.Throwable -> L25
        L11:
            android.os.Binder r2 = r1.f7025Z     // Catch: java.lang.Throwable -> L25
            if (r2 != 0) goto L21
            db.l0 r2 = new db.l0     // Catch: java.lang.Throwable -> L25
            db.f$a r0 = new db.f$a     // Catch: java.lang.Throwable -> L25
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L25
            r2.<init>(r0)     // Catch: java.lang.Throwable -> L25
            r1.f7025Z = r2     // Catch: java.lang.Throwable -> L25
        L21:
            android.os.Binder r2 = r1.f7025Z     // Catch: java.lang.Throwable -> L25
            monitor-exit(r1)
            return r2
        L25:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
    }

    @Override // android.app.Service
    public void onDestroy() {
            r1 = this;
            java.util.concurrent.ExecutorService r0 = r1.f7024Y
            r0.shutdown()
            super.onDestroy()
            return
    }

    @Override // android.app.Service
    public final int onStartCommand(android.content.Intent r4, int r5, int r6) {
            r3 = this;
            java.lang.Object r5 = r3.f7026a0
            monitor-enter(r5)
            r3.f7027b0 = r6     // Catch: java.lang.Throwable -> L52
            int r6 = r3.f7028c0     // Catch: java.lang.Throwable -> L52
            int r6 = r6 + 1
            r3.f7028c0 = r6     // Catch: java.lang.Throwable -> L52
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L52
            db.a0 r5 = p057db.C1388a0.m3906a()
            java.util.Queue<android.content.Intent> r5 = r5.f7000d
            java.lang.Object r5 = r5.poll()
            android.content.Intent r5 = (android.content.Intent) r5
            r6 = 2
            if (r5 != 0) goto L1f
            r3.m3917a(r4)
            return r6
        L1f:
            s7.j r0 = new s7.j
            r0.<init>()
            java.util.concurrent.ExecutorService r1 = r3.f7024Y
            c6.h0 r2 = new c6.h0
            r2.<init>(r3, r5, r0)
            r1.execute(r2)
            s7.q<TResult> r5 = r0.f23075a
            boolean r0 = r5.mo12454l()
            if (r0 == 0) goto L3a
            r3.m3917a(r4)
            return r6
        L3a:
            java.util.concurrent.Executor r6 = p057db.ExecutorC1395e.f7019Y
            m6.a0 r0 = new m6.a0
            r0.<init>(r3, r4)
            z2.n r4 = r5.f23097b
            s7.n r1 = new s7.n
            int r2 = p327s7.C5994r.f23102a
            r1.<init>(r6, r0)
            r4.m14310g(r1)
            r5.m12476u()
            r4 = 3
            return r4
        L52:
            r4 = move-exception
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L52
            throw r4
    }
}
