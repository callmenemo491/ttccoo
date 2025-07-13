package p123h6;

/* renamed from: h6.x */
/* loaded from: classes.dex */
public final class C2517x extends p248o6.AbstractC4910h<p123h6.C2501h> {
    public C2517x(android.content.Context r8, android.os.Looper r9, p248o6.C4902d r10, p201l6.AbstractC4184d.a r11, p201l6.AbstractC4184d.b r12) {
            r7 = this;
            r3 = 161(0xa1, float:2.26E-43)
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
            java.lang.String r0 = "com.google.android.gms.cast.service.BIND_CAST_DEVICE_CONTROLLER_SERVICE"
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
    public final /* synthetic */ android.os.IInterface mo2637s(android.os.IBinder r3) {
            r2 = this;
            if (r3 != 0) goto L4
            r3 = 0
            goto L18
        L4:
            java.lang.String r0 = "com.google.android.gms.cast.internal.ICastService"
            android.os.IInterface r0 = r3.queryLocalInterface(r0)
            boolean r1 = r0 instanceof p123h6.C2501h
            if (r1 == 0) goto L12
            r3 = r0
            h6.h r3 = (p123h6.C2501h) r3
            goto L18
        L12:
            h6.h r0 = new h6.h
            r0.<init>(r3)
            r3 = r0
        L18:
            return r3
    }

    @Override // p248o6.AbstractC4900c
    /* renamed from: u */
    public final p184k6.C3701d[] mo2638u() {
            r1 = this;
            k6.d[] r0 = p036c6.C0872a0.f4729e
            return r0
    }

    @Override // p248o6.AbstractC4900c
    /* renamed from: z */
    public final java.lang.String mo2639z() {
            r1 = this;
            java.lang.String r0 = "com.google.android.gms.cast.internal.ICastService"
            return r0
    }
}
