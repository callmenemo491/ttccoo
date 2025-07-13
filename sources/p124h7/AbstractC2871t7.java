package p124h7;

/* renamed from: h7.t7 */
/* loaded from: classes.dex */
public abstract class AbstractC2871t7 implements p124h7.InterfaceC2703k1 {

    /* renamed from: a */
    public final p124h7.AbstractC2835r7 f11919a;

    /* renamed from: b */
    public final p124h7.AbstractC2835r7 f11920b;

    public AbstractC2871t7(byte[] r2) {
            r1 = this;
            r1.<init>()
            r0 = 1
            h7.r7 r0 = r1.mo6712c(r2, r0)
            r1.f11919a = r0
            r0 = 0
            h7.r7 r2 = r1.mo6712c(r2, r0)
            r1.f11920b = r2
            return
    }

    @Override // p124h7.InterfaceC2703k1
    /* renamed from: a */
    public final byte[] mo6933a(byte[] r10, byte[] r11) {
            r9 = this;
            java.nio.ByteBuffer r10 = java.nio.ByteBuffer.wrap(r10)
            int r0 = r10.remaining()
            h7.r7 r1 = r9.f11919a
            int r1 = r1.mo6645b()
            r2 = 16
            int r1 = r1 + r2
            if (r0 < r1) goto Lad
            int r0 = r10.position()
            byte[] r1 = new byte[r2]
            int r2 = r10.limit()
            int r2 = r2 + (-16)
            r10.position(r2)
            r10.get(r1)
            r10.position(r0)
            int r2 = r10.limit()
            int r2 = r2 + (-16)
            r10.limit(r2)
            h7.r7 r2 = r9.f11919a
            int r2 = r2.mo6645b()
            byte[] r2 = new byte[r2]
            r10.get(r2)
            h7.r7 r3 = r9.f11920b     // Catch: java.security.GeneralSecurityException -> La2
            r4 = 0
            java.nio.ByteBuffer r2 = r3.m7083d(r2, r4)     // Catch: java.security.GeneralSecurityException -> La2
            r3 = 32
            byte[] r3 = new byte[r3]     // Catch: java.security.GeneralSecurityException -> La2
            r2.get(r3)     // Catch: java.security.GeneralSecurityException -> La2
            int r2 = r11.length     // Catch: java.security.GeneralSecurityException -> La2
            r4 = r2 & 15
            if (r4 != 0) goto L51
            r5 = r2
            goto L54
        L51:
            int r5 = r2 + 16
            int r5 = r5 - r4
        L54:
            int r4 = r10.remaining()     // Catch: java.security.GeneralSecurityException -> La2
            int r6 = r4 % 16
            if (r6 != 0) goto L5e
            r7 = r4
            goto L61
        L5e:
            int r7 = r4 + 16
            int r7 = r7 - r6
        L61:
            int r7 = r7 + r5
            int r6 = r7 + 16
            java.nio.ByteBuffer r6 = java.nio.ByteBuffer.allocate(r6)     // Catch: java.security.GeneralSecurityException -> La2
            java.nio.ByteOrder r8 = java.nio.ByteOrder.LITTLE_ENDIAN     // Catch: java.security.GeneralSecurityException -> La2
            java.nio.ByteBuffer r6 = r6.order(r8)     // Catch: java.security.GeneralSecurityException -> La2
            r6.put(r11)     // Catch: java.security.GeneralSecurityException -> La2
            r6.position(r5)     // Catch: java.security.GeneralSecurityException -> La2
            r6.put(r10)     // Catch: java.security.GeneralSecurityException -> La2
            r6.position(r7)     // Catch: java.security.GeneralSecurityException -> La2
            long r7 = (long) r2     // Catch: java.security.GeneralSecurityException -> La2
            r6.putLong(r7)     // Catch: java.security.GeneralSecurityException -> La2
            long r4 = (long) r4     // Catch: java.security.GeneralSecurityException -> La2
            r6.putLong(r4)     // Catch: java.security.GeneralSecurityException -> La2
            byte[] r11 = r6.array()     // Catch: java.security.GeneralSecurityException -> La2
            byte[] r11 = p052d6.C1306f0.m3778g(r3, r11)     // Catch: java.security.GeneralSecurityException -> La2
            boolean r11 = p124h7.C2939x3.m7299y(r11, r1)     // Catch: java.security.GeneralSecurityException -> La2
            if (r11 == 0) goto L9a
            r10.position(r0)
            h7.r7 r11 = r9.f11919a
            byte[] r10 = r11.m7084h(r10)
            return r10
        L9a:
            java.security.GeneralSecurityException r10 = new java.security.GeneralSecurityException     // Catch: java.security.GeneralSecurityException -> La2
            java.lang.String r11 = "invalid MAC"
            r10.<init>(r11)     // Catch: java.security.GeneralSecurityException -> La2
            throw r10     // Catch: java.security.GeneralSecurityException -> La2
        La2:
            r10 = move-exception
            javax.crypto.AEADBadTagException r11 = new javax.crypto.AEADBadTagException
            java.lang.String r10 = r10.toString()
            r11.<init>(r10)
            throw r11
        Lad:
            java.security.GeneralSecurityException r10 = new java.security.GeneralSecurityException
            java.lang.String r11 = "ciphertext too short"
            r10.<init>(r11)
            throw r10
    }

    @Override // p124h7.InterfaceC2703k1
    /* renamed from: b */
    public final byte[] mo6934b(byte[] r1, byte[] r2) {
            r0 = this;
            r1 = 0
            throw r1
    }

    /* renamed from: c */
    public abstract p124h7.AbstractC2835r7 mo6712c(byte[] r1, int r2);
}
