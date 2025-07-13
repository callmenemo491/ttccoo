package p249o7;

/* renamed from: o7.z4 */
/* loaded from: classes.dex */
public final class RunnableC5154z4 implements java.lang.Runnable {

    /* renamed from: Y */
    public final /* synthetic */ int f20203Y;

    /* renamed from: Z */
    public final /* synthetic */ java.util.concurrent.atomic.AtomicReference f20204Z;

    /* renamed from: a0 */
    public final /* synthetic */ p249o7.C4979d5 f20205a0;

    public RunnableC5154z4(p249o7.C4979d5 r2, java.util.concurrent.atomic.AtomicReference r3, int r4) {
            r1 = this;
            r1.f20203Y = r4
            r0 = 1
            if (r4 == r0) goto L2e
            r0 = 2
            if (r4 == r0) goto L26
            r0 = 3
            if (r4 == r0) goto L1e
            r0 = 4
            if (r4 == r0) goto L16
            r1.f20205a0 = r2
            r1.f20204Z = r3
            r1.<init>()
            return
        L16:
            r1.f20205a0 = r2
            r1.f20204Z = r3
            r1.<init>()
            return
        L1e:
            r1.f20205a0 = r2
            r1.f20204Z = r3
            r1.<init>()
            return
        L26:
            r1.f20205a0 = r2
            r1.f20204Z = r3
            r1.<init>()
            return
        L2e:
            r1.f20205a0 = r2
            r1.f20204Z = r3
            r1.<init>()
            return
    }

    /* renamed from: a */
    private final void m11457a() {
            r7 = this;
            java.util.concurrent.atomic.AtomicReference r0 = r7.f20204Z
            monitor-enter(r0)
            java.util.concurrent.atomic.AtomicReference r1 = r7.f20204Z     // Catch: java.lang.Throwable -> L3e
            o7.d5 r2 = r7.f20205a0     // Catch: java.lang.Throwable -> L3e
            com.google.android.gms.measurement.internal.d r2 = r2.f5736a     // Catch: java.lang.Throwable -> L3e
            o7.f r3 = r2.f5716g     // Catch: java.lang.Throwable -> L3e
            com.google.android.gms.measurement.internal.a r2 = r2.m3172q()     // Catch: java.lang.Throwable -> L3e
            java.lang.String r2 = r2.m3132n()     // Catch: java.lang.Throwable -> L3e
            o7.u2<java.lang.Double> r4 = p249o7.C5120v2.f20070O     // Catch: java.lang.Throwable -> L3e
            java.util.Objects.requireNonNull(r3)     // Catch: java.lang.Throwable -> L3e
            r5 = 0
            if (r2 != 0) goto L1c
            goto L40
        L1c:
            o7.e r3 = r3.f19666c     // Catch: java.lang.Throwable -> L3e
            java.lang.String r6 = r4.f20018a     // Catch: java.lang.Throwable -> L3e
            java.lang.String r2 = r3.mo11088a(r2, r6)     // Catch: java.lang.Throwable -> L3e
            boolean r3 = android.text.TextUtils.isEmpty(r2)     // Catch: java.lang.Throwable -> L3e
            if (r3 == 0) goto L2b
            goto L40
        L2b:
            double r2 = java.lang.Double.parseDouble(r2)     // Catch: java.lang.Throwable -> L3e java.lang.NumberFormatException -> L40
            java.lang.Double r2 = java.lang.Double.valueOf(r2)     // Catch: java.lang.Throwable -> L3e java.lang.NumberFormatException -> L40
            java.lang.Object r2 = r4.m11421a(r2)     // Catch: java.lang.Throwable -> L3e java.lang.NumberFormatException -> L40
            java.lang.Double r2 = (java.lang.Double) r2     // Catch: java.lang.Throwable -> L3e java.lang.NumberFormatException -> L40
            double r2 = r2.doubleValue()     // Catch: java.lang.Throwable -> L3e java.lang.NumberFormatException -> L40
            goto L4a
        L3e:
            r1 = move-exception
            goto L58
        L40:
            java.lang.Object r2 = r4.m11421a(r5)     // Catch: java.lang.Throwable -> L3e
            java.lang.Double r2 = (java.lang.Double) r2     // Catch: java.lang.Throwable -> L3e
            double r2 = r2.doubleValue()     // Catch: java.lang.Throwable -> L3e
        L4a:
            java.lang.Double r2 = java.lang.Double.valueOf(r2)     // Catch: java.lang.Throwable -> L3e
            r1.set(r2)     // Catch: java.lang.Throwable -> L3e
            java.util.concurrent.atomic.AtomicReference r1 = r7.f20204Z     // Catch: java.lang.Throwable -> L5e
            r1.notify()     // Catch: java.lang.Throwable -> L5e
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L5e
            return
        L58:
            java.util.concurrent.atomic.AtomicReference r2 = r7.f20204Z     // Catch: java.lang.Throwable -> L5e
            r2.notify()     // Catch: java.lang.Throwable -> L5e
            throw r1     // Catch: java.lang.Throwable -> L5e
        L5e:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L5e
            throw r1
    }

    @Override // java.lang.Runnable
    public final void run() {
            r6 = this;
            int r0 = r6.f20203Y
            switch(r0) {
                case 0: goto La9;
                case 1: goto L6b;
                case 2: goto L3a;
                case 3: goto L9;
                default: goto L5;
            }
        L5:
            r6.m11457a()
            return
        L9:
            java.util.concurrent.atomic.AtomicReference r0 = r6.f20204Z
            monitor-enter(r0)
            java.util.concurrent.atomic.AtomicReference r1 = r6.f20204Z     // Catch: java.lang.Throwable -> L30
            o7.d5 r2 = r6.f20205a0     // Catch: java.lang.Throwable -> L30
            com.google.android.gms.measurement.internal.d r2 = r2.f5736a     // Catch: java.lang.Throwable -> L30
            o7.f r3 = r2.f5716g     // Catch: java.lang.Throwable -> L30
            com.google.android.gms.measurement.internal.a r2 = r2.m3172q()     // Catch: java.lang.Throwable -> L30
            java.lang.String r2 = r2.m3132n()     // Catch: java.lang.Throwable -> L30
            o7.u2<java.lang.Integer> r4 = p249o7.C5120v2.f20069N     // Catch: java.lang.Throwable -> L30
            int r2 = r3.m11155o(r2, r4)     // Catch: java.lang.Throwable -> L30
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch: java.lang.Throwable -> L30
            r1.set(r2)     // Catch: java.lang.Throwable -> L30
            java.util.concurrent.atomic.AtomicReference r1 = r6.f20204Z     // Catch: java.lang.Throwable -> L37
            r1.notify()     // Catch: java.lang.Throwable -> L37
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L37
            return
        L30:
            r1 = move-exception
            java.util.concurrent.atomic.AtomicReference r2 = r6.f20204Z     // Catch: java.lang.Throwable -> L37
            r2.notify()     // Catch: java.lang.Throwable -> L37
            throw r1     // Catch: java.lang.Throwable -> L37
        L37:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L37
            throw r1
        L3a:
            java.util.concurrent.atomic.AtomicReference r0 = r6.f20204Z
            monitor-enter(r0)
            java.util.concurrent.atomic.AtomicReference r1 = r6.f20204Z     // Catch: java.lang.Throwable -> L61
            o7.d5 r2 = r6.f20205a0     // Catch: java.lang.Throwable -> L61
            com.google.android.gms.measurement.internal.d r2 = r2.f5736a     // Catch: java.lang.Throwable -> L61
            o7.f r3 = r2.f5716g     // Catch: java.lang.Throwable -> L61
            com.google.android.gms.measurement.internal.a r2 = r2.m3172q()     // Catch: java.lang.Throwable -> L61
            java.lang.String r2 = r2.m3132n()     // Catch: java.lang.Throwable -> L61
            o7.u2<java.lang.Long> r4 = p249o7.C5120v2.f20068M     // Catch: java.lang.Throwable -> L61
            long r2 = r3.m11158r(r2, r4)     // Catch: java.lang.Throwable -> L61
            java.lang.Long r2 = java.lang.Long.valueOf(r2)     // Catch: java.lang.Throwable -> L61
            r1.set(r2)     // Catch: java.lang.Throwable -> L61
            java.util.concurrent.atomic.AtomicReference r1 = r6.f20204Z     // Catch: java.lang.Throwable -> L68
            r1.notify()     // Catch: java.lang.Throwable -> L68
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L68
            return
        L61:
            r1 = move-exception
            java.util.concurrent.atomic.AtomicReference r2 = r6.f20204Z     // Catch: java.lang.Throwable -> L68
            r2.notify()     // Catch: java.lang.Throwable -> L68
            throw r1     // Catch: java.lang.Throwable -> L68
        L68:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L68
            throw r1
        L6b:
            java.util.concurrent.atomic.AtomicReference r0 = r6.f20204Z
            monitor-enter(r0)
            java.util.concurrent.atomic.AtomicReference r1 = r6.f20204Z     // Catch: java.lang.Throwable -> L9f
            o7.d5 r2 = r6.f20205a0     // Catch: java.lang.Throwable -> L9f
            com.google.android.gms.measurement.internal.d r2 = r2.f5736a     // Catch: java.lang.Throwable -> L9f
            o7.f r3 = r2.f5716g     // Catch: java.lang.Throwable -> L9f
            com.google.android.gms.measurement.internal.a r2 = r2.m3172q()     // Catch: java.lang.Throwable -> L9f
            java.lang.String r2 = r2.m3132n()     // Catch: java.lang.Throwable -> L9f
            o7.u2<java.lang.String> r4 = p249o7.C5120v2.f20067L     // Catch: java.lang.Throwable -> L9f
            java.util.Objects.requireNonNull(r3)     // Catch: java.lang.Throwable -> L9f
            if (r2 != 0) goto L87
            r2 = 0
            goto L8f
        L87:
            o7.e r3 = r3.f19666c     // Catch: java.lang.Throwable -> L9f
            java.lang.String r5 = r4.f20018a     // Catch: java.lang.Throwable -> L9f
            java.lang.String r2 = r3.mo11088a(r2, r5)     // Catch: java.lang.Throwable -> L9f
        L8f:
            java.lang.Object r2 = r4.m11421a(r2)     // Catch: java.lang.Throwable -> L9f
            java.lang.String r2 = (java.lang.String) r2     // Catch: java.lang.Throwable -> L9f
            r1.set(r2)     // Catch: java.lang.Throwable -> L9f
            java.util.concurrent.atomic.AtomicReference r1 = r6.f20204Z     // Catch: java.lang.Throwable -> La6
            r1.notify()     // Catch: java.lang.Throwable -> La6
            monitor-exit(r0)     // Catch: java.lang.Throwable -> La6
            return
        L9f:
            r1 = move-exception
            java.util.concurrent.atomic.AtomicReference r2 = r6.f20204Z     // Catch: java.lang.Throwable -> La6
            r2.notify()     // Catch: java.lang.Throwable -> La6
            throw r1     // Catch: java.lang.Throwable -> La6
        La6:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> La6
            throw r1
        La9:
            java.util.concurrent.atomic.AtomicReference r0 = r6.f20204Z
            monitor-enter(r0)
            java.util.concurrent.atomic.AtomicReference r1 = r6.f20204Z     // Catch: java.lang.Throwable -> Ld0
            o7.d5 r2 = r6.f20205a0     // Catch: java.lang.Throwable -> Ld0
            com.google.android.gms.measurement.internal.d r2 = r2.f5736a     // Catch: java.lang.Throwable -> Ld0
            o7.f r3 = r2.f5716g     // Catch: java.lang.Throwable -> Ld0
            com.google.android.gms.measurement.internal.a r2 = r2.m3172q()     // Catch: java.lang.Throwable -> Ld0
            java.lang.String r2 = r2.m3132n()     // Catch: java.lang.Throwable -> Ld0
            o7.u2<java.lang.Boolean> r4 = p249o7.C5120v2.f20066K     // Catch: java.lang.Throwable -> Ld0
            boolean r2 = r3.m11162v(r2, r4)     // Catch: java.lang.Throwable -> Ld0
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)     // Catch: java.lang.Throwable -> Ld0
            r1.set(r2)     // Catch: java.lang.Throwable -> Ld0
            java.util.concurrent.atomic.AtomicReference r1 = r6.f20204Z     // Catch: java.lang.Throwable -> Ld7
            r1.notify()     // Catch: java.lang.Throwable -> Ld7
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Ld7
            return
        Ld0:
            r1 = move-exception
            java.util.concurrent.atomic.AtomicReference r2 = r6.f20204Z     // Catch: java.lang.Throwable -> Ld7
            r2.notify()     // Catch: java.lang.Throwable -> Ld7
            throw r1     // Catch: java.lang.Throwable -> Ld7
        Ld7:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Ld7
            throw r1
    }
}
