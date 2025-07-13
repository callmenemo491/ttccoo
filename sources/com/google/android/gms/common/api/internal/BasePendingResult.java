package com.google.android.gms.common.api.internal;

import p201l6.InterfaceC4188h;

@com.google.android.gms.common.annotation.KeepName
/* loaded from: classes.dex */
public abstract class BasePendingResult<R extends p201l6.InterfaceC4188h> extends p201l6.AbstractC4185e<R> {

    /* renamed from: a */
    public final java.lang.Object f5540a;

    /* renamed from: b */
    public final com.google.android.gms.common.api.internal.BasePendingResult.HandlerC1079a<R> f5541b;

    /* renamed from: c */
    public final java.util.concurrent.CountDownLatch f5542c;

    /* renamed from: d */
    public final java.util.ArrayList<p201l6.AbstractC4185e.a> f5543d;

    /* renamed from: e */
    public p201l6.InterfaceC4189i<? super R> f5544e;

    /* renamed from: f */
    public final java.util.concurrent.atomic.AtomicReference<p218m6.InterfaceC4410w> f5545f;

    /* renamed from: g */
    public R f5546g;

    /* renamed from: h */
    public com.google.android.gms.common.api.Status f5547h;

    /* renamed from: i */
    public volatile boolean f5548i;

    /* renamed from: j */
    public boolean f5549j;

    /* renamed from: k */
    public boolean f5550k;

    @com.google.android.gms.common.annotation.KeepName
    public com.google.android.gms.common.api.internal.BasePendingResult.C1080b mResultGuardian;

    /* renamed from: com.google.android.gms.common.api.internal.BasePendingResult$a */
    public static class HandlerC1079a<R extends p201l6.InterfaceC4188h> extends p053d7.HandlerC1343e {
        public HandlerC1079a(@androidx.annotation.RecentlyNonNull android.os.Looper r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // android.os.Handler
        public void handleMessage(@androidx.annotation.RecentlyNonNull android.os.Message r3) {
                r2 = this;
                int r0 = r3.what
                r1 = 1
                if (r0 == r1) goto L25
                r1 = 2
                if (r0 == r1) goto L1b
                r3 = 45
                java.lang.String r1 = "Don't know how to handle message: "
                java.lang.String r3 = p064e.C1490d.m4039a(r3, r1, r0)
                java.lang.Exception r0 = new java.lang.Exception
                r0.<init>()
                java.lang.String r1 = "BasePendingResult"
                android.util.Log.wtf(r1, r3, r0)
                return
            L1b:
                java.lang.Object r3 = r3.obj
                com.google.android.gms.common.api.internal.BasePendingResult r3 = (com.google.android.gms.common.api.internal.BasePendingResult) r3
                com.google.android.gms.common.api.Status r0 = com.google.android.gms.common.api.Status.f5533e0
                r3.m3045d(r0)
                return
            L25:
                java.lang.Object r3 = r3.obj
                android.util.Pair r3 = (android.util.Pair) r3
                java.lang.Object r0 = r3.first
                l6.i r0 = (p201l6.InterfaceC4189i) r0
                java.lang.Object r3 = r3.second
                l6.h r3 = (p201l6.InterfaceC4188h) r3
                r0.mo2866a(r3)     // Catch: java.lang.RuntimeException -> L35
                return
            L35:
                r0 = move-exception
                com.google.android.gms.common.api.internal.BasePendingResult.m3042g(r3)
                throw r0
        }
    }

    /* renamed from: com.google.android.gms.common.api.internal.BasePendingResult$b */
    public final class C1080b {

        /* renamed from: a */
        public final /* synthetic */ com.google.android.gms.common.api.internal.BasePendingResult f5551a;

        public C1080b(com.google.android.gms.common.api.internal.BasePendingResult r1, p218m6.C4412y r2) {
                r0 = this;
                r0.f5551a = r1
                r0.<init>()
                return
        }

        public final void finalize() {
                r1 = this;
                com.google.android.gms.common.api.internal.BasePendingResult r0 = r1.f5551a
                R extends l6.h r0 = r0.f5546g
                com.google.android.gms.common.api.internal.BasePendingResult.m3042g(r0)
                super.finalize()
                return
        }
    }

    static {
            m6.y r0 = new m6.y
            r1 = 0
            r0.<init>(r1)
            return
    }

    @java.lang.Deprecated
    public BasePendingResult() {
            r2 = this;
            r2.<init>()
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            r2.f5540a = r0
            java.util.concurrent.CountDownLatch r0 = new java.util.concurrent.CountDownLatch
            r1 = 1
            r0.<init>(r1)
            r2.f5542c = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r2.f5543d = r0
            java.util.concurrent.atomic.AtomicReference r0 = new java.util.concurrent.atomic.AtomicReference
            r0.<init>()
            r2.f5545f = r0
            com.google.android.gms.common.api.internal.BasePendingResult$a r0 = new com.google.android.gms.common.api.internal.BasePendingResult$a
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            r0.<init>(r1)
            r2.f5541b = r0
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
            r1 = 0
            r0.<init>(r1)
            return
    }

    public BasePendingResult(p201l6.AbstractC4184d r2) {
            r1 = this;
            r1.<init>()
            java.lang.Object r2 = new java.lang.Object
            r2.<init>()
            r1.f5540a = r2
            java.util.concurrent.CountDownLatch r2 = new java.util.concurrent.CountDownLatch
            r0 = 1
            r2.<init>(r0)
            r1.f5542c = r2
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r1.f5543d = r2
            java.util.concurrent.atomic.AtomicReference r2 = new java.util.concurrent.atomic.AtomicReference
            r2.<init>()
            r1.f5545f = r2
            android.os.Looper r2 = android.os.Looper.getMainLooper()
            com.google.android.gms.common.api.internal.BasePendingResult$a r0 = new com.google.android.gms.common.api.internal.BasePendingResult$a
            r0.<init>(r2)
            r1.f5541b = r0
            java.lang.ref.WeakReference r2 = new java.lang.ref.WeakReference
            r0 = 0
            r2.<init>(r0)
            return
    }

    /* renamed from: g */
    public static void m3042g(p201l6.InterfaceC4188h r3) {
            boolean r0 = r3 instanceof p201l6.InterfaceC4186f
            if (r0 == 0) goto L2c
            r0 = r3
            l6.f r0 = (p201l6.InterfaceC4186f) r0     // Catch: java.lang.RuntimeException -> Lb
            r0.release()     // Catch: java.lang.RuntimeException -> Lb
            return
        Lb:
            r0 = move-exception
            java.lang.String r3 = java.lang.String.valueOf(r3)
            int r1 = r3.length()
            int r1 = r1 + 18
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r1)
            java.lang.String r1 = "Unable to release "
            r2.append(r1)
            r2.append(r3)
            java.lang.String r3 = r2.toString()
            java.lang.String r1 = "BasePendingResult"
            android.util.Log.w(r1, r3, r0)
        L2c:
            return
    }

    @Override // p201l6.AbstractC4185e
    /* renamed from: a */
    public void mo3043a() {
            r2 = this;
            java.lang.Object r0 = r2.f5540a
            monitor-enter(r0)
            boolean r1 = r2.f5549j     // Catch: java.lang.Throwable -> L21
            if (r1 != 0) goto L1f
            boolean r1 = r2.f5548i     // Catch: java.lang.Throwable -> L21
            if (r1 == 0) goto Lc
            goto L1f
        Lc:
            R extends l6.h r1 = r2.f5546g     // Catch: java.lang.Throwable -> L21
            m3042g(r1)     // Catch: java.lang.Throwable -> L21
            r1 = 1
            r2.f5549j = r1     // Catch: java.lang.Throwable -> L21
            com.google.android.gms.common.api.Status r1 = com.google.android.gms.common.api.Status.f5534f0     // Catch: java.lang.Throwable -> L21
            l6.h r1 = r2.mo3031c(r1)     // Catch: java.lang.Throwable -> L21
            r2.m3048h(r1)     // Catch: java.lang.Throwable -> L21
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L21
            return
        L1f:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L21
            return
        L21:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L21
            throw r1
    }

    @Override // p201l6.AbstractC4185e
    /* renamed from: b */
    public final void mo3044b(p201l6.InterfaceC4189i<? super R> r6) {
            r5 = this;
            java.lang.Object r0 = r5.f5540a
            monitor-enter(r0)
            if (r6 != 0) goto La
            r6 = 0
            r5.f5544e = r6     // Catch: java.lang.Throwable -> L44
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L44
            return
        La:
            boolean r1 = r5.f5548i     // Catch: java.lang.Throwable -> L44
            r2 = 1
            if (r1 != 0) goto L11
            r1 = 1
            goto L12
        L11:
            r1 = 0
        L12:
            java.lang.String r3 = "Result has already been consumed."
            com.google.android.gms.common.internal.C1101a.m3106k(r1, r3)     // Catch: java.lang.Throwable -> L44
            java.lang.Object r1 = r5.f5540a     // Catch: java.lang.Throwable -> L44
            monitor-enter(r1)     // Catch: java.lang.Throwable -> L44
            boolean r3 = r5.f5549j     // Catch: java.lang.Throwable -> L41
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L41
            if (r3 == 0) goto L21
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L44
            return
        L21:
            boolean r1 = r5.m3046e()     // Catch: java.lang.Throwable -> L44
            if (r1 == 0) goto L3d
            com.google.android.gms.common.api.internal.BasePendingResult$a<R extends l6.h> r1 = r5.f5541b     // Catch: java.lang.Throwable -> L44
            l6.h r3 = r5.m3049i()     // Catch: java.lang.Throwable -> L44
            java.util.Objects.requireNonNull(r1)     // Catch: java.lang.Throwable -> L44
            android.util.Pair r4 = new android.util.Pair     // Catch: java.lang.Throwable -> L44
            r4.<init>(r6, r3)     // Catch: java.lang.Throwable -> L44
            android.os.Message r6 = r1.obtainMessage(r2, r4)     // Catch: java.lang.Throwable -> L44
            r1.sendMessage(r6)     // Catch: java.lang.Throwable -> L44
            goto L3f
        L3d:
            r5.f5544e = r6     // Catch: java.lang.Throwable -> L44
        L3f:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L44
            return
        L41:
            r6 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L41
            throw r6     // Catch: java.lang.Throwable -> L44
        L44:
            r6 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L44
            throw r6
    }

    /* renamed from: c */
    public abstract R mo3031c(@androidx.annotation.RecentlyNonNull com.google.android.gms.common.api.Status r1);

    @java.lang.Deprecated
    /* renamed from: d */
    public final void m3045d(@androidx.annotation.RecentlyNonNull com.google.android.gms.common.api.Status r3) {
            r2 = this;
            java.lang.Object r0 = r2.f5540a
            monitor-enter(r0)
            boolean r1 = r2.m3046e()     // Catch: java.lang.Throwable -> L15
            if (r1 != 0) goto L13
            l6.h r3 = r2.mo3031c(r3)     // Catch: java.lang.Throwable -> L15
            r2.m3047f(r3)     // Catch: java.lang.Throwable -> L15
            r3 = 1
            r2.f5550k = r3     // Catch: java.lang.Throwable -> L15
        L13:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L15
            return
        L15:
            r3 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L15
            throw r3
    }

    /* renamed from: e */
    public final boolean m3046e() {
            r5 = this;
            java.util.concurrent.CountDownLatch r0 = r5.f5542c
            long r0 = r0.getCount()
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto Le
            r0 = 1
            return r0
        Le:
            r0 = 0
            return r0
    }

    /* renamed from: f */
    public final void m3047f(@androidx.annotation.RecentlyNonNull R r6) {
            r5 = this;
            java.lang.Object r0 = r5.f5540a
            monitor-enter(r0)
            boolean r1 = r5.f5550k     // Catch: java.lang.Throwable -> L33
            if (r1 != 0) goto L2e
            boolean r1 = r5.f5549j     // Catch: java.lang.Throwable -> L33
            if (r1 != 0) goto L2e
            r5.m3046e()     // Catch: java.lang.Throwable -> L33
            boolean r1 = r5.m3046e()     // Catch: java.lang.Throwable -> L33
            r2 = 1
            r3 = 0
            if (r1 != 0) goto L18
            r1 = 1
            goto L19
        L18:
            r1 = 0
        L19:
            java.lang.String r4 = "Results have already been set"
            com.google.android.gms.common.internal.C1101a.m3106k(r1, r4)     // Catch: java.lang.Throwable -> L33
            boolean r1 = r5.f5548i     // Catch: java.lang.Throwable -> L33
            if (r1 != 0) goto L23
            goto L24
        L23:
            r2 = 0
        L24:
            java.lang.String r1 = "Result has already been consumed"
            com.google.android.gms.common.internal.C1101a.m3106k(r2, r1)     // Catch: java.lang.Throwable -> L33
            r5.m3048h(r6)     // Catch: java.lang.Throwable -> L33
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L33
            return
        L2e:
            m3042g(r6)     // Catch: java.lang.Throwable -> L33
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L33
            return
        L33:
            r6 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L33
            throw r6
    }

    /* renamed from: h */
    public final void m3048h(R r5) {
            r4 = this;
            r4.f5546g = r5
            com.google.android.gms.common.api.Status r5 = r5.mo3030F()
            r4.f5547h = r5
            java.util.concurrent.CountDownLatch r5 = r4.f5542c
            r5.countDown()
            boolean r5 = r4.f5549j
            r0 = 0
            if (r5 == 0) goto L15
            r4.f5544e = r0
            goto L43
        L15:
            l6.i<? super R extends l6.h> r5 = r4.f5544e
            if (r5 != 0) goto L27
            R extends l6.h r5 = r4.f5546g
            boolean r5 = r5 instanceof p201l6.InterfaceC4186f
            if (r5 == 0) goto L43
            com.google.android.gms.common.api.internal.BasePendingResult$b r5 = new com.google.android.gms.common.api.internal.BasePendingResult$b
            r5.<init>(r4, r0)
            r4.mResultGuardian = r5
            goto L43
        L27:
            com.google.android.gms.common.api.internal.BasePendingResult$a<R extends l6.h> r0 = r4.f5541b
            r1 = 2
            r0.removeMessages(r1)
            com.google.android.gms.common.api.internal.BasePendingResult$a<R extends l6.h> r0 = r4.f5541b
            l6.h r1 = r4.m3049i()
            java.util.Objects.requireNonNull(r0)
            android.util.Pair r2 = new android.util.Pair
            r2.<init>(r5, r1)
            r5 = 1
            android.os.Message r5 = r0.obtainMessage(r5, r2)
            r0.sendMessage(r5)
        L43:
            java.util.ArrayList<l6.e$a> r5 = r4.f5543d
            int r0 = r5.size()
            r1 = 0
        L4a:
            if (r1 >= r0) goto L5a
            java.lang.Object r2 = r5.get(r1)
            int r1 = r1 + 1
            l6.e$a r2 = (p201l6.AbstractC4185e.a) r2
            com.google.android.gms.common.api.Status r3 = r4.f5547h
            r2.m9329a(r3)
            goto L4a
        L5a:
            java.util.ArrayList<l6.e$a> r5 = r4.f5543d
            r5.clear()
            return
    }

    /* renamed from: i */
    public final R m3049i() {
            r4 = this;
            java.lang.Object r0 = r4.f5540a
            monitor-enter(r0)
            boolean r1 = r4.f5548i     // Catch: java.lang.Throwable -> L36
            r2 = 1
            if (r1 != 0) goto La
            r1 = 1
            goto Lb
        La:
            r1 = 0
        Lb:
            java.lang.String r3 = "Result has already been consumed."
            com.google.android.gms.common.internal.C1101a.m3106k(r1, r3)     // Catch: java.lang.Throwable -> L36
            boolean r1 = r4.m3046e()     // Catch: java.lang.Throwable -> L36
            java.lang.String r3 = "Result is not ready."
            com.google.android.gms.common.internal.C1101a.m3106k(r1, r3)     // Catch: java.lang.Throwable -> L36
            R extends l6.h r1 = r4.f5546g     // Catch: java.lang.Throwable -> L36
            r3 = 0
            r4.f5546g = r3     // Catch: java.lang.Throwable -> L36
            r4.f5544e = r3     // Catch: java.lang.Throwable -> L36
            r4.f5548i = r2     // Catch: java.lang.Throwable -> L36
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L36
            java.util.concurrent.atomic.AtomicReference<m6.w> r0 = r4.f5545f
            java.lang.Object r0 = r0.getAndSet(r3)
            m6.w r0 = (p218m6.InterfaceC4410w) r0
            if (r0 == 0) goto L30
            r0.m9836a(r4)
        L30:
            java.lang.String r0 = "null reference"
            java.util.Objects.requireNonNull(r1, r0)
            return r1
        L36:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L36
            throw r1
    }
}
