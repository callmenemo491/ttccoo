package p393wb;

/* renamed from: wb.a */
/* loaded from: classes.dex */
public final class C6824a extends p393wb.AbstractC6829f {

    /* renamed from: c */
    public final /* synthetic */ int f26559c;

    /* renamed from: d */
    public final short f26560d;

    /* renamed from: e */
    public final short f26561e;

    public C6824a(p393wb.AbstractC6829f r2, int r3, int r4, int r5) {
            r1 = this;
            r1.f26559c = r5
            r0 = 1
            if (r5 == r0) goto Lf
            r1.<init>(r2)
            short r2 = (short) r3
            r1.f26560d = r2
            short r2 = (short) r4
            r1.f26561e = r2
            return
        Lf:
            r1.<init>(r2)
            short r2 = (short) r3
            r1.f26560d = r2
            short r2 = (short) r4
            r1.f26561e = r2
            return
    }

    @Override // p393wb.AbstractC6829f
    /* renamed from: b */
    public void mo13904b(p453zb.C7269a r6, byte[] r7) {
            r5 = this;
            int r0 = r5.f26559c
            switch(r0) {
                case 0: goto L6;
                default: goto L5;
            }
        L5:
            goto L3f
        L6:
            r0 = 0
        L7:
            short r1 = r5.f26561e
            if (r0 >= r1) goto L3e
            r2 = 62
            r3 = 31
            if (r0 == 0) goto L15
            if (r0 != r3) goto L31
            if (r1 > r2) goto L31
        L15:
            r1 = 5
            r6.m14362c(r3, r1)
            short r4 = r5.f26561e
            if (r4 <= r2) goto L22
            int r4 = r4 + (-31)
            r1 = 16
            goto L2e
        L22:
            if (r0 != 0) goto L2c
            int r2 = java.lang.Math.min(r4, r3)
            r6.m14362c(r2, r1)
            goto L31
        L2c:
            int r4 = r4 + (-31)
        L2e:
            r6.m14362c(r4, r1)
        L31:
            short r1 = r5.f26560d
            int r1 = r1 + r0
            r1 = r7[r1]
            r2 = 8
            r6.m14362c(r1, r2)
            int r0 = r0 + 1
            goto L7
        L3e:
            return
        L3f:
            short r7 = r5.f26560d
            short r0 = r5.f26561e
            r6.m14362c(r7, r0)
            return
    }

    public java.lang.String toString() {
            r6 = this;
            int r0 = r6.f26559c
            r1 = 62
            java.lang.String r2 = "<"
            switch(r0) {
                case 0: goto La;
                default: goto L9;
            }
        L9:
            goto L2b
        La:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r2)
            short r2 = r6.f26560d
            r0.append(r2)
            java.lang.String r2 = "::"
            r0.append(r2)
            short r2 = r6.f26560d
            short r3 = r6.f26561e
            int r2 = r2 + r3
            int r2 = r2 + (-1)
            r0.append(r2)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
        L2b:
            short r0 = r6.f26560d
            short r3 = r6.f26561e
            r4 = 1
            int r3 = r4 << r3
            int r5 = r3 + (-1)
            r0 = r0 & r5
            r0 = r0 | r3
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r2)
            short r2 = r6.f26561e
            int r2 = r4 << r2
            r0 = r0 | r2
            java.lang.String r0 = java.lang.Integer.toBinaryString(r0)
            java.lang.String r0 = r0.substring(r4)
            r3.append(r0)
            r3.append(r1)
            java.lang.String r0 = r3.toString()
            return r0
    }
}
