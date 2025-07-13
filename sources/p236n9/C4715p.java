package p236n9;

/* renamed from: n9.p */
/* loaded from: classes.dex */
public class C4715p implements p093f9.InterfaceC2095m {

    /* renamed from: a */
    public final p187k9.InterfaceC4073a f18830a;

    /* renamed from: b */
    public final int f18831b;

    public C4715p(p187k9.InterfaceC4073a r2, int r3) {
            r1 = this;
            r1.<init>()
            r1.f18830a = r2
            r1.f18831b = r3
            r0 = 10
            if (r3 < r0) goto L14
            r0 = 0
            byte[] r0 = new byte[r0]
            n9.o r2 = (p236n9.C4714o) r2
            r2.m10772a(r0, r3)
            return
        L14:
            java.security.InvalidAlgorithmParameterException r2 = new java.security.InvalidAlgorithmParameterException
            java.lang.String r3 = "tag size too small, need at least 10 bytes"
            r2.<init>(r3)
            throw r2
    }

    @Override // p093f9.InterfaceC2095m
    /* renamed from: a */
    public void mo5536a(byte[] r3, byte[] r4) {
            r2 = this;
            k9.a r0 = r2.f18830a
            int r1 = r2.f18831b
            n9.o r0 = (p236n9.C4714o) r0
            byte[] r4 = r0.m10772a(r4, r1)
            boolean r3 = p185k7.C3828h5.m8594i(r4, r3)
            if (r3 == 0) goto L11
            return
        L11:
            java.security.GeneralSecurityException r3 = new java.security.GeneralSecurityException
            java.lang.String r4 = "invalid MAC"
            r3.<init>(r4)
            throw r3
    }

    @Override // p093f9.InterfaceC2095m
    /* renamed from: b */
    public byte[] mo5537b(byte[] r3) {
            r2 = this;
            k9.a r0 = r2.f18830a
            int r1 = r2.f18831b
            n9.o r0 = (p236n9.C4714o) r0
            byte[] r3 = r0.m10772a(r3, r1)
            return r3
    }
}
