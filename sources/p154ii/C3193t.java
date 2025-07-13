package p154ii;

/* renamed from: ii.t */
/* loaded from: classes.dex */
public final class C3193t {

    /* renamed from: a */
    public int f12852a;

    /* renamed from: b */
    public final int[] f12853b;

    public C3193t() {
            r1 = this;
            r1.<init>()
            r0 = 10
            int[] r0 = new int[r0]
            r1.f12853b = r0
            return
    }

    /* renamed from: a */
    public final int m7683a() {
            r2 = this;
            int r0 = r2.f12852a
            r0 = r0 & 128(0x80, float:1.8E-43)
            if (r0 == 0) goto Lc
            int[] r0 = r2.f12853b
            r1 = 7
            r0 = r0[r1]
            goto Lf
        Lc:
            r0 = 65535(0xffff, float:9.1834E-41)
        Lf:
            return r0
    }

    /* renamed from: b */
    public final void m7684b(p154ii.C3193t r6) {
            r5 = this;
            java.lang.String r0 = "other"
            p214m2.C4339q.m9706k(r6, r0)
            r0 = 0
            r1 = 0
        L7:
            r2 = 10
            if (r1 >= r2) goto L22
            r2 = 1
            int r3 = r2 << r1
            int r4 = r6.f12852a
            r3 = r3 & r4
            if (r3 == 0) goto L14
            goto L15
        L14:
            r2 = 0
        L15:
            if (r2 != 0) goto L18
            goto L1f
        L18:
            int[] r2 = r6.f12853b
            r2 = r2[r1]
            r5.m7685c(r1, r2)
        L1f:
            int r1 = r1 + 1
            goto L7
        L22:
            return
    }

    /* renamed from: c */
    public final p154ii.C3193t m7685c(int r4, int r5) {
            r3 = this;
            if (r4 < 0) goto L11
            int[] r0 = r3.f12853b
            int r1 = r0.length
            if (r4 < r1) goto L8
            goto L11
        L8:
            r1 = 1
            int r1 = r1 << r4
            int r2 = r3.f12852a
            r1 = r1 | r2
            r3.f12852a = r1
            r0[r4] = r5
        L11:
            return r3
    }
}
