package p124h7;

/* renamed from: h7.u2 */
/* loaded from: classes.dex */
public final class C2884u2 implements p124h7.InterfaceC2703k1 {

    /* renamed from: c */
    public static final byte[] f11933c = null;

    /* renamed from: a */
    public final p124h7.C2744m6 f11934a;

    /* renamed from: b */
    public final p124h7.InterfaceC2703k1 f11935b;

    static {
            r0 = 0
            byte[] r0 = new byte[r0]
            p124h7.C2884u2.f11933c = r0
            return
    }

    public C2884u2(p124h7.C2744m6 r1, p124h7.InterfaceC2703k1 r2) {
            r0 = this;
            r0.<init>()
            r0.f11934a = r1
            r0.f11935b = r2
            return
    }

    @Override // p124h7.InterfaceC2703k1
    /* renamed from: a */
    public final byte[] mo6933a(byte[] r6, byte[] r7) {
            r5 = this;
            java.lang.String r0 = "invalid ciphertext"
            java.nio.ByteBuffer r1 = java.nio.ByteBuffer.wrap(r6)     // Catch: java.lang.NegativeArraySizeException -> L45 java.nio.BufferUnderflowException -> L47 java.lang.IndexOutOfBoundsException -> L49
            int r2 = r1.getInt()     // Catch: java.lang.NegativeArraySizeException -> L45 java.nio.BufferUnderflowException -> L47 java.lang.IndexOutOfBoundsException -> L49
            if (r2 <= 0) goto L3f
            int r6 = r6.length     // Catch: java.lang.NegativeArraySizeException -> L45 java.nio.BufferUnderflowException -> L47 java.lang.IndexOutOfBoundsException -> L49
            int r6 = r6 + (-4)
            if (r2 > r6) goto L3f
            byte[] r6 = new byte[r2]     // Catch: java.lang.NegativeArraySizeException -> L45 java.nio.BufferUnderflowException -> L47 java.lang.IndexOutOfBoundsException -> L49
            r3 = 0
            r1.get(r6, r3, r2)     // Catch: java.lang.NegativeArraySizeException -> L45 java.nio.BufferUnderflowException -> L47 java.lang.IndexOutOfBoundsException -> L49
            int r2 = r1.remaining()     // Catch: java.lang.NegativeArraySizeException -> L45 java.nio.BufferUnderflowException -> L47 java.lang.IndexOutOfBoundsException -> L49
            byte[] r2 = new byte[r2]     // Catch: java.lang.NegativeArraySizeException -> L45 java.nio.BufferUnderflowException -> L47 java.lang.IndexOutOfBoundsException -> L49
            int r4 = r1.remaining()     // Catch: java.lang.NegativeArraySizeException -> L45 java.nio.BufferUnderflowException -> L47 java.lang.IndexOutOfBoundsException -> L49
            r1.get(r2, r3, r4)     // Catch: java.lang.NegativeArraySizeException -> L45 java.nio.BufferUnderflowException -> L47 java.lang.IndexOutOfBoundsException -> L49
            h7.k1 r1 = r5.f11935b     // Catch: java.lang.NegativeArraySizeException -> L45 java.nio.BufferUnderflowException -> L47 java.lang.IndexOutOfBoundsException -> L49
            byte[] r3 = p124h7.C2884u2.f11933c     // Catch: java.lang.NegativeArraySizeException -> L45 java.nio.BufferUnderflowException -> L47 java.lang.IndexOutOfBoundsException -> L49
            byte[] r6 = r1.mo6933a(r6, r3)     // Catch: java.lang.NegativeArraySizeException -> L45 java.nio.BufferUnderflowException -> L47 java.lang.IndexOutOfBoundsException -> L49
            h7.m6 r1 = r5.f11934a     // Catch: java.lang.NegativeArraySizeException -> L45 java.nio.BufferUnderflowException -> L47 java.lang.IndexOutOfBoundsException -> L49
            java.lang.String r1 = r1.m6981x()     // Catch: java.lang.NegativeArraySizeException -> L45 java.nio.BufferUnderflowException -> L47 java.lang.IndexOutOfBoundsException -> L49
            java.lang.Class<h7.k1> r3 = p124h7.InterfaceC2703k1.class
            java.lang.Object r6 = p124h7.C2650h2.m6773d(r1, r6, r3)     // Catch: java.lang.NegativeArraySizeException -> L45 java.nio.BufferUnderflowException -> L47 java.lang.IndexOutOfBoundsException -> L49
            h7.k1 r6 = (p124h7.InterfaceC2703k1) r6     // Catch: java.lang.NegativeArraySizeException -> L45 java.nio.BufferUnderflowException -> L47 java.lang.IndexOutOfBoundsException -> L49
            byte[] r6 = r6.mo6933a(r2, r7)     // Catch: java.lang.NegativeArraySizeException -> L45 java.nio.BufferUnderflowException -> L47 java.lang.IndexOutOfBoundsException -> L49
            return r6
        L3f:
            java.security.GeneralSecurityException r6 = new java.security.GeneralSecurityException     // Catch: java.lang.NegativeArraySizeException -> L45 java.nio.BufferUnderflowException -> L47 java.lang.IndexOutOfBoundsException -> L49
            r6.<init>(r0)     // Catch: java.lang.NegativeArraySizeException -> L45 java.nio.BufferUnderflowException -> L47 java.lang.IndexOutOfBoundsException -> L49
            throw r6     // Catch: java.lang.NegativeArraySizeException -> L45 java.nio.BufferUnderflowException -> L47 java.lang.IndexOutOfBoundsException -> L49
        L45:
            r6 = move-exception
            goto L4a
        L47:
            r6 = move-exception
            goto L4a
        L49:
            r6 = move-exception
        L4a:
            java.security.GeneralSecurityException r7 = new java.security.GeneralSecurityException
            r7.<init>(r0, r6)
            throw r7
    }

    @Override // p124h7.InterfaceC2703k1
    /* renamed from: b */
    public final byte[] mo6934b(byte[] r1, byte[] r2) {
            r0 = this;
            r1 = 0
            throw r1
    }
}
