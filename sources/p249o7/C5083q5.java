package p249o7;

/* renamed from: o7.q5 */
/* loaded from: classes.dex */
public final class C5083q5 extends p249o7.AbstractC5029k {

    /* renamed from: e */
    public final /* synthetic */ int f19965e;

    /* renamed from: f */
    public final /* synthetic */ p249o7.C5123v5 f19966f;

    public C5083q5(p249o7.C5123v5 r2, p249o7.InterfaceC5058n4 r3, int r4) {
            r1 = this;
            r1.f19965e = r4
            r0 = 1
            if (r4 == r0) goto Lb
            r1.f19966f = r2
            r1.<init>(r3)
            return
        Lb:
            r1.f19966f = r2
            r1.<init>(r3)
            return
    }

    @Override // p249o7.AbstractC5029k
    /* renamed from: b */
    public final void mo11119b() {
            r3 = this;
            int r0 = r3.f19965e
            switch(r0) {
                case 0: goto L6;
                default: goto L5;
            }
        L5:
            goto L23
        L6:
            o7.v5 r0 = r3.f19966f
            r0.mo3183i()
            boolean r1 = r0.m11428o()
            if (r1 != 0) goto L12
            goto L22
        L12:
            com.google.android.gms.measurement.internal.d r1 = r0.f5736a
            com.google.android.gms.measurement.internal.b r1 = r1.mo3162d()
            o7.f3 r1 = r1.f5680n
            java.lang.String r2 = "Inactivity, disconnecting from the service"
            r1.m11169c(r2)
            r0.m11437y()
        L22:
            return
        L23:
            o7.v5 r0 = r3.f19966f
            com.google.android.gms.measurement.internal.d r0 = r0.f5736a
            com.google.android.gms.measurement.internal.b r0 = r0.mo3162d()
            o7.f3 r0 = r0.f5675i
            java.lang.String r1 = "Tasks have been queued for a long time"
            r0.m11169c(r1)
            return
    }
}
