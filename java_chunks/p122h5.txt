package p122h5;

/* renamed from: h5.a */
/* loaded from: classes.dex */
public final class C2486a implements p088f4.InterfaceC2014i {

    /* renamed from: e0 */
    public static final p122h5.C2486a f11231e0 = null;

    /* renamed from: f0 */
    public static final p122h5.C2486a.a f11232f0 = null;

    /* renamed from: g0 */
    public static final p088f4.InterfaceC2014i.a<p122h5.C2486a> f11233g0 = null;

    /* renamed from: Y */
    public final java.lang.Object f11234Y;

    /* renamed from: Z */
    public final int f11235Z;

    /* renamed from: a0 */
    public final long f11236a0;

    /* renamed from: b0 */
    public final long f11237b0;

    /* renamed from: c0 */
    public final int f11238c0;

    /* renamed from: d0 */
    public final p122h5.C2486a.a[] f11239d0;

    /* renamed from: h5.a$a */
    public static final class a implements p088f4.InterfaceC2014i {

        /* renamed from: f0 */
        public static final p088f4.InterfaceC2014i.a<p122h5.C2486a.a> f11240f0 = null;

        /* renamed from: Y */
        public final long f11241Y;

        /* renamed from: Z */
        public final int f11242Z;

        /* renamed from: a0 */
        public final android.net.Uri[] f11243a0;

        /* renamed from: b0 */
        public final int[] f11244b0;

        /* renamed from: c0 */
        public final long[] f11245c0;

        /* renamed from: d0 */
        public final long f11246d0;

        /* renamed from: e0 */
        public final boolean f11247e0;

        static {
                androidx.room.a r0 = androidx.room.C0618a.f3663m0
                p122h5.C2486a.a.f11240f0 = r0
                return
        }

        public a(long r3, int r5, int[] r6, android.net.Uri[] r7, long[] r8, long r9, boolean r11) {
                r2 = this;
                r2.<init>()
                int r0 = r6.length
                int r1 = r7.length
                if (r0 != r1) goto L9
                r0 = 1
                goto La
            L9:
                r0 = 0
            La:
                p371v5.C6549a.m13288b(r0)
                r2.f11241Y = r3
                r2.f11242Z = r5
                r2.f11244b0 = r6
                r2.f11243a0 = r7
                r2.f11245c0 = r8
                r2.f11246d0 = r9
                r2.f11247e0 = r11
                return
        }

        /* renamed from: b */
        public static java.lang.String m6360b(int r1) {
                r0 = 36
                java.lang.String r1 = java.lang.Integer.toString(r1, r0)
                return r1
        }

        /* renamed from: a */
        public int m6361a(int r4) {
                r3 = this;
                r0 = 1
                int r4 = r4 + r0
            L2:
                int[] r1 = r3.f11244b0
                int r2 = r1.length
                if (r4 >= r2) goto L17
                boolean r2 = r3.f11247e0
                if (r2 != 0) goto L17
                r2 = r1[r4]
                if (r2 == 0) goto L17
                r1 = r1[r4]
                if (r1 != r0) goto L14
                goto L17
            L14:
                int r4 = r4 + 1
                goto L2
            L17:
                return r4
        }

        public boolean equals(java.lang.Object r8) {
                r7 = this;
                r0 = 1
                if (r7 != r8) goto L4
                return r0
            L4:
                r1 = 0
                if (r8 == 0) goto L4f
                java.lang.Class<h5.a$a> r2 = p122h5.C2486a.a.class
                java.lang.Class r3 = r8.getClass()
                if (r2 == r3) goto L10
                goto L4f
            L10:
                h5.a$a r8 = (p122h5.C2486a.a) r8
                long r2 = r7.f11241Y
                long r4 = r8.f11241Y
                int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r6 != 0) goto L4d
                int r2 = r7.f11242Z
                int r3 = r8.f11242Z
                if (r2 != r3) goto L4d
                android.net.Uri[] r2 = r7.f11243a0
                android.net.Uri[] r3 = r8.f11243a0
                boolean r2 = java.util.Arrays.equals(r2, r3)
                if (r2 == 0) goto L4d
                int[] r2 = r7.f11244b0
                int[] r3 = r8.f11244b0
                boolean r2 = java.util.Arrays.equals(r2, r3)
                if (r2 == 0) goto L4d
                long[] r2 = r7.f11245c0
                long[] r3 = r8.f11245c0
                boolean r2 = java.util.Arrays.equals(r2, r3)
                if (r2 == 0) goto L4d
                long r2 = r7.f11246d0
                long r4 = r8.f11246d0
                int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r6 != 0) goto L4d
                boolean r2 = r7.f11247e0
                boolean r8 = r8.f11247e0
                if (r2 != r8) goto L4d
                goto L4e
            L4d:
                r0 = 0
            L4e:
                return r0
            L4f:
                return r1
        }

        public int hashCode() {
                r6 = this;
                int r0 = r6.f11242Z
                int r0 = r0 * 31
                long r1 = r6.f11241Y
                r3 = 32
                long r4 = r1 >>> r3
                long r1 = r1 ^ r4
                int r2 = (int) r1
                int r0 = r0 + r2
                int r0 = r0 * 31
                android.net.Uri[] r1 = r6.f11243a0
                int r1 = java.util.Arrays.hashCode(r1)
                int r0 = r0 + r1
                int r0 = r0 * 31
                int[] r1 = r6.f11244b0
                int r1 = java.util.Arrays.hashCode(r1)
                int r1 = r1 + r0
                int r1 = r1 * 31
                long[] r0 = r6.f11245c0
                int r0 = java.util.Arrays.hashCode(r0)
                int r0 = r0 + r1
                int r0 = r0 * 31
                long r1 = r6.f11246d0
                long r3 = r1 >>> r3
                long r1 = r1 ^ r3
                int r2 = (int) r1
                int r0 = r0 + r2
                int r0 = r0 * 31
                boolean r1 = r6.f11247e0
                int r0 = r0 + r1
                return r0
        }
    }

    static {
            h5.a r8 = new h5.a
            r9 = 0
            h5.a$a[] r2 = new p122h5.C2486a.a[r9]
            r1 = 0
            r3 = 0
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r7 = 0
            r0 = r8
            r0.<init>(r1, r2, r3, r5, r7)
            p122h5.C2486a.f11231e0 = r8
            h5.a$a r0 = new h5.a$a
            int[] r14 = new int[r9]
            android.net.Uri[] r15 = new android.net.Uri[r9]
            long[] r1 = new long[r9]
            r11 = 0
            r13 = -1
            r17 = 0
            r19 = 0
            r10 = r0
            r16 = r1
            r10.<init>(r11, r13, r14, r15, r16, r17, r19)
            int[] r1 = r0.f11244b0
            int r2 = r1.length
            int r3 = java.lang.Math.max(r9, r2)
            int[] r14 = java.util.Arrays.copyOf(r1, r3)
            java.util.Arrays.fill(r14, r2, r3, r9)
            long[] r1 = r0.f11245c0
            int r2 = r1.length
            int r3 = java.lang.Math.max(r9, r2)
            long[] r1 = java.util.Arrays.copyOf(r1, r3)
            r4 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            java.util.Arrays.fill(r1, r2, r3, r4)
            android.net.Uri[] r2 = r0.f11243a0
            java.lang.Object[] r2 = java.util.Arrays.copyOf(r2, r9)
            r15 = r2
            android.net.Uri[] r15 = (android.net.Uri[]) r15
            h5.a$a r2 = new h5.a$a
            long r11 = r0.f11241Y
            long r3 = r0.f11246d0
            boolean r0 = r0.f11247e0
            r13 = 0
            r10 = r2
            r16 = r1
            r17 = r3
            r19 = r0
            r10.<init>(r11, r13, r14, r15, r16, r17, r19)
            p122h5.C2486a.f11232f0 = r2
            k1.b r0 = p179k1.C3642b.f16065n0
            p122h5.C2486a.f11233g0 = r0
            return
    }

    public C2486a(java.lang.Object r1, p122h5.C2486a.a[] r2, long r3, long r5, int r7) {
            r0 = this;
            r0.<init>()
            r1 = 0
            r0.f11234Y = r1
            r0.f11236a0 = r3
            r0.f11237b0 = r5
            int r1 = r2.length
            int r1 = r1 + r7
            r0.f11235Z = r1
            r0.f11239d0 = r2
            r0.f11238c0 = r7
            return
    }

    /* renamed from: b */
    public static java.lang.String m6358b(int r1) {
            r0 = 36
            java.lang.String r1 = java.lang.Integer.toString(r1, r0)
            return r1
    }

    /* renamed from: a */
    public p122h5.C2486a.a m6359a(int r3) {
            r2 = this;
            int r0 = r2.f11238c0
            if (r3 >= r0) goto L7
            h5.a$a r3 = p122h5.C2486a.f11232f0
            goto Lc
        L7:
            h5.a$a[] r1 = r2.f11239d0
            int r3 = r3 - r0
            r3 = r1[r3]
        Lc:
            return r3
    }

    public boolean equals(java.lang.Object r8) {
            r7 = this;
            r0 = 1
            if (r7 != r8) goto L4
            return r0
        L4:
            r1 = 0
            if (r8 == 0) goto L45
            java.lang.Class<h5.a> r2 = p122h5.C2486a.class
            java.lang.Class r3 = r8.getClass()
            if (r2 == r3) goto L10
            goto L45
        L10:
            h5.a r8 = (p122h5.C2486a) r8
            java.lang.Object r2 = r7.f11234Y
            java.lang.Object r3 = r8.f11234Y
            boolean r2 = p371v5.C6552b0.m13308a(r2, r3)
            if (r2 == 0) goto L43
            int r2 = r7.f11235Z
            int r3 = r8.f11235Z
            if (r2 != r3) goto L43
            long r2 = r7.f11236a0
            long r4 = r8.f11236a0
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 != 0) goto L43
            long r2 = r7.f11237b0
            long r4 = r8.f11237b0
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 != 0) goto L43
            int r2 = r7.f11238c0
            int r3 = r8.f11238c0
            if (r2 != r3) goto L43
            h5.a$a[] r2 = r7.f11239d0
            h5.a$a[] r8 = r8.f11239d0
            boolean r8 = java.util.Arrays.equals(r2, r8)
            if (r8 == 0) goto L43
            goto L44
        L43:
            r0 = 0
        L44:
            return r0
        L45:
            return r1
    }

    public int hashCode() {
            r3 = this;
            int r0 = r3.f11235Z
            int r0 = r0 * 31
            java.lang.Object r1 = r3.f11234Y
            if (r1 != 0) goto La
            r1 = 0
            goto Le
        La:
            int r1 = r1.hashCode()
        Le:
            int r0 = r0 + r1
            int r0 = r0 * 31
            long r1 = r3.f11236a0
            int r2 = (int) r1
            int r0 = r0 + r2
            int r0 = r0 * 31
            long r1 = r3.f11237b0
            int r2 = (int) r1
            int r0 = r0 + r2
            int r0 = r0 * 31
            int r1 = r3.f11238c0
            int r0 = r0 + r1
            int r0 = r0 * 31
            h5.a$a[] r1 = r3.f11239d0
            int r1 = java.util.Arrays.hashCode(r1)
            int r0 = r0 + r1
            return r0
    }

    public java.lang.String toString() {
            r9 = this;
            java.lang.String r0 = "AdPlaybackState(adsId="
            java.lang.StringBuilder r0 = android.support.v4.media.C0144c.m256a(r0)
            java.lang.Object r1 = r9.f11234Y
            r0.append(r1)
            java.lang.String r1 = ", adResumePositionUs="
            r0.append(r1)
            long r1 = r9.f11236a0
            r0.append(r1)
            java.lang.String r1 = ", adGroups=["
            r0.append(r1)
            r1 = 0
        L1b:
            h5.a$a[] r2 = r9.f11239d0
            int r2 = r2.length
            java.lang.String r3 = "])"
            if (r1 >= r2) goto La5
            java.lang.String r2 = "adGroup(timeUs="
            r0.append(r2)
            h5.a$a[] r2 = r9.f11239d0
            r2 = r2[r1]
            long r4 = r2.f11241Y
            r0.append(r4)
            java.lang.String r2 = ", ads=["
            r0.append(r2)
            r2 = 0
        L36:
            h5.a$a[] r4 = r9.f11239d0
            r4 = r4[r1]
            int[] r4 = r4.f11244b0
            int r4 = r4.length
            java.lang.String r5 = ", "
            r6 = 1
            if (r2 >= r4) goto L95
            java.lang.String r4 = "ad(state="
            r0.append(r4)
            h5.a$a[] r4 = r9.f11239d0
            r4 = r4[r1]
            int[] r4 = r4.f11244b0
            r4 = r4[r2]
            if (r4 == 0) goto L6b
            if (r4 == r6) goto L68
            r7 = 2
            if (r4 == r7) goto L65
            r7 = 3
            if (r4 == r7) goto L62
            r7 = 4
            if (r4 == r7) goto L5f
            r4 = 63
            goto L6d
        L5f:
            r4 = 33
            goto L6d
        L62:
            r4 = 80
            goto L6d
        L65:
            r4 = 83
            goto L6d
        L68:
            r4 = 82
            goto L6d
        L6b:
            r4 = 95
        L6d:
            r0.append(r4)
            java.lang.String r4 = ", durationUs="
            r0.append(r4)
            h5.a$a[] r4 = r9.f11239d0
            r4 = r4[r1]
            long[] r4 = r4.f11245c0
            r7 = r4[r2]
            r0.append(r7)
            r4 = 41
            r0.append(r4)
            h5.a$a[] r4 = r9.f11239d0
            r4 = r4[r1]
            int[] r4 = r4.f11244b0
            int r4 = r4.length
            int r4 = r4 - r6
            if (r2 >= r4) goto L92
            r0.append(r5)
        L92:
            int r2 = r2 + 1
            goto L36
        L95:
            r0.append(r3)
            h5.a$a[] r2 = r9.f11239d0
            int r2 = r2.length
            int r2 = r2 - r6
            if (r1 >= r2) goto La1
            r0.append(r5)
        La1:
            int r1 = r1 + 1
            goto L1b
        La5:
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
