package p155ij;

/* renamed from: ij.a */
/* loaded from: classes.dex */
public abstract class AbstractC3195a {

    /* renamed from: a */
    public final byte[] f12855a;

    /* renamed from: b */
    public int f12856b;

    /* renamed from: c */
    public long f12857c;

    public AbstractC3195a() {
            r1 = this;
            r1.<init>()
            r0 = 4
            byte[] r0 = new byte[r0]
            r1.f12855a = r0
            r0 = 0
            r1.f12856b = r0
            return
    }

    /* renamed from: a */
    public void m7686a() {
            r3 = this;
            long r0 = r3.f12857c
            r2 = 3
            long r0 = r0 << r2
            r2 = -128(0xffffffffffffff80, float:NaN)
        L6:
            r3.m7691f(r2)
            int r2 = r3.f12856b
            if (r2 == 0) goto Lf
            r2 = 0
            goto L6
        Lf:
            r3.mo7688c(r0)
            r3.mo7687b()
            return
    }

    /* renamed from: b */
    public abstract void mo7687b();

    /* renamed from: c */
    public abstract void mo7688c(long r1);

    /* renamed from: d */
    public abstract void mo7689d(byte[] r1, int r2);

    /* renamed from: e */
    public void mo7690e() {
            r4 = this;
            r0 = 0
            r4.f12857c = r0
            r0 = 0
            r4.f12856b = r0
            r1 = 0
        L8:
            byte[] r2 = r4.f12855a
            int r3 = r2.length
            if (r1 >= r3) goto L12
            r2[r1] = r0
            int r1 = r1 + 1
            goto L8
        L12:
            return
    }

    /* renamed from: f */
    public void m7691f(byte r5) {
            r4 = this;
            byte[] r0 = r4.f12855a
            int r1 = r4.f12856b
            int r2 = r1 + 1
            r4.f12856b = r2
            r0[r1] = r5
            int r5 = r0.length
            if (r2 != r5) goto L13
            r5 = 0
            r4.mo7689d(r0, r5)
            r4.f12856b = r5
        L13:
            long r0 = r4.f12857c
            r2 = 1
            long r0 = r0 + r2
            r4.f12857c = r0
            return
    }

    /* renamed from: g */
    public void m7692g(byte[] r7, int r8, int r9) {
            r6 = this;
            r0 = 0
            int r9 = java.lang.Math.max(r0, r9)
            int r1 = r6.f12856b
            if (r1 == 0) goto L28
            r1 = 0
        La:
            if (r1 >= r9) goto L27
            byte[] r2 = r6.f12855a
            int r3 = r6.f12856b
            int r4 = r3 + 1
            r6.f12856b = r4
            int r5 = r1 + 1
            int r1 = r1 + r8
            r1 = r7[r1]
            r2[r3] = r1
            r1 = 4
            if (r4 != r1) goto L25
            r6.mo7689d(r2, r0)
            r6.f12856b = r0
            r0 = r5
            goto L28
        L25:
            r1 = r5
            goto La
        L27:
            r0 = r1
        L28:
            int r1 = r9 - r0
            r1 = r1 & (-4)
            int r1 = r1 + r0
        L2d:
            if (r0 >= r1) goto L37
            int r2 = r8 + r0
            r6.mo7689d(r7, r2)
            int r0 = r0 + 4
            goto L2d
        L37:
            if (r0 >= r9) goto L4a
            byte[] r1 = r6.f12855a
            int r2 = r6.f12856b
            int r3 = r2 + 1
            r6.f12856b = r3
            int r3 = r0 + 1
            int r0 = r0 + r8
            r0 = r7[r0]
            r1[r2] = r0
            r0 = r3
            goto L37
        L4a:
            long r7 = r6.f12857c
            long r0 = (long) r9
            long r7 = r7 + r0
            r6.f12857c = r7
            return
    }
}
