package p249o7;

/* renamed from: o7.u4 */
/* loaded from: classes.dex */
public final class RunnableC5114u4 implements java.lang.Runnable {

    /* renamed from: Y */
    public final /* synthetic */ int f20025Y;

    /* renamed from: Z */
    public final /* synthetic */ p185k7.InterfaceC3956r0 f20026Z;

    /* renamed from: a0 */
    public final /* synthetic */ com.google.android.gms.measurement.internal.AppMeasurementDynamiteService f20027a0;

    public RunnableC5114u4(com.google.android.gms.measurement.internal.AppMeasurementDynamiteService r2, p185k7.InterfaceC3956r0 r3, int r4) {
            r1 = this;
            r1.f20025Y = r4
            r0 = 1
            if (r4 == r0) goto Ld
            r1.f20027a0 = r2
            r1.f20026Z = r3
            r1.<init>()
            return
        Ld:
            r1.f20027a0 = r2
            r1.f20026Z = r3
            r1.<init>()
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r4 = this;
            int r0 = r4.f20025Y
            switch(r0) {
                case 0: goto L6;
                default: goto L5;
            }
        L5:
            goto L24
        L6:
            com.google.android.gms.measurement.internal.AppMeasurementDynamiteService r0 = r4.f20027a0
            com.google.android.gms.measurement.internal.d r0 = r0.f5656a
            o7.v5 r0 = r0.m3179y()
            k7.r0 r1 = r4.f20026Z
            r0.mo3183i()
            r0.m11419j()
            r2 = 0
            o7.u6 r2 = r0.m11431r(r2)
            c6.h0 r3 = new c6.h0
            r3.<init>(r0, r2, r1)
            r0.m11434u(r3)
            return
        L24:
            com.google.android.gms.measurement.internal.AppMeasurementDynamiteService r0 = r4.f20027a0
            com.google.android.gms.measurement.internal.d r0 = r0.f5656a
            com.google.android.gms.measurement.internal.f r0 = r0.m3158A()
            k7.r0 r1 = r4.f20026Z
            com.google.android.gms.measurement.internal.AppMeasurementDynamiteService r2 = r4.f20027a0
            com.google.android.gms.measurement.internal.d r2 = r2.f5656a
            boolean r2 = r2.m3159a()
            r0.m3198C(r1, r2)
            return
    }
}
