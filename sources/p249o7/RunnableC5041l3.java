package p249o7;

/* renamed from: o7.l3 */
/* loaded from: classes.dex */
public final class RunnableC5041l3 implements java.lang.Runnable {

    /* renamed from: Y */
    public final /* synthetic */ int f19820Y;

    /* renamed from: Z */
    public final /* synthetic */ boolean f19821Z;

    /* renamed from: a0 */
    public final /* synthetic */ java.lang.Object f19822a0;

    public RunnableC5041l3(p249o7.C4979d5 r2, boolean r3) {
            r1 = this;
            r0 = 1
            r1.f19820Y = r0
            r1.f19822a0 = r2
            r1.f19821Z = r3
            r1.<init>()
            return
    }

    public RunnableC5041l3(p249o7.C5049m3 r2, boolean r3) {
            r1 = this;
            r0 = 0
            r1.f19820Y = r0
            r1.f19822a0 = r2
            r1.f19821Z = r3
            r1.<init>()
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r4 = this;
            int r0 = r4.f19820Y
            switch(r0) {
                case 0: goto L6;
                default: goto L5;
            }
        L5:
            goto L10
        L6:
            java.lang.Object r0 = r4.f19822a0
            o7.m3 r0 = (p249o7.C5049m3) r0
            o7.m6 r0 = r0.f19842a
            r0.m11334D()
            return
        L10:
            java.lang.Object r0 = r4.f19822a0
            o7.d5 r0 = (p249o7.C4979d5) r0
            com.google.android.gms.measurement.internal.d r0 = r0.f5736a
            boolean r0 = r0.m3165g()
            java.lang.Object r1 = r4.f19822a0
            o7.d5 r1 = (p249o7.C4979d5) r1
            com.google.android.gms.measurement.internal.d r1 = r1.f5736a
            boolean r1 = r1.m3159a()
            java.lang.Object r2 = r4.f19822a0
            o7.d5 r2 = (p249o7.C4979d5) r2
            com.google.android.gms.measurement.internal.d r2 = r2.f5736a
            boolean r3 = r4.f19821Z
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            r2.f5703A = r3
            boolean r2 = r4.f19821Z
            if (r1 != r2) goto L4d
            java.lang.Object r1 = r4.f19822a0
            o7.d5 r1 = (p249o7.C4979d5) r1
            com.google.android.gms.measurement.internal.d r1 = r1.f5736a
            com.google.android.gms.measurement.internal.b r1 = r1.mo3162d()
            o7.f3 r1 = r1.f5680n
            boolean r2 = r4.f19821Z
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            java.lang.String r3 = "Default data collection state already set to"
            r1.m11170d(r3, r2)
        L4d:
            java.lang.Object r1 = r4.f19822a0
            o7.d5 r1 = (p249o7.C4979d5) r1
            com.google.android.gms.measurement.internal.d r1 = r1.f5736a
            boolean r1 = r1.m3165g()
            if (r1 == r0) goto L6f
            java.lang.Object r1 = r4.f19822a0
            o7.d5 r1 = (p249o7.C4979d5) r1
            com.google.android.gms.measurement.internal.d r1 = r1.f5736a
            boolean r1 = r1.m3165g()
            java.lang.Object r2 = r4.f19822a0
            o7.d5 r2 = (p249o7.C4979d5) r2
            com.google.android.gms.measurement.internal.d r2 = r2.f5736a
            boolean r2 = r2.m3159a()
            if (r1 == r2) goto L8a
        L6f:
            java.lang.Object r1 = r4.f19822a0
            o7.d5 r1 = (p249o7.C4979d5) r1
            com.google.android.gms.measurement.internal.d r1 = r1.f5736a
            com.google.android.gms.measurement.internal.b r1 = r1.mo3162d()
            o7.f3 r1 = r1.f5677k
            boolean r2 = r4.f19821Z
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            java.lang.String r3 = "Default data collection is different than actual status"
            r1.m11171e(r3, r2, r0)
        L8a:
            java.lang.Object r0 = r4.f19822a0
            o7.d5 r0 = (p249o7.C4979d5) r0
            r0.m11126F()
            return
    }
}
