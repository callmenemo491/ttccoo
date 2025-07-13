package p249o7;

/* renamed from: o7.o5 */
/* loaded from: classes.dex */
public final class RunnableC5067o5 implements java.lang.Runnable {

    /* renamed from: Y */
    public final /* synthetic */ p249o7.C5116u6 f19925Y;

    /* renamed from: Z */
    public final /* synthetic */ boolean f19926Z;

    /* renamed from: a0 */
    public final /* synthetic */ p249o7.C5076p6 f19927a0;

    /* renamed from: b0 */
    public final /* synthetic */ p249o7.C5123v5 f19928b0;

    public RunnableC5067o5(p249o7.C5123v5 r1, p249o7.C5116u6 r2, boolean r3, p249o7.C5076p6 r4) {
            r0 = this;
            r0.f19928b0 = r1
            r0.f19925Y = r2
            r0.f19926Z = r3
            r0.f19927a0 = r4
            r0.<init>()
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r4 = this;
            o7.v5 r0 = r4.f19928b0
            o7.z2 r1 = r0.f20135d
            if (r1 != 0) goto L14
            com.google.android.gms.measurement.internal.d r0 = r0.f5736a
            com.google.android.gms.measurement.internal.b r0 = r0.mo3162d()
            o7.f3 r0 = r0.f5672f
            java.lang.String r1 = "Discarding data. Failed to set user property"
            r0.m11169c(r1)
            return
        L14:
            o7.u6 r0 = r4.f19925Y
            java.lang.String r2 = "null reference"
            java.util.Objects.requireNonNull(r0, r2)
            o7.v5 r0 = r4.f19928b0
            boolean r2 = r4.f19926Z
            if (r2 == 0) goto L23
            r2 = 0
            goto L25
        L23:
            o7.p6 r2 = r4.f19927a0
        L25:
            o7.u6 r3 = r4.f19925Y
            r0.m11426m(r1, r2, r3)
            o7.v5 r0 = r4.f19928b0
            r0.m11433t()
            return
    }
}
