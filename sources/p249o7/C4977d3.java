package p249o7;

/* renamed from: o7.d3 */
/* loaded from: classes.dex */
public final class C4977d3 extends p248o6.AbstractC4900c<p249o7.InterfaceC5152z2> {
    public C4977d3(android.content.Context r10, android.os.Looper r11, p248o6.AbstractC4900c.a r12, p248o6.AbstractC4900c.b r13) {
            r9 = this;
            o6.i r3 = p248o6.AbstractC4912i.m11066a(r10)
            k6.f r4 = p184k6.C3703f.f16409b
            r5 = 93
            r8 = 0
            r0 = r9
            r1 = r10
            r2 = r11
            r6 = r12
            r7 = r13
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            return
    }

    @Override // p248o6.AbstractC4900c
    /* renamed from: A */
    public final java.lang.String mo2635A() {
            r1 = this;
            java.lang.String r0 = "com.google.android.gms.measurement.START"
            return r0
    }

    @Override // p248o6.AbstractC4900c, p201l6.C4181a.e
    /* renamed from: h */
    public final int mo2636h() {
            r1 = this;
            r0 = 12451000(0xbdfcb8, float:1.7447567E-38)
            return r0
    }

    @Override // p248o6.AbstractC4900c
    /* renamed from: s */
    public final /* bridge */ /* synthetic */ android.os.IInterface mo2637s(android.os.IBinder r3) {
            r2 = this;
            if (r3 != 0) goto L4
            r3 = 0
            goto L18
        L4:
            java.lang.String r0 = "com.google.android.gms.measurement.internal.IMeasurementService"
            android.os.IInterface r0 = r3.queryLocalInterface(r0)
            boolean r1 = r0 instanceof p249o7.InterfaceC5152z2
            if (r1 == 0) goto L12
            r3 = r0
            o7.z2 r3 = (p249o7.InterfaceC5152z2) r3
            goto L18
        L12:
            o7.w2 r0 = new o7.w2
            r0.<init>(r3)
            r3 = r0
        L18:
            return r3
    }

    @Override // p248o6.AbstractC4900c
    /* renamed from: z */
    public final java.lang.String mo2639z() {
            r1 = this;
            java.lang.String r0 = "com.google.android.gms.measurement.internal.IMeasurementService"
            return r0
    }
}
