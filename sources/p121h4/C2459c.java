package p121h4;

/* renamed from: h4.c */
/* loaded from: classes.dex */
public final class C2459c {

    /* renamed from: a */
    public static final int[] f10977a = null;

    /* renamed from: h4.c$a */
    public static /* synthetic */ class a {
    }

    /* renamed from: h4.c$b */
    public static final class b {

        /* renamed from: a */
        public final int f10978a;

        /* renamed from: b */
        public final int f10979b;

        /* renamed from: c */
        public final int f10980c;

        public b(int r1, int r2, int r3, int r4, int r5, p121h4.C2459c.a r6) {
                r0 = this;
                r0.<init>()
                r0.f10978a = r3
                r0.f10979b = r4
                r0.f10980c = r5
                return
        }
    }

    static {
            r0 = 14
            int[] r0 = new int[r0]
            r0 = {x000a: FILL_ARRAY_DATA , data: [2002, 2000, 1920, 1601, 1600, 1001, 1000, 960, 800, 800, 480, 400, 400, 2048} // fill-array
            p121h4.C2459c.f10977a = r0
            return
    }

    /* renamed from: a */
    public static void m6247a(int r2, p371v5.C6571u r3) {
            r0 = 7
            r3.m13392B(r0)
            byte[] r3 = r3.f25710a
            r0 = 0
            r1 = -84
            r3[r0] = r1
            r0 = 1
            r1 = 64
            r3[r0] = r1
            r0 = 2
            r1 = -1
            r3[r0] = r1
            r0 = 3
            r3[r0] = r1
            r0 = 4
            int r1 = r2 >> 16
            r1 = r1 & 255(0xff, float:3.57E-43)
            byte r1 = (byte) r1
            r3[r0] = r1
            r0 = 5
            int r1 = r2 >> 8
            r1 = r1 & 255(0xff, float:3.57E-43)
            byte r1 = (byte) r1
            r3[r0] = r1
            r0 = 6
            r2 = r2 & 255(0xff, float:3.57E-43)
            byte r2 = (byte) r2
            r3[r0] = r2
            return
    }

    /* renamed from: b */
    public static p121h4.C2459c.b m6248b(p216m4.C4355b0 r10) {
            r0 = 16
            int r1 = r10.m9766k(r0)
            int r0 = r10.m9766k(r0)
            r2 = 4
            r3 = 65535(0xffff, float:9.1834E-41)
            if (r0 != r3) goto L18
            r0 = 24
            int r0 = r10.m9766k(r0)
            r3 = 7
            goto L19
        L18:
            r3 = 4
        L19:
            int r0 = r0 + r3
            r3 = 44097(0xac41, float:6.1793E-41)
            if (r1 != r3) goto L21
            int r0 = r0 + 2
        L21:
            r7 = r0
            r0 = 2
            int r1 = r10.m9766k(r0)
            r3 = 0
            r4 = 3
            if (r1 != r4) goto L3e
            r5 = 0
        L2c:
            int r6 = r10.m9766k(r0)
            int r6 = r6 + r5
            boolean r5 = r10.m9765j()
            if (r5 != 0) goto L39
            int r1 = r1 + r6
            goto L3e
        L39:
            int r6 = r6 + 1
            int r5 = r6 << 2
            goto L2c
        L3e:
            r5 = 10
            int r5 = r10.m9766k(r5)
            boolean r6 = r10.m9765j()
            if (r6 == 0) goto L53
            int r6 = r10.m9766k(r4)
            if (r6 <= 0) goto L53
            r10.m9775t(r0)
        L53:
            boolean r6 = r10.m9765j()
            r8 = 48000(0xbb80, float:6.7262E-41)
            r9 = 44100(0xac44, float:6.1797E-41)
            if (r6 == 0) goto L63
            r6 = 48000(0xbb80, float:6.7262E-41)
            goto L66
        L63:
            r6 = 44100(0xac44, float:6.1797E-41)
        L66:
            int r10 = r10.m9766k(r2)
            if (r6 != r9) goto L76
            r9 = 13
            if (r10 != r9) goto L76
            int[] r0 = p121h4.C2459c.f10977a
            r10 = r0[r10]
            r8 = r10
            goto La6
        L76:
            if (r6 != r8) goto La5
            int[] r8 = p121h4.C2459c.f10977a
            int r9 = r8.length
            if (r10 >= r9) goto La5
            r3 = r8[r10]
            int r5 = r5 % 5
            r8 = 8
            r9 = 1
            if (r5 == r9) goto L9b
            r9 = 11
            if (r5 == r0) goto L96
            if (r5 == r4) goto L9b
            if (r5 == r2) goto L8f
            goto La0
        L8f:
            if (r10 == r4) goto La2
            if (r10 == r8) goto La2
            if (r10 != r9) goto La0
            goto La2
        L96:
            if (r10 == r8) goto La2
            if (r10 != r9) goto La0
            goto La2
        L9b:
            if (r10 == r4) goto La2
            if (r10 != r8) goto La0
            goto La2
        La0:
            r8 = r3
            goto La6
        La2:
            int r3 = r3 + 1
            goto La0
        La5:
            r8 = 0
        La6:
            h4.c$b r10 = new h4.c$b
            r5 = 2
            r9 = 0
            r3 = r10
            r4 = r1
            r3.<init>(r4, r5, r6, r7, r8, r9)
            return r10
    }
}
