package p336t4;

/* renamed from: t4.o */
/* loaded from: classes.dex */
public final class C6170o {

    /* renamed from: a */
    public final p336t4.C6167l f23892a;

    /* renamed from: b */
    public final int f23893b;

    /* renamed from: c */
    public final long[] f23894c;

    /* renamed from: d */
    public final int[] f23895d;

    /* renamed from: e */
    public final int f23896e;

    /* renamed from: f */
    public final long[] f23897f;

    /* renamed from: g */
    public final int[] f23898g;

    /* renamed from: h */
    public final long f23899h;

    public C6170o(p336t4.C6167l r5, long[] r6, int[] r7, int r8, long[] r9, int[] r10, long r11) {
            r4 = this;
            r4.<init>()
            int r0 = r7.length
            int r1 = r9.length
            r2 = 0
            r3 = 1
            if (r0 != r1) goto Lb
            r0 = 1
            goto Lc
        Lb:
            r0 = 0
        Lc:
            p371v5.C6549a.m13288b(r0)
            int r0 = r6.length
            int r1 = r9.length
            if (r0 != r1) goto L15
            r0 = 1
            goto L16
        L15:
            r0 = 0
        L16:
            p371v5.C6549a.m13288b(r0)
            int r0 = r10.length
            int r1 = r9.length
            if (r0 != r1) goto L1e
            r2 = 1
        L1e:
            p371v5.C6549a.m13288b(r2)
            r4.f23892a = r5
            r4.f23894c = r6
            r4.f23895d = r7
            r4.f23896e = r8
            r4.f23897f = r9
            r4.f23898g = r10
            r4.f23899h = r11
            int r5 = r6.length
            r4.f23893b = r5
            int r5 = r10.length
            if (r5 <= 0) goto L3e
            int r5 = r10.length
            int r5 = r5 - r3
            r6 = r10[r5]
            r7 = 536870912(0x20000000, float:1.0842022E-19)
            r6 = r6 | r7
            r10[r5] = r6
        L3e:
            return
    }

    /* renamed from: a */
    public int m12734a(long r4) {
            r3 = this;
            long[] r0 = r3.f23897f
            r1 = 1
            r2 = 0
            int r4 = p371v5.C6552b0.m13312e(r0, r4, r1, r2)
        L8:
            if (r4 < 0) goto L15
            int[] r5 = r3.f23898g
            r5 = r5[r4]
            r5 = r5 & r1
            if (r5 == 0) goto L12
            return r4
        L12:
            int r4 = r4 + (-1)
            goto L8
        L15:
            r4 = -1
            return r4
    }

    /* renamed from: b */
    public int m12735b(long r4) {
            r3 = this;
            long[] r0 = r3.f23897f
            r1 = 1
            r2 = 0
            int r4 = p371v5.C6552b0.m13309b(r0, r4, r1, r2)
        L8:
            long[] r5 = r3.f23897f
            int r5 = r5.length
            if (r4 >= r5) goto L18
            int[] r5 = r3.f23898g
            r5 = r5[r4]
            r5 = r5 & r1
            if (r5 == 0) goto L15
            return r4
        L15:
            int r4 = r4 + 1
            goto L8
        L18:
            r4 = -1
            return r4
    }
}
