package p124h7;

/* renamed from: h7.b8 */
/* loaded from: classes.dex */
public final class C2548b8 implements p124h7.InterfaceC2955y1 {

    /* renamed from: a */
    public final p124h7.InterfaceC2885u3 f11395a;

    /* renamed from: b */
    public final int f11396b;

    public C2548b8(p124h7.InterfaceC2885u3 r2, int r3) {
            r1 = this;
            r1.<init>()
            r1.f11395a = r2
            r1.f11396b = r3
            r0 = 10
            if (r3 < r0) goto L12
            r0 = 0
            byte[] r0 = new byte[r0]
            r2.mo1269a(r0, r3)
            return
        L12:
            java.security.InvalidAlgorithmParameterException r2 = new java.security.InvalidAlgorithmParameterException
            java.lang.String r3 = "tag size too small, need at least 10 bytes"
            r2.<init>(r3)
            throw r2
    }

    @Override // p124h7.InterfaceC2955y1
    /* renamed from: a */
    public final void mo6510a(byte[] r3, byte[] r4) {
            r2 = this;
            h7.u3 r0 = r2.f11395a
            int r1 = r2.f11396b
            byte[] r4 = r0.mo1269a(r4, r1)
            boolean r3 = p124h7.C2939x3.m7299y(r4, r3)
            if (r3 == 0) goto Lf
            return
        Lf:
            java.security.GeneralSecurityException r3 = new java.security.GeneralSecurityException
            java.lang.String r4 = "invalid MAC"
            r3.<init>(r4)
            throw r3
    }
}
