package p249o7;

/* renamed from: o7.d6 */
/* loaded from: classes.dex */
public final class C4980d6 {

    /* renamed from: a */
    public long f19646a;

    /* renamed from: b */
    public long f19647b;

    /* renamed from: c */
    public final p249o7.AbstractC5029k f19648c;

    /* renamed from: d */
    public final /* synthetic */ p249o7.C4996f6 f19649d;

    public C4980d6(p249o7.C4996f6 r3) {
            r2 = this;
            r2.f19649d = r3
            r2.<init>()
            o7.c6 r0 = new o7.c6
            com.google.android.gms.measurement.internal.d r1 = r3.f5736a
            r0.<init>(r2, r1)
            r2.f19648c = r0
            com.google.android.gms.measurement.internal.d r3 = r3.f5736a
            u6.c r3 = r3.f5723n
            u6.d r3 = (p353u6.C6341d) r3
            java.util.Objects.requireNonNull(r3)
            long r0 = android.os.SystemClock.elapsedRealtime()
            r2.f19646a = r0
            r2.f19647b = r0
            return
    }

    /* renamed from: a */
    public final boolean m11144a(boolean r7, boolean r8, long r9) {
            r6 = this;
            o7.f6 r0 = r6.f19649d
            r0.mo3183i()
            o7.f6 r0 = r6.f19649d
            r0.m11419j()
            p185k7.C4069z9.m9168c()
            o7.f6 r0 = r6.f19649d
            com.google.android.gms.measurement.internal.d r0 = r0.f5736a
            o7.f r0 = r0.f5716g
            o7.u2<java.lang.Boolean> r1 = p249o7.C5120v2.f20101j0
            r2 = 0
            boolean r0 = r0.m11162v(r2, r1)
            if (r0 == 0) goto L3c
            o7.f6 r0 = r6.f19649d
            com.google.android.gms.measurement.internal.d r0 = r0.f5736a
            boolean r0 = r0.m3165g()
            if (r0 == 0) goto L58
            o7.f6 r0 = r6.f19649d
            com.google.android.gms.measurement.internal.d r0 = r0.f5736a
            com.google.android.gms.measurement.internal.c r0 = r0.m3175t()
            o7.p3 r0 = r0.f5693n
            o7.f6 r1 = r6.f19649d
            com.google.android.gms.measurement.internal.d r1 = r1.f5736a
            u6.c r1 = r1.f5723n
            u6.d r1 = (p353u6.C6341d) r1
            java.util.Objects.requireNonNull(r1)
            goto L51
        L3c:
            o7.f6 r0 = r6.f19649d
            com.google.android.gms.measurement.internal.d r0 = r0.f5736a
            com.google.android.gms.measurement.internal.c r0 = r0.m3175t()
            o7.p3 r0 = r0.f5693n
            o7.f6 r1 = r6.f19649d
            com.google.android.gms.measurement.internal.d r1 = r1.f5736a
            u6.c r1 = r1.f5723n
            u6.d r1 = (p353u6.C6341d) r1
            java.util.Objects.requireNonNull(r1)
        L51:
            long r3 = java.lang.System.currentTimeMillis()
            r0.m11411b(r3)
        L58:
            long r0 = r6.f19646a
            long r0 = r9 - r0
            if (r7 != 0) goto L7a
            r3 = 1000(0x3e8, double:4.94E-321)
            int r7 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r7 < 0) goto L65
            goto L7a
        L65:
            o7.f6 r7 = r6.f19649d
            com.google.android.gms.measurement.internal.d r7 = r7.f5736a
            com.google.android.gms.measurement.internal.b r7 = r7.mo3162d()
            o7.f3 r7 = r7.f5680n
            java.lang.Long r8 = java.lang.Long.valueOf(r0)
            java.lang.String r9 = "Screen exposed for less than 1000 ms. Event not sent. time"
            r7.m11170d(r9, r8)
            r7 = 0
            return r7
        L7a:
            if (r8 != 0) goto L82
            long r0 = r6.f19647b
            long r0 = r9 - r0
            r6.f19647b = r9
        L82:
            o7.f6 r7 = r6.f19649d
            com.google.android.gms.measurement.internal.d r7 = r7.f5736a
            com.google.android.gms.measurement.internal.b r7 = r7.mo3162d()
            o7.f3 r7 = r7.f5680n
            java.lang.Long r3 = java.lang.Long.valueOf(r0)
            java.lang.String r4 = "Recording user engagement, ms"
            r7.m11170d(r4, r3)
            android.os.Bundle r7 = new android.os.Bundle
            r7.<init>()
            java.lang.String r3 = "_et"
            r7.putLong(r3, r0)
            o7.f6 r0 = r6.f19649d
            com.google.android.gms.measurement.internal.d r0 = r0.f5736a
            o7.f r0 = r0.f5716g
            boolean r0 = r0.m11163w()
            o7.f6 r1 = r6.f19649d
            com.google.android.gms.measurement.internal.d r1 = r1.f5736a
            o7.m5 r1 = r1.m3178x()
            r3 = 1
            r0 = r0 ^ r3
            o7.j5 r0 = r1.m11322p(r0)
            com.google.android.gms.measurement.internal.C1115f.m3195x(r0, r7, r3)
            o7.f6 r0 = r6.f19649d
            com.google.android.gms.measurement.internal.d r0 = r0.f5736a
            o7.f r0 = r0.f5716g
            o7.u2<java.lang.Boolean> r1 = p249o7.C5120v2.f20076U
            boolean r0 = r0.m11162v(r2, r1)
            if (r0 != 0) goto Ld1
            if (r8 == 0) goto Ld1
            r4 = 1
            java.lang.String r0 = "_fr"
            r7.putLong(r0, r4)
        Ld1:
            o7.f6 r0 = r6.f19649d
            com.google.android.gms.measurement.internal.d r0 = r0.f5736a
            o7.f r0 = r0.f5716g
            boolean r0 = r0.m11162v(r2, r1)
            if (r0 == 0) goto Ldf
            if (r8 != 0) goto Lee
        Ldf:
            o7.f6 r8 = r6.f19649d
            com.google.android.gms.measurement.internal.d r8 = r8.f5736a
            o7.d5 r8 = r8.m3176v()
            java.lang.String r0 = "auto"
            java.lang.String r1 = "_e"
            r8.m11133p(r0, r1, r7)
        Lee:
            r6.f19646a = r9
            o7.k r7 = r6.f19648c
            r7.m11284a()
            o7.k r7 = r6.f19648c
            r8 = 3600000(0x36ee80, double:1.7786363E-317)
            r7.m11285c(r8)
            return r3
    }
}
