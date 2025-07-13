package com.google.firebase.analytics;

/* loaded from: classes.dex */
public final class FirebaseAnalytics {

    /* renamed from: b */
    public static volatile com.google.firebase.analytics.FirebaseAnalytics f6577b;

    /* renamed from: a */
    public final p185k7.C3918o1 f6578a;

    public FirebaseAnalytics(p185k7.C3918o1 r2) {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = "null reference"
            java.util.Objects.requireNonNull(r2, r0)
            r1.f6578a = r2
            return
    }

    @androidx.annotation.Keep
    public static com.google.firebase.analytics.FirebaseAnalytics getInstance(android.content.Context r2) {
            com.google.firebase.analytics.FirebaseAnalytics r0 = com.google.firebase.analytics.FirebaseAnalytics.f6577b
            if (r0 != 0) goto L1c
            java.lang.Class<com.google.firebase.analytics.FirebaseAnalytics> r0 = com.google.firebase.analytics.FirebaseAnalytics.class
            monitor-enter(r0)
            com.google.firebase.analytics.FirebaseAnalytics r1 = com.google.firebase.analytics.FirebaseAnalytics.f6577b     // Catch: java.lang.Throwable -> L19
            if (r1 != 0) goto L17
            r1 = 0
            k7.o1 r2 = p185k7.C3918o1.m8850c(r2, r1, r1, r1, r1)     // Catch: java.lang.Throwable -> L19
            com.google.firebase.analytics.FirebaseAnalytics r1 = new com.google.firebase.analytics.FirebaseAnalytics     // Catch: java.lang.Throwable -> L19
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L19
            com.google.firebase.analytics.FirebaseAnalytics.f6577b = r1     // Catch: java.lang.Throwable -> L19
        L17:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L19
            goto L1c
        L19:
            r2 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L19
            throw r2
        L1c:
            com.google.firebase.analytics.FirebaseAnalytics r2 = com.google.firebase.analytics.FirebaseAnalytics.f6577b
            return r2
    }

    @androidx.annotation.Keep
    /* renamed from: getScionFrontendApiImplementation */
    public static p249o7.InterfaceC4987e5 m3627x393c8c98(android.content.Context r1, android.os.Bundle r2) {
            r0 = 0
            k7.o1 r1 = p185k7.C3918o1.m8850c(r1, r0, r0, r0, r2)
            if (r1 != 0) goto L8
            return r0
        L8:
            r9.a r2 = new r9.a
            r2.<init>(r1)
            return r2
    }

    @androidx.annotation.Keep
    public java.lang.String getFirebaseInstanceId() {
            r4 = this;
            java.lang.Object r0 = p412xa.C7010c.f27312m     // Catch: java.lang.InterruptedException -> L19 java.util.concurrent.ExecutionException -> L1b java.util.concurrent.TimeoutException -> L23
            o9.d r0 = p251o9.C5180d.m11494c()     // Catch: java.lang.InterruptedException -> L19 java.util.concurrent.ExecutionException -> L1b java.util.concurrent.TimeoutException -> L23
            xa.c r0 = p412xa.C7010c.m14153f(r0)     // Catch: java.lang.InterruptedException -> L19 java.util.concurrent.ExecutionException -> L1b java.util.concurrent.TimeoutException -> L23
            s7.i r0 = r0.mo14165r()     // Catch: java.lang.InterruptedException -> L19 java.util.concurrent.ExecutionException -> L1b java.util.concurrent.TimeoutException -> L23
            r1 = 30000(0x7530, double:1.4822E-319)
            java.util.concurrent.TimeUnit r3 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch: java.lang.InterruptedException -> L19 java.util.concurrent.ExecutionException -> L1b java.util.concurrent.TimeoutException -> L23
            java.lang.Object r0 = p327s7.C5988l.m12461b(r0, r1, r3)     // Catch: java.lang.InterruptedException -> L19 java.util.concurrent.ExecutionException -> L1b java.util.concurrent.TimeoutException -> L23
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.InterruptedException -> L19 java.util.concurrent.ExecutionException -> L1b java.util.concurrent.TimeoutException -> L23
            return r0
        L19:
            r0 = move-exception
            goto L1d
        L1b:
            r0 = move-exception
            goto L2b
        L1d:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>(r0)
            throw r1
        L23:
            java.lang.IllegalThreadStateException r0 = new java.lang.IllegalThreadStateException
            java.lang.String r1 = "Firebase Installations getId Task has timed out."
            r0.<init>(r1)
            throw r0
        L2b:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.Throwable r0 = r0.getCause()
            r1.<init>(r0)
            throw r1
    }

    @androidx.annotation.Keep
    @java.lang.Deprecated
    public void setCurrentScreen(android.app.Activity r3, java.lang.String r4, java.lang.String r5) {
            r2 = this;
            k7.o1 r0 = r2.f6578a
            java.util.Objects.requireNonNull(r0)
            k7.a1 r1 = new k7.a1
            r1.<init>(r0, r3, r4, r5)
            java.util.concurrent.ExecutorService r3 = r0.f16791a
            r3.execute(r1)
            return
    }
}
