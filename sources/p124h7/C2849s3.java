package p124h7;

/* renamed from: h7.s3 */
/* loaded from: classes.dex */
public final class C2849s3 implements p124h7.InterfaceC2955y1 {

    /* renamed from: a */
    public final androidx.fragment.app.C0392l0 f11906a;

    /* renamed from: b */
    public final byte[] f11907b;

    public /* synthetic */ C2849s3(androidx.fragment.app.C0392l0 r3) {
            r2 = this;
            r2.<init>()
            r0 = 1
            byte[] r0 = new byte[r0]
            r1 = 0
            r0[r1] = r1
            r2.f11907b = r0
            r2.f11906a = r3
            return
    }

    @Override // p124h7.InterfaceC2955y1
    /* renamed from: a */
    public final void mo6510a(byte[] r8, byte[] r9) {
            r7 = this;
            int r0 = r8.length
            r1 = 5
            if (r0 <= r1) goto L97
            byte[] r2 = java.util.Arrays.copyOf(r8, r1)
            byte[] r0 = java.util.Arrays.copyOfRange(r8, r1, r0)
            androidx.fragment.app.l0 r1 = r7.f11906a
            java.util.List r1 = r1.m1268Z(r2)
            java.util.Iterator r1 = r1.iterator()
        L16:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L6d
            java.lang.Object r2 = r1.next()
            h7.z1 r2 = (p124h7.C2973z1) r2
            h7.d7 r3 = r2.f12050d     // Catch: java.security.GeneralSecurityException -> L4b
            h7.d7 r4 = p124h7.EnumC2583d7.f11443b0     // Catch: java.security.GeneralSecurityException -> L4b
            boolean r3 = r3.equals(r4)     // Catch: java.security.GeneralSecurityException -> L4b
            if (r3 == 0) goto L43
            P r2 = r2.f12047a     // Catch: java.security.GeneralSecurityException -> L4b
            h7.y1 r2 = (p124h7.InterfaceC2955y1) r2     // Catch: java.security.GeneralSecurityException -> L4b
            r3 = 2
            byte[][] r3 = new byte[r3][]     // Catch: java.security.GeneralSecurityException -> L4b
            r4 = 0
            r3[r4] = r9     // Catch: java.security.GeneralSecurityException -> L4b
            r4 = 1
            byte[] r5 = r7.f11907b     // Catch: java.security.GeneralSecurityException -> L4b
            r3[r4] = r5     // Catch: java.security.GeneralSecurityException -> L4b
            byte[] r3 = p124h7.C2939x3.m7252B(r3)     // Catch: java.security.GeneralSecurityException -> L4b
            r2.mo6510a(r0, r3)     // Catch: java.security.GeneralSecurityException -> L4b
            return
        L43:
            P r2 = r2.f12047a     // Catch: java.security.GeneralSecurityException -> L4b
            h7.y1 r2 = (p124h7.InterfaceC2955y1) r2     // Catch: java.security.GeneralSecurityException -> L4b
            r2.mo6510a(r0, r9)     // Catch: java.security.GeneralSecurityException -> L4b
            return
        L4b:
            r2 = move-exception
            java.util.logging.Logger r3 = p124h7.C2867t3.f11918a
            java.util.logging.Level r4 = java.util.logging.Level.INFO
            java.lang.String r2 = java.lang.String.valueOf(r2)
            int r5 = r2.length()
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            int r5 = r5 + 45
            r6.<init>(r5)
            java.lang.String r5 = "tag prefix matches a key, but cannot verify: "
            java.lang.String r2 = p346u.C6269n.m12888a(r6, r5, r2)
            java.lang.String r5 = "com.google.crypto.tink.mac.MacWrapper$WrappedMac"
            java.lang.String r6 = "verifyMac"
            r3.logp(r4, r5, r6, r2)
            goto L16
        L6d:
            androidx.fragment.app.l0 r0 = r7.f11906a
            byte[] r1 = p124h7.C2721l1.f11727a
            java.util.List r0 = r0.m1268Z(r1)
            java.util.Iterator r0 = r0.iterator()
        L79:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L8f
            java.lang.Object r1 = r0.next()
            h7.z1 r1 = (p124h7.C2973z1) r1
            P r1 = r1.f12047a     // Catch: java.security.GeneralSecurityException -> L8d
            h7.y1 r1 = (p124h7.InterfaceC2955y1) r1     // Catch: java.security.GeneralSecurityException -> L8d
            r1.mo6510a(r8, r9)     // Catch: java.security.GeneralSecurityException -> L8d
            return
        L8d:
            goto L79
        L8f:
            java.security.GeneralSecurityException r8 = new java.security.GeneralSecurityException
            java.lang.String r9 = "invalid MAC"
            r8.<init>(r9)
            throw r8
        L97:
            java.security.GeneralSecurityException r8 = new java.security.GeneralSecurityException
            java.lang.String r9 = "tag too short"
            r8.<init>(r9)
            throw r8
    }
}
