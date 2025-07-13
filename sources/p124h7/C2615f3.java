package p124h7;

/* renamed from: h7.f3 */
/* loaded from: classes.dex */
public final class C2615f3 implements p124h7.InterfaceC2757n1 {

    /* renamed from: a */
    public final androidx.fragment.app.C0392l0 f11509a;

    public C2615f3(androidx.fragment.app.C0392l0 r1) {
            r0 = this;
            r0.<init>()
            r0.f11509a = r1
            return
    }

    @Override // p124h7.InterfaceC2757n1
    /* renamed from: a */
    public final byte[] mo6689a(byte[] r8, byte[] r9) {
            r7 = this;
            int r9 = r8.length
            r0 = 0
            r1 = 5
            if (r9 <= r1) goto L54
            r2 = 0
            byte[] r2 = java.util.Arrays.copyOfRange(r8, r2, r1)
            byte[] r9 = java.util.Arrays.copyOfRange(r8, r1, r9)
            androidx.fragment.app.l0 r1 = r7.f11509a
            java.util.List r1 = r1.m1268Z(r2)
            java.util.Iterator r1 = r1.iterator()
        L18:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L54
            java.lang.Object r2 = r1.next()
            h7.z1 r2 = (p124h7.C2973z1) r2
            P r2 = r2.f12047a     // Catch: java.security.GeneralSecurityException -> L2d
            h7.n1 r2 = (p124h7.InterfaceC2757n1) r2     // Catch: java.security.GeneralSecurityException -> L2d
            byte[] r8 = r2.mo6689a(r9, r0)     // Catch: java.security.GeneralSecurityException -> L2d
            return r8
        L2d:
            r2 = move-exception
            java.util.logging.Logger r3 = p124h7.C2633g3.f11539a
            java.util.logging.Level r4 = java.util.logging.Level.INFO
            java.lang.String r2 = r2.toString()
            java.lang.String r2 = java.lang.String.valueOf(r2)
            java.lang.String r5 = "ciphertext prefix matches a key, but cannot decrypt: "
            int r6 = r2.length()
            if (r6 == 0) goto L47
            java.lang.String r2 = r5.concat(r2)
            goto L4c
        L47:
            java.lang.String r2 = new java.lang.String
            r2.<init>(r5)
        L4c:
            java.lang.String r5 = "com.google.crypto.tink.hybrid.HybridDecryptWrapper$WrappedHybridDecrypt"
            java.lang.String r6 = "decrypt"
            r3.logp(r4, r5, r6, r2)
            goto L18
        L54:
            androidx.fragment.app.l0 r9 = r7.f11509a
            byte[] r1 = p124h7.C2721l1.f11727a
            java.util.List r9 = r9.m1268Z(r1)
            java.util.Iterator r9 = r9.iterator()
        L60:
            boolean r1 = r9.hasNext()
            if (r1 == 0) goto L77
            java.lang.Object r1 = r9.next()
            h7.z1 r1 = (p124h7.C2973z1) r1
            P r1 = r1.f12047a     // Catch: java.security.GeneralSecurityException -> L75
            h7.n1 r1 = (p124h7.InterfaceC2757n1) r1     // Catch: java.security.GeneralSecurityException -> L75
            byte[] r8 = r1.mo6689a(r8, r0)     // Catch: java.security.GeneralSecurityException -> L75
            return r8
        L75:
            goto L60
        L77:
            java.security.GeneralSecurityException r8 = new java.security.GeneralSecurityException
            java.lang.String r9 = "decryption failed"
            r8.<init>(r9)
            throw r8
    }
}
