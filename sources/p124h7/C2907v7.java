package p124h7;

/* renamed from: h7.v7 */
/* loaded from: classes.dex */
public final class C2907v7 implements p124h7.InterfaceC2703k1 {

    /* renamed from: a */
    public final p124h7.InterfaceC2961y7 f11951a;

    /* renamed from: b */
    public final p124h7.InterfaceC2955y1 f11952b;

    /* renamed from: c */
    public final int f11953c;

    public C2907v7(p124h7.InterfaceC2961y7 r1, p124h7.InterfaceC2955y1 r2, int r3) {
            r0 = this;
            r0.<init>()
            r0.f11951a = r1
            r0.f11952b = r2
            r0.f11953c = r3
            return
    }

    @Override // p124h7.InterfaceC2703k1
    /* renamed from: a */
    public final byte[] mo6933a(byte[] r9, byte[] r10) {
            r8 = this;
            int r0 = r9.length
            int r1 = r8.f11953c
            if (r0 < r1) goto L47
            int r1 = r0 - r1
            r2 = 0
            byte[] r1 = java.util.Arrays.copyOfRange(r9, r2, r1)
            int r3 = r8.f11953c
            int r3 = r0 - r3
            byte[] r9 = java.util.Arrays.copyOfRange(r9, r3, r0)
            r0 = 8
            java.nio.ByteBuffer r3 = java.nio.ByteBuffer.allocate(r0)
            int r4 = r10.length
            long r4 = (long) r4
            r6 = 8
            long r4 = r4 * r6
            java.nio.ByteBuffer r3 = r3.putLong(r4)
            byte[] r3 = r3.array()
            byte[] r0 = java.util.Arrays.copyOf(r3, r0)
            h7.y1 r3 = r8.f11952b
            r4 = 3
            byte[][] r4 = new byte[r4][]
            r4[r2] = r10
            r10 = 1
            r4[r10] = r1
            r10 = 2
            r4[r10] = r0
            byte[] r10 = p124h7.C2939x3.m7252B(r4)
            r3.mo6510a(r9, r10)
            h7.y7 r9 = r8.f11951a
            byte[] r9 = r9.mo6962a(r1)
            return r9
        L47:
            java.security.GeneralSecurityException r9 = new java.security.GeneralSecurityException
            java.lang.String r10 = "ciphertext too short"
            r9.<init>(r10)
            throw r9
    }

    @Override // p124h7.InterfaceC2703k1
    /* renamed from: b */
    public final byte[] mo6934b(byte[] r1, byte[] r2) {
            r0 = this;
            r1 = 0
            throw r1
    }
}
