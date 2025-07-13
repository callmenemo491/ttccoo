package p249o7;

/* renamed from: o7.t5 */
/* loaded from: classes.dex */
public final class RunnableC5107t5 implements java.lang.Runnable {

    /* renamed from: Y */
    public final /* synthetic */ int f20010Y;

    /* renamed from: Z */
    public final /* synthetic */ p249o7.ServiceConnectionC5115u5 f20011Z;

    public RunnableC5107t5(p249o7.ServiceConnectionC5115u5 r2, int r3) {
            r1 = this;
            r1.f20010Y = r3
            r0 = 1
            if (r3 == r0) goto Lb
            r1.f20011Z = r2
            r1.<init>()
            return
        Lb:
            r1.f20011Z = r2
            r1.<init>()
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r4 = this;
            int r0 = r4.f20010Y
            switch(r0) {
                case 0: goto L6;
                default: goto L5;
            }
        L5:
            goto L22
        L6:
            o7.u5 r0 = r4.f20011Z
            o7.v5 r0 = r0.f20030a0
            android.content.ComponentName r1 = new android.content.ComponentName
            com.google.android.gms.measurement.internal.d r2 = r0.f5736a
            android.content.Context r2 = r2.f5710a
            o7.u5 r3 = r4.f20011Z
            o7.v5 r3 = r3.f20030a0
            com.google.android.gms.measurement.internal.d r3 = r3.f5736a
            java.util.Objects.requireNonNull(r3)
            java.lang.String r3 = "com.google.android.gms.measurement.AppMeasurementService"
            r1.<init>(r2, r3)
            p249o7.C5123v5.m11425w(r0, r1)
            return
        L22:
            o7.u5 r0 = r4.f20011Z
            o7.v5 r0 = r0.f20030a0
            r1 = 0
            r0.f20135d = r1
            r0.m11432s()
            return
    }
}
