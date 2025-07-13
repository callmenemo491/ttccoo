package p216m4;

/* renamed from: m4.a0 */
/* loaded from: classes.dex */
public final class C4353a0 {

    /* renamed from: a */
    public final byte[] f17862a;

    /* renamed from: b */
    public boolean f17863b;

    /* renamed from: c */
    public int f17864c;

    /* renamed from: d */
    public long f17865d;

    /* renamed from: e */
    public int f17866e;

    /* renamed from: f */
    public int f17867f;

    /* renamed from: g */
    public int f17868g;

    public C4353a0() {
            r1 = this;
            r1.<init>()
            r0 = 10
            byte[] r0 = new byte[r0]
            r1.f17862a = r0
            return
    }

    /* renamed from: a */
    public void m9752a(p216m4.InterfaceC4381z r9, p216m4.InterfaceC4381z.a r10) {
            r8 = this;
            int r0 = r8.f17864c
            if (r0 <= 0) goto L14
            long r2 = r8.f17865d
            int r4 = r8.f17866e
            int r5 = r8.f17867f
            int r6 = r8.f17868g
            r1 = r9
            r7 = r10
            r1.mo5971c(r2, r4, r5, r6, r7)
            r9 = 0
            r8.f17864c = r9
        L14:
            return
    }

    /* renamed from: b */
    public void m9753b(p216m4.InterfaceC4381z r4, long r5, int r7, int r8, int r9, p216m4.InterfaceC4381z.a r10) {
            r3 = this;
            int r0 = r3.f17868g
            int r1 = r8 + r9
            r2 = 0
            if (r0 > r1) goto L9
            r0 = 1
            goto La
        L9:
            r0 = 0
        La:
            if (r0 == 0) goto L2e
            boolean r0 = r3.f17863b
            if (r0 != 0) goto L11
            return
        L11:
            int r0 = r3.f17864c
            int r1 = r0 + 1
            r3.f17864c = r1
            if (r0 != 0) goto L1f
            r3.f17865d = r5
            r3.f17866e = r7
            r3.f17867f = r2
        L1f:
            int r5 = r3.f17867f
            int r5 = r5 + r8
            r3.f17867f = r5
            r3.f17868g = r9
            r5 = 16
            if (r1 < r5) goto L2d
            r3.m9752a(r4, r10)
        L2d:
            return
        L2e:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "TrueHD chunk samples must be contiguous in the sample queue."
            r4.<init>(r5)
            throw r4
    }

    /* renamed from: c */
    public void m9754c(p216m4.InterfaceC4365j r7) {
            r6 = this;
            boolean r0 = r6.f17863b
            if (r0 == 0) goto L5
            return
        L5:
            byte[] r0 = r6.f17862a
            r1 = 10
            r2 = 0
            r7.mo9795o(r0, r2, r1)
            r7.mo9790h()
            byte[] r7 = r6.f17862a
            r0 = 4
            r1 = r7[r0]
            r3 = -8
            r4 = 1
            if (r1 != r3) goto L49
            r1 = 5
            r1 = r7[r1]
            r3 = 114(0x72, float:1.6E-43)
            if (r1 != r3) goto L49
            r1 = 6
            r1 = r7[r1]
            r3 = 111(0x6f, float:1.56E-43)
            if (r1 != r3) goto L49
            r1 = 7
            r3 = r7[r1]
            r3 = r3 & 254(0xfe, float:3.56E-43)
            r5 = 186(0xba, float:2.6E-43)
            if (r3 == r5) goto L31
            goto L49
        L31:
            r3 = r7[r1]
            r3 = r3 & 255(0xff, float:3.57E-43)
            r5 = 187(0xbb, float:2.62E-43)
            if (r3 != r5) goto L3a
            r2 = 1
        L3a:
            r3 = 40
            if (r2 == 0) goto L41
            r2 = 9
            goto L43
        L41:
            r2 = 8
        L43:
            r7 = r7[r2]
            int r7 = r7 >> r0
            r7 = r7 & r1
            int r2 = r3 << r7
        L49:
            if (r2 != 0) goto L4c
            return
        L4c:
            r6.f17863b = r4
            return
    }
}
