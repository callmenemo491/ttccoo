package p249o7;

/* renamed from: o7.w6 */
/* loaded from: classes.dex */
public final class C5132w6 {

    /* renamed from: a */
    public final com.google.android.gms.measurement.internal.C1113d f20157a;

    public C5132w6(com.google.android.gms.measurement.internal.C1113d r1) {
            r0 = this;
            r0.<init>()
            r0.f20157a = r1
            return
    }

    /* renamed from: a */
    public final void m11442a(java.lang.String r4, android.os.Bundle r5) {
            r3 = this;
            com.google.android.gms.measurement.internal.d r0 = r3.f20157a
            o7.f4 r0 = r0.mo3160b()
            r0.mo3183i()
            com.google.android.gms.measurement.internal.d r0 = r3.f20157a
            boolean r0 = r0.m3165g()
            if (r0 != 0) goto L77
            boolean r0 = r5.isEmpty()
            if (r0 == 0) goto L19
            r4 = 0
            goto L4e
        L19:
            r0 = 1
            boolean r1 = r4.isEmpty()
            if (r0 != r1) goto L22
            java.lang.String r4 = "auto"
        L22:
            android.net.Uri$Builder r0 = new android.net.Uri$Builder
            r0.<init>()
            r0.path(r4)
            java.util.Set r4 = r5.keySet()
            java.util.Iterator r4 = r4.iterator()
        L32:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L46
            java.lang.Object r1 = r4.next()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r2 = r5.getString(r1)
            r0.appendQueryParameter(r1, r2)
            goto L32
        L46:
            android.net.Uri r4 = r0.build()
            java.lang.String r4 = r4.toString()
        L4e:
            boolean r5 = android.text.TextUtils.isEmpty(r4)
            if (r5 != 0) goto L77
            com.google.android.gms.measurement.internal.d r5 = r3.f20157a
            com.google.android.gms.measurement.internal.c r5 = r5.m3175t()
            o7.r3 r5 = r5.f5699t
            r5.m11417b(r4)
            com.google.android.gms.measurement.internal.d r4 = r3.f20157a
            com.google.android.gms.measurement.internal.c r4 = r4.m3175t()
            o7.p3 r4 = r4.f5700u
            com.google.android.gms.measurement.internal.d r5 = r3.f20157a
            u6.c r5 = r5.f5723n
            u6.d r5 = (p353u6.C6341d) r5
            java.util.Objects.requireNonNull(r5)
            long r0 = java.lang.System.currentTimeMillis()
            r4.m11411b(r0)
        L77:
            return
    }

    /* renamed from: b */
    public final boolean m11443b() {
            r5 = this;
            com.google.android.gms.measurement.internal.d r0 = r5.f20157a
            com.google.android.gms.measurement.internal.c r0 = r0.m3175t()
            o7.p3 r0 = r0.f5700u
            long r0 = r0.m11410a()
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 <= 0) goto L14
            r0 = 1
            return r0
        L14:
            r0 = 0
            return r0
    }

    /* renamed from: c */
    public final boolean m11444c() {
            r6 = this;
            boolean r0 = r6.m11443b()
            r1 = 0
            if (r0 != 0) goto L8
            return r1
        L8:
            com.google.android.gms.measurement.internal.d r0 = r6.f20157a
            u6.c r0 = r0.f5723n
            u6.d r0 = (p353u6.C6341d) r0
            java.util.Objects.requireNonNull(r0)
            long r2 = java.lang.System.currentTimeMillis()
            com.google.android.gms.measurement.internal.d r0 = r6.f20157a
            com.google.android.gms.measurement.internal.c r0 = r0.m3175t()
            o7.p3 r0 = r0.f5700u
            long r4 = r0.m11410a()
            long r2 = r2 - r4
            com.google.android.gms.measurement.internal.d r0 = r6.f20157a
            o7.f r0 = r0.f5716g
            r4 = 0
            o7.u2<java.lang.Long> r5 = p249o7.C5120v2.f20073R
            long r4 = r0.m11158r(r4, r5)
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 <= 0) goto L33
            r0 = 1
            return r0
        L33:
            return r1
    }
}
