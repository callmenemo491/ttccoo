package p056da;

/* renamed from: da.c0 */
/* loaded from: classes.dex */
public class C1351c0 implements java.lang.Thread.UncaughtExceptionHandler {

    /* renamed from: a */
    public final p056da.C1351c0.a f6877a;

    /* renamed from: b */
    public final p188ka.InterfaceC4076c f6878b;

    /* renamed from: c */
    public final java.lang.Thread.UncaughtExceptionHandler f6879c;

    /* renamed from: d */
    public final p011aa.InterfaceC0045a f6880d;

    /* renamed from: e */
    public final java.util.concurrent.atomic.AtomicBoolean f6881e;

    /* renamed from: da.c0$a */
    public interface a {
    }

    public C1351c0(p056da.C1351c0.a r1, p188ka.InterfaceC4076c r2, java.lang.Thread.UncaughtExceptionHandler r3, p011aa.InterfaceC0045a r4) {
            r0 = this;
            r0.<init>()
            r0.f6877a = r1
            r0.f6878b = r2
            r0.f6879c = r3
            java.util.concurrent.atomic.AtomicBoolean r1 = new java.util.concurrent.atomic.AtomicBoolean
            r2 = 0
            r1.<init>(r2)
            r0.f6881e = r1
            r0.f6880d = r4
            return
    }

    /* renamed from: a */
    public final boolean m3853a(java.lang.Thread r4, java.lang.Throwable r5) {
            r3 = this;
            r0 = 0
            r1 = 0
            java.lang.String r2 = "FirebaseCrashlytics"
            if (r4 != 0) goto Lc
            java.lang.String r4 = "Crashlytics will not record uncaught exception; null thread"
            android.util.Log.e(r2, r4, r0)
            return r1
        Lc:
            if (r5 != 0) goto L14
            java.lang.String r4 = "Crashlytics will not record uncaught exception; null throwable"
            android.util.Log.e(r2, r4, r0)
            return r1
        L14:
            aa.a r4 = r3.f6880d
            boolean r4 = r4.mo47c()
            r5 = 1
            if (r4 == 0) goto L2e
            r4 = 3
            boolean r4 = android.util.Log.isLoggable(r2, r4)
            if (r4 == 0) goto L25
            goto L26
        L25:
            r5 = 0
        L26:
            if (r5 == 0) goto L2d
            java.lang.String r4 = "Crashlytics will not record uncaught exception; native crash exists for session."
            android.util.Log.d(r2, r4, r0)
        L2d:
            return r1
        L2e:
            return r5
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public void uncaughtException(java.lang.Thread r9, java.lang.Throwable r10) {
            r8 = this;
            java.lang.String r0 = "Completed exception processing. Invoking default exception handler."
            java.lang.String r1 = "FirebaseCrashlytics"
            java.util.concurrent.atomic.AtomicBoolean r2 = r8.f6881e
            r3 = 1
            r2.set(r3)
            r2 = 0
            r4 = 3
            r5 = 0
            boolean r6 = r8.m3853a(r9, r10)     // Catch: java.lang.Throwable -> L1d java.lang.Exception -> L1f
            if (r6 == 0) goto L21
            da.c0$a r6 = r8.f6877a     // Catch: java.lang.Throwable -> L1d java.lang.Exception -> L1f
            ka.c r7 = r8.f6878b     // Catch: java.lang.Throwable -> L1d java.lang.Exception -> L1f
            da.l r6 = (p056da.C1368l) r6     // Catch: java.lang.Throwable -> L1d java.lang.Exception -> L1f
            r6.m3884a(r7, r9, r10)     // Catch: java.lang.Throwable -> L1d java.lang.Exception -> L1f
            goto L31
        L1d:
            r6 = move-exception
            goto L59
        L1f:
            r6 = move-exception
            goto L3c
        L21:
            java.lang.String r6 = "Uncaught exception will not be recorded by Crashlytics."
            boolean r7 = android.util.Log.isLoggable(r1, r4)     // Catch: java.lang.Throwable -> L1d java.lang.Exception -> L1f
            if (r7 == 0) goto L2b
            r7 = 1
            goto L2c
        L2b:
            r7 = 0
        L2c:
            if (r7 == 0) goto L31
            android.util.Log.d(r1, r6, r2)     // Catch: java.lang.Throwable -> L1d java.lang.Exception -> L1f
        L31:
            boolean r4 = android.util.Log.isLoggable(r1, r4)
            if (r4 == 0) goto L38
            goto L39
        L38:
            r3 = 0
        L39:
            if (r3 == 0) goto L4e
            goto L4b
        L3c:
            java.lang.String r7 = "An error occurred in the uncaught exception handler"
            android.util.Log.e(r1, r7, r6)     // Catch: java.lang.Throwable -> L1d
            boolean r4 = android.util.Log.isLoggable(r1, r4)
            if (r4 == 0) goto L48
            goto L49
        L48:
            r3 = 0
        L49:
            if (r3 == 0) goto L4e
        L4b:
            android.util.Log.d(r1, r0, r2)
        L4e:
            java.lang.Thread$UncaughtExceptionHandler r0 = r8.f6879c
            r0.uncaughtException(r9, r10)
            java.util.concurrent.atomic.AtomicBoolean r9 = r8.f6881e
            r9.set(r5)
            return
        L59:
            boolean r4 = android.util.Log.isLoggable(r1, r4)
            if (r4 == 0) goto L60
            goto L61
        L60:
            r3 = 0
        L61:
            if (r3 == 0) goto L66
            android.util.Log.d(r1, r0, r2)
        L66:
            java.lang.Thread$UncaughtExceptionHandler r0 = r8.f6879c
            r0.uncaughtException(r9, r10)
            java.util.concurrent.atomic.AtomicBoolean r9 = r8.f6881e
            r9.set(r5)
            throw r6
    }
}
