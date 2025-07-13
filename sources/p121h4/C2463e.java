package p121h4;

/* renamed from: h4.e */
/* loaded from: classes.dex */
public final class C2463e {

    /* renamed from: c */
    public static final p121h4.C2463e f11024c = null;

    /* renamed from: d */
    public static final p121h4.C2463e f11025d = null;

    /* renamed from: e */
    public static final int[] f11026e = null;

    /* renamed from: a */
    public final int[] f11027a;

    /* renamed from: b */
    public final int f11028b;

    /* renamed from: h4.e$a */
    public static final class a {
        /* renamed from: a */
        public static int[] m6263a() {
                b9.a<java.lang.Object> r0 = p026b9.AbstractC0714n.f3979Z
                r0 = 4
                java.lang.String r1 = "initialCapacity"
                p026b9.C0720t.m2328b(r0, r1)
                java.lang.Object[] r0 = new java.lang.Object[r0]
                int[] r1 = p121h4.C2463e.f11026e
                int r2 = r1.length
                r3 = 0
                r4 = 0
                r5 = 0
                r6 = 0
            L11:
                if (r4 >= r2) goto L73
                r7 = r1[r4]
                android.media.AudioFormat$Builder r8 = new android.media.AudioFormat$Builder
                r8.<init>()
                r9 = 12
                android.media.AudioFormat$Builder r8 = r8.setChannelMask(r9)
                android.media.AudioFormat$Builder r8 = r8.setEncoding(r7)
                r9 = 48000(0xbb80, float:6.7262E-41)
                android.media.AudioFormat$Builder r8 = r8.setSampleRate(r9)
                android.media.AudioFormat r8 = r8.build()
                android.media.AudioAttributes$Builder r9 = new android.media.AudioAttributes$Builder
                r9.<init>()
                r10 = 1
                android.media.AudioAttributes$Builder r9 = r9.setUsage(r10)
                r10 = 3
                android.media.AudioAttributes$Builder r9 = r9.setContentType(r10)
                android.media.AudioAttributes$Builder r9 = r9.setFlags(r3)
                android.media.AudioAttributes r9 = r9.build()
                boolean r8 = android.media.AudioTrack.isDirectPlaybackSupported(r8, r9)
                if (r8 == 0) goto L70
                java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
                java.util.Objects.requireNonNull(r7)
                int r8 = r5 + 1
                int r9 = r0.length
                if (r9 >= r8) goto L62
                int r6 = r0.length
                int r6 = p026b9.AbstractC0710l.b.m2305a(r6, r8)
                java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r6)
                goto L6a
            L62:
                if (r6 == 0) goto L6b
                java.lang.Object r0 = r0.clone()
                java.lang.Object[] r0 = (java.lang.Object[]) r0
            L6a:
                r6 = 0
            L6b:
                int r8 = r5 + 1
                r0[r5] = r7
                r5 = r8
            L70:
                int r4 = r4 + 1
                goto L11
            L73:
                r1 = 2
                java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
                java.util.Objects.requireNonNull(r1)
                int r2 = r5 + 1
                int r3 = r0.length
                if (r3 >= r2) goto L8a
                int r3 = r0.length
                int r2 = p026b9.AbstractC0710l.b.m2305a(r3, r2)
                java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r2)
                goto L92
            L8a:
                if (r6 == 0) goto L92
                java.lang.Object r0 = r0.clone()
                java.lang.Object[] r0 = (java.lang.Object[]) r0
            L92:
                int r2 = r5 + 1
                r0[r5] = r1
                b9.n r0 = p026b9.AbstractC0714n.m2309q(r0, r2)
                int[] r0 = p074e9.C1806b.m4544w(r0)
                return r0
        }
    }

    static {
            h4.e r0 = new h4.e
            r1 = 1
            int[] r1 = new int[r1]
            r2 = 0
            r3 = 2
            r1[r2] = r3
            r2 = 8
            r0.<init>(r1, r2)
            p121h4.C2463e.f11024c = r0
            h4.e r0 = new h4.e
            r1 = 3
            int[] r1 = new int[r1]
            r1 = {x0026: FILL_ARRAY_DATA , data: [2, 5, 6} // fill-array
            r0.<init>(r1, r2)
            p121h4.C2463e.f11025d = r0
            r0 = 7
            int[] r0 = new int[r0]
            r0 = {x0030: FILL_ARRAY_DATA , data: [5, 6, 18, 17, 14, 7, 8} // fill-array
            p121h4.C2463e.f11026e = r0
            return
    }

    public C2463e(int[] r2, int r3) {
            r1 = this;
            r1.<init>()
            if (r2 == 0) goto L10
            int r0 = r2.length
            int[] r2 = java.util.Arrays.copyOf(r2, r0)
            r1.f11027a = r2
            java.util.Arrays.sort(r2)
            goto L15
        L10:
            r2 = 0
            int[] r2 = new int[r2]
            r1.f11027a = r2
        L15:
            r1.f11028b = r3
            return
    }

    /* renamed from: a */
    public boolean m6262a(int r2) {
            r1 = this;
            int[] r0 = r1.f11027a
            int r2 = java.util.Arrays.binarySearch(r0, r2)
            if (r2 < 0) goto La
            r2 = 1
            goto Lb
        La:
            r2 = 0
        Lb:
            return r2
    }

    public boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof p121h4.C2463e
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            h4.e r5 = (p121h4.C2463e) r5
            int[] r1 = r4.f11027a
            int[] r3 = r5.f11027a
            boolean r1 = java.util.Arrays.equals(r1, r3)
            if (r1 == 0) goto L1d
            int r1 = r4.f11028b
            int r5 = r5.f11028b
            if (r1 != r5) goto L1d
            goto L1e
        L1d:
            r0 = 0
        L1e:
            return r0
    }

    public int hashCode() {
            r2 = this;
            int r0 = r2.f11028b
            int[] r1 = r2.f11027a
            int r1 = java.util.Arrays.hashCode(r1)
            int r1 = r1 * 31
            int r1 = r1 + r0
            return r1
    }

    public java.lang.String toString() {
            r4 = this;
            int r0 = r4.f11028b
            int[] r1 = r4.f11027a
            java.lang.String r1 = java.util.Arrays.toString(r1)
            r2 = 67
            int r2 = p064e.C1489c.m4038a(r1, r2)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r2)
            java.lang.String r2 = "AudioCapabilities[maxChannelCount="
            r3.append(r2)
            r3.append(r0)
            java.lang.String r0 = ", supportedEncodings="
            r3.append(r0)
            r3.append(r1)
            java.lang.String r0 = "]"
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            return r0
    }
}
