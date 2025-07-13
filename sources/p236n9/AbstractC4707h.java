package p236n9;

/* renamed from: n9.h */
/* loaded from: classes.dex */
public abstract class AbstractC4707h implements p236n9.InterfaceC4713n {

    /* renamed from: c */
    public static final int[] f18811c = null;

    /* renamed from: a */
    public int[] f18812a;

    /* renamed from: b */
    public final int f18813b;

    static {
            r0 = 16
            byte[] r0 = new byte[r0]
            r0 = {x000e: FILL_ARRAY_DATA , data: [101, 120, 112, 97, 110, 100, 32, 51, 50, 45, 98, 121, 116, 101, 32, 107} // fill-array
            int[] r0 = m10763m(r0)
            p236n9.AbstractC4707h.f18811c = r0
            return
    }

    public AbstractC4707h(byte[] r3, int r4) {
            r2 = this;
            r2.<init>()
            int r0 = r3.length
            r1 = 32
            if (r0 != r1) goto L11
            int[] r3 = m10763m(r3)
            r2.f18812a = r3
            r2.f18813b = r4
            return
        L11:
            java.security.InvalidKeyException r3 = new java.security.InvalidKeyException
            java.lang.String r4 = "The key length in bytes must be 32."
            r3.<init>(r4)
            throw r3
    }

    /* renamed from: i */
    public static void m10759i(int[] r2, int r3, int r4, int r5, int r6) {
            r0 = r2[r3]
            r1 = r2[r4]
            int r0 = r0 + r1
            r2[r3] = r0
            r0 = r2[r6]
            r1 = r2[r3]
            r0 = r0 ^ r1
            r1 = 16
            int r0 = m10760j(r0, r1)
            r2[r6] = r0
            r0 = r2[r5]
            r1 = r2[r6]
            int r0 = r0 + r1
            r2[r5] = r0
            r0 = r2[r4]
            r1 = r2[r5]
            r0 = r0 ^ r1
            r1 = 12
            int r0 = m10760j(r0, r1)
            r2[r4] = r0
            r0 = r2[r3]
            r1 = r2[r4]
            int r0 = r0 + r1
            r2[r3] = r0
            r0 = r2[r6]
            r3 = r2[r3]
            r3 = r3 ^ r0
            r0 = 8
            int r3 = m10760j(r3, r0)
            r2[r6] = r3
            r3 = r2[r5]
            r6 = r2[r6]
            int r3 = r3 + r6
            r2[r5] = r3
            r3 = r2[r4]
            r5 = r2[r5]
            r3 = r3 ^ r5
            r5 = 7
            int r3 = m10760j(r3, r5)
            r2[r4] = r3
            return
    }

    /* renamed from: j */
    public static int m10760j(int r1, int r2) {
            int r0 = r1 << r2
            int r2 = -r2
            int r1 = r1 >>> r2
            r1 = r1 | r0
            return r1
    }

    /* renamed from: k */
    public static void m10761k(int[] r3, int[] r4) {
            int[] r0 = p236n9.AbstractC4707h.f18811c
            int r1 = r0.length
            r2 = 0
            java.lang.System.arraycopy(r0, r2, r3, r2, r1)
            int r0 = r0.length
            r1 = 8
            java.lang.System.arraycopy(r4, r2, r3, r0, r1)
            return
    }

    /* renamed from: l */
    public static void m10762l(int[] r16) {
            r0 = r16
            r1 = 0
            r2 = 0
        L4:
            r3 = 10
            if (r2 >= r3) goto L3b
            r4 = 8
            r5 = 12
            r6 = 4
            m10759i(r0, r1, r6, r4, r5)
            r7 = 5
            r8 = 13
            r9 = 1
            r10 = 9
            m10759i(r0, r9, r7, r10, r8)
            r11 = 2
            r12 = 6
            r13 = 14
            m10759i(r0, r11, r12, r3, r13)
            r14 = 3
            r15 = 7
            r6 = 11
            r10 = 15
            m10759i(r0, r14, r15, r6, r10)
            m10759i(r0, r1, r7, r3, r10)
            m10759i(r0, r9, r12, r6, r5)
            m10759i(r0, r11, r15, r4, r8)
            r3 = 9
            r4 = 4
            m10759i(r0, r14, r4, r3, r13)
            int r2 = r2 + 1
            goto L4
        L3b:
            return
    }

    /* renamed from: m */
    public static int[] m10763m(byte[] r1) {
            java.nio.ByteBuffer r1 = java.nio.ByteBuffer.wrap(r1)
            java.nio.ByteOrder r0 = java.nio.ByteOrder.LITTLE_ENDIAN
            java.nio.ByteBuffer r1 = r1.order(r0)
            java.nio.IntBuffer r1 = r1.asIntBuffer()
            int r0 = r1.remaining()
            int[] r0 = new int[r0]
            r1.get(r0)
            return r0
    }

    @Override // p236n9.InterfaceC4713n
    /* renamed from: a */
    public byte[] mo10746a(byte[] r4) {
            r3 = this;
            int r0 = r4.length
            int r1 = r3.mo10758g()
            r2 = 2147483647(0x7fffffff, float:NaN)
            int r2 = r2 - r1
            if (r0 > r2) goto L1d
            int r0 = r3.mo10758g()
            int r1 = r4.length
            int r0 = r0 + r1
            java.nio.ByteBuffer r0 = java.nio.ByteBuffer.allocate(r0)
            r3.m10766f(r0, r4)
            byte[] r4 = r0.array()
            return r4
        L1d:
            java.security.GeneralSecurityException r4 = new java.security.GeneralSecurityException
            java.lang.String r0 = "plaintext too long"
            r4.<init>(r0)
            throw r4
    }

    @Override // p236n9.InterfaceC4713n
    /* renamed from: b */
    public byte[] mo10747b(byte[] r1) {
            r0 = this;
            java.nio.ByteBuffer r1 = java.nio.ByteBuffer.wrap(r1)
            byte[] r1 = r0.m10765e(r1)
            return r1
    }

    /* renamed from: c */
    public java.nio.ByteBuffer m10764c(byte[] r5, int r6) {
            r4 = this;
            int[] r5 = m10763m(r5)
            int[] r5 = r4.mo10757d(r5, r6)
            java.lang.Object r6 = r5.clone()
            int[] r6 = (int[]) r6
            m10762l(r6)
            r0 = 0
            r1 = 0
        L13:
            int r2 = r5.length
            if (r1 >= r2) goto L20
            r2 = r5[r1]
            r3 = r6[r1]
            int r2 = r2 + r3
            r5[r1] = r2
            int r1 = r1 + 1
            goto L13
        L20:
            r6 = 64
            java.nio.ByteBuffer r6 = java.nio.ByteBuffer.allocate(r6)
            java.nio.ByteOrder r1 = java.nio.ByteOrder.LITTLE_ENDIAN
            java.nio.ByteBuffer r6 = r6.order(r1)
            java.nio.IntBuffer r1 = r6.asIntBuffer()
            r2 = 16
            r1.put(r5, r0, r2)
            return r6
    }

    /* renamed from: d */
    public abstract int[] mo10757d(int[] r1, int r2);

    /* renamed from: e */
    public byte[] m10765e(java.nio.ByteBuffer r3) {
            r2 = this;
            int r0 = r3.remaining()
            int r1 = r2.mo10758g()
            if (r0 < r1) goto L23
            int r0 = r2.mo10758g()
            byte[] r0 = new byte[r0]
            r3.get(r0)
            int r1 = r3.remaining()
            java.nio.ByteBuffer r1 = java.nio.ByteBuffer.allocate(r1)
            r2.m10767h(r0, r1, r3)
            byte[] r3 = r1.array()
            return r3
        L23:
            java.security.GeneralSecurityException r3 = new java.security.GeneralSecurityException
            java.lang.String r0 = "ciphertext too short"
            r3.<init>(r0)
            throw r3
    }

    /* renamed from: f */
    public void m10766f(java.nio.ByteBuffer r3, byte[] r4) {
            r2 = this;
            int r0 = r3.remaining()
            int r1 = r2.mo10758g()
            int r0 = r0 - r1
            int r1 = r4.length
            if (r0 < r1) goto L1f
            int r0 = r2.mo10758g()
            byte[] r0 = p236n9.C4716q.m10773a(r0)
            r3.put(r0)
            java.nio.ByteBuffer r4 = java.nio.ByteBuffer.wrap(r4)
            r2.m10767h(r0, r3, r4)
            return
        L1f:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r4 = "Given ByteBuffer output is too small"
            r3.<init>(r4)
            throw r3
    }

    /* renamed from: g */
    public abstract int mo10758g();

    /* renamed from: h */
    public final void m10767h(byte[] r7, java.nio.ByteBuffer r8, java.nio.ByteBuffer r9) {
            r6 = this;
            int r0 = r9.remaining()
            int r1 = r0 / 64
            int r1 = r1 + 1
            r2 = 0
        L9:
            if (r2 >= r1) goto L24
            int r3 = r6.f18813b
            int r3 = r3 + r2
            java.nio.ByteBuffer r3 = r6.m10764c(r7, r3)
            int r4 = r1 + (-1)
            r5 = 64
            if (r2 != r4) goto L1e
            int r4 = r0 % 64
            p185k7.C3828h5.m8581J(r8, r9, r3, r4)
            goto L21
        L1e:
            p185k7.C3828h5.m8581J(r8, r9, r3, r5)
        L21:
            int r2 = r2 + 1
            goto L9
        L24:
            return
    }
}
