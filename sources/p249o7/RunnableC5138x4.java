package p249o7;

/* renamed from: o7.x4 */
/* loaded from: classes.dex */
public final class RunnableC5138x4 implements java.lang.Runnable {

    /* renamed from: Y */
    public final /* synthetic */ int f20166Y;

    /* renamed from: Z */
    public final /* synthetic */ long f20167Z;

    /* renamed from: a0 */
    public final /* synthetic */ p249o7.C4979d5 f20168a0;

    public RunnableC5138x4(p249o7.C4979d5 r2, long r3, int r5) {
            r1 = this;
            r1.f20166Y = r5
            r0 = 1
            if (r5 == r0) goto Ld
            r1.f20168a0 = r2
            r1.f20167Z = r3
            r1.<init>()
            return
        Ld:
            r1.f20168a0 = r2
            r1.f20167Z = r3
            r1.<init>()
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r4 = this;
            int r0 = r4.f20166Y
            switch(r0) {
                case 0: goto L6;
                default: goto L5;
            }
        L5:
            goto L2b
        L6:
            o7.d5 r0 = r4.f20168a0
            com.google.android.gms.measurement.internal.d r0 = r0.f5736a
            com.google.android.gms.measurement.internal.c r0 = r0.m3175t()
            o7.p3 r0 = r0.f5689j
            long r1 = r4.f20167Z
            r0.m11411b(r1)
            o7.d5 r0 = r4.f20168a0
            com.google.android.gms.measurement.internal.d r0 = r0.f5736a
            com.google.android.gms.measurement.internal.b r0 = r0.mo3162d()
            o7.f3 r0 = r0.f5679m
            long r1 = r4.f20167Z
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            java.lang.String r2 = "Session timeout duration set"
            r0.m11170d(r2, r1)
            return
        L2b:
            o7.d5 r0 = r4.f20168a0
            long r1 = r4.f20167Z
            r3 = 1
            r0.m11136s(r1, r3)
            o7.d5 r0 = r4.f20168a0
            com.google.android.gms.measurement.internal.d r0 = r0.f5736a
            o7.v5 r0 = r0.m3179y()
            java.util.concurrent.atomic.AtomicReference r1 = new java.util.concurrent.atomic.AtomicReference
            r1.<init>()
            r0.m11438z(r1)
            return
    }
}
