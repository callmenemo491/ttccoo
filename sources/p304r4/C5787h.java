package p304r4;

/* renamed from: r4.h */
/* loaded from: classes.dex */
public final class C5787h {

    /* renamed from: d */
    public static final long[] f22418d = null;

    /* renamed from: a */
    public final byte[] f22419a;

    /* renamed from: b */
    public int f22420b;

    /* renamed from: c */
    public int f22421c;

    static {
            r0 = 8
            long[] r0 = new long[r0]
            r0 = {x000a: FILL_ARRAY_DATA , data: [128, 64, 32, 16, 8, 4, 2, 1} // fill-array
            p304r4.C5787h.f22418d = r0
            return
    }

    public C5787h() {
            r1 = this;
            r1.<init>()
            r0 = 8
            byte[] r0 = new byte[r0]
            r1.f22419a = r0
            return
    }

    /* renamed from: a */
    public static long m12140a(byte[] r6, int r7, boolean r8) {
            r0 = 0
            r0 = r6[r0]
            long r0 = (long) r0
            r2 = 255(0xff, double:1.26E-321)
            long r0 = r0 & r2
            if (r8 == 0) goto L11
            long[] r8 = p304r4.C5787h.f22418d
            int r4 = r7 + (-1)
            r4 = r8[r4]
            long r4 = ~r4
            long r0 = r0 & r4
        L11:
            r8 = 1
        L12:
            if (r8 >= r7) goto L1f
            r4 = 8
            long r0 = r0 << r4
            r4 = r6[r8]
            long r4 = (long) r4
            long r4 = r4 & r2
            long r0 = r0 | r4
            int r8 = r8 + 1
            goto L12
        L1f:
            return r0
    }

    /* renamed from: b */
    public static int m12141b(int r6) {
            r0 = 0
        L1:
            long[] r1 = p304r4.C5787h.f22418d
            int r2 = r1.length
            if (r0 >= r2) goto L14
            r2 = r1[r0]
            long r4 = (long) r6
            long r1 = r2 & r4
            r3 = 0
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            int r0 = r0 + 1
            if (r5 == 0) goto L1
            goto L15
        L14:
            r0 = -1
        L15:
            return r0
    }

    /* renamed from: c */
    public long m12142c(p216m4.InterfaceC4365j r4, boolean r5, boolean r6, int r7) {
            r3 = this;
            int r0 = r3.f22420b
            r1 = 0
            r2 = 1
            if (r0 != 0) goto L2b
            byte[] r0 = r3.f22419a
            boolean r5 = r4.mo9788e(r0, r1, r2, r5)
            if (r5 != 0) goto L11
            r4 = -1
            return r4
        L11:
            byte[] r5 = r3.f22419a
            r5 = r5[r1]
            r5 = r5 & 255(0xff, float:3.57E-43)
            int r5 = m12141b(r5)
            r3.f22421c = r5
            r0 = -1
            if (r5 == r0) goto L23
            r3.f22420b = r2
            goto L2b
        L23:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "No valid varint length mask found"
            r4.<init>(r5)
            throw r4
        L2b:
            int r5 = r3.f22421c
            if (r5 <= r7) goto L34
            r3.f22420b = r1
            r4 = -2
            return r4
        L34:
            if (r5 == r2) goto L3c
            byte[] r7 = r3.f22419a
            int r5 = r5 - r2
            r4.readFully(r7, r2, r5)
        L3c:
            r3.f22420b = r1
            byte[] r4 = r3.f22419a
            int r5 = r3.f22421c
            long r4 = m12140a(r4, r5, r6)
            return r4
    }
}
