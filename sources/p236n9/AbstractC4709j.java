package p236n9;

/* renamed from: n9.j */
/* loaded from: classes.dex */
public abstract class AbstractC4709j implements p093f9.InterfaceC2083a {

    /* renamed from: a */
    public final p236n9.AbstractC4707h f18814a;

    /* renamed from: b */
    public final p236n9.AbstractC4707h f18815b;

    public AbstractC4709j(byte[] r2) {
            r1 = this;
            r1.<init>()
            r0 = 1
            n9.h r0 = r1.mo10768d(r2, r0)
            r1.f18814a = r0
            r0 = 0
            n9.h r2 = r1.mo10768d(r2, r0)
            r1.f18815b = r2
            return
    }

    /* renamed from: c */
    public static byte[] m10769c(byte[] r5, java.nio.ByteBuffer r6) {
            int r0 = r5.length
            int r0 = r0 % 16
            if (r0 != 0) goto L7
            int r0 = r5.length
            goto Le
        L7:
            int r0 = r5.length
            int r0 = r0 + 16
            int r1 = r5.length
            int r1 = r1 % 16
            int r0 = r0 - r1
        Le:
            int r1 = r6.remaining()
            int r2 = r1 % 16
            if (r2 != 0) goto L18
            r3 = r1
            goto L1b
        L18:
            int r3 = r1 + 16
            int r3 = r3 - r2
        L1b:
            int r3 = r3 + r0
            int r2 = r3 + 16
            java.nio.ByteBuffer r2 = java.nio.ByteBuffer.allocate(r2)
            java.nio.ByteOrder r4 = java.nio.ByteOrder.LITTLE_ENDIAN
            java.nio.ByteBuffer r2 = r2.order(r4)
            r2.put(r5)
            r2.position(r0)
            r2.put(r6)
            r2.position(r3)
            int r5 = r5.length
            long r5 = (long) r5
            r2.putLong(r5)
            long r5 = (long) r1
            r2.putLong(r5)
            byte[] r5 = r2.array()
            return r5
    }

    @Override // p093f9.InterfaceC2083a
    /* renamed from: a */
    public byte[] mo5506a(byte[] r5, byte[] r6) {
            r4 = this;
            int r0 = r5.length
            n9.h r1 = r4.f18814a
            int r1 = r1.mo10758g()
            r2 = 2147483647(0x7fffffff, float:NaN)
            int r2 = r2 - r1
            int r2 = r2 + (-16)
            if (r0 > r2) goto L80
            int r0 = r5.length
            n9.h r1 = r4.f18814a
            int r1 = r1.mo10758g()
            int r1 = r1 + r0
            int r1 = r1 + 16
            java.nio.ByteBuffer r0 = java.nio.ByteBuffer.allocate(r1)
            int r1 = r0.remaining()
            int r2 = r5.length
            n9.h r3 = r4.f18814a
            int r3 = r3.mo10758g()
            int r3 = r3 + r2
            int r3 = r3 + 16
            if (r1 < r3) goto L78
            int r1 = r0.position()
            n9.h r2 = r4.f18814a
            r2.m10766f(r0, r5)
            r0.position(r1)
            n9.h r5 = r4.f18814a
            int r5 = r5.mo10758g()
            byte[] r5 = new byte[r5]
            r0.get(r5)
            int r1 = r0.limit()
            int r1 = r1 + (-16)
            r0.limit(r1)
            r1 = 0
            if (r6 != 0) goto L52
            byte[] r6 = new byte[r1]
        L52:
            n9.h r2 = r4.f18815b
            java.nio.ByteBuffer r5 = r2.m10764c(r5, r1)
            r1 = 32
            byte[] r1 = new byte[r1]
            r5.get(r1)
            byte[] r5 = m10769c(r6, r0)
            byte[] r5 = p185k7.C3828h5.m8588c(r1, r5)
            int r6 = r0.limit()
            int r6 = r6 + 16
            r0.limit(r6)
            r0.put(r5)
            byte[] r5 = r0.array()
            return r5
        L78:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r6 = "Given ByteBuffer output is too small"
            r5.<init>(r6)
            throw r5
        L80:
            java.security.GeneralSecurityException r5 = new java.security.GeneralSecurityException
            java.lang.String r6 = "plaintext too long"
            r5.<init>(r6)
            throw r5
    }

    @Override // p093f9.InterfaceC2083a
    /* renamed from: b */
    public byte[] mo5507b(byte[] r6, byte[] r7) {
            r5 = this;
            java.nio.ByteBuffer r6 = java.nio.ByteBuffer.wrap(r6)
            int r0 = r6.remaining()
            n9.h r1 = r5.f18814a
            int r1 = r1.mo10758g()
            r2 = 16
            int r1 = r1 + r2
            if (r0 < r1) goto L77
            int r0 = r6.position()
            byte[] r1 = new byte[r2]
            int r3 = r6.limit()
            int r3 = r3 - r2
            r6.position(r3)
            r6.get(r1)
            r6.position(r0)
            int r3 = r6.limit()
            int r3 = r3 - r2
            r6.limit(r3)
            n9.h r2 = r5.f18814a
            int r2 = r2.mo10758g()
            byte[] r2 = new byte[r2]
            r6.get(r2)
            r3 = 0
            if (r7 != 0) goto L3f
            byte[] r7 = new byte[r3]
        L3f:
            n9.h r4 = r5.f18815b     // Catch: java.security.GeneralSecurityException -> L6c
            java.nio.ByteBuffer r2 = r4.m10764c(r2, r3)     // Catch: java.security.GeneralSecurityException -> L6c
            r3 = 32
            byte[] r3 = new byte[r3]     // Catch: java.security.GeneralSecurityException -> L6c
            r2.get(r3)     // Catch: java.security.GeneralSecurityException -> L6c
            byte[] r7 = m10769c(r7, r6)     // Catch: java.security.GeneralSecurityException -> L6c
            byte[] r7 = p185k7.C3828h5.m8588c(r3, r7)     // Catch: java.security.GeneralSecurityException -> L6c
            boolean r7 = p185k7.C3828h5.m8594i(r7, r1)     // Catch: java.security.GeneralSecurityException -> L6c
            if (r7 == 0) goto L64
            r6.position(r0)
            n9.h r7 = r5.f18814a
            byte[] r6 = r7.m10765e(r6)
            return r6
        L64:
            java.security.GeneralSecurityException r6 = new java.security.GeneralSecurityException     // Catch: java.security.GeneralSecurityException -> L6c
            java.lang.String r7 = "invalid MAC"
            r6.<init>(r7)     // Catch: java.security.GeneralSecurityException -> L6c
            throw r6     // Catch: java.security.GeneralSecurityException -> L6c
        L6c:
            r6 = move-exception
            javax.crypto.AEADBadTagException r7 = new javax.crypto.AEADBadTagException
            java.lang.String r6 = r6.toString()
            r7.<init>(r6)
            throw r7
        L77:
            java.security.GeneralSecurityException r6 = new java.security.GeneralSecurityException
            java.lang.String r7 = "ciphertext too short"
            r6.<init>(r7)
            throw r6
    }

    /* renamed from: d */
    public abstract p236n9.AbstractC4707h mo10768d(byte[] r1, int r2);
}
