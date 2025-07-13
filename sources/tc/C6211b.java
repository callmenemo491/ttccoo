package tc;

/* renamed from: tc.b */
/* loaded from: classes.dex */
public final class C6211b {

    /* renamed from: a */
    public static final int[] f24163a = null;

    static {
            r0 = 96
            int[] r0 = new int[r0]
            r0 = {x000a: FILL_ARRAY_DATA , data: [-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 36, -1, -1, -1, 37, 38, -1, -1, -1, -1, 39, 40, -1, 41, 42, 43, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 44, -1, -1, -1, -1, -1, -1, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, -1, -1, -1, -1, -1} // fill-array
            tc.C6211b.f24163a = r0
            return
    }

    /* renamed from: a */
    public static p312rc.C5813h m12812a(int r3, p312rc.EnumC5809d r4) {
            r0 = 1
        L1:
            r1 = 40
            if (r0 > r1) goto L13
            rc.h r1 = p312rc.C5813h.m12186d(r0)
            boolean r2 = m12814c(r3, r1, r4)
            if (r2 == 0) goto L10
            return r1
        L10:
            int r0 = r0 + 1
            goto L1
        L13:
            sb.t r3 = new sb.t
            java.lang.String r4 = "Data too big"
            r3.<init>(r4)
            throw r3
    }

    /* renamed from: b */
    public static int m12813b(int r2) {
            int[] r0 = tc.C6211b.f24163a
            int r1 = r0.length
            if (r2 >= r1) goto L8
            r2 = r0[r2]
            return r2
        L8:
            r2 = -1
            return r2
    }

    /* renamed from: c */
    public static boolean m12814c(int r1, p312rc.C5813h r2, p312rc.EnumC5809d r3) {
            int r0 = r2.f22528d
            rc.h$b[] r2 = r2.f22527c
            int r3 = r3.ordinal()
            r2 = r2[r3]
            int r3 = r2.f22531a
            int r2 = r2.m12188a()
            int r2 = r2 * r3
            int r0 = r0 - r2
            int r1 = r1 + 7
            int r1 = r1 / 8
            if (r0 < r1) goto L1b
            r1 = 1
            return r1
        L1b:
            r1 = 0
            return r1
    }
}
