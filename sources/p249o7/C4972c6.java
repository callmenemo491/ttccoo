package p249o7;

/* renamed from: o7.c6 */
/* loaded from: classes.dex */
public final class C4972c6 extends p249o7.AbstractC5029k {

    /* renamed from: e */
    public final /* synthetic */ int f19622e;

    /* renamed from: f */
    public final /* synthetic */ java.lang.Object f19623f;

    public C4972c6(p249o7.C4980d6 r2, p249o7.InterfaceC5058n4 r3) {
            r1 = this;
            r0 = 0
            r1.f19622e = r0
            r1.f19623f = r2
            r1.<init>(r3)
            return
    }

    public C4972c6(p249o7.C5004g6 r2, p249o7.InterfaceC5058n4 r3) {
            r1 = this;
            r0 = 1
            r1.f19622e = r0
            r1.f19623f = r2
            r1.<init>(r3)
            return
    }

    @Override // p249o7.AbstractC5029k
    /* renamed from: b */
    public final void mo11119b() {
            r4 = this;
            int r0 = r4.f19622e
            switch(r0) {
                case 0: goto L6;
                default: goto L5;
            }
        L5:
            goto L3d
        L6:
            java.lang.Object r0 = r4.f19623f
            o7.d6 r0 = (p249o7.C4980d6) r0
            o7.f6 r1 = r0.f19649d
            r1.mo3183i()
            o7.f6 r1 = r0.f19649d
            com.google.android.gms.measurement.internal.d r1 = r1.f5736a
            u6.c r1 = r1.f5723n
            u6.d r1 = (p353u6.C6341d) r1
            java.util.Objects.requireNonNull(r1)
            long r1 = android.os.SystemClock.elapsedRealtime()
            r3 = 0
            r0.m11144a(r3, r3, r1)
            o7.f6 r1 = r0.f19649d
            com.google.android.gms.measurement.internal.d r1 = r1.f5736a
            o7.y1 r1 = r1.m3169n()
            o7.f6 r0 = r0.f19649d
            com.google.android.gms.measurement.internal.d r0 = r0.f5736a
            u6.c r0 = r0.f5723n
            u6.d r0 = (p353u6.C6341d) r0
            java.util.Objects.requireNonNull(r0)
            long r2 = android.os.SystemClock.elapsedRealtime()
            r1.m11449l(r2)
            return
        L3d:
            java.lang.Object r0 = r4.f19623f
            o7.g6 r0 = (p249o7.C5004g6) r0
            r0.m11193m()
            java.lang.Object r0 = r4.f19623f
            o7.g6 r0 = (p249o7.C5004g6) r0
            com.google.android.gms.measurement.internal.d r0 = r0.f5736a
            com.google.android.gms.measurement.internal.b r0 = r0.mo3162d()
            o7.f3 r0 = r0.f5680n
            java.lang.String r1 = "Starting upload from DelayedRunnable"
            r0.m11169c(r1)
            java.lang.Object r0 = r4.f19623f
            o7.g6 r0 = (p249o7.C5004g6) r0
            o7.m6 r0 = r0.f19756b
            r0.m11361t()
            return
    }
}
