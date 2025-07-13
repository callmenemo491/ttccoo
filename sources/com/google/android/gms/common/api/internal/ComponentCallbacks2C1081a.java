package com.google.android.gms.common.api.internal;

/* renamed from: com.google.android.gms.common.api.internal.a */
/* loaded from: classes.dex */
public final class ComponentCallbacks2C1081a implements android.app.Application.ActivityLifecycleCallbacks, android.content.ComponentCallbacks2 {

    /* renamed from: c0 */
    public static final com.google.android.gms.common.api.internal.ComponentCallbacks2C1081a f5552c0 = null;

    /* renamed from: Y */
    public final java.util.concurrent.atomic.AtomicBoolean f5553Y;

    /* renamed from: Z */
    public final java.util.concurrent.atomic.AtomicBoolean f5554Z;

    /* renamed from: a0 */
    public final java.util.ArrayList<com.google.android.gms.common.api.internal.ComponentCallbacks2C1081a.a> f5555a0;

    /* renamed from: b0 */
    public boolean f5556b0;

    /* renamed from: com.google.android.gms.common.api.internal.a$a */
    public interface a {
        /* renamed from: a */
        void mo3053a(boolean r1);
    }

    static {
            com.google.android.gms.common.api.internal.a r0 = new com.google.android.gms.common.api.internal.a
            r0.<init>()
            com.google.android.gms.common.api.internal.ComponentCallbacks2C1081a.f5552c0 = r0
            return
    }

    public ComponentCallbacks2C1081a() {
            r1 = this;
            r1.<init>()
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
            r0.<init>()
            r1.f5553Y = r0
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
            r0.<init>()
            r1.f5554Z = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.f5555a0 = r0
            r0 = 0
            r1.f5556b0 = r0
            return
    }

    /* renamed from: b */
    public static void m3050b(@androidx.annotation.RecentlyNonNull android.app.Application r2) {
            com.google.android.gms.common.api.internal.a r0 = com.google.android.gms.common.api.internal.ComponentCallbacks2C1081a.f5552c0
            monitor-enter(r0)
            boolean r1 = r0.f5556b0     // Catch: java.lang.Throwable -> L12
            if (r1 != 0) goto L10
            r2.registerActivityLifecycleCallbacks(r0)     // Catch: java.lang.Throwable -> L12
            r2.registerComponentCallbacks(r0)     // Catch: java.lang.Throwable -> L12
            r2 = 1
            r0.f5556b0 = r2     // Catch: java.lang.Throwable -> L12
        L10:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L12
            return
        L12:
            r2 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L12
            throw r2
    }

    /* renamed from: a */
    public final void m3051a(@androidx.annotation.RecentlyNonNull com.google.android.gms.common.api.internal.ComponentCallbacks2C1081a.a r3) {
            r2 = this;
            com.google.android.gms.common.api.internal.a r0 = com.google.android.gms.common.api.internal.ComponentCallbacks2C1081a.f5552c0
            monitor-enter(r0)
            java.util.ArrayList<com.google.android.gms.common.api.internal.a$a> r1 = r2.f5555a0     // Catch: java.lang.Throwable -> La
            r1.add(r3)     // Catch: java.lang.Throwable -> La
            monitor-exit(r0)     // Catch: java.lang.Throwable -> La
            return
        La:
            r3 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> La
            throw r3
    }

    /* renamed from: c */
    public final void m3052c(boolean r6) {
            r5 = this;
            com.google.android.gms.common.api.internal.a r0 = com.google.android.gms.common.api.internal.ComponentCallbacks2C1081a.f5552c0
            monitor-enter(r0)
            java.util.ArrayList<com.google.android.gms.common.api.internal.a$a> r1 = r5.f5555a0     // Catch: java.lang.Throwable -> L1a
            int r2 = r1.size()     // Catch: java.lang.Throwable -> L1a
            r3 = 0
        La:
            if (r3 >= r2) goto L18
            java.lang.Object r4 = r1.get(r3)     // Catch: java.lang.Throwable -> L1a
            int r3 = r3 + 1
            com.google.android.gms.common.api.internal.a$a r4 = (com.google.android.gms.common.api.internal.ComponentCallbacks2C1081a.a) r4     // Catch: java.lang.Throwable -> L1a
            r4.mo3053a(r6)     // Catch: java.lang.Throwable -> L1a
            goto La
        L18:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1a
            return
        L1a:
            r6 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1a
            throw r6
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(@androidx.annotation.RecentlyNonNull android.app.Activity r3, android.os.Bundle r4) {
            r2 = this;
            java.util.concurrent.atomic.AtomicBoolean r3 = r2.f5553Y
            r4 = 1
            r0 = 0
            boolean r3 = r3.compareAndSet(r4, r0)
            java.util.concurrent.atomic.AtomicBoolean r1 = r2.f5554Z
            r1.set(r4)
            if (r3 == 0) goto L12
            r2.m3052c(r0)
        L12:
            return
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(@androidx.annotation.RecentlyNonNull android.app.Activity r1) {
            r0 = this;
            return
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(@androidx.annotation.RecentlyNonNull android.app.Activity r1) {
            r0 = this;
            return
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(@androidx.annotation.RecentlyNonNull android.app.Activity r4) {
            r3 = this;
            java.util.concurrent.atomic.AtomicBoolean r4 = r3.f5553Y
            r0 = 1
            r1 = 0
            boolean r4 = r4.compareAndSet(r0, r1)
            java.util.concurrent.atomic.AtomicBoolean r2 = r3.f5554Z
            r2.set(r0)
            if (r4 == 0) goto L12
            r3.m3052c(r1)
        L12:
            return
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(@androidx.annotation.RecentlyNonNull android.app.Activity r1, @androidx.annotation.RecentlyNonNull android.os.Bundle r2) {
            r0 = this;
            return
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(@androidx.annotation.RecentlyNonNull android.app.Activity r1) {
            r0 = this;
            return
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(@androidx.annotation.RecentlyNonNull android.app.Activity r1) {
            r0 = this;
            return
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(@androidx.annotation.RecentlyNonNull android.content.res.Configuration r1) {
            r0 = this;
            return
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
            r0 = this;
            return
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int r3) {
            r2 = this;
            r0 = 20
            if (r3 != r0) goto L16
            java.util.concurrent.atomic.AtomicBoolean r3 = r2.f5553Y
            r0 = 0
            r1 = 1
            boolean r3 = r3.compareAndSet(r0, r1)
            if (r3 == 0) goto L16
            java.util.concurrent.atomic.AtomicBoolean r3 = r2.f5554Z
            r3.set(r1)
            r2.m3052c(r1)
        L16:
            return
    }
}
