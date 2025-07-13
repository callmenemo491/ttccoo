package p375v9;

/* renamed from: v9.n0 */
/* loaded from: classes.dex */
public final class C6613n0 implements p411x9.InterfaceC7004w, p411x9.InterfaceC6991j {

    /* renamed from: a */
    public final /* synthetic */ int f25788a;

    /* renamed from: b */
    public final /* synthetic */ com.google.firebase.auth.FirebaseAuth f25789b;

    public C6613n0(com.google.firebase.auth.FirebaseAuth r2, int r3) {
            r1 = this;
            r1.f25788a = r3
            r0 = 1
            if (r3 == r0) goto Lb
            r1.f25789b = r2
            r1.<init>()
            return
        Lb:
            r1.f25789b = r2
            r1.<init>()
            return
    }

    @Override // p411x9.InterfaceC7004w
    /* renamed from: a */
    public final void mo13460a(p124h7.C2752me r3, p375v9.AbstractC6614o r4) {
            r2 = this;
            int r0 = r2.f25788a
            r1 = 1
            switch(r0) {
                case 0: goto L7;
                default: goto L6;
            }
        L6:
            goto Ld
        L7:
            com.google.firebase.auth.FirebaseAuth r0 = r2.f25789b
            com.google.firebase.auth.FirebaseAuth.m3630e(r0, r4, r3, r1, r1)
            return
        Ld:
            java.lang.String r0 = "null reference"
            java.util.Objects.requireNonNull(r3, r0)
            java.util.Objects.requireNonNull(r4, r0)
            r4.mo13474j0(r3)
            com.google.firebase.auth.FirebaseAuth r0 = r2.f25789b
            com.google.firebase.auth.FirebaseAuth.m3630e(r0, r4, r3, r1, r1)
            return
    }

    @Override // p411x9.InterfaceC6991j
    /* renamed from: b */
    public final void mo13461b(com.google.android.gms.common.api.Status r5) {
            r4 = this;
            int r0 = r4.f25788a
            r1 = 17005(0x426d, float:2.3829E-41)
            r2 = 17021(0x427d, float:2.3852E-41)
            r3 = 17011(0x4273, float:2.3837E-41)
            switch(r0) {
                case 0: goto Lc;
                default: goto Lb;
            }
        Lb:
            goto L1a
        Lc:
            int r5 = r5.f5536Z
            if (r5 == r3) goto L14
            if (r5 == r2) goto L14
            if (r5 != r1) goto L19
        L14:
            com.google.firebase.auth.FirebaseAuth r5 = r4.f25789b
            r5.m3632b()
        L19:
            return
        L1a:
            int r5 = r5.f5536Z
            if (r5 == r3) goto L26
            if (r5 == r2) goto L26
            if (r5 == r1) goto L26
            r0 = 17091(0x42c3, float:2.395E-41)
            if (r5 != r0) goto L2b
        L26:
            com.google.firebase.auth.FirebaseAuth r5 = r4.f25789b
            r5.m3632b()
        L2b:
            return
    }
}
