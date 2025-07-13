package p216m4;

/* renamed from: m4.r */
/* loaded from: classes.dex */
public final class C4373r {

    /* renamed from: a */
    public final int f17912a;

    /* renamed from: b */
    public final int f17913b;

    /* renamed from: c */
    public final int f17914c;

    /* renamed from: d */
    public final int f17915d;

    /* renamed from: e */
    public final int f17916e;

    /* renamed from: f */
    public final int f17917f;

    /* renamed from: g */
    public final int f17918g;

    /* renamed from: h */
    public final int f17919h;

    /* renamed from: i */
    public final int f17920i;

    /* renamed from: j */
    public final long f17921j;

    /* renamed from: k */
    public final p216m4.C4373r.a f17922k;

    /* renamed from: l */
    public final p427y4.C7110a f17923l;

    /* renamed from: m4.r$a */
    public static class a {

        /* renamed from: a */
        public final long[] f17924a;

        /* renamed from: b */
        public final long[] f17925b;

        public a(long[] r1, long[] r2) {
                r0 = this;
                r0.<init>()
                r0.f17924a = r1
                r0.f17925b = r2
                return
        }
    }

    public C4373r(int r1, int r2, int r3, int r4, int r5, int r6, int r7, long r8, p216m4.C4373r.a r10, p427y4.C7110a r11) {
            r0 = this;
            r0.<init>()
            r0.f17912a = r1
            r0.f17913b = r2
            r0.f17914c = r3
            r0.f17915d = r4
            r0.f17916e = r5
            int r1 = m9821h(r5)
            r0.f17917f = r1
            r0.f17918g = r6
            r0.f17919h = r7
            int r1 = m9820c(r7)
            r0.f17920i = r1
            r0.f17921j = r8
            r0.f17922k = r10
            r0.f17923l = r11
            return
    }

    public C4373r(byte[] r6, int r7) {
            r5 = this;
            r5.<init>()
            m4.b0 r0 = new m4.b0
            r1 = 1
            r2 = 0
            r0.<init>(r6, r1, r2)
            int r7 = r7 * 8
            r0.m9772q(r7)
            r6 = 16
            int r7 = r0.m9766k(r6)
            r5.f17912a = r7
            int r6 = r0.m9766k(r6)
            r5.f17913b = r6
            r6 = 24
            int r7 = r0.m9766k(r6)
            r5.f17914c = r7
            int r6 = r0.m9766k(r6)
            r5.f17915d = r6
            r6 = 20
            int r6 = r0.m9766k(r6)
            r5.f17916e = r6
            int r6 = m9821h(r6)
            r5.f17917f = r6
            r6 = 3
            int r6 = r0.m9766k(r6)
            int r6 = r6 + r1
            r5.f17918g = r6
            r6 = 5
            int r6 = r0.m9766k(r6)
            int r6 = r6 + r1
            r5.f17919h = r6
            int r6 = m9820c(r6)
            r5.f17920i = r6
            r6 = 32
            r7 = 4
            int r7 = r0.m9766k(r7)
            int r0 = r0.m9766k(r6)
            long r3 = p371v5.C6552b0.m13306J(r7)
            long r6 = r3 << r6
            long r0 = p371v5.C6552b0.m13306J(r0)
            long r6 = r6 | r0
            r5.f17921j = r6
            r5.f17922k = r2
            r5.f17923l = r2
            return
    }

    /* renamed from: a */
    public static p427y4.C7110a m9819a(java.util.List<java.lang.String> r8, java.util.List<p022b5.C0680a> r9) {
            boolean r0 = r8.isEmpty()
            r1 = 0
            if (r0 == 0) goto Le
            boolean r0 = r9.isEmpty()
            if (r0 == 0) goto Le
            return r1
        Le:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r2 = 0
            r3 = 0
        L15:
            int r4 = r8.size()
            if (r3 >= r4) goto L53
            java.lang.Object r4 = r8.get(r3)
            java.lang.String r4 = (java.lang.String) r4
            java.lang.String r5 = "="
            java.lang.String[] r5 = p371v5.C6552b0.m13304H(r4, r5)
            int r6 = r5.length
            r7 = 2
            if (r6 == r7) goto L43
            java.lang.String r5 = "Failed to parse Vorbis comment: "
            int r6 = r4.length()
            if (r6 == 0) goto L38
            java.lang.String r4 = r5.concat(r4)
            goto L3d
        L38:
            java.lang.String r4 = new java.lang.String
            r4.<init>(r5)
        L3d:
            java.lang.String r5 = "FlacStreamMetadata"
            android.util.Log.w(r5, r4)
            goto L50
        L43:
            b5.b r4 = new b5.b
            r6 = r5[r2]
            r7 = 1
            r5 = r5[r7]
            r4.<init>(r6, r5)
            r0.add(r4)
        L50:
            int r3 = r3 + 1
            goto L15
        L53:
            r0.addAll(r9)
            boolean r8 = r0.isEmpty()
            if (r8 == 0) goto L5d
            goto L62
        L5d:
            y4.a r1 = new y4.a
            r1.<init>(r0)
        L62:
            return r1
    }

    /* renamed from: c */
    public static int m9820c(int r1) {
            r0 = 8
            if (r1 == r0) goto L1e
            r0 = 12
            if (r1 == r0) goto L1c
            r0 = 16
            if (r1 == r0) goto L1a
            r0 = 20
            if (r1 == r0) goto L18
            r0 = 24
            if (r1 == r0) goto L16
            r1 = -1
            return r1
        L16:
            r1 = 6
            return r1
        L18:
            r1 = 5
            return r1
        L1a:
            r1 = 4
            return r1
        L1c:
            r1 = 2
            return r1
        L1e:
            r1 = 1
            return r1
    }

    /* renamed from: h */
    public static int m9821h(int r0) {
            switch(r0) {
                case 8000: goto L1d;
                case 16000: goto L1b;
                case 22050: goto L19;
                case 24000: goto L17;
                case 32000: goto L14;
                case 44100: goto L11;
                case 48000: goto Le;
                case 88200: goto Lc;
                case 96000: goto L9;
                case 176400: goto L7;
                case 192000: goto L5;
                default: goto L3;
            }
        L3:
            r0 = -1
            return r0
        L5:
            r0 = 3
            return r0
        L7:
            r0 = 2
            return r0
        L9:
            r0 = 11
            return r0
        Lc:
            r0 = 1
            return r0
        Le:
            r0 = 10
            return r0
        L11:
            r0 = 9
            return r0
        L14:
            r0 = 8
            return r0
        L17:
            r0 = 7
            return r0
        L19:
            r0 = 6
            return r0
        L1b:
            r0 = 5
            return r0
        L1d:
            r0 = 4
            return r0
    }

    /* renamed from: b */
    public p216m4.C4373r m9822b(p216m4.C4373r.a r14) {
            r13 = this;
            m4.r r12 = new m4.r
            int r1 = r13.f17912a
            int r2 = r13.f17913b
            int r3 = r13.f17914c
            int r4 = r13.f17915d
            int r5 = r13.f17916e
            int r6 = r13.f17918g
            int r7 = r13.f17919h
            long r8 = r13.f17921j
            y4.a r11 = r13.f17923l
            r0 = r12
            r10 = r14
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r10, r11)
            return r12
    }

    /* renamed from: d */
    public long m9823d() {
            r5 = this;
            long r0 = r5.f17921j
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto Le
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            goto L17
        Le:
            r2 = 1000000(0xf4240, double:4.940656E-318)
            long r0 = r0 * r2
            int r2 = r5.f17916e
            long r2 = (long) r2
            long r0 = r0 / r2
        L17:
            return r0
    }

    /* renamed from: e */
    public p088f4.C2003e0 m9824e(byte[] r4, p427y4.C7110a r5) {
            r3 = this;
            r0 = 4
            r1 = -128(0xffffffffffffff80, float:NaN)
            r4[r0] = r1
            int r0 = r3.f17915d
            if (r0 <= 0) goto La
            goto Lb
        La:
            r0 = -1
        Lb:
            y4.a r5 = r3.m9825f(r5)
            f4.e0$b r1 = new f4.e0$b
            r1.<init>()
            java.lang.String r2 = "audio/flac"
            r1.f8927k = r2
            r1.f8928l = r0
            int r0 = r3.f17918g
            r1.f8940x = r0
            int r0 = r3.f17916e
            r1.f8941y = r0
            java.util.List r4 = java.util.Collections.singletonList(r4)
            r1.f8929m = r4
            r1.f8925i = r5
            f4.e0 r4 = r1.m5193a()
            return r4
    }

    /* renamed from: f */
    public p427y4.C7110a m9825f(p427y4.C7110a r2) {
            r1 = this;
            y4.a r0 = r1.f17923l
            if (r0 != 0) goto L5
            goto Lf
        L5:
            if (r2 != 0) goto L9
            r2 = r0
            goto Lf
        L9:
            y4.a$b[] r2 = r2.f27506Y
            y4.a r2 = r0.m14220a(r2)
        Lf:
            return r2
    }

    /* renamed from: g */
    public long m9826g(long r9) {
            r8 = this;
            int r0 = r8.f17916e
            long r0 = (long) r0
            long r9 = r9 * r0
            r0 = 1000000(0xf4240, double:4.940656E-318)
            long r2 = r9 / r0
            long r9 = r8.f17921j
            r0 = 1
            long r6 = r9 - r0
            r4 = 0
            long r9 = p371v5.C6552b0.m13316i(r2, r4, r6)
            return r9
    }
}
