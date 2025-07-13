package p400wj;

/* renamed from: wj.a */
/* loaded from: classes.dex */
public final class C6888a {

    /* renamed from: wj.a$a */
    public static class a<T> implements java.util.Iterator<T> {

        /* renamed from: Y */
        public final T[] f26789Y;

        /* renamed from: Z */
        public int f26790Z;

        public a(T[] r2) {
                r1 = this;
                r1.<init>()
                r0 = 0
                r1.f26790Z = r0
                r1.f26789Y = r2
                return
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
                r2 = this;
                int r0 = r2.f26790Z
                T[] r1 = r2.f26789Y
                int r1 = r1.length
                if (r0 >= r1) goto L9
                r0 = 1
                goto La
            L9:
                r0 = 0
            La:
                return r0
        }

        @Override // java.util.Iterator
        public T next() {
                r3 = this;
                int r0 = r3.f26790Z
                T[] r1 = r3.f26789Y
                int r2 = r1.length
                if (r0 == r2) goto Le
                int r2 = r0 + 1
                r3.f26790Z = r2
                r0 = r1[r0]
                return r0
            Le:
                java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
                java.lang.String r1 = "Out of elements: "
                java.lang.StringBuilder r1 = android.support.v4.media.C0144c.m256a(r1)
                int r2 = r3.f26790Z
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                r0.<init>(r1)
                throw r0
        }

        @Override // java.util.Iterator
        public void remove() {
                r2 = this;
                java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
                java.lang.String r1 = "Cannot remove element from an Array."
                r0.<init>(r1)
                throw r0
        }
    }

    /* renamed from: a */
    public static boolean m13949a(byte[] r5, byte[] r6) {
            r0 = 1
            if (r5 != r6) goto L4
            return r0
        L4:
            r1 = 0
            if (r5 == 0) goto L1e
            if (r6 != 0) goto La
            goto L1e
        La:
            int r2 = r5.length
            int r3 = r6.length
            if (r2 == r3) goto Lf
            return r1
        Lf:
            r2 = 0
        L10:
            int r3 = r5.length
            if (r2 == r3) goto L1d
            r3 = r5[r2]
            r4 = r6[r2]
            if (r3 == r4) goto L1a
            return r1
        L1a:
            int r2 = r2 + 1
            goto L10
        L1d:
            return r0
        L1e:
            return r1
    }

    /* renamed from: b */
    public static boolean m13950b(int[] r5, int[] r6) {
            r0 = 1
            if (r5 != r6) goto L4
            return r0
        L4:
            r1 = 0
            if (r5 == 0) goto L1e
            if (r6 != 0) goto La
            goto L1e
        La:
            int r2 = r5.length
            int r3 = r6.length
            if (r2 == r3) goto Lf
            return r1
        Lf:
            r2 = 0
        L10:
            int r3 = r5.length
            if (r2 == r3) goto L1d
            r3 = r5[r2]
            r4 = r6[r2]
            if (r3 == r4) goto L1a
            return r1
        L1a:
            int r2 = r2 + 1
            goto L10
        L1d:
            return r0
        L1e:
            return r1
    }

    /* renamed from: c */
    public static byte[] m13951c(byte[] r3) {
            if (r3 != 0) goto L4
            r3 = 0
            return r3
        L4:
            int r0 = r3.length
            byte[] r0 = new byte[r0]
            int r1 = r3.length
            r2 = 0
            java.lang.System.arraycopy(r3, r2, r0, r2, r1)
            return r0
    }

    /* renamed from: d */
    public static int m13952d(byte[] r3) {
            if (r3 != 0) goto L4
            r3 = 0
            return r3
        L4:
            int r0 = r3.length
            int r1 = r0 + 1
        L7:
            int r0 = r0 + (-1)
            if (r0 < 0) goto L11
            int r1 = r1 * 257
            r2 = r3[r0]
            r1 = r1 ^ r2
            goto L7
        L11:
            return r1
    }

    /* renamed from: e */
    public static int m13953e(int[] r3) {
            if (r3 != 0) goto L4
            r3 = 0
            return r3
        L4:
            int r0 = r3.length
            int r1 = r0 + 1
        L7:
            int r0 = r0 + (-1)
            if (r0 < 0) goto L11
            int r1 = r1 * 257
            r2 = r3[r0]
            r1 = r1 ^ r2
            goto L7
        L11:
            return r1
    }

    /* renamed from: f */
    public static int m13954f(int[] r2, int r3, int r4) {
            if (r2 != 0) goto L4
            r2 = 0
            return r2
        L4:
            int r0 = r4 + 1
        L6:
            int r4 = r4 + (-1)
            if (r4 < 0) goto L12
            int r0 = r0 * 257
            int r1 = r3 + r4
            r1 = r2[r1]
            r0 = r0 ^ r1
            goto L6
        L12:
            return r0
    }

    /* renamed from: g */
    public static int m13955g(long[] r4, int r5, int r6) {
            if (r4 != 0) goto L4
            r4 = 0
            return r4
        L4:
            int r0 = r6 + 1
        L6:
            int r6 = r6 + (-1)
            if (r6 < 0) goto L1a
            int r1 = r5 + r6
            r1 = r4[r1]
            int r0 = r0 * 257
            int r3 = (int) r1
            r0 = r0 ^ r3
            int r0 = r0 * 257
            r3 = 32
            long r1 = r1 >>> r3
            int r2 = (int) r1
            r0 = r0 ^ r2
            goto L6
        L1a:
            return r0
    }
}
