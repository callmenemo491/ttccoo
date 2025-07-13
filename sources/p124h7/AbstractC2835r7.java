package p124h7;

/* renamed from: h7.r7 */
/* loaded from: classes.dex */
public abstract class AbstractC2835r7 implements p124h7.InterfaceC2961y7 {

    /* renamed from: c */
    public static final int[] f11875c = null;

    /* renamed from: a */
    public int[] f11876a;

    /* renamed from: b */
    public final int f11877b;

    static {
            r0 = 16
            byte[] r0 = new byte[r0]
            r0 = {x000e: FILL_ARRAY_DATA , data: [101, 120, 112, 97, 110, 100, 32, 51, 50, 45, 98, 121, 116, 101, 32, 107} // fill-array
            int[] r0 = m7082i(r0)
            p124h7.AbstractC2835r7.f11875c = r0
            return
    }

    public AbstractC2835r7(byte[] r3, int r4) {
            r2 = this;
            r2.<init>()
            int r0 = r3.length
            r1 = 32
            if (r0 != r1) goto L11
            int[] r3 = m7082i(r3)
            r2.f11876a = r3
            r2.f11877b = r4
            return
        L11:
            java.security.InvalidKeyException r3 = new java.security.InvalidKeyException
            java.lang.String r4 = "The key length in bytes must be 32."
            r3.<init>(r4)
            throw r3
    }

    /* renamed from: e */
    public static void m7079e(int[] r2, int r3, int r4, int r5, int r6) {
            r0 = r2[r3]
            r1 = r2[r4]
            int r0 = r0 + r1
            r2[r3] = r0
            r1 = r2[r6]
            r0 = r0 ^ r1
            int r1 = r0 << 16
            int r0 = r0 >>> (-16)
            r0 = r0 | r1
            r2[r6] = r0
            r1 = r2[r5]
            int r1 = r1 + r0
            r2[r5] = r1
            r0 = r2[r4]
            r0 = r0 ^ r1
            int r1 = r0 << 12
            int r0 = r0 >>> (-12)
            r0 = r0 | r1
            r2[r4] = r0
            r1 = r2[r3]
            int r1 = r1 + r0
            r2[r3] = r1
            r3 = r2[r6]
            r3 = r3 ^ r1
            int r0 = r3 << 8
            int r3 = r3 >>> (-8)
            r3 = r3 | r0
            r2[r6] = r3
            r6 = r2[r5]
            int r6 = r6 + r3
            r2[r5] = r6
            r3 = r2[r4]
            r3 = r3 ^ r6
            int r5 = r3 << 7
            int r3 = r3 >>> (-7)
            r3 = r3 | r5
            r2[r4] = r3
            return
    }

    /* renamed from: f */
    public static void m7080f(int[] r3, int[] r4) {
            int[] r0 = p124h7.AbstractC2835r7.f11875c
            int r1 = r0.length
            r2 = 0
            java.lang.System.arraycopy(r0, r2, r3, r2, r1)
            int r0 = r0.length
            r1 = 8
            java.lang.System.arraycopy(r4, r2, r3, r0, r1)
            return
    }

    /* renamed from: g */
    public static void m7081g(int[] r16) {
            r0 = r16
            r1 = 0
            r2 = 0
        L4:
            r3 = 10
            if (r2 >= r3) goto L3b
            r4 = 8
            r5 = 12
            r6 = 4
            m7079e(r0, r1, r6, r4, r5)
            r7 = 5
            r8 = 13
            r9 = 1
            r10 = 9
            m7079e(r0, r9, r7, r10, r8)
            r11 = 2
            r12 = 6
            r13 = 14
            m7079e(r0, r11, r12, r3, r13)
            r14 = 3
            r15 = 7
            r6 = 11
            r10 = 15
            m7079e(r0, r14, r15, r6, r10)
            m7079e(r0, r1, r7, r3, r10)
            m7079e(r0, r9, r12, r6, r5)
            m7079e(r0, r11, r15, r4, r8)
            r3 = 9
            r4 = 4
            m7079e(r0, r14, r4, r3, r13)
            int r2 = r2 + 1
            goto L4
        L3b:
            return
    }

    /* renamed from: i */
    public static int[] m7082i(byte[] r1) {
            java.nio.ByteBuffer r1 = java.nio.ByteBuffer.wrap(r1)
            java.nio.ByteOrder r0 = java.nio.ByteOrder.LITTLE_ENDIAN
            java.nio.ByteBuffer r1 = r1.order(r0)
            java.nio.IntBuffer r1 = r1.asIntBuffer()
            int r0 = r1.remaining()
            int[] r0 = new int[r0]
            r1.get(r0)
            return r0
    }

    @Override // p124h7.InterfaceC2961y7
    /* renamed from: a */
    public final byte[] mo6962a(byte[] r1) {
            r0 = this;
            java.nio.ByteBuffer r1 = java.nio.ByteBuffer.wrap(r1)
            byte[] r1 = r0.m7084h(r1)
            return r1
    }

    /* renamed from: b */
    public abstract int mo6645b();

    /* renamed from: c */
    public abstract int[] mo6646c(int[] r1, int r2);

    /* renamed from: d */
    public final java.nio.ByteBuffer m7083d(byte[] r5, int r6) {
            r4 = this;
            int[] r5 = m7082i(r5)
            int[] r5 = r4.mo6646c(r5, r6)
            java.lang.Object r6 = r5.clone()
            int[] r6 = (int[]) r6
            m7081g(r6)
            r0 = 0
            r1 = 0
        L13:
            r2 = 16
            if (r1 >= r2) goto L21
            r2 = r5[r1]
            r3 = r6[r1]
            int r2 = r2 + r3
            r5[r1] = r2
            int r1 = r1 + 1
            goto L13
        L21:
            r6 = 64
            java.nio.ByteBuffer r6 = java.nio.ByteBuffer.allocate(r6)
            java.nio.ByteOrder r1 = java.nio.ByteOrder.LITTLE_ENDIAN
            java.nio.ByteBuffer r6 = r6.order(r1)
            java.nio.IntBuffer r1 = r6.asIntBuffer()
            r1.put(r5, r0, r2)
            return r6
    }

    /* renamed from: h */
    public final byte[] m7084h(java.nio.ByteBuffer r9) {
            r8 = this;
            int r0 = r9.remaining()
            int r1 = r8.mo6645b()
            if (r0 < r1) goto L44
            int r0 = r8.mo6645b()
            byte[] r0 = new byte[r0]
            r9.get(r0)
            int r1 = r9.remaining()
            java.nio.ByteBuffer r1 = java.nio.ByteBuffer.allocate(r1)
            int r2 = r9.remaining()
            int r3 = r2 / 64
            int r3 = r3 + 1
            r4 = 0
        L24:
            if (r4 >= r3) goto L3f
            int r5 = r8.f11877b
            int r5 = r5 + r4
            java.nio.ByteBuffer r5 = r8.m7083d(r0, r5)
            int r6 = r3 + (-1)
            r7 = 64
            if (r4 != r6) goto L39
            int r6 = r2 % 64
            p124h7.C2939x3.m7295u(r1, r9, r5, r6)
            goto L3c
        L39:
            p124h7.C2939x3.m7295u(r1, r9, r5, r7)
        L3c:
            int r4 = r4 + 1
            goto L24
        L3f:
            byte[] r9 = r1.array()
            return r9
        L44:
            java.security.GeneralSecurityException r9 = new java.security.GeneralSecurityException
            java.lang.String r0 = "ciphertext too short"
            r9.<init>(r0)
            throw r9
    }
}
