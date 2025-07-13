package p249o7;

/* renamed from: o7.w4 */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC5130w4 implements java.lang.Runnable {

    /* renamed from: Y */
    public final /* synthetic */ int f20145Y;

    /* renamed from: Z */
    public final /* synthetic */ java.lang.Object f20146Z;

    /* renamed from: a0 */
    public final /* synthetic */ java.lang.Object f20147a0;

    /* renamed from: b0 */
    public final /* synthetic */ long f20148b0;

    public /* synthetic */ RunnableC5130w4(p249o7.C4979d5 r2, android.os.Bundle r3, long r4) {
            r1 = this;
            r0 = 0
            r1.f20145Y = r0
            r1.<init>()
            r1.f20146Z = r2
            r1.f20147a0 = r3
            r1.f20148b0 = r4
            return
    }

    public RunnableC5130w4(p249o7.C5051m5 r2, p249o7.C5027j5 r3, long r4) {
            r1 = this;
            r0 = 1
            r1.f20145Y = r0
            r1.f20147a0 = r2
            r1.f20146Z = r3
            r1.f20148b0 = r4
            r1.<init>()
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r5 = this;
            int r0 = r5.f20145Y
            switch(r0) {
                case 0: goto L6;
                default: goto L5;
            }
        L5:
            goto L14
        L6:
            java.lang.Object r0 = r5.f20146Z
            o7.d5 r0 = (p249o7.C4979d5) r0
            java.lang.Object r1 = r5.f20147a0
            android.os.Bundle r1 = (android.os.Bundle) r1
            long r2 = r5.f20148b0
            r0.m11124D(r1, r2)
            return
        L14:
            java.lang.Object r0 = r5.f20147a0
            o7.m5 r0 = (p249o7.C5051m5) r0
            java.lang.Object r1 = r5.f20146Z
            o7.j5 r1 = (p249o7.C5027j5) r1
            long r2 = r5.f20148b0
            r4 = 0
            r0.m11321o(r1, r4, r2)
            java.lang.Object r0 = r5.f20147a0
            o7.m5 r0 = (p249o7.C5051m5) r0
            r1 = 0
            r0.f19848e = r1
            com.google.android.gms.measurement.internal.d r0 = r0.f5736a
            o7.v5 r0 = r0.m3179y()
            r0.mo3183i()
            r0.m11419j()
            h6.a0 r2 = new h6.a0
            r2.<init>(r0, r1)
            r0.m11434u(r2)
            return
    }
}
