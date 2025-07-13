package p249o7;

/* renamed from: o7.y1 */
/* loaded from: classes.dex */
public final class C5143y1 extends p249o7.C5136x2 {

    /* renamed from: b */
    public final java.util.Map<java.lang.String, java.lang.Long> f20183b;

    /* renamed from: c */
    public final java.util.Map<java.lang.String, java.lang.Integer> f20184c;

    /* renamed from: d */
    public long f20185d;

    public C5143y1(com.google.android.gms.measurement.internal.C1113d r1) {
            r0 = this;
            r0.<init>(r1)
            s.a r1 = new s.a
            r1.<init>()
            r0.f20184c = r1
            s.a r1 = new s.a
            r1.<init>()
            r0.f20183b = r1
            return
    }

    /* renamed from: j */
    public final void m11447j(java.lang.String r9, long r10) {
            r8 = this;
            if (r9 == 0) goto L1d
            int r0 = r9.length()
            if (r0 != 0) goto L9
            goto L1d
        L9:
            com.google.android.gms.measurement.internal.d r0 = r8.f5736a
            o7.f4 r0 = r0.mo3160b()
            o7.a r7 = new o7.a
            r6 = 0
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            r1.<init>(r2, r3, r4, r6)
            r0.m11176s(r7)
            return
        L1d:
            com.google.android.gms.measurement.internal.d r9 = r8.f5736a
            com.google.android.gms.measurement.internal.b r9 = r9.mo3162d()
            o7.f3 r9 = r9.f5672f
            java.lang.String r10 = "Ad unit id must be a non-empty string"
            r9.m11169c(r10)
            return
    }

    /* renamed from: k */
    public final void m11448k(java.lang.String r9, long r10) {
            r8 = this;
            if (r9 == 0) goto L1d
            int r0 = r9.length()
            if (r0 != 0) goto L9
            goto L1d
        L9:
            com.google.android.gms.measurement.internal.d r0 = r8.f5736a
            o7.f4 r0 = r0.mo3160b()
            o7.a r7 = new o7.a
            r6 = 1
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            r1.<init>(r2, r3, r4, r6)
            r0.m11176s(r7)
            return
        L1d:
            com.google.android.gms.measurement.internal.d r9 = r8.f5736a
            com.google.android.gms.measurement.internal.b r9 = r9.mo3162d()
            o7.f3 r9 = r9.f5672f
            java.lang.String r10 = "Ad unit id must be a non-empty string"
            r9.m11169c(r10)
            return
    }

    /* renamed from: l */
    public final void m11449l(long r6) {
            r5 = this;
            com.google.android.gms.measurement.internal.d r0 = r5.f5736a
            o7.m5 r0 = r0.m3178x()
            r1 = 0
            o7.j5 r0 = r0.m11322p(r1)
            java.util.Map<java.lang.String, java.lang.Long> r1 = r5.f20183b
            java.util.Set r1 = r1.keySet()
            java.util.Iterator r1 = r1.iterator()
        L15:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L33
            java.lang.Object r2 = r1.next()
            java.lang.String r2 = (java.lang.String) r2
            java.util.Map<java.lang.String, java.lang.Long> r3 = r5.f20183b
            java.lang.Object r3 = r3.get(r2)
            java.lang.Long r3 = (java.lang.Long) r3
            long r3 = r3.longValue()
            long r3 = r6 - r3
            r5.m11451n(r2, r3, r0)
            goto L15
        L33:
            java.util.Map<java.lang.String, java.lang.Long> r1 = r5.f20183b
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L42
            long r1 = r5.f20185d
            long r1 = r6 - r1
            r5.m11450m(r1, r0)
        L42:
            r5.m11452o(r6)
            return
    }

    /* renamed from: m */
    public final void m11450m(long r4, p249o7.C5027j5 r6) {
            r3 = this;
            if (r6 != 0) goto L10
            com.google.android.gms.measurement.internal.d r4 = r3.f5736a
            com.google.android.gms.measurement.internal.b r4 = r4.mo3162d()
            o7.f3 r4 = r4.f5680n
            java.lang.String r5 = "Not logging ad exposure. No active activity"
            r4.m11169c(r5)
            return
        L10:
            r0 = 1000(0x3e8, double:4.94E-321)
            int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r2 >= 0) goto L28
            com.google.android.gms.measurement.internal.d r6 = r3.f5736a
            com.google.android.gms.measurement.internal.b r6 = r6.mo3162d()
            o7.f3 r6 = r6.f5680n
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            java.lang.String r5 = "Not logging ad exposure. Less than 1000 ms. exposure"
            r6.m11170d(r5, r4)
            return
        L28:
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            java.lang.String r1 = "_xt"
            r0.putLong(r1, r4)
            r4 = 1
            com.google.android.gms.measurement.internal.C1115f.m3195x(r6, r0, r4)
            com.google.android.gms.measurement.internal.d r4 = r3.f5736a
            o7.d5 r4 = r4.m3176v()
            java.lang.String r5 = "am"
            java.lang.String r6 = "_xa"
            r4.m11133p(r5, r6, r0)
            return
    }

    /* renamed from: n */
    public final void m11451n(java.lang.String r4, long r5, p249o7.C5027j5 r7) {
            r3 = this;
            if (r7 != 0) goto L10
            com.google.android.gms.measurement.internal.d r4 = r3.f5736a
            com.google.android.gms.measurement.internal.b r4 = r4.mo3162d()
            o7.f3 r4 = r4.f5680n
            java.lang.String r5 = "Not logging ad unit exposure. No active activity"
            r4.m11169c(r5)
            return
        L10:
            r0 = 1000(0x3e8, double:4.94E-321)
            int r2 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r2 >= 0) goto L28
            com.google.android.gms.measurement.internal.d r4 = r3.f5736a
            com.google.android.gms.measurement.internal.b r4 = r4.mo3162d()
            o7.f3 r4 = r4.f5680n
            java.lang.Long r5 = java.lang.Long.valueOf(r5)
            java.lang.String r6 = "Not logging ad unit exposure. Less than 1000 ms. exposure"
            r4.m11170d(r6, r5)
            return
        L28:
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            java.lang.String r1 = "_ai"
            r0.putString(r1, r4)
            java.lang.String r4 = "_xt"
            r0.putLong(r4, r5)
            r4 = 1
            com.google.android.gms.measurement.internal.C1115f.m3195x(r7, r0, r4)
            com.google.android.gms.measurement.internal.d r4 = r3.f5736a
            o7.d5 r4 = r4.m3176v()
            java.lang.String r5 = "am"
            java.lang.String r6 = "_xu"
            r4.m11133p(r5, r6, r0)
            return
    }

    /* renamed from: o */
    public final void m11452o(long r5) {
            r4 = this;
            java.util.Map<java.lang.String, java.lang.Long> r0 = r4.f20183b
            java.util.Set r0 = r0.keySet()
            java.util.Iterator r0 = r0.iterator()
        La:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L20
            java.lang.Object r1 = r0.next()
            java.lang.String r1 = (java.lang.String) r1
            java.util.Map<java.lang.String, java.lang.Long> r2 = r4.f20183b
            java.lang.Long r3 = java.lang.Long.valueOf(r5)
            r2.put(r1, r3)
            goto La
        L20:
            java.util.Map<java.lang.String, java.lang.Long> r0 = r4.f20183b
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L2a
            r4.f20185d = r5
        L2a:
            return
    }
}
