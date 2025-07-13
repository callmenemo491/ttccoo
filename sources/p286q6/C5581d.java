package p286q6;

/* renamed from: q6.d */
/* loaded from: classes.dex */
public final class C5581d extends p248o6.AbstractC4910h<p286q6.InterfaceC5579b> {
    public C5581d(android.content.Context r8, android.os.Looper r9, p248o6.C4902d r10, p218m6.InterfaceC4391d r11, p218m6.InterfaceC4395h r12) {
            r7 = this;
            r3 = 270(0x10e, float:3.78E-43)
            r0 = r7
            r1 = r8
            r2 = r9
            r4 = r10
            r5 = r11
            r6 = r12
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return
    }

    @Override // p248o6.AbstractC4900c
    /* renamed from: A */
    public final java.lang.String mo2635A() {
            r1 = this;
            java.lang.String r0 = "com.google.android.gms.common.telemetry.service.START"
            return r0
    }

    @Override // p248o6.AbstractC4900c, p201l6.C4181a.e
    /* renamed from: h */
    public final int mo2636h() {
            r1 = this;
            r0 = 203390000(0xc1f7c30, float:1.2286286E-31)
            return r0
    }

    @Override // p248o6.AbstractC4900c
    /* renamed from: s */
    public final /* synthetic */ android.os.IInterface mo2637s(android.os.IBinder r3) {
            r2 = this;
            if (r3 != 0) goto L4
            r3 = 0
            return r3
        L4:
            java.lang.String r0 = "com.google.android.gms.common.internal.service.IClientTelemetryService"
            android.os.IInterface r0 = r3.queryLocalInterface(r0)
            boolean r1 = r0 instanceof p286q6.InterfaceC5579b
            if (r1 == 0) goto L11
            q6.b r0 = (p286q6.InterfaceC5579b) r0
            return r0
        L11:
            q6.a r0 = new q6.a
            r0.<init>(r3)
            return r0
    }

    @Override // p248o6.AbstractC4900c
    /* renamed from: u */
    public final p184k6.C3701d[] mo2638u() {
            r1 = this;
            k6.d[] r0 = p053d7.C1342d.f6857b
            return r0
    }

    @Override // p248o6.AbstractC4900c
    /* renamed from: z */
    public final java.lang.String mo2639z() {
            r1 = this;
            java.lang.String r0 = "com.google.android.gms.common.internal.service.IClientTelemetryService"
            return r0
    }
}
