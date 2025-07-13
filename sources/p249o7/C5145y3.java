package p249o7;

/* renamed from: o7.y3 */
/* loaded from: classes.dex */
public final class C5145y3 extends p319s.C5939f<java.lang.String, p185k7.C3878l0> {

    /* renamed from: i */
    public final /* synthetic */ p249o7.C4953a4 f20186i;

    public C5145y3(p249o7.C4953a4 r1) {
            r0 = this;
            r0.f20186i = r1
            r1 = 20
            r0.<init>(r1)
            return
    }

    @Override // p319s.C5939f
    /* renamed from: a */
    public final p185k7.C3878l0 mo11453a(java.lang.String r5) {
            r4 = this;
            java.lang.String r5 = (java.lang.String) r5
            com.google.android.gms.common.internal.C1101a.m3100e(r5)
            o7.a4 r0 = r4.f20186i
            r0.m11247j()
            com.google.android.gms.common.internal.C1101a.m3100e(r5)
            p185k7.C3792eb.m8525c()
            com.google.android.gms.measurement.internal.d r1 = r0.f5736a
            o7.f r1 = r1.f5716g
            o7.u2<java.lang.Boolean> r2 = p249o7.C5120v2.f20119s0
            r3 = 0
            boolean r1 = r1.m11162v(r3, r2)
            if (r1 != 0) goto L1e
            goto L56
        L1e:
            boolean r1 = r0.m11093p(r5)
            if (r1 != 0) goto L25
            goto L56
        L25:
            java.util.Map<java.lang.String, k7.j2> r1 = r0.f19568g
            boolean r1 = r1.containsKey(r5)
            if (r1 == 0) goto L41
            java.util.Map<java.lang.String, k7.j2> r1 = r0.f19568g
            java.lang.Object r1 = r1.get(r5)
            if (r1 == 0) goto L41
            java.util.Map<java.lang.String, k7.j2> r1 = r0.f19568g
            java.lang.Object r1 = r1.get(r5)
            k7.j2 r1 = (p185k7.C3853j2) r1
            r0.m11102y(r5, r1)
            goto L44
        L41:
            r0.m11101x(r5)
        L44:
            s.f<java.lang.String, k7.l0> r0 = r0.f19570i
            monitor-enter(r0)
            java.util.LinkedHashMap r1 = new java.util.LinkedHashMap     // Catch: java.lang.Throwable -> L57
            java.util.LinkedHashMap<K, V> r2 = r0.f22783a     // Catch: java.lang.Throwable -> L57
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L57
            monitor-exit(r0)
            java.lang.Object r5 = r1.get(r5)
            r3 = r5
            k7.l0 r3 = (p185k7.C3878l0) r3
        L56:
            return r3
        L57:
            r5 = move-exception
            monitor-exit(r0)
            throw r5
    }
}
