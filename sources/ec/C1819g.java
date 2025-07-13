package ec;

/* renamed from: ec.g */
/* loaded from: classes.dex */
public final class C1819g extends p214m2.C4339q {
    public C1819g() {
            r1 = this;
            r0 = 24
            r1.<init>(r0)
            return
    }

    @Override // p214m2.C4339q
    /* renamed from: o */
    public int mo4584o(char r5, java.lang.StringBuilder r6) {
            r4 = this;
            r0 = 1
            r1 = 32
            if (r5 != r1) goto La
            r5 = 3
        L6:
            r6.append(r5)
            return r0
        La:
            r1 = 48
            if (r5 < r1) goto L17
            r2 = 57
            if (r5 > r2) goto L17
            int r5 = r5 - r1
            int r5 = r5 + 4
        L15:
            char r5 = (char) r5
            goto L6
        L17:
            r1 = 97
            if (r5 < r1) goto L23
            r2 = 122(0x7a, float:1.71E-43)
            if (r5 > r2) goto L23
            int r5 = r5 - r1
            int r5 = r5 + 14
            goto L15
        L23:
            r1 = 2
            if (r5 < 0) goto L32
            r2 = 31
            if (r5 > r2) goto L32
            r0 = 0
            r6.append(r0)
        L2e:
            r6.append(r5)
            return r1
        L32:
            r2 = 33
            if (r5 < r2) goto L40
            r3 = 47
            if (r5 > r3) goto L40
            r6.append(r0)
        L3d:
            int r5 = r5 - r2
        L3e:
            char r5 = (char) r5
            goto L2e
        L40:
            r2 = 58
            if (r5 < r2) goto L4f
            r3 = 64
            if (r5 > r3) goto L4f
            r6.append(r0)
            int r5 = r5 - r2
            int r5 = r5 + 15
            goto L3e
        L4f:
            r2 = 91
            if (r5 < r2) goto L5e
            r3 = 95
            if (r5 > r3) goto L5e
            r6.append(r0)
            int r5 = r5 - r2
            int r5 = r5 + 22
            goto L3e
        L5e:
            r2 = 96
            if (r5 != r2) goto L66
            r6.append(r1)
            goto L3d
        L66:
            r2 = 65
            if (r5 < r2) goto L74
            r3 = 90
            if (r5 > r3) goto L74
            r6.append(r1)
            int r5 = r5 - r2
            int r5 = r5 + r0
            goto L3e
        L74:
            r0 = 123(0x7b, float:1.72E-43)
            if (r5 < r0) goto L83
            r2 = 127(0x7f, float:1.78E-43)
            if (r5 > r2) goto L83
            r6.append(r1)
            int r5 = r5 - r0
            int r5 = r5 + 27
            goto L3e
        L83:
            r0 = 128(0x80, float:1.8E-43)
            if (r5 < r0) goto L94
            java.lang.String r2 = "\u0001\u001e"
            r6.append(r2)
            int r5 = r5 - r0
            char r5 = (char) r5
            int r5 = r4.mo4584o(r5, r6)
            int r5 = r5 + r1
            return r5
        L94:
            p185k7.C3828h5.m8601p(r5)
            r5 = 0
            throw r5
    }

    @Override // p214m2.C4339q
    /* renamed from: p */
    public int mo4585p() {
            r1 = this;
            r0 = 2
            return r0
    }
}
