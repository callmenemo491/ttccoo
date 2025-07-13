package ec;

/* renamed from: ec.h */
/* loaded from: classes.dex */
public final class C1820h extends p214m2.C4339q {
    public C1820h() {
            r1 = this;
            r0 = 24
            r1.<init>(r0)
            return
    }

    @Override // p214m2.C4339q, ec.InterfaceC1814b
    /* renamed from: f */
    public void mo4569f(ec.C1815c r5) {
            r4 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
        L5:
            boolean r1 = r5.m4573d()
            if (r1 == 0) goto L2f
            char r1 = r5.m4571b()
            int r2 = r5.f7929f
            int r2 = r2 + 1
            r5.f7929f = r2
            r4.mo4584o(r1, r0)
            int r1 = r0.length()
            r2 = 3
            int r1 = r1 % r2
            if (r1 != 0) goto L5
            p214m2.C4339q.m9714x(r5, r0)
            java.lang.String r1 = r5.f7924a
            int r3 = r5.f7929f
            int r1 = p185k7.C3828h5.m8572A(r1, r3, r2)
            if (r1 == r2) goto L5
            r5.f7930g = r1
        L2f:
            r4.mo4586q(r5, r0)
            return
    }

    @Override // p214m2.C4339q
    /* renamed from: o */
    public int mo4584o(char r4, java.lang.StringBuilder r5) {
            r3 = this;
            r0 = 1
            r1 = 13
            if (r4 != r1) goto La
            r4 = 0
        L6:
            r5.append(r4)
            goto L37
        La:
            r1 = 42
            if (r4 != r1) goto L12
            r5.append(r0)
            goto L37
        L12:
            r1 = 62
            if (r4 != r1) goto L18
            r4 = 2
            goto L6
        L18:
            r1 = 32
            if (r4 != r1) goto L1e
            r4 = 3
            goto L6
        L1e:
            r1 = 48
            if (r4 < r1) goto L2b
            r2 = 57
            if (r4 > r2) goto L2b
            int r4 = r4 - r1
            int r4 = r4 + 4
        L29:
            char r4 = (char) r4
            goto L6
        L2b:
            r1 = 65
            if (r4 < r1) goto L38
            r2 = 90
            if (r4 > r2) goto L38
            int r4 = r4 - r1
            int r4 = r4 + 14
            goto L29
        L37:
            return r0
        L38:
            p185k7.C3828h5.m8601p(r4)
            r4 = 0
            throw r4
    }

    @Override // p214m2.C4339q
    /* renamed from: p */
    public int mo4585p() {
            r1 = this;
            r0 = 3
            return r0
    }

    @Override // p214m2.C4339q
    /* renamed from: q */
    public void mo4586q(ec.C1815c r3, java.lang.StringBuilder r4) {
            r2 = this;
            r3.m4574e()
            ec.e r0 = r3.f7931h
            int r0 = r0.f7939b
            int r1 = r3.m4570a()
            int r0 = r0 - r1
            int r4 = r4.length()
            int r1 = r3.f7929f
            int r1 = r1 - r4
            r3.f7929f = r1
            int r4 = r3.m4572c()
            r1 = 1
            if (r4 > r1) goto L24
            if (r0 > r1) goto L24
            int r4 = r3.m4572c()
            if (r4 == r0) goto L2b
        L24:
            r4 = 254(0xfe, float:3.56E-43)
            java.lang.StringBuilder r0 = r3.f7928e
            r0.append(r4)
        L2b:
            int r4 = r3.f7930g
            if (r4 >= 0) goto L32
            r4 = 0
            r3.f7930g = r4
        L32:
            return
    }
}
