package p124h7;

/* renamed from: h7.hc */
/* loaded from: classes.dex */
public final class C2660hc extends p248o6.AbstractC4910h<p124h7.InterfaceC2876tc> implements p124h7.InterfaceC2642gc {

    /* renamed from: B0 */
    public static final p306r6.C5797a f11585B0 = null;

    /* renamed from: A0 */
    public final p124h7.C2948xc f11586A0;

    /* renamed from: z0 */
    public final android.content.Context f11587z0;

    static {
            r6.a r0 = new r6.a
            java.lang.String r1 = "FirebaseAuth:"
            java.lang.String[] r1 = new java.lang.String[]{r1}
            java.lang.String r2 = "FirebaseAuth"
            r0.<init>(r2, r1)
            p124h7.C2660hc.f11585B0 = r0
            return
    }

    public C2660hc(android.content.Context r8, android.os.Looper r9, p248o6.C4902d r10, p124h7.C2948xc r11, p218m6.InterfaceC4391d r12, p218m6.InterfaceC4395h r13) {
            r7 = this;
            r3 = 112(0x70, float:1.57E-43)
            r0 = r7
            r1 = r8
            r2 = r9
            r4 = r10
            r5 = r12
            r6 = r13
            r0.<init>(r1, r2, r3, r4, r5, r6)
            java.lang.String r9 = "null reference"
            java.util.Objects.requireNonNull(r8, r9)
            r7.f11587z0 = r8
            r7.f11586A0 = r11
            return
    }

    @Override // p248o6.AbstractC4900c
    /* renamed from: A */
    public final java.lang.String mo2635A() {
            r1 = this;
            java.lang.String r0 = "com.google.firebase.auth.api.gms.service.START"
            return r0
    }

    @Override // p248o6.AbstractC4900c
    /* renamed from: B */
    public final java.lang.String mo6801B() {
            r4 = this;
            h7.xc r0 = r4.f11586A0
            boolean r0 = r0.f11542Y
            r1 = 0
            if (r0 == 0) goto L1d
            r6.a r0 = p124h7.C2660hc.f11585B0
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.String r2 = r0.f22479a
            java.lang.String r3 = "Preparing to create service connection to fallback implementation"
            java.lang.String r0 = r0.m12162c(r3, r1)
            android.util.Log.i(r2, r0)
            android.content.Context r0 = r4.f11587z0
            java.lang.String r0 = r0.getPackageName()
            return r0
        L1d:
            r6.a r0 = p124h7.C2660hc.f11585B0
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.String r2 = r0.f22479a
            java.lang.String r3 = "Preparing to create service connection to gms implementation"
            java.lang.String r0 = r0.m12162c(r3, r1)
            android.util.Log.i(r2, r0)
            java.lang.String r0 = "com.google.android.gms"
            return r0
    }

    @Override // p248o6.AbstractC4900c, p201l6.C4181a.e
    /* renamed from: f */
    public final boolean mo6802f() {
            r2 = this;
            android.content.Context r0 = r2.f11587z0
            java.lang.String r1 = "com.google.firebase.auth"
            int r0 = com.google.android.gms.dynamite.DynamiteModule.m3107a(r0, r1)
            if (r0 != 0) goto Lc
            r0 = 1
            return r0
        Lc:
            r0 = 0
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
            java.lang.String r0 = "com.google.firebase.auth.api.internal.IFirebaseAuthService"
            android.os.IInterface r0 = r3.queryLocalInterface(r0)
            boolean r1 = r0 instanceof p124h7.InterfaceC2876tc
            if (r1 == 0) goto L12
            r3 = r0
            h7.tc r3 = (p124h7.InterfaceC2876tc) r3
            goto L18
        L12:
            h7.qc r0 = new h7.qc
            r0.<init>(r3)
            r3 = r0
        L18:
            return r3
    }

    @Override // p248o6.AbstractC4900c
    /* renamed from: u */
    public final p184k6.C3701d[] mo2638u() {
            r1 = this;
            k6.d[] r0 = p124h7.C2938x2.f12018a
            return r0
    }

    @Override // p248o6.AbstractC4900c
    /* renamed from: w */
    public final android.os.Bundle mo6391w() {
            r3 = this;
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            h7.xc r1 = r3.f11586A0
            if (r1 == 0) goto L10
            java.lang.String r1 = r1.f12022Z
            java.lang.String r2 = "com.google.firebase.auth.API_KEY"
            r0.putString(r2, r1)
        L10:
            java.lang.String r1 = p124h7.C2571cd.m6532b()
            java.lang.String r2 = "com.google.firebase.auth.LIBRARY_VERSION"
            r0.putString(r2, r1)
            return r0
    }

    @Override // p248o6.AbstractC4900c
    /* renamed from: z */
    public final java.lang.String mo2639z() {
            r1 = this;
            java.lang.String r0 = "com.google.firebase.auth.api.internal.IFirebaseAuthService"
            return r0
    }
}
