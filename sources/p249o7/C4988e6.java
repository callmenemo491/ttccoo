package p249o7;

/* renamed from: o7.e6 */
/* loaded from: classes.dex */
public final class C4988e6 {

    /* renamed from: a */
    public final /* synthetic */ p249o7.C4996f6 f19664a;

    public C4988e6(p249o7.C4996f6 r1) {
            r0 = this;
            r0.f19664a = r1
            r0.<init>()
            return
    }

    /* renamed from: a */
    public final void m11147a() {
            r3 = this;
            o7.f6 r0 = r3.f19664a
            r0.mo3183i()
            o7.f6 r0 = r3.f19664a
            com.google.android.gms.measurement.internal.d r0 = r0.f5736a
            com.google.android.gms.measurement.internal.c r0 = r0.m3175t()
            o7.f6 r1 = r3.f19664a
            com.google.android.gms.measurement.internal.d r1 = r1.f5736a
            u6.c r1 = r1.f5723n
            u6.d r1 = (p353u6.C6341d) r1
            java.util.Objects.requireNonNull(r1)
            long r1 = java.lang.System.currentTimeMillis()
            boolean r0 = r0.m3152u(r1)
            if (r0 == 0) goto L60
            o7.f6 r0 = r3.f19664a
            com.google.android.gms.measurement.internal.d r0 = r0.f5736a
            com.google.android.gms.measurement.internal.c r0 = r0.m3175t()
            o7.n3 r0 = r0.f5690k
            r1 = 1
            r0.m11369a(r1)
            android.app.ActivityManager$RunningAppProcessInfo r0 = new android.app.ActivityManager$RunningAppProcessInfo
            r0.<init>()
            android.app.ActivityManager.getMyMemoryState(r0)
            int r0 = r0.importance
            r1 = 100
            if (r0 != r1) goto L60
            o7.f6 r0 = r3.f19664a
            com.google.android.gms.measurement.internal.d r0 = r0.f5736a
            com.google.android.gms.measurement.internal.b r0 = r0.mo3162d()
            o7.f3 r0 = r0.f5680n
            java.lang.String r1 = "Detected application was in foreground"
            r0.m11169c(r1)
            o7.f6 r0 = r3.f19664a
            com.google.android.gms.measurement.internal.d r0 = r0.f5736a
            u6.c r0 = r0.f5723n
            u6.d r0 = (p353u6.C6341d) r0
            java.util.Objects.requireNonNull(r0)
            long r0 = java.lang.System.currentTimeMillis()
            r2 = 0
            r3.m11149c(r0, r2)
        L60:
            return
    }

    /* renamed from: b */
    public final void m11148b(long r3, boolean r5) {
            r2 = this;
            o7.f6 r0 = r2.f19664a
            r0.mo3183i()
            o7.f6 r0 = r2.f19664a
            r0.m11180m()
            o7.f6 r0 = r2.f19664a
            com.google.android.gms.measurement.internal.d r0 = r0.f5736a
            com.google.android.gms.measurement.internal.c r0 = r0.m3175t()
            boolean r0 = r0.m3152u(r3)
            if (r0 == 0) goto L26
            o7.f6 r0 = r2.f19664a
            com.google.android.gms.measurement.internal.d r0 = r0.f5736a
            com.google.android.gms.measurement.internal.c r0 = r0.m3175t()
            o7.n3 r0 = r0.f5690k
            r1 = 1
            r0.m11369a(r1)
        L26:
            o7.f6 r0 = r2.f19664a
            com.google.android.gms.measurement.internal.d r0 = r0.f5736a
            com.google.android.gms.measurement.internal.c r0 = r0.m3175t()
            o7.p3 r0 = r0.f5693n
            r0.m11411b(r3)
            o7.f6 r0 = r2.f19664a
            com.google.android.gms.measurement.internal.d r0 = r0.f5736a
            com.google.android.gms.measurement.internal.c r0 = r0.m3175t()
            o7.n3 r0 = r0.f5690k
            boolean r0 = r0.m11370b()
            if (r0 == 0) goto L46
            r2.m11149c(r3, r5)
        L46:
            return
    }

    /* renamed from: c */
    public final void m11149c(long r10, boolean r12) {
            r9 = this;
            o7.f6 r0 = r9.f19664a
            r0.mo3183i()
            o7.f6 r0 = r9.f19664a
            com.google.android.gms.measurement.internal.d r0 = r0.f5736a
            boolean r0 = r0.m3165g()
            if (r0 != 0) goto L10
            return
        L10:
            o7.f6 r0 = r9.f19664a
            com.google.android.gms.measurement.internal.d r0 = r0.f5736a
            com.google.android.gms.measurement.internal.c r0 = r0.m3175t()
            o7.p3 r0 = r0.f5693n
            r0.m11411b(r10)
            o7.f6 r0 = r9.f19664a
            com.google.android.gms.measurement.internal.d r0 = r0.f5736a
            u6.c r0 = r0.f5723n
            u6.d r0 = (p353u6.C6341d) r0
            java.util.Objects.requireNonNull(r0)
            long r0 = android.os.SystemClock.elapsedRealtime()
            o7.f6 r2 = r9.f19664a
            com.google.android.gms.measurement.internal.d r2 = r2.f5736a
            com.google.android.gms.measurement.internal.b r2 = r2.mo3162d()
            o7.f3 r2 = r2.f5680n
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            java.lang.String r1 = "Session started, time"
            r2.m11170d(r1, r0)
            r0 = 1000(0x3e8, double:4.94E-321)
            long r0 = r10 / r0
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            o7.f6 r1 = r9.f19664a
            com.google.android.gms.measurement.internal.d r1 = r1.f5736a
            o7.d5 r2 = r1.m3176v()
            java.lang.String r3 = "auto"
            java.lang.String r4 = "_sid"
            r5 = r0
            r6 = r10
            r2.m11123C(r3, r4, r5, r6)
            o7.f6 r1 = r9.f19664a
            com.google.android.gms.measurement.internal.d r1 = r1.f5736a
            com.google.android.gms.measurement.internal.c r1 = r1.m3175t()
            o7.n3 r1 = r1.f5690k
            r2 = 0
            r1.m11369a(r2)
            android.os.Bundle r8 = new android.os.Bundle
            r8.<init>()
            long r0 = r0.longValue()
            java.lang.String r2 = "_sid"
            r8.putLong(r2, r0)
            o7.f6 r0 = r9.f19664a
            com.google.android.gms.measurement.internal.d r0 = r0.f5736a
            o7.f r0 = r0.f5716g
            o7.u2<java.lang.Boolean> r1 = p249o7.C5120v2.f20091e0
            r2 = 0
            boolean r0 = r0.m11162v(r2, r1)
            if (r0 == 0) goto L8c
            if (r12 == 0) goto L8c
            r0 = 1
            java.lang.String r12 = "_aib"
            r8.putLong(r12, r0)
        L8c:
            o7.f6 r12 = r9.f19664a
            com.google.android.gms.measurement.internal.d r12 = r12.f5736a
            o7.d5 r3 = r12.m3176v()
            java.lang.String r4 = "auto"
            java.lang.String r5 = "_s"
            r6 = r10
            r3.m11134q(r4, r5, r6, r8)
            p185k7.C3952q9.m8914c()
            o7.f6 r12 = r9.f19664a
            com.google.android.gms.measurement.internal.d r12 = r12.f5736a
            o7.f r12 = r12.f5716g
            o7.u2<java.lang.Boolean> r0 = p249o7.C5120v2.f20099i0
            boolean r12 = r12.m11162v(r2, r0)
            if (r12 == 0) goto Ldb
            o7.f6 r12 = r9.f19664a
            com.google.android.gms.measurement.internal.d r12 = r12.f5736a
            com.google.android.gms.measurement.internal.c r12 = r12.m3175t()
            o7.r3 r12 = r12.f5698s
            java.lang.String r12 = r12.m11416a()
            boolean r0 = android.text.TextUtils.isEmpty(r12)
            if (r0 != 0) goto Ldb
            android.os.Bundle r6 = new android.os.Bundle
            r6.<init>()
            java.lang.String r0 = "_ffr"
            r6.putString(r0, r12)
            o7.f6 r12 = r9.f19664a
            com.google.android.gms.measurement.internal.d r12 = r12.f5736a
            o7.d5 r1 = r12.m3176v()
            java.lang.String r2 = "auto"
            java.lang.String r3 = "_ssr"
            r4 = r10
            r1.m11134q(r2, r3, r4, r6)
        Ldb:
            return
    }
}
