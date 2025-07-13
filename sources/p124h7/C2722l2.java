package p124h7;

/* renamed from: h7.l2 */
/* loaded from: classes.dex */
public final class C2722l2 implements p124h7.InterfaceC2703k1 {

    /* renamed from: a */
    public final androidx.fragment.app.C0392l0 f11728a;

    public /* synthetic */ C2722l2(androidx.fragment.app.C0392l0 r1) {
            r0 = this;
            r0.<init>()
            r0.f11728a = r1
            return
    }

    @Override // p124h7.InterfaceC2703k1
    /* renamed from: a */
    public final byte[] mo6933a(byte[] r8, byte[] r9) {
            r7 = this;
            int r0 = r8.length
            r1 = 5
            if (r0 <= r1) goto L53
            r2 = 0
            byte[] r2 = java.util.Arrays.copyOfRange(r8, r2, r1)
            byte[] r0 = java.util.Arrays.copyOfRange(r8, r1, r0)
            androidx.fragment.app.l0 r1 = r7.f11728a
            java.util.List r1 = r1.m1268Z(r2)
            java.util.Iterator r1 = r1.iterator()
        L17:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L53
            java.lang.Object r2 = r1.next()
            h7.z1 r2 = (p124h7.C2973z1) r2
            P r2 = r2.f12047a     // Catch: java.security.GeneralSecurityException -> L2c
            h7.k1 r2 = (p124h7.InterfaceC2703k1) r2     // Catch: java.security.GeneralSecurityException -> L2c
            byte[] r8 = r2.mo6933a(r0, r9)     // Catch: java.security.GeneralSecurityException -> L2c
            return r8
        L2c:
            r2 = move-exception
            java.util.logging.Logger r3 = p124h7.C2740m2.f11759a
            java.util.logging.Level r4 = java.util.logging.Level.INFO
            java.lang.String r2 = r2.toString()
            java.lang.String r2 = java.lang.String.valueOf(r2)
            java.lang.String r5 = "ciphertext prefix matches a key, but cannot decrypt: "
            int r6 = r2.length()
            if (r6 == 0) goto L46
            java.lang.String r2 = r5.concat(r2)
            goto L4b
        L46:
            java.lang.String r2 = new java.lang.String
            r2.<init>(r5)
        L4b:
            java.lang.String r5 = "com.google.crypto.tink.aead.AeadWrapper$WrappedAead"
            java.lang.String r6 = "decrypt"
            r3.logp(r4, r5, r6, r2)
            goto L17
        L53:
            androidx.fragment.app.l0 r0 = r7.f11728a
            byte[] r1 = p124h7.C2721l1.f11727a
            java.util.List r0 = r0.m1268Z(r1)
            java.util.Iterator r0 = r0.iterator()
        L5f:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L76
            java.lang.Object r1 = r0.next()
            h7.z1 r1 = (p124h7.C2973z1) r1
            P r1 = r1.f12047a     // Catch: java.security.GeneralSecurityException -> L74
            h7.k1 r1 = (p124h7.InterfaceC2703k1) r1     // Catch: java.security.GeneralSecurityException -> L74
            byte[] r8 = r1.mo6933a(r8, r9)     // Catch: java.security.GeneralSecurityException -> L74
            return r8
        L74:
            goto L5f
        L76:
            java.security.GeneralSecurityException r8 = new java.security.GeneralSecurityException
            java.lang.String r9 = "decryption failed"
            r8.<init>(r9)
            throw r8
    }

    @Override // p124h7.InterfaceC2703k1
    /* renamed from: b */
    public final byte[] mo6934b(byte[] r1, byte[] r2) {
            r0 = this;
            r1 = 0
            throw r1
    }
}
