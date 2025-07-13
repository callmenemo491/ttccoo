package p249o7;

/* renamed from: o7.a6 */
/* loaded from: classes.dex */
public final class RunnableC4955a6 implements java.lang.Runnable {

    /* renamed from: Y */
    public final /* synthetic */ int f19579Y;

    /* renamed from: Z */
    public final /* synthetic */ long f19580Z;

    /* renamed from: a0 */
    public final /* synthetic */ p249o7.C4996f6 f19581a0;

    public RunnableC4955a6(p249o7.C4996f6 r2, long r3, int r5) {
            r1 = this;
            r1.f19579Y = r5
            r0 = 1
            if (r5 == r0) goto Ld
            r1.f19581a0 = r2
            r1.f19580Z = r3
            r1.<init>()
            return
        Ld:
            r1.f19581a0 = r2
            r1.f19580Z = r3
            r1.<init>()
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r9 = this;
            int r0 = r9.f19579Y
            switch(r0) {
                case 0: goto L7;
                default: goto L5;
            }
        L5:
            goto L97
        L7:
            o7.f6 r0 = r9.f19581a0
            long r1 = r9.f19580Z
            r0.mo3183i()
            r0.m11180m()
            com.google.android.gms.measurement.internal.d r3 = r0.f5736a
            com.google.android.gms.measurement.internal.b r3 = r3.mo3162d()
            o7.f3 r3 = r3.f5680n
            java.lang.Long r4 = java.lang.Long.valueOf(r1)
            java.lang.String r5 = "Activity resumed, time"
            r3.m11170d(r5, r4)
            com.google.android.gms.measurement.internal.d r3 = r0.f5736a
            o7.f r3 = r3.f5716g
            boolean r3 = r3.m11163w()
            if (r3 != 0) goto L3a
            com.google.android.gms.measurement.internal.d r3 = r0.f5736a
            com.google.android.gms.measurement.internal.c r3 = r3.m3175t()
            o7.n3 r3 = r3.f5695p
            boolean r3 = r3.m11370b()
            if (r3 == 0) goto L4a
        L3a:
            o7.d6 r3 = r0.f19691e
            o7.f6 r4 = r3.f19649d
            r4.mo3183i()
            o7.k r4 = r3.f19648c
            r4.m11284a()
            r3.f19646a = r1
            r3.f19647b = r1
        L4a:
            androidx.appcompat.widget.x r1 = r0.f19692f
            java.lang.Object r2 = r1.f1482a0
            o7.f6 r2 = (p249o7.C4996f6) r2
            r2.mo3183i()
            java.lang.Object r2 = r1.f1481Z
            o7.b6 r2 = (p249o7.RunnableC4964b6) r2
            if (r2 == 0) goto L62
            java.lang.Object r3 = r1.f1482a0
            o7.f6 r3 = (p249o7.C4996f6) r3
            android.os.Handler r3 = r3.f19689c
            r3.removeCallbacks(r2)
        L62:
            java.lang.Object r1 = r1.f1482a0
            o7.f6 r1 = (p249o7.C4996f6) r1
            com.google.android.gms.measurement.internal.d r1 = r1.f5736a
            com.google.android.gms.measurement.internal.c r1 = r1.m3175t()
            o7.n3 r1 = r1.f5695p
            r2 = 0
            r1.m11369a(r2)
            o7.e6 r0 = r0.f19690d
            o7.f6 r1 = r0.f19664a
            r1.mo3183i()
            o7.f6 r1 = r0.f19664a
            com.google.android.gms.measurement.internal.d r1 = r1.f5736a
            boolean r1 = r1.m3165g()
            if (r1 != 0) goto L84
            goto L96
        L84:
            o7.f6 r1 = r0.f19664a
            com.google.android.gms.measurement.internal.d r1 = r1.f5736a
            u6.c r1 = r1.f5723n
            u6.d r1 = (p353u6.C6341d) r1
            java.util.Objects.requireNonNull(r1)
            long r3 = java.lang.System.currentTimeMillis()
            r0.m11148b(r3, r2)
        L96:
            return
        L97:
            o7.f6 r0 = r9.f19581a0
            long r5 = r9.f19580Z
            r0.mo3183i()
            r0.m11180m()
            com.google.android.gms.measurement.internal.d r1 = r0.f5736a
            com.google.android.gms.measurement.internal.b r1 = r1.mo3162d()
            o7.f3 r1 = r1.f5680n
            java.lang.Long r2 = java.lang.Long.valueOf(r5)
            java.lang.String r3 = "Activity paused, time"
            r1.m11170d(r3, r2)
            androidx.appcompat.widget.x r7 = r0.f19692f
            o7.b6 r8 = new o7.b6
            java.lang.Object r1 = r7.f1482a0
            o7.f6 r1 = (p249o7.C4996f6) r1
            com.google.android.gms.measurement.internal.d r1 = r1.f5736a
            u6.c r1 = r1.f5723n
            u6.d r1 = (p353u6.C6341d) r1
            java.util.Objects.requireNonNull(r1)
            long r3 = java.lang.System.currentTimeMillis()
            r1 = r8
            r2 = r7
            r1.<init>(r2, r3, r5)
            r7.f1481Z = r8
            java.lang.Object r1 = r7.f1482a0
            o7.f6 r1 = (p249o7.C4996f6) r1
            android.os.Handler r1 = r1.f19689c
            r2 = 2000(0x7d0, double:9.88E-321)
            r1.postDelayed(r8, r2)
            com.google.android.gms.measurement.internal.d r1 = r0.f5736a
            o7.f r1 = r1.f5716g
            boolean r1 = r1.m11163w()
            if (r1 == 0) goto Lea
            o7.d6 r0 = r0.f19691e
            o7.k r0 = r0.f19648c
            r0.m11284a()
        Lea:
            return
    }
}
