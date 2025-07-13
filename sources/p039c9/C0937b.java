package p039c9;

/* renamed from: c9.b */
/* loaded from: classes.dex */
public final class C0937b {

    /* renamed from: c9.b$a */
    public static class a extends java.io.OutputStream {
        public a() {
                r0 = this;
                r0.<init>()
                return
        }

        public java.lang.String toString() {
                r1 = this;
                java.lang.String r0 = "ByteStreams.nullOutputStream()"
                return r0
        }

        @Override // java.io.OutputStream
        public void write(int r1) {
                r0 = this;
                return
        }

        @Override // java.io.OutputStream
        public void write(byte[] r1) {
                r0 = this;
                java.util.Objects.requireNonNull(r1)
                return
        }

        @Override // java.io.OutputStream
        public void write(byte[] r1, int r2, int r3) {
                r0 = this;
                java.util.Objects.requireNonNull(r1)
                return
        }
    }

    static {
            c9.b$a r0 = new c9.b$a
            r0.<init>()
            return
    }

    /* renamed from: a */
    public static byte[] m2660a(java.util.Deque<byte[]> r6, int r7) {
            byte[] r0 = new byte[r7]
            r1 = r7
        L3:
            if (r1 <= 0) goto L18
            java.lang.Object r2 = r6.removeFirst()
            byte[] r2 = (byte[]) r2
            int r3 = r2.length
            int r3 = java.lang.Math.min(r1, r3)
            int r4 = r7 - r1
            r5 = 0
            java.lang.System.arraycopy(r2, r5, r0, r4, r3)
            int r1 = r1 - r3
            goto L3
        L18:
            return r0
    }

    /* renamed from: b */
    public static byte[] m2661b(java.io.InputStream r9) {
            java.util.Objects.requireNonNull(r9)
            java.util.ArrayDeque r0 = new java.util.ArrayDeque
            r1 = 20
            r0.<init>(r1)
            r1 = 8192(0x2000, float:1.148E-41)
            r2 = 0
            r3 = 0
        Le:
            r4 = -1
            r5 = 2147483639(0x7ffffff7, float:NaN)
            if (r3 >= r5) goto L3b
            int r5 = r5 - r3
            int r5 = java.lang.Math.min(r1, r5)
            byte[] r6 = new byte[r5]
            r0.add(r6)
            r7 = 0
        L1f:
            if (r7 >= r5) goto L31
            int r8 = r5 - r7
            int r8 = r9.read(r6, r7, r8)
            if (r8 != r4) goto L2e
            byte[] r9 = m2660a(r0, r3)
            goto L45
        L2e:
            int r7 = r7 + r8
            int r3 = r3 + r8
            goto L1f
        L31:
            r4 = 2
            long r5 = (long) r1
            long r7 = (long) r4
            long r5 = r5 * r7
            int r1 = p074e9.C1806b.m4543v(r5)
            goto Le
        L3b:
            int r9 = r9.read()
            if (r9 != r4) goto L46
            byte[] r9 = m2660a(r0, r5)
        L45:
            return r9
        L46:
            java.lang.OutOfMemoryError r9 = new java.lang.OutOfMemoryError
            java.lang.String r0 = "input is too large to fit in a byte array"
            r9.<init>(r0)
            throw r9
    }
}
