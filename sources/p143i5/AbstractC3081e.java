package p143i5;

/* renamed from: i5.e */
/* loaded from: classes.dex */
public abstract class AbstractC3081e extends p142i4.AbstractC3076j<p143i5.C3086j, p143i5.AbstractC3087k, p143i5.C3084h> implements p143i5.InterfaceC3083g {
    public AbstractC3081e(java.lang.String r5) {
            r4 = this;
            r5 = 2
            i5.j[] r0 = new p143i5.C3086j[r5]
            i5.k[] r5 = new p143i5.AbstractC3087k[r5]
            r4.<init>(r0, r5)
            int r5 = r4.f12376g
            I extends i4.g[] r0 = r4.f12374e
            int r0 = r0.length
            r1 = 0
            if (r5 != r0) goto L12
            r5 = 1
            goto L13
        L12:
            r5 = 0
        L13:
            p371v5.C6549a.m13291e(r5)
            I extends i4.g[] r5 = r4.f12374e
            int r0 = r5.length
        L19:
            if (r1 >= r0) goto L25
            r2 = r5[r1]
            r3 = 1024(0x400, float:1.435E-42)
            r2.m7524v(r3)
            int r1 = r1 + 1
            goto L19
        L25:
            return
    }

    @Override // p143i5.InterfaceC3083g
    /* renamed from: a */
    public void mo7536a(long r1) {
            r0 = this;
            return
    }

    @Override // p142i4.AbstractC3076j
    /* renamed from: e */
    public p142i4.C3072f mo7528e(p142i4.C3073g r7, p142i4.AbstractC3074h r8, boolean r9) {
            r6 = this;
            i5.j r7 = (p143i5.C3086j) r7
            i5.k r8 = (p143i5.AbstractC3087k) r8
            java.nio.ByteBuffer r0 = r7.f12358a0     // Catch: p143i5.C3084h -> L27
            java.util.Objects.requireNonNull(r0)     // Catch: p143i5.C3084h -> L27
            byte[] r1 = r0.array()     // Catch: p143i5.C3084h -> L27
            int r0 = r0.limit()     // Catch: p143i5.C3084h -> L27
            i5.f r3 = r6.mo7541j(r1, r0, r9)     // Catch: p143i5.C3084h -> L27
            long r1 = r7.f12360c0     // Catch: p143i5.C3084h -> L27
            long r4 = r7.f12430g0     // Catch: p143i5.C3084h -> L27
            r0 = r8
            r0.m7543v(r1, r3, r4)     // Catch: p143i5.C3084h -> L27
            int r7 = r8.f12333Y     // Catch: p143i5.C3084h -> L27
            r9 = 2147483647(0x7fffffff, float:NaN)
            r7 = r7 & r9
            r8.f12333Y = r7     // Catch: p143i5.C3084h -> L27
            r7 = 0
            goto L28
        L27:
            r7 = move-exception
        L28:
            return r7
    }

    /* renamed from: j */
    public abstract p143i5.InterfaceC3082f mo7541j(byte[] r1, int r2, boolean r3);
}
