package p236n9;

/* renamed from: n9.k */
/* loaded from: classes.dex */
public final class C4710k implements p093f9.InterfaceC2083a {

    /* renamed from: a */
    public final p236n9.InterfaceC4713n f18816a;

    /* renamed from: b */
    public final p093f9.InterfaceC2095m f18817b;

    /* renamed from: c */
    public final int f18818c;

    public C4710k(p236n9.InterfaceC4713n r1, p093f9.InterfaceC2095m r2, int r3) {
            r0 = this;
            r0.<init>()
            r0.f18816a = r1
            r0.f18817b = r2
            r0.f18818c = r3
            return
    }

    @Override // p093f9.InterfaceC2083a
    /* renamed from: a */
    public byte[] mo5506a(byte[] r8, byte[] r9) {
            r7 = this;
            n9.n r0 = r7.f18816a
            byte[] r8 = r0.mo10746a(r8)
            r0 = 0
            if (r9 != 0) goto Lb
            byte[] r9 = new byte[r0]
        Lb:
            r1 = 8
            java.nio.ByteBuffer r2 = java.nio.ByteBuffer.allocate(r1)
            r3 = 8
            int r5 = r9.length
            long r5 = (long) r5
            long r5 = r5 * r3
            java.nio.ByteBuffer r2 = r2.putLong(r5)
            byte[] r2 = r2.array()
            byte[] r1 = java.util.Arrays.copyOf(r2, r1)
            f9.m r2 = r7.f18817b
            r3 = 3
            byte[][] r3 = new byte[r3][]
            r3[r0] = r9
            r9 = 1
            r3[r9] = r8
            r4 = 2
            r3[r4] = r1
            byte[] r1 = p185k7.C3828h5.m8589d(r3)
            byte[] r1 = r2.mo5537b(r1)
            byte[][] r2 = new byte[r4][]
            r2[r0] = r8
            r2[r9] = r1
            byte[] r8 = p185k7.C3828h5.m8589d(r2)
            return r8
    }

    @Override // p093f9.InterfaceC2083a
    /* renamed from: b */
    public byte[] mo5507b(byte[] r9, byte[] r10) {
            r8 = this;
            int r0 = r9.length
            int r1 = r8.f18818c
            if (r0 < r1) goto L4c
            int r0 = r9.length
            int r0 = r0 - r1
            r1 = 0
            byte[] r0 = java.util.Arrays.copyOfRange(r9, r1, r0)
            int r2 = r9.length
            int r3 = r8.f18818c
            int r2 = r2 - r3
            int r3 = r9.length
            byte[] r9 = java.util.Arrays.copyOfRange(r9, r2, r3)
            if (r10 != 0) goto L19
            byte[] r10 = new byte[r1]
        L19:
            r2 = 8
            java.nio.ByteBuffer r3 = java.nio.ByteBuffer.allocate(r2)
            r4 = 8
            int r6 = r10.length
            long r6 = (long) r6
            long r6 = r6 * r4
            java.nio.ByteBuffer r3 = r3.putLong(r6)
            byte[] r3 = r3.array()
            byte[] r2 = java.util.Arrays.copyOf(r3, r2)
            f9.m r3 = r8.f18817b
            r4 = 3
            byte[][] r4 = new byte[r4][]
            r4[r1] = r10
            r10 = 1
            r4[r10] = r0
            r10 = 2
            r4[r10] = r2
            byte[] r10 = p185k7.C3828h5.m8589d(r4)
            r3.mo5536a(r9, r10)
            n9.n r9 = r8.f18816a
            byte[] r9 = r9.mo10747b(r0)
            return r9
        L4c:
            java.security.GeneralSecurityException r9 = new java.security.GeneralSecurityException
            java.lang.String r10 = "ciphertext too short"
            r9.<init>(r10)
            throw r9
    }
}
