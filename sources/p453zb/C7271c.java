package p453zb;

/* renamed from: zb.c */
/* loaded from: classes.dex */
public class C7271c {

    /* renamed from: a */
    public byte[] f27906a;

    /* renamed from: b */
    public int f27907b;

    /* renamed from: c */
    public int f27908c;

    public C7271c(byte[] r1) {
            r0 = this;
            r0.<init>()
            r0.f27906a = r1
            return
    }

    public C7271c(byte[] r1, int r2, int r3) {
            r0 = this;
            r0.<init>()
            r0.f27906a = r1
            r0.f27907b = r2
            r0.f27908c = r3
            return
    }

    /* renamed from: a */
    public int m14378a() {
            r2 = this;
            byte[] r0 = r2.f27906a
            int r0 = r0.length
            int r1 = r2.f27907b
            int r0 = r0 - r1
            int r0 = r0 * 8
            int r1 = r2.f27908c
            int r0 = r0 - r1
            return r0
    }

    /* renamed from: b */
    public int m14379b(int r10) {
            r9 = this;
            if (r10 <= 0) goto L64
            r0 = 32
            if (r10 > r0) goto L64
            int r0 = r9.m14378a()
            if (r10 > r0) goto L64
            int r0 = r9.f27908c
            r1 = 0
            r2 = 255(0xff, float:3.57E-43)
            r3 = 8
            if (r0 <= 0) goto L38
            int r4 = 8 - r0
            if (r10 >= r4) goto L1b
            r5 = r10
            goto L1c
        L1b:
            r5 = r4
        L1c:
            int r4 = r4 - r5
            int r6 = 8 - r5
            int r6 = r2 >> r6
            int r6 = r6 << r4
            byte[] r7 = r9.f27906a
            int r8 = r9.f27907b
            r7 = r7[r8]
            r6 = r6 & r7
            int r4 = r6 >> r4
            int r10 = r10 - r5
            int r0 = r0 + r5
            r9.f27908c = r0
            if (r0 != r3) goto L37
            r9.f27908c = r1
            int r8 = r8 + 1
            r9.f27907b = r8
        L37:
            r1 = r4
        L38:
            if (r10 <= 0) goto L63
        L3a:
            if (r10 < r3) goto L4d
            int r0 = r1 << 8
            byte[] r1 = r9.f27906a
            int r4 = r9.f27907b
            r1 = r1[r4]
            r1 = r1 & r2
            r1 = r1 | r0
            int r4 = r4 + 1
            r9.f27907b = r4
            int r10 = r10 + (-8)
            goto L3a
        L4d:
            if (r10 <= 0) goto L63
            int r0 = 8 - r10
            int r2 = r2 >> r0
            int r2 = r2 << r0
            int r1 = r1 << r10
            byte[] r3 = r9.f27906a
            int r4 = r9.f27907b
            r3 = r3[r4]
            r2 = r2 & r3
            int r0 = r2 >> r0
            r1 = r1 | r0
            int r0 = r9.f27908c
            int r0 = r0 + r10
            r9.f27908c = r0
        L63:
            return r1
        L64:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r10 = java.lang.String.valueOf(r10)
            r0.<init>(r10)
            throw r0
    }
}
