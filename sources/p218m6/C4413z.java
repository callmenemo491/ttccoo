package p218m6;

/* renamed from: m6.z */
/* loaded from: classes.dex */
public final class C4413z {

    /* renamed from: a */
    public final java.util.Map<com.google.android.gms.common.api.internal.BasePendingResult<?>, java.lang.Boolean> f17988a;

    /* renamed from: b */
    public final java.util.Map<p327s7.C5986j<?>, java.lang.Boolean> f17989b;

    public C4413z() {
            r1 = this;
            r1.<init>()
            java.util.WeakHashMap r0 = new java.util.WeakHashMap
            r0.<init>()
            java.util.Map r0 = java.util.Collections.synchronizedMap(r0)
            r1.f17988a = r0
            java.util.WeakHashMap r0 = new java.util.WeakHashMap
            r0.<init>()
            java.util.Map r0 = java.util.Collections.synchronizedMap(r0)
            r1.f17989b = r0
            return
    }

    /* renamed from: a */
    public final void m9837a(boolean r5, com.google.android.gms.common.api.Status r6) {
            r4 = this;
            java.util.Map<com.google.android.gms.common.api.internal.BasePendingResult<?>, java.lang.Boolean> r0 = r4.f17988a
            monitor-enter(r0)
            java.util.HashMap r1 = new java.util.HashMap     // Catch: java.lang.Throwable -> L77
            java.util.Map<com.google.android.gms.common.api.internal.BasePendingResult<?>, java.lang.Boolean> r2 = r4.f17988a     // Catch: java.lang.Throwable -> L77
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L77
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L77
            java.util.Map<s7.j<?>, java.lang.Boolean> r2 = r4.f17989b
            monitor-enter(r2)
            java.util.HashMap r0 = new java.util.HashMap     // Catch: java.lang.Throwable -> L74
            java.util.Map<s7.j<?>, java.lang.Boolean> r3 = r4.f17989b     // Catch: java.lang.Throwable -> L74
            r0.<init>(r3)     // Catch: java.lang.Throwable -> L74
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L74
            java.util.Set r1 = r1.entrySet()
            java.util.Iterator r1 = r1.iterator()
        L1e:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L42
            java.lang.Object r2 = r1.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            if (r5 != 0) goto L38
            java.lang.Object r3 = r2.getValue()
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            if (r3 == 0) goto L1e
        L38:
            java.lang.Object r2 = r2.getKey()
            com.google.android.gms.common.api.internal.BasePendingResult r2 = (com.google.android.gms.common.api.internal.BasePendingResult) r2
            r2.m3045d(r6)
            goto L1e
        L42:
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r0 = r0.iterator()
        L4a:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L73
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            if (r5 != 0) goto L64
            java.lang.Object r2 = r1.getValue()
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 == 0) goto L4a
        L64:
            java.lang.Object r1 = r1.getKey()
            s7.j r1 = (p327s7.C5986j) r1
            l6.b r2 = new l6.b
            r2.<init>(r6)
            r1.m12458a(r2)
            goto L4a
        L73:
            return
        L74:
            r5 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L74
            throw r5
        L77:
            r5 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L77
            throw r5
    }
}
