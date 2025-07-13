package p249o7;

/* renamed from: o7.a */
/* loaded from: classes.dex */
public final class RunnableC4948a implements java.lang.Runnable {

    /* renamed from: Y */
    public final /* synthetic */ int f19557Y;

    /* renamed from: Z */
    public final /* synthetic */ java.lang.String f19558Z;

    /* renamed from: a0 */
    public final /* synthetic */ long f19559a0;

    /* renamed from: b0 */
    public final /* synthetic */ p249o7.C5143y1 f19560b0;

    public RunnableC4948a(p249o7.C5143y1 r2, java.lang.String r3, long r4, int r6) {
            r1 = this;
            r1.f19557Y = r6
            r0 = 1
            if (r6 == r0) goto Lf
            r1.f19560b0 = r2
            r1.f19558Z = r3
            r1.f19559a0 = r4
            r1.<init>()
            return
        Lf:
            r1.f19560b0 = r2
            r1.f19558Z = r3
            r1.f19559a0 = r4
            r1.<init>()
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r10 = this;
            int r0 = r10.f19557Y
            switch(r0) {
                case 0: goto L6;
                default: goto L5;
            }
        L5:
            goto L5e
        L6:
            o7.y1 r0 = r10.f19560b0
            java.lang.String r1 = r10.f19558Z
            long r2 = r10.f19559a0
            r0.mo3183i()
            com.google.android.gms.common.internal.C1101a.m3100e(r1)
            java.util.Map<java.lang.String, java.lang.Integer> r4 = r0.f20184c
            boolean r4 = r4.isEmpty()
            if (r4 == 0) goto L1c
            r0.f20185d = r2
        L1c:
            java.util.Map<java.lang.String, java.lang.Integer> r4 = r0.f20184c
            java.lang.Object r4 = r4.get(r1)
            java.lang.Integer r4 = (java.lang.Integer) r4
            r5 = 1
            if (r4 == 0) goto L33
            java.util.Map<java.lang.String, java.lang.Integer> r0 = r0.f20184c
            int r2 = r4.intValue()
            int r2 = r2 + r5
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            goto L5a
        L33:
            java.util.Map<java.lang.String, java.lang.Integer> r4 = r0.f20184c
            int r4 = r4.size()
            r6 = 100
            if (r4 < r6) goto L4b
            com.google.android.gms.measurement.internal.d r0 = r0.f5736a
            com.google.android.gms.measurement.internal.b r0 = r0.mo3162d()
            o7.f3 r0 = r0.f5675i
            java.lang.String r1 = "Too many ads visible"
            r0.m11169c(r1)
            goto L5d
        L4b:
            java.util.Map<java.lang.String, java.lang.Integer> r4 = r0.f20184c
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r4.put(r1, r5)
            java.util.Map<java.lang.String, java.lang.Long> r0 = r0.f20183b
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
        L5a:
            r0.put(r1, r2)
        L5d:
            return
        L5e:
            o7.y1 r0 = r10.f19560b0
            java.lang.String r1 = r10.f19558Z
            long r2 = r10.f19559a0
            r0.mo3183i()
            com.google.android.gms.common.internal.C1101a.m3100e(r1)
            java.util.Map<java.lang.String, java.lang.Integer> r4 = r0.f20184c
            java.lang.Object r4 = r4.get(r1)
            java.lang.Integer r4 = (java.lang.Integer) r4
            if (r4 == 0) goto Le1
            com.google.android.gms.measurement.internal.d r5 = r0.f5736a
            o7.m5 r5 = r5.m3178x()
            r6 = 0
            o7.j5 r5 = r5.m11322p(r6)
            int r4 = r4.intValue()
            int r4 = r4 + (-1)
            if (r4 != 0) goto Ld7
            java.util.Map<java.lang.String, java.lang.Integer> r4 = r0.f20184c
            r4.remove(r1)
            java.util.Map<java.lang.String, java.lang.Long> r4 = r0.f20183b
            java.lang.Object r4 = r4.get(r1)
            java.lang.Long r4 = (java.lang.Long) r4
            if (r4 != 0) goto La4
            com.google.android.gms.measurement.internal.d r1 = r0.f5736a
            com.google.android.gms.measurement.internal.b r1 = r1.mo3162d()
            o7.f3 r1 = r1.f5672f
            java.lang.String r4 = "First ad unit exposure time was never set"
            r1.m11169c(r4)
            goto Lb2
        La4:
            long r6 = r4.longValue()
            java.util.Map<java.lang.String, java.lang.Long> r4 = r0.f20183b
            r4.remove(r1)
            long r6 = r2 - r6
            r0.m11451n(r1, r6, r5)
        Lb2:
            java.util.Map<java.lang.String, java.lang.Integer> r1 = r0.f20184c
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto Lee
            long r6 = r0.f20185d
            r8 = 0
            int r1 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r1 != 0) goto Ld0
            com.google.android.gms.measurement.internal.d r0 = r0.f5736a
            com.google.android.gms.measurement.internal.b r0 = r0.mo3162d()
            o7.f3 r0 = r0.f5672f
            java.lang.String r1 = "First ad exposure time was never set"
            r0.m11169c(r1)
            goto Lee
        Ld0:
            long r2 = r2 - r6
            r0.m11450m(r2, r5)
            r0.f20185d = r8
            goto Lee
        Ld7:
            java.util.Map<java.lang.String, java.lang.Integer> r0 = r0.f20184c
            java.lang.Integer r2 = java.lang.Integer.valueOf(r4)
            r0.put(r1, r2)
            goto Lee
        Le1:
            com.google.android.gms.measurement.internal.d r0 = r0.f5736a
            com.google.android.gms.measurement.internal.b r0 = r0.mo3162d()
            o7.f3 r0 = r0.f5672f
            java.lang.String r2 = "Call to endAdUnitExposure for unknown ad unit id"
            r0.m11170d(r2, r1)
        Lee:
            return
    }
}
